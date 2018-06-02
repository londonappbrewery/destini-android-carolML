package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:

    Button topButton;
    Button downButton;
    TextView storyText;
    private int myStoryIndex;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        topButton = (Button) findViewById(R.id.buttonTop);
        downButton = (Button) findViewById(R.id.buttonBottom);
        storyText = (TextView) findViewById(R.id.storyTextView);

        storyText.setText(R.string.T1_Story);
        topButton.setText(R.string.T1_Ans1);
        downButton.setText(R.string.T1_Ans2);
        myStoryIndex = 1;

        topButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ( myStoryIndex == 1) {

                    storyText.setText(R.string.T3_Story);
                    topButton.setText(R.string.T3_Ans1);
                    downButton.setText(R.string.T3_Ans2);
                    myStoryIndex = 3;

                } else if (myStoryIndex == 2) {

                    storyText.setText(R.string.T3_Story);
                    topButton.setText(R.string.T3_Ans1);
                    downButton.setText(R.string.T3_Ans2);
                    myStoryIndex = 3;

                } else {

                    storyText.setText(R.string.T6_End);
                    topButton.setVisibility(View.GONE);
                    downButton.setVisibility(View.GONE);

                }
            }
        });

        downButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ( myStoryIndex == 1) {

                    storyText.setText(R.string.T2_Story);
                    topButton.setText(R.string.T2_Ans1);
                    downButton.setText(R.string.T2_Ans2);
                    myStoryIndex = 2;

                } else if (myStoryIndex == 2) {

                    storyText.setText(R.string.T4_End);
                    topButton.setVisibility(View.GONE);
                    downButton.setVisibility(View.GONE);

                } else {

                    storyText.setText(R.string.T5_End);
                    topButton.setVisibility(View.GONE);
                    downButton.setVisibility(View.GONE);

                }
            }
        });

    }
}
