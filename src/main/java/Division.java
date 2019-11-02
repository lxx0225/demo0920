public class Division {
    public Integer divide(Integer a, Integer b) {
        if (b > 0) {
            return a / b;
        }
        else if (a > 100) {
            return null;
        }

        else if (b == 0) {
            return null;
        }
        else if (a < b) {
            return 0;
        }else
            return a/b;

    }

}
