/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package account;

/**
 *
 * @author ASUS AIO
 */
public class Run {
    
    public static void main(String[] args) {
        Account acc1 = new Account("id001", "nga");
        System.out.println(acc1);
        
        // Nap tien
        acc1.credit(1000);
        System.out.println("Sau khi nap 1000 : " + acc1);
        
        acc1.debit(500);
        System.out.println("Sau khi rut 200 :" + acc1);
        
        Account acc2 = new Account("id002", "nhi", 8000);
        
        acc1.transferTo(acc2, 300);
        System.out.println("Sau khi acc1 chuyen khoan cho acc2 300 :" + acc1);
        System.out.println("Sau khi acc2 nhan 300 tu acc1 :" + acc2);

    }
}
