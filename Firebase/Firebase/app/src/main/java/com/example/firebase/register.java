package com.example.firebase;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;

public class register extends AppCompatActivity {

    private EditText emailRegisterEditText, passwordRegisterEditText, confirmPasswordEditText;
    private Button registerButton;
    private FirebaseAuth mAuth;
    private Button tenhoConta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        emailRegisterEditText = findViewById(R.id.emailRegisterEditText);
        passwordRegisterEditText = findViewById(R.id.passwordRegisterEditText);
        confirmPasswordEditText = findViewById(R.id.confirmarSenha);
        registerButton = findViewById(R.id.registerButton);
        tenhoConta = findViewById(R.id.tenhoConta);

        mAuth = FirebaseAuth.getInstance();

        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = emailRegisterEditText.getText().toString();
                String password = passwordRegisterEditText.getText().toString();
                String confirmPassword = confirmPasswordEditText.getText().toString();

                // Verifique se as senhas correspondem
                if (!password.equals(confirmPassword)) {
                    Toast.makeText(register.this, "As senhas não correspondem!", Toast.LENGTH_SHORT).show();
                    return;
                }

                registerUser(email, password);
            }
        });

        tenhoConta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(register.this, MainActivity.class));
            }
        });
    }

    private void registerUser(String email, String password) {
        mAuth.createUserWithEmailAndPassword(email, password)
                .addOnCompleteListener(this, task -> {
                    if (task.isSuccessful()) {
                        Toast.makeText(register.this, "Registro bem-sucedido!", Toast.LENGTH_SHORT).show();
                        finish(); // Fecha a activity de registro e volta para login
                    } else {
                        Toast.makeText(register.this, "Falha no registro: " + task.getException().getMessage(), Toast.LENGTH_LONG).show();
                    }
                });
    }
}
