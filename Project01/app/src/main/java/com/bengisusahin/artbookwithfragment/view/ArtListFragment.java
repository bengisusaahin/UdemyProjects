package com.bengisusahin.artbookwithfragment.view;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bengisusahin.artbookwithfragment.databinding.FragmentArtListBinding;

public class ArtListFragment extends Fragment {

    private FragmentArtListBinding fragmentArtListBinding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        fragmentArtListBinding = FragmentArtListBinding.inflate(inflater, container, false);
        View view = fragmentArtListBinding.getRoot();
        return view;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        fragmentArtListBinding = null;
    }
}