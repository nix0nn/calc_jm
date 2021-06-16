public class Operation {
    int result = 0;


    public int calc(int x, int y, String operator){
        switch (operator){
            case "+":
                result = x + y;
                break;
            case "-":
                result = x - y;
                break;
            case "*":
                result = x * y;
                break;
            case "/":
                result = x / y;
                break;
        }
        return result;
    }
}
