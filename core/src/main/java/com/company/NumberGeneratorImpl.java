package com.company;

import lombok.AccessLevel;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Random;

@Getter
@Component
public class NumberGeneratorImpl implements NumberGenerator{

    // == fields ==
    @Getter(AccessLevel.NONE)
    private final Random random = new Random();

//    @Autowired
//    @MaxNumber
    private final int maxNumber;

//    @Autowired
//    @MinNumber
    private final int minNumber;

    // == constructors ==
    @Autowired
    public NumberGeneratorImpl(@MaxNumber int maxNumber,@MinNumber int minNumber) {
        this.maxNumber = maxNumber;
        this.minNumber = minNumber;
    }

    // == public methods ==
    @Override
    public int generateNumber() {
        //Generate between min and max
        return (int) Math.floor((Math.random()*(maxNumber-minNumber+1)+minNumber));
    }

//    @Override
//    public int getMaxNumber() {
//        return maxNumber;
//    }
//
//    @Override
//    public int getMinNumber() {
//        return minNumber;
//    }
}
