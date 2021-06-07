package sg.edu.rp.c346.id20008460.array;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

import sg.edu.rp.c346.id20008460.array.R;

public class MainActivity extends AppCompatActivity {

    TextView tv;
    String[] fruits;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = findViewById(R.id.textView);

        fruits = new String[3];
        fruits[0] = getString(R.string.apple);
        fruits[1] = getString(R.string.banana);
        fruits[2] = getString(R.string.cherry);

        String results="Fruits\n";
        results += "=====\n";

        for (int i = 0 ; i < fruits.length ; i ++ ) {
            results += fruits[i] + "\n";
        }

        tv.setText(results);

    }
}
