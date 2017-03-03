package com.example.hpkorisnik.myfirstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    EditText editText1;
    EditText editText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView)findViewById(R.id.textView);
        textView.setText("0");

        editText1 = (EditText)findViewById(R.id.editText1);
        editText2 = (EditText)findViewById(R.id.editText2);

        Button button = (Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // take
                /*
                int n = Integer.parseInt(textView.getText().toString());
                textView.setText("" + (++n));
                if (n % 10 == 0) {
                    Toast.makeText(MainActivity.this, "" + n, Toast.LENGTH_SHORT).show();
                }
                //textView.setText(R.string.app_name); MyFirstApp
                */
                String text1 = editText1.getText().toString();
                String text2 = editText2.getText().toString();

                if (!(  text1.matches("")) || ( text2.matches(""))) {
                    if ( isNumber(text1) && (isNumber(text2))) {
                        int result = Integer.parseInt(text1)+Integer.parseInt(text2);
                        textView.setText("" + result);
                    }
                    else {
                        Toast.makeText(MainActivity.this, "Type numbers only!", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
        
    }

    private boolean isNumber(String string) {
        try {
            Integer.parseInt(string);
        }
        catch (Exception e) {
            return false;
        }
        return true;
    }
}
