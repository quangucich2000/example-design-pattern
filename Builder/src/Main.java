public class Main {
    public static void main(String[] args) {
        BankAccount newAccount = new BankAccount
                .BankAccountBuilder("GP Coder", "0123456789")
                .withEmail("contact@gpcoder.com")
                .wantNewsletter(true)
                .build();
        System.out.println(newAccount);
    }
}