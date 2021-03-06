package com.joseluis.login;

import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.joseluis.login.fragment.HomeFragment;
import com.joseluis.login.fragment.SearchFragment;
import com.roughike.bottombar.BottomBar;
import com.roughike.bottombar.BottomBarTab;
import com.roughike.bottombar.OnTabSelectListener;

public class ContainnerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_containner);

        BottomBar bottomBar = (BottomBar) findViewById(R.id.bottombar);
        bottomBar.setDefaultTab(R.id.home);
        BottomBarTab tab01 = bottomBar.getTabWithId(R.id.search);
        BottomBarTab tab02 = bottomBar.getTabWithId(R.id.home);
        BottomBarTab tab03 = bottomBar.getTabWithId(R.id.reports);

        int nivel = getIntent().getIntExtra("nivel", 0);
        if(nivel == 2){
            tab03.setVisibility(View.INVISIBLE);
        }else if(nivel == 3){
            tab02.setVisibility(View.INVISIBLE);
            tab03.setVisibility(View.INVISIBLE);
        }
        bottomBar.setOnTabSelectListener(new OnTabSelectListener() {
            @Override
            public void onTabSelected(int tabId) {
                switch (tabId){
                    case R.id.search:
                        SearchFragment searchFragment = new SearchFragment();
                        getSupportFragmentManager().beginTransaction().replace(R.id.container, searchFragment)
                                .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN).addToBackStack(null).commit();
                        break;
                    case R.id.home:
                        HomeFragment homeFragment = new HomeFragment();
                        getSupportFragmentManager().beginTransaction().replace(R.id.container, homeFragment)
                                .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN).addToBackStack(null).commit();
                        break;
                    case  R.id.reports:
                        SearchFragment profileFragment = new SearchFragment();
                        getSupportFragmentManager().beginTransaction().replace(R.id.container, profileFragment)
                                .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN).addToBackStack(null).commit();
                        break;
                }
            }
        });
    }

}
