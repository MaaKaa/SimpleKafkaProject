package pl.maakaa.SimpleKafkaProject;

import lombok.extern.slf4j.Slf4j;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;
import org.springframework.util.MimeTypeUtils;

/**
 * Service layer to write to kafka.
 */
@Service
@Slf4j
public class MessagesService {
    private final MessagesStreams messagesStreams;

    public MessagesService(MessagesStreams messagesStreams) {
        this.messagesStreams = messagesStreams;
    }

    /**
     * A method that writes the Message object to the message kafka topic.
     * @param message
     */
    public void sendMessage(final Message message) {
        log.info("Sending message {}", message);

        MessageChannel messageChannel = messagesStreams.outboundGreetings();
        messageChannel.send(MessageBuilder
                .withPayload(message)
                .setHeader(MessageHeaders.CONTENT_TYPE, MimeTypeUtils.APPLICATION_JSON)
                .build());
    }
}
