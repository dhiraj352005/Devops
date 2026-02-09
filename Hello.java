public class Hello {

    public static void main(String[] args) {

        System.out.println("=== Assignment 8 : Docker Integration ===");
        System.out.println("Application is running inside a Docker container.");
        System.out.println("Built and pushed using Jenkins CI/CD pipeline.");

        String javaVersion = System.getProperty("java.version");
        System.out.println("Java Version inside container: " + javaVersion);

        System.out.println("Dockerized application executed successfully!");
    }
}
