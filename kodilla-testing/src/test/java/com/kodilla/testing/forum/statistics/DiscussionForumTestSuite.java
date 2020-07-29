package com.kodilla.testing.forum.statistics;


import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class DiscussionForumTestSuite {
    @Test
    public void testCalculateAdvStatistic(){
        //Given
        Statistics statisticMock = mock(Statistics.class);
        List<String> userId = new ArrayList<>();
        userId.add(0,"User");
        userId.add(1,"User");
        userId.add(2,"User");
        userId.add(3,"User");
        userId.add(4,"User");
        userId.add(5,"User");
        userId.add(6,"User");
        when(statisticMock.usersNames()).thenReturn(userId);
        DiscussionForum discussionForum = new DiscussionForum(statisticMock);
        }
        //When


        //Then

    }
}
