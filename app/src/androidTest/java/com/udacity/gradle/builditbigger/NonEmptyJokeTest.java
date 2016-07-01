package com.udacity.gradle.builditbigger;

import android.app.Activity;
import android.content.Intent;
import android.test.AndroidTestCase;
import android.util.Log;

/**
 * Created by kewal on 5/29/2016.
 */
public class NonEmptyJokeTest extends AndroidTestCase {

    private static final String LOG_TAG = "NonEmptyJokeTest";

    @SuppressWarnings("unchecked")
    public void test() {

        // Testing that Async task successfully retrieves a non-empty string
        // You can test this from androidTest -> Run 'All Tests'
        Log.v(LOG_TAG, "Running NonEmptyJokeTest test");
        String result = null;
        JokesRetrieverAsyncTask endpointsAsyncTask = new JokesRetrieverAsyncTask(getContext(),false);
        endpointsAsyncTask.execute();
        try {
            result = endpointsAsyncTask.get();
            Log.d(LOG_TAG, "Retrieved a non-empty string successfully: " + result);
        } catch (Exception e) {
            e.printStackTrace();
        }
        assertNotNull(result);
    }

}
