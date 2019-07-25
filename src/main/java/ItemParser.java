public class ItemParser {



    public String[] lineSeparation(String input) {
        String[] inputArray = input.split("##");
        return inputArray;
    }

    public String[] keyPairSeparation(String input) {
        String[] inputArray = input.split(";");
        return inputArray;
    }

    public String[] pairSeparation(String input) {
        String[] inputArray = input.split(":");
        return inputArray;
    }





}