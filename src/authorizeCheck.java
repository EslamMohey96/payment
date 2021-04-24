
public class authorizeCheck implements iauthorizeBehavior {
    @Override
    public String authorized() {
        return "authorized checked";
    }
}