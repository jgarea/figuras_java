package com.iesrodeira.Draw;

/**
 *
 * @author xavi
 */
public final class Paper extends Drawable {
    private final char[][] papel;
    
    public Paper(int nfilas,int ncolumnas) {
        papel=new char[nfilas][ncolumnas];
        clear();
    }
    
    
    /**
    *   Debuxa un punto nas coordenadas (fila,columna) na cor cor.Si as coordenadas quedan fora do área de debuxo
    *	simplemente non fai nada.
    * 
    * @param y - Fila
    * @param x  - Columna
    * @param cor - Cor do punto
    */
    public void point(int y,int x,int cor) {
        if (isIn(y,x)) papel[y][x]='*';
    }
            
    /**
     *      Debuxa unha liña horizontal dende (y,x)  (fila.columna) ata a columna x1 na cor
     *      especificada en cor.As coordenadas fora do área de debuxo simplemente se ignoran.
     * 
     * @param y  - Fila da liña
     * @param x  - Columna do punto inicial da liña
     * @param x1 - Columna do punto final da liña
     * @param cor - Cor da liña
     */
    protected void drawLineHorizontal(int y,int x,int x1,int cor) {
        //for(int coord=x;coord<=x1;coord++) papel[y][coord]='*';
        int coord=x;
        while(coord<=x1) {
            point(y,coord,cor);
            coord++;
        }
    }
    
    /**
     *      Debuxa unha liña vertical dende (y,x)  (fila.columna) ata a fila y1 na cor
     *      especificada en cor.As coordenadas fora do área de debuxo simplemente se ignoran.
     * @param y - Fila do punto inicial da liña
     * @param x - Columna da liña
     * @param y1 - Fila do punto final da liña
     * @param cor - Cor da liña
     */
    protected void drawLineVertical(int y,int x,int y1,int cor) {
        //for(int coord=x;coord<=x1;coord++) papel[y][coord]='*';
        
        int coord=y;
        while(coord<=y1) {
            point(coord,x,cor);
            coord++;
        }
    }
    
            
    /**
    *   Debuxa o texto text a partir das coordenadas (fila,columna).
    * Si as coordenadas quedan fora do área de debuxo simplemente non fai nada
    * O texto se debuxa segundo a dirección especificada.
    * 
    * @param y - Fila
    * @param x  - Columna
    * @param text   - Texto a debuxar
    * @param direction - Dirección de pintado do texto
    */
    public void drawText(int y,int x,String text,Direction direction) {
        int len=text.length();
        switch(direction) {
            case LEFTRIGHT:
                for(int idx=0;idx<len;idx++) {
                    if (isIn(y,x)) {
                        papel[y][x]=text.charAt(idx);
                    }
                    x++;
                }
                break;
            case RIGHTLEFT:
                for(int idx=0;x>=0 && idx<len;idx++) {
                    if (isIn(y,x)) {
                        papel[y][x]=text.charAt(idx);
                    }
                    x--;
                }
                break;
                
            case UPDOWN:
                for(int idx=0;idx<len;idx++) {
                    if (isIn(y,x)) {
                        papel[y][x]=text.charAt(idx);
                    }
                    y++;
                }
                break;
                
            case DOWNUP:
                for(int idx=0;x>=0 && idx<len;idx++) {
                    if (isIn(y,x)) {
                        papel[y][x]=text.charAt(idx);
                    }
                    y--;
                }
                break;    
            
        }
    }
    
        
    /**
     * Limpa o área de debuxo
     */
    public void clear() {
        for(int f=0;f<papel.length;f++) {
            for(int c=0;c<papel[0].length;c++) {
                papel[f][c]=' ';
            }
        }
    }
    
    /**
     * Amosa o debuxo
     */
    public void show() {
        for(int f=0;f<papel.length;f++) {
            for(int c=0;c<papel[0].length;c++) {
                System.out.print(papel[f][c]);
            }
            System.out.println();
        }    
    }
    
    /**
     * Devolve true si (y,x) dentro de papel, false en outro caso
     * @param y
     * @param x
     * @return 
     */
    private boolean isIn(int y,int x) {
        return (y>=0 && y<papel.length && x>=0 && x<=papel[0].length);    
    }
}
