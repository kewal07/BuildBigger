package com.udacity.gradle.builditbigger;

import android.app.Activity;
import android.content.Context;

/**
 * Created by kewal on 5/29/2016.
 */
public interface JokeRetrievalListener {
    void onJokeRetrieved(Context activity, String joke);
}
