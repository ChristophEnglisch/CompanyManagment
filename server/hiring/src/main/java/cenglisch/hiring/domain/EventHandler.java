package main.java.cenglisch.hiring.domain;

import java.util.function.Consumer;

public interface EventHandler {
    void publish(DomainEvent domainEvent);

    <T extends DomainEvent> void subscribe(Class<T> eventClass, Consumer<T> domainEventConsumer);
}
