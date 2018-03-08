package com.lee.jirayut.authorizefirebase;

import android.app.ProgressDialog;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.firebase.client.Firebase;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.storage.StorageReference;

public class NewPost extends AppCompatActivity {

    private Button selectImg, post;
    private ImageView imageView;
    private TextView titleTxt;

    public static final int READ_EXTERNAL_STORAGE = 0;
    private static final int GALLERY_INTENT = 2;
    private ProgressDialog mProgressDialog;
    private Firebase mRootRef;
    private Uri mImageUri = null;
    private DatabaseReference mDatabaseRef;
    private StorageReference mStorage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_post);

        selectImg = findViewById(R.id.selectImage);
        post = findViewById(R.id.post);
        imageView = findViewById(R.id.imageView);
        titleTxt = findViewById(R.id.titleTxt);
    }
}
