package reflect_3;
/*
通过Class实例化其他类的对象
（调用无参数的构造函数）
 */
public class Hello {
    public static void main(String[] args){
        Class<?> demo = null;
        try {
            demo = Class.forName("reflect_3.Person");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        Person person = null;

        try {
            person = (Person)demo.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        person.setName("Mari");
        person.setAge(23);
        System.out.println(person);
    }
}
