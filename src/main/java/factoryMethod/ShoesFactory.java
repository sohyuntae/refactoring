package factoryMethod;

public class ShoesFactory {
    final Shoes orderShoes(String name, String email) {
        validate(name, email);

        Shoes shoes = createShoes(name);

        sendEmailTo(email, shoes);

        return shoes;
    }

    public void validate(String name, String email) {
        if (name == null) {
            throw new IllegalArgumentException("이름을 정해주세요.");
        }
        if (email == null) {
            throw new IllegalArgumentException("email을 적어주세요.");
        }
    }

    private Shoes createShoes(String name) {
        Shoes shoes = null;
        if(name.equalsIgnoreCase("nike")) {
            shoes = new NikeShoes("나이키", "Nike", "운동화");
        } else if (name.equalsIgnoreCase("adidas")) {
            shoes = new AdidasShoes("아디다스", "adidas", "축구화");
        }

        return shoes;
    }

    private void sendEmailTo(String email, Shoes shoes) {
        System.out.println(shoes.name + " 다 만들었다고 " + email + "로 메일을 보냈습니다.");
    }
}
