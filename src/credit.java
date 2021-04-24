import java.util.Date;

public class credit  extends payment{
    private String name ;
    private String type ;
    private Date expData ;
    public credit(){
        set_printBehavior(new printCashTrans());
        set_authorizeBehavior(new authorizedCredit1());
    }
}