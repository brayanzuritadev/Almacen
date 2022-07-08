/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlSesion.java.control.tiempo.usuario;

import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.io.File;
/**
 *
 * @author HP
 */
public class ControlIngreso {
    private Date date;
    private String texto;
    private String nombreUsuario;
    private SimpleDateFormat formatter;
    private FileWriter archivo;
    
    public ControlIngreso(){
        date = null;
        texto = nombreUsuario = "";
        formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        archivo = null;
        existeArchivo();
    }
    
    private void existeArchivo(){
        if(!new File("C:\\Users\\Brayan\\Desktop\\Ensallos\\Registro.txt").exists() || (new File("C:\\Users\\HP\\Desktop\\Ensallos\\Registro.txt").length() == 0)){
            registrarDato("    Fecha Inicio    |     Fecha Salida    | Nombre Completo");
        }
    }
    
    public void registrarDato(String x){
        try{
            archivo = new FileWriter("C:\\Users\\Brayan\\Desktop\\Ensallos\\Registro.txt",true);
            archivo.write(x+"\n");
            archivo.close();
        }catch (IOException e){
            
        }
    }
    
    public void inicio(String txt){
        date = new Date();
        nombreUsuario = txt;
        texto = formatter.format(date);
    }
    
    public void fin(){
        date = new Date();
        registrarDato(texto+" | "+formatter.format(date)+" | "+nombreUsuario);
    }
}
