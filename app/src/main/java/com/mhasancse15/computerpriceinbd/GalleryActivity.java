package com.mhasancse15.computerpriceinbd;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;


public class GalleryActivity extends AppCompatActivity {

    private static final String TAG = "GalleryActivity";
    private String imageName, imageUrl,imageDescription;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.details);
        Log.d(TAG, "onCreate: started.");

        getIncomingIntent();

        getSupportActionBar().setTitle(imageName);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    private void getIncomingIntent() {
        Log.d(TAG, "getIncomingIntent: checking for incoming intents.");

        if (getIntent().hasExtra("image_url") && getIntent().hasExtra("image_name")&& getIntent().hasExtra("image_description")) {
            Log.d(TAG, "getIncomingIntent: found intent extras.");

            imageUrl = getIntent().getStringExtra("image_url");
            imageName = getIntent().getStringExtra("image_name");
            imageDescription = getIntent().getStringExtra("image_description");

            setImage(imageUrl, imageName,imageDescription);
        }
    }


    private void setImage(String imageUrl, String imageName,String imageDescription) {
        Log.d(TAG, "setImage: setting te image and name to widgets.");

        TextView name = findViewById(R.id.imageTitle);
        TextView descrbtion = findViewById(R.id.image_description);
        name.setText(imageName);
        descrbtion.setText(imageDescription);

        ImageView image = findViewById(R.id.image);
        Glide.with(this)
                .asBitmap()
                .load(imageUrl)
                .into(image);
    }

    // Back Button Work
    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }

}
