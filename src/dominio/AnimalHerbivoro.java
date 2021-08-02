package dominio;

public class AnimalHerbivoro extends Animal {

    public AnimalHerbivoro(String nombre) {
        super(nombre);
        this.nombre = nombre;
    }

    @Override
    public void alimentarse() {
        System.out.println("Se alimenta de plantas,frutas ,etc ");
    }
}
