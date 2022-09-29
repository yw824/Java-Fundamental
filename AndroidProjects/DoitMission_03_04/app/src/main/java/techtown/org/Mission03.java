package techtown.org;

import androidx.appcompat.app.AppCompatActivity;
import android.view.*;
import android.widget.*;
import android.os.Bundle;
import android.content.res.Resources;
import android.graphics.drawable.*;

public class Mission03 extends AppCompatActivity {

    int i ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mission03);
        i = 0;
    }

    public void onButtonClicked(View v) {

        ImageView imageView1;
        ImageView imageView2;
        BitmapDrawable bitmap1;
        BitmapDrawable bitmap2;
        Resources res = getResources();

        imageView1 = (ImageView) findViewById(R.id.imageView3);
            imageView2 = (ImageView) findViewById(R.id.imageView4);
            bitmap1 = (BitmapDrawable) res.getDrawable(R.drawable.image01);
            bitmap2 = (BitmapDrawable) res.getDrawable(R.drawable.image02);

            if( i == 0 ) {
                i = 1 ;

                imageView1.setImageDrawable(bitmap2);
                imageView2.setImageDrawable(bitmap1);

            } else {
                i = 0 ;
                imageView1.setImageDrawable(bitmap1);
          imageView2.setImageDrawable(bitmap2);

        }
    }
}