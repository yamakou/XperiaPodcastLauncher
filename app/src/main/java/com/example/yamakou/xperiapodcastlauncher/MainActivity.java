package com.example.yamakou.xperiapodcastlauncher;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = new Intent(Intent.ACTION_MAIN); //act
        intent.setAction("com.sonymobile.podcast.action.SHOW_CHANNELS"); // cat
        intent.setClassName("com.sonymobile.podcast", "com.sonymobile.podcast.browser.EntryActivity");
        startActivity(intent);

        finish();
    }

}
