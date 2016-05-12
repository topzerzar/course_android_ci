package topzme.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements CalculatorListener  {

    EditText firstOperand;
    EditText secondOperand;
    TextView textResult;

    MainController mainController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstOperand = (EditText) findViewById(R.id.operand_one_edit_text);
        secondOperand = (EditText) findViewById(R.id.operand_two_edit_text);
        textResult = (TextView) findViewById(R.id.text_result);

        mainController = new MainController();
        mainController.setListener(this);
    }

    public void onAdd(View view) {
        double first = Double.parseDouble(firstOperand.getText().toString());
        double second = Double.parseDouble(secondOperand.getText().toString());
        mainController.onAdd(first, second);
    }

    public void onMinus(View view) {
        double first = Double.parseDouble(firstOperand.getText().toString());
        double second = Double.parseDouble(secondOperand.getText().toString());
        mainController.onMinus(first, second);
    }

    public void onMultiply(View view) {
        double first = Double.parseDouble(firstOperand.getText().toString());
        double second = Double.parseDouble(secondOperand.getText().toString());
        mainController.onMultiply(first, second);
    }

    public void onDivide(View view) {
        double first = Double.parseDouble(firstOperand.getText().toString());
        double second = Double.parseDouble(secondOperand.getText().toString());
        mainController.onDivide(first, second);
    }

    @Override
    public void onSuccess(String result) {
        textResult.setText(String.valueOf(result));
    }
}
