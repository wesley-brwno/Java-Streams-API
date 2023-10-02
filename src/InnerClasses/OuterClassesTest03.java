package InnerClasses;

public class OuterClassesTest03 {
    private String name = "Wesley";
    static class Nested {
        private String lastName = "Virgens";
        void print() {
            System.out.println(new OuterClassesTest03().name + " " + lastName);
        }
    }
    public static void main(String[] args) {
        new Nested().print();
    }
}
