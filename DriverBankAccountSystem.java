package BankAccountWithTransferFeature;

/**
 * DriverBankAccountSystem
 */
public class DriverBankAccountSystem {
    public static void main(String[] args) {
        bankTransferFeature_Account tom = new bankTransferFeature_Account("Tom"); /*¿Qué significa instanciar una clase en Java?
        La instanciación es el proceso de leer o especificar información, como los valores y el tipo de almacenamiento de un campo de datos. */
        tom.deposit(500.0);
        bankTransferFeature_Account sandy = new bankTransferFeature_Account("Sandy");
        sandy.deposit(200.0);
        tom.transfer(100.0, sandy);
        sandy.withdraw(50.0);
        sandy.withdraw(600.0);
        System.out.println(sandy.getBalance());
    }
    
}