
package diegoandino_lab7p2;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Random;

public class Carpeta implements Serializable{
    private String nombre;
    private String link;
    private ArrayList<Archivos> listArchi = new ArrayList();
    private ArrayList<Carpeta> listCarp = new ArrayList();
    private boolean favorito = false;
    private boolean trash = false;
    Random ran = new Random();

    public Carpeta() {
    }

    public Carpeta(String nombre) {
        this.nombre = nombre;

        String line = "dive.google.com/";
        String road = "";
        for (int i = 0; i < 5; i++) {
            int op = ran.nextInt(2);

            if (op == 0) {
                 
                int num = ran.nextInt(26) + 65;
                char a = (char) num;
                String aa = Character.toString(a);
                int op2 = ran.nextInt(2);

                if (op2 == 0) {
                    aa = aa.toLowerCase();
                } else {
                    aa = aa.toUpperCase();
                }

                road += aa;
            } else if (op == 1) {
                
                road += ran.nextInt(10);
            }
        }
        line += road;
        this.link = line;

    }

    public Carpeta(String nombre, Carpeta carp) {
        this.nombre = nombre;

        String line = carp.getLink()+"/";
        String road = "";
        for (int i = 0; i < 5; i++) {
            int op = ran.nextInt(2);

            if (op == 0) {
                 
                int num = ran.nextInt(26) + 65;
                char a = (char) num;
                String aa = Character.toString(a);
                int ops = ran.nextInt(2);

                if (ops == 0) {
                    aa = aa.toLowerCase();
                } else {
                    aa = aa.toUpperCase();
                }

                road += aa;
            } else if (op == 1) {
                
                road += ran.nextInt(10);
            }
        }
        line += road;
        this.link = line;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public ArrayList<Archivos> getListArchi() {
        return listArchi;
    }

    public void setListArchi(ArrayList<Archivos> listArchi) {
        this.listArchi = listArchi;
    }

    public ArrayList<Carpeta> getListCarp() {
        return listCarp;
    }

    public void setListCarp(ArrayList<Carpeta> listCarp) {
        this.listCarp = listCarp;
    }

    public boolean isFavorito() {
        return favorito;
    }

    public void setFavorito(boolean favorito) {
        this.favorito = favorito;
    }

    public boolean isTrash() {
        return trash;
    }

    public void setTrash(boolean trash) {
        this.trash = trash;
    }

    public Random getRan() {
        return ran;
    }

    public void setRan(Random ran) {
        this.ran = ran;
    }

    
    @Override
    public String toString() {
        return this.nombre;
    }

    boolean getFavorito() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
