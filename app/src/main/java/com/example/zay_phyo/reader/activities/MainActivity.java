package com.example.zay_phyo.reader.activities;

import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import com.example.zay_phyo.reader.R;
import com.example.zay_phyo.reader.adapters.NewsAdapter;
import com.example.zay_phyo.reader.fragments.PopularBookFragment;
import com.example.zay_phyo.reader.fragments.TopBookFragment;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
RecyclerView newsArraival;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.tb_news);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        getSupportFragmentManager().beginTransaction()
                .replace(R.id.hz_top_book_container,TopBookFragment.newInstance())
                .commit();

        getSupportFragmentManager().beginTransaction()
                .replace(R.id.hz_popular_book_container,PopularBookFragment.newInstance())
                .commit();

        newsArraival = findViewById(R.id.rv_new_arrivals);
        NewsAdapter newsAdapter = new NewsAdapter();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        newsArraival.setLayoutManager(linearLayoutManager);
        newsArraival.setAdapter(newsAdapter);

    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        return false;
    }
}
