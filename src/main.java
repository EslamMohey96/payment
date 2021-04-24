public class main {
    public static void main(String[] args) {
        cash s = new cash();
        System.out.println(s.get_authorizeBehavior().authorized());
        System.out.println(s.get_printBehavior().printReceipt());
        
    }
}
