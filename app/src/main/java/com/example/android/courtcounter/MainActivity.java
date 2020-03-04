package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

int teamAScore = 0;
int teamBScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {

        TextView scoreView = (TextView) findViewById(R.id.team_a_score);

        scoreView.setText(String.valueOf(score));
    }
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void threeTeamA (View view){


        teamAScore = teamAScore + 3;
        displayForTeamA(teamAScore);

    }
    public void twoTeamA (View view){

        teamAScore = teamAScore + 2;
        displayForTeamA(teamAScore);

    }
    public void freeTeamA (View view){


        teamAScore =  teamAScore + 1;
        displayForTeamA(teamAScore);

    }

    public void threeTeamB (View view){


        teamBScore = teamBScore + 3;
        displayForTeamB(teamBScore);

    }
    public void twoTeamB (View view){

        teamBScore = teamBScore + 2;
        displayForTeamB(teamBScore);

    }
    public void freeTeamB (View view){


        teamBScore =  teamBScore + 1;
        displayForTeamB(teamBScore);

    }

    public void reset (View view){

        displayForTeamB(0);
        displayForTeamA(0);
        teamAScore = 0;
        teamBScore = 0;
    }


}
