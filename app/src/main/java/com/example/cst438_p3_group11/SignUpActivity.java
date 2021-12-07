package com.example.cst438_p3_group11;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.database.core.Tag;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;
import java.util.Map;

public class SignUpActivity extends AppCompatActivity {

    // Function to ensure all information was input.
    public Boolean validate(String username, String password) {
        if(username != null && password != null) {
            return true;
        } else {
            return false;
        }
    }

    FirebaseFirestore db = FirebaseFirestore.getInstance();
    EditText username1, password1;
    Button btnRegister, btnBacktoHome;

    IntentFactory factory = new IntentFactory();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        db = FirebaseFirestore.getInstance();
        username1 = findViewById(R.id.etUsername);
        password1 = findViewById(R.id.etPassword);
        btnRegister = findViewById(R.id.btnRegister);
        btnBacktoHome = findViewById(R.id.btnBackToHome);

        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String username2 = username1.getText().toString();
                String password2 = password1.getText().toString();
                if(validate(username2, password2)) {
                    Map<String, Object> user = new HashMap<>();
                    user.put("username3", username2);
                    user.put("password3", password2);

                    db.collection("User")
                            .add(user)
                            .addOnSuccessListener(new OnSuccessListener<DocumentReference>() {
                                @Override
                                public void onSuccess(DocumentReference documentReference) {
                                    Toast.makeText(SignUpActivity.this, "Successfully signed up!", Toast.LENGTH_SHORT).show();
                                }
                            }).addOnFailureListener(new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull Exception e) {

                            Toast.makeText(SignUpActivity.this, "Failed to sign up. Please try again.", Toast.LENGTH_SHORT).show();

                        }
                    });
                } else {
                    Toast.makeText(SignUpActivity.this, "Please enter all necessary information.", Toast.LENGTH_LONG).show();
                }

            }
        });

        btnBacktoHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(factory.getIntent(SignUpActivity.this, MainActivity.class));
            }
        });

    }
}
