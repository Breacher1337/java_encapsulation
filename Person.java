public class Person {
    private String name;
    private int age;
    private String country;

    public Person( String name, int age, String country ) {
        this.name = name;
        this.age = age;
        this.country = country;
    }
    
    public String getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    public String introduce() {
        return "Hi! My name is " + name + ", I am " + age + " years old, my country is " + country;
    }
    
    public boolean isAdult() {
        if (age > 18) {
            return true;
        } else {
            return false;
        }
    }
}