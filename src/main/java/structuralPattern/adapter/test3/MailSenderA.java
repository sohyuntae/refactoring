package structuralPattern.adapter.test3;

public interface MailSenderA {
    void send(String sendInfo);
}

class SolutionA implements MailSenderA {

    @Override
    public void send(String sendInfo) {
        System.out.println("A 솔루션 회사에서 메일 발송 : " + sendInfo);
    }
}
