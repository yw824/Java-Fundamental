package techtown.org;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode == REQUEST_CODE_MENU) {
            Toast.makeText(getApplicationContext(), "onActivityResult 메소드 호출됨, 요청 코드 :" + requestCode +
                    "결과 코드 : " + resultCode, Toast.LENGTH_LONG);

            if(resultCode == RESULT_OK) {
                String name = data.getExtras().getString("name");
                Toast.makeText(getApplicationContext(), "응답으로 전달된 name : " + name, Toast.LENGTH_LONG).show();
            }
        }
    }

    public static final int REQUEST_CODE_MENU = 101;
    // 다른 액티비티를 띄우기 위한 요청코드 정의

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
        }

        public void OnButton1Clicked(View v) {
            Intent intent = new Intent(getApplicationContext(), MenuActivity.class);
        // 또다른 액티비티를 띄우기 위한 인텐트 생성 , 시작점과 도착점 설정

        startActivityForResult(intent, REQUEST_CODE_MENU);
        // 액티비티 띄우기
    }

}
