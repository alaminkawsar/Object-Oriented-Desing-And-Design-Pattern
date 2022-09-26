class Cashier extends Processor
{
 
    public Cashier(Processor nextProcessor){
        super(nextProcessor);
    }
 
    public void process(Account request)
    {
        if (request.getAmmount()<10000)
        {
            System.out.println("Transaction : " + request.getAmmount()+ " is successful from Cashier");
        }
        else
        {
            super.process(request);
        }
    }
}