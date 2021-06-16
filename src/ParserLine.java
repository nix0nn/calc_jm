public class ParserLine {

    // замена пробелов, перевод в верхний регистр, переопределение в массив символов
    public static char[] processingL1(String variable){
        variable = variable.replaceAll("\\s+", "");
        variable = variable.toUpperCase();
        return variable.toCharArray();
    }

    // валидация строки на соответствие символам алфавита и т.д. + возвращает знак арифметической операции
    public static String processingL2(char[] arr) throws Exception {
        char[] alphabet = new char[] {'+', '-', '*', '/', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', 'I', 'V', 'X' };
        int l = 0; // общий счетчик символов
        int pos = -1; // позиция знака
        int k = 0; // счетчик знаков

        for (int i=0; i<arr.length; i++){
            for (int j = 0; j<alphabet.length; j++){
                if (arr[i] == alphabet[j]){
                    // поиск арифметического знака в массиве
                    if (arr[i] == alphabet[0] || arr[i] == alphabet[1] || arr[i] == alphabet[2] || arr[i] == alphabet[3]){
                        pos = i;
                        k ++;
                        }
                    l++;
                }
            }
        }

        if (k > 1 || pos < 0 || pos == 0 || pos == arr.length-1){
            throw new Exception("invalid input");
        }
        if (l != arr.length){
            throw new Exception("invalid input");
        }
        if (arr.length < 3 || arr.length > 9){
            throw new Exception("invalid input");
        }

        return new String(arr, pos, 1);
    }
    // проверка операндов
    public static void processingL3(String [] operand) throws Exception {
        try {
            int left = Integer.parseInt(operand[0]);
            int right = Integer.parseInt(operand[1]);

            if (left > 10 || left < 1 || right > 10 || right < 1){
                throw new Exception("invalid input");
            }
        } catch (NumberFormatException ex){
            throw new Exception("invalid input format");
        }
    }
    public static boolean isNumber(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) return false;
        }
        return true;
    }

}