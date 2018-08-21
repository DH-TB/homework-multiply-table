package example;

public class Application {
    public static void main(String[] args) {
        int startNumber = 1;
        int endNumber = 3;
        verifyParameterLegal(startNumber, endNumber);
        String result = buildMultiplicationTable(startNumber, endNumber);
        System.out.println(result);
    }

    static String buildMultiplicationTable(int startNumber, int endNumber) {
        int maxNumber = endNumber * endNumber;
        int maxNumberLength = String.valueOf(maxNumber).length();
        int endNumberLength = String.valueOf(endNumber).length();
        int maxLength = maxNumberLength + endNumberLength * 2 - 3;
        int width = maxLength == 0 ? 1 : maxLength;

        String template = "%s * %s = %-" + width +"s\t";
        StringBuilder table = new StringBuilder();

        for(int leftNumber = startNumber; leftNumber <= endNumber; leftNumber++){
            for (int rightNumber = startNumber; rightNumber <= leftNumber; rightNumber++){
                table.append(String.format(template, rightNumber, leftNumber, leftNumber * rightNumber));
            }
            table.append("\n");
        }
        return table.toString();
    }

    static void verifyParameterLegal(int startNumber, int endNumber){
        if(startNumber > endNumber || startNumber == endNumber || startNumber < 0){
           throw new IllegalArgumentException();
        }
    }
}
