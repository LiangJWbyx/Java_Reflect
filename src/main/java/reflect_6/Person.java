package reflect_6;

import reflect_5.China;

public class Person implements China {
    private String sex;
    public Person(){
    }

    public Person(String sex) {
        this.sex = sex;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void sayChina() {
        System.out.println("hello, china");
    }

    public void sayHello(String name, int age) {
        System.out.println(name+ " " + age);
    }
}
