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
        DiscussionForum discussionForum = new DiscussionForum();
        List<String> userId = new ArrayList<>();
        when(statistics.usersNames()).thenReturn(userId);
        //When
        discussionForum.calculateAdvStatistics(statistics);
        int users = discussionForum.getNumberOfUsers();
        //Then
        assertEquals(0, users);
    }
    @Test
    public void testNumberOfUserEqualTo100() {
        //Given
        Statistics statistics = mock(Statistics.class);
        DiscussionForum discussionForum = new DiscussionForum();
        List<String> list = new ArrayList<>();
        for(int i = 0; i< 100; i++) {
            list.add("User " + i);
        }
        when(statistics.usersNames()).thenReturn(list);
        //When
        discussionForum.calculateAdvStatistics(statistics);
        int users = discussionForum.getNumberOfUsers();
        //Then
        assertEquals(list.size(),users);
    }
    @Test
    public void testNumberOfPostEqualTo0() {
        //Given
        Statistics statistics = mock(Statistics.class);
        List<String> posts = new ArrayList<String>();
        when(statistics.postsCount()).thenReturn(posts.size());
        DiscussionForum discussionForum = new DiscussionForum();
        //When
        discussionForum.calculateAdvStatistics(statistics);
        int resultListOf0Posts = discussionForum.getNumberOfPosts();
        //Then
        assertEquals(0, resultListOf0Posts);
    }
    @Test
    public void testNumberOfPostEqualTo1000() {
        //Given
        Statistics statistics = mock(Statistics.class);
        DiscussionForum discussionForum = new DiscussionForum();
        List<String> posts = new ArrayList<>();
        for(int i = 0; i< 1000; i++) {
            posts.add("User " + i);
        }
        when(statistics.postsCount()).thenReturn(posts.size());
        //When
        discussionForum.calculateAdvStatistics(statistics);
        int resultListOf1000Posts = discussionForum.getNumberOfPosts();
        //Then
        assertEquals(posts.size(),resultListOf1000Posts);
    }
    @Test
    public void testNumberOfCommentEqualTo0() {
        //Given
        Statistics statistics = mock(Statistics.class);
        DiscussionForum discussionForum = new DiscussionForum();
        List<String> comments = new ArrayList<>();
        when(statistics.commentsCount()).thenReturn(comments.size());
        //When
        discussionForum.calculateAdvStatistics(statistics);
        int resultListOf0Comments = discussionForum.getNumberOfComments();
        //Then
        assertEquals(0, resultListOf0Comments);
    }
    @Test
    public void testNumberOfCommentsIsLessThanThePostList(){
        Statistics statistics = mock(Statistics.class);
        DiscussionForum discussionForum = new DiscussionForum();
        when(statistics.commentsCount()).thenReturn(500);
        when(statistics.postsCount()).thenReturn(1000);
        //When
        discussionForum.calculateAdvStatistics(statistics);
        boolean resultCommentsIsLessThanThePost = discussionForum.getNumberOfComments() < discussionForum.getNumberOfPosts();
        //That
        assertTrue(resultCommentsIsLessThanThePost);
    }
    @Test
    public void testNumberOfCommentsIsGreaterThanThePostList(){
        Statistics statistics = mock(Statistics.class);
        DiscussionForum discussionForum = new DiscussionForum();
        when(statistics.commentsCount()).thenReturn(1000);
        when(statistics.postsCount()).thenReturn(800);
        //When
        discussionForum.calculateAdvStatistics(statistics);
        boolean resultCommentsIsGreaterThanThePostList = discussionForum.getNumberOfComments() > discussionForum.getNumberOfPosts();
        //That
        assertTrue(resultCommentsIsGreaterThanThePostList);
    }
}