package structuralPattern.adapter.test3;

public class AdapterMain {
    public static void main(String[] arg) {
        MailSenderA senderA = new SolutionA();
        senderA.send("기존 발송 메일");

        senderA = new Adapter(new SolutionB());
        senderA.send("TO-BE 발송 메일");
    }
}
