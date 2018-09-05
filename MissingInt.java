package homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MissingInt {

    public static void main(String[] args) {
        int[] test = {3, 4, 2, 6, 7, 1, 5, 9};
        System.out.println("First missing integer: " + new MissingInt().returnMissingInt(test));

        String myString = "my string to be splitted";
        System.out.println(Arrays.toString(new MissingInt().split(myString, ' ')));
    }

    private int returnMissingInt(int[] array){
        Arrays.sort(array);
        for (int i = 0; i < array.length - 1; i++){
            if(array[i] + 1 != array[i + 1]){
                return array[i] + 1;
            }
        }
        return array[array.length - 1] + 1; //jeśli będą wszystkie, wyświetli kolejną
    }

    private String[] split(String str, char sign){
        List<String> outputList = new ArrayList<>();
        str += sign;
        while (str.length() > 0) {
            int i = str.indexOf(sign);
            outputList.add(str.substring(0, i));
            str = str.substring(i + 1);
        }
        String[] output = outputList.toArray(new String[outputList.size()]);
        return output;
    }
}
