package com.udacity.gradle.builditbigger.backend;

import com.curtesmalteser.myjokeslibrary.JokesTeller;

/** The object model for the data we are sending through endpoints */
public class MyBean {

    private String myJoke;

    public String getMyJoke() {
        return myJoke;
    }

    public void setMyJoke() {
        myJoke = JokesTeller.getJoke();
    }
}