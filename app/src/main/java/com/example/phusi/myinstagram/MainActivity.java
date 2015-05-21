package com.example.phusi.myinstagram;

import android.app.ActionBar;
import android.app.TabActivity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;


public class MainActivity extends TabActivity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TabHost tabHost = getTabHost();

        // Tab for Photos
        TabSpec homeSpec = tabHost.newTabSpec("Home");
        // setting Title and Icon for the Tab
        homeSpec.setIndicator("H", getResources().getDrawable(R.drawable.ic_action_home));
        Intent homeIntent = new Intent(this, HomeActivity.class);
        homeSpec.setContent(homeIntent);

        // Tab for Search
        TabSpec searchSpec = tabHost.newTabSpec("Search");
        searchSpec.setIndicator("S", getResources().getDrawable(R.drawable.ic_action_search));
        Intent searchIntent = new Intent(this, SearchActivity.class);
        searchSpec.setContent(searchIntent);

        // Tab for Cam
        TabSpec camSpec = tabHost.newTabSpec("Cam");
        camSpec.setIndicator("C", getResources().getDrawable(R.drawable.ic_action_search));
        Intent camIntent = new Intent(this, CamActivity.class);
        camSpec.setContent(camIntent);

        // Tab for Activity
        TabSpec actSpec = tabHost.newTabSpec("Activity");
        actSpec.setIndicator("A", getResources().getDrawable(R.drawable.ic_action_search));
        Intent actIntent = new Intent(this, ActitivyActivity.class);
        actSpec.setContent(actIntent);

        // Tab for Profile
        TabSpec profileSpec = tabHost.newTabSpec("Profile");
        profileSpec.setIndicator("P", getResources().getDrawable(R.drawable.ic_action_search));
        Intent profileIntent = new Intent(this,ProfileActivity.class);
        profileSpec.setContent(profileIntent);


        // Adding all TabSpec to TabHost
        tabHost.addTab(homeSpec); // Adding home tab
        tabHost.addTab(searchSpec); // Adding search tab
        tabHost.addTab(camSpec); // Adding cam tab
        tabHost.addTab(actSpec); // Adding act tab
        tabHost.addTab(profileSpec); // Adding profile tab
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
}
