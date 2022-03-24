package com.tiket.tix.experiment.gradle;

import com.tiket.tix.common.experiment.ExperimentConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.kafka.KafkaAutoConfiguration;
import org.springframework.boot.autoconfigure.transaction.TransactionAutoConfiguration;
import org.springframework.context.annotation.Import;

@SpringBootApplication(exclude = {TransactionAutoConfiguration.class, KafkaAutoConfiguration.class})
@Import({ExperimentConfiguration.class})
public class Main {

  public static void main(String[] args) {
    SpringApplication.run(Main.class, args);
  }
}
