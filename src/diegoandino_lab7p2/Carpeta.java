
package diegoandino_lab7p2;

import java.util.ArrayList;

public class Carpeta {
    private String nombre;
    private String link;
    private ArrayList<Archivos> listArchi = new ArrayList();
    private ArrayList<Carpeta> listCarp = new ArrayList();

    public Carpeta(String nombre, String link) {
        this.nombre = nombre;
        this.link = link;
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

    @Override
    public String toString() {
        return "Carpeta{" + "nombre=" + nombre + ", link=" + link + ", listArchi=" + listArchi + ", listCarp=" + listCarp + '}';
    }
    
    
}
