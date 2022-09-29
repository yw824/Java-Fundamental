package techtown.org;

import androidx.appcompat.app.AppCompatActivity;
import android.view.*;
import android.os.Bundle;
import android.widget.*;
import android.text.TextWatcher;
import android.text.Editable;
import java.io.*;

public class Mission04 extends AppCompatActivity {

    EditText editText;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mission04);

        editText = (EditText) findViewById(R.id.edittext);
        textView = (TextView) findViewById(R.id.length);

        editText.addTextChangedListener(new TextWatcher() {

            String beforeText;
                public void beforeTextChanged(CharSequence s, int start, int count, int after) {

                    beforeText = s.toString(); // 입력하기 전에 조치
            }

            public void onTextChanged(CharSequence s, int start, int before, int count) {
            } // // 입력난에 변화가 있을 시 동시에 조치

            public void afterTextChanged(Editable s) { // 입력이 끝났을 때 조치
                int length = showBytes();
                if(length > 80) editText.setText(beforeText); // 만약 바뀌었는데 80바이트 이상이면 , 이전 그대로 설정
            }

            private int showBytes(){
                try{
                    int length = editText.getText().toString().getBytes("EUC-KR").length;
                    textView.setText(length + " / 80 바이트");
                    return length;
                }catch(UnsupportedEncodingException e){
                    e.printStackTrace();
                }
                return -1;
            }
        });
    }

    // Toast : OK
    public void onSendClicked(View v) {
        String context;
        context = editText.getText().toString();
        Toast myToast = Toast.makeText(this.getApplicationContext(), context, Toast.LENGTH_SHORT);
        myToast.show();
    }

    public void onChange(View v) {
        String context = editText.getText().toString();
        int len = context.length();
        textView.setText(len+" / 80 bytes");
    }


    // Back Button : OK
    public void onBackClicked(View v) {
        onBackPressed();
    }
}
