package reflect_8;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

//获得其它类的全部属性
public class Hello {
    public static void main(String[] args){
        Class<?> demo = null;
        try {
            demo = Class.forName("reflect_5.Person");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("=========本类属性=============");
        //取得本类的全部属性
        Field[] fields = demo.getDeclaredFields();
        for (int i = 0; i < fields.length; i++){
            //权限修饰符
            int mo = fields[i].getModifiers();
            String priv = Modifier.toString(mo);
            //属性类型
            Class<?> type = fields[i].getType();
            System.out.println(priv+" "+type.getName()+" "
                    +fields[i].getName()+";");
        }
        System.out.println("================实现的接口或者父类的属性===============");
        //取得实现的接口或者父类的属性
        Field[] fields1 = demo.getFields();
        for (int j = 0; j < fields1.length; j++){
            //权限修饰符
            int mo = fields1[j].getModifiers();
            String priv = Modifier.toString(mo);
            //属性类型
            Class<?> type = fields1[j].getType();
            System.out.println(priv+" "+type.getName()+" " +fields1[j].getName()+";");
        }
    }
}
