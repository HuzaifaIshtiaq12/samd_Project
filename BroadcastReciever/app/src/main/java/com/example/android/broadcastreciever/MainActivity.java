package com.example.android.broadcastreciever;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText msg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        msg=(EditText) findViewById(R.id.debugMessage);
        BroadcastReceiver br=new BroadcastReceiver() {
            @Override
            public void onReceive(Context context, Intent intent) {
                String str=intent.getStringExtra("message");
                Toast.makeText(getApplicationContext(),str,Toast.LENGTH_LONG).show();
            }
        };
        IntentFilter filter =new IntentFilter("DEBUG_INFO");
        registerReceiver(br,filter);

    }

    public void onBtnSend(View v) {
        Intent i=new Intent();
        i.putExtra("message",msg.getText().toString());
        i.setAction("DEBUG_INFO");
        sendBroadcast(i);
    }
}
