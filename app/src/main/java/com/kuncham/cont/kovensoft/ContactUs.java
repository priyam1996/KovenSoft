package com.kuncham.cont.kovensoft;

import android.content.Intent;
import android.net.Uri;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class ContactUs extends AppCompatActivity {

    Button mSubmitButton;
    ImageView mFacebookLink,mGoogleLink,mYoutubeLink,mLinkedinLink,mBloggerLink;

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

        mFacebookLink = (ImageView)findViewById(R.id.facebook);
        mFacebookLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent facebookIntent = new Intent(Intent.ACTION_VIEW);
                facebookIntent.setData(Uri.parse("https://www.facebook.com/kovensoft/"));

                startActivity(Intent.createChooser(facebookIntent,getResources().getText(R.string.facebook)));
            }
        });

        mYoutubeLink = (ImageView)findViewById(R.id.youtube);
        mYoutubeLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent youtubeIntent = new Intent(Intent.ACTION_VIEW);
                youtubeIntent.setData(Uri.parse("https://www.youtube.com/channel/UCN7ht9-3QSRYD7opqzV42Zw"));
                startActivity(youtubeIntent);
            }
        });

        mGoogleLink = (ImageView)findViewById(R.id.google_plus);
        mGoogleLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent googleIntent = new Intent(Intent.ACTION_VIEW);
                googleIntent.setData(Uri.parse("https://plus.google.com/u/0/102477801303466990194"));
                startActivity(googleIntent);
            }
        });

        mLinkedinLink = (ImageView)findViewById(R.id.linkedin);
        mLinkedinLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent linkedinIntent = new Intent(Intent.ACTION_VIEW);
                linkedinIntent.setData(Uri.parse("https://www.linkedin.com/company/kovensoft/"));
                startActivity(linkedinIntent);
            }
        });

        mBloggerLink = (ImageView)findViewById(R.id.blogger);
        mBloggerLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent bloggerIntent = new Intent(Intent.ACTION_VIEW);
                bloggerIntent.setData(Uri.parse("https://kovensoft.blogspot.in/"));
                startActivity(bloggerIntent);
            }
        });

    }
}
