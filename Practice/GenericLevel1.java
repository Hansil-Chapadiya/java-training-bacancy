package Practice;

public class GenericLevel1<T> {

    T t;

    T getT(){
        return  this.t;
    }

    void set(T t){

        this.t = t;
    }

    public static void main(String[] args) {

        GenericLevel1<Integer> gl1 = new GenericLevel1<>();
        gl1.set(10);

        System.out.println(gl1.getT());

        GenericLevel1<Character> gl2 = new GenericLevel1<>();
        gl2.set('H');

        System.out.println(gl2.getT());

        GenericLevel1<String> gl3= new GenericLevel1<>();
        gl3.set("Hansil the Great");

        System.out.println(gl3.getT());

    }

}
