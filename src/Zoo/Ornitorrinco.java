package Zoo;

public class Ornitorrinco extends Mamifero implements Oviparo{

    public Ornitorrinco(Integer idAnimal, String nombre, Integer edad, Integer cantidadCrias) {
        super(idAnimal, nombre, edad, cantidadCrias);
    }



    @Override
    public void ponerHuevos(){
        System.out.println(getNombre() + " pone huevos.");
    }


}
