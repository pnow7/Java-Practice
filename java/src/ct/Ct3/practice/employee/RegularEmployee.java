package ct.Ct3.practice.employee;

public class RegularEmployee extends Employee { 

    public RegularEmployee(String name, int baseSalary) {
        super(name, baseSalary);
    }

    @Override
    public int calculateSalary() {
        return baseSalary;
    }
    
}
