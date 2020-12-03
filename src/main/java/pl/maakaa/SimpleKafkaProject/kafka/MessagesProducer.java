package pl.maakaa.SimpleKafkaProject.kafka;

import lombok.extern.slf4j.Slf4j;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;
import org.springframework.util.MimeTypeUtils;
import pl.maakaa.SimpleKafkaProject.domain.Message;
import pl.maakaa.SimpleKafkaProject.kafka.config.MessagesStreams;

/**
 * A Producer that sends messages to the Kafka output topic defined in MessagesStreams interface.
 */
@Service
@Slf4j
public class MessagesProducer {
    private final MessagesStreams messagesStreams;

    public MessagesProducer(MessagesStreams messagesStreams) {
        this.messagesStreams = messagesStreams;
    }

    /**
     * A method that writes the Message object to the "messages-out" Kafka topic - in other words:
     * that produces and sends the message to the topic.
     * @param message
     */
    public void sendMessage(final Message message) {
        log.info("Sending message {}", message);

        MessageChannel messageChannel = messagesStreams.outboundMessages();
        messageChannel.send(MessageBuilder
                .withPayload(message)
                .setHeader(MessageHeaders.CONTENT_TYPE, MimeTypeUtils.APPLICATION_JSON)
                .build());
    }
}
