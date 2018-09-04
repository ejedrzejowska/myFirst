package homework;

public class BinaryConverter {

    public static void main(String[] args) {
        new BinaryConverter().binaryTest();
    }

    private void binaryTest() {
        String binaryRep = convertToBinary(57);
        System.out.println(binaryRep);
        System.out.println(zeroCount(binaryRep));
        assertEquals(zeroCount(convertToBinary(57)), 2);
    }

    private String convertToBinary(int number) {
        StringBuilder str = new StringBuilder();
        while (number > 0) {
            str.append(number % 2);
            number = number / 2;
        }
        return str.reverse().toString();
    }

    private int zeroCount(String str) {
        int count = 0;
        int max = 0;
        int lastOne = str.lastIndexOf("1");
        char[] binaryTrimmed = str.substring(0, lastOne + 1).toCharArray();

        for (int i = 0; i < binaryTrimmed.length; i++) {
            if (binaryTrimmed[i] == '0') {
                count++;
                if (count > max) {
                    max = count;
                }
            } else {
                count = 0;
            }
        }
        return max;
    }

    private void assertEquals(Object o1, Object o2) {
        if (o1.equals(o2)) {
            System.out.println("Test passed");
        } else {
            System.out.println("Test failed");
        }
    }
}