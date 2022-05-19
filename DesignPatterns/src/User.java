public class User {
    // Fields (attributes)
    public String name;
    public int age;
    // Constructor
    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }
    // Methods
    public void sayHello() {
        System.out.println("Hi, my name is " + name);
    }
}
