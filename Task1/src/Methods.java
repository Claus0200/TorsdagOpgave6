public class Methods {

    public void methodA(int input1) {
        System.out.println("j");
        if (input1 >= 0) {
            System.out.println("a");
        }
        if (input1 % 4 == 0) {
            System.out.println("v");
        }
    }

    public void methodB(String text) {
        if(text.equals("?")) {
            System.out.println("a");
        }
        else {
            System.out.println("This call is now ruined, haha :D");
        }
        System.out.println("e");
        if(text.contains("?")) {
            System.out.println("r");
        }
    }

    public void methodC(double num) {
        System.out.println("s");
        int i = 0;
        while(i <= 0) {
            System.out.println("j");
            i++;
        }
        if ((int) num == 3) {
            methodD(true);
        }
    }

    public void methodD(boolean bool) {
        if(!bool) {
            System.out.println("t");
        }
        else {
            System.out.println("o  \nv");
        }
    }



}
