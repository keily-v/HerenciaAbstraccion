package dominio;

public class Planta extends SerVivo {

    public Planta(String nombre) {
        super(nombre);// pasa al constructor de ser vivo
        this.nombre = nombre;
    }

    @Override
    public void alimentarse() {
        System.out.println("Se alimenta mediante la fotosíntesis");
    }

}
