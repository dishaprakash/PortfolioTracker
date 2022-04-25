package com.example.portfoliotracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Assets extends AppCompatActivity {
    private Button marketButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.assets);

        marketButton = (Button) findViewById(R.id.marketButton);
        marketButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMarketPage();
            }
        });
    }

        public void openMarketPage(){
            Intent intent = new Intent(this, Market.class);
            startActivity(intent);
        }


}
