package com.lxyx.habbyge;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        findViewById(R.id.textView1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("HABBYGE-MALI, textView1 onClick");
                Intent intent = new Intent(MainActivity.this, TestActivity.class);
                int y = 100; // 这些都是测试用的！！！
//                System.out.println("y: " + y);
                startActivity(intent); // 测试startActivity注入

                MainActivity.this.moveTaskToBack(false); // 测试moveTaskToBack()注入
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
        System.out.println("MainActivity onResume-1");
    }
}
