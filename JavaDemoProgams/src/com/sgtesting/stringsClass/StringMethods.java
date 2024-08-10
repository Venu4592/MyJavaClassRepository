package com.sgtesting.stringsClass;

public class StringMethods {
    public static void main(String args[]) {
        FindChar();
        CompareStrings();
        ConcatTwoStrings();
        ContainsMeth();
        ContentEqualsMeth();
        CopyValueof();
        EndsWithMeth();
        EqualsandIgnore();
        GetBytes();
        hashcodeMeth();
        FindIndexof();
        isEmptyMeth();
        joinsString();
        Lastindex();
        lengthMeth();
        replaceMeth();
        splitMeth();
        subStringMeth();
    }

    static void FindChar() {
        String str = "Velankanni";
        System.out.println(str.charAt(5));
    }

    static void CompareStrings() {
        String s1 = "Velankanni";
        String s2 = "Innaknalev";
        int res = s1.compareTo(s2);
        System.out.println(res);
        int res2 = s1.compareToIgnoreCase(s2);
        System.out.println(res2);
    }

    static void ConcatTwoStrings() {
        String s = "Velankanni ";
        String Res = s.concat("is good boy");
        System.out.println(Res);
    }

    static void ContainsMeth() {
        String S = "Velankanni";
        boolean b = S.contains("anni");
        System.out.println(b);
        boolean b2 = S.contains("nksdh");
        System.out.println(b2);
    }

    static void ContentEqualsMeth() {
        String S = "Velankanni";
        System.out.println(S.contentEquals("Velankanni"));
        System.out.println(S.contentEquals("velankanni"));
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");
    }

    static void CopyValueof() {
        char[] myStr1 = {'H', 'e', 'l', 'l', 'o'};
        String myStr2 = "";
        myStr2 = myStr2.copyValueOf(myStr1, 0, 5);
        System.out.println("Returned String: " + myStr2);
        System.out.println("++++++++++++++++++++++++++++++++++++");
    }

    static void EndsWithMeth() {
        String s = "Program Manager";
        System.out.println(s.endsWith("Manager"));
        System.out.println("+++++++++++++++++++++++++++++++++");
    }

    static void EqualsandIgnore() {
        String S = "Amma";
        boolean b = S.equals("mma");
        System.out.println(b);
        boolean br = S.equalsIgnoreCase("amma");
        System.out.println(br);
        System.out.println("+++++++++++++++++++++++++++++++++");
    }

    static void GetBytes() {
        String str = "S G Testing Institue";
        byte[] b = str.getBytes();
        System.out.println(b);
        System.out.println("+++++++++++++++++++++++++++++++++");
    }

    static void hashcodeMeth() {
        String str = "S G Testing Institue";
        System.out.println(str.hashCode());
        System.out.println("+++++++++++++++++++++++++++++++++");
    }

    static void FindIndexof() {
        String s = "Balasubramaniyan";
        int ch = s.indexOf('s');
        System.out.println(ch);
        System.out.println("+++++++++++++++++++++++++++++++++");
    }

    static void isEmptyMeth() {
        String s = "venu";
        System.out.println(s.isEmpty());
        System.out.println("+++++++++++++++++++++++++++++++++");
    }

    static void joinsString() {
        String st1 = "Friends 1";
        String st2 = "Friends 2";
        System.out.println(String.join(" ", st1, st2));
        System.out.println("+++++++++++++++++++++++++++++++++");
    }

    static void Lastindex() {
        String str = "Velankanni";
        System.out.println(str.lastIndexOf('n'));
        System.out.println("+++++++++++++++++++++++++++++++++");
    }

    static void lengthMeth() {
        String s = "S G Sofware testing institute";
        int len = s.length();
        System.out.println(len);
        System.out.println("+++++++++++++++++++++++++++++++++");
    }

    static void replaceMeth() {
        String s = "Welcome";
        System.out.println(s.replace('l', 'c'));
        System.out.println(s.replaceAll("e", "l"));
        System.out.println(s.replaceFirst("W", "D"));
        System.out.println("+++++++++++++++++++++++++++++++++");
    }

    static void splitMeth() {
        String s = "Velankanni";
        String st[] = s.split("lan");
        for (String kk : st) {
            System.out.print(kk + " ");
        }
        System.out.println();
        System.out.println("++++++++++++++++++++++++++++++++++++");
    }

    static void subStringMeth() {
        String s = "Velankanni";
        System.out.println(s.substring(2));
        System.out.println(s.substring(2, 5));
        System.out.println("++++++++++++++++++++++++++++++++++++");
    }
}
