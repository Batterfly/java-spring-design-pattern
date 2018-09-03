package com.example.designer.simpleFactoryPattern;

import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

@Component
public class GameFactory {

    public Game getGameByName(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        if ("CSGO".equalsIgnoreCase(name)) {
            return new CSGO();
        } else if ("DOTA".equalsIgnoreCase(name)) {
            return new DOTA();
        }

        return null;
    }
}
