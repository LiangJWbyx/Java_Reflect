package reflect_9;
//通过反射调用其它类中的方法

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Hello {
    public static void main(String[] args){
        Class<?> demo = null;
        try {
            demo = Class.forName("reflect_5.Person");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try {
            //调用Person类中的sayChina方法
            Method method = demo.getMethod("sayChina");
            method.invoke(demo.newInstance());
            //调用Person的sayHello方法
            method = demo.getMethod("sayHello", String.class, int.class);
            method.invoke(demo.newInstance(), "Rollen", 20);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
