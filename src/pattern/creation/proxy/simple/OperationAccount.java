/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pattern.creation.proxy.simple;

/**
 *
 * @author andresalarcon
 */
public class OperationAccount implements IOperationAccount{

    
    @Override
    public void addMoney(Account account, Integer money) {
        account.setTotal(account.getTotal()+money);
        System.out.println("New Value "+account.getTotal());
    }
    
}
