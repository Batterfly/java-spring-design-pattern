package com.example.designer.strategyPattern;

import org.springframework.stereotype.Component;

@Component
public class StoryBp implements Strategy {
    @Override
    public long doBp(long bpId) {
        System.out.println("storyBp: " + bpId);
        return bpId;
    }
}
