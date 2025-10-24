package ct.Ct3.practice.employee;

public class ContractEmployee extends Employee {
    
    public ContractEmployee(String name, int baseSalary) {
        super(name, baseSalary);
    }

    @Override
    public int calculateSalary() {
        return baseSalary + 100000;
    }
    
}
