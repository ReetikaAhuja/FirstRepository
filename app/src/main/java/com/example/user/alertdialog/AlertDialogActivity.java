package com.example.user.alertdialog;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

public class AlertDialogActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alert_dialog);

        Button btnAlert = (Button) findViewById(R.id.btnAlert);
        Button btnAlertTwoBtns = (Button) findViewById(R.id.btnAlertWithTwoBtns);
        Button btnAlertThreeBtns = (Button) findViewById(R.id.btnAlertWithThreeBtns);

        btnAlert.setOnClickListener(new View.OnClickListener() {

            public void onClick(View arg0) {
                // Creating alert Dialog with one Button

                AlertDialog alertDialog = new AlertDialog.Builder(
                        AlertDialogActivity.this).create();

                // Setting Dialog Title
                alertDialog.setTitle("Alert Dialog");

                // Setting Dialog Message
                alertDialog.setMessage("Welcome to AndroidHive.info");

                // Setting Icon to Dialog
                alertDialog.setIcon(R.drawable.tick);

                // Setting OK Button
                alertDialog.setButton("OK",
                        new DialogInterface.OnClickListener() {

                            public void onClick(DialogInterface dialog,
                                                int which) {
                                // Write your code here to execute after dialog
                                // closed
                                Toast.makeText(getApplicationContext(),
                                        "You clicked on OK", Toast.LENGTH_SHORT)
                                        .show();
                            }
                        });

                // Showing Alert Message
                alertDialog.show();

            }
        });

        /**
         * Showing Alert Dialog with Two Buttons one Positive Button with Label
         * "YES" one Negative Button with Label "NO"
         */
        btnAlertTwoBtns.setOnClickListener(new View.OnClickListener() {

            public void onClick(View arg0) {
                // Creating alert Dialog with two Buttons

                AlertDialog.Builder alertDialog = new AlertDialog.Builder(AlertDialogActivity.this);

                // Setting Dialog Title
                alertDialog.setTitle("Confirm Delete...");

                // Setting Dialog Message
                alertDialog.setMessage("Are you sure you want delete this?");

                // Setting Icon to Dialog
                alertDialog.setIcon(R.drawable.delete);

                // Setting Positive "Yes" Button
                alertDialog.setPositiveButton("YES",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog,int which) {
                                // Write your code here to execute after dialog
                                Toast.makeText(getApplicationContext(), "You clicked on YES", Toast.LENGTH_SHORT).show();
                            }
                        });
                // Setting Negative "NO" Button
                alertDialog.setNegativeButton("NO",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog,	int which) {
                                // Write your code here to execute after dialog
                                Toast.makeText(getApplicationContext(), "You clicked on NO", Toast.LENGTH_SHORT).show();
                                dialog.cancel();
                            }
                        });

                // Showing Alert Message
                alertDialog.show();

            }
        });

        /**
         * Showing Alert Dialog with Two Buttons one Positive Button with Label
         * "YES" one Neutral Button with Label "NO" one Negative Button with
         * label "Cancel"
         */
        btnAlertThreeBtns.setOnClickListener(new View.OnClickListener() {

            public void onClick(View arg0) {
                // Creating alert Dialog with three Buttons

                AlertDialog.Builder alertDialog = new AlertDialog.Builder(
                        AlertDialogActivity.this);

                // Setting Dialog Title
                alertDialog.setTitle("Save File...");

                // Setting Dialog Message
                alertDialog.setMessage("Do you want to save this file?");

                // Setting Icon to Dialog
                alertDialog.setIcon(R.drawable.save);

                // Setting Positive Yes Button
                alertDialog.setPositiveButton("YES",
                        new DialogInterface.OnClickListener() {

                            public void onClick(DialogInterface dialog,
                                                int which) {
                                // User pressed Cancel button. Write Logic Here
                                Toast.makeText(getApplicationContext(),
                                        "You clicked on YES",
                                        Toast.LENGTH_SHORT).show();
                            }
                        });
                // Setting Positive Yes Button
                alertDialog.setNeutralButton("NO",
                        new DialogInterface.OnClickListener() {

                            public void onClick(DialogInterface dialog,
                                                int which) {
                                // User pressed No button. Write Logic Here
                                Toast.makeText(getApplicationContext(),
                                        "You clicked on NO", Toast.LENGTH_SHORT)
                                        .show();
                            }
                        });
                // Setting Positive "Cancel" Button
                alertDialog.setNegativeButton("Cancel",
                        new DialogInterface.OnClickListener() {

                            public void onClick(DialogInterface dialog,
                                                int which) {
                                // User pressed Cancel button. Write Logic Here
                                Toast.makeText(getApplicationContext(),
                                        "You clicked on Cancel",
                                        Toast.LENGTH_SHORT).show();
                            }
                        });
                // Showing Alert Message
                alertDialog.show();

            }
        });
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_alert_dialog, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
