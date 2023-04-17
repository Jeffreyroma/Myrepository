package my.task.hw17.Task1;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException {
        try {
            Class<?> classHashMap = Class.forName("java.util.HashMap");

            System.out.println("All fields of the class");
            final Field[] declaredFields = classHashMap.getDeclaredFields();
            List<String> fields = getField(declaredFields);
            fields.forEach(System.out::println);

            System.out.println("\nParent class");
            final Class<?> declaredParentClass = classHashMap.getSuperclass();
            System.out.println(declaredParentClass);

            System.out.println("\nConstructors");
            final Constructor<?>[] declaredConstructors = classHashMap.getConstructors();
            List<String> constructors = getConstructor(declaredConstructors);
            constructors.forEach(System.out::println);

            System.out.println("\nAll methods of the class");
            final Method[] declaredMethods = classHashMap.getMethods();
            List<String> methods = getMethod(declaredMethods);
            methods.forEach(System.out::println);

            System.out.println("\nInformation about internal classes");
            final Class<?>[] declaredInternalClasses = classHashMap.getDeclaredClasses();
            List<String> internalClasses = getInternalClasses(declaredInternalClasses);
            internalClasses.forEach(System.out::println);

        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    private static List<String> getField(Field[] fields) {
        return Arrays.stream(fields).map(Field::getName).collect(Collectors.toList());
    }

    private static List<String> getConstructor(Constructor<?>[] fields) {
        return Arrays.stream(fields).map(Constructor::getName).collect(Collectors.toList());
    }

    private static List<String> getMethod(Method[] fields) {
        return Arrays.stream(fields).map(Method::getName).collect(Collectors.toList());
    }

    private static List<String> getInternalClasses(Class<?>[] fields) {
        return Arrays.stream(fields).map(Class::getName).collect(Collectors.toList());
    }

}
