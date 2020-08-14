package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public final class Forum {
   private final List<ForumUser> userList = new ArrayList<>();
       public Forum(){
       userList.add(new ForumUser(1,"Pablo Markovski",'M',1989,12,12,5));
       userList.add(new ForumUser(2,"Thomas Wolski",'M',1988,1,22,4));
       userList.add(new ForumUser(3,"James Mosakowski",'M',1977,7,25,9));
       userList.add(new ForumUser(4,"Lucy Riley",'F',1957,8,12,8));
       userList.add(new ForumUser(5,"Owen Rogers",'M',1975,7,29,6));
       userList.add(new ForumUser(6,"Matilda Davies",'F',1995,9,4,4));
       userList.add(new ForumUser(7,"Declan Booth",'M',1978,11,9,22));
       userList.add(new ForumUser(8,"Corinne Foster",'F',1999,6,8,11));
       userList.add(new ForumUser(9,"Khloe fry",'M',1969,3,22,1));
       userList.add(new ForumUser(10,"Martin Valenzuela",'M',1999,2,22,4));
   }
   public List<ForumUser> getUserList(){
       return new ArrayList<>(userList);
   }
}
