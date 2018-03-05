package com.kuncham.cont.kovensoft;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ContactUs extends AppCompatActivity {

    Button mSubmitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_us);

        mSubmitButton = (Button)findViewById(R.id.bt_submit);

        mSubmitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                EditText et_message = (EditText)findViewById(R.id.your_message);

                EditText et_subject = (EditText)findViewById(R.id.your_subject);

                String s_message = et_message.getText().toString();
                String s_subject = et_subject.getText().toString();

                Intent sendIntent = new Intent();
                sendIntent.setAction(Intent.ACTION_SEND);
                sendIntent.setPackage("com.google.android.gm");
                sendIntent.putExtra(Intent.EXTRA_TEXT,s_message);
                sendIntent.putExtra(Intent.EXTRA_SUBJECT,s_subject);
                sendIntent.putExtra(Intent.EXTRA_EMAIL ,new String[]{"cdastagirireddy@gmail.com"});
                sendIntent.setType("text/plain");
                startActivity(Intent.createChooser(sendIntent, getResources().getText(R.string.send_to)));




            }
        });
    }
}
