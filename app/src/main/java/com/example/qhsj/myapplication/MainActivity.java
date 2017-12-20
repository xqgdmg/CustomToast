package com.example.qhsj.myapplication;

import android.os.Looper;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         // 子线程中显示Toast的问题
        /*new Thread(new Runnable() {
            @Override
            public void run() {
                Looper.prepare();//不写这个，报错 --> Can't create handler inside thread that has not called Looper.prepare()
                Toast.makeText(MainActivity.this,"aaaaa",Toast.LENGTH_LONG).show();
                Looper.loop(); // 不写这个，Toast不显示
            }
        }).start();*/

         // 自定义Toast
//        在主线程中：
        CustomToast.makeText(MainActivity.this, "这是我的toast1111", CustomToast.LENGTH_SHORT).show();

//        在子线程中：
        /*new Thread(new Runnable() {
            @Override
            public void run() {
                Looper.prepare();
                CustomToast.makeText(MainActivity.this, "这是我的toast2222", CustomToast.LENGTH_SHORT).show();
                Looper.loop();
            }
        }).start();*/


    }
}
