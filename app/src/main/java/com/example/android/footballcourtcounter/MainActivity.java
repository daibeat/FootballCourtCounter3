package com.example.android.footballcourtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.android.footballcourtcounter.R;

public class MainActivity extends AppCompatActivity {

//Tracks the goals for Team 1

    int scoreGoalsTeam1 = 0;

    //Tracks the fouls for Team 1

    int scoreFoulsTeam1 = 0;

    //Tracks the penalties for Team 1

    int scorePenaltyTeam1 = 0;


//Tracks the goals for Team 2

    int scoreGoalsTeam2 = 0;

    //Tracks the fouls for Team 2

    int scoreFoulsTeam2 = 0;

    //Tracks the penalties for Team 2

    int scorePenaltyTeam2 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    /**
     * Displays the given goals score for Team 1.
     */
    public void displayGoalsTeam1(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_1_scoreGoal);
        scoreView.setText(String.valueOf(score));

    }

    /**
     * Increase the score for goals Team 1, 1 points.
     */
    public void addGoalForTeam1(View v) {
        scoreGoalsTeam1 = scoreGoalsTeam1 + 1;
        displayGoalsTeam1(scoreGoalsTeam1);
    }

    /**
     * Displays the given fouls score for Team 1.
     */
    public void displayFoulsTeam1(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_1_scoreFouls);
        scoreView.setText(String.valueOf(score));

    }

    /**
     * Increase the score for fouls Team 1, 1 points.
     */

    public void addFoulForTeam1(View v) {
        scoreFoulsTeam1 = scoreFoulsTeam1 + 1;
        displayFoulsTeam1(scoreFoulsTeam1);
    }

    /**
     * Displays the given penalty score for Team 1.
     */
    public void displayPenaltyTeam1(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_1_scorePenalty);
        scoreView.setText(String.valueOf(score));

    }


    /**
     * Increase the score for penalty Team 1, 1 points.
     */
    public void addPenaltyForTeam1(View v) {
        scorePenaltyTeam1 = scorePenaltyTeam1 + 1;
        displayPenaltyTeam1(scorePenaltyTeam1);
    }


    /**
     * Displays the given goals score for Team 1.
     */
    public void displayGoalsTeam2(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_2_scoreGoal);
        scoreView.setText(String.valueOf(score));

    }

    /**
     * Increase the score for goals Team 2, 1 points.
     */
    public void addGoalForTeam2(View v) {
        scoreGoalsTeam2 = scoreGoalsTeam2 + 1;
        displayGoalsTeam2(scoreGoalsTeam2);
    }

    /**
     * Displays the given fouls score for Team 2.
     */
    public void displayFoulsTeam2(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_2_scoreFouls);
        scoreView.setText(String.valueOf(score));

    }

    /**
     * Increase the score for fouls Team 2, 1 points.
     */

    public void addFoulForTeam2(View v) {
        scoreFoulsTeam2 = scoreFoulsTeam2 + 1;
        displayFoulsTeam2(scoreFoulsTeam2);
    }

    /**
     * Displays the given penalty score for Team 2.
     */
    public void displayPenaltyTeam2(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_2_scorePenalty);
        scoreView.setText(String.valueOf(score));

    }


    /**
     * Increase the score for penalty Team 2, 1 points.
     */
    public void addPenaltyForTeam2(View v) {
        scorePenaltyTeam2 = scorePenaltyTeam2 + 1;
        displayPenaltyTeam2(scorePenaltyTeam2);
    }


    /**
     * Reset the score for Team A and B to 0 points.
     */
    public void ResetScore(View v) {
        scoreGoalsTeam1 = 0;
        scoreFoulsTeam1 = 0;
        scorePenaltyTeam1 = 0;
        displayGoalsTeam1(scoreGoalsTeam1);
        displayFoulsTeam1(scoreGoalsTeam1);
        displayPenaltyTeam1(scorePenaltyTeam1);
        scoreGoalsTeam2 = 0;
        scoreFoulsTeam2 = 0;
        scorePenaltyTeam2 = 0;
        displayGoalsTeam2(scoreGoalsTeam2);
        displayFoulsTeam2(scoreGoalsTeam2);
        displayPenaltyTeam2(scorePenaltyTeam2);

    }

}

