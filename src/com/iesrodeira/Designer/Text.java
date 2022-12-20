/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iesrodeira.Designer;

import com.iesrodeira.Draw.Drawable;
import com.iesrodeira.Draw.Drawable.Direction;
import com.iesrodeira.Draw.Point;

/**
 *
 * @author xavi
 */
public class Text extends Figura {
    private String texto;
    private Direction direccion;
    private Point punto;
    
    public Text(Point punto,String text,Direction direccion) {
        this.texto=text;
        this.punto=punto;
        this.direccion=direccion;
    }
    
    public Text(Point punto,String text) {
        this(punto,text,Direction.LEFTRIGHT);
    }
    
    /**
     * Representa a Figura no Drawable que se lle pasa como parámetro.
     * @param drawable - Drawable onde se representará a figura
     */
    public void draw(Drawable drawable) {
        drawable.drawText(punto, texto, direccion);
    }
}
