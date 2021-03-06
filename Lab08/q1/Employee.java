public class Employee{
    private String name;
    private int salary;
    private int annualLeaves;

    public Employee(String name, int salary, int annualLeaves){
        this.name = name;
        this.salary = salary;
        this.annualLeaves = annualLeaves;
    }

    public String getName(){
        return name;
    }

    public void addSalary(int increase){
        this.salary += increase;
    }

    public String toString(){
        return name + " ($" + salary + ", " + annualLeaves + " days)";
    }
}