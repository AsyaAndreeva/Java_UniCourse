package University;

public class ObjectWithDurationImpl implements Recordable {
    private double duration;

    @Override
    public void record() {
        System.out.println("Recording" + duration);
    }
}
