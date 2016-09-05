/**
 * Created by tmq on 05/09/2016.
 */
public class MyString {
    private String mString;

    public MyString(String string){
        mString = string;
    }

    /**
     * Find position of sInput in MyString
     * @param sInput input for function
     * @return array position of sInput
     */
    public int [] indexOf(String sInput){
        int [] value = new int[mString.length()];
        int count = 0;

        int posC = mString.indexOf(sInput);

        while (posC>=0){
            value[count++] = posC;
            posC = mString.indexOf(sInput, posC+1);
        }

        int [] newValue = new int[count];
        for (int i = 0; i < newValue.length; i++) {
            newValue[i] = value[i];
        }

        return newValue;
    }
}
