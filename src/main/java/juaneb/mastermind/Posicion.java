package main.java.juaneb.mastermind;

import java.util.Random;


public class Posicion {
    private int row;
    private int column;
    private Color color;

    Posicion(){               
        this.row = 0;
        this.column = 0;
        this.color = Color.NULL_COLOR;              
    }

    Posicion addRandomColorToPosition(){
        
        int min = 0;
        int max = 7;
        int index = 3;       

        this.color = Color.values()[index];
        return(this);
	}


    
}
