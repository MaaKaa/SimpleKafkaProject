package pl.maakaa.SimpleKafkaProject.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import pl.maakaa.SimpleKafkaProject.domain.Message;
import pl.maakaa.SimpleKafkaProject.kafka.MessagesProducer;

/**
 * REST API endpoint that triggers sending a message to Kafka.
 */
@RestController
public class MessagesController {
    private final MessagesProducer messagesProducer;

    public MessagesController(MessagesProducer messagesProducer) {
        this.messagesProducer = messagesProducer;
    }

    /**
     * Method defining an endpoint that takes a message request param and passes it to the MessagesProducer's sendMessage() method.
     * @param message
     */
    @GetMapping("/messages")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void messages(@RequestParam("message") String message) {
        Message messages = Message.builder()
                .content(message)
                .timestamp(System.currentTimeMillis())
                .build();

        messagesProducer.sendMessage(messages);
    }
}
