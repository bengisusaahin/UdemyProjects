package com.bengisusahin.artbookwithfragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bengisusahin.artbookwithfragment.databinding.RecyclerRowBinding;

import java.util.ArrayList;

public class ArtListAdapter extends RecyclerView.Adapter<ArtListAdapter.ArtHolder> {

    ArrayList<Art> artArrayList;

    public ArtListAdapter(ArrayList<Art> artArrayList){
        this.artArrayList = artArrayList;
    }
    @NonNull
    @Override
    public ArtHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        RecyclerRowBinding recyclerRowBinding = RecyclerRowBinding.inflate(LayoutInflater.
                from(parent.getContext()),parent,false);
        return new ArtHolder(recyclerRowBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull ArtHolder artHolder, final int position) {
    }

    @Override
    public int getItemCount() {
        return artArrayList.size();
    }

    public class ArtHolder extends RecyclerView.ViewHolder {
        private final RecyclerRowBinding binding;
        public ArtHolder(RecyclerRowBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
