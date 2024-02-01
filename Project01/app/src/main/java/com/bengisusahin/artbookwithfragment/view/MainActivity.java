package com.bengisusahin.artbookwithfragment.view;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.navigation.NavDirections;
import androidx.navigation.Navigation;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.bengisusahin.artbookwithfragment.R;

public class MainActivity extends AppCompatActivity {
//    private ActivityMainBinding activityMainBinding;
//    ArrayList<Art> artArrayList;
//    ArtListAdapter artListAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        activityMainBinding = ActivityMainBinding.inflate(getLayoutInflater());
//        View view = activityMainBinding.getRoot();
//        setContentView(view);
//
//        artArrayList = new ArrayList<>();
//
//        artListAdapter = new ArtListAdapter(artArrayList);
//        ArtListFragment artListFragment = new ArtListFragment();
//        FragmentManager fragmentManager = getSupportFragmentManager();
//
//        if (savedInstanceState == null) {
//            fragmentManager.beginTransaction()
//                    .setReorderingAllowed(true)
//                    .replace(R.id.fragment, artListFragment, null)
//                    .commit();
//       }
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
//            FragmentManager fragmentManager = getSupportFragmentManager();
//            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
//            AddArtFragment addArtFragment = new AddArtFragment();
//            fragmentTransaction.replace(R.id.fragment, addArtFragment).commit();
            NavDirections action = ArtListFragmentDirections.actionArtListFragmentToAddArtFragment();
            Navigation.findNavController(this, R.id.fragment).navigate(action);
        }

        return super.onOptionsItemSelected(item);
    }
}