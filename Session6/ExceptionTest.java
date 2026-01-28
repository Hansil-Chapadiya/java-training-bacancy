package Session6;

public class ExceptionTest {

    public void expectionCause() {

        try {

            int ans = 10/0;

        } catch (Exception e) {

//            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

}
