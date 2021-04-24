public abstract class payment {
    private float amount ;
    private iauthorizeBehavior authorizeBehavior ; 
    private iprintBehavior printBehavior;
    
    public void set_authorizeBehavior(iauthorizeBehavior authorizeBehavior){
        this.authorizeBehavior =authorizeBehavior;
    } 
    public void set_printBehavior(iprintBehavior printBehavior){
        this.printBehavior=printBehavior ;
    }
    public iauthorizeBehavior get_authorizeBehavior(){
        return authorizeBehavior;
    } 
    public iprintBehavior get_printBehavior(){
        return printBehavior ;
    }
}
