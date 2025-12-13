package ct.ct3.p_abstract;

public abstract class Employee {

    protected String name;
    protected int baseSalary;

    // 생성자 (자식 클래스(Contract, Reqular에서 super()로 호출됨)
    public Employee(String name, int baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public String getName() {
        return name;
    }

    public abstract int calculateSalary();

}
