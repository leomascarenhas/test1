package ca.vanier;

public class Calculator {

    public static String execute(String[] args) throws Exception {
        // Should receive something like this:
        // [ "SUM", "1", "2" ]

        // Parse received values
        String operation = args[0].toUpperCase();

        double num1 = 0, num2 = 0;

        try {
            num1 = Double.valueOf(args[1]);
            num2 = Double.valueOf(args[2]);

            // { name: 'Leo', ]
            // Json object = parse(dataCommingFromClient)
        } catch (Exception e) {
            System.out.println("The numbers are not numbers :)");
            System.out.println("Log.: " + e.getMessage());
        }

        double result = 0;        

        CalculatorResponse response = new CalculatorResponse();

        // Operation condition
        if (operation.equals("SUM")) {
            return sumIT(num1, num2);
        }
        else if (operation.equals("MULTIPLY")) {
            return multiplyIT(operation, num1, num2);
        }

        // else .. 

        // Custom exception
        throw new Exception("Operation not expected");

        // new Respose()
    }

    public static String sumIT(double num1, double num2) {
        double result = num1 + num2;

        CalculatorResponse response = new CalculatorResponse();
        response.setStatus("Success");
        response.setOperation("SUM");
        response.setValue1(num1);
        response.setValue2(num2);
        response.setResult(result);

        return String.valueOf(response);
    }

    public static String sumITAgain(double num1, double num2) {
        double result = num1 + num2;
        return String.valueOf(result);
    }

    public static String multiplyIT(String operation, double num1, double num2) {
        double result = num1 * num2;

        CalculatorResponse response = new CalculatorResponse();
        response.setStatus("Success");
        response.setOperation(operation);
        response.setValue1(num1);
        response.setValue2(num2);

        return String.valueOf(response);
    }

}