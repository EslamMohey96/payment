public class cash extends payment{
    private float cashTendered ;
    public cash(){
        set_printBehavior(new printCashTrans());
        set_authorizeBehavior(new authorizedNon());;
    }
}