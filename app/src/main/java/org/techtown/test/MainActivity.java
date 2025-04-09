package org.techtown.test;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}

//Ctrl + Q : API 보기
//Ctrl + P : 매개변수로 넣을 수 있는 것들 목록
//입력 자리 우클릭 > Override Methods : 부모 클래스 오버라이드 메소드 자동 생성
//상단 Edit > Find > Find in Path 혹은 Ctrl + Shift + F : 코드 검색

//xml파일은 기본 디자인, 가끔 청사진으로 확인
//뷰가 가지는 속성은 레이아웃에도 있음. =상속관계
//버튼 하나 더 추가해서 테스트
//실제 단말기 연결
//오늘은 컨디션 난조로 쉬어야겠음