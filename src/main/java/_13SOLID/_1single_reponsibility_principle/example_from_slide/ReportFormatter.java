package _13SOLID._1single_reponsibility_principle.example_from_slide;

public class ReportFormatter {
    protected String formattedOutput;

    public ReportFormatter(Object o, FormatType formatType){
        switch (formatType){
            case CSV:
                formattedOutput = convertObjectToCSV(o);
                break;
            case XML:
                formattedOutput = convertObjectToXML(o);
                break;
        }
    }

    private String convertObjectToXML(Object o){
        return "converted to XML " + o.toString();
    }

    private String convertObjectToCSV(Object o){
        return "converted to CSV " + o.toString();
    }



}
