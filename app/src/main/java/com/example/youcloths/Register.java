package com.example.youcloths;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.Snackbar;

public class Register extends AppCompatActivity {

    private static final String TAG = "Register";

    EditText email, username, password;
    ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        email = findViewById(R.id.email);
        username = findViewById(R.id.username);
        password = findViewById(R.id.password);

        image = findViewById(R.id.imageView);

        CustomAnimation.animate(image);
    }

    public void login(View view) {
        startActivity(new Intent(this, MainActivity.class));
    }

    /**
     * you only need to validate and proceed :)
     * */
    public void register(View view) {
        String emailString = email.getText().toString();
        String usernameString = username.getText().toString();
        String passwordString = password.getText().toString();

        Log.d(TAG, "register: username : "+ usernameString);
        Log.d(TAG, "register: email : "+ emailString);
        Log.d(TAG, "register: password : "+ passwordString);

        // please delete this snackbar when you developing your app (added to test purpose only)
        Snackbar
                .make(findViewById(R.id.parent), "user :"+usernameString, BaseTransientBottomBar.LENGTH_LONG)
                .show();
    }
}
