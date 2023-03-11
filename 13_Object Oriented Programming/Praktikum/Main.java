public class Main {
    public static void main(String[] args) {
        Product product = new Product();
        product.setNama("coffee");
        product.setDeskripsi("this is coffee");
        product.setHarga(15000);
        product.setStok(10);
        product.getInfo();


        product.setNama("milk");
        product.setDeskripsi("this is fresh milk");
        product.setHarga(25000);
        product.setStok(10);
        product.getInfo();


        product.setNama("apple juice");
        product.setDeskripsi(" this is juice");
        product.setHarga(18000);
        product.setStok(20);
        product.getInfo();
    }
}
