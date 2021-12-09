package com.example.cst438_p3_group11.HomeFragments;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.cst438_p3_group11.AddPublicPlantActivity;
import com.example.cst438_p3_group11.AddUserPlantActivity;
import com.example.cst438_p3_group11.IntentFactory;
import com.example.cst438_p3_group11.R;
import com.example.cst438_p3_group11.Utils;

public class AddPlant extends Fragment {

    private Button mUser;
    private Button mPublic;
    private String username;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.add_user_plant, container, false);
        mUser = v.findViewById(R.id.addUserPlant);
        mPublic = v.findViewById(R.id.addPublicPlant);

        onClickMethods();

        return v;
    }

    private void onClickMethods() {
        mUser.setOnClickListener(v-> {
            Intent intent = IntentFactory.getIntent(getActivity(), AddUserPlantActivity.class);
            String username = getActivity().getIntent().getStringExtra(Utils.USERNAME_KEY);
            intent.putExtra(Utils.USERNAME_KEY, username);
            startActivity(intent);
        });
        mPublic.setOnClickListener(v->{
            Intent intent = IntentFactory.getIntent(getActivity(), AddPublicPlantActivity.class);
            String username = getActivity().getIntent().getStringExtra(Utils.USERNAME_KEY);
            intent.putExtra(Utils.USERNAME_KEY, username);
            startActivity(intent);
        });
    }

}
