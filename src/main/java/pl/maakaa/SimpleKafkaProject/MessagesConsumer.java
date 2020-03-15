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
public class MessagesConsumer {

    /**
     * Method that consumes the messages that were sent to the kafka topic.
     * It is invoked every time, when a new Message object appears on the 'messages' Kafka topic.
     */
    @StreamListener(MessagesStreams.INPUT)
    public void handleMessage(@Payload Message message) {
        log.info("Received message: {}", message);
    }
}
