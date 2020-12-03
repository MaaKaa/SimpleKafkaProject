package pl.maakaa.SimpleKafkaProject.kafka.config;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

/**
 *  Interface that defines Kafka streams.
 */
public interface MessagesStreams {
    String INPUT = "messages-in";
    String OUTPUT = "messages-out";

    /**
     * An inbound stream to read messages from a Kafka topic.
     */
    @Input(INPUT)
    SubscribableChannel inboundMessages();

    /**
     * An outbound stream to write messages to a Kafka topic.
     */
    @Output(OUTPUT)
    MessageChannel outboundMessages();
}
