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
public class Alumno {
    
    private Integer id;
    private String name;
    private TypeDoc TypeDoc;

    /**
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the TypeDoc
     */
    public TypeDoc getTypeDoc() {
        return TypeDoc;
    }

    /**
     * @param TypeDoc the TypeDoc to set
     */
    public void setTypeDoc(TypeDoc TypeDoc) {
        this.TypeDoc = TypeDoc;
    }

    @Override
    public String toString() {
        return "Alumno{" + "id=" + id + ", name=" + name + ", TypeDoc=" + TypeDoc + '}';
    }
    
    
}
