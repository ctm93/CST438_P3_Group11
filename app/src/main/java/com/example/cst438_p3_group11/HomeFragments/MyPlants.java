package com.example.cst438_p3_group11.HomeFragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cst438_p3_group11.Adapters.UserPlantAdapter;
import com.example.cst438_p3_group11.Plants.UserPlant;
import com.example.cst438_p3_group11.R;

import java.util.ArrayList;

public class MyPlants extends Fragment {

    private RecyclerView mRecyclerView;
    private UserPlantAdapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    private EditText mSearch;
    ArrayList<UserPlant> mPlants; //TODO: Change PLant Class

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.plants_view, container, false);
        mSearch = v.findViewById(R.id.search_plant);
        mPlants = getPlantList();
        createRecyclerView(v);
        return v;
    }

    private void createRecyclerView(View view) {
        mRecyclerView = view.findViewById(R.id.plants_view);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(getContext());
        mAdapter = new UserPlantAdapter(mPlants);

        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdapter);
    }

    private ArrayList<UserPlant> getPlantList() {
        ArrayList<UserPlant> plants = new ArrayList<>();
        for(int i=0; i<4; i++) {
            plants.add(new UserPlant(1, "Plant"+i, "Plant Description", "Notes", "two times", "once week"));
        }
        return plants;
    }
}
