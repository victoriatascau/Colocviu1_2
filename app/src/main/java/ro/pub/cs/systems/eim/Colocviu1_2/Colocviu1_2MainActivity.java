package ro.pub.cs.systems.eim.Colocviu1_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Colocviu1_2MainActivity extends AppCompatActivity {

    private EditText nextTermEditText;
    private Button addButton;
    private TextView allTermsTextView;
    private Button computeButton;

    private class ButtonClickListener implements View.OnClickListener {
        @Override
        public void onClick (View view) {
            switch(view.getId()) {
                case R.id.add_button:
                        if (nextTermEditText.getText() != null) {
                            String number = nextTermEditText.getText().toString();
                            String all = allTermsTextView.getText().toString();
                            if (all.length() == 0) {
                                allTermsTextView.setText(number);
                            } else {
                                allTermsTextView.setText(all + " + " + number);
                            }
                        }
                    break;
            }
        }
    }
    ButtonClickListener buttonClickListener = new ButtonClickListener();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practical_test01_2_main);

        nextTermEditText = (EditText)findViewById(R.id.next_term_edit_text);
        addButton = (Button)findViewById(R.id.add_button);
        addButton.setOnClickListener(buttonClickListener);
        allTermsTextView = (TextView)findViewById(R.id.all_terms_text_view);
        computeButton = (Button)findViewById(R.id.compute_button);
        computeButton.setOnClickListener(buttonClickListener);
    }
}