package com.squorpikkor.app.specgenerator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    SpecGenerator specGenerator;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        specGenerator = new SpecGenerator();
        editText = findViewById(R.id.t1);


        findViewById(R.id.b1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "poisson = " + specGenerator.poissonRandomGenerator(Double.parseDouble(editText.getText().toString())), Toast.LENGTH_LONG).show();
                editText.setText("");
            }
        });
    }
}




