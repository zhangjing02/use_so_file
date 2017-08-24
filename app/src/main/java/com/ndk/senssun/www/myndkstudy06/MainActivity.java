package com.ndk.senssun.www.myndkstudy06;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.ndk.senssun.www.zjndklibrary.NativeZJ;

public class MainActivity extends AppCompatActivity {
    private NativeZJ nativeZJ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nativeZJ=new NativeZJ();
        Log.d("Calculator", "11 + 12 =" + (nativeZJ.addition(22,12)));
        Log.d("Calculator", "11 - 12 =" + (nativeZJ.subtraction(11,34)));

    }
}
