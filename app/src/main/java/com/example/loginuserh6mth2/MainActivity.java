package com.example.loginuserh6mth2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private EditText editEmail, editPassword;
    private TextView come, hello,forgot,hello2;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.bottom1);
        editEmail = findViewById(R.id.editText2);
        editPassword = findViewById(R.id.editText1);
        come= findViewById(R.id.text4);
        hello=findViewById(R.id.text2);
        hello2 = findViewById(R.id.text1);
        forgot = findViewById(R.id.text5);

        button.setOnClickListener(view -> {
            if (editEmail.getText().toString().equals("admin")&&
                    editPassword.getText().toString().equals("admin")){
                button.setVisibility(View.GONE);
                editEmail.setVisibility(View.GONE);
                editPassword.setVisibility(View.GONE);
                come.setVisibility(View.GONE);
                hello.setVisibility(View.GONE);
                hello2.setVisibility(View.GONE);
                forgot.setVisibility(View.GONE);


            }else {
                Toast.makeText(MainActivity.this, "Вы ввели неправильный пароль или " +
                        "логин", Toast.LENGTH_SHORT).show();
            }
        });

    }
}