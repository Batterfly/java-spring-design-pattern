package com.example.designer.strategyPattern;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StrategyTest {

    @Autowired
    StrategyContext context;

    @Test
    public void doStoryBp() {
        long storyBp = context.executeBp(new StrategyContextDto("storyBp", 110));
        assertEquals(storyBp, 110);
    }

    @Test
    public void doArenaBp() {
        long arenaBp = context.executeBp(new StrategyContextDto("arenaBp", 220));
        assertEquals(arenaBp, 220);
    }

}