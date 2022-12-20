/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iesrodeira.Designer;

import com.iesrodeira.Draw.Drawable;

/**
 *
 * @author xavi
 */
public class Design {
    private final Figura[] figuras;
    private int nf;
 
    public Design(int size) {
        figuras=new Figura[size];
        nf=0;
    }
    
    
    /**
     * Engade unha figura. Retorna true si o consigue e false en outro caso
     * @param f - Figura
     * @return 
     */
    public boolean addFigura(Figura f) {
        boolean resultado=false;
        
        if (nf<figuras.length) {
            figuras[nf]=f;
            nf++;
            resultado=true;
        }
        return resultado;
    }
    
    public void clear() {
        nf=0;
    }
    
    public void show(Drawable panel) {
        for(int idx=0;idx<nf;idx++) figuras[idx].draw(panel);
        panel.show();
    }
}