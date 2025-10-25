package ct.Ct3.practice.employee;

public class RegularEmployee extends Employee { 

    public RegularEmployee(String name, int baseSalary) {
        super(name, baseSalary);
    }

    // ContractEmployee.java 같은 함수 (동시 사용)
    @Override
    public int calculateSalary() {
        return baseSalary;
    }
    
}
