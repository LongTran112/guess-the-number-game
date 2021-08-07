package com.company.util;

import org.springframework.stereotype.Component;

@Component
public final class GameMappings {

    public static final String PLAY = "play";
    public static final String REDIRECT_PLAY = "redirect:/" + PLAY;
    public static final String RESTART_PLAY = "restartPlay";
    public static final String RESTART_HOME = "restartHome";
    public static final String HOME = "home";



    private GameMappings() {
    }
}
