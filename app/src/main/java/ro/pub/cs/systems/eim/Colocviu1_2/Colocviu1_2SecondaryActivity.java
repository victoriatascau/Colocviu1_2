package ro.pub.cs.systems.eim.Colocviu1_2;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class Colocviu1_2SecondaryActivity extends AppCompatActivity {

    private TextView allTermsTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practical_test01_2_main);

        allTermsTextView = (TextView)findViewById(R.id.all_terms_text_view);

        Intent intent = getIntent();
        if (intent != null && intent.getExtras().containsKey(Constants.SUM)) {
            String sumString = intent.getStringExtra(Constants.SUM);
            String[] s = sumString.split(" \\+ ");
            Integer sum = 0;
            for (int i = 0; i < s.length; i++) {
                sum += Integer.parseInt(s[i]);
            }

            Intent intentParent = new Intent(getApplicationContext(), Colocviu1_2MainActivity.class);
            intentParent.putExtra(Constants.RESULT, sum);
            setResult(RESULT_OK, intentParent);
            finish();
        }
    }
}
