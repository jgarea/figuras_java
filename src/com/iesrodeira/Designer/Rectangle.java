/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iesrodeira.Designer;

import com.iesrodeira.Draw.Point;

/**
 *
 * @author xavi
 */
public class Rectangle extends Polygon {
    
    public Rectangle(Point pos,int lv,int lh) {
        vertices=new Point[4];
        vertices[0]=pos;
        vertices[1]=new Point(pos.getY(),pos.getX()+lh);
        vertices[2]=new Point(pos.getY()+lv,pos.getX()+lh);
        vertices[3]=new Point(pos.getY()+lv,pos.getX());
    }
    
}
