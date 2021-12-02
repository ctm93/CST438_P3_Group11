package com.example.cst438_p3_group11;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.widget.Toast;

import com.example.cst438_p3_group11.HomeFragments.AddPlant;
import com.example.cst438_p3_group11.HomeFragments.AllPlants;
import com.example.cst438_p3_group11.HomeFragments.MyPlants;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Home extends AppCompatActivity {

    private BottomNavigationView mBottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        createBottomNavigationView();
    }

    private void createBottomNavigationView() {
        mBottomNavigationView = findViewById(R.id.bottom_navigation);
        setNavigationListener();
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.home_fragment, new AllPlants())
                .commit();
    }

    private void setNavigationListener() {
        mBottomNavigationView.setOnItemSelectedListener(item -> {
            Fragment selectedFragment;
            int fragmentId = item.getItemId();

            if (item.getItemId() == R.id.all_plants) {
                selectedFragment = new AllPlants();
            } else if (item.getItemId() == R.id.my_plants) {
                selectedFragment = new MyPlants();
            } else if (item.getItemId() == R.id.add_plant) {
                selectedFragment = new AddPlant();
            } else {
                return false;
            }

            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.home_fragment, selectedFragment)
                    .commit();
            return true;
        });
    }


}