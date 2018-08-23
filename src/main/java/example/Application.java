package example;

public class Application {
    public static void main(String[] args) {
        int startNumber = 100000;
        int endNumber = 100001;
        verifyParameterLegal(startNumber, endNumber);
        String result = buildMultiplicationTable(startNumber, endNumber);
        System.out.println(result);
    }

    static String buildMultiplicationTable(int startNumber, int endNumber) {
        StringBuilder table = new StringBuilder();
        String template = buildTemplate(endNumber);

        for(int leftNumber = startNumber; leftNumber <= endNumber; leftNumber++){
            for (long rightNumber = startNumber; rightNumber <= leftNumber; rightNumber++){
                table.append(String.format(template, rightNumber, leftNumber, leftNumber * rightNumber));
            }

            table.append("\n");
        }

        return table.toString();
    }

    private static String buildTemplate(int endNumber) {
        long maxNumber = (long)endNumber * endNumber;
        int multiplyNumberLength = String.valueOf(maxNumber).length();
        int endNumberLength = String.valueOf(endNumber).length();

        return new StringBuilder().append("%-")
                .append(endNumberLength)
                .append("s * %-")
                .append(endNumberLength)
                .append("s = %-")
                .append(multiplyNumberLength)
                .append("s ")
                .toString();
    }

    static void verifyParameterLegal(int startNumber, int endNumber){
        if(startNumber > endNumber || startNumber == endNumber || startNumber < 0){
           throw new IllegalArgumentException();
        }
    }
}
