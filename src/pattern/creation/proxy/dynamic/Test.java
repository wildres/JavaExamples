/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pattern.creation.proxy.dynamic;

/**
 *
 * @author andresalarcon
 */
public class Test {
    
    public static void main(String[] args) {
        // Creamos ahora la factoria
        FactoryManager factory = new FactoryManager();
        
        // Usamos la factoria para crear un Proxy sobre UserManagerImpl
        Manager manager = factory.createManager(UserManagerImpl.class);
        Object obj = new Object();
        // Invocamos a los métodos:
        manager.save(obj);
        manager.remove(1);
        manager.update(4);
        
    }

}
