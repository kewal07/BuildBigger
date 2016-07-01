package com.udacity.gradle.builditbigger;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;

import com.udacity.jokes.jokesandroidlibrary.JokesDisplayActivity;

/**
 * Created by kewal on 5/29/2016.
 */
public class JokeRetrievalHandler implements JokeRetrievalListener {
    @Override
    public void onJokeRetrieved(Context callingActivity, String joke) {
        Intent myIntent = new Intent(callingActivity, JokesDisplayActivity.class);
        myIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        myIntent.putExtra(String.valueOf(com.udacity.jokes.jokesandroidlibrary.R.string.extra_joke_intent_name), joke);
        callingActivity.startActivity(myIntent);
    }
}
