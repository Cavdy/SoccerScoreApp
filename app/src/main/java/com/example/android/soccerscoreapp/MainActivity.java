package com.example.android.soccerscoreapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int man_utd_score = 0;
    int man_utd_yellow = 0;
    int man_utd_red = 0;
    int man_utd_offside = 0;
    int chelsea_score = 0;
    int chelsea_yellow = 0;
    int chelsea_red = 0;
    int chelsea_offside = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Displays the given score for Man Utd.
     */
    public void displayManUtd(int score) {
        TextView scoreView = (TextView) findViewById(R.id.man_utd_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Man Utd Yellow Card.
     */
    public void displayManUtdYellowCard(int score) {
        TextView scoreView = (TextView) findViewById(R.id.man_utd_yellow_card_point);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Man Utd Red Card.
     */
    public void displayManUtdRedCard(int score) {
        TextView scoreView = (TextView) findViewById(R.id.man_utd_red_card_point);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Man Utd Offside.
     */
    public void displayManUtdOffside(int score) {
        TextView scoreView = (TextView) findViewById(R.id.man_utd_offside_point);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Chelsea.
     */
    public void displayChelsea(int score) {
        TextView scoreView = (TextView) findViewById(R.id.chelsea_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Man Utd Yellow Card.
     */
    public void displayChelseaYellowCard(int score) {
        TextView scoreView = (TextView) findViewById(R.id.chelsea_yellow_card_point);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Man Utd Red Card.
     */
    public void displayChelseaRedCard(int score) {
        TextView scoreView = (TextView) findViewById(R.id.chelsea_red_card_point);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Man Utd Offside.
     */
    public void displayChelseaOffside(int score) {
        TextView scoreView = (TextView) findViewById(R.id.chelsea_offside_point);
        scoreView.setText(String.valueOf(score));
    }


    /**
     * The incrementor of Man Utd.
     */
    public void man_utd(View view) {
        man_utd_score = man_utd_score + 1;
        displayManUtd(man_utd_score);
    }
    public void man_utd_yellow_card(View view) {
        man_utd_yellow = man_utd_yellow + 1;
        displayManUtdYellowCard(man_utd_yellow);
    }
    public void man_utd_red_card(View view) {
        man_utd_red = man_utd_red + 1;
        displayManUtdRedCard(man_utd_red);
    }
    public void man_utd_offside(View view) {
        man_utd_offside = man_utd_offside + 1;
        displayManUtdOffside(man_utd_offside);
    }


    /**
     * The Incrementor of Chelsea.
     */
    public void chelsea(View view) {
        chelsea_score = chelsea_score + 1;
        displayChelsea(chelsea_score);
    }
    public void chelsea_yellow_card(View view) {
        chelsea_yellow = chelsea_yellow + 1;
        displayChelseaYellowCard(chelsea_yellow);
    }
    public void chelsea_red_card(View view) {
        chelsea_red = chelsea_red + 1;
        displayChelseaRedCard(chelsea_red);
    }
    public void chelsea_offside(View view) {
        chelsea_offside = chelsea_offside + 1;
        displayChelseaOffside(chelsea_offside);
    }

    /**
     * The Reset Button.
     */
    public void resetbtn(View view) {
        man_utd_score = 0;
        man_utd_yellow = 0;
        man_utd_red = 0;
        man_utd_offside = 0;
        chelsea_score = 0;
        chelsea_yellow = 0;
        chelsea_red = 0;
        chelsea_offside = 0;
        displayManUtd(man_utd_score);
        displayManUtdYellowCard(man_utd_yellow);
        displayManUtdRedCard(man_utd_red);
        displayManUtdOffside(man_utd_offside);
        displayChelsea(chelsea_score);
        displayChelseaYellowCard(chelsea_yellow);
        displayChelseaRedCard(chelsea_red);
        displayChelseaOffside(chelsea_offside);
    }
}
