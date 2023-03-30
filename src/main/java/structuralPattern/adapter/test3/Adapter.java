package structuralPattern.adapter.test3;

public class Adapter implements MailSenderA {

    // Adaptee(B회사) 생성자 주입
    private final MailSenderB mailSenderB;

    public Adapter(SolutionB newSolution) {
        this.mailSenderB = newSolution;
    }

    @Override
    public void send(String sendInfo) {
        System.out.print("Using Adapter >>> ");
        // 기존 send를 호출 -> 솔루션 B의 sendApi 호출 연결
        mailSenderB.sendApi(sendInfo);
    }
}
