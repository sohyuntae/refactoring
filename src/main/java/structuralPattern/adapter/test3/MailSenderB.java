package structuralPattern.adapter.test3;

public interface MailSenderB {
    void sendApi(String sendInfo);
}

class SolutionB implements MailSenderB {

    @Override
    public void sendApi(String sendInfo) {
        System.out.println("B 솔루션 회사에서 메일 발송 : " + sendInfo);
    }
}
