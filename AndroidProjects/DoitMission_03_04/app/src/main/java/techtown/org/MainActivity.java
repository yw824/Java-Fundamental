package techtown.org;

import androidx.appcompat.app.AppCompatActivity;
import android.view.*;
import android.content.*;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButton1Clicked(View v) {
        Intent intent = new Intent(getApplicationContext(), Mission03.class);
        startActivity(intent);
    }

    public void onButton2Clicked(View v) {
        Intent intent = new Intent(getApplicationContext(), Mission04.class);
        startActivity(intent);
    }
}
