package turaba.com.scientificcalculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btnZero,btnOne,btnTwo,btnThree,btnFour,btnFive,btnSix,btnSeven,btnEight,btnNine,btnAdd,btnSub,btnMul,btnDiv,btnEqual,btnClear;
    TextView tvResult;
    EditText etOperation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnZero = findViewById(R.id.btn_zero);
        btnOne = findViewById(R.id.btn_one);
        btnTwo = findViewById(R.id.btn_two);
        btnThree = findViewById(R.id.btn_three);
        btnFour = findViewById(R.id.btn_four);
        btnFive = findViewById(R.id.btn_five);
        btnSix = findViewById(R.id.btn_six);
        btnSeven = findViewById(R.id.btn_seven);
        btnEight = findViewById(R.id.btn_eight);
        btnNine = findViewById(R.id.btn_nine);
        btnAdd = findViewById(R.id.btn_add);
        btnSub = findViewById(R.id.btn_sub);
        btnMul = findViewById(R.id.btn_multiplication);
        btnDiv = findViewById(R.id.btn_div);
        btnEqual = findViewById(R.id.btn_equal);
        btnClear = findViewById(R.id.btn_clear);

        etOperation = findViewById(R.id.et_operation);

        tvResult = findViewById(R.id.tv_result);


        //Integer Number Click Operation
        btnZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                etOperation.setText(etOperation.getText()+"0");

            }
        });
        btnOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                etOperation.setText(etOperation.getText()+"1");
            }
        });

        btnTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                etOperation.setText(etOperation.getText()+"2");
            }
        });

        btnThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                etOperation.setText(etOperation.getText()+"3");
            }
        });

        btnFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                etOperation.setText(etOperation.getText()+"4");
            }
        });

        btnFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                etOperation.setText(etOperation.getText()+"5");
            }
        });

        btnSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                etOperation.setText(etOperation.getText()+"6");
            }
        });

        btnSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                etOperation.setText(etOperation.getText()+"7");
            }
        });

        btnEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                etOperation.setText(etOperation.getText()+"8");
            }
        });

        btnNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                etOperation.setText(etOperation.getText()+"9");
            }
        });


        //operand click
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!etOperation.getText().toString().contains("+")) {
                    etOperation.setText(etOperation.getText() + "+");
                }
            }
        });

        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!etOperation.getText().toString().contains("-")) {
                    etOperation.setText(etOperation.getText() + "-");
                }
            }
        });

        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!etOperation.getText().toString().contains("*")) {
                    etOperation.setText(etOperation.getText() + "*");
                }
            }
        });


        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!etOperation.getText().toString().contains("/")) {
                    etOperation.setText(etOperation.getText() + "/");
                }
            }
        });

        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //etOperation.setText(etOperation.getText()+"=");


            }
        });


        //when pressed clear button clear edittext value
        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etOperation.setText("");
                tvResult.setText("");
            }
        });
    }
}

