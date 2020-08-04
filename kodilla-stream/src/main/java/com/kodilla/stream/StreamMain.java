package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;

public class StreamMain {
    public static void main(String[] args) {
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("My name is Damian and I'm from Poland", (text -> text.toUpperCase()));
        poemBeautifier.beautify("I am now on vacation in Croatia", (text -> text.toLowerCase()));
        poemBeautifier.beautify("I'm starting my vacation tomorrow and going to Poland", (text -> text.concat(" !!!!!")));
        poemBeautifier.beautify("where are all my friends", (text -> text.replace('w','W')));
    }
}
