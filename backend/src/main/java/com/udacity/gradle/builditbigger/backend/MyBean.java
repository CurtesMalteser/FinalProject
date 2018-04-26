package com.udacity.gradle.builditbigger.backend;

import com.curtesmalteser.myjokeslibrary.JokesTeller;

/** The object model for the data we are sending through endpoints */
public class MyBean {
    public String getFunnyJokes() {
        return JokesTeller.getJoke();
    }
}