
package diegoandino_lab7p2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JProgressBar;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ProBar  extends Thread{
    private Carpeta carp;
    private double size = 0;
    private ArrayList<Archivos> archivosCarpeta = new ArrayList();
    private JTable tabla;
    private JProgressBar barra;
    private JProgressBar bar;

    public ProBar() {
    }

    public ProBar(JProgressBar barra, Carpeta carp, JTable table, JProgressBar bar) {
        this.carp = carp;
        this.barra = barra;
        this.tabla = table;
        this.bar = bar;
        recorrerCarpeta(carp);
        determineSize(archivosCarpeta);
        
        
        barra.setMaximum(archivosCarpeta.size());
    }
    
    public ProBar(JProgressBar barra, Archivos archivo, JTable table, JProgressBar bar) {
   
        this.barra = barra;
        this.bar = bar;
        this.tabla = table;
        archivosCarpeta.add(archivo);
        barra.setMaximum(archivosCarpeta.size());
    }
    
    public void run(){
        size = 0;
        DefaultTableModel modelo = (DefaultTableModel)tabla.getModel();
        
        modelo.setRowCount(0);
        
        for (Archivos archivo : archivosCarpeta) {
            try {
                LoadBar barra = new LoadBar(bar, archivo);
                barra.start();
              
               
                while(barra.isAlive()){
                    Thread.sleep(10);
                }
                Thread.sleep(0);
                
                barra.setValue(barra.getValue+1);
                File file = new File("./bitacora.txt");
                FileWriter writer = new FileWriter(file, true);
                BufferedWriter bw = new BufferedWriter(writer);
                String string = archivo.getNombre() + " " + archivo.getTamaño() + " " + new Date() + "\n";
                bw.write(string);
                bw.flush();
                bw.close();
               
                modelo.addRow(new Object[]{archivo.getNombre(), archivo.getTamaño(), archivo.getExtencion()});
            } catch (Exception ex) {
                Logger.getLogger(ProBar.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        try {
            Thread.sleep(6000);
        } catch (InterruptedException ex) {
            Logger.getLogger(ProBar.class.getName()).log(Level.SEVERE, null, ex);
        }
        barra.setValue(0);
        modelo.setRowCount(0);
       
        
    }
    
    public void recorrerCarpeta(Carpeta carp){
        for (Archivos arc : carp.getListArchi()) {
            archivosCarpeta.add(arc);
        }
        
        for (Carpeta car : carp.getListCarp()) {
            recorrerCarpeta(carp);
        }
    }
    
    public void determineSize(ArrayList<Archivos> archivos){
        for (Archivos archivo : archivos) {
            size += archivo.getTamaño();
        }
    }
}
