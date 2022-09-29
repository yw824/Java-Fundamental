package techtown.org;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.content.*;
import android.net.Uri;

public class MainActivity extends AppCompatActivity {
    int REQUEST_CODE_MENU = 101;
    EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = (EditText) findViewById(R.id.editText);
        Button button = (Button) findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String data = editText.getText().toString();

                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse(data));
                startActivity(intent);
            }
        });
    }
    public void onButton1Clicked(View v) {
        Intent intent = new Intent();

        ComponentName name = new ComponentName("org.techtown.sampleintent",
                "org.techtown.sampleintent.MenuActivity");
        intent.setComponent(name);
        startActivityForResult(intent, REQUEST_CODE_MENU);
    }
}
