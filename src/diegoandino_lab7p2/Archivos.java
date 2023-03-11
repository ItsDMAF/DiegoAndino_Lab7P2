package diegoandino_lab7p2;

import java.io.Serializable;
import java.util.Random;

public class Archivos implements Serializable {

    private final static long SerialVersionUID = 453;
    private String nombre;
    private String link;
    private String extencion;
    private double tamaño;
    private boolean favorito = false;
    private boolean trash = false;
    Random ran = new Random();

    public Archivos() {
    }

    public Archivos(String nombre, double tamaño, String extencion) {

        this.nombre = nombre;
        this.tamaño = tamaño;
        this.extencion = extencion;

        String road = "dive.google.com/";

        for (int i = 0; i < 10; i++) {
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
        this.link = road;
    }

    public Archivos(String nombre, String extension, double tamaño, Carpeta carp) {
        this.nombre = nombre;
        this.tamaño = tamaño;
        this.extencion = extension;
        String road = carp.getLink() + "/";

        for (int i = 0; i < 10; i++) {
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
            this.link = road;
        }
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

    public String getExtencion() {
        return extencion;
    }

    public void setExtencion(String extencion) {
        this.extencion = extencion;
    }

    public double getTamaño() {
        return tamaño;
    }

    public void setTamaño(double tamaño) {
        this.tamaño = tamaño;
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
        return nombre + extencion;
    }

    boolean getFavorito() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
