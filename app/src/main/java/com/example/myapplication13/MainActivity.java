package com.example.myapplication13;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the button by its ID
        Button toastButton = findViewById(R.id.button_show_toast);

        // Set an onClickListener to handle button clicks
        toastButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Show a Toast message when the button is clicked
                Toast.makeText(MainActivity.this, "Hello, this is a Toast message!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
