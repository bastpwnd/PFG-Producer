package producer;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.kafka.clients.producer.Callback;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.clients.producer.RecordMetadata;
import org.apache.kafka.common.serialization.StringSerializer;

import java.util.Properties;


public class Producer {
    private static final Log log = LogFactory.getLog(Producer.class);
    KafkaProducer < String, String > producer ;

    public void createProducer(){
        Properties props = new Properties();
        props.put(ProducerConfig.CLIENT_ID_CONFIG, "ivan");
        props.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "kafka:9092");
        props.put(ProducerConfig.ACKS_CONFIG, "all");
        props.put(ProducerConfig.RETRIES_CONFIG, 0);
        props.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, "org.apache.kafka.common.serialization.StringSerializer");
        props.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
        producer = new KafkaProducer < > (props);


        TestCallback callback = new TestCallback();

        for(int i = 0; i < 1; i++) {
            String sentence = "Producto XXX "+ i;
            // Send  test topic
            ProducerRecord < String, String > data = new ProducerRecord < String, String > (
                    "test_1", sentence);
            long startTime = System.currentTimeMillis();
            producer.send(data, callback);
            long elapsedTime = System.currentTimeMillis() - startTime;
            log.info("Evento enviado : " + sentence + " in " + elapsedTime + " ms");

        }
        //log.info("Eventos finalizados.");
        producer.flush();
        producer.close();

    }


    private static class TestCallback implements Callback {
        @Override
        public void onCompletion(RecordMetadata recordMetadata, Exception e) {
            if (e != null) {
                log.error("No se pudo enviar el evento :" + recordMetadata);
                e.printStackTrace();
            } else {

                String message = String.format("Mensaje enviado al topic :%s particion :%s  offset:%s", recordMetadata.topic(), recordMetadata.partition(), recordMetadata.offset());
                log.info(message);
            }
        }
    }


}


