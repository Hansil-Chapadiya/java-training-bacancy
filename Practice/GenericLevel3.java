package Practice;

public class GenericLevel3<T extends Number> {

    T getSum(T tnum1, T tnum2) {

        if (tnum1 == null || tnum2 == null) {
            return null;
        } else if (tnum1 instanceof Double && tnum2 instanceof Double) {

            return (T) new Double(tnum1.doubleValue() + tnum2.doubleValue());
        } else if (tnum1 instanceof Integer && tnum2 instanceof Integer) {

            return (T) new Integer((tnum1.intValue() + tnum2.intValue()));

        } else {
            throw new IllegalArgumentException();
        }

    }

    public static void main(String[] args) {

        GenericLevel3<Double> dSum = new GenericLevel3<>();
        System.out.println(dSum.getSum(12.0, 23.0));

        GenericLevel3<Integer> iSum = new GenericLevel3<>();
        System.out.println(iSum.getSum(12,13));

//        GenericLevel3<String> sSum = new GenericLevel3<>();
//        System.out.println(sSum.getSum("Hello", "World"));

    }

}
