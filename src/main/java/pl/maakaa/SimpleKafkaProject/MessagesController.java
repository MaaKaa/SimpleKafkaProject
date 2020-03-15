package pl.maakaa.SimpleKafkaProject;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 * REST API endpoint that triggers sending a message to kafka using the GreetingsService bean.
 */
@RestController
public class MessagesController {
    private final MessagesProducer messagesProducer;

    public MessagesController(MessagesProducer messagesProducer) {
        this.messagesProducer = messagesProducer;
    }

    /**
     * Method defining an endpoint that takes a message request param and passes it to the sendMessage() method in MessagesService (it is then used by the Producer).
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
