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

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    FragmentManager fragmentManager = getSupportFragmentManager();
    FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

    ArtListFragment artListFragment = new ArtListFragment();
    ArrayList<Art> artArrayList;
    ArtListAdapter artListAdapter;
    public MainActivity() {
        super(R.layout.activity_main);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .setReorderingAllowed(true)
                    .add(R.id.frame_layout, ArtListFragment.class, null)
                    .commit();
        }

        artListAdapter = new ArtListAdapter(artArrayList);


        //artListFragment = new ArtListFragment();
        //fragmentTransaction.replace(R.id.frame_layout, artListFragment).commit();
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
            AddArtFragment addArtFragment = new AddArtFragment();
            fragmentTransaction.replace(R.id.frame_layout, addArtFragment).commit();
        }

        return super.onOptionsItemSelected(item);
    }
}