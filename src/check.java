public class check extends payment{
    private String name ;
    private String bankiD ;
    public check(){
        set_printBehavior(new printNon());
        set_authorizeBehavior(new authorizeCheck());;
    }
}
