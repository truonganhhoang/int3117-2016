package numeric;

public class IsNumeric {

    public boolean is_Numeric(String number) {
        if (number == null || number.isEmpty()) {
            return false;
        }
        int length = number.length();
        if (number.charAt(0) == '-') {
            if (length <= 1) {
                return false;
            }
        }
        String is_replaced_number = number.replace(".", "");
        int count_decimal = length - is_replaced_number.length(); // eror here if max int
        if (count_decimal == 0 || count_decimal == 1) { 
            length = is_replaced_number.length(); // error here if max int
            for (int index = 0; index < length; index++) { // out of langer 
                if (index == 0 && is_replaced_number.charAt(0) == '-') {
                    continue;
                } else if (!Character.isDigit(is_replaced_number.charAt(index))) {
                    return false;
                }
            }
        } else {
            return false;
        }

        return true;
    }
}
