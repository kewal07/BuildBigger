package com.jokesjava;

import java.util.Random;

public class JokesJava {

    private String[] jokes = null;
    private Random random = null;

    public JokesJava(){
        jokes = new String[3];
        // Jokes from http://www.rd.com/jokes/one-liners/
        jokes[0] = "This may be the wine talking, but I really, really, really, really love wine.";
        jokes[1] = "The closest a person ever comes to perfection is when he fills out a job application form.";
        jokes[2] = "The Revenant (2015). An epic tale of one man’s desperate journey to do whatever it takes to finally win an Oscar.";
        random = new Random();
    }

    public String getJoke(){
        return jokes[random.nextInt(jokes.length)];
    }
}
