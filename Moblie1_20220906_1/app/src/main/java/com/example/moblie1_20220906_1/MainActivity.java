package com.example.moblie1_20220906_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = findViewById(R.id.but);//메인메모리에 생성된 버튼객체에 주고값을 반환해주는 메소드
//        Anonymous class(익명클래스) 객체
        btn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Toast t = Toast.makeText(MainActivity.this, "내일은 09월 07일 수요일입니다.", Toast.LENGTH_LONG);
                t.show();
            }
        });//btn을 누르면 ()안에 있는 메소드를 호출

    }


}