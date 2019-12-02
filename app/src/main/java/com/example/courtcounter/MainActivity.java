package com.example.courtcounter;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //    display the given score for Team A

    private void displayForTeamA(int score){
        TextView scoreView = findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }


    //    display the given score for Team B


    private void displayForTeamB(int score){
        TextView scoreView = findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }


    //    Increase the score by Team A

    public void addThreeForTeamA(View view){
        scoreTeamA += 3;
        displayForTeamA(scoreTeamA);
    }
    public void addTwoForTeamA (View view){
        scoreTeamA += 2;
        displayForTeamA(scoreTeamA);
    }

    public void addOneForTeamA(View view){
        scoreTeamA += 1;
        displayForTeamA(scoreTeamA);
    }


    //    Increase the score by Team B


    public void addThreeForTeamB(View view){
        scoreTeamB += 3;
        displayForTeamB(scoreTeamB);
    }
    public void addTwoForTeamB (View view){
        scoreTeamB += 2;
        displayForTeamB(scoreTeamB);
    }

    public void addOneForTeamB(View view){
        scoreTeamB += 1;
        displayForTeamB(scoreTeamB);
    }

    //      Resets the score for both teams

    public void resetScore(View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }
}
