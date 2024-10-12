/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SimpleBankingSystem;

/**
 *
 * @author jowie james
 */
public class BankNumber {

    public static int BankNumb = 1;

    public static void main(String[] args) {
        
        getBankN();
        System.out.println(getBankN());

    }
    private static int getBankN() {
        
        return BankNumb + 1;
        
        
    }
    

}
