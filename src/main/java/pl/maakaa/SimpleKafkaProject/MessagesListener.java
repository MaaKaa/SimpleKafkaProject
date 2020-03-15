package pl.maakaa.SimpleKafkaProject;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

/**
 * Class listening to messages on the 'messages' kafka topic and logging them on the console.
 */
@Component
@Slf4j
public class MessagesListener {

    /**
     * Method that is invoked by Spring Cloud Stream with every new Message object on the 'messages' Kafka topic.
     */
    @StreamListener(MessagesStreams.INPUT)
    public void handleMessage(@Payload Message message) {
        log.info("Received message: {}", message);
    }
}
