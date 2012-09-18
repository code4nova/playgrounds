package com.sarlhack.projectplay;

import android.os.Bundle;
import org.apache.cordova.*;

public class Main extends DroidGap {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // setContentView(R.layout.activity_main);
        super.loadUrl("file:///android_asset/www/index.html");
    }
}
