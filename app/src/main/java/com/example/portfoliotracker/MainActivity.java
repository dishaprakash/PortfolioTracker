package com.example.portfoliotracker;
import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private Button assetButton;
    private Button marketButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        assetButton = (Button) findViewById(R.id.assetsButton);
        assetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openAssetPage();
            }
        });

        marketButton = (Button) findViewById(R.id.marketButton);
        marketButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMarketPage();
            }
        });
    }
    public void openAssetPage(){
        System.out.println("Button Clicked");
        Intent intent = new Intent(this, Assets.class);
        startActivity(intent);
    }
    public void openMarketPage(){
        Intent intent = new Intent(this, Market.class);
        startActivity(intent);
    }

}