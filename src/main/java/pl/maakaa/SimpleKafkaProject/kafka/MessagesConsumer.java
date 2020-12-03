package pl.maakaa.SimpleKafkaProject.kafka;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;
import pl.maakaa.SimpleKafkaProject.domain.Message;
import pl.maakaa.SimpleKafkaProject.kafka.config.MessagesStreams;

/**
 * A Consumer that listens to the Kafka topic defined in @StreamListener annotation, that "consumes" received messages,
 * and then logs them on the console.
 */
@Component
@Slf4j
public class MessagesConsumer {

    /**
     * Method that "consumes" the messages that were sent to the Kafka.
     * It is invoked every time, when a new Message object appears on the 'messages-in' Kafka topic.
     */
    @StreamListener(MessagesStreams.INPUT)
    public void handleMessage(@Payload Message message) {
        log.info("Received message: {}", message);
    }
}
