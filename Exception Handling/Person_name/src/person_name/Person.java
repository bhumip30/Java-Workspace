package person_name;

public class Person {

    private String name;
    private int age;

    public Person(String name, int age) throws Exception {

        if (name.length() > 0 &&
            Character.isUpperCase(name.charAt(0))) {

            boolean valid = true;

            for (int i = 1; i < name.length(); i++) {

                if (!Character.isLowerCase(name.charAt(i))) {
                    valid = false;
                    break;
                }
            }

            if (valid)
                this.name = name;
            else
                throw new Exception("Invalid Name");

        } else {
            throw new Exception("Invalid Name");
        }

        this.age = age;
    }

    public void display() {
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
    }
}
