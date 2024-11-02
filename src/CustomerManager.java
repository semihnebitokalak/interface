public class CustomerManager {

    // Bunun farklı bir kontrolü de mevcuttur. Onu da gösterelim.

    ICustomerDal customerDal;

//    public CustomerManager(ICustomerDal customerDal) {
//        this.customerDal = customerDal;
//    }
    // Eğer yukarıdaki kodu kullanmak istiyorsak bu class içerisinde 5. satırı private yapmamız lazım ve
    // Main class ta 16.satırı değiştirmemiz gerekir.
    // Şöyleki oluşturduğumuz fonksiyon parametre istiyor ve biz o satırı şöyle yazmalıyız.
    //  CustomerManager customerManager = new CustomerManager(OracleCustomerDal);

    public void add(){
        // Zaten dal da add fonksiyonu vardı diye bir şey sorarsanız eğer
        // Burada iş kodları yazılır.
        // OracleCustomerDal oracleCustomerDal = new OracleCustomerDal();
        // Eğer yukarıdaki gibi yaparsak eywahlar olsun. Artık burası sadece oracle a bağlı olur.
        // Önceden öğrendiğimiz strateji ile yapabiliriz.
        customerDal.Add();

    }
}
