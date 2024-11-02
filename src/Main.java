public class Main {
    public static void main(String[] args) {
//        ICustomerDal customerDal = new ICustomerDal() {
//            @Override
//            public void add() {
//            }
        // Interface, abstract gibi new'lenemez.
        // Ama onu implamente eden class'ı new'leyebilir.
        ICustomerDal customerDal = new OracleCustomerDal();
        // Bu şekilde yapabiliriz.
// Class lar birden fazla interface i imlemente edebilir. Bunu MySqlCustomerDal da görebilirsiniz.
// Ama 1 tane class ı extend edebilir.
        // Interface ler referans tutucudurlar.
        // Interface oluşturma imzası çok basit = public interface ......
        // Bunu kullanabilmek için de implemente etmek gerekiyor.
        CustomerManager customerManager = new CustomerManager();
        // customerManager.add();
        // eğer yukarıdaki gibi customer manager ı new yaparsak interface i new yapmış oluruz ve hata alırız.
        // Çünkü interface ve abstructlar new'lenemez.
        // O yüzden şöyle yaparız
        customerManager.customerDal = new OracleCustomerDal();
        customerManager.add();
        customerManager.customerDal = new MySqlCustomerDal();
        customerManager.add();




    }
}