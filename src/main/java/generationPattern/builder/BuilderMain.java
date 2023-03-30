package generationPattern.builder;

/* 빌더 패턴
* 빌더 패턴은 많은 Optional한 멤버 변수(혹은 파라미터)나 지속성 없는 상태 값들에 대해 처리해야 하는 문제들을 해결 한다.
*
* 필수 값인 HDD와 RAM 속성에 대해서는 생성자로 받고 Optional한 값인 BluetoothEnabled와 GraphicsCardEnabled에 대해서는 메소드를 통해 선택적으로 입력 받고 있다.
* 즉, BluetoothEnabled 값이 필요 없는 객체라면 setBluetoothEnabled() 메소드를 사용하지 않으면 된다.
* */
public class BuilderMain {
    public static void main(String[] arg) {
        Computer comp = new Computer.ComputerBuilder("500 GB", "2 GB")
                .setBluetoothEnabled(true)
                .setGraphicsCardEnabled(true)
                .build();

        System.out.println(comp.toString());
    }
}
