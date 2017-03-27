public class isEven {

    public boolean check(int n){
        if ((n & 1) == 0) {
            System.out.println("Число " + n + " - четное");
            return true;
        } else {
            System.out.println("Число " + n + " - нечетное");
            return false;
        }
    }

    public boolean check1(int m){
        if (m%2==0) {
            System.out.println("Число " + m + " - четное");
            return true;
        } else {
            System.out.println("Число " + m + " - нечетное");
            return false;
        }
    }

    public boolean incorrectCheck(int p){
        if ((p*2)>0) {
            System.out.println("Число " + p + " - четное");
            return true;
        } else {
            System.out.println("Число " + p + " - нечетное");
            return false;
        }
    }
}

