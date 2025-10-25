package ct.Ct3.p_abstract;

public class EmployeeTest {
    
    public static void main(String[] args) {
        RegularEmployee regular = new RegularEmployee("홍길동", 500000000);
        ContractEmployee contract = new ContractEmployee("박현재", 300000000);

        Employee[] employees = new Employee[2];
        employees[0] = regular;
        employees[1] = contract;

        System.out.println("직원 최종 급여 계산");

        for (Employee emp : employees) {
            int finalSalary = emp.calculateSalary();
            System.out.println(emp.getName() + "의 최종 급여: " + finalSalary + "원");
        }
    }
    
}
