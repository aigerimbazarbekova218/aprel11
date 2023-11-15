public class Cat {
    private String Name;
    private String Color;
    private  int Age;

    public Cat() {
    }

    public Cat(String name, String color, int age) {
        Name = name;
        Color = color;
        Age = age;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }
}
