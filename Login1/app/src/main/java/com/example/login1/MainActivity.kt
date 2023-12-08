package com.example.login1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.google.android.material.button.MaterialButton

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        TextView username =(TextView) findViewById R.id.username
        TextView password =(TextView) findViewById R.id.password

        MaterialButton loginbtn = (MaterialButton) findViewById(R.id.loginbtn)

        loginbtn.setOnclickListener(new View.OnclickListener() {
            override fun onClick(view v) {
                val username
                if (username.getText().toString().equals("admin") && password.getText().toString().equals("admin"))
                    Toast.makeText(MainActivity.this, "Login successful", Toast.LENGTH_SHORT).show()
                else
                    Toast.makeText(MainActivity.this, "Login Failed", Toast.LENGTH_SHORT).show()

            }
        })
    }
}

