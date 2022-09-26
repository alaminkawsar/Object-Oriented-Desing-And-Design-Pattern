public class AuthorizationChain {
    Processor chain;

    public AuthorizationChain(){
        buildChain();
    }

    public boolean authorizeWithdrawal(Account account, int amount){

        return true;
    }

  
    private void buildChain(){
        chain = new SeniorOfficer(new Manager(new Cashier(null)));
    }

    public void process(Account request) {
        chain.process(request);
    }


    
}
