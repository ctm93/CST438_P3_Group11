package com.example.cst438_p3_group11.HomeFragments;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cst438_p3_group11.Adapters.PublicPlantAdapter;
import com.example.cst438_p3_group11.Plants.PublicPlant;
import com.example.cst438_p3_group11.R;

import java.util.ArrayList;

public class AllPlants extends Fragment {

    private RecyclerView mRecyclerView;
    private PublicPlantAdapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    private EditText mSearch;
    ArrayList<PublicPlant> mPlants;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.plants_view, container, false);
        mSearch = v.findViewById(R.id.search_plant);
        search();
        mPlants = getPlantList();
        createRecyclerView(v);

        return v;
    }

    private void search() {
        mSearch.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                filter(s.toString());
            }
        });
    }

    private void filter(String s) {
        ArrayList<PublicPlant> plants = new ArrayList<>();
        for(PublicPlant plant: mPlants) {
            if(plant.getPlantName().toLowerCase().contains(s.toLowerCase())) {
                plants.add(plant);
            }
        }
        mAdapter.filterList(plants);
    }

    private void createRecyclerView(View view) {
        mRecyclerView = view.findViewById(R.id.plants_view);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(getContext());
        mAdapter = new PublicPlantAdapter(mPlants);

        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdapter);
    }

    private ArrayList<PublicPlant> getPlantList() {
        ArrayList<PublicPlant> plants = new ArrayList<>();
        for(int i=0; i<10; i++) {
            plants.add(new PublicPlant(i, i, "user", "Plant"+i, "Description"));
        }
        return plants;
    }


}
