package in.hackdayvadodara.ganyantra;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {

    Float numberOne, numberTwo;
    EditText numberOneEditText, numberTwoEditText;
    TextView resultTextView;
    Button addButton,minusButton,multiplyButton,divideButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        InitUIElements();

    }

    public void InitUIElements(){
        numberOneEditText = (EditText) findViewById(R.id.ed1);
        numberTwoEditText = (EditText) findViewById(R.id.ed2);

        resultTextView = (TextView) findViewById(R.id.tv1);

        addButton = (Button) findViewById(R.id.add_button);

        minusButton = (Button )  findViewById(R.id.minus_button);

        multiplyButton = (Button ) findViewById(R.id.multiply_button);

        divideButton = (Button) findViewById(R.id.divide_button);

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(numberTwoEditText.getText().toString().equals("")||numberTwoEditText.getText().toString().equals("")){
                    Toast.makeText(getApplicationContext(),"Enter Both Values",Toast.LENGTH_SHORT).show();
                }else {
                    numberOne = Float.parseFloat(numberOneEditText.getText().toString());
                    numberTwo = Float.parseFloat(numberTwoEditText.getText().toString());
                    Float result = numberOne + numberTwo;
                    resultTextView.setText(""+result);
                }

            }
        });

        minusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numberOne = Float.parseFloat(numberOneEditText.getText().toString());
                numberTwo = Float.parseFloat(numberTwoEditText.getText().toString());

                Float result = numberOne - numberTwo;

                resultTextView.setText(""+result);
            }
        });

        multiplyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numberOne = Float.parseFloat(numberOneEditText.getText().toString());
                numberTwo = Float.parseFloat(numberTwoEditText.getText().toString());

                Float result = numberOne * numberTwo;

                resultTextView.setText(""+result);
            }
        });

        divideButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numberOne = Float.parseFloat(numberOneEditText.getText().toString());
                numberTwo = Float.parseFloat(numberTwoEditText.getText().toString());

                Float result = numberOne / numberTwo;

                resultTextView.setText(""+result);
            }
        });
    }
}
