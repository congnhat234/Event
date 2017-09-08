package com.gameloft.congnhat.event;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn2 = (Button) findViewById(R.id.btn2);
        btn2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View arg0){
                EditText edtA = (EditText)findViewById(R.id.edt_a);
                EditText edtB = (EditText)findViewById(R.id.edt_b);
                if(!edtA.getText().toString().isEmpty() && !edtB.getText().toString().isEmpty()){
                    int a = Integer.parseInt(edtA.getText() + "");
                    int b = Integer.parseInt(edtB.getText() + "");
                    TextView result = (TextView) findViewById(R.id.result);
                    result.setText(a + b + "");
                } else {
                    Toast.makeText(MainActivity.this, "Vui lòng nhập số!", Toast.LENGTH_SHORT).show();
                }
            }
        });
        Button btn3 = (Button) findViewById(R.id.btn3);
        btn3.setOnClickListener(this);
    }
        public void btn_tong(View v){
            EditText edtA = (EditText)findViewById(R.id.edt_a);
            EditText edtB = (EditText)findViewById(R.id.edt_b);
            if(!edtA.getText().toString().isEmpty() && !edtB.getText().toString().isEmpty()){
                int a = Integer.parseInt(edtA.getText() + "");
                int b = Integer.parseInt(edtB.getText() + "");
                TextView result = (TextView) findViewById(R.id.result);
                result.setText(a + b + "");
            } else {
                Toast.makeText(MainActivity.this, "Bạn chưa nhập số!", Toast.LENGTH_SHORT).show();
            }
    }

    @Override
    public void onClick(View view) {
        EditText edtA = (EditText)findViewById(R.id.edt_a);
        EditText edtB = (EditText)findViewById(R.id.edt_b);
        if(!edtA.getText().toString().isEmpty() && !edtB.getText().toString().isEmpty()){
            int a = Integer.parseInt(edtA.getText() + "");
            int b = Integer.parseInt(edtB.getText() + "");
            TextView result = (TextView) findViewById(R.id.result);
            result.setText(a + b + "");
        } else {
            Toast.makeText(MainActivity.this, "Bạn chưa nhập số!", Toast.LENGTH_SHORT).show();
        }
    }
}
