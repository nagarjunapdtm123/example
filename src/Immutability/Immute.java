package Immutability;

public final class Immute {
   private final Integer empno;
    private final String name;
    private final String deptname;
    private final Integer deptid;
    private final Double empsal;

    public Integer getEmpno() {
        return empno;
    }

    public String getName() {
        return name;
    }

    public String getDeptname() {
        return deptname;
    }

    public Integer getDeptid() {
        return deptid;
    }

    public Double getEmpsal() {
        return empsal;
    }

    public Immute(Integer empno, String name, String deptname, Integer deptid, Double empsal) {
        this.empno = empno;
        this.name = name;
        this.deptname = deptname;
        this.deptid = deptid;
        this.empsal = empsal;

    }
}
