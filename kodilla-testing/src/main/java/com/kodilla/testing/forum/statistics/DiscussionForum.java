package com.kodilla.testing.forum.statistics;


import java.util.List;

public class DiscussionForum{
    int numberOfUsers;
    int numberOfPosts;
    int numberOfComments;
    int averageNumberOfPostsPerUsers;
    int averageNumberOfCommentsPerUser;
    int averageNumberOfCommentsPerPost;

    public int getNumberOfUsers() {
        return numberOfUsers;
    }

    public int getNumberOfPosts() {
        return numberOfPosts;
    }

    public int getNumberOfComments() {
        return numberOfComments;
    }

    public int getAverageNumberOfPostsPerUsers() {
        return averageNumberOfPostsPerUsers;
    }

    public int getAverageNumberOfCommentsPerUser() {
        return averageNumberOfCommentsPerUser;
    }

    public int getAverageNumberOfCommentsPerPost() {
        return averageNumberOfCommentsPerPost;
    }

    public int calculateAdvStatistics(Statistics statistics){
     this.numberOfUsers = statistics.usersNames().size();
     this.numberOfPosts = statistics.postsCount();
     this.numberOfComments = statistics.commentsCount();
     this.averageNumberOfPostsPerUsers = statistics.postsCount()/statistics.usersNames().size();
     this.averageNumberOfCommentsPerPost = statistics.commentsCount()/statistics.postsCount();
     this.averageNumberOfCommentsPerUser = statistics.commentsCount()/statistics.usersNames().size();
     return 0;
    }
   public void showStatistics() {

   }
}