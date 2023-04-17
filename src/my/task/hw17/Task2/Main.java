package my.task.hw17.Task2;

import java.lang.reflect.Method;


public class Main {

    public static void main(String[] args) {

        MethodAcademy methodAcademy = new MethodAcademy();
        final Method[] declaredMethods =  methodAcademy.getClass().getDeclaredMethods();
        for (Method method : declaredMethods){
            System.out.println("\nMethods: "+method.getName());
            if (method.isAnnotationPresent(AcademyInfo.class)) {
                AcademyInfo academyInfo = method.getAnnotation(AcademyInfo.class);
                System.out.println("Method with annotation: "+academyInfo);
            }
        }
    }
}
