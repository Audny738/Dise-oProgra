/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.awt.Graphics;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.util.Vector;

public class ArchivoPDF implements Printable{
    private int pagActual;
    private int inicioPagActual;
    private int finalPagActual;
    private final static int anchoColumnas = 200;
    private final static int margenX = 4;
    private final static int margenY = 4;
    
    private Vector datos;
    private int columnas[];
    private boolean dibujo;
    
    public ArchivoPDF(Vector dato, int [] column, boolean draw){
        super();
        datos = dato;
        columnas = column;
        dibujo = draw;
    }
    
    public int print(Graphics g, PageFormat pf, int indicePag){
        int lineaAltura = g.getFontMetrics().getHeight();
        int lineaActual = 0;
        if(indicePag == 0){
            pagActual = 0;
            inicioPagActual = 0;
        }else if (pagActual == indicePag){
            lineaActual = inicioPagActual;
        }else{
            lineaActual = finalPagActual + 1;
            inicioPagActual = lineaActual;
        }
        
        if(lineaActual >= datos.size()){
            return Printable.NO_SUCH_PAGE;
        }
        
        int YActual = (int)(pf.getImageableY() + lineaAltura);
        while(lineaActual < datos.size() && YActual + lineaAltura < pf.getImageableY() + pf.getImageableHeight()){
            int XActual = (int)pf.getImageableX();
            Vector sigFila = (Vector)datos.elementAt(lineaActual);
            for(int col = 0; col < sigFila.size(); ++col){
                String stringCelda = String.valueOf(sigFila.elementAt(col));
                g.drawString(stringCelda, XActual + margenX, YActual + margenY);
                
                int anchoCol = anchoColumnas;
                if(columnas != null && columnas.length > col){
                    anchoCol = columnas[col];
                }
                
                if(dibujo){
                    g.drawRect(XActual, YActual - (lineaAltura / 2), anchoCol, lineaAltura);
                }
                
                XActual += anchoCol;
            }
            
            ++lineaActual;
            YActual += lineaAltura;
        }
        finalPagActual = lineaActual;
        pagActual = indicePag;
        return Printable.PAGE_EXISTS;
    }
}
