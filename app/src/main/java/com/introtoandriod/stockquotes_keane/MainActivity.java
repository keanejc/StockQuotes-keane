package com.introtoandriod.stockquotes_keane;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.io.IOException;
import java.net.MalformedURLException;

public class MainActivity extends AppCompatActivity {
    // Get element ids
    Button button = (Button) findViewById(R.id.button);
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

        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                getQuote();

            }
        });
    }

    private void getQuote() {
        CharSequence inputString = input.getText();

        if (checkInput(inputString)) {
            Stock stock = new Stock(inputString.toString().toUpperCase());
            AsyncTaskRunner runner = new AsyncTaskRunner();
            runner.execute(stock);
        } else {
            // Input is not correct
            Toast.makeText(getApplicationContext(), R.string.invalid, Toast.LENGTH_SHORT).show();
        }


    }

    private boolean checkInput(CharSequence text) {
        //Assuming all stock symbols are exactly 4 letters
        return (text.length() == 4 && text.toString().contains("[a-zA-Z]+"));
    }

    private void update(Stock stock) {
        // Update views
        symbol.setText(stock.getSymbol());
        name.setText(stock.getName());
        price.setText(stock.getLastTradePrice());
        time.setText(stock.getLastTradeTime());
        change.setText(stock.getChange());
        range.setText(stock.getRange());
    }

    protected void onSaveInstanceState(Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);

        savedInstanceState.putCharSequence("input", input.getText());
        savedInstanceState.putCharSequence("symbol", symbol.getText());
        savedInstanceState.putCharSequence("name", name.getText());
        savedInstanceState.putCharSequence("price", price.getText());
        savedInstanceState.putCharSequence("time", time.getText());
        savedInstanceState.putCharSequence("change", change.getText());
        savedInstanceState.putCharSequence("range", range.getText());
    }

    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

        input.setText(savedInstanceState.getChar("input"));
        symbol.setText(savedInstanceState.getChar("symbol"));
        name.setText(savedInstanceState.getChar("name"));
        price.setText(savedInstanceState.getChar("price"));
        time.setText(savedInstanceState.getChar("time"));
        change.setText(savedInstanceState.getChar("change"));
        range.setText(savedInstanceState.getChar("range"));


    }

    private class AsyncTaskRunner extends AsyncTask<Stock, Stock, Stock> {
        @Override
        protected Stock doInBackground(Stock... stock) {
            Stock stock1 = stock[0];
            try{
                stock1.load();
            }
            catch(MalformedURLException e){
                Toast.makeText(getApplicationContext(), R.string.malformed_exception,Toast.LENGTH_SHORT).show();

            }
            catch(IOException e){
                Toast.makeText(getApplicationContext(), R.string.io_exception,Toast.LENGTH_SHORT).show();

            }

            catch (Exception e){
                Toast.makeText(getApplicationContext(), R.string.general_exception,Toast.LENGTH_SHORT).show();

            }



            return stock1;
        }

        @Override
        protected void onPostExecute(Stock result){
            super.onPostExecute(result);
            update(result);
        }


    }
}
