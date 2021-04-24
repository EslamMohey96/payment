public class authorizeCredit2 implements iauthorizeBehavior {
    @Override
    public String authorized() {
        return "authorizeCredit2 checked";
    }
}