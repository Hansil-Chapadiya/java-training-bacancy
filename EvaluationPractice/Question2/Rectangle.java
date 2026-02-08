package EvaluationPractice.Question2;

public class Rectangle extends  Shape{

    int length;
    int breadth;

    Rectangle(int b, int l){
        this.breadth = b;
        this.length = l;
    }

    public double area(){

        return  breadth * length;

    }

}
