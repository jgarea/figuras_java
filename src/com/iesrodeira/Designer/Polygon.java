/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iesrodeira.Designer;

import com.iesrodeira.Draw.Drawable;
import com.iesrodeira.Draw.Point;

/**
 *
 * @author xavi
 */
public class Polygon extends Figura {
    protected Point[] vertices;
    
    
    protected Polygon() {}
    
    public Polygon(Point[] v) {
        this.vertices=v;
    }
    
    
    /**
     * Representa a Figura no Drawable que se lle pasa como parámetro.
     * @param drawable - Drawable onde se representará a figura
     */
    public void draw(Drawable drawable) {
        int last=vertices.length-1;
        for(int idx=0;idx<last;idx++) drawable.drawLine(vertices[idx], vertices[idx+1], 0);
        drawable.drawLine(vertices[last],vertices[0],0);
    }
}
