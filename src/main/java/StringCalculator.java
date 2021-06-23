public class StringCalculator {
    public static int add(final String numbers) {
        int returnValue = 0;
        String[] numbersArray = numbers.split(",|\n");
        for (String number : numbersArray) {
            if (!number.trim().isEmpty()) {
                returnValue += Integer.parseInt(number.trim());
            }
            if(Integer.parseInt(number) < 0) {
                throw new IllegalArgumentException("The value: " + number + " is an illegal number since it's negative");
            }
            if(Integer.parseInt(number) > 1000) {
                throw new IndexOutOfBoundsException("The value: " + number + " is over the limit of 1000 as a maximum value");
            }
        }
        return returnValue;
    }
}