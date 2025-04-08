public class Main {
    //list all env variables
    public static void main(String[] args) {
       System.getenv().forEach((key, value) -> System.out.println(key + ": " + value));
        
        //get and print specific env variables
        String javaHome = System.getenv("javatest");

        System.out.println("\nSpecific Environment Variables:");
        System.out.println("javatest: " + javaHome);
    }
}
