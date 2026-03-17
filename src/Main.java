public class Main {
    public static void main(String[] args) {

        Product jeans = new Product("Джинсы", 50.0, 10);

        Product tshirt = new Product("Майка", 30.0, 20);

        System.out.println(jeans.name + ": цена " + jeans.price + ", кол-во " + jeans.quantity);
        System.out.println(tshirt.name + ": цена " + tshirt.price + ", кол-во " + tshirt.quantity);
    }
}