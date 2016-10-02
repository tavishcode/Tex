package com.tex.texandroid;

/**
 * Created by Shayan on 18-Sep-16.
 */
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;

public class AlertDFragment extends DialogFragment {

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        Bundle bundle = this.getArguments();
        String title = bundle.getString("bookname", "lolufail");
        String amount = bundle.getString("cc", "lolufailagain");
        String price = bundle.getString("price", "lolufailagain");


        if(!amount.equals("pls git gud")) {
            return new android.support.v7.app.AlertDialog.Builder(getActivity())
                    // Set Dialog Icon
                    //.setIcon(R.mipmap.ic_launcher)
                    // Set Dialog Title
                    .setTitle(title)
                    // Set Dialog Message
                    .setMessage("Amount to be transferred: HK$" + amount)
                    .create();
        }
        else{
            return new android.support.v7.app.AlertDialog.Builder(getActivity())
                    // Set Dialog Icon
                    //.setIcon(R.mipmap.ic_launcher)
                    // Set Dialog Title
                    .setTitle(title)
                    // Set Dialog Message
                    .setMessage("Please try again")

                    // Positive button
                    .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            // Do something else
                        }
                    }).create();
        }
    }
}
