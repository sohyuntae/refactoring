package factoryMethod;

public class FactoryMethod {
    public static void main(String[] arg) {
        Shoes nikeShoes = new ShoesFactory().orderShoes("nike", "test@gmail.com");
        System.out.println(nikeShoes);
    }
}
