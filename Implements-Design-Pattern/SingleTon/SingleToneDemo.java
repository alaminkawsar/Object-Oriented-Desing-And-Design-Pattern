public class SingleToneDemo {
    public static void main(String[] args) {
        SingleTone singleTone = SingleTone.getInstances();
        singleTone.message();
        SingleTone singleTone1 = SingleTone.getInstances();
        singleTone1.message();

    }
}
