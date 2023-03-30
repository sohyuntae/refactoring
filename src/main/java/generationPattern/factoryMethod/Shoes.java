package generationPattern.factoryMethod;

public class Shoes {
    String name, brand, kind;

    public String toString(){
        return "brand : " + brand + "name : " + name + "kind : " + kind;
    }
}

class NikeShoes extends Shoes {
    NikeShoes(String name, String brand, String kind) {
        this.name = name;
        this.brand = brand;
        this.kind = kind;
    }

}

class AdidasShoes extends Shoes {
    AdidasShoes(String name, String brand, String kind) {
        this.name = name;
        this.brand = brand;
        this.kind = kind;
    }
}
