package com.tyler.teamselector;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

import javax.net.ssl.SNIHostName;

public class MainActivity extends AppCompatActivity {

    private Button teamSelectButton;
    private EditText team1NameBox;
    private EditText team2NameBox;
    private TextView nameResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Get references to widgets - the two name boxes, select button, and result TextView
        team1NameBox = (EditText) findViewById(R.id.team_1_box);
        team2NameBox = (EditText) findViewById(R.id.team_2_box);
        teamSelectButton = (Button) findViewById(R.id.select_button);
        nameResult = (TextView) findViewById(R.id.result_text);

        // Event Listener Setup
        teamSelectButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // Read the text from the two name fields and validate input
                String team1Name = team1NameBox.getText().toString();
                String team2Name = team2NameBox.getText().toString();

                if (team1Name.length() == 0 || team2Name.length() == 0) {
                    Toast.makeText(MainActivity.this, "Enter team names", Toast.LENGTH_LONG).show();
                    return;
                }

                // Generate a random number either 0 or 1.
                int random = new Random().nextInt(2);

                if (random == 0) {
                    // Display Team 1
                    nameResult.setText("Congratz " + team1Name);

                } else {
                    // Display Team 2
                    nameResult.setText("Congratz " + team2Name);

                }
            }
        });
    }


}

