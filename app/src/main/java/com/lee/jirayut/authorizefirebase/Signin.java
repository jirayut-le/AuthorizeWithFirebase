package com.lee.jirayut.authorizefirebase;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;

public class Signin extends AppCompatActivity {

    private FirebaseAuth mAuth;
    TextView email;
    Button signout, newPost, viewPost;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);

        mAuth = FirebaseAuth.getInstance();
        email = (TextView) findViewById(R.id.email);
        signout = (Button) findViewById(R.id.signout);
        newPost = (Button)findViewById(R.id.newPost);
        viewPost = (Button)findViewById(R.id.viewPost);

        if(mAuth.getCurrentUser() == null){
            finish();
            startActivity(new Intent(getApplicationContext(), MainActivity.class));
        }
        email.setText(mAuth.getCurrentUser().getDisplayName());
    }

    public void signout(View v){
        mAuth.signOut();
        finish();
        startActivity(new Intent(getApplicationContext(), MainActivity.class));
    }

    public void newPost(View v){
        startActivity(new Intent( getApplicationContext(), NewPost.class));
    }

    public void viewPost(View v){
        startActivity(new Intent(getApplicationContext(), ViewPosts.class));
    }
}
