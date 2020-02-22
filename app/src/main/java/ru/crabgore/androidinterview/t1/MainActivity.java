package ru.crabgore.androidinterview.t1;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import ru.crabgore.androidinterview.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BlankFragment fragment = new BlankFragment();

        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.frame, fragment)
                .commit();
    }
}
