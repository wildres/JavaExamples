/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pattern.creation.proxy.simple;


/**
 * Este patron Proxy permite agregar alguna funcionalidad a una funcionalidad sin modificar la original.
 * El patron dice que se debe crear una clase que implemente la misma interfaz de la clase original yq eu tenga como 
 * atributo la clase original
 * @author andresalarcon
 */
public class ProxyOperationAccount implements IOperationAccount{
    
    private OperationAccount operationAccount;

    @Override
    public void addMoney(Account account, Integer money) {
        if(operationAccount==null){
            operationAccount = new OperationAccount();
            operationAccount.addMoney(account, money);
        }
      
        System.out.println("Debitando 5 despues de agregada la cuenta al dinero a traves del proxy");
        account.setTotal(account.getTotal()-5);
        System.out.println("Valuew final "+account.getTotal());
    }
   
}
