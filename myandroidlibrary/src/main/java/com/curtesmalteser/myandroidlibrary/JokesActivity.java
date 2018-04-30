package com.curtesmalteser.myandroidlibrary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class JokesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jokes);

        TextView tvJokes = findViewById(R.id.tvJokes);

        if (getIntent().hasExtra(getString(R.string.string_intent_joke))) {
            tvJokes.setText(getIntent().getStringExtra(getString(R.string.string_intent_joke)));
        }
    }
}
