import java.util.ArrayList;
import java.util.Collections; //Provides sorting

public class Company {

    private ArrayList<Employee> allEmployees;
    private ArrayList<Team> allTeams;

    private static Company instance = new Company();

    public Company() {
        allEmployees = new ArrayList<Employee>();
        allTeams = new ArrayList<Team>();
    }

    public static Company getInstance() {
        return instance;
    }

    public void listTeams() {
        Team.list(allTeams);
    }

    public void listEmployee(){
        for (Employee employee : allEmployees) {
            System.out.println(employee.getName());
        }
    }

    public Employee createEmployee(String name) // See how it is called in main()
    {
        Employee e = new Employee(name);
        allEmployees.add(e);
        Collections.sort(allEmployees); // allEmployees
        return e;
    }

    public void removeEmployee(Employee e){
        allEmployees.remove(e);
        Collections.sort(allEmployees); // allEmployees
    }

    public void addEmployee(Employee e){
        allEmployees.add(e);
        Collections.sort(allEmployees); // allEmployees
    }

    public Team createTeam(String teamName, String headName) // See how it is called in main()
    {
        Employee e = Employee.searchEmployee(allEmployees, headName);
        Team t = new Team(teamName, e);
        allTeams.add(t);
        Collections.sort(allTeams); // allTeams
        return t; // Why return? Ans: Later you'll find it useful for undoable comments.
    }
    public void addTeam(Team team){
        allTeams.add(team);
        Collections.sort(allTeams);
    }

    public void removeTeam(Team team){
        allTeams.remove(team);
        Collections.sort(allTeams);
    }
}
