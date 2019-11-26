package modanov.test.testproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void OnConvertClick(View click) {
        EditText input_text=(EditText)findViewById(R.id.editText);
        TextView result = (TextView)findViewById(R.id.resultField);
        String text = input_text.getText().toString();
        if (!text.matches("")) {
            float num = Float.parseFloat(input_text.getText().toString());
            num *= 1.61;
            result.setText(Float.toString(num));
        }
    }
}
