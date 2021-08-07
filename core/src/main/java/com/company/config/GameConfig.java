package com.company.config;

import com.company.GuessCount;
import com.company.MaxNumber;
import com.company.MinNumber;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "com.company")
@PropertySource("classpath:config/game.properties")
public class GameConfig {

    // == fields ==
    @Value("${game.maxNumber:20}")
    private int maxNumber;

    @Value("${game.guessCount:5}")
    private int guessCount;

    @Value("1")
    private int minNumber;

    // == bean methods ==
    @Bean
    @MaxNumber
    public int maxNumber69(){
        return maxNumber;
    }

    @Bean
    @GuessCount
    public int guessCount69(){
        return guessCount;
    }

    @Bean
    @MinNumber
    public int getMinNumber() {
        return minNumber;
    }
}
