package com.example.miniandroidapp08_dialog;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Toast;

import androidx.fragment.app.DialogFragment;

public class ConfirmDialogFragment extends DialogFragment {

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("タイトル");
        builder.setMessage("メッセージをここに書く");
        builder.setPositiveButton("OK", new DialogButtonClickListener());
        builder.setNegativeButton("NO", new DialogButtonClickListener());
        builder.setNeutralButton("サブ", new DialogButtonClickListener());
        AlertDialog dialog = builder.create();
        return dialog;
    }

    private class DialogButtonClickListener implements DialogInterface.OnClickListener {
        @Override
        public void onClick(DialogInterface dialog, int which) {
            String msg = "";
            switch(which) {
                case DialogInterface.BUTTON_POSITIVE:
                    msg = "OKボタンが押された";
                    break;
                case DialogInterface.BUTTON_NEGATIVE:
                    msg = "NOボタンが押された";
                    break;
                case DialogInterface.BUTTON_NEUTRAL:
                    msg = "サブがボタンが押された";
                    break;
            }
            //トーストの表示。
            Toast.makeText(getActivity(), msg, Toast.LENGTH_SHORT).show();
        }
    }

}
