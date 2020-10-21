package com.kodilla.patterns.strategy.media;

import com.kodilla.patterns.strategy.social.SocialPublisher;

public class SnapchatPublisher implements SocialPublisher {
    @Override
    public String share() {
        return "Sse Snapchat";
    }
}
