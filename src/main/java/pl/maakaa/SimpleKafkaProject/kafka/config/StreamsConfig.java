package pl.maakaa.SimpleKafkaProject.kafka.config;

import org.springframework.cloud.stream.annotation.EnableBinding;

/**
 * A class that configures Spring Cloud Stream to bind to the streams defined in the MessagesStreams interface.
 */
@EnableBinding(MessagesStreams.class)
public class StreamsConfig {
}
