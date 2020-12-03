package pl.maakaa.SimpleKafkaProject.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * A class that represents the message object that is read from and write to the kafka topic.
 */
@Getter
@Setter
@ToString
@Builder
public class Message {
    private long timestamp;
    private String content;
}
