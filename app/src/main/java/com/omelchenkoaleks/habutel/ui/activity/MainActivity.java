package com.omelchenkoaleks.habutel.ui.activity;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.omelchenkoaleks.habutel.R;

public class MainActivity extends BaseActivity implements View.OnClickListener{

    private Button testProrgessBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        testProrgessBar = findViewById(R.id.testProgress);
        testProrgessBar.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.testProgress:
                showProgress();
                runWithDelay();
                break;
        }
    }

    // тестовый метод для выключения прогресс-бара
    private void runWithDelay() {
        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                // TODO: Выполнить с задержкой
                hideProgress();
            }
        }, 3000);
    }
}
