package Zoo;

public class Pez extends Animal implements Oviparo{


    public Pez(Integer idAnimal, String nombre, Integer edad) {
        super(idAnimal, nombre, edad);
    }

    @Override
    public void ponerHuevos() {

    }
}
