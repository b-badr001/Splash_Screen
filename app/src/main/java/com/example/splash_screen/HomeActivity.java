package com.example.splash_screen;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class HomeActivity extends Activity {
    TextView username;
    TextView password;
    ImageView back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("Account Informations");
        setContentView(R.layout.activity_home);
        username=findViewById(R.id.username);
        password=findViewById(R.id.password);
        back=findViewById(R.id.backHome);
        Bundle b=getIntent().getExtras();
        String usr=b.getString("username");
        String pswd=b.getString("password");
        username.setText(usr);
        password.setText(pswd);
        back.setOnClickListener(view -> {
            Intent intent = new Intent(this,MainActivity.class);
            startActivity(intent);
        });

    }
}
