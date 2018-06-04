package com.example.valary.scorekeeperapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreA = 0;
    int scoreB = 0;
    int Reset = 0;
    TextView  teamAScore;
    TextView  teamBScore;
    Button btn3fora;
    Button btn2fora;
    Button btn1fora;

    Button btn3forb;
    Button btn2forb;
    Button btn1forb;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        teamAScore = findViewById(R.id.team_A_score);
        teamBScore = findViewById(R.id.team_b_score);
        btn3fora = findViewById(R.id.btn3fora);
        btn2fora = findViewById(R.id.btn2fora);
        btn1fora = findViewById(R.id.btn1fora);

        btn3forb = findViewById(R.id.btn3forb);
        btn2forb = findViewById(R.id.btn2forb);
        btn1forb = findViewById(R.id.btn1forb);

        btn3fora.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                threeforteamA();
            }
        });
        btn2fora.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                twoforteamA();
            }
        });
        btn1fora.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                oneforteamA();
            }
        });

        btn3forb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                threeforteamB();

            }
        });
        btn2forb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                twoforteamB();
            }
        });
        btn1forb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                oneforteamB();
            }
        });

    }
    // This method adds one point to team A
    public void oneforteamA() {
        scoreA = scoreA + 1;
        displayForTeamA(scoreA);
    }
    // This method adds two points to team A
    public void twoforteamA() {
        scoreA = scoreA + 2;
        displayForTeamA(scoreA);
    }
    // This method adds three points to team A
    public void threeforteamA() {
        scoreA = scoreA + 3;
        displayForTeamA(scoreA);
    }
    // This method displays the score on the screen for team A
    private void displayForTeamA(int scoreA) {
        teamAScore.setText("" + scoreA);
    }
    // The stats for team B begin here
    // This method adds one point to team B
    public void oneforteamB() {
        scoreB = scoreB + 1;
        displayForTeamB(scoreB);
    }
    // This method adds two points to team B
    public void twoforteamB() {
        scoreB = scoreB + 2;
        displayForTeamB(scoreB);
    }
    // This method adds three points to team B
    public void threeforteamB() {
        scoreB = scoreB + 3;
        displayForTeamB(scoreB);
    }
    // This method displays the score on the screen for team B
    private void displayForTeamB(int scoreB) {
        teamBScore.setText("" + scoreB);
    }
    private void displayForReset(int Reset){

    }
}
