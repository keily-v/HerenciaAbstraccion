package dominio;

public class AnimalCarnivoro extends Animal {

    public AnimalCarnivoro(String nombre) {
        super(nombre);
        this.nombre = nombre;
    }

    @Override
    public void alimentarse() {
        System.out.println("Se alimenta de carne");
    }
}
