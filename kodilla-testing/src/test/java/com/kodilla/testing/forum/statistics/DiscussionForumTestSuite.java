package com.kodilla.testing.forum.statistics;

import org.junit.Test;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.List;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class DiscussionForumTestSuite {
    @Test
    public void testListOfUserName() {
        //Given
        Statistics listOfUserName = mock(Statistics.class);
        List<String> userId = new ArrayList<>();
        userId.add(0, "User");
        userId.add(1, "User");
        userId.add(2, "User");
        userId.add(3, "User");
        userId.add(4, "User");
        userId.add(5, "User");
        userId.add(6, "User");
        when(listOfUserName.usersNames()).thenReturn(userId);
        DiscussionForum discussionForum = new DiscussionForum();
        //When
        int users = discussionForum.getNumberOfUsers();
        //Then
        Assert.assertEquals(userId, users);
    }

    @Test
    public void testPostsCount() {
        //Given
        Statistics postsCount = mock(Statistics.class);
        List<String> posts = new ArrayList<String>();
        posts.add("Coś tam coś tam");
        posts.add("Coś tam coś tam");
        posts.add("Coś tam coś tam");
        posts.add("Coś tam coś tam");
        posts.add("Coś tam coś tam");
        posts.add("Coś tam coś tam");
        posts.add("Coś tam coś tam");
        posts.add("Coś tam coś tam");
        when(postsCount.postsCount()).thenReturn(posts.size());
        //When
        int numberOfPosts = posts.size();
        //Then
        Assert.assertEquals(8, numberOfPosts);
    }

    @Test
    public void testCommentsCount() {
        //Given
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
        //When
        int numberOfComments = comments.size();
        //Then
        Assert.assertEquals(10, numberOfComments);
    }

    @Test
    public void testAverageNumberOfPostsPerUsers() {

    }

    @Test
    public void testAverageNumberOfCommentsPerUser() {

    }

    @Test
    public void testAverageNumberOfCommentsPerPost(){

    }
}