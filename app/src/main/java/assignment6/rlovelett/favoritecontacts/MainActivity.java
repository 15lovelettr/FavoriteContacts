package assignment6.rlovelett.favoritecontacts;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //String string1 = getString(R.string.phone1);
    //String string2 = getString(R.string.phone2);
    //String string3 = getString(R.string.phone3);
    TextView contactName1, contactName2, contactName3, phone1, phone2, phone3;
    Button btnCall1, btnCall2, btnCall3, btnText1, btnText2, btnText3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        contactName1 = (TextView) findViewById(R.id.textView1);
        contactName2 = (TextView) findViewById(R.id.textView2);
        contactName3 = (TextView) findViewById(R.id.textView3);
        phone1 = (TextView) findViewById(R.id.textView4);
        phone2 = (TextView) findViewById(R.id.textView5);
        phone3 = (TextView) findViewById(R.id.textView6);

        setUpButtonClickEvents();
    }

    public void setUpButtonClickEvents(){
        /**
         * Set up button click event for initiating a phone call to contact 1.
         */

        btnCall1 = (Button) findViewById(R.id.buttonCall1);
        btnCall1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:" + phone1.getText()));
                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);
                }
            }

        });

        /**
         * Set up button click event for initiating a phone call to contact 2.
         */
        btnCall2 = (Button) findViewById(R.id.buttonCall2);
        btnCall2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:" + phone2.getText()));
                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);
                }
            }

        });

        /**
         * Set up button click event for initiating a phone call to contact 3.
         */
        btnCall3 = (Button) findViewById(R.id.buttonCall3);
        btnCall3.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:" + phone3.getText()));
                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);
                }
            }

        });

        /**
         * Set up button click event for sending a text message to contact 1.
         */
        btnText1 = (Button) findViewById(R.id.buttonText1);
        btnText1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("sms:" + phone1.getText()));
                intent.putExtra("sms_body", "Hi");
                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);
                }
            }

        });

        /**
        * Set up button click event for sending a text message to contact 2.
        */
        btnText2 = (Button) findViewById(R.id.buttonText2);
        btnText2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("sms:" + phone2.getText()));
                intent.putExtra("sms_body", "Hi");
                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);
                }
            }

        });

        /**
         * Set up button click event for sending a text message to contact 3.
         */
        btnText3 = (Button) findViewById(R.id.buttonText3);
        btnText3.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("sms:" + phone3.getText()));
                intent.putExtra("sms_body", "Hi");
                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);
                }
            }

        });
    }
}
