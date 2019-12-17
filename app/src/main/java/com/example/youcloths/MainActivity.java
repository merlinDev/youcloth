package com.example.youcloths;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.widget.EditText;
import android.widget.ImageView;

import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    EditText username, password;
    ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = findViewById(R.id.username);
        password = findViewById(R.id.password);

        image = findViewById(R.id.imageView);

        CustomAnimation.animate(image);
    }

    public void register(View view) {
        startActivity(new Intent(this, Register.class));
    }

    /**
     * you only need to validate and proceed :)
     * */
    public void login(View view) {
        String usernameString = username.getText().toString();
        String passwordString = password.getText().toString();

        Log.d(TAG, "login: username : "+ usernameString);
        Log.d(TAG, "login: password : "+ passwordString);

        // please delete this snackbar when you developing your app (added to test purpose only)
        Snackbar
                .make(findViewById(R.id.parent), "user :"+usernameString, BaseTransientBottomBar.LENGTH_LONG)
                .show();
    }


}
