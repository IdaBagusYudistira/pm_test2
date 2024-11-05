public class Hello {
    private String name;
    
    public Hello (String name) {
        this.name = name;
    }
    
    public static void main (String[] args) {
        Hello hello = new Hello("Yudis");
        
        System.out.printf("Hello, %s!", hello.name);
    }
}
