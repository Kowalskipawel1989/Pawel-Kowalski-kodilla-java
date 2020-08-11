package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
    /*    PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("My name is Damian and I'm from Poland", (text -> text.toUpperCase()));
        poemBeautifier.beautify("I am now on vacation in Croatia", (text -> text.toLowerCase()));
        poemBeautifier.beautify("I'm starting my vacation tomorrow and going to Poland", (text -> text.concat(" !!!!!")));
        poemBeautifier.beautify("where are all my friends", (text -> text.replace('w','W')));
*/
    Forum forum = new Forum();

    Map<Integer,ForumUser> result = forum.getUserList().stream()
        .filter(dateOfBirth -> dateOfBirth.hashCode() < 2000)
        .filter(dateOfBirth -> dateOfBirth.getSex() == 'M')
        .filter(dateOfBirth -> dateOfBirth.getNumberOfPostsPublished() >= 1)
        .collect(Collectors.toMap(ForumUser::getIdNumber,idNumber -> idNumber));

    System.out.println("Score is " + result.size());
    result.entrySet().stream()
        .map(key -> key.getKey() + ":" + key.getValue())
        .forEach(System.out::println);
    }

}
