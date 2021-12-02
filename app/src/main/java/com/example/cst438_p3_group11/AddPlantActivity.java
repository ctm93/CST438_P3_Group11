package com.example.cst438_p3_group11;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
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

public class AddPlantActivity extends AppCompatActivity {

    // Layout parts
    private TextView title;
    private Button addButton;
    private EditText nameBox;
    private EditText descriptionBox;

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

    private void onClickMethods(IntentFactory factory) {
        addButton.setOnClickListener(v -> {
            String plantName = nameBox.getText().toString();
            String description = descriptionBox.getText().toString();
            Map<String, Object> plant = new HashMap<>();
            plant.put("plantName", plantName);
            plant.put("description", description);

            db.collection("Plant")
                    .add(plant)
                    .addOnSuccessListener(new OnSuccessListener<DocumentReference>() {
                        @Override
                        public void onSuccess(DocumentReference documentReference) {
                            Toast.makeText(AddPlantActivity.this, "Successfully added!", Toast.LENGTH_SHORT).show();
                        }
                    }).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull Exception e) {

                    Toast.makeText(AddPlantActivity.this, "Failed to add plant. Please try again.", Toast.LENGTH_SHORT).show();

                }
            });
        });
    }

    private void connectElements() {
        title = findViewById(R.id.textViewAddPlantTitle);
        addButton = findViewById(R.id.buttonAddPlant);
        nameBox = findViewById(R.id.editTextPlantName);
        descriptionBox = findViewById(R.id.editTextPlantDescription);
    }
}
