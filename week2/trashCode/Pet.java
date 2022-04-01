package week2.trashCode;

public abstract class Pet {
    String name;
    int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Pet(String name, int age){
        this.name=name;
        this.age=age;

    }
    public String pets(){
        return this.name;

    }
    public int ages(){
        return this.age;

    }
    public abstract void speak();
}
