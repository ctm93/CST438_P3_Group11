package com.example.cst438_p3_group11.HomeFragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.cst438_p3_group11.R;

public class AddPlant extends Fragment {

    private EditText mName;
    private EditText mDescription;
    private EditText mWaterCycle;
    private EditText mFertilizationCycle;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.add_plant, container, false);
        return v;
    }
}
