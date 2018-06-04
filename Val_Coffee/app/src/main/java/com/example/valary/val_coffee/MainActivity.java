package com.example.valary.val_coffee;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    int quantity = 0;
    /**
     * This app displays an order form to order coffee
     */
    TextView quantityTextView;
    TextView priceTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         quantityTextView = findViewById(R.id.quantity_text_view);
         priceTextView=findViewById(R.id.price_text_view);
         priceTextView = findViewById(R.id.price_text_view);


         Player messi = new Player("", "", "", 2, "");
         messi.scoreGoal();

        Player ronaldo = new Player("", "", "", 2, "");
        messi.scoreGoal();

    }

    /**
     * This method is called when the order button is clicked
     */

    public void submitOrder(View view) {

        displayPrice(quantity * 5);
    }
    /**
     * This method displays the given quantity value on the screen
     */
    private void display(int number) {

        quantityTextView.setText("" + number);

    }

    /**
     * This method displays the given quantity value on the screen
     */
    private void displayPrice(int number){

        priceTextView.setText(NumberFormat.getCurrencyInstance(Locale.US).format(number));

    }

    /**
     *This method is called when the plus button is clicked
     */
    public void  increment(View view){

        quantity = quantity + 1;
        display(quantity);
    }
    /**
     *This method is called when the minus button is clicked
     */
    public void  decrement(View view){

        quantity = quantity - 1;
        display(quantity);
    }

}
