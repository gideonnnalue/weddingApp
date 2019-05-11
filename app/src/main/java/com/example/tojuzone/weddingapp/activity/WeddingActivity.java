package com.example.tojuzone.weddingapp.activity;

import android.content.Intent;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.Window;
import android.view.WindowManager;

import com.example.tojuzone.weddingapp.EngagementPicsActivity;
import com.example.tojuzone.weddingapp.EngagementVideoActivity;
import com.example.tojuzone.weddingapp.OurStoryFragment;
import com.example.tojuzone.weddingapp.WeddingPartyFragment;
import com.example.tojuzone.weddingapp.fragment.CountdownFragment;
import com.example.tojuzone.weddingapp.fragment.EngagementPicsFragment;
import com.example.tojuzone.weddingapp.fragment.LocationFragment;
import com.example.tojuzone.weddingapp.R;

public class WeddingActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{

    private DrawerLayout drawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wedding);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            Window w = getWindow();
            w.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        }


        drawerLayout = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar,
                R.string.navigation_drawer_open, R.string.navigation_drawer_close);

        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new CountdownFragment()).commit();
            setTitle("Countdown");
            navigationView.setCheckedItem(R.id.countdown);
        }
    }

    @Override
    public void onBackPressed() {
        if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
            drawerLayout.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case R.id.countdown:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new CountdownFragment()).commit();
                setTitle("Countdown");
                break;
            case R.id.location:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new LocationFragment()).commit();
                setTitle("Location");
                break;
            case R.id.engage_vids:
                Intent vidIntent = new Intent(this, EngagementVideoActivity.class);
                startActivity(vidIntent);
//                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new EngagementPicsFragment()).commit();
//                setTitle("Engagement");
                break;
            case R.id.engage_pics:
                Intent intent = new Intent(this, EngagementPicsActivity.class);
                startActivity(intent);
//                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new EngagementPicsFragment()).commit();
//                setTitle("Engagement");
                break;
            case R.id.wedding_party:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new WeddingPartyFragment()).commit();
                setTitle("Wedding Party");
                break;
            case R.id.our_story:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new OurStoryFragment()).commit();
                setTitle("Our Stroy");
                break;

        }

        drawerLayout.closeDrawer(GravityCompat.START);
        return true;
    }
}
