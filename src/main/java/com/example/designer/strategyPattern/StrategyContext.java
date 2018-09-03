package com.example.designer.strategyPattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import java.util.Map;
import java.util.Objects;

@Component
public class StrategyContext {

    /**
     * key:beanName
     * value：implement Strategy interface Bean
     */
    @Autowired
    private Map<String, Strategy> strategyMap;

    public Long executeBp(StrategyContextDto dto) {

        Objects.requireNonNull(dto);

        long bpId = dto.getBpId();
        String strategyName = dto.getStrategyName();

        if (!StringUtils.isEmpty(strategyName)) {
            return strategyMap.get(strategyName).doBp(bpId);
        }
        return null;
    }

}
