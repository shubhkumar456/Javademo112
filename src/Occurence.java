public class Occurence {
    public static void main(String[] args) {
        String name="Vikar Sir  working in a technical company ";
      int a=name.length();
      int b=name.replace("i","").length();
      int count=a-b;
        System.out.println("number of occurence::"+count);

    }
}
