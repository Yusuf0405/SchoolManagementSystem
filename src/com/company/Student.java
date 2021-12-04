package com.company;

import java.util.*;


public class Student {
    private String name;
    private String surname;
    private String patronymic;
    private String login;
    private String password;
    private int id;
    private int course;
    private int contract;
    private int payed = 0;
    private int chet;

    public Student(String surname, String name, String patronymic, String login, String password, int id, int course, int contract, int chet) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.login = login;
        this.password = password;
        this.id = id;
        this.course = course;
        this.contract = contract;
        this.chet = chet;

    }

    private static List<Student> students = new ArrayList<>();

    public static void payContractStudent(List<Student> students) {
        boolean temp = false;
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("-*-*-*-*-*-*-*-*-*-*-*-Введите id кому хотите оплатить контракт:-*-*-*-*-*-*-*-*-*-*-*-");
            int id = scanner.nextInt();
            for (int i = 0; i < students.size(); i++) {
                if (id == students.get(i).getId()) {
                    System.out.println("-*-*-*-*-*-*-*-*-*-*-*-Это ученик :" + students.get(i).getSurname() + " " + students.get(i).getName() + " " + students.get(i).getPatronymic() + "-*-*-*-*-*-*-*-*-*-*-*-");

                    payContract(students.get(i));
                    temp = true;
                }
            }
            if (temp) {
                break;
            }
            if (temp == false) {
                System.err.println("-*-*-*-*-*-*-*-*-*-*-*-Такого сотрудника нет!!!-*-*-*-*-*-*-*-*-*-*-*-" +
                        "\n-*-*-*-*-*-*-*-*-*-*-Повторите попытку!!!-*-*-*-*-*-*-*-*-*-*-*-");
            }
        }
    }


    public static void payContract(Student student) {
        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-Бюджет школы состовляет: " + Main.MoneySchool + "-*-*-*-*-*-*-*-*-*-*-*-");
        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-Контракт состовляет " + student.getContract() + " сомов-*-*-*-*-*-*-*-*-*-*-*-");
        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-Денег на карте: " + (student.getChet() + " cомов-*-*-*-*-*-*-*-*-*-*-*-"));
        boolean daNet = false;
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("-*-*-*-*-*-*-*-*-*-*-*-Введите 'ДА' если хотите оплатить контракт или 'НЕТ' чтобы отменть процесс-*-*-*-*-*-*-*-*-*-*-*-");
            String vvod = scanner.nextLine();
            if (vvod.toLowerCase(Locale.ROOT).equals("да")) {
                if (student.getChet() < student.getContract()) {
                    System.err.println("-*-*-*-*-*-*-*-*-*-*-*-У вас не достаточно денег на счете чтобы оплатить контракт-*-*-*-*-*-*-*-*-*-*-*-");
                    daNet = true;
                }
                if (student.getChet() > student.getContract()) {
                    System.out.println("-*-*-*-*-*-*-*-*-*-*-*-Вы оплатили контракт-*-*-*-*-*-*-*-*-*-*-*-");
                    System.out.println("-*-*-*-*-*-*-*-*-*-*-*-Было денег на счету: " + student.getChet() + "-*-*-*-*-*-*-*-*-*-*-*-");
                    int b = (student.getChet() - student.getContract());
                    System.out.println("-*-*-*-*-*-*-*-*-*-*-*-Осталось денег на счету: " + b + "-*-*-*-*-*-*-*-*-*-*-*-");
                    System.out.println("-*-*-*-*-*-*-*-*-*-*-*-Бюджет школы состовляло: " + Main.MoneySchool + "-*-*-*-*-*-*-*-*-*-*-*-");
                    Main.MoneySchool = Main.MoneySchool + student.getContract();
                    System.out.println("-*-*-*-*-*-*-*-*-*-*-*-Стало: " + Main.MoneySchool + "-*-*-*-*-*-*-*-*-*-*-*-");
                    b = student.getChet();
                    daNet = true;

                }
            }
            if (vvod.toLowerCase(Locale.ROOT).equals("нет")) {
                System.err.println("-*-*-*-*-*-*-*-*-*-*-*-Не забудьте оплатит контракт а то вас отчислят-*-*-*-*-*-*-*-*-*-*-*-");
                daNet = true;

            }
            if (!daNet) {
                System.err.println("-*-*-*-*-*-*-*-*-*-*-*-Введите 'ДА' или 'НЕТ'-*-*-*-*-*-*-*-*-*-*-*-");
            }
            if (daNet) {
                break;
            }
        }
    }

    static void searchStudentName(List<Student> students) {
        boolean temp = false;
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("-*-*-*-*-*-*-*-*-*-*-*-Введите имя ученика чтобы его найти:-*-*-*-*-*-*-*-*-*-*-*-");
            String name = scanner.nextLine();
            for (int i = 0; i < students.size(); i++) {
                if (name.toLowerCase(Locale.ROOT).equals(students.get(i).getName().toLowerCase(Locale.ROOT))) {
                    System.out.println("-*-*-*-*-*-*-*-*-*-*-*-Ф.И.О. студента: " + students.get(i).getSurname() + "" + students.get(i).name + "" + students.get(i).patronymic + "-*-*-*-*-*-*-*-*-*-*-*-");
                    System.out.println("-*-*-*-*-*-*-*-*-*-*-*-ID студента: " + Human.generateUniqueId() + "-*-*-*-*-*-*-*-*-*-*-*-");
                    System.out.println("-*-*-*-*-*-*-*-*-*-*-*-Курс студента: " + students.get(i).getCourse() + "-*-*-*-*-*-*-*-*-*-*-*-");
                    System.out.println("-*-*-*-*-*-*-*-*-*-*-*-Контракт студента: " + students.get(i).getContract() + "-*-*-*-*-*-*-*-*-*-*-*-");
                    System.out.println("**************************************************************************************************************************************");
                    temp = true;
                }
            }

            if (temp) {
                break;
            }
            if (temp == false) {
                System.err.println("-*-*-*-*-*-*-*-*-*-*-*-Такого студента нет!!!-*-*-*-*-*-*-*-*-*-*-*-" +
                        "\n-*-*-*-*-*-*-*-*-*-*-*-Повторите попытку!!!-*-*-*-*-*-*-*-*-*-*-*-");
            }
        }

    }

    static void searchStudentId(Scanner scanner, List<Student> students) {
        boolean temp = false;
        while (true) {
            System.out.println("-*-*-*-*-*-*-*-*-*-*-*-Введите id ученика чтобы его найти:-*-*-*-*-*-*-*-*-*-*-*-");
            int id = scanner.nextInt();
            for (int i = 0; i < students.size(); i++) {
                if (id == students.get(i).getId()) {
                    System.out.println("-*-*-*-*-*-*-*-*-*-*-*-Ф.И.О. студента: " + students.get(i).getSurname() + "" + students.get(i).name + "" + students.get(i).patronymic + "-*-*-*-*-*-*-*-*-*-*-*-");
                    System.out.println("-*-*-*-*-*-*-*-*-*-*-*-ID студента: " + Human.generateUniqueId() + "-*-*-*-*-*-*-*-*-*-*-*-");
                    System.out.println("-*-*-*-*-*-*-*-*-*-*-*-Курс студента: " + students.get(i).getCourse() + "-*-*-*-*-*-*-*-*-*-*-*-");
                    System.out.println("-*-*-*-*-*-*-*-*-*-*-*-Контракт студента: " + students.get(i).getContract() + "-*-*-*-*-*-*-*-*-*-*-*-");
                    System.out.println("**************************************************************************************************************************************");
                    temp = true;
                }
            }
            if (temp) {
                break;
            }
            if (temp == false) {
                System.out.println("-*-*-*-*-*-*-*-*-*-*-*-Такого студента нет!!!-*-*-*-*-*-*-*-*-*-*-*-" +
                        "\n-*-*-*-*-*-*-*-*-*-*-*-Повторите попытку!!!-*-*-*-*-*-*-*-*-*-*-*-");
            }
        }
    }


    static void getAllStudents(List<Student> students) {
        for (int i = 0; i < students.size(); i++) {
            getStudentInfo(students.get(i));
        }
    }

    static void getStudentInfo(Student student) {
        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-Ф.И.О. студента: " + student.getSurname() + " " + student.name + " " + student.patronymic + "-*-*-*-*-*-*-*-*-*-*-*-");
        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-ID студента: " + Human.generateUniqueId() + "-*-*-*-*-*-*-*-*-*-*-*-");
        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-Курс студента: " + student.getCourse() + "-*-*-*-*-*-*-*-*-*-*-*-");
        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-Контракт студента: " + student.getContract() + "-*-*-*-*-*-*-*-*-*-*-*-");
        System.out.println("**************************************************************************************************************************************");


    }


    static void addNewStudent(List<Student> students) {
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
        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-Придумайте пароль-*-*-*-*-*-*-*-*-*-*-*-");
        String password = null;
        password = Human.passwordSetting(password);
        int id = Human.generateUniqueId();
        int contract = 0;
        int course = 0;
        int schet = 0;
        boolean c = false;
        while (true) {
            try {
                int first = 1;
                int two = 2;
                int three = 3;
                int foure = 4;
                int fifty = 5;
                int six = 6;
                course = courseS(course);
                contract = contractLimit(contract);
                schet = dobovlenieCheta(first, two, three, foure, fifty, six);
                c = true;

            } catch (Exception e) {
                System.err.println("-*-*-*-*-*-*-*-*-*-*-*--Ошибка!!!-*-*-*-*-*-*-*-*-*-*-*-" + "\n-*-*-*-*-*-*-*-*-*-*-*-Неверный формат ввода!!-*-*-*-*-*-*-*-*-*-*-*-");
            }
            if (c) {
                break;
            }
        }


        Student student = new Student(Human.lowerFirsSurename(surname), Human.lowerFirsName(name), Human.lowerFirsPatronumic(patronumic), Human.loginGmail(login), password, id, course, contract, schet);
        students.add(student);
        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-Ф.И.О. студента: " + Human.lowerFirsSurename(surname) + " " + Human.lowerFirsName(name) + " " + Human.lowerFirsPatronumic(patronumic) + "-*-*-*-*-*-*-*-*-*-*-*-");
        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-ID студента: " + id + "-*-*-*-*-*-*-*-*-*-*-*-");
        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-Курс студента: " + course + "-*-*-*-*-*-*-*-*-*-*-*-");
        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-Денег на карте:" + schet + "-*-*-*-*-*-*-*-*-*-*-*-");
        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-Логин студента: " + Human.loginGmail(login) + "-*-*-*-*-*-*-*-*-*-*-*-");
        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-Контракт студента: " + contract + " сомов.-*-*-*-*-*-*-*-*-*-*-*-");
        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-Пароль студента: " + password + "-*-*-*-*-*-*-*-*-*-*-*-");
        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-Информация о новом студенте успешно добавлена в базу данных.-*-*-*-*-*-*-*-*-*-*-*-");
    }

    static int dobovlenieCheta(int first, int two, int three, int foure, int fifty, int six) {
        int schet = 0;
        boolean temp2 = false;
        while (true) {
            System.out.println("-*-*-*-*-*-*-*-*-*-*-*-Введите id своего банковского счета:-*-*-*-*-*-*-*-*-*-*-*-");
            Scanner scanner = new Scanner(System.in);
            int idCheta = scanner.nextInt();
            if (idCheta == first) {
                schet = 10000;
                temp2 = true;
            }
            if (idCheta == two) {
                schet = 20000;
                temp2 = true;
            }
            if (idCheta == three) {
                schet = 30000;
                temp2 = true;
            }
            if (idCheta == foure) {
                schet = 40000;
                temp2 = true;
            }
            if (idCheta == fifty) {
                schet = 50000;
                temp2 = true;
            }
            if (idCheta == six) {
                schet = 60000;
                temp2 = true;
            }

            if (!temp2) {
                System.err.println("-*-*-*-*-*-*-*-*-*-*-*-Такого счета нет!!!-*-*-*-*-*-*-*-*-*-*-*-");
            }
            if (temp2) {
                break;

            }
        }
        return schet;
    }


    static int courseS(int course) {
        boolean b = false;
        while (true) {
            System.out.println("-*-*-*-*-*-*-*-*-*-*-*-Введите курс студента:-*-*-*-*-*-*-*-*-*-*-*-");
            Scanner scan = new Scanner(System.in);
            int c = scan.nextInt();
            if (c <= 6) {
                course = c;
                b = true;
            }
            if (b == false) {
                System.err.println("-*-*-*-*-*-*-*-*-*-*-*-Такого курса нет!!!-*-*-*-*-*-*-*-*-*-*-*-");

            }
            if (b == true) {
                break;
            }
        }


        return course;


    }

    static int contractLimit(int contract) {
        boolean b = false;
        while (true) {
            System.out.println("-*-*-*-*-*-*-*-*-*-*-*-Укажите стоимость контракта-*-*-*-*-*-*-*-*-*-*-*-");
            Scanner scan = new Scanner(System.in);
            int c = scan.nextInt();
            if (c >= 3000 && c <= 16000) {
                contract = c;

                b = true;
            }
            if (b == false) {
                System.err.println("-*-*-*-*-*-*-*-*-*-*-*-Минимальный контракт 3000 сомов!!!-*-*-*-*-*-*-*-*-*-*-*-" + "\n-*-*-*-*-*-*-*-*-*-*-*-Максимальный 16000 сомов!!!-*-*-*-*-*-*-*-*-*-*-*-");

            }
            if (b == true) {
                break;
            }
        }


        return contract;


    }



    public String getSurname() {
        return surname;
    }


    public String getPatronymic() {
        return patronymic;
    }




    public int getCourse() {
        return course;
    }


    public int getContract() {
        return contract;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public void setContract(int contract) {
        this.contract = contract;
    }

    public int getPayed() {
        return payed;
    }

    public void setPayed(int payed) {
        this.payed = payed;
    }

    public int getChet() {
        return chet;
    }

    public void setChet(int chet) {
        this.chet = chet;
    }

    public static List<Student> getStudents() {
        return students;
    }

    public static void setStudents(List<Student> students) {
        Student.students = students;
    }
}
