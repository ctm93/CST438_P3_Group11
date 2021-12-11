package com.example.cst438_p3_group11;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;
import java.util.Map;

public class AddUserPlantActivity extends AppCompatActivity {


    // Layout parts
    private EditText mName;
    private EditText mDescription;
    private EditText mNotes;
    private EditText mWateringCycle;
    private EditText mFertilizeCycle;
    private Button addButton;
    private String username;

    private static final String SERVER = "http://10.0.2.2:3000/";

    // Function to ensure all information was input.
    public Boolean validate(String name, String description, String notes, String watering, String fertilize) {
        if(name != null && description != null && notes != null && watering != null && fertilize != null) {
            return true;
        } else {
            return false;
        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_user_plant);

        // Intent Factory for buttons.
        IntentFactory factory = new IntentFactory();

        connectElements();
        onClickMethods(factory);
    }

    private void onClickMethods(IntentFactory factory) {
        addButton.setOnClickListener(v -> {
            String plantName = mName.getText().toString();
            String description = mDescription.getText().toString();
            String notes = mNotes.getText().toString();
            String waterCycle = mWateringCycle.getText().toString();
            String fertilizeCycle = mFertilizeCycle.getText().toString();

            if(validate(plantName, description, notes, waterCycle, fertilizeCycle)) {
                String url = SERVER
                        + "user_plants?plantName=" + plantName
                        + "&waterCycle=" + waterCycle
                        + "&description=" + description
//                    + "&username=" + username
                        + "&notes=" + notes
                        + "&fertilizeCycle=" + fertilizeCycle
                        + "&waterCycle=" + waterCycle;
                HttpRequest request = new HttpRequest(url, "POST");
                request.execute();
            } else {
                Toast.makeText(AddUserPlantActivity.this, "Please enter all necessary information.", Toast.LENGTH_LONG).show();
            }

        });
    }

    private void connectElements() {
        mName = findViewById(R.id.plant_name);
        mDescription = findViewById(R.id.plant_description);
        mNotes = findViewById(R.id.notes);
        mWateringCycle = findViewById(R.id.watering_cycle);
        mFertilizeCycle = findViewById(R.id.fertilize_cycle);
        addButton = findViewById(R.id.buttonAddPlant);
    }
}
