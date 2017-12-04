package in.hackdayvadodara.ganyantra;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class CalculateAcitivity extends AppCompatActivity {

    TextView resultTextView,summuryTextView,divideTextView,multiplyTextView,MinusTextView,plusTextView;
    TextView clearTextView,plusMinusTextView,percentageTextView,equalToTextView,nineTextView;
    TextView eightTextView,sevenTextview,sixTextView,fiveTextView,fourTextView,threeTextView,twoTextView,oneTextView;
    TextView doubleZeroTextView,zeroTextView,pointTextView;

    String tempString = "";
    float tempNumber = 0.0f;

    List<Float> numbers = new ArrayList<>();
    List<String> operation = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculate);

        InitUiElements();
        InitFont();
        InitSetOnClickListners();

    }

    public void InitUiElements(){

                resultTextView = (TextView) findViewById(R.id.resultTx);
                summuryTextView = (TextView) findViewById(R.id.summaryTx);
                divideTextView = (TextView) findViewById(R.id.divideTx);
                multiplyTextView = (TextView) findViewById(R.id.multiplyTx);
                MinusTextView= (TextView) findViewById(R.id.minusTx);
                plusTextView= (TextView) findViewById(R.id.plusTx);

                clearTextView  = (TextView) findViewById(R.id.clear);
                plusMinusTextView = (TextView) findViewById(R.id.plusminusTx);
                percentageTextView= (TextView) findViewById(R.id.percentageTx);
                equalToTextView= (TextView) findViewById(R.id.equalsTx);
                nineTextView= (TextView) findViewById(R.id.nineTx);

                eightTextView = (TextView) findViewById(R.id.eightTx);
                sevenTextview= (TextView) findViewById(R.id.sevenTx);
                sixTextView= (TextView) findViewById(R.id.sixTX);
                fiveTextView= (TextView) findViewById(R.id.fiveTx);
                fourTextView= (TextView) findViewById(R.id.fourTx);
                threeTextView= (TextView) findViewById(R.id.threeTx);
                twoTextView = (TextView) findViewById(R.id.twoTx);
                oneTextView= (TextView) findViewById(R.id.oneTx);

                doubleZeroTextView = (TextView) findViewById(R.id.doublezeroTx);
                zeroTextView= (TextView) findViewById(R.id.zeroTx);
                pointTextView= (TextView) findViewById(R.id.dotTx);

    }

    public void InitFont(){

        Typeface customTypeFace =  Typeface.createFromAsset(getAssets(),"fonts/Lato-Regular.ttf");

        resultTextView.setTypeface(customTypeFace);
        summuryTextView.setTypeface(customTypeFace);

        divideTextView.setTypeface(customTypeFace);
        multiplyTextView.setTypeface(customTypeFace);
        MinusTextView.setTypeface(customTypeFace);
        plusTextView.setTypeface(customTypeFace);

        clearTextView.setTypeface(customTypeFace);
        plusMinusTextView.setTypeface(customTypeFace);
        percentageTextView.setTypeface(customTypeFace);
        equalToTextView.setTypeface(customTypeFace);
        nineTextView.setTypeface(customTypeFace);

        eightTextView.setTypeface(customTypeFace);
        sevenTextview.setTypeface(customTypeFace);
        sixTextView.setTypeface(customTypeFace);
        fiveTextView.setTypeface(customTypeFace);
        fourTextView.setTypeface(customTypeFace);
        threeTextView.setTypeface(customTypeFace);
        twoTextView.setTypeface(customTypeFace);
        oneTextView.setTypeface(customTypeFace);

        doubleZeroTextView.setTypeface(customTypeFace);
        zeroTextView.setTypeface(customTypeFace);
        pointTextView.setTypeface(customTypeFace);

    }

    public void InitSetOnClickListners(){

        oneTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tempString = tempString + "1";
                updateTextView("1");
            }
        });
        twoTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tempString = tempString + "2";
                updateTextView("2");
            }
        });
        threeTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tempString = tempString + "3";
                updateTextView("3");
            }
        });
        fourTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tempString = tempString + "4";
                updateTextView("4");
            }
        });
        fiveTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tempString = tempString + "5";
                updateTextView("5");
            }
        });
        sixTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tempString = tempString + "6";
                updateTextView("6");
            }
        });
        sevenTextview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tempString = tempString + "7";
                updateTextView("7");
            }
        });
        eightTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tempString = tempString + "8";
                updateTextView("8");
            }
        });
        nineTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tempString = tempString + "9";
                updateTextView("9");
            }
        });
        zeroTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tempString = tempString + "0";
                updateTextView("0");
            }
        });
        doubleZeroTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tempString = tempString + "00";
                updateTextView("00");
            }
        });
        pointTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tempString = tempString + ".";
                updateTextView(".");
            }
        });


        plusTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                tempNumber = Float.parseFloat(tempString);
                tempString = "";
                numbers.add(tempNumber);
                operation.add("+");
                updateTextView("+");

            }
        });

        MinusTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                tempNumber = Float.parseFloat(tempString);
                numbers.add(tempNumber);
                tempString = "";
                operation.add("-");
                updateTextView("-");

            }
        });

        multiplyTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                tempNumber = Float.parseFloat(tempString);
                numbers.add(tempNumber);
                tempString = "";
                operation.add("x");
                updateTextView("x");

            }
        });

        divideTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                tempNumber = Float.parseFloat(tempString);
                numbers.add(tempNumber);
                tempString = "";
                operation.add("/");
                updateTextView("/");

            }
        });


        equalToTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(tempString.equals("")){
                 resultTextView.setText("Error");
                }else {
                    tempNumber = Float.parseFloat(tempString);
                    numbers.add(tempNumber);
                }



                Log.d("tag",numbers.toString());
                Log.d("tag",operation.toString());



            }
        });

        clearTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultTextView.setText("0");
                summuryTextView.setText("");
                numbers.clear();
                operation.clear();
            }
        });



    }

    public void getEquationAns(){



    }

    public void updateTextView(String s){

        String tempStringOfTX = summuryTextView.getText().toString();

        summuryTextView.setText(tempStringOfTX+s);
    }
}
