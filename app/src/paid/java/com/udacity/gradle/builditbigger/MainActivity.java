package com.udacity.gradle.builditbigger;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ProgressBar;

// import com.google.android.gms.ads.AdListener;
// import com.google.android.gms.ads.AdRequest;
// import com.google.android.gms.ads.InterstitialAd;
import com.jokesjava.JokesJava;


public class MainActivity extends ActionBarActivity {

//    private JokesJava jokes = new JokesJava();
    private ProgressBar spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinner = (ProgressBar)findViewById(R.id.progressBar1);
        spinner.setVisibility(View.GONE);
    }

    @Override
    public void onResume(){
        super.onResume();
        spinner = (ProgressBar)findViewById(R.id.progressBar1);
        spinner.setVisibility(View.GONE);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void tellJoke(View view){
        // Step 3 changes start
        spinner.setVisibility(View.VISIBLE);
        new JokesRetrieverAsyncTask(MainActivity.this,false).execute();
        // Step 3 changes end
//        // Step 2 changes start
//        Intent myIntent = new Intent(MainActivity.this, JokesDisplayActivity.class);
//        String joke = jokes.getJoke();
//        myIntent.putExtra(String.valueOf(com.udacity.jokes.jokesandroidlibrary.R.string.extra_joke_intent_name), joke);
//        MainActivity.this.startActivity(myIntent);
//        // Step 2 changes end
//        Toast.makeText(this, "derp", Toast.LENGTH_SHORT).show();
    }
}
