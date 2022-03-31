package com.mkmsoft.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    /// Same logic with Flutter's init state
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /// We define isEven variable here so we can track which image
    /// should seen on the screen
    Boolean isEven = true;

    /// We define counter variable to see how many times we clicked the button
    int counter = 1;

    public void changeImage(View view) {
        /// We are finding image id by findViewById method
        ImageView imageView = findViewById(R.id.imageView);

        /// We are finding text label with same method
        TextView textView = findViewById(R.id.textView);

        /// getCounter getter returns int value and we convert it to String
        String increasedCounterValue = String.valueOf(getCounter());

        /// We are setting text with setText method.
        /// So we can see counter's value on the screen
        textView.setText(increasedCounterValue);

        /// We are changing isEven value with it's opposite value
        isEven = !isEven;

        if (isEven) {
            /// if value is even, show photo 1
            imageView.setImageResource(R.drawable.metallica);
        } else {
            /// if value is even, show photo 2
            imageView.setImageResource(R.drawable.metallica2);
        }
    }

    // This getter returns counter's current value's increased with 1
    public int getCounter() {
        return counter++;
    }

}
