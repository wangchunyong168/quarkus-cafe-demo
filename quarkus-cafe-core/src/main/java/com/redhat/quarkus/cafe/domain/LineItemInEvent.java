package com.redhat.quarkus.cafe.domain;

import io.quarkus.runtime.annotations.RegisterForReflection;

@RegisterForReflection
public class LineItemInEvent extends LineItemEvent {

    public String name;
    public Item item;

    public LineItemInEvent(String orderId, Item item, String name, EventType eventType) {
        this.name = name;
        this.item = item;
        this.eventType = eventType;
    }

    public Item getItem() {
        return item;
    }


}

