public class EmailApp {
    public static void main(String[] args) {
        Email user1 = new Email("Jathushan", "Ragavan");
        user1.showInfo();
        user1.setAlternateEmail("jathuraga@aol.com");
        user1.setMailboxCapacity(500);

        System.out.print(user1.showInfo());
    }
}
