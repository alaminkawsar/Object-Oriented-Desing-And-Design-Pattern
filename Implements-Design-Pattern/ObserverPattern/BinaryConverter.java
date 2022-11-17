public class BinaryConverter extends Observer {
    public BinaryConverter(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }
    public void update(){
        System.out.println("Binary String: " + Integer.toBinaryString(subject.getState()));
    }
}
