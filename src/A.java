import java.util.Date;

public abstract class A {
    private String A1 = "aaa";

    public String getA1() {
        return A1;
    }

    public void setA1(String a1) {
        A1 = a1;
    }

    private int A2;

    public int getA2() {
        return A2;
    }

    public void setA2(int a2) {
        if (a2 < 0) {
            A2 = 0;
        } else if (a2 >= 100) {
            A2 = 100;
        } else {
            A2 = a2;
        }
    }

    public abstract int foo(Date dt);

    public void buzz() {
    }
}
