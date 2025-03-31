public class Employee {
    private String employee_id;
    private String employee_name;
    private int employee_salary;

    public Employee( String employee_id, String employee_name, int employee_salary ) {
        this.employee_id = employee_id;
        this.employee_name = employee_name;
        this.employee_salary = employee_salary;
    }
    
    public String getid() {
        return employee_id;
    }
    
    public String getName() {
        return employee_name;
    }
    
    public String getSalary() {
        String salaryOutput = Integer.toString(this.employee_salary);
        return salaryOutput;
    }
        
    public void setid(String employee_id) {
        this.employee_id = employee_id;
    }
    
    public void setName(String name) {
        this.employee_name = name;
    }
    
}