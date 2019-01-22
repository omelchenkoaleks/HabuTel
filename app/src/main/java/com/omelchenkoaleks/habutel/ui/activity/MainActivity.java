package com.omelchenkoaleks.habutel.ui.activity;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.View;
import android.view.Window;

import com.omelchenkoaleks.habutel.R;
import com.omelchenkoaleks.habutel.utils.ConstantManager;
import com.omelchenkoaleks.habutel.utils.adapter.MainPageAdapter;

public class MainActivity extends BaseActivity implements View.OnClickListener{
    private static final String TAG = ConstantManager.TAG_PREFIX + "Main Activity";

    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate");

        viewPager = findViewById(R.id.viewPager);

        MainPageAdapter mainPageAdapter = new MainPageAdapter(getSupportFragmentManager());
        viewPager.setAdapter(mainPageAdapter);

        if (savedInstanceState == null) {
            showSnackbar("активити запускается впервые");
        } else {
            showSnackbar("активити уже запускалось");
        }

    }

    private void showSnackbar(String message) {
        // TODO: не работает здесь - почему???
//        Snackbar.make(coordinatorLayout, message, Snackbar.LENGTH_LONG).show();
    }

    @Override
    public void onClick(View v) {
    }

//    // тестовый метод для выключения прогресс-бара
//    private void runWithDelay() {
//        final Handler handler = new Handler();
//        handler.postDelayed(new Runnable() {
//            @Override
//            public void run() {
//                // TODO: Выполнить с задержкой
//                hideProgress();
//            }
//        }, 3000);
//    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onCreate");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart");
    }
}
