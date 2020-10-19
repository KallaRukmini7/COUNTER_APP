package com.example.counter_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int TeamAscore=0;
    int TeamBscore=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onepointTeamA(View view) {
        TeamAscore=TeamAscore+1;
        displayA(TeamAscore);
    }

    private void displayA(int teamAscore) {
        TextView TeamAValue=findViewById(R.id.TeamAvalue);
        TeamAValue.setText(""+TeamAscore);
    }

    public void twopointTeamA(View view) {
        TeamAscore=TeamAscore+2;
        displayA(TeamAscore);
    }

    public void threepointTeamA(View view) {
        TeamAscore=TeamAscore+3;
        displayA(TeamAscore);
    }

    public void onepointTeamB(View view) {
        TeamBscore=TeamBscore+1;
        displayB(TeamBscore);
    }
    private void displayB(int teamBscore) {
        TextView TeamAValue=findViewById(R.id.TeamBValue);
        TeamAValue.setText(""+TeamBscore);
    }

    public void twopointTeamB(View view) {
        TeamBscore=TeamBscore+2;
        displayB(TeamBscore);
    }

    public void threepointTeamB(View view) {
        TeamBscore=TeamBscore+3;
        displayB(TeamBscore);
    }
    public void reset(View view){
        TeamAscore=0;
        TeamBscore=0;
        displayA(TeamAscore);
        displayB(TeamBscore);
    }
}