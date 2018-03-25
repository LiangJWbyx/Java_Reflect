package reflect_11;

import java.lang.reflect.Field;

//通过反射操作属性
public class hello {
    public static void main(String[] args) throws Exception{
        Class<?> demo = null;
        Object object = null;

        demo = Class.forName("reflect_5.Person");
        object = demo.newInstance();

        Field field = demo.getDeclaredField("sex");
        field.setAccessible(true);
        field.set(object, "男");
        System.out.println(field.get(object));
    }
}
