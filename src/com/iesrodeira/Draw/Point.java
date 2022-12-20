package com.iesrodeira.Draw;

/**
 *
 * @author xavi
 */
public class Point {
    int y;
    int x;
    
    public Point(int fila,int columna) {
        this.y=fila;
        this.x=columna;
    }

    public int getY() {
        return y;
    }

    public int getX() {
        return x;
    }
 
    
    @Override
    public String toString() {
        return "("+y+","+x+")";
    }
}
