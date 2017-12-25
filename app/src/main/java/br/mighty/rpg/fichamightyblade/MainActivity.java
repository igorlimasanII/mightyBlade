package br.mighty.rpg.fichamightyblade;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);
        title = findViewById(R.id.titleText);
        Typeface custom_font = Typeface.createFromAsset(getAssets(),"fonts/CloisterBlack.ttf");
        title.setTypeface(custom_font);

    }
}
