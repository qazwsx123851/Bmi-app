package com.example.oolong.bmi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //找出Button元件
        Button btn =(Button) findViewById(R.id.button);
        //註冊傾聽者物件
        btn.setOnClickListener(listener);
    }
    //建立傾聽者物件
    View.OnClickListener listener=
            new View.OnClickListener(){
                public  void onClick(View v){
                    double height,weight,bmi;
                    //取得輸入值
                    EditText txtheight=
                            (EditText) findViewById(R.id.editText);
                    EditText txtWeight=
                            (EditText) findViewById(R.id.editText2);
                    height = Double.parseDouble(txtheight.getText().toString());
                    weight = Double.parseDouble(txtWeight.getText().toString());
                    height=height/100.00;
                    bmi= weight/(height*height);
                    //計算bmi
                    TextView output =
                            (TextView) findViewById(R.id.lbloutput);
                    output.setText(Double.toString(bmi));
                }
            };
}
