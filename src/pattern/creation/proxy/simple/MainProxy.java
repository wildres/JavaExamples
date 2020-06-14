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
public class MainProxy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ProxyOperationAccount proxyOperationAccount = new ProxyOperationAccount();
        Account account = new Account(10);
        proxyOperationAccount.addMoney(account, 50);
    }
    
}
