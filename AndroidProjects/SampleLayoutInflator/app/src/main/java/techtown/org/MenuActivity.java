package techtown.org;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.*;
import android.view.View;

public class MenuActivity extends AppCompatActivity {

    LinearLayout container;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        container = (LinearLayout) findViewById(R.id.container);
        Button button = (Button) findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) { // LayoutInflater : https://www.crocus.co.kr/1584
               LayoutInflater inflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
               inflater.inflate(R.layout.sub1, container, true);

               CheckBox checkBox = (CheckBox) container.findViewById(R.id.checkBox);
               checkBox.setText("로딩되었어요");
           }
        });
    }
}
