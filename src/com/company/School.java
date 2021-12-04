package com.company;

import java.util.*;

public class School {


    void welcome(List<Student> students, List<Human> sotrudniki) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        while (true) {
            System.out.println("-*-*-*-*-*-*-*-*-*-*-*-Введите свой логин:-*-*-*-*-*-*-*-*-*-*-*");
            String y = scanner.nextLine();
            System.out.println("-*-*-*-*-*-*-*-*-*-*-*-Введите свой пароль:-*-*-*-*-*-*-*-*-*-*-*");
            String x = scanner.nextLine();
            if (y.equals(Main.accountant.getLogin()) && x.equals(Main.accountant.getPassword())) {
                MainMenuBugalter(students, sotrudniki);
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


    static void MainMenuBugalter(List<Student> students, List<Human> employees) {

        boolean temp = false;
        while (true) {
            try {
                System.out.println("-*-*-*-*-*-*-*-*-*-*-*-Добро пожаловать в главное меню!-*-*-*-*-*-*-*-*-*-*-*-" +
                        "\n-*-*-*-*-*-*-*-*-*-*-*-Нажмите 1 чтобы найти студентов или сотрудников.-*-*-*-*-*-*-*-*-*-*-*-" +
                        "\n-*-*-*-*-*-*-*-*-*-*-*-Нажмите 2 чтобы узнать информацию о школе и о всех студентов и сотрудников.-*-*-*-*-*-*-*-*-*-*-*-" +
                        "\n-*-*-*-*-*-*-*-*-*-*-*-Нажмите 3 чтобы добавить студентов или сотрудников.-*-*-*-*-*-*-*-*-*-*-*-" +
                        "\n-*-*-*-*-*-*-*-*-*-*-*-Нажмите 4 чтобы оплатить контракт студента или заработную плату сотрудника.-*-*-*-*-*-*-*-*-*-*-*-");
                Scanner scanner = new Scanner(System.in);
                boolean temp2 = false;
                while (true) {
                    int n = scanner.nextInt();
                    switch (n) {
                        case 1: {
                            Main1(students, employees);
                            temp = true;
                            temp2 = true;
                            restart(students, employees);

                        }
                        case 2: {
                            Main2(students, employees);
                            temp = true;
                            temp2 = true;
                            restart(students, employees);
                        }
                        case 3: {
                            Main3(students,employees);
                            temp = true;
                            temp2 = true;
                            restart(students, employees);
                        }
                        case 4: {
                            Main4(students, employees);
                            restart(students, employees);

                        }
                    }


                    if (temp2) {
                        break;
                    }
                    if (temp2 == false) {
                        System.err.println("-*-*-*-*-*-*-*-*-*-*-*-Ошибка!!!-*-*-*-*-*-*-*-*-*-*-*-" + "\n-*-*-*-*-*-*-*-*-*-*-*-Следуйте выше заданным инструкциям!!-*-*-*-*-*-*-*-*-*-*-*-");
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


    static void Main1(List<Student> students, List<Human> employees) {
        boolean temp = false;
        while (true) {
            try {
                boolean temp2 = false;
                while (true) {
                    Scanner scanner = new Scanner(System.in);
                    System.out.println("-*-*-*-*-*-*-*-*-*-*-*-Нажмите 1 чтобы искать всех студентов:-*-*-*-*-*-*-*-*-*-*-*-");
                    System.out.println("-*-*-*-*-*-*-*-*-*-*-*-Нажмите 2 чтобы искать всех сотрудников:-*-*-*-*-*-*-*-*-*-*-*-");
                    int l = scanner.nextInt();
                    if (l == 1) {
                        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-Нажмите 1 чтобы искать всех студентов по ID:-*-*-*-*-*-*-*-*-*-*-*-");
                        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-Нажмите 2 чтобы искать всех студентов по имени:-*-*-*-*-*-*-*-*-*-*-*-");
                        int c = scanner.nextInt();
                        if (c == 1) {
                            Student.searchStudentId(scanner, students);
                            temp2 = true;
                            temp = true;
                        } else if (c == 2) {
                            Student.searchStudentName(students);
                            temp2 = true;
                            temp = true;
                        }

                    }

                    if (l == 2) {
                        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-Нажмите 1 чтобы искать всех сотрудников по ID:-*-*-*-*-*-*-*-*-*-*-*-");
                        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-Нажмите 2 чтобы искать всех сотрудников по имени:-*-*-*-*-*-*-*-*-*-*-*-");
                        int b = scanner.nextInt();
                        if (b == 1) {
                            Human.searchEmployeeId(scanner, employees);
                            temp2 = true;
                            temp = true;
                        } else if (b == 2) {
                            Human.searchEmployeesName(employees);
                            temp2 = true;
                            temp = true;
                        }


                    }
                    if (temp2 == false) {
                        System.err.println("-*-*-*-*-*-*-*-*-*-*-*-Ошибка!!!-*-*-*-*-*-*-*-*-*-*-*-" + "\n-*-*-*-*-*-*-*-*-*-*-*-Следуйте выше заданным инструкциям!!-*-*-*-*-*-*-*-*-*-*-*-");
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

    static void Main2(List<Student> students, List<Human> employees) {
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
                        case 1: {
                            System.out.println("-*-*-*-*-*-*-*-*-*-*-*-Информация о всех студентах:-*-*-*-*-*-*-*-*-*-*-*-");
                            Student.getAllStudents(students);
                            System.out.println("-*-*-*-*-*-*-*-*-*-*-*-КОЛИЧЕСТВО ВСЕХ СТУДЕНТОВ: " + students.size() + "-*-*-*-*-*-*-*-*-*-*-*-");
                            temp2 = true;
                            temp = true;
                            break;
                        }

                        case 2: {
                            System.out.println("-*-*-*-*-*-*-*-*-*-*-*-Информация о всех сотрудниках:-*-*-*-*-*-*-*-*-*-*-*-");
                            Human.getAllEmployees((ArrayList<Human>) employees);
                            System.out.println("-*-*-*-*-*-*-*-*-*-*-*-КОЛИЧЕСТВО ВСЕХ СОТРУДНИКОВ: " + employees.size() + "-*-*-*-*-*-*-*-*-*-*-*-");
                            temp = true;
                            temp2 = true;
                            break;


                        }
                        case 3: {
                            schoolInformation(students, employees);
                            temp2 = true;
                            temp = true;
                        }
                    }
                    if (temp2 == false) {
                        System.err.println("-*-*-*-*-*-*-*-*-*-*-*-Ошибка!!!-*-*-*-*-*-*-*-*-*-*-*-" + "\n-*-*-*-*-*-*-*-*-*-*-*-Следуйте выше заданным инструкциям!!-*-*-*-*-*-*-*-*-*-*-*-");
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

    static void Main3(List<Student> students, List<Human> employees) {
        boolean f = false;
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("-*-*-*-*-*-*-*-*-*-*-*-Нажмите 1 чтобы добавить новых сотрудников:-*-*-*-*-*-*-*-*-*-*-*-");
            System.out.println("-*-*-*-*-*-*-*-*-*-*-*-Нажмите 2 чтобы добавить новых студентов:-*-*-*-*-*-*-*-*-*-*-*-");
            int e = scanner.nextInt();
            switch (e) {
                case 1:
                    Human.addNewEmployees(students,employees);
                    f = true;

                case 2:
                    Student.addNewStudent(students);
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


    static void Main4(List<Student> students, List<Human> employees) {
        boolean f = false;
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("-*-*-*-*-*-*-*-*-*-*-*-Нажмите 1 чтобы выдать зарплату сотруднику:-*-*-*-*-*-*-*-*-*-*-*-");
            System.out.println("-*-*-*-*-*-*-*-*-*-*-*-Нажмите 2 чтобы оплатить контракт студента:-*-*-*-*-*-*-*-*-*-*-*-");
            System.out.println("-*-*-*-*-*-*-*-*-*-*-*-Нажмите 3 чтобы перевести деньги сотрудникам:-*-*-*-*-*-*-*-*-*-*-*-");
            int g = scanner.nextInt();
            if (g == 1) {
                Human.payedSalary(employees);
                f = true;
            }
            if (g == 2) {
                Student.payContractStudent(students);
                f = true;
            }
            if (g == 3) {
                Human.PerevodSredstv(employees);
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

    static void schoolInformation(List<Student> students, List<Human> employees) {
        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-№ 22 Гимназическая школа имени Джозефа-*-*-*-*-*-*-*-*-*-*-*-");
        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-Количество сотрудников состовляет: " + employees.size() + "-*-*-*-*-*-*-*-*-*-*-*-");
        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-Количество студентов состовляет: " + students.size() + "-*-*-*-*-*-*-*-*-*-*-*-");
        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-Общий бюджет школы состовляет: " + Main.MoneySchool + " сомов-*-*-*-*-*-*-*-*-*-*-*-");
        int obshayaZarplata = 0;
        int obshiyContract = 0;

        for (int i = 0; i < employees.size(); i++) {
            obshayaZarplata = obshayaZarplata + employees.get(i).getSalary();

        }
        for (int i = 0; i < students.size(); i++) {
            obshiyContract = obshiyContract + students.get(i).getContract();

        }
        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-Общая зарплата которую на выдать сотрудникам за месяц состовляет: " + obshayaZarplata + " сомов-*-*-*-*-*-*-*-*-*-*-*-");
        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-Общий контркат которую студенты должны оплатить за месяц: " + obshiyContract + " сомов-*-*-*-*-*-*-*-*-*-*-*-");


    }


    static void restart(List<Student> students, List<Human> employees) {
        boolean d = false;
        System.out.println("\n-*-*-*-*-*-*-*-*-*-*-*-Нажмите любое число чтобы перейти в гланое меню:-*-*-*-*-*-*-*-*-*-*-*-");
        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-Нажмите 0 чтобы завершит процесс:-*-*-*-*-*-*-*-*-*-*-*-");
        while (true) {
            try {
                Scanner scanner = new Scanner(System.in);
                int b = scanner.nextInt();
                if (b == 0) {
                    System.exit(0);
                }
                d = true;
                MainMenuBugalter(students, employees);
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


}