package com.example.designer.strategyPattern;

public class StrategyContextDto {

    private String strategyName;

    private long bpId;

    public StrategyContextDto(String strategyName, long bpId) {
        this.strategyName = strategyName;
        this.bpId = bpId;
    }

    public String getStrategyName() {
        return strategyName;
    }

    public long getBpId() {
        return bpId;
    }

}
