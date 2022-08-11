package com.kodilla.patterns.strategy.social;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserTestSuite {

    @Test
    void testDefaultSharingStrategies() {
        //Given
        User harry = new Millenials("Harry Erskin");
        User dick = new YGeneration("Dick Halloran");
        User kurt = new ZGeneration("Kurt Wallander");
        //When
        String harryShares = harry.sharePost();
        System.out.println(harry.getName() + " [Millenials]: " + harryShares);
        String dickShares = dick.sharePost();
        System.out.println(dick.getName() + " [Y Generation]: " + dickShares);
        String kurtShares = kurt.sharePost();
        System.out.println(kurt.getName() + " [Z Generation]: " + kurtShares);
        //Then
        Assertions.assertEquals("Sharing posts on Facebook", harryShares);
        Assertions.assertEquals("Sharing posts on Twitter", dickShares);
        Assertions.assertEquals("Sharing posts on Snapchat", kurtShares);
    }

    @Test
    void testIndividualSharingStrategy() {
        //Given
        User harry = new Millenials("Harry Erskin");
        //When
        String harryShares = harry.sharePost();
        System.out.println(harry.getName() + " [Millenials]: " + harryShares);
        harry.setSharing(new TwitterPublisher());
        harryShares = harry.sharePost();
        System.out.println("Now " + harry.getName() + " [Millenials]: " + harryShares);
        //Then
        Assertions.assertEquals("Sharing posts on Twitter", harryShares);
    }
}
