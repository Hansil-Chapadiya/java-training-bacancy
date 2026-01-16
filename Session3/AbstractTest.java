package Session3;

public class AbstractTest extends AbstarctClass {

    AbstractTest(){
        super();
    }

    public void showDetails() {
        System.out.println("I have implemented abstarct method");
    }

    public static void main(String[] args) {
        
        AbstarctClass ab = new AbstractTest();
        ab.showDetails();

    }
}
