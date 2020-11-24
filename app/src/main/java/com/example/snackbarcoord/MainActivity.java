package com.example.snackbarcoord;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    FloatingActionButton fab;
    Snackbar snackbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fab=(FloatingActionButton)findViewById(R.id.fab_id);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                snackbar=Snackbar.make(view,"Message sent",Snackbar.LENGTH_INDEFINITE);
                 snackbar.setDuration(8000);
                 snackbar.setAction("OK", new View.OnClickListener() {
                     @Override
                     public void onClick(View view) {
                          snackbar.dismiss();
                     }
                 });

                 View v=snackbar.getView();
                 v.setBackgroundColor(getResources().getColor(R.color.colorSnackbarBackground));






                 snackbar.show();
            }
        });
    }
}
