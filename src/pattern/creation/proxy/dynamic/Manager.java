/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pattern.creation.proxy.dynamic;

/**
 * Interfaz que define las funcionalidades de negocio
 * @author andresalarcon
 */
public interface Manager {
    void save(Object obj);
    void remove(Integer id);  
    void update(Integer name);
    
}
