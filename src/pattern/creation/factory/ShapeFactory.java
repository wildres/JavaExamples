package pattern.creation.factory;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author andresalarcon
 */
public class ShapeFactory {

   public static Shape build(Object object){
       Shape shape=null;
       if(object instanceof Circle){
           shape=new Circle();
       }else if(object instanceof Triangle){
           shape=new Triangle();
       }
       return shape;
   }
    
}
