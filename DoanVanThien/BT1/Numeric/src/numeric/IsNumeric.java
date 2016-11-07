package numeric;

public class IsNumeric {

    public boolean is_Numeric(String number) {
        if (number == null || number.isEmpty()) {
            return false;
        }
        long length = number.length();
        if (number.charAt(0) == '-') {
            if (length <= 1) {
                return false;
            }
        }
        String is_replaced_number = number.replace(".", "");
        long count_decimal = length - is_replaced_number.length();
        if (count_decimal == 0 || count_decimal == 1) { 
            length = is_replaced_number.length();
            int count_plus_and_minus = 0;
            for(int index = 0; index < length; index++){
                if(is_replaced_number.charAt(index) == '-' || is_replaced_number.charAt(index) == '+'){
                    count_plus_and_minus++;
                    if (count_plus_and_minus == length){
                        if (count_decimal == 1 && number.charAt(count_plus_and_minus) == '.'){
                            return true;
                        }
                        return false;
                    }
                    continue;
                } 
                if (count_plus_and_minus == length){
                    return false;
                }
                if (Character.isDigit(is_replaced_number.charAt(index))) {
                    if (index == length - 1) {
                        return true;
                    }
                    long number_index = index;
                    for(int number_index_continue = index; number_index_continue < length; number_index_continue++ ){
                        if (!Character.isDigit(is_replaced_number.charAt(number_index_continue))) {
                            number_index++;
                            if (is_replaced_number.charAt(number_index_continue) == '.' && is_replaced_number.charAt(number_index_continue - 1) == '.' ) {
                                return false;
                            }
                            return false;
                        }
                    }
                    if (number_index == length) {
                        return true;
                    }
                }
            }
            for (int index = 0; index < length; index++) {
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
