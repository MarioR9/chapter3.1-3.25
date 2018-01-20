package com.example.mroddesk.eval;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView text = findViewById(R.id.textView1);
        Button button = findViewById(R.id.button1);
        final EditText edittext = findViewById(R.id.editText1);


        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                text.setText(edittext.getText());
                int value = Integer.parseInt(edittext.getText().toString());
                boolean a= true;
                boolean b=false;

                switch(value){
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18: a:
                        text.setText("Age is between 13 and 18" + "\n" + a);
                        break;
                        default: b:
                        text.setText("Age is not between 13 and 18" + "\n" + b);
                }
            }
        });


    }
}
