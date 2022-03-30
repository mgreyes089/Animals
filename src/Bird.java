public class Bird extends Animal {
    private double wingSize;

    public Bird(double height, double weight,double wingSize) throws Exception {
        super(height, weight);
        checkWing(wingSize);
        this.wingSize=wingSize;
    }

    private void checkWing(double wingSize) throws Exception {
        if(wingSize<=0) throw new Exception();
    }

    public void fly(){

    }
}
