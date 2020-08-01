package com.kodilla.testing.forum.statistics;


import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class DiscussionForumTestSuite {
    @Test
    public void testListOfUserName() {
        //Given
        Statistics statisticMock = mock(Statistics.class);
        List<String> userId = new ArrayList<>();
        userId.add(0, "User");
        userId.add(1, "User");
        userId.add(2, "User");
        userId.add(3, "User");
        userId.add(4, "User");
        userId.add(5, "User");
        userId.add(6, "User");
        when(statisticMock.usersNames()).thenReturn(userId);

        //When

        //Then
    }
    @Test
    public void testPostsCount() {
        Statistics postsCount = mock(Statistics.class);
        List<String> posts = new ArrayList<>();
        posts.add("Coś tam coś tam");
        posts.add("Coś tam coś tam");
        posts.add("Coś tam coś tam");
        posts.add("Coś tam coś tam");
        posts.add("Coś tam coś tam");
        posts.add("Coś tam coś tam");
        posts.add("Coś tam coś tam");
        posts.add("Coś tam coś tam");
        when(postsCount.postsCount()).thenReturn(posts.size());
        //Given
        //When
        //Then
    }
    @Test
    public void testCommentsCount(){
        Statistics commentsCount = mock(Statistics.class);
        List<String> comments = new ArrayList<>();
        comments.add("coś Coś");
        comments.add("coś Coś");
        comments.add("coś Coś");
        comments.add("coś Coś");
        comments.add("coś Coś");
        comments.add("coś Coś");
        comments.add("coś Coś");
        comments.add("coś Coś");
        comments.add("coś Coś");
        comments.add("coś Coś");
        when(commentsCount.commentsCount()).thenReturn(comments.size());
        //Given
        //When
        //Then

    }


}