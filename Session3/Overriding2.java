package Session3;

public class Overriding2 extends Overriding1{
    
    int val;
    Overriding2(){

    }
    Overriding2(int val){
        this.val = 0;
    }
    @Override
    public void getMessage(){
        
        super.getMessage();

        System.out.println("After Calling parent method");
        System.out.println("Chid -> Overriding2 is called ");
    }

}
