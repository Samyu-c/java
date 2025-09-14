 public class Stringmethods{
    public static void main(String[] args) {
        String s1 = "Welcome to Java";
        String s2 = s1;
        String s3 = new String("Welcome to Java");
        String s4 = s1.intern();
        System.out.println("s1:" + s1 + "\ns2:" + s2 + "\ns3:" + s3 + "\ns4:" + s4);
        System.out.println("s1==s2 :" + s1 == s2);
        System.out.println("s2==s3 :" + s2 == s3);
        System.out.println("s2.equalsIgnoreCase(s3):" + s2.equalsIgnoreCase(s3));
        System.out.println("s2.equals(s3)" + s2.equals(s3));
        System.out.println("s1.compareTo(s3)" + s1.compareTo(s3));
        System.out.println("s2.compareTo(s3)" + s2.compareTo(s3));
        System.out.println("s1.equals(s3)" + s1.equals(s3));
        System.out.println("s2==s4:" + s2 == s4);
        System.out.println("s1+s2: " + (s1 + s2));
        System.out.println("s1.charAt('o')" + s1.charAt('o'));
        System.out.println("s1.indexOf('j') " + s1.indexOf('j'));
        System.out.println("s1.indesOf('to')" + s1.indexOf("to"));
        System.out.println("s1.lastIndexOf('a')" + s1.lastIndexOf('a'));
        System.out.println("s1.lastIndexOf('o',15)" + s1.lastIndexOf("o", 15));
        System.out.println("s1.codePointCount(0,s1.length())" + s1.codePointCount(0, s1.length()));
        System.out.println("String.join('-',s1,s2,s3)" + String.join("-", s1, s2, s3));
        System.out.println("s1.length()" + s1.length());
        System.out.println("s1.substring(3)" + s1.substring(3));
        System.out.println(" s1.substring( 3) " + s1.substring(3));
        System.out.println("s1.substring(1, 3) " + s1.substring(1, 3));
        System.out.println("s1.startsWith(\"Wel\") " + s1.startsWith("Wel"));
        System.out.println("s1.endsWith(\"Java\")" + s1.endsWith("Java"));
        System.out.println("s1.toLowerCase() " + s1.toLowerCase());
        System.out.println("s1.toUpperCase()" + s1.toUpperCase());
        System.out.println("\"Hi\".trim()" + "Hi".trim());
        System.out.println("s1.replace('o','O')" + s1.replace('o', 'O'));
        System.out.println("s1.replaceAll('o','O')" + s1.replaceAll("o", "O"));
        System.out.println("s1.replaceFirst('o','O')" + s1.replaceAll("o", "O"));
        System.out.println("s1.split(\"O\")" + s1.replaceFirst("o", "O"));
        System.out.println("s1.toCharArray()" + s1.toCharArray());
        System.out.println("s1.codePointAt(0)" + s1.codePointAt(0));
        System.out.println("s1.contains(\"or\")" + s1.contains("or"));
        System.out.println("hash code of s1:" + System.identityHashCode(s1));
        System.out.println("hash code of s2:" + System.identityHashCode(s2));
        System.out.println("hash code of s3:" + System.identityHashCode(s3));
        System.out.println("hash code of s4:" + System.identityHashCode(s4));
    }
}













