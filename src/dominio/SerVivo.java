package dominio;

public abstract class SerVivo {

    String nombre;

    public abstract void alimentarse();

    public SerVivo(String nombres) {
        nombres = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
