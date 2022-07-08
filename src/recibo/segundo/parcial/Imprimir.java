/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recibo.segundo.parcial;

import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.PageSize;
import com.lowagie.text.pdf.PdfContentByte;
import com.lowagie.text.pdf.PdfWriter;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import javax.swing.ImageIcon;

/**
 *
 * @author HP
 */
public class Imprimir {
    
    private Document document;
    private PdfWriter writer;
    private Graphics g;
    
    public Imprimir(){
        document = null;
        writer = null;
        g = null;
    }
    
    public void dibujarReporte(String codigo,String nombre,String categoria,
                               String pCompra, String pVenta, String almacen,String descripcion){
        
        document = new Document();

        try {
            
            writer = PdfWriter.getInstance(document,new FileOutputStream("C:\\Users\\Brayan\\Desktop\\Ensallos\\"+codigo+""+nombre+".pdf"));

            document.open();
            
            PdfContentByte cb = writer.getDirectContent();
            g = cb.createGraphicsShapes(PageSize.LETTER.getWidth(), PageSize.LETTER.getHeight());

            //Se crea un margen
            g.setColor(Color.black);
            g.drawRect(20, 1, 555, 700);    
            //Se crea una imagen
            ImageIcon img1 = new ImageIcon("C:\\Users\\Brayan\\Desktop\\Ensallos\\logo_factura.png");
            g.drawImage(img1.getImage(), 445, 2, 120, 120, null);
                        
            Font font1 = new Font("Tahoma", Font.BOLD + Font.ITALIC, 25);
            g.setFont(font1);
            //Titulo
            g.setColor(Color.BLACK);
            g.drawString("INFORME DE SALIDA", 150, 80);
            
            
            font1 = new Font("Tahoma", Font.BOLD, 10);
            g.setFont(font1);
            g.drawString("Nombre completo: "+nombre, 60, 170);
            g.drawString("Codigo: "+codigo, 60, 200);
            g.drawString("Categoria: "+categoria, 60, 230);
            g.drawString("Precio de compra: "+pCompra, 60, 260);
            g.drawString("Precio de venta: "+pVenta, 60, 290);
            g.drawString("Almacen: "+almacen, 60, 320);
            g.drawString("Descripcion: "+descripcion, 60, 350);
            
        } catch (DocumentException de) {
            System.err.println(de.getMessage());
        } catch (FileNotFoundException ex) {
            System.err.println(ex.getMessage());
        }

        // step 5: we close the document
        document.close();
    }
}
