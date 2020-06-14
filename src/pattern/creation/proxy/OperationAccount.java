/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pattern.creation.proxy;

/**
 *
 * @author andresalarcon
 */
public class OperationAccount implements IOperationAccount{

    private Integer money;
    private Account account;
    
    public void receiveCash(Account account, Integer money){
        System.out.println("Received Total: "+money);
        this.money=money;
        this.account=account;
    }
    
    @Override
    public void addMoney() {
        account.setTotal(account.getTotal()+money);
        System.out.println("New Value "+account.getTotal());
    }
    
}
