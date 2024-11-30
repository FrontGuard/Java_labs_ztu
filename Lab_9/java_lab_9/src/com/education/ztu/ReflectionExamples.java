package com.education.ztu;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionExamples {

    public static void runReflectionExamples() {
        try {
            // === Отримання об'єкта Class трьома способами ===
            System.out.println("=== Отримання об'єкта Class ===");
            Class<?> employeeClass1 = Employee.class; // Спосіб 1
            Class<?> employeeClass2 = new Employee().getClass(); // Спосіб 2
            Class<?> employeeClass3 = Class.forName("com.education.ztu.Employee"); // Спосіб 3

            System.out.println("Спосіб 1: " + employeeClass1.getName());
            System.out.println("Спосіб 2: " + employeeClass2.getName());
            System.out.println("Спосіб 3: " + employeeClass3.getName());

            // === Отримання полів, методів і конструкторів ===
            System.out.println("\n=== Публічні поля ===");
            Field[] fields = employeeClass1.getDeclaredFields();
            for (Field field : fields) {
                System.out.println("Field: " + field.getName() + ", Type: " + field.getType().getName());
            }

            System.out.println("\n=== Методи ===");
            Method[] methods = employeeClass1.getDeclaredMethods();
            for (Method method : methods) {
                System.out.println("Method: " + method.getName() + ", Return Type: " + method.getReturnType().getName());
            }

            System.out.println("\n=== Конструктори ===");
            Constructor<?>[] constructors = employeeClass1.getDeclaredConstructors();
            for (Constructor<?> constructor : constructors) {
                System.out.print("Constructor: " + constructor.getName() + "(");
                Class<?>[] params = constructor.getParameterTypes();
                for (int i = 0; i < params.length; i++) {
                    System.out.print(params[i].getName());
                    if (i < params.length - 1) System.out.print(", ");
                }
                System.out.println(")");
            }

            // === Створення екземпляра класу ===
            System.out.println("\n=== Створення екземпляра класу ===");
            Constructor<?> constructor = employeeClass1.getDeclaredConstructor(String.class, int.class, String.class);
            Employee employee = (Employee) constructor.newInstance("Іван Іванов", 30, "Програміст");
            System.out.println("Created Employee: " + employee);

            // === Виклик методу ===
            System.out.println("\n=== Виклик методу ===");
            Method setPositionMethod = employeeClass1.getDeclaredMethod("setPosition", String.class);
            setPositionMethod.invoke(employee, "Архітектор програмного забезпечення");
            System.out.println("Updated Employee: " + employee);

            // === Робота з приватним полем ===
            System.out.println("\n=== Робота з приватним полем ===");
            Field privateField = employeeClass1.getDeclaredField("salary");
            privateField.setAccessible(true);
            privateField.set(employee, 2500.0);
            System.out.println("Updated salary: " + privateField.get(employee));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
