package com.example.user.excalculator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
    private EditText firstNumber, secondNumber;
    private TextView txtResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnPlus = findViewById(R.id.btnPlus);
        Button btnMinus = findViewById(R.id.btnMinus);
        Button btnMultiple = findViewById(R.id.btnMultiple);
        Button btnDivide = findViewById(R.id.btnDivide);
        firstNumber = findViewById(R.id.txtFirstNumber);
        secondNumber = findViewById(R.id.txtSecondNumber);
        txtResult = findViewById(R.id.txtResult);
        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(firstNumber.getText().toString().isEmpty() || secondNumber.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this, "빈칸없이 숫자를 입력하세요.", Toast.LENGTH_SHORT).show();
                }else{
                    int firstValue = Integer.parseInt(firstNumber.getText().toString());
                    int secondValue = Integer.parseInt(secondNumber.getText().toString());
                    int result = firstValue + secondValue;
                    txtResult.setText(String.valueOf(result));
                }
            }
        });
        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(firstNumber.getText().toString().isEmpty() || secondNumber.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this, "빈칸없이 숫자를 입력하세요.", Toast.LENGTH_SHORT).show();
                }else{
                    int firstValue = Integer.parseInt(firstNumber.getText().toString());
                    int secondValue = Integer.parseInt(secondNumber.getText().toString());
                    int result = firstValue - secondValue;
                    txtResult.setText(String.valueOf(result));
                }
            }
        });
        btnMultiple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(firstNumber.getText().toString().isEmpty() || secondNumber.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this, "빈칸없이 숫자를 입력하세요.", Toast.LENGTH_SHORT).show();
                }else{
                    int firstValue = Integer.parseInt(firstNumber.getText().toString());
                    int secondValue = Integer.parseInt(secondNumber.getText().toString());
                    int result = firstValue * secondValue;
                    txtResult.setText(String.valueOf(result));
                }
            }
        });
        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(firstNumber.getText().toString().isEmpty() || secondNumber.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this, "빈칸없이 숫자를 입력하세요.", Toast.LENGTH_SHORT).show();
                }else {
                    int firstValue = Integer.parseInt(firstNumber.getText().toString());
                    int secondValue = Integer.parseInt(secondNumber.getText().toString());
                    if (secondValue != 0) {
                        int result = firstValue / secondValue;
                        txtResult.setText(String.valueOf(result));
                    } else {
                        Toast.makeText(MainActivity.this, "0으로 숫자를 나눌 수 없습니다.", Toast.LENGTH_SHORT).show();
                        secondNumber.requestFocus();
                    }
                }
            }
        });
    }

    public void onBtnPlus(View v){
        if(firstNumber.getText().toString().isEmpty() || secondNumber.getText().toString().isEmpty()){
            Toast.makeText(MainActivity.this, "빈칸없이 숫자를 입력하세요.", Toast.LENGTH_SHORT).show();
        }else{
            int firstValue = Integer.parseInt(firstNumber.getText().toString());
            int secondValue = Integer.parseInt(secondNumber.getText().toString());
            int result = firstValue + secondValue;
            txtResult.setText(String.valueOf(result));
        }
    }

}
