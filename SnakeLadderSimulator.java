package com.assignmentSnakeLadder;

import java.io.PrintWriter;
import java.util.Scanner;

public class SnakeLadderSimulator {
    PrintWriter writer = new PrintWriter(System.out, true);
    Scanner scanobj = new Scanner(System.in);

    public SnakeLadderSimulator() {
        writer.println(" Snake & ladder Simulator");
    }

    public static void main(String[] args) {
        SnakeLadderSimulator snakeladderObj = new SnakeLadderSimulator();
        Player player1 = new Player();

    }
}
class Player extends SnakeLadderSimulator{
    int current_postion =0;
    int startng_position = 0;
    Player(){
        setThePosion( );
        int dieNumber = rollDie();
        writer.println(" die number = " + dieNumber);
    }
    public void setThePosion( ){
        writer.println(" starting postion of Player1 = " +startng_position );
    }

    public int rollDie(){
        int dieOutCome = (int) (Math.floor(Math.random() * 6)+1);
        return dieOutCome;
    }

}

