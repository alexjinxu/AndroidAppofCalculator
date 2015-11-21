package com.example.alex.myapplicationt3;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.*;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.*;
import android.widget.Button;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {

    String str="";
    EditText et;
    int flag =0, flagpow=0, flagm=0;
    double x=0.0, y=0.0 , r=0.0,ms=0.0;

    View vi;
    CalculaterChart c= CalculaterChart.EQ;

    Button btn0 =null;
    Button btn1=null;
    Button btn2=null;
    Button btn3=null;
    Button btn4=null;
    Button btn5=null;
    Button btn6=null;
    Button btn7=null;
    Button btn8=null;
    Button btn9=null;
    Button btnBak=null;
    Button btnMC=null;
    Button btnMA=null;
    Button btnMR=null;
    Button btnMS=null;
    Button btnCE=null;
    Button btnC=null;
    Button btnAdd=null;
    Button btnSub=null;
    Button btnMul=null;
    Button btnDiv=null;
    Button btnEqu=null;
    Button btndot=null;
    Button btnHead=null;
    Button btnCOS=null;
    Button btnSIN=null;
    Button btnPOW=null;

    TextView tvResult=null;

    enum CalculaterChart {
        ADD, SUB, DIV,MUL,EQ
    }


    public double calculater(){
        switch(c){
            case EQ:r=y;break;
            case ADD:r=x+y;break;
            case SUB:r=x-y;break;
            case MUL:r=x*y;break;
            case DIV:r=x/y;break;
        }

        x=r;
        c=CalculaterChart.EQ;

        return r;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);




        btn0=(Button)findViewById(R.id.btn0);
        btn1=(Button)findViewById(R.id.btn1);
        btn2=(Button)findViewById(R.id.btn2);
        btn3=(Button)findViewById(R.id.btn3);
        btn4=(Button)findViewById(R.id.btn4);
        btn5=(Button)findViewById(R.id.btn5);
        btn6=(Button)findViewById(R.id.btn6);
        btn7=(Button)findViewById(R.id.btn7);
        btn8=(Button)findViewById(R.id.btn8);
        btn9=(Button)findViewById(R.id.btn9);
        btnCE=(Button)findViewById(R.id.btnCE);
        btnC=(Button)findViewById(R.id.btnC);
        btnDiv=(Button)findViewById(R.id.btnDiv);
        btnEqu=(Button)findViewById(R.id.btnEqu);
        btnMul=(Button)findViewById(R.id.btnMul);
        btnAdd=(Button)findViewById(R.id.btnAdd);
        btnSub=(Button)findViewById(R.id.btnSub);
        btndot=(Button)findViewById(R.id.btndot);
        btnHead=(Button)findViewById(R.id.btnHead);
        btnBak=(Button)findViewById(R.id.btnBak);
        btnMC=(Button)findViewById(R.id.btnMC);
        btnMA=(Button)findViewById(R.id.btnMA);
        btnMR=(Button)findViewById(R.id.btnMR);
        btnMS=(Button)findViewById(R.id.btnMS);
        btnSIN=(Button)findViewById(R.id.btnSIN);
        btnCOS=(Button)findViewById(R.id.btnCOS);
        btnPOW=(Button)findViewById(R.id.btnPOW);

        et=(EditText) findViewById(R.id.textView1);
        et.setText(str);

        btnMS.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                if (str != "") {
                    ms = Double.parseDouble(str);
                    flagm = 1;
                    str="";
                    et.setText(str);
                }
                vi =v;

            }
        });
        btnMR.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                if (flagm == 1) {
                    if( ms == (int)ms )
                    {
                        str = ""+ (int)ms;
                    }
                    else {
                        str = "" + ms;
                    }
                    et.setText(str);
                }
                vi=v;
            }
        });

        btnMC.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                if (flagm == 1) {
                    ms =0.0;
                    flagm =0;
                    str="";
                    et.setText(str);
                }

                vi=v;
            }
        });

        btnMA.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                if(str !="") {
                    double ta = Double.parseDouble(str);
                    ms += ta;
                    if(flagm ==0) flagm =1;
                    if( ms == (int)ms )
                    {
                        str = ""+ (int)ms;
                    }
                    else {
                        str = "" + ms;
                    }
                    et.setText(str);

                }
                vi=v;
            }
        });

        btnAdd.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                if (str != "") {
                    if (vi == btnAdd || vi == btnSub || vi == btnMul || vi == btnDiv) {
                        c = CalculaterChart.ADD;
                    } else {
                        y = Double.parseDouble(str);
                        calculater();
                        if( r == (int)r )
                        {
                            str = ""+ (int)r;
                        }
                        else {
                            str = "" + r;
                        }
                        et.setText(str);
                        c = CalculaterChart.ADD;
                        flag = 1;
                        vi = v;
                    }
                }
            }
        });


        btnSub.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                if(str!=""){
                    if (vi == btnAdd || vi == btnSub || vi == btnMul || vi == btnDiv) {
                        c=CalculaterChart.SUB;
                    }

                    else{
                        y=Double.parseDouble(str);
                        calculater();
                        if( r == (int)r )
                        {
                            str = ""+ (int)r;
                        }
                        else {
                            str = "" + r;
                        }
                        et.setText(str);
                        c=CalculaterChart.SUB;
                        flag=1;
                        vi=v;
                    }}
            }
        });


        btnMul.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                if (str != "") {
                    if (vi == btnAdd || vi == btnSub || vi == btnMul || vi == btnDiv) {
                        c = CalculaterChart.MUL;
                    } else {
                        y = Double.parseDouble(str);
                        calculater();
                        if( r == (int)r )
                        {
                            str = ""+ (int)r;
                        }
                        else {
                            str = "" + r;
                        }
                        et.setText(str);
                        c = CalculaterChart.MUL;
                        flag = 1;
                        vi = v;
                    }
                }
            }
        });


        btnDiv.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                if (str != "") {
                    if (vi == btnAdd || vi == btnSub || vi == btnMul || vi == btnDiv) {
                        c = CalculaterChart.DIV;
                    } else {
                        y = Double.parseDouble(str);
                        calculater();
                        if( r == (int)r )
                        {
                            str = ""+ (int)r;
                        }
                        else {
                            str = "" + r;
                        }
                        et.setText(str);
                        c = CalculaterChart.DIV;
                        flag = 1;
                        vi = v;
                    }
                }
            }
        });

        btnEqu.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                if (str != "" && vi != btnAdd && vi != btnSub && vi != btnMul && vi != btnDiv && flagpow == 0) {
                    y = Double.parseDouble(str);
                    calculater();
                   /* str = "" + r;*/
                    if( r == (int)r )
                    {
                        str = ""+ (int)r;
                    }
                    else {
                        str = "" + r;
                    }
                    et.setText(str);
                    flag = 1;
                    vi = v;

                }else if(str != "" && vi != btnPOW && flagpow ==1){
                    x =Double.parseDouble(str);
                    r = Math.pow(y, x);
                    if( r == (int)r )
                    {
                        str = ""+ (int)r;
                    }
                    else {
                        str = "" + r;
                    }
                    et.setText(str);
                    flag = 1;
                    flagpow =0;
                    vi=v;
                }
            }
        });

        btndot.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                if(str==""){
                    str+=".";
                    et.setText(str);
                }
                else{
                    char ch1[];int x=0;
                    ch1=str.toCharArray();
                    for(int i=0;i<ch1.length;i++)
                        if(ch1[i]=='.')
                            x++;
                    if(x==0){
                        str+=".";
                        et.setText(str);
                    }
                }

            }
        });


        btnCE.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                str = "";
                et.setText(str);
                vi = v;

            }
        });

        btnC.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                x = 0.0;
                c = CalculaterChart.EQ;
                y = 0.0;
                str = "";
                et.setText(str);

            }
        });
        btnHead.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                if (vi != btndot && str != "") {
                    char ch = str.charAt(0);
                    if (ch == '-')
                        str = str.replace("-", "");
                    else
                        str = "-" + str;
                    et.setText(str);
                }
            }
        });

        btnBak.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                if ( str != "" && vi != btnAdd && vi != btnSub && vi != btnMul && vi != btnDiv && vi != btnEqu) {
                    char ch[];
                    ch = str.toCharArray();
                    if (ch.length != 0)
                        str = str.substring(0,ch.length-1);

                    et.setText(str);
                }
                else
                    et.setText(str);
            }
        });


        btnCOS.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                if (str != "") {
                    double a=Double.parseDouble(str);
                    str = Math.cos(a) + "";
                    et.setText(str);
                }
            }
        });

        btnSIN.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                if (str != "") {
                    double a=Double.parseDouble(str);
                    str = Math.sin(a) + "";
                    et.setText(str);
                }
            }
        });

        btnPOW.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                if (str != "" ) {
                    y =Double.parseDouble(str);
                   str="";
                    et.setText(str);
                    flagpow =1;
                    vi =v;
                }
            }
        });
        // The Number button [0~9] display on the Test view
        btn0.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                if (flag == 1) {
                    str = "";
                    str += 0;
                    et.setText(str);
                    flag = 0;
                } else {
                    char ch1[];
                    ch1 = str.toCharArray();
                    if (!(ch1.length == 1 && ch1[0] == '0')) {
                        str += 0;
                        et.setText(str);
                    }

                }
                vi = v;
            }


        });

        btn1.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                if(flag==1){
                    str="";
                    str+=1;
                    et.setText(str);
                    flag=0;
                }
                else{
                    str+=1;
                    et.setText(str);
                }
                vi=v;
            }


        });

        btn2.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                if(flag==1){
                    str="";
                    str+=2;
                    et.setText(str);
                    flag=0;
                }
                else{
                    str+=2;
                    et.setText(str);
                }
                vi=v;
            }


        });


        btn3.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                if(flag==1){
                    str="";
                    str+=3;
                    et.setText(str);
                    flag=0;
                }
                else{
                    str+=3;
                    et.setText(str);
                }
                vi=v;
            }


        });

        btn4.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                if(flag==1){
                    str="";
                    str+=4;
                    et.setText(str);
                    flag=0;
                }
                else{
                    str+=4;
                    et.setText(str);
                }
                vi=v;
            }


        });

        btn5.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                if(flag==1){
                    str="";
                    str+=5;
                    et.setText(str);
                    flag=0;
                }
                else{
                    str+=5;
                    et.setText(str);
                }
                vi=v;
            }


        });


        btn6.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                if(flag==1){
                    str="";
                    str+=6;
                    et.setText(str);
                    flag=0;
                }
                else{
                    str+=6;
                    et.setText(str);
                }
                vi=v;
            }


        });


        btn7.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                if(flag==1){
                    str="";
                    str+=7;
                    et.setText(str);
                    flag=0;
                }
                else{
                    str+=7;
                    et.setText(str);
                }
                vi=v;
            }


        });


        btn8.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                if(flag==1){
                    str="";
                    str+=8;
                    et.setText(str);
                    flag=0;
                }
                else{
                    str+=8;
                    et.setText(str);
                }
                vi=v;
            }


        });

        btn9.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                if(flag==1){
                    str="";
                    str+=9;
                    et.setText(str);
                    flag=0;
                }
                else{
                    str+=9;
                    et.setText(str);
                }
                vi=v;
            }


        });


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();







            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
