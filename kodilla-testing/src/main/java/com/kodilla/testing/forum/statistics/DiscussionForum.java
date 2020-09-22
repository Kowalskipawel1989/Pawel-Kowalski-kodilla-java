package com.kodilla.testing.forum.statistics;


import java.util.List;

public class DiscussionForum{
    Statistics statistics;
    int numberOfUsers;
    int numberOfPosts;
    int numberOfComments;
    double averageNumberOfPostsPerUsers;
    double averageNumberOfCommentsPerUser;
    double averageNumberOfCommentsPerPost;

    public DiscussionForum(Statistics statistics) {
        this.statistics = statistics;
    }

    public int getNumberOfUsers() {
        return numberOfUsers;
    }

    public int getNumberOfPosts() {
        return numberOfPosts;
    }

    public int getNumberOfComments() {
        return numberOfComments;
    }

    public double getAverageNumberOfPostsPerUsers() {
        return averageNumberOfPostsPerUsers;
    }

    public double getAverageNumberOfCommentsPerUser() {
        return averageNumberOfCommentsPerUser;
    }

    public double getAverageNumberOfCommentsPerPost() {
        return averageNumberOfCommentsPerPost;
    }

    public int calculateAdvStatistics(Statistics statistics){
     this.numberOfUsers = statistics.usersNames().size();
     this.numberOfPosts = statistics.postsCount();
     this.numberOfComments = statistics.commentsCount();
     this.averageNumberOfPostsPerUsers = ((double)numberOfPosts / numberOfUsers);
     this.averageNumberOfCommentsPerPost = ((double)numberOfComments / numberOfPosts);
     this.averageNumberOfCommentsPerUser = ((double)numberOfComments / numberOfUsers);

     return calculateAdvStatistics(statistics);
    }
   public void showStatistics() {
       System.out.println(getNumberOfUsers());
       System.out.println(getNumberOfPosts());
       System.out.println(getNumberOfComments());
       System.out.println(getAverageNumberOfPostsPerUsers());
       System.out.println(getAverageNumberOfCommentsPerUser());
       System.out.println(getAverageNumberOfCommentsPerPost());
   }
}