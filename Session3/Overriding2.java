package Session3;

public class Overriding2 extends Overriding1{
    
    @Override
    public void getMessage(){
        
        super.getMessage();

        System.out.println("After Calling parent method");
        System.out.println("Chid -> Overriding2 is called ");
    }

}
