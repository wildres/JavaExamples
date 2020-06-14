/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pattern.creation.proxy.dynamic;

/**
 *Clase que imp,ementa las funconalidades de la logica de negocio
 * @author andresalarcon
 */
public class UserManagerImpl implements Manager {

    @Override
    public void save(Object obj) {        
        System.out.println("I save user Objects");
    }

    @Override
    public void remove(Integer id) {
        System.out.println("I remove user objects");
    }

    @Override
    public void update(Integer name) {
        System.out.println("Update to "+name);
    }

}