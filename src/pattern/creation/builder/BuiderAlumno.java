/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pattern.creation.builder;

/**
 * Este patron se usa para crear objetos complejos a traves de un solo metodo que sea
 * mas sencillo "build" es recomendable crear una interfaz con este metodo que retorne el tipo de objeto
 * que se quiere crear.
 * Esta clase build deberia tener un metodo por cada atributo de la clase
 * que se quiera crear que inicie con with seguido del nombre del atributo y que retorne la misma instancia
 * en la implementacion del metodo build se construye el objeto que se requiere y se le sete cada valor del atributo
 * 
 * Hay varias formas de implementarlo.
 * 
 * @author andresalarcon
 */
public class BuiderAlumno implements IBuilderAlumno{
    
    private Integer id;
    private String name;
    
    public BuiderAlumno withId(Integer id){
        this.id=id;
        return this;
    }
    
     public BuiderAlumno withName(String name){
        this.name=name;
        return this;
    }

    @Override
    public Alumno build() {
        Alumno alumno = new Alumno();
        alumno.setId(this.id);
        alumno.setName(this.name);
        return alumno;
    }
   
}
