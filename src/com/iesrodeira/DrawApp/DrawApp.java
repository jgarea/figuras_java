package com.iesrodeira.DrawApp;

import com.iesrodeira.Designer.Design;
import com.iesrodeira.Designer.Rectangle;
import com.iesrodeira.Designer.Square;
import com.iesrodeira.Designer.Text;
import com.iesrodeira.Draw.Drawable.Direction;
import com.iesrodeira.Draw.Paper;
import com.iesrodeira.Draw.Point;
import java.util.Scanner;

/**
 *
 * @author xavi
 */
public class DrawApp {
    private static Design deseño=new Design(10);
    private static Scanner scn=new Scanner(System.in);
    
    public static void paintText() {
        Point pos;
        Direction direccion;
        String text;
        Text txt;
        int d;
        
        System.out.println("Introduce a posición:");
        pos=getPoint();
        System.out.print("Texto: "); text=scn.nextLine();
        System.out.print("(1)LEFTRIGHT,(2)RIGHTLEFT,(3)UPDOWN,(4)DOWNUP: ");
        d=Integer.parseInt(scn.nextLine());
        if ((d>0) && (d<5)) {
            direccion=Direction.values()[d-1];
            txt=new Text(pos,text,direccion);
            deseño.addFigura(txt);
        }
    }
    
    
    public static void main(String[] args) {
        int op,lenh,lenv;
        Point pos;
        
        do {
            System.out.println("1.- Pintar Texto");
            System.out.println("2.- Pintar Rectángulo");
            System.out.println("3.- Pintar Cadrado");
            System.out.println("4.- Visualizar Deseño");
            System.out.println("5.- Limpar Deseño");
            System.out.println("6.- Sair");
            System.out.print("Elixe Opcion: ");
            op=Integer.parseInt(scn.nextLine());
            switch(op) {
                case 1:
                    paintText();
                    break;
                case 2:
                    System.out.println("Introduce a posición:");
                    pos=getPoint();
                    System.out.print("Ancho: ");
                    lenh=Integer.parseInt(scn.nextLine());
                    System.out.print("Alto: ");
                    lenv=Integer.parseInt(scn.nextLine());
                    Rectangle r=new Rectangle(pos,lenv,lenh);
                    deseño.addFigura(r);
                    break;
                case 3:
                    System.out.println("Introduce a posición:");
                    pos=getPoint();
                    System.out.print("Ancho: ");
                    lenh=Integer.parseInt(scn.nextLine());
                    Square s=new Square(pos,lenh);
                    deseño.addFigura(s);
                    break;
                case 4:
                    Paper p=new Paper(25,80);
                    deseño.show(p);
                    break;
                case 5:
                    deseño.clear();
                    break;
                       
            }
        } while(op!=6);
    }
    
    private static Point getPoint() {
        int y,x;
        
        System.out.print("Fila: "); y=Integer.parseInt(scn.nextLine());
        System.out.print("Columna: "); x=Integer.parseInt(scn.nextLine());
        return new Point(y,x);
    }
}
