
package diegoandino_lab7p2;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Aministraje {
    private ArrayList<Archivos> archivos = new ArrayList();
    private ArrayList<Carpeta> carpetas = new ArrayList();
    
    private File archivo;
    
    public void Administrador(){
        
    }

    public Aministraje(String road) {
        archivo = new File(road);
    }

    public ArrayList<Archivos> getArchivos() {
        return archivos;
    }

    public void setArchivos(ArrayList<Archivos> archivos) {
        this.archivos = archivos;
    }

    public ArrayList<Carpeta> getCarpetas() {
        return carpetas;
    }

    public void setCarpetas(ArrayList<Carpeta> carpetas) {
        this.carpetas = carpetas;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    
    
    
    public void escribir(){
        try {
            FileOutputStream out = new FileOutputStream(archivo, false);
            ObjectOutputStream output = new ObjectOutputStream(out);
            
            for (Archivos arc : archivos) {
                output.writeObject(arc);
            }
            
            for (Carpeta car : carpetas) {
                output.writeObject(car);
            }
            
            output.flush();
            out.close();
            output.close();
        } catch (Exception e) {
            Logger.getLogger(Aministraje.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
    public void leer(){
        try{
            if(archivo.exists()){
                FileInputStream ip = new FileInputStream(archivo);
                ObjectInputStream input = new ObjectInputStream(ip);
                Object temp = new Object();
                
                try{
                    while((temp = input.readObject()) != null){
                        if(temp instanceof Archivos){
                           archivos.add((Archivos)temp);
                        }else{
                           carpetas.add((Carpeta)temp);
                            
                        
                        }
                    }
                }catch(EOFException ex){
                    
                }
            }
        }catch(Exception e){
            
        }
    }
}
