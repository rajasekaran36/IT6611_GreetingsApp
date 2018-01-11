package com.example.greetingsapp;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends Activity {
	EditText nameEditText;
	Button greetButton;
	TextView greetOneTextView;
	TextView greetTwoTextView;
	TextView greetThreeTextView;
    Typeface newFont;
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nameEditText = (EditText)findViewById(R.id.uname);
        greetButton = (Button)findViewById(R.id.greet_button);
        greetOneTextView = (TextView)findViewById(R.id.greet_1);
        greetTwoTextView = (TextView)findViewById(R.id.greet_2);
        greetThreeTextView = (TextView)findViewById(R.id.greet_3);
        newFont = Typeface.createFromAsset(getAssets(), "klapjo.otf");
        
        greetOneTextView.setText("");
        
        greetTwoTextView.setTextColor(Color.BLUE);
        greetTwoTextView.setText("");
        
        greetThreeTextView.setTypeface(newFont);
        greetTwoTextView.setTextColor(Color.GREEN);
        greetThreeTextView.setText("");
        
        greetButton.setOnClickListener(new View.OnClickListener() {
			 
			@Override
			public void onClick(View arg0) {
				
				String data = nameEditText.getText().toString();
				data = "Hello " + data + "!!!"; 
				greetOneTextView.setText(data);
				greetTwoTextView.setText(data);
				greetThreeTextView.setText(data);
				
			}
		});
        
    }
}
