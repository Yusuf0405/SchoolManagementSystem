package com.company;

import java.util.*;

public class Human {
    private String name;
    private String surname;
    private String patronymic;
    private String login;
    private String password;
    private int id;
    private String post;
    private int salary;
    private int workExperience;
    private int chet;


    public Human(String surname, String name, String patronymic, int workExperience, int salary, String login, String password, int id, int chet, String post) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.workExperience = workExperience;
        this.salary = salary;
        this.login = login;
        this.password = password;
        this.id = id;
        this.chet = chet;
        this.post = post;
        this.salary = salary;


    }

    static int generateUniqueId() {
        UUID idOne = UUID.randomUUID();
        String str = "" + idOne;
        int uid = str.hashCode();
        String filterStr = "" + uid;
        str = filterStr.replaceAll("-", "");
        return Integer.parseInt(str);
    }

    static String lowerFirsSurename(String surname) {
        surname = surname.toLowerCase();
        char s = surname.charAt(0);
        String surnamee = surname.substring(1, surname.length());
        surname = Character.toUpperCase(s) + surnamee;
        return surname;

    }

    static String lowerFirsName(String name) {
        name = name.toLowerCase();
        char f = name.charAt(0);
        String namee = name.substring(1, name.length());
        name = Character.toUpperCase(f) + namee;
        return name;

    }

    static String lowerFirsPatronumic(String patronymic) {
        patronymic = patronymic.toLowerCase();
        char p = patronymic.charAt(0);
        String patnomic = patronymic.substring(1, patronymic.length());
        patronymic = Character.toUpperCase(p) + patnomic;
        return patronymic;

    }

    static String loginGmail(String login) {
        login = login.toLowerCase(Locale.ROOT);
        login = login.concat("@gmail.com");
        return login;

    }

    static String passwordSetting(String password) {
        boolean correct = false;
        while (true) {
            Scanner scanne = new Scanner(System.in);
            password = scanne.next();

            if (password.length() >= 8 && password.length() <= 16) {
                correct = true;
            }
            if (!correct) {
                System.err.println("--------------------Пароль должен содержать не менее 8 символов и меньше 16!!--------------------");
            }
            if (correct) {
                break;

            }


        }
        return password;
    }

    static void getAllEmployees(ArrayList<Human> humans) {
        for (int i = 0; i < humans.size(); i++) {
            getEmployeesInfo(humans.get(i));


        }
    }


    static void getEmployeesInfo(Human human) {
        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-Ф.И.О. сотрудника: " + human.getSurname() + " " + human.getName() + " " + human.getPatronymic() + "-*-*-*-*-*-*-*-*-*-*-*-");
        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-ID сотрудника: " + Human.generateUniqueId() + "-*-*-*-*-*-*-*-*-*-*-*-");
        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-Зарплата: " + human.getSalary() + " сомов-*-*-*-*-*-*-*-*-*-*-*-");
        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-Должность: " + human.getPost() + "-*-*-*-*-*-*-*-*-*-*-*-");
        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-Логин: " + human.getLogin() + "-*-*-*-*-*-*-*-*-*-*-*-");
        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-Стаж работы: " + human.getWorkExperience() + " год(а)-*-*-*-*-*-*-*-*-*-*-*-");
        System.out.println("**************************************************************************************************************************************");


    }

    static void searchEmployeeId(Scanner scanner, List<Human> employee) {
        boolean temp = false;
        while (true) {
            System.out.println("-*-*-*-*-*-*-*-*-*-*-*-Введите id сотрудника чтобы его найти:-*-*-*-*-*-*-*-*-*-*-*-");
            int id = scanner.nextInt();
            for (Human human : employee) {
                if (id == human.getId()) {
                    System.out.println("-*-*-*-*-*-*-*-*-*-*-*-Ф.И.О. сотрудника: " + human.getSurname() + " " + human.getName() + " " + human.getPatronymic() + "-*-*-*-*-*-*-*-*-*-*-*-");
                    System.out.println("-*-*-*-*-*-*-*-*-*-*-*-ID сотрудника: " + Human.generateUniqueId() + "-*-*-*-*-*-*-*-*-*-*-*-");
                    System.out.println("-*-*-*-*-*-*-*-*-*-*-*-Зарплата: " + human.getSalary() + " сомов-*-*-*-*-*-*-*-*-*-*-*-");
                    System.out.println("-*-*-*-*-*-*-*-*-*-*-*-Должность: " + human.getPost() + "-*-*-*-*-*-*-*-*-*-*-*-");
                    System.out.println("-*-*-*-*-*-*-*-*-*-*-*-Логин: " + human.getLogin() + "-*-*-*-*-*-*-*-*-*-*-*-");
                    System.out.println("-*-*-*-*-*-*-*-*-*-*-*-Стаж работы: " + human.getWorkExperience() + " год(а)-*-*-*-*-*-*-*-*-*-*-*-");
                    System.out.println("**************************************************************************************************************************************");

                    temp = true;
                }
            }
            if (temp) {
                break;
            }
            if (temp == false) {
                System.out.println("-*-*-*-*-*-*-*-*-*-*-*-Такого учителя нет!!!-*-*-*-*-*-*-*-*-*-*-*-" +
                        "\n-*-*-*-*-*-*-*-*-*-*-*-Повторите попытку!!!-*-*-*-*-*-*-*-*-*-*-*-");

            }

        }
    }

    static void searchEmployeesName(List<Human> humans) {
        boolean temp = false;
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("-*-*-*-*-*-*-*-*-*-*-*-Введите имя сотрудника чтобы его найти:-*-*-*-*-*-*-*-*-*-*-*-");
            String name = scanner.nextLine();
            for (int i = 0; i < humans.size(); i++) {
                if (name.toLowerCase(Locale.ROOT).equals(humans.get(i).getName().toLowerCase(Locale.ROOT))) {
                    System.out.println("-*-*-*-*-*-*-*-*-*-*-*-Ф.И.О. сотрудника: " + humans.get(i).getSurname() + " " + humans.get(i).getName() + " " + humans.get(i).getPatronymic() + "-*-*-*-*-*-*-*-*-*-*-*-");
                    System.out.println("-*-*-*-*-*-*-*-*-*-*-*-ID сотрудника: " + Human.generateUniqueId() + "-*-*-*-*-*-*-*-*-*-*-*-");
                    System.out.println("-*-*-*-*-*-*-*-*-*-*-*-Зарплата: " + humans.get(i).getSalary() + " сомов-*-*-*-*-*-*-*-*-*-*-*-");
                    System.out.println("-*-*-*-*-*-*-*-*-*-*-*-Должность: " + humans.get(i).getPost() + "-*-*-*-*-*-*-*-*-*-*-*-");
                    System.out.println("-*-*-*-*-*-*-*-*-*-*-*-Логин: " + humans.get(i).getLogin() + "-*-*-*-*-*-*-*-*-*-*-*-");
                    System.out.println("-*-*-*-*-*-*-*-*-*-*-*-Стаж работы: " + humans.get(i).getWorkExperience() + " год(а)-*-*-*-*-*-*-*-*-*-*-*-");
                    System.out.println("**************************************************************************************************************************************");
                    temp = true;
                }
            }
            if (temp) {
                break;
            }
            if (temp == false) {
                System.err.println("-*-*-*-*-*-*-*-*-*-*-*-Такого сотрудника нет!!!-*-*-*-*-*-*-*-*-*-*-*-" +
                        "\n-*-*-*-*-*-*-*-*-*-*-*-Повторите попытку!!!-*-*-*-*-*-*-*-*-*-*-*-");
            }
        }

    }

    static void salary(Human human) {
        if (human.getWorkExperience() == 1) {
            double n = human.getSalary();
            System.out.println("-*-*-*-*-*-*-*-*-*-*-*-Зарплата данного сотрудника не увеличывается за счет стажа-*-*-*-*-*-*-*-*-*-*-*-");
            System.out.println("-*-*-*-*-*-*-*-*-*-*-*-Стаж сотрудника состовляет " + human.getWorkExperience() + " год-*-*-*-*-*-*-*-*-*-*-*-");
            System.out.println("-*-*-*-*-*-*-*-*-*-*-*-Ему будет задана зарплта в размере " + n + "-*-*-*-*-*-*-*-*-*-*-*-");
            boolean daNet = false;
            while (true) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("-*-*-*-*-*-*-*-*-*-*-*-Введите 'ДА' если хотите задать зарплату или 'НЕТ' чтобы отменть процесс-*-*-*-*-*-*-*-*-*-*-*-");
                String vvod = scanner.nextLine();

                if (vvod.toLowerCase(Locale.ROOT).equals("да")) {
                    if (Main.MoneySchool < n) {
                        System.err.println("\"-*-*-*-*-*-*-*-*-*-*-*-Не достаточно денег чтобы оплатить зарплату!!\"-*-*-*-*-*-*-*-*-*-*-*-");
                        daNet = true;
                    } else {
                        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-Зарплата была выдына в размере-*-*-*-*-*-*-*-*-*-*-*-" + n);
                        Main.MoneySchool = Main.MoneySchool - n;
                        int schet = (int) (human.getChet() + n);
                        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-Осталось денег в бюджете: " + Main.MoneySchool + "-*-*-*-*-*-*-*-*-*-*-*-");
                        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-Счет сотрудника увеличелось: " + schet + "-*-*-*-*-*-*-*-*-*-*-*-");
                        daNet = true;

                    }
                }
                if (vvod.toLowerCase(Locale.ROOT).equals("нет")) {

                    daNet = true;

                }
                if (daNet == false) {
                    System.err.println("-*-*-*-*-*-*-*-*-*-*-*-Введите 'ДА' или 'НЕТ'-*-*-*-*-*-*-*-*-*-*-*-");
                }
                if (daNet) {
                    break;
                }
            }
        }
        if (human.getWorkExperience() >= 2 && human.getWorkExperience() <= 5) {
            System.out.println("-*-*-*-*-*-*-*-*-*-*-*-Зарплата данного сотрудника увеличывается на 10% за счет стажа " + human.getWorkExperience() + " лет-*-*-*-*-*-*-*-*-*-*-*-");
            double n = (human.getSalary() + (human.getSalary() * 0.1));
            System.out.println("-*-*-*-*-*-*-*-*-*-*-*-Ему будет задана зарплта в размере-*-*-*-*-*-*-*-*-*-*-*-" + n);
            System.out.println("-*-*-*-*-*-*-*-*-*-*-*-Хотите задать зарплату?-*-*-*-*-*-*-*-*-*-*-*-");
            boolean daNet = false;
            while (true) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("-*-*-*-*-*-*-*-*-*-*-*-Введите 'ДА' если хотите задать зарплату или 'НЕТ' чтобы отменть процесс-*-*-*-*-*-*-*-*-*-*-*-");
                String vvod = scanner.nextLine();
                if (vvod.toLowerCase(Locale.ROOT).equals("да")) {
                    if (Main.MoneySchool < n) {
                        System.err.println("\"-*-*-*-*-*-*-*-*-*-*-*-Не достаточно денег чтобы оплатить зарплату!!-*-*-*-*-*-*-*-*-*-*-*-");
                        daNet = true;
                    } else {
                        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-Зарплата была выдына в размере-*-*-*-*-*-*-*-*-*-*-*-" + n);
                        Main.MoneySchool = Main.MoneySchool - n;
                        int schet = (int) (human.getChet() + n);
                        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-Осталось денег в бюджете: " + Main.MoneySchool + "-*-*-*-*-*-*-*-*-*-*-*-");
                        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-Счет сотрудника увеличелось: " + schet + "-*-*-*-*-*-*-*-*-*-*-*-");
                        daNet = true;

                    }
                }
                if (vvod.toLowerCase(Locale.ROOT).equals("нет")) {
                    daNet = true;
                }
                if (daNet == false) {
                    System.err.println("-*-*-*-*-*-*-*-*-*-*-*-Введите 'ДА' или 'НЕТ'-*-*-*-*-*-*-*-*-*-*-*-");
                }
                if (daNet) {
                    break;
                }
            }
        }
        if (human.getWorkExperience() >= 6 && human.getWorkExperience() <= 10) {
            System.out.println("-*-*-*-*-*-*-*-*-*-*-*-Зарплата данного сотрудника увеличывается на 20% за счет стажа " + human.getWorkExperience() + " лет-*-*-*-*-*-*-*-*-*-*-*-");
            double n = (human.getSalary() + (human.getSalary() * 0.2));
            System.out.println("--*-*-*-*-*-*-*-*-*-*-*-Ему будет задана зарплта в размере " + n + "-*-*-*-*-*-*-*-*-*-*-*-");
            boolean daNet = false;
            while (true) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("-*-*-*-*-*-*-*-*-*-*-*-Введите 'ДА' если хотите задать зарплату или 'НЕТ' чтобы отменть процесс-*-*-*-*-*-*-*-*-*-*-*-");
                String vvod = scanner.nextLine();
                if (vvod.toLowerCase(Locale.ROOT).equals("да")) {
                    if (Main.MoneySchool < n) {
                        System.err.println("\"-*-*-*-*-*-*-*-*-*-*-*-Не достаточно денег чтобы оплатить зарплату!!\"-*-*-*-*-*-*-*-*-*-*-*-");
                        daNet = true;
                    } else {
                        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-Зарплата была выдына в размере-*-*-*-*-*-*-*-*-*-*-*-" + n);
                        Main.MoneySchool = Main.MoneySchool - n;
                        int schet = (int) (human.getChet() + n);
                        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-Осталось денег в бюджете: " + Main.MoneySchool + "-*-*-*-*-*-*-*-*-*-*-*-");
                        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-Счет сотрудника увеличелось: " + schet + "-*-*-*-*-*-*-*-*-*-*-*-");
                        daNet = true;

                    }
                }
                if (vvod.toLowerCase(Locale.ROOT).equals("нет")) {
                    daNet = true;
                }
                if (daNet == false) {
                    System.err.println("-*-*-*-*-*-*-*-*-*-*-*-Введите 'ДА' или 'НЕТ'-*-*-*-*-*-*-*-*-*-*-*-");
                }
                if (daNet) {
                    break;
                }
            }
        }
    }

    static void addNewEmployees(List<Student> students, List<Human> employees) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-Введите вашу фамилию:-*-*-*-*-*-*-*-*-*-*-*-");
        String surname = scanner.next();
        Human.lowerFirsSurename(surname);
        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-Введите ваше имя:-*-*-*-*-*-*-*-*-*-*-*-");
        String name = scanner.next();
        Human.lowerFirsName(name);
        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-Введите ваше отчество:-*-*-*-*-*-*-*-*-*-*-*-");
        String patronumic = scanner.next();
        Human.lowerFirsPatronumic(patronumic);
        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-Придумайте логин-*-*-*-*-*-*-*-*-*-*-*-");
        String login = scanner.next();
        Human.loginGmail(login);
        int id = Human.generateUniqueId();
        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-Придумайте пароль-*-*-*-*-*-*-*-*-*-*-*-");
        String password = null;
        int schet = 0;
        String post = null;
        password = passwordSetting(password);

        boolean b = false;
        while (true) {
            try {
                int first = 1;
                int two = 2;
                int three = 3;
                int foure = 4;
                int fifty = 5;
                int six = 6;
                schet = Student.dobovlenieCheta(first, two, three, foure, fifty, six);
                b = true;

            } catch (Exception e) {
                System.err.println("-*-*-*-*-*-*-*-*-*-*-*--Ошибка!!!-*-*-*-*-*-*-*-*-*-*-*-" + "\n-*-*-*-*-*-*-*-*-*-*-*-Неверный формат ввода!!-*-*-*-*-*-*-*-*-*-*-*-");
            }
            if (b) {
                break;
            }
        }
        boolean g = false;
        while (true) {
            try {
                post = Post(post);
                g = true;

            } catch (Exception e) {
                System.err.println("-*-*-*-*-*-*-*-*-*-*-*-Ошибка!!!-*-*-*-*-*-*-*-*-*-*-*-" + "\n-*-*-*-*-*-*-*-*-*-*-*-Неверный формат ввода!!-*-*-*-*-*-*-*-*-*-*-*-");
            }
            if (g) {
                break;
            }
        }
        int salary = 0;
        boolean s = false;
        while (true) {

            try {
                salary = salarySetting(salary);
                s = true;
            } catch (Exception e) {
                System.err.println("-*-*-*-*-*-*-*-*-*-*-*--Ошибка!!!-*-*-*-*-*-*-*-*-*-*-*-" + "\n-*-*-*-*-*-*-*-*-*-*-*-Неверный формат ввода!!-*-*-*-*-*-*-*-*-*-*-*-");
            }
            if (s) {
                break;
            }
        }
        int workExperience = 0;
        boolean c = false;
        while (true) {
            try {
                workExperience = workExperienceSetting(workExperience);
                c = true;

            } catch (Exception e) {
                System.err.println("-*-*-*-*-*-*-*-*-*-*-*-Ошибка!!!-*-*-*-*-*-*-*-*-*-*-*-" + "\n-*-*-*-*-*-*-*-*-*-*-*-Неверный формат ввода!!-*-*-*-*-*-*-*-*-*-*-*-");
            }
            if (c) {
                break;
            }
        }
        Human human = new Human(Human.lowerFirsSurename(surname), Human.lowerFirsName(name), lowerFirsPatronumic(patronumic), workExperience, salary, Human.loginGmail(login), password, id, schet, post);
        employees.add(human);
        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-Ф.И.О. сотрудника: " + Human.lowerFirsSurename(surname) + " " + Human.lowerFirsName(name) + " " + lowerFirsPatronumic(patronumic) + "-*-*-*-*-*-*-*-*-*-*-*-");
        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-ID сотрудника: " + id + "-*-*-*-*-*-*-*-*-*-*-*-");
        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-Денег на карте:" + schet + "-*-*-*-*-*-*-*-*-*-*-*-");
        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-Логин сотрудника: " + Human.loginGmail(login) + "-*-*-*-*-*-*-*-*-*-*-*-");
        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-Пароль сотрудника: " + password + "-*-*-*-*-*-*-*-*-*-*-*-");
        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-Должность сотрудника: " + post + "-*-*-*-*-*-*-*-*-*-*-*-");
        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-Стаж работы: " + workExperience + "-*-*-*-*-*-*-*-*-*-*-*-");
        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-Зарплата: " + salary + "-*-*-*-*-*-*-*-*-*-*-*-");
        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-Информация о новом сотруднике успешно добавлена в базу данных.-*-*-*-*-*-*-*-*-*-*-*-");
        School.restart(students, employees);


    }

    static int workExperienceSetting(int workExperience) {
        boolean b = false;
        while (true) {
            System.out.println("-*-*-*-*-*-*-*-*-*-*-*-Введите стаж сотрудника:-*-*-*-*-*-*-*-*-*-*-*-");
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            if (n > 0 && n < 11) {
                workExperience = n;
                b = true;
            }
            if (!b) {
                System.err.println("-*-*-*-*-*-*-*-*-*-*-*-Вы перевысели лимит зарплаты!!-*-*-*-*-*-*-*-*-*-*-*-");
            }
            if (b) {
                break;

            }

        }
        return workExperience;


    }

    static int salarySetting(int salary) {
        boolean b = false;
        while (true) {
            System.out.println("-*-*-*-*-*-*-*-*-*-*-*-Введите зарплату сотрудника-*-*-*-*-*-*-*-*-*-*-*-");
            Scanner scanner = new Scanner(System.in);
            int f = scanner.nextInt();
            if (f <= 20000 && 3000 < f) {
                salary = f;
                b = true;
            }
            if (!b) {
                System.err.println("-*-*-*-*-*-*-*-*-*-*-*-Вы перевысели лимит зарплаты!!-*-*-*-*-*-*-*-*-*-*-*-");
            }
            if (b) {
                break;

            }

        }
        return salary;
    }


    static String Post(String post) {
        boolean j = false;
        while (true) {
            System.out.println("-*-*-*-*-*-*-*-*-*-*-*-Введите 1 чтобы выбрать должность 'Бухгалтера'-*-*-*-*-*-*-*-*-*-*-*-" +
                    "\n-*-*-*-*-*-*-*-*-*-*-*-Введите 2 чтобы выбрать должность 'Учителя'-*-*-*-*-*-*-*-*-*-*-*-" +
                    "\n-*-*-*-*-*-*-*-*-*-*-*-Введите 3 чтобы выбрать должность 'Повара'-*-*-*-*-*-*-*-*-*-*-*-" +
                    "\n-*-*-*-*-*-*-*-*-*-*-*-Введите 4 чтобы выбрать должность 'Дворника'-*-*-*-*-*-*-*-*-*-*-*-" +
                    "\n-*-*-*-*-*-*-*-*-*-*-*-Введите 5 чтобы выбрать должность 'Медсестра'-*-*-*-*-*-*-*-*-*-*-*-");
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            if (n == 1) {
                post = "Бухгалтер";
                j = true;
            }
            if (n == 2) {
                post = "Учитель";
                j = true;
            }
            if (n == 3) {
                post = "Повар";
                j = true;
            }
            if (n == 4) {
                post = "Дворник";
                j = true;
            }
            if (n == 5) {
                post = "Медсестра";
                j = true;
            }

            if (!j) {
                System.err.println("-*-*-*-*-*-*-*-*-*-*-*-Ошибка!!!-*-*-*-*-*-*-*-*-*-*-*-" + "\n-*-*-*-*-*-*-*-*-*-*-*-Следуйте заданным инструкциям!!-*-*-*-*-*-*-*-*-*-*-*-");

            }
            if (j) {
                break;
            }

        }
        return post;

    }

    static void PerevodSredstv(List<Human> employees) {
        boolean temp = false;
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("-*-*-*-*-*-*-*-*-*-*-*-Введите id сотрудника:-*-*-*-*-*-*-*-*-*-*-*-");
            int id = scanner.nextInt();
            for (int i = 0; i < employees.size(); i++) {
                if (id == employees.get(i).getId()) {
                    Human.sredstva(employees.get(i));
                    temp = true;
                }
            }
            if (temp) {
                break;
            }
            if (temp == false) {
                System.err.println("-*-*-*-*-*-*-*-*-*-*-*-Такого сотрудника нет!!!-*-*-*-*-*-*-*-*-*-*-*-" +
                        "\n-*-*-*-*-*-*-*-*-*-*-*-Повторите попытку!!!-*-*-*-*-*-*-*-*-*-*-*-");
            }
        }

    }

    static void sredstva(Human human) {
        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-Это сотрудник:" + human.getName() + " " + human.getSurname() + " " + human.getPatronymic() + "-*-*-*-*-*-*-*-*-*-*-*-");
        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-Зарплата сотрудника состовляет: " + human.getSalary() + " сомов-*-*-*-*-*-*-*-*-*-*-*-");
        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-На счету сотрудника: " + human.getChet() + " сомов-*-*-*-*-*-*-*-*-*-*-*-");
        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-Бюджет школы состовляет: " + Main.MoneySchool + "-*-*-*-*-*-*-*-*-*-*-*-");

        boolean b = false;
        while (true) {
            try {
                System.out.println("-*-*-*-*-*-*-*-*-*-*-*-Введите сумму которую хотите перевести на счет сотрудника:-*-*-*-*-*-*-*-*-*-*-*-");
                Scanner scanner = new Scanner(System.in);
                int n = scanner.nextInt();
                if (n > Main.MoneySchool) {
                    System.err.println("\"-*-*-*-*-*-*-*-*-*-*-*-Вы перевесили лимит денег:-*-*-*-*-*-*-*-*-*-*-*-");
                }
                if (n < Main.MoneySchool) {
                    System.out.println("\"-*-*-*-*-*-*-*-*-*-*-*-Вы успешно перевели денги данному сотруднику:-*-*-*-*-*-*-*-*-*-*-*-");
                    System.out.println("\"-*-*-*-*-*-*-*-*-*-*-*-На счету сотрудника было:" + human.getChet() + "-*-*-*-*-*-*-*-*-*-*-*-");
                    int x = human.getChet() + n;
                    System.out.println("\"-*-*-*-*-*-*-*-*-*-*-*-Стало :" + x + "-*-*-*-*-*-*-*-*-*-*-*-");
                    System.out.println("\"-*-*-*-*-*-*-*-*-*-*-*-Бюджет школы состовляло:" + Main.MoneySchool + "-*-*-*-*-*-*-*-*-*-*-*-");
                    Main.MoneySchool = (int) (Main.MoneySchool - n);
                    System.out.println("\"-*-*-*-*-*-*-*-*-*-*-*-Стало :" + Main.MoneySchool + "-*-*-*-*-*-*-*-*-*-*-*-");

                    b = true;
                }

            } catch (Exception e) {
                System.err.println("-*-*-*-*-*-*-*-*-*-*-*-Ошибка!!!-*-*-*-*-*-*-*-*-*-*-*-" + "\n-*-*-*-*-*-*-*-*-*-*-*-Неверный формат ввода!!-*-*-*-*-*-*-*-*-*-*-*-");

            }
            if (b) {
                break;
            }
        }


    }

    static void payedSalary(List<Human> employees) {
        boolean temp = false;
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("-*-*-*-*-*-*-*-*-*-*-*-Введите id кому хотите выдать зарплату:-*-*-*-*-*-*-*-*-*-*-*-");
            int id = scanner.nextInt();
            for (int i = 0; i < employees.size(); i++) {
                if (id == employees.get(i).getId()) {
                    System.out.println("-*-*-*-*-*-*-*-*-*-*-*-Это сотрудник :" + employees.get(i).getSurname() + " " + employees.get(i).getName() + " " + employees.get(i).getPatronymic() + "-*-*-*-*-*-*-*-*-*-*-*-");
                    System.out.println("-*-*-*-*-*-*-*-*-*-*-*-:Денег на счету: " + employees.get(i).getChet() + "-*-*-*-*-*-*-*-*-*-*-*-");
                    System.out.println("-*-*-*-*-*-*-*-*-*-*-*-Зарплата сотрудника состовляет " + employees.get(i).getSalary() + " сомов-*-*-*-*-*-*-*-*-*-*-*-");
                    System.out.println("-*-*-*-*-*-*-*-*-*-*-*-Бюджет школы состовляет: " + Main.MoneySchool + "-*-*-*-*-*-*-*-*-*-*-*-");
                    Human.salary(employees.get(i));
                    temp = true;
                }
            }
            if (temp) {
                break;
            }
            if (temp == false) {
                System.err.println("-*-*-*-*-*-*-*-*-*-*-*-Такого сотрудника нет!!!-*-*-*-*-*-*-*-*-*-*-*-" +
                        "\n-*-*-*-*-*-*-*-*-*-*-*-Повторите попытку!!!-*-*-*-*-*-*-*-*-*-*-*-");
            }
        }
    }


    public int getChet() {
        return chet;
    }

    public int getWorkExperience() {
        return workExperience;
    }

    public int getSalary() {
        return salary;
    }

    public String getPost() {
        return post;
    }

    public String getSurname() {
        return surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public String getName() {
        return name;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public int getId() {
        return id;
    }


}
