package com.pluralsight.OrderandReceipt;

import java.time.LocalDateTime;

public class Order {
    private LocalDateTime time;

    public Order() {
        this.time = LocalDateTime.now();
    }

    public LocalDateTime getTime() {
        return time;
    }
}
