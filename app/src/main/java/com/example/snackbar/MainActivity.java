package com.example.snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ConstraintLayout cl = (ConstraintLayout) findViewById(R.id.constraintLayout);

        Button btn = (Button) findViewById(R.id.btnSnack);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar snackbar = Snackbar.make(cl,"SnackBar Generated", Snackbar.LENGTH_LONG)
                        .setAction("Click Me", new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Toast.makeText(getApplicationContext(), "Toast By SnackBar", Toast.LENGTH_SHORT).show();
                            }
                        }).setActionTextColor(Color.GREEN);
                snackbar.show();
            }
        });

    }
}