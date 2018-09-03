package com.example.designer.strategyPattern;

import org.springframework.stereotype.Component;

@Component
public class ArenaBp implements Strategy {
    @Override
    public long doBp(long bpId) {
        System.out.println("arenaBp: " + bpId);
        return bpId;
    }
}
