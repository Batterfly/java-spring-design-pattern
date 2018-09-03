package com.example.designer.simpleFactoryPattern;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GameFactoryTest {

    @Autowired
    GameFactory gameFactory;

    @Test
    public void generateGame() {
        Game dota = gameFactory.getGameByName("DOTA");
        assertNotEquals(dota, null);
        dota.play();

        Game csgo = gameFactory.getGameByName("CSGO");
        assertNotEquals(csgo, null);
        csgo.play();
    }

    @Test
    public void generateNULLGame() {
        Game storm = gameFactory.getGameByName("STORM");
        assertEquals(storm, null);
    }
}