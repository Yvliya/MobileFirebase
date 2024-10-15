package com.example.firebase;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class logado extends AppCompatActivity {
    private FirebaseAuth mAuth;
    private TextView emailTextView;
    private ImageButton logoutButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logado);


        mAuth = FirebaseAuth.getInstance();


        emailTextView = findViewById(R.id.emailTextView);
        logoutButton = findViewById(R.id.logoutButton);


        FirebaseUser user = mAuth.getCurrentUser();

        if (user != null) {

            String email = user.getEmail();
            emailTextView.setText("Email logado: " + email);
        } else {

            Intent intent = new Intent(logado.this, MainActivity.class);
            startActivity(intent);
            finish();
        }

        // Configurando o botão de logout
        logoutButton.setOnClickListener(v -> {
            mAuth.signOut(); // Fazer logout do Firebase
            Intent intent = new Intent(logado.this, MainActivity.class);
            startActivity(intent);
            finish();
        });
    }
}