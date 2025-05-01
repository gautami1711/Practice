package OOPs.reflection;

import java.lang.reflect.Field;

public class Test {
    public static void main(String[] args) {
        Person person=new Person();
        try{
            Field field=person.getClass().getDeclaredField("name");
            field.setAccessible(true);
            System.out.println("Name: "+field.get(person));
        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}
