/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pattern.creation.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 *
 * @author andresalarcon
 */
public class ManagerHandler implements InvocationHandler {
    
    Manager realManager = null;
    
    public ManagerHandler(Manager realManager) {
        this.realManager = realManager;
    }
    
    /* Este es el método callback que será invocado previamente a cada método de          los managers. */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {   
        System.out.println(".... Metodo invocado {"+method.getName() + "} de la clase {"+realManager.getClass().getName()+"}");
        System.out.println("Este metodo invoke se llama autoamticamente cuando se implementa un proxy "+method.getName());       
        //Continuamos invocando al Manager real.
        Object object =method.invoke(realManager,args);
        System.out.println(".... Termino metodo {"+method.getName()+"}");
        return object ;
    }

}
