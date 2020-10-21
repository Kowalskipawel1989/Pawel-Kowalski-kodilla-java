package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.media.FacebookPublisher;
import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies(){
        //Given
        User jan = new Millenials("Jan Bale");
        User robert = new YGeneration("Robert Cooper");
        User damian = new ZGeneration("Damian Smith");

        //When
        String janUse = jan.sharePost();
        System.out.println("Jan: " + janUse);
        String robertUse = robert.sharePost();
        System.out.println("Robert: " + robertUse);
        String damianUse = damian.sharePost();
        System.out.println("Damian: " + damianUse);
        //Then
        Assert.assertEquals("Use Twitter", janUse);
        Assert.assertEquals("Sse Snapchat", robertUse);
        Assert.assertEquals("Use Facebook", damianUse);
    }
    @Test
    public void testIndividualSharingStrategy(){
        //Given
        User jan = new Millenials("Jan Bale");
        //When
        String janUse = jan.sharePost();
        System.out.println("Jan: " + janUse);
        jan.setShareStrategy(new FacebookPublisher());
        janUse = jan.sharePost();
        System.out.println("Now Jan: " + janUse);

        //Then
        Assert.assertEquals("Use Facebook", janUse);
    }
}
