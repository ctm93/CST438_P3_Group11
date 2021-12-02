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
    private TextView title;
    private Button addButton;
    private EditText nameBox;
    private EditText cycleBox;
    private EditText descriptionBox;
    private EditText fertilizerBox;

    // Firebase
    FirebaseFirestore db = FirebaseFirestore.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Intent Factory for buttons.
        IntentFactory factory = new IntentFactory();

        connectElements();
        onClickMethods(factory);
    }

    //TODO: need to add fertilizer editText and add it to plant data
    private void onClickMethods(IntentFactory factory) {
        addButton.setOnClickListener(v -> {
            String plantName = nameBox.getText().toString();
            String waterCycle = cycleBox.getText().toString();
            String description = descriptionBox.getText().toString();
            Map<String, Object> plant = new HashMap<>();
            plant.put("plantName", plantName);
            plant.put("waterCycle", waterCycle);
            plant.put("description", description);

            db.collection("user_plants")
                    .add(plant)
                    .addOnSuccessListener(new OnSuccessListener<DocumentReference>() {
                        @Override
                        public void onSuccess(DocumentReference documentReference) {
                            Toast.makeText(AddUserPlantActivity.this, "Successfully added!", Toast.LENGTH_SHORT).show();
                        }
                    }).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull Exception e) {

                    Toast.makeText(AddUserPlantActivity.this, "Failed to add plant. Please try again.", Toast.LENGTH_SHORT).show();

                }
            });
        });
    }

    private void connectElements() {
        //title = findViewById(R.id.textViewAddPlantTitle);
        addButton = findViewById(R.id.buttonAddUserPlant);
        nameBox = findViewById(R.id.editTextUserPlantName);
        cycleBox = findViewById(R.id.editTextUserPlantCycle);
        descriptionBox = findViewById(R.id.editTextUserPlantDescription);
    }
}
