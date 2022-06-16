public class Main {
    public static void main(String[] args) {
        String retval;
        for (int i = 1; i <= 100; i++){
            retval = "";
            if (i % 3 == 0)  {
                retval += "Fizz";
                if (i % 5 == 0) retval += " Buzz";
            }
            else if (i % 5 == 0) retval += "Buzz";
            else retval += i;
            System.out.println(retval);
        }

    }
}