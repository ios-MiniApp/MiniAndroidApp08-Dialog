package com.example.miniandroidapp08_dialog;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.bt_dialog);
        DialogListener dialogListener = new DialogListener();
        button.setOnClickListener(dialogListener);

    }

    private class DialogListener implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            ConfirmDialogFragment dialogFragment = new ConfirmDialogFragment();
            dialogFragment.show(getSupportFragmentManager(), "ConfirmDialogFragment");
        }
    }

}