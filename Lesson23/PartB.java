
//What is the output of the following code and why?


    public static int getInt() {
        try {
            return 1;
        } catch (Exception e) {
            return 2;
        } finally {
            return 3;
        }
    }

    public static void main(String[] args) {
        System.out.println(getInt());
    }

    // The code will return the value 3 because the return in finally overides all the other statments and the catch block will also never run