package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenericLevel4{

    List<? extends  Number> list;

    public void setList(List<? extends Number> list){
        this.list = list;
    }

    public  List<? extends Number> getList(){
        return  this.list;
    }

//    public <T> void display(Integer<?> i){
//
//    };

    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>(Arrays.asList(1,2,3,4));
        GenericLevel4 g1 = new GenericLevel4();
        g1.setList(l);
        System.out.println(g1.getList());
    }
}

