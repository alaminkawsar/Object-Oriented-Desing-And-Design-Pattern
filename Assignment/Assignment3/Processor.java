abstract class Processor
{
    private Processor nextProcessor;
 
    public Processor(Processor nextProcessor){
        this.nextProcessor = nextProcessor;
    };
     
    public void process(Account request){
        if(nextProcessor != null)
            nextProcessor.process(request);
    };
}