package techtown.org;

import java.io.File;
import androidx.appcompat.app.AppCompatActivity;

import android.content.ActivityNotFoundException;
import android.os.Environment;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import android.net.Uri;02.
import android.content.Intent;

public class MainActivity extends AppCompatActivity {
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = (EditText) findViewById(R.id.editText);
    }

    public void onButton1Clicked(View v) {
        String filename = editText.getText().toString(); // 입력상자에 입력된 파일명 확인
        if(filename.length() > 0) {
            openPDF(filename.trim()); // openPDF 메소드 오픈
        } else {
            Toast.makeText(getApplicationContext(), "PDF 파일명을 입력하세요.", Toast.LENGTH_LONG).show();
        }
    }

    public void openPDF(String filename) { // PDF 파일 열기 기능을 정의한 메소드

        // Enririonment.getExternalStorageDirectory().getAbsolutePath() : SDCard 의 주소
        String sdcardFolder = Environment.getExternalStorageDirectory().getAbsolutePath();
        String filepath = sdcardFolder + File.separator + filename;
        File file = new File(filepath);

        if(file.exists()) {
            Uri uri = Uri.fromFile(file); // URI 객체로 생성 , Intent 객체의 setDataAndType 함수를 사용하기 위해

            Intent intent = new Intent(Intent.ACTION_VIEW); // ACTION_VIEW 액션을 가지는 인텐트 생성
            intent.setDataAndType(uri, "application/pdf"); // Uri 객체와 MIME 타입 지정

            try {
                startActivity(intent); // 액티비티 띄우기
            } catch(ActivityNotFoundException e) {
                Toast.makeText(this, "PDF 실행을 위한 뷰어 앲이 없습니다.", Toast.LENGTH_LONG).show();
            }
        } else {
            Toast.makeText(this, "PDF 파일이 없습니다.", Toast.LENGTH_LONG).show();
        }
    }
}
