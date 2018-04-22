package com.example.guenther.android_180422_sa_prep;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText inputText;
    private TextView outputText;
    private Button transferButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputText = findViewById(R.id.textInput);


        outputText = findViewById(R.id.outputText);
        transferButton = findViewById(R.id.transferButton);
        transferButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                outputText.setText(inputText.getText());
                inputText.setText("");
                Toast.makeText(getApplicationContext(), "Button wurde gedrückt!", Toast.LENGTH_LONG).show();


            }
        });


    }


}
