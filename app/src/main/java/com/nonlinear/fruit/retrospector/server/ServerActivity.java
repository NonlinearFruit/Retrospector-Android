package com.nonlinear.fruit.retrospector.server;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.nonlinear.fruit.retrospector.R;
import com.nonlinear.fruit.retrospector.model.RetroDbHelper;

/**
 * Created by nonfrt on 10/5/17.
 */

public class ServerActivity extends AppCompatActivity {

    private RetroDbHelper dbHelper;

    private EditText editTextAddress;
    private Button buttonConnect;
    private TextView textPort;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_server);

        dbHelper = RetroDbHelper.getInstance(this);

        editTextAddress = (EditText) findViewById(R.id.address);
        textPort = (TextView) findViewById(R.id.port);
        textPort.setText("port: " + XmlService.port);
        buttonConnect = (Button) findViewById(R.id.connect);

        buttonConnect.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                dbHelper.clear();
                XmlService.recieveDocument(editTextAddress.getText().toString(),dbHelper);
            }});

    }
}
