package com.example.demo;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import org.mockito.junit.jupiter.MockitoExtension;
import producer.Producer;



@ExtendWith(MockitoExtension.class)
public class KafkaProducerTest {

    private static final String mensaje = " Producto 1";

     private Producer producer;

    @Test
    void sendEvent(){


    }
}
