public class ObserverDemo {
    public static void main(String[] args) {
        
        Subject subject = new Subject();
        System.out.println();
        new BinaryConverter(subject);
        new HexConverter(subject);
        new OctalObserver(subject);
        subject.setState(15);
        System.out.println();

    }
}
