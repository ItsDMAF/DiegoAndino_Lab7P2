
package diegoandino_lab7p2;

public class Archivos {
    private String nombre;
    private String link;
    private String extencion;
    private double tamaño;

    public Archivos(String nombre, String link, double tamaño) {
        this.nombre = nombre;
        this.link = link;
        this.extencion = extencion;
        this.tamaño = tamaño;
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

    @Override
    public String toString() {
        return "Archivos{" + "nombre=" + nombre + ", link=" + link + ", extencion=" + extencion + ", tama\u00f1o=" + tamaño + '}';
    }
    
    
    
    
}
