package app.com.example.android.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA=0;
    int scoreTeamB=0;
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

    public void addScoreTeamA(int score){
        scoreTeamA=scoreTeamA+score;
        displayForTeamA(scoreTeamA);
    }

    public void add3pointsTeamA(View view){
        addScoreTeamA(3);
    }

    public void add2pointsTeamA(View view){
        addScoreTeamA(2);
    }

    public void add1pointTeamA(View view){
        addScoreTeamA(1);
    }

    /**
     * Displays the given score for Team B.
     */

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));

    }

    public void addScoreTeamB(int score){
        scoreTeamB=scoreTeamB+score;
        displayForTeamB(scoreTeamB);
    }

    public void add3pointsTeamB(View view){
        addScoreTeamB(3);
    }

    public void add2pointsTeamB(View view){
        addScoreTeamB(2);
    }

    public void add1pointTeamB(View view){
        addScoreTeamB(1);
    }


    /**
     * Displays the reset scores.
     */

    public void resetScores (View view){
        scoreTeamA=0;
        scoreTeamB=0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }
}
