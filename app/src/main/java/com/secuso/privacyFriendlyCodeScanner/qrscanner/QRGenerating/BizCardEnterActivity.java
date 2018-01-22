package com.secuso.privacyFriendlyCodeScanner.qrscanner.QRGenerating;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.secuso.privacyFriendlyCodeScanner.qrscanner.R;

public class BizCardEnterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biz_card_enter);

        final EditText qrName=(EditText) findViewById(R.id.editName);
        final EditText qrPhone=(EditText) findViewById(R.id.editPhone);
        final EditText qrMail=(EditText) findViewById(R.id.editMail);
        final EditText qrStreet=(EditText) findViewById(R.id.editStreet);
        final EditText qrCity=(EditText) findViewById(R.id.editCity);
        final EditText qrPostal=(EditText) findViewById(R.id.editPostal);
        final EditText qrTitle=(EditText) findViewById(R.id.editTilte);
        final EditText qrCompany=(EditText) findViewById(R.id.editCompany);


        Button generate=(Button) findViewById(R.id.generate);


        generate.setOnClickListener(new View.OnClickListener() {
            String result;
            @Override
            public void onClick(View v) {


                //BIZCARD:N:Sean;X:Owen;T:Software Engineer;C:Google;A:76 9th Avenue, New York, NY 10011;B:+12125551212;E:srowen@google.com;;


                result = qrName.getText().toString()+";T:"+qrTitle.getText().toString()+";C:"+qrCompany.getText().toString()+";A:"+qrStreet.getText().toString()+","+qrCity.getText().toString()+","+qrPostal.getText().toString()+";B:"+qrPhone.getText().toString()+";E:"+qrMail.getText().toString()+";;";
                Intent i = new Intent(BizCardEnterActivity.this, BizCardGnrActivity.class);
                i.putExtra("gn", result);
                startActivity(i);



            }

        });
    }
}
