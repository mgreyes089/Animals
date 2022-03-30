public class Animal {
    private double height;
    private double weight;

    public Animal(double height, double weight) throws Exception {
        checkHeight(height);
        checkWeight(weight);
        this.height=height;
        this.weight=weight;
    }

    private void checkWeight(double weight) throws Exception {
        if(weight<=0) throw new Exception();
    }

    private void checkHeight(double height) throws Exception {
        if(height<=0) throw new Exception();
    }

    public void run(){

    }

    public void eat(){

    }
}
