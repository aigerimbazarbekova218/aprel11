public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Fish newfish = new Fish();
        newfish.setName("Nemo");
        newfish.setColor("Blue");


        Fish fish = new Fish("Nemo", "Blue");
        System.out.println(newfish.getName());
        System.out.println(newfish.getColor());

        Cat newcat = new Cat();
        newcat.setName("Maru");
        newcat.setColor("White");
        newcat.setAge(1);

        Cat cat = new Cat("Maru", "White", 1);
        System.out.println(newcat.getName());
        System.out.println(newcat.getColor());
        System.out.println(newcat.getAge());

        Dog newdog = new Dog();
        newdog.setName("Bella");
        newdog.setColor("Brown");
        newdog.setAge(4);
        Dog dog = new Dog("Bella", "Brown", 4);
        System.out.println(newdog.getName());
        System.out.println(newdog.getColor());
        System.out.println(newdog.getAge());


        String[] f1 = {"red", "black", "blue"};
        String[] s2 = {"red", "block", "blue"};

        System.out.println(method(f1, s2));

    }

    public static boolean method(String[] first, String[] second) {
        for (int i = 0; i < first.length; i++) {
            for (int j = 0; j < second.length; j++) {
                if ( first[i].length() != second[j].length()){
                    return false;

                }
            }
        }

        for (int i = 0; i < first.length; i++) {
            for (int j = 0; j < second.length; j++) {
                if (i == j) {

                }
            }
        }return true;


    }
}


