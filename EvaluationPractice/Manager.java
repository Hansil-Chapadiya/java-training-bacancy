package EvaluationPractice;

public class Manager extends  Employee{

    @Override
    public int CaluclateSalary(){
        int base = super.CaluclateSalary();
        return base + 10000;
    }
}
