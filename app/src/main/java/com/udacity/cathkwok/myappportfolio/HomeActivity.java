package com.udacity.cathkwok.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void launchApp(View view) {
        if (view instanceof Button) {
            Button button = (Button) view;
            String toastMessage = getResources().getString(R.string.toast_message, button.getText().toString().toLowerCase());
            Toast toast = Toast.makeText(this, toastMessage, Toast.LENGTH_SHORT);
            toast.show();
        }
    }
}
