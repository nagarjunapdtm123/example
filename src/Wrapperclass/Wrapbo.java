package Wrapperclass;

public class Wrapbo {
    private int a=124;
   private float f=2324.7f;
    char c;
    private Integer i=Integer.valueOf(a); //boxing example
private Float f1=Float.valueOf(f);

    public Float getF1() {
        return f1;
    }

    public void setF1(Float f1) {
        this.f1 = f1;
    }

    public float getF() {
        return f;
    }

    public void setF(float f) {
        this.f = f;
    }

    public Integer getI() {
        return i;
    }

    public void setI(Integer i) {
        this.i = i;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }
}
