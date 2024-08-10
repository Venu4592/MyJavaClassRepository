package com.sgtesting.stringsClass;

public class RemoveDay {
    public static void main(String[] args) {
        removeOccOfDay();
        System.out.println();
        removeDay();
    }
    static void removeOccOfDay(){
        String s="SUNDAYMONDAYTUESDAYWEDNESDAYTHURSDAYFRIDAYSATURDAY";
        StringBuilder result=new StringBuilder();
        for(int i=0;i<s.length();i++) {
            if (i + 2 < s.length() && s.charAt(i) == 'D' && s.charAt(i + 1) == 'A' && s.charAt(i + 2) == 'Y') {
               result.append(" ");
                i += 2;
            } else {
                result.append(s.charAt(i));
            }
        }
        System.out.print(result.toString());
        }

        static void removeDay(){
            String st = "SUNDAYMONDAYTUESDAYWEDNESDAYTHURSDAYFRIDAYSATURDAY";
           st= st.replaceAll("DAY"," ");
            System.out.println(st);
    }
}
