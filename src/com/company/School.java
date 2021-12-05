package com.company;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.*;

public class School {


    void welcome() {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        while (true) {
            System.out.println("-*-*-*-*-*-*-*-*-*-*-*-Введите свой логин:-*-*-*-*-*-*-*-*-*-*-*");
            String y = scanner.nextLine();
            System.out.println("-*-*-*-*-*-*-*-*-*-*-*-Введите свой пароль:-*-*-*-*-*-*-*-*-*-*-*");
            String x = scanner.nextLine();
            if (y.equals(Main.accountant.getLogin()) && x.equals(Main.accountant.getPassword())) {
                MainMenuAccountant();
                break;


            } else {
                count++;
                System.out.println("-*-*-*-*-*-*-*-*-*-*-*-Неправильный пароль или логин!!-*-*-*-*-*-*-*-*-*-*-*-" + "\n-*-*-*-*-*-*-*-*-*-*-*-Осталось попыток: " + (3 - count) + "-*-*-*-*-*-*-*-*-*-*-*-");
            }
            if (count == 3) {
                System.out.println("-*-*-*-*-*-*-*-*-*-*-*-использовано 3 попыток ввода.-*-*-*-*-*-*-*-*-*-*-*-" + "\n-*-*-*-*-*-*-*-*-*-*-*-Программа завершена-*-*-*-*-*-*-*-*-*-*-*-");
                break;

            }

        }
    }


    private static void MainMenuAccountant() {
        boolean temp = false;
        while (true) {
            try {
                System.out.println("""
                        -*-*-*-*-*-*-*-*-*-*-*-Добро пожаловать в главное меню!-*-*-*-*-*-*-*-*-*-*-*-
                        -*-*-*-*-*-*-*-*-*-*-*-Нажмите 1 чтобы найти студентов или сотрудников.-*-*-*-*-*-*-*-*-*-*-*-
                        -*-*-*-*-*-*-*-*-*-*-*-Нажмите 2 чтобы узнать информацию о школе и о всех студентов и сотрудников.-*-*-*-*-*-*-*-*-*-*-*-
                        -*-*-*-*-*-*-*-*-*-*-*-Нажмите 3 чтобы добавить студентов или сотрудников.-*-*-*-*-*-*-*-*-*-*-*-
                        -*-*-*-*-*-*-*-*-*-*-*-Нажмите 4 чтобы оплатить контракт студента или заработную плату сотрудника.-*-*-*-*-*-*-*-*-*-*-*-
                        -*-*-*-*-*-*-*-*-*-*-*-Нажмите 5 чтобы сохранить изминения и выйти из системы.-*-*-*-*-*-*-*-*-*-*-*-""");
                Scanner scanner = new Scanner(System.in);
                boolean temp2 = false;
                while (true) {
                    int n = scanner.nextInt();
                    switch (n) {
                        case 1:
                            Main1();
                            restart();
                        case 2:
                            Main2();
                            restart();

                        case 3:
                            Main3();
                            restart();

                        case 4:
                            Main4();
                            restart();

                        case 5:
                            savingData();
                    }


                    if (!temp2) {
                        System.err.println("-*-*-*-*-*-*-*-*-*-*-*-Ошибка!!!-*-*-*-*-*-*-*-*-*-*-*-" + "\n-*-*-*-*-*-*-*-*-*-*-*-Следуйте заданным инструкциям!!-*-*-*-*-*-*-*-*-*-*-*-");
                        break;

                    }

                    if (temp2)
                        break;
                }


            } catch (Exception e) {
                System.err.println("-*-*-*-*-*-*-*-*-*-*-*-Ошибка!!!-*-*-*-*-*-*-*-*-*-*-*-" + "\n-*-*-*-*-*-*-*-*-*-*-*-Неверный формат ввода!!-*-*-*-*-*-*-*-*-*-*-*-");

            }
            if (temp) {
                break;
            }

        }
    }


    private static void Main1() {
        boolean temp = false;
        while (true) {
            try {
                boolean temp2 = false;
                while (true) {
                    Scanner scanner = new Scanner(System.in);
                    System.out.println("-*-*-*-*-*-*-*-*-*-*-*-Нажмите 1 чтобы искать всех студентов:-*-*-*-*-*-*-*-*-*-*-*-");
                    System.out.println("-*-*-*-*-*-*-*-*-*-*-*-Нажмите 2 чтобы искать всех сотрудников:-*-*-*-*-*-*-*-*-*-*-*-");
                    int l = scanner.nextInt();
                    switch (l) {
                        case 1: {
                            System.out.println("-*-*-*-*-*-*-*-*-*-*-*-Нажмите 1 чтобы искать всех студентов по ID:-*-*-*-*-*-*-*-*-*-*-*-");
                            System.out.println("-*-*-*-*-*-*-*-*-*-*-*-Нажмите 2 чтобы искать всех студентов по имени:-*-*-*-*-*-*-*-*-*-*-*-");
                            int c = scanner.nextInt();
                            switch (c) {
                                case 1:
                                    Student.searchStudentId();
                                    temp2 = true;
                                    temp = true;
                                case 2:
                                    Student.searchStudentName();
                                    temp2 = true;
                                    temp = true;
                            }

                        }

                        case 2: {
                            System.out.println("-*-*-*-*-*-*-*-*-*-*-*-Нажмите 1 чтобы искать всех сотрудников по ID:-*-*-*-*-*-*-*-*-*-*-*-");
                            System.out.println("-*-*-*-*-*-*-*-*-*-*-*-Нажмите 2 чтобы искать всех сотрудников по имени:-*-*-*-*-*-*-*-*-*-*-*-");
                            int b = scanner.nextInt();

                            switch (b) {
                                case 1:
                                    Human.searchEmployeeId();
                                    temp2 = true;
                                    temp = true;
                                case 2:
                                    Human.searchEmployeesName();
                                    temp2 = true;
                                    temp = true;

                            }
                        }


                    }
                    if (!temp2) {
                        System.err.println("-*-*-*-*-*-*-*-*-*-*-*-Ошибка!!!-*-*-*-*-*-*-*-*-*-*-*-" + "\n-*-*-*-*-*-*-*-*-*-*-*-Следуйте заданным инструкциям!!-*-*-*-*-*-*-*-*-*-*-*-");
                        break;

                    }
                    break;

                }


            } catch (Exception e) {
                System.err.println("-*-*-*-*-*-*-*-*-*-*-*-Ошибка!!!-*-*-*-*-*-*-*-*-*-*-*-" + "\n-*-*-*-*-*-*-*-*-*-*-*-Неверный формат ввода!!-*-*-*-*-*-*-*-*-*-*-*-");
            }
            if (temp) {
                break;
            }
        }
    }

    private static void Main2() {
        boolean temp = false;
        while (true) {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("-*-*-*-*-*-*-*-*-*-*-*-Нажмите 1 чтобы узнать информацию о всех студентах:-*-*-*-*-*-*-*-*-*-*-*-");
                System.out.println("-*-*-*-*-*-*-*-*-*-*-*-Нажмите 2 чтобы узнать информацию о всех сотрудниках:-*-*-*-*-*-*-*-*-*-*-*-");
                System.out.println("-*-*-*-*-*-*-*-*-*-*-*-Нажмите 3 чтобы узнать информацию о школе:-*-*-*-*-*-*-*-*-*-*-*-");
                boolean temp2 = false;
                while (true) {
                    int y = scanner.nextInt();
                    switch (y) {
                        case 1 -> {
                            System.out.println("-*-*-*-*-*-*-*-*-*-*-*-Информация о всех студентах:-*-*-*-*-*-*-*-*-*-*-*-");
                            Student.getAllStudents();
                            System.out.println("-*-*-*-*-*-*-*-*-*-*-*-КОЛИЧЕСТВО ВСЕХ СТУДЕНТОВ: " + Main.students.size() + "-*-*-*-*-*-*-*-*-*-*-*-");
                            temp2 = true;
                            temp = true;
                        }
                        case 2 -> {
                            System.out.println("-*-*-*-*-*-*-*-*-*-*-*-Информация о всех сотрудниках:-*-*-*-*-*-*-*-*-*-*-*-");
                            Human.getAllEmployees();
                            System.out.println("-*-*-*-*-*-*-*-*-*-*-*-КОЛИЧЕСТВО ВСЕХ СОТРУДНИКОВ: " + Main.employees.size() + "-*-*-*-*-*-*-*-*-*-*-*-");
                            temp = true;
                            temp2 = true;
                        }
                        case 3 -> {
                            schoolInformation();
                            temp2 = true;
                            temp = true;
                        }
                    }
                    if (!temp2) {
                        System.err.println("-*-*-*-*-*-*-*-*-*-*-*-Ошибка!!!-*-*-*-*-*-*-*-*-*-*-*-" + "\n-*-*-*-*-*-*-*-*-*-*-*-Следуйте заданным инструкциям!!-*-*-*-*-*-*-*-*-*-*-*-");
                        break;

                    }
                    if (temp2) {
                        break;
                    }
                }
            } catch (Exception e) {
                System.err.println("-*-*-*-*-*-*-*-*-*-*-*-Ошибка!!!-*-*-*-*-*-*-*-*-*-*-*-" + "\n-*-*-*-*-*-*-*-*-*-*-*-Неверный формат ввода!!-*-*-*-*-*-*-*-*-*-*-*-");
            }
            if (temp) {
                break;
            }

        }
    }

    private static void Main3() {
        boolean f = false;
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("-*-*-*-*-*-*-*-*-*-*-*-Нажмите 1 чтобы добавить новых сотрудников:-*-*-*-*-*-*-*-*-*-*-*-");
            System.out.println("-*-*-*-*-*-*-*-*-*-*-*-Нажмите 2 чтобы добавить новых студентов:-*-*-*-*-*-*-*-*-*-*-*-");
            int e = scanner.nextInt();
            switch (e) {
                case 1:
                    Human.addNewEmployees();
                    f = true;

                case 2:
                    Student.addNewStudent();
                    f = true;


            }
            if (!f) {
                System.err.println("-*-*-*-*-*-*-*-*-*-*-*-Ошибка следуйте выше заданнам инструкциям-*-*-*-*-*-*-*-*-*-*-*-");
            }
            if (f) {
                break;
            }
        }

    }


    private static void Main4() {
        boolean f = false;
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("-*-*-*-*-*-*-*-*-*-*-*-Нажмите 1 чтобы выдать зарплату сотруднику:-*-*-*-*-*-*-*-*-*-*-*-");
            System.out.println("-*-*-*-*-*-*-*-*-*-*-*-Нажмите 2 чтобы оплатить контракт студента:-*-*-*-*-*-*-*-*-*-*-*-");
            System.out.println("-*-*-*-*-*-*-*-*-*-*-*-Нажмите 3 чтобы перевести деньги сотрудникам:-*-*-*-*-*-*-*-*-*-*-*-");
            int g = scanner.nextInt();
            if (g == 1) {
                Human.payedSalary();
                f = true;
            }
            if (g == 2) {
                Student.payContractStudent();
                f = true;
            }
            if (g == 3) {
                Human.PerevodSredstv();
                f = true;
            }

            if (!f) {
                System.err.println("-*-*-*-*-*-*-*-*-*-*-*-Ошибка следуйте выше заданнам инструкциям-*-*-*-*-*-*-*-*-*-*-*-");
            }
            if (f) {
                break;
            }
        }

    }

    private static void schoolInformation() {
        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-№ 22 Гимназическая школа имени Джозефа-*-*-*-*-*-*-*-*-*-*-*-");
        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-Количество сотрудников состовляет: " + Main.employees.size() + "-*-*-*-*-*-*-*-*-*-*-*-");
        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-Количество студентов состовляет: " + Main.students.size() + "-*-*-*-*-*-*-*-*-*-*-*-");
        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-Общий бюджет школы состовляет: " + Main.theSchoolsBadge + " сомов-*-*-*-*-*-*-*-*-*-*-*-");
        int totalSalary = 0;
        int totalContract = 0;

        for (int i = 0; i < Main.employees.size(); i++) {
            totalSalary = totalSalary + Main.employees.get(i).getSalary();

        }
        for (int i = 0; i < Main.students.size(); i++) {
            totalContract = totalContract + Main.students.get(i).getContract();

        }
        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-Общая зарплата которую на выдать сотрудникам за месяц состовляет: " + totalSalary + " сомов-*-*-*-*-*-*-*-*-*-*-*-");
        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-Общий контркат которую студенты должны оплатить за месяц: " + totalContract + " сомов-*-*-*-*-*-*-*-*-*-*-*-");


    }


    static void restart() {
        boolean d = false;
        System.out.println("\n-*-*-*-*-*-*-*-*-*-*-*-Нажмите любое число чтобы перейти в гланое меню:-*-*-*-*-*-*-*-*-*-*-*-");
        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-Нажмите 0 чтобы завершит процесс и сохранит изминение:-*-*-*-*-*-*-*-*-*-*-*-");
        while (true) {
            try {
                Scanner scanner = new Scanner(System.in);
                int b = scanner.nextInt();
                if (b == 0) {
                    savingData();

                }
                d = true;
                MainMenuAccountant();
                break;
//

            } catch (Exception e) {
                System.err.println("\n-*-*-*-*-*-*-*-*-*-*-*-Нажмите любое ЧИСЛО чтобы перейти в гланое меню!!!-*-*-*-*-*-*-*-*-*-*-*-");
            }
            if (d) {
                break;
            }
        }
    }

    private static void savingData() {
        try {
            ObjectOutputStream ois = new ObjectOutputStream(new FileOutputStream("employees"));
            ois.writeObject(Main.employees);
            ObjectOutputStream oys = new ObjectOutputStream(new FileOutputStream("students"));
            oys.writeObject(Main.students);
            ObjectOutputStream ofs = new ObjectOutputStream(new FileOutputStream("ids"));
            ofs.writeObject(Human.ids);
            ObjectOutputStream of = new ObjectOutputStream(new FileOutputStream("theSchoolsBadge"));
            of.writeObject(Main.theSchoolsBadge);
            of.close();
            ois.close();
            oys.close();
            ofs.close();
            System.exit(0);

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Запись не удалась");

        }


    }

    static void readingFile() {
        try {
            ObjectInputStream oos = new ObjectInputStream(new FileInputStream("employees"));
            ObjectInputStream os = new ObjectInputStream(new FileInputStream("students"));
            ObjectInputStream osf = new ObjectInputStream(new FileInputStream("ids"));
            ObjectInputStream oj = new ObjectInputStream(new FileInputStream("theSchoolsBadge"));
            Main.theSchoolsBadge = (Double) oj.readObject();
            Main.employees = (ArrayList<Human>) oos.readObject();
            Main.students = (ArrayList<Student>) os.readObject();
            Human.ids = (ArrayList<Integer>) osf.readObject();
            oj.close();
            osf.close();
            oos.close();
            os.close();

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Не удалось прочитать файл!!!");
        }

    }


}