package com.tex.texandroid;

import android.content.Intent;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class BuyActivity extends AppCompatActivity {

    TextView bookName;
    TextView courseCode;
    TextView price;

    Button purchaseButton;
    FragmentManager fm = getSupportFragmentManager();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buy);

        Intent in = getIntent();
        final String img_url = in.getStringExtra("imageURL");
        final String book_name = in.getStringExtra("bookName");
        final String course_code = in.getStringExtra("courseCode");
        final String price_string = in.getStringExtra("price");

        bookName = (TextView) findViewById(R.id.bookNameTextView);
        bookName.setText(book_name);
        courseCode = (TextView) findViewById(R.id.courseCodeTextView);
        courseCode.setText(course_code);
        price = (TextView) findViewById(R.id.priceTextView);
        price.setText(price_string);

        purchaseButton = (Button) findViewById(R.id.purchaseButton);

        purchaseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Bundle bundle = new Bundle();
                bundle.putString("bookname",book_name);
                bundle.putString("cc", course_code);
                bundle.putString("price", price_string);
                AlertDFragment alertdFragment = new AlertDFragment();
                alertdFragment.setArguments(bundle);
                alertdFragment.show(fm, "Alert Dialog Fragment");

            }
        });
    }
}
