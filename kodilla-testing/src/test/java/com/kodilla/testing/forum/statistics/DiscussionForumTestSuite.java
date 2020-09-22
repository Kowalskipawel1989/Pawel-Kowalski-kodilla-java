package com.kodilla.testing.forum.statistics;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class DiscussionForumTestSuite {
    @Test
    public void testNumberOfUserEqualTo0() {
        //Given
        Statistics statistics = mock(Statistics.class);
        DiscussionForum discussionForum = new DiscussionForum(statistics);
        List<String> userId = new ArrayList<>();
        when(statistics.usersNames()).thenReturn(userId);
        //When
        int users = discussionForum.getNumberOfUsers();
        //Then
        assertEquals(0, users);
    }
    @Test
    public void testNumberOfUserEqualTo100() {
        //Given
        Statistics statistics = mock(Statistics.class);
        DiscussionForum discussionForum = new DiscussionForum(statistics);
        List<String> userId = new ArrayList<>();
        userId.get(0);
        when(statistics.usersNames()).thenReturn(userId);
        //When
        int result = discussionForum.calculateAdvStatistics(statistics);
        //Then
        assertEquals(userId,result);

    }


    @Test
    public void testNumberOfPostEqualTo0() {
        //Given
        Statistics statistics = mock(Statistics.class);
        List<String> posts = new ArrayList<String>();

        when(statistics.postsCount()).thenReturn(posts.size());
        DiscussionForum discussionForum = new DiscussionForum(statistics);
        //When
        int resultListOf0Posts = discussionForum.getNumberOfPosts();
        //Then
        assertEquals(0, resultListOf0Posts);
    }

    @Test
    public void testNumberOfPostEqualTo1000() {
        //Given
        Statistics statistics = mock(Statistics.class);
        DiscussionForum discussionForum = new DiscussionForum(statistics);
        //When

    }

    @Test
    public void testNumberOfCommentEqualTo0() {
        //Given
        Statistics statistics = mock(Statistics.class);
        DiscussionForum discussionForum = new DiscussionForum(statistics);
        List<String> comments = new ArrayList<>();
        when(statistics.commentsCount()).thenReturn(comments.size());
        //When
        int resultListOf0Comments = discussionForum.getNumberOfComments();
        //Then
        assertEquals(0, resultListOf0Comments);
    }

    @Test
    public void testNumberOfCommentsIsLessThanThePostList(){
        Statistics statistics = mock(Statistics.class);
        DiscussionForum discussionForum = new DiscussionForum(statistics);
        List<String> comments = new ArrayList<>();
        comments.add("comments_1");
        comments.add("comments_2");
        comments.add("comments_3");

        List<String> posts = new ArrayList<>();
        posts.add("post_1");
        posts.add("post_2");
        posts.add("post_3");
        posts.add("post_4");
        when(statistics.commentsCount()).thenReturn(comments.size());
        when(statistics.postsCount()).thenReturn(posts.size());
        //When
        boolean result = comments.size() < posts.size();
        //That
        assertTrue(result);

    }
    @Test
    public void testNumberOfCommentsIsGreaterThanThePostList(){
        Statistics statistics = mock(Statistics.class);
        DiscussionForum discussionForum = new DiscussionForum(statistics);
        List<String> comments = new ArrayList<>();
        comments.add("comments_1");
        comments.add("comments_2");
        comments.add("comments_3");
        comments.add("comments_4");
        comments.add("comments_5");
        comments.add("comments_6");
        comments.add("comments_7");
        comments.add("comments_8");

        List<String> posts = new ArrayList<>();
        posts.add("post_1");
        posts.add("post_2");
        posts.add("post_3");
        posts.add("post_4");

        when(statistics.commentsCount()).thenReturn(comments.size());
        when(statistics.postsCount()).thenReturn(posts.size());
        //When
        boolean result = comments.size() > posts.size();
        //That
        assertTrue(result);
    }
}