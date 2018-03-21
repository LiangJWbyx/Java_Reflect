package reflect_7;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
/*
获取全部的构造方法，并且显示出每个构造方法的修饰符以及参数列表
 */
public class Hello2 {
    public static void main(String[] args){
        Class<?> demo = null;
        try {
            demo = Class.forName("reflect_7.Person");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        Constructor<?> cons[] = demo.getConstructors();
        for (int i = 0; i < cons.length; i++){
            Class<?> p[] = cons[i].getParameterTypes();
            System.out.print("构造方法：  ");
            int mo = cons[i].getModifiers();
            System.out.print(Modifier.toString(mo)+" ");
            System.out.print(cons[i].getName());
            System.out.print("(");
            for (int j = 0; j < p.length; ++j){
                System.out.print(p[j].getName()+" arg"+i);
                if (j<p.length-1){
                    System.out.println(",");
                }
            }
            System.out.println("){}");
        }
    }
}
