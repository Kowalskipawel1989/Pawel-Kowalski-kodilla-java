package com.kodilla.patterns.strategy.media;

import com.kodilla.patterns.strategy.social.SocialPublisher;

public class FacebookPublisher implements SocialPublisher {
    @Override
    public String share() {
        return "Use Facebook";
    }
}
