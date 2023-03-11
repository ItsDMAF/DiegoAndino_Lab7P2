
package diegoandino_lab7p2;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JProgressBar;

public class LoadBar  extends Thread {
    private JProgressBar barra;
    private Archivos archivo;
    private int tamaño;
    public LoadBar() {
    }

    public LoadBar(JProgressBar barra, Archivos archivo) {
        this.barra = barra;
        this.archivo = archivo;
        this.tamaño =(int) archivo.getTamaño() / 10;
        barra.setMaximum(tamaño);
        if(tamaño == 0){
            barra.setMaximum(1);
        }
    }
    
    public void run(){
        
        while(barra.getValue() != barra.getMaximum()){
            
                barra.setValue(barra.getValue()+1);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(LoadBar.class.getName()).log(Level.SEVERE, null, ex);
            }
          
        }
        
        barra.setValue(0);
    }
    
}
