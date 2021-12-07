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
import com.google.api.Http;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;
import java.util.Map;

public class AddPublicPlantActivity extends AppCompatActivity {

    // Layout parts
    private TextView title;
    private Button addButton;
    private EditText nameBox;
    private EditText descriptionBox;

    private static final String SERVER = "http://10.0.2.2:3000/";

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

            String url = SERVER + "public_plants?plantName=" + plantName + "&description=" + description;
            HttpRequest request = new HttpRequest(url, "POST");
            request.execute();

        });
    }

    private void connectElements() {
        title = findViewById(R.id.textViewAddPlantTitle);
        addButton = findViewById(R.id.buttonAddPlant);
        nameBox = findViewById(R.id.editTextPlantName);
        descriptionBox = findViewById(R.id.editTextPlantDescription);
    }
}
