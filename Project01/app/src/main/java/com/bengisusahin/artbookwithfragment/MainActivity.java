package com.bengisusahin.artbookwithfragment;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

import com.bengisusahin.artbookwithfragment.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding activityMainBinding;
    ArrayList<Art> artArrayList;
    ArtListAdapter artListAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityMainBinding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = activityMainBinding.getRoot();
        setContentView(view);

        artArrayList = new ArrayList<>();

        artListAdapter = new ArtListAdapter(artArrayList);
        ArtListFragment artListFragment = new ArtListFragment();
        FragmentManager fragmentManager = getSupportFragmentManager();

        if (savedInstanceState == null) {
            fragmentManager.beginTransaction()
                    .setReorderingAllowed(true)
                    .replace(R.id.fragment, artListFragment, null)
                    .commit();
       }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.add_art_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.add_art_menu){
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            AddArtFragment addArtFragment = new AddArtFragment();
            fragmentTransaction.replace(R.id.fragment, addArtFragment).commit();
        }

        return super.onOptionsItemSelected(item);
    }
}