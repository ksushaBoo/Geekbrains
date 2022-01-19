package com.geekbrains.lesson05;

public class Lesson05 {

    public static void main(String[] args) {

        Employee employee = new Employee("Иванов Иван Иваночив", "qa", "bestQa@email.com", "891826453", 200000, 29);
        employee.info();

        Employee[] employeeArr = new Employee[5];

        employeeArr[0] = new Employee("Иванов Иван Иваночив", "qa", "bestQa@email.com",
                "891826453", 200000, 29);
        employeeArr[1] = new Employee("Семен Иван Иваночив", "qa", "bestQa@email.com",
                "891826453", 3457, 45);
        employeeArr[2] = new Employee("Семеновна Татьяна Иванович", "qa", "bestQa@email.com",
                "891826453", 90000, 33);
        employeeArr[3] = new Employee("Иванов Андрей Иванович", "qa", "bestQa@email.com",
                "891826453", 25000, 18);
        employeeArr[4] = new Employee("Иванов Генадий Какойтович", "qa", "bestQa@email.com",
                "891826453", 200000, 55);

        for (Employee value : employeeArr) {

            if (value.getAge() > 40)
                value.info();

        }

    }
}
