package com.bengisusahin.artbookwithfragment.view;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bengisusahin.artbookwithfragment.R;
import com.bengisusahin.artbookwithfragment.databinding.FragmentAddArtBinding;


public class AddArtFragment extends Fragment {

    private FragmentAddArtBinding fragmentAddArtBinding;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        fragmentAddArtBinding = FragmentAddArtBinding.inflate(getLayoutInflater(),container,false);
        View view = fragmentAddArtBinding.getRoot();
        return view;
    }

    public void save(View view){

    }
}