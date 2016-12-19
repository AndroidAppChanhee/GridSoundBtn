package com.inchanhwang.gridlayout;

import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.media.MediaPlayer;

public class MainActivity extends AppCompatActivity {

    //MediaPlayer mPlayer;

    public void playSound(View view){
        int id = view.getId();

        String ourId = "";

        ourId = view.getResources().getResourceEntryName(id);

        int resourceId = getResources().getIdentifier(ourId, "raw", "com.inchanhwang.gridlayout");

        MediaPlayer mPlayer = MediaPlayer.create(this, resourceId);
        mPlayer.start();

        Log.i("Button tapped", ourId);



    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
}
