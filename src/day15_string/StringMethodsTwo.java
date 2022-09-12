package day15_string;

public class StringMethodsTwo {
    public static void main(String[] args) {
        String word = "java";
        System.out.println(word.startsWith("j"));
        System.out.println(word.startsWith("ja"));
        System.out.println(word.startsWith("jae"));


        System.out.println("_________________");
        System.out.println(word.endsWith("a"));
        System.out.println(word.endsWith("A"));
        System.out.println(word.endsWith("java"));
        System.out.println(word.endsWith("va"));
        System.out.println(word.endsWith("va "));


       boolean b = word.startsWith("hello");
        String s = "hello world today";
        System.out.println("word.startsWith(hello wor) " + s.startsWith("hello wor"));


        System.out.println("_________");


        String str = "today is 80 degrees";
        System.out.println(str);
        System.out.println("str.contains(today)) "+ str.contains("today"));
        System.out.println("str.contains(it is)) "+ str.contains("it is"));
        System.out.println("str.contains(degrees)) "+ str.contains("degrees"));
        System.out.println("str.contains(it 80)) exact sequence "+ str.contains("it 80")); // contains(it) && contains(80)
        System.out.println(str.contains("80") && str.contains("today"));

    }
}
