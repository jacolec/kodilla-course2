package com.kodilla.exception.test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SecondChallengeTestSuite {

    @Test
    void xEqualsTwoTest() {
        //given
        SecondChallenge secondChallenge = new SecondChallenge();
        //when & then
        assertThrows(Exception.class, secondChallenge.probablyIWillThrowException(2, 3));


    }
}
