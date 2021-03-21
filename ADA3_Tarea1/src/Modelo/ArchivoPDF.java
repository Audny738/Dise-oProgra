/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;


import java.awt.print.Printable;
import java.awt.Graphics;
import java.awt.print.PageFormat;
import java.util.Vector;

public class ArchivoPDF implements Printable {
    private int pagActual;
    private int inicioPagActual;
    private int finalPagActual;
    private final static int anchoColumna = 200;
    private final static int margenX = 4;
    private final static int margenY = 4;
    
    private Vector datos;
    private int columnas [];
    private boolean dibujo;
    
    public ArchivoPDF(Vector dato, int [] column, boolean dib){
        super();
        datos = dato;
        columnas = column;
        dibujo = dib;
    }
    
    public int print(Graphics g, PageFormat pf, int indicePag){
        int alturaLinea = g.getFontMetrics().getHeight();
        int lineaActual = 0;
        if(indicePag == 0){
            pagActual = 0;
            inicioPagActual = 0;
        }else if(indicePag == pagActual){
            lineaActual = inicioPagActual;
        }else{
            lineaActual = finalPagActual + 1;
            inicioPagActual = lineaActual; 
        }
        
        if(lineaActual >= datos.size()){
            return Printable.NO_SUCH_PAGE;
        }
        
        int YActual = (int)(pf.getImageableY() + alturaLinea);
        while(lineaActual < datos.size() && YActual + alturaLinea < pf.getImageableY() + pf.getImageableHeight()){
            int XActual = (int)pf.getImageableX();
            Vector sigLinea = (Vector)datos.elementAt(lineaActual);
            for(int col = 0; col < sigLinea.size(); ++col){
                String stringCeldas = (String)sigLinea.elementAt(col);
                g.drawString(stringCeldas, XActual + margenX, YActual + margenY);
                
                int colAncho = anchoColumna;
                if(columnas != null && columnas.length > col){
                    colAncho = columnas[col];
                }
                
                if(dibujo){
                    g.drawRect(XActual, YActual - (alturaLinea / 2), colAncho, alturaLinea);
                }
                
                XActual += colAncho;
            }
            ++lineaActual;
            YActual += alturaLinea;
            
        }
        finalPagActual = lineaActual;
        pagActual = indicePag;
        return Printable.PAGE_EXISTS;
    }
    
    
    
}
