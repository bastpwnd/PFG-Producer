package presentation.rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import producer.Producer;

@Controller
public class KafkaProducerResource {

    @GetMapping("/start-producer")
    public String startProducer() {
        Producer startProducer = new Producer();
        startProducer.createProducer();
        return "index";
    }



}
