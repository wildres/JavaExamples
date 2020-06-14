/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pattern.creation.proxy.dynamic;

import java.lang.reflect.Proxy;

/**
 *
 * @author andresalarcon
 */
public class FactoryManager {
    
        public Manager createManager(Class claseManager) {
             
            Manager realManager = null;
            
            try {
                // Creamos un objeto de la clase que recibimos.
                realManager = (Manager)claseManager.newInstance();
     
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
            
          /* Creamos el CallBack Handler y le pasamos el objeto 
            real para ser invocado posteriormente en su método invoke. */
         
            ManagerHandler handler = new ManagerHandler(realManager);
            // Creamos el proxy.
            Class[] interfacesQueEncapsulo = new Class[] {Manager.class};   
            return (Manager)Proxy.newProxyInstance(claseManager.getClassLoader(),interfacesQueEncapsulo,handler);                   
        }     
}