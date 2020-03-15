A simple Spring Cloud Stream project with Apache Kafka binder. 

## Table of contents
* [Background](#background)
* [Screenshots](#screenshots)
* [Technologies](#technologies)
* [Setup](#setup)
* [Status](#status)
* [Contact](#contact)

## Background
Spring Cloud Stream is a framework for building highly scalable event-driven microservices connected with shared messaging systems. It supports a variety of binder implementations - e.g. for the Apache Kafka.
Learn more: https://spring.io/projects/spring-cloud-stream

## Features
This simple application was built to test Spring Cloud Services and Kafka binder. 

It defines a REST endpoint through which you can pass the message and print it to the console to see kafka's consumer and producer in action.


## Technologies
Used tools/ frameworks:

- Java 11
- Gradle
- Spring Boot
- Spring Cloud Stream with Apache Kafka binder 
- IntelliJ Ultimate Edition

## Setup
1. First, make sure you have Apache Kafka and Zookeeper installed and running on you device. To do so, you can follow this tutorial: https://kafka.apache.org/quickstart

2. Download the project and open it in your IDE. Then, run it (if you use IntelliJ, click Shift+F10). 

3. Now you can go to http://localhost:8080/messages?message=MessageContent, pass the message content as a parameter, and then see the kafka's producer and consumer in action in the console.

## Status
Project is: _finished_ 

## Contact
Created by [Marzena Kacprowicz](http://zrobtowinternecie.pl/) - feel free to contact me!

