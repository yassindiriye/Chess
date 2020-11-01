package Pieces;

import java.awt.*;

public class Piece {

    private String name;
    private Color color;
    private int boardPlace;
    private char collum;
    private int row;


    public Piece (){
        this(null, Color.white, 0xA0);
    }

    public Piece(String name, Color color, int boardPlace) {
        this.collum = "A".charAt(0);
        this.row = 1;
        this.name = name;
        this.color = color;
        this.boardPlace = boardPlace;
    }

    public String getName() {
        return this.name;
    }

    public Color getColor() {
        return this.color;
    }

    public int getBoardPlace() {
        return this.boardPlace;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBoardPlace(Short boardPlace) {
        this.boardPlace = boardPlace;
    }
}
