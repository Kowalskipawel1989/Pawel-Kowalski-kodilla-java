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
        userId.add(0, "User01");
        userId.add(1, "User02");
        userId.add(2, "User03");
        userId.add(3, "User04");
        userId.add(4, "User05");
        userId.add(5, "User06");
        userId.add(6, "User07");
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
        DiscussionForum discussionForum = new DiscussionForum();
        //When
        int numberOfPosts = discussionForum.getNumberOfPosts();
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
        DiscussionForum discussionForum = new DiscussionForum();
        //When
        int numberOfComments = discussionForum.getNumberOfComments();
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