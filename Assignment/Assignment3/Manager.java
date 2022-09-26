class Manager extends Processor
{
 
    public Manager(Processor nextProcessor){
        super(nextProcessor);
    }
 
    public void process(Account request)
    {
        if (request.getAmmount()<100000)
        {
            System.out.println("Transaction : " + request.getAmmount()+ " is successful from Manager");
        }
        else
        {
            super.process(request);
        }
    }
}