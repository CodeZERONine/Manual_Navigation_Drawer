package com.project.manual_navigation_drawer;

import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    private DrawerLayout mDrawewLayout;
    private ActionBarDrawerToggle mToggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mDrawewLayout=(DrawerLayout)findViewById(R.id.drawerLayout);
        mToggle= new ActionBarDrawerToggle(this,mDrawewLayout,R.string.open,R.string.close);//Link Toggle to DrawerLayout to Hammburger button

        mDrawewLayout.addDrawerListener(mToggle);//Listen to mToggle and Bring Drawer
        mToggle.syncState();

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);//To Enable The BACk ARROW icon

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)//Listner for any thing on the menu bar.
    {
        if(mToggle.onOptionsItemSelected(item))
        {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
