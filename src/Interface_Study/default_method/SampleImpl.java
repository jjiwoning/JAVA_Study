package Interface_Study.default_method;

public class SampleImpl implements Sample1, Sample2 {

    @Override
    public void sample() {
        Sample1.super.sample();
    }
}
