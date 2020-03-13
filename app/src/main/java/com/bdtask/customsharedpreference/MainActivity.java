package com.bdtask.customsharedpreference;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button saveButton;
    TextView titleText;
    EditText inputEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        saveButton          = findViewById(R.id.save);
        titleText           = findViewById(R.id.titleText);
        inputEditText       = findViewById(R.id.input);

        //initialize custom class
        SharedPref.init(MainActivity.this);


        //read sharedPreference value
        String value = SharedPref.read("name","");

        if (!value.isEmpty()){
            titleText.setText(value);
        }




        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String title = inputEditText.getText().toString();
                if (!title.isEmpty()){
                    titleText.setText(title);

                    //write sharedPreference value
                    SharedPref.write("name",title);

                }
            }
        });


    }
}
