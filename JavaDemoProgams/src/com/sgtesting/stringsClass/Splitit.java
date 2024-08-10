package com.sgtesting.stringsClass;

public class Splitit {
    public static void main(String[] args) {
        separateByComma("SUNDAYMONDAYTUESDAYWEDNESDAYTHURSDAYFRIDAYSATURDAY");

        String input="SUNDAYMONDAYTUESDAYWEDNESDAYTHURSDAYFRIDAYSATURDAY";
        String Output=AddComma(input);
        System.out.println(Output);
    }

    static void separateByComma(String days) {
        StringBuilder result = new StringBuilder();
        int length = days.length();
        int i = 0;
        while (i < length) {
            // Find the next occurrence of "DAY"
            int index = days.indexOf("DAY", i);
            if (index == -1) {
                // If "DAY" is not found, append the remaining part of the string
                result.append(days.substring(i));
                break;
            } else {
                // Append characters before "DAY"
                result.append(days, i, index + 3); // index + 3 to include "DAY"
                result.append(','); // Append the comma
                i = index + 3; // Move past "DAY"
            }
        }
        // Remove the extra comma if there is one
        if (result.length() > 0 && result.charAt(result.length() - 1) == ',') {
            result.setLength(result.length() - 1);
        }
        // Print result
        System.out.println(result.toString());
    }
    static String AddComma(String input){
        return input.replaceAll("DAY","DAY, ");
    }
}
