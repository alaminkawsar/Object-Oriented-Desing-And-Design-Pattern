class SeniorOfficer extends Processor
{
 
    public SeniorOfficer(Processor nextProcessor){
        super(nextProcessor);
    }
 
    public void process(Account request)
    {
        if (request.getAmmount()<1000000000)
        {
            System.out.println("Transaction : " + request.getAmmount()+ " is successful from SeniorOfficer");
        }
        else
        {
            super.process(request);
        }
    }
}