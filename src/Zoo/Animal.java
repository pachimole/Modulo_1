package Zoo;

import java.awt.*;
import java.util.List;
import java.util.Objects;

public abstract class Animal implements Comparable <Animal>{

    private Integer idAnimal;
    private String nombre;
    private Integer edad;

    //Constructor
    public Animal(Integer idAnimal, String nombre, Integer edad) {
        this.idAnimal = idAnimal;
        this.nombre = nombre;
        this.edad = edad;
    }

    //------------------------------------------------------------------------------------------------------------------
    //buscar por ID
    /*
    protected void buscarAvePorID(Integer ID, List lista) {
        for (Animal ave: lista) {
            if (ave.getId().equals(idAnimal)){
                System.out.println(ave.toString());
            }else System.out.println("el animal no existe.");
        }
    }
    */
    //------------------------------------------------------------------------------------------------------------------
    //GET
    protected Integer getId(){
        return this.idAnimal;
    }
    //------------------------------------------------------------------------------------------------------------------
    //GET
    protected String getNombre(){
        return this.nombre;
    }
    //SET
    protected void setNombre(String newNombre){
        nombre = newNombre;
    }
    //------------------------------------------------------------------------------------------------------------------
    //GET
    protected Integer getEdad(){
        return this.edad;
    }
    //SET
    protected void setEdad(Integer newEdad){
        edad = newEdad;
    }
    //------------------------------------------------------------------------------------------------------------------
    //toString
    @Override
    public String toString() {
        return "ID: " + idAnimal +
                ", Nombre: " + nombre +
                ", edad: " + edad +
                ' ';
    }
    //compareTo
    @Override
    public int compareTo(Animal o) {
        return getId().compareTo(o.getId());
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return Objects.equals(idAnimal, animal.idAnimal);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(idAnimal);
    }
}
