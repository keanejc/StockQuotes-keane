package com.introtoandriod.stockquotes_keane;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    // Get element ids
    Button button = (Button)findViewById(R.id.button);
    EditText input = (EditText) findViewById(R.id.input);
    TextView symbol = (TextView) findViewById(R.id.symbol);
    TextView name = (TextView) findViewById(R.id.name);
    TextView price = (TextView) findViewById(R.id.price);
    TextView time = (TextView) findViewById(R.id.time);
    TextView change = (TextView) findViewById(R.id.change);
    TextView range = (TextView) findViewById(R.id.range);



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                getQuote();

            }
        });
    }

    private void getQuote() {
        checkInput(input.getText());
    }

    private void checkInput(Editable text) {

    }

    protected void onSaveInstanceState(Bundle savedInstanceState){
        super.onSaveInstanceState(savedInstanceState);

        savedInstanceState.putCharSequence("input", input.getText());
        savedInstanceState.putCharSequence("symbol", symbol.getText());
        savedInstanceState.putCharSequence("name", name.getText());
        savedInstanceState.putCharSequence("price", price.getText());
        savedInstanceState.putCharSequence("time", time.getText());
        savedInstanceState.putCharSequence("change", change.getText());
        savedInstanceState.putCharSequence("range", range.getText());
    }

    protected void onRestoreInstanceState( Bundle savedInstanceState){
        super.onRestoreInstanceState(savedInstanceState);

        input.setText(savedInstanceState.getChar("input"));
        symbol.setText(savedInstanceState.getChar("symbol"));
        name.setText(savedInstanceState.getChar("name"));
        price.setText(savedInstanceState.getChar("price"));
        time.setText(savedInstanceState.getChar("time"));
        change.setText(savedInstanceState.getChar("change"));
        range.setText(savedInstanceState.getChar("range"));


    }
}
