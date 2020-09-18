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
        Statistics statistics = mock(Statistics.class);
        List<String> userId = new ArrayList<>();

        when(statistics.usersNames()).thenReturn(userId);
        DiscussionForum discussionForum = new DiscussionForum();
        //When
        int users = discussionForum.calculateAdvStatistics(statistics);
        //Then
        Assert.assertEquals(userId, users);
    }

    @Test
    public void testPostsCount() {
        //Given
        Statistics statistics = mock(Statistics.class);
        List<String> posts = new ArrayList<String>();

        when(statistics.postsCount()).thenReturn(posts.size());
        DiscussionForum discussionForum = new DiscussionForum();
        //When
        int numberOfPosts = discussionForum.calculateAdvStatistics(statistics);
        //Then
        Assert.assertEquals(posts.size(), numberOfPosts);
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