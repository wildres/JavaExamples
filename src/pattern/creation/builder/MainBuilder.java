/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pattern.creation.builder;



/**
 *
 * @author andresalarcon
 */
public class MainBuilder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BuiderAlumno builderAlumno = new BuiderAlumno();
        Alumno alumno=builderAlumno.withId(12).withName("andres").build();
        System.out.println(alumno.toString());
    }
    
}
