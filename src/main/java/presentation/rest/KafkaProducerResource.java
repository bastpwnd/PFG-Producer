package presentation.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import producer.Producer;

@RestController
public class KafkaProducerResource {

    @GetMapping("/start-producer")
    public String startProducer() {
        Producer startProducer = new Producer();
        startProducer.createProducer();
        return "Producer ha enviado los eventos !";
    }

}
