package com.omelchenkoaleks.habutel.ui.activity;

import android.app.ProgressDialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;

import com.omelchenkoaleks.habutel.R;

public class BaseActivity extends AppCompatActivity {
    static final String TAG = "BaseActivity";
    protected ProgressDialog progressDialog;

    // показать загрузчик
    public void showProgress() {
        if (progressDialog == null) {
            progressDialog = new ProgressDialog(this, R.style.custom_dialog);
            progressDialog.setCancelable(false);
            progressDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
            progressDialog.show();
            progressDialog.setContentView(R.layout.progress_splash);
        } else {
            progressDialog.show();
            progressDialog.setContentView(R.layout.progress_splash);
        }
    }

    // спрятать загрузчик
    public void hideProgress() {
        if (progressDialog != null) {
            if (progressDialog.isShowing()) {
                progressDialog.hide();
            }
        }
    }

    //
    public void showError(String message, Exception error) {
        showToast(message);
        Log.e(TAG, String.valueOf(error));
    }

    public void showToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_LONG);
    }
}
