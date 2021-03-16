package _13SOLID._1single_reponsibility_principle.example_from_slide;

public class EmployeeDAO {

    public void saveEmployee(Employee employee){
        System.out.println(employee + ": saved");
    }

    public void deleteEmployee(Employee employee){
        System.out.println(employee + ": deleted");
    }

}
