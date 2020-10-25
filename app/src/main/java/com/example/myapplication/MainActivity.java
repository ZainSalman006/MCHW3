package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    RadioGroup radioGroup;
    RadioGroup radioGroup2;
    RadioButton radioButton;
    RadioButton radioButton2;
    CheckBox c1;
    CheckBox c2;
    CheckBox c3;
    CheckBox c4;

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup = findViewById(R.id.radioGroup);
        radioGroup2 = findViewById(R.id.radioGroup2);
        c1=findViewById(R.id.checkBox);
        c2=findViewById(R.id.checkBox2);
        c3=findViewById(R.id.checkBox3);
        c4=findViewById(R.id.checkBox4);


        textView = findViewById(R.id.textViewResults);
    }

    public void Selection(View view) {

        int checked = radioGroup.getCheckedRadioButtonId();
        int checked2 = radioGroup2.getCheckedRadioButtonId();

        Intent intent = new Intent(getApplicationContext(), Second_activity.class);

        radioButton = findViewById(checked);
        radioButton2 = findViewById(checked2);

        textView.setText(radioButton.getText() + "  "+radioButton2.getText()  );

        intent.putExtra("R1", radioButton.getText());
        intent.putExtra("R2", radioButton2.getText());

        if(c1.isChecked())
        {
            textView.setText(textView.getText() + "  "+c1.getText()  );
            intent.putExtra("rb1", c1.getText());
        }
        if(c2.isChecked())
        {
            textView.setText(textView.getText() + "  "+c2.getText()  );
            intent.putExtra("rb2", c2.getText());
        }
        if(c3.isChecked())
        {
            textView.setText(textView.getText() + "  "+c3.getText()  );
            intent.putExtra("rb3", c3.getText());
        }
        if(c4.isChecked())
        {
            textView.setText(textView.getText() + "  "+c4.getText()  );
            intent.putExtra("rb4", c4.getText());
        }


        startActivity(intent);

    }

}