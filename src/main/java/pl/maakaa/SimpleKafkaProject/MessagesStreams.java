package pl.maakaa.SimpleKafkaProject;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

/**
 *  Interface that defines kafka streams.
 */
public interface MessagesStreams {
    String INPUT = "greetings-in";
    String OUTPUT = "greetings-out";

    /**
     * an inbound stream to read messages from a Kafka topic
     */
    @Input(INPUT)
    SubscribableChannel inboundGreetings();

    /**
     * An outbound stream to write messages to a Kafka topic
     */
    @Output(OUTPUT)
    MessageChannel outboundGreetings();
}
