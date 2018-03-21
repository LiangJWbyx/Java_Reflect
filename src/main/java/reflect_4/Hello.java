package reflect_4;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Hello {
    public static void main(String[] args){
        Class<?> demo = null;
        try {
            demo = Class.forName("reflect_4.Person");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        Person person1 = null;
        Person person2 = null;
        Person person3 = null;
        Person person4 = null;
        //取得全部的构造函数
        //下面会出错，因为获取到的constuctor数组会出现无序，
        //所以，直接根据下标来对应相应的构造方法是行不通的！
        /*Constructor<?> cons[] = demo.getConstructors();
        try {
            person1 = (Person)cons[0].newInstance();
            person2 = (Person)cons[1].newInstance("Rollen");
            person3 = (Person)cons[2].newInstance(20);
            person4 = (Person)cons[3].newInstance("Rollen", 20);
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }*/

        //针对上面的错误，提供以下的解决方法
        try {
            person1 = (Person)demo.getConstructor().newInstance();
            person2 = (Person)demo.getConstructor(String.class).newInstance("Rollen");
            person3 = (Person)demo.getConstructor(int.class).newInstance(20);
            person4 = (Person)demo.getConstructor(new Class[]{String.class, int.class}).newInstance("Rollen", 20);
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }

        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);
        System.out.println(person4);
    }
}
