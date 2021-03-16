package _13SOLID._1single_reponsibility_principle.example_from_slide;

public class EmployeeReportFormatter extends ReportFormatter{

    public EmployeeReportFormatter(Object o, FormatType formatType){
        super(o, formatType);
    }

    public String getFormattedEmployee(){
        return formattedOutput;
    }

}
