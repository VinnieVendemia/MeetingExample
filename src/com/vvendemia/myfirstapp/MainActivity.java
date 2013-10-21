package com.vvendemia.myfirstapp;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

	Button button1;
	Button button2;
	Button button3;
	Button button4;
	Button button5;
	Button button6;
	Button button7;
	Button button8;
	Button button9;
	Button add;
	Button multiply;
	TextView answer;
	int numberOne = 0;
	int numberTwo = 0;
	boolean beenClicked = false;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		answer = (TextView) findViewById(R.id.textView1);


		button1 = (Button) findViewById(R.id.button1);
		button1.setOnClickListener( new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if(beenClicked) {
					numberTwo = 1;
					beenClicked = false;
					
				} else {
					numberOne = 1;
					beenClicked = true;
				}

			}

		} );

		button2 = (Button) findViewById(R.id.button2);
		button2.setOnClickListener( new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if(beenClicked) {
					numberTwo = 2;
					beenClicked = false;
					
				} else {
					numberOne = 2;
					beenClicked = true;
				}

			}

		} );

		button3 = (Button) findViewById(R.id.button3);
		button3.setOnClickListener( new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if(beenClicked) {
					numberTwo = 3;
					beenClicked = false;
					
				} else {
					numberOne = 3;
					beenClicked = true;
				}

			}

		} );

		button4 = (Button) findViewById(R.id.button4);
		button4.setOnClickListener( new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if(beenClicked) {
					numberTwo = 4;
					beenClicked = false;
					
				} else {
					numberOne = 4;
					beenClicked = true;
				}

			}

		} );

		button5 = (Button) findViewById(R.id.button5);
		button5.setOnClickListener( new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if(beenClicked) {
					numberTwo = 5;
					beenClicked = false;
					
				} else {
					numberOne = 5;
					beenClicked = true;
				}

			}

		} );

		button6 = (Button) findViewById(R.id.button6);
		button6.setOnClickListener( new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if(beenClicked) {
					numberTwo = 6;
					beenClicked = false;
					
				} else {
					numberOne = 6;
					beenClicked = true;
				}

			}

		} );

		button7 = (Button) findViewById(R.id.button7);
		button7.setOnClickListener( new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if(beenClicked) {
					numberTwo = 7;
					beenClicked = false;
					
				} else {
					numberOne = 7;
					beenClicked = true;
				}

			}

		} );

		button8 = (Button) findViewById(R.id.button8);
		button8.setOnClickListener( new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if(beenClicked) {
					numberTwo = 8;
					beenClicked = false;
					
				} else {
					numberOne = 8;
					beenClicked = true;
				}

			}

		} );

		button9 = (Button) findViewById(R.id.button9);
		button9.setOnClickListener( new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if(beenClicked) {
					numberTwo = 9;
					beenClicked = false;
					
				} else {
					numberOne = 9;
					beenClicked = true;
				}

			}

		} );

		add = (Button) findViewById(R.id.add);
		add.setOnClickListener( new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub

				addAndPrint();
			}

		} );

		multiply = (Button) findViewById(R.id.multiply);
		multiply.setOnClickListener( new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				multiplyAndPrint();
			}

		} );



	}

	private void multiplyAndPrint() {
		int ans = numberOne * numberTwo;

		answer.setText(Integer.toString(ans));
	}

	private void addAndPrint() {
		int ans = numberOne + numberTwo;

		answer.setText(Integer.toString(ans));
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
