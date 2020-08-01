package com.kodilla.testing.forum.statistics;

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

    public void calculateAdvStatistics(Statistics statistics) {

   }
   public void showStatistics() {
   }
}