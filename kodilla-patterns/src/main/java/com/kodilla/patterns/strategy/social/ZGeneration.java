package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.media.FacebookPublisher;

public class ZGeneration extends User{
    public ZGeneration(String userName) {
        super(userName);
        this.socialPublisher = new FacebookPublisher();
    }
}
