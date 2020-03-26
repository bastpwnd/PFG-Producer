package com.example.demo;

import org.springframework.context.annotation.ComponentScan;
import presentation.rest.KafkaProducerResource;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.text.MessageFormat;
import java.util.Calendar;

@SpringBootApplication
@ComponentScan(basePackageClasses = KafkaProducerResource.class)
public class ProducerApplication {

    private static final Log log = LogFactory.getLog(ProducerApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(ProducerApplication.class, args);

        long startTime = Calendar.getInstance().getTimeInMillis();

        long endTime = Calendar.getInstance().getTimeInMillis();
        double startingAppTimeInSeconds = (endTime - startTime) / 1000.0;

        log.info("--------------------------------------------------------------------");
        log.info(
                MessageFormat.format(
                        "|||| Producer - Ivan Martin - PFG -  Application started successfully in {0} seconds ||||",
                        startingAppTimeInSeconds));
        log.info("--------------------------------------------------------------------");




    }

}
