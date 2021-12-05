package com.company;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static Accountant accountant;
    static List<Human> employees = new ArrayList<>();
    static ArrayList<Student> students = new ArrayList<>();
    public static double theSchoolsBadge = 200000;

    public static void main(String[] args) {

        ArrayList<Teacher> teachers = new ArrayList<>();
        ArrayList<Cook> cooks = new ArrayList<>();
        ArrayList<Nurse> nurses = new ArrayList<>();
        ArrayList<Security> securities = new ArrayList<>();
        ArrayList<Janitor> janitors = new ArrayList<>();
        ArrayList<Accountant> accountants = new ArrayList<>();
        HashMap<Integer, Integer> bankChet = new HashMap<>();
        bankChet.put(1, 10000);
        bankChet.put(2, 20000);
        bankChet.put(3, 30000);
        bankChet.put(4, 40000);
        bankChet.put(5, 50000);
        bankChet.put(6, 60000);
        Teacher mariya = new Teacher("Абакарова", "София", "Курбановна", 2, 30000, "bghreh@gmail.com", "3r4f33", bankChet.get(5), "Учитель");
        Teacher ekaterina = new Teacher("Макарова", "Рахат ", "Акылбековна", 4, 30000, "gergbuaiigr@gmail.com", "2fgwf", bankChet.get(1), "Учитель");
        Teacher kibriya = new Teacher("Умаралиев", "Абдуллох", "Улугбекович", 8, 30000, "gergbuaiigr@gmail.com", "45rfw2", bankChet.get(2), "Учитель");
        Teacher ekutoy = new Teacher("Абдыралиева", "Чынара ", "Мелисовна", 5, 30000, "gergbuaiigr@gmail.com", "25qqqrr", bankChet.get(3), "Учитель");
        Teacher roziyahon = new Teacher("Новикова", "Таисия", "Максимовна", 6, 30000, "gergbuaiigr@gmail.com", "23r3r", bankChet.get(3), "Учитель");
        Teacher anna = new Teacher("Абушкина", "Наталья", "Валерьевна", 4, 30000, "gergbuaiigr@gmail.com", "23r322", bankChet.get(1), "Учитель");
        teachers.add(mariya);
        teachers.add(ekaterina);
        teachers.add(kibriya);
        teachers.add(ekutoy);
        teachers.add(roziyahon);
        teachers.add(anna);
        Cook mike = new Cook("Иванов", "Константин", "Дмитриевич", 3, 3000, "gr@gmail.com", "74574", bankChet.get(2), "Повар");
        Cook toni = new Cook("Филатова", "Милана", "Николаевна", 2, 50000, "gr@gmail.com", "74574", bankChet.get(4), "Повар");
        cooks.add(mike);
        cooks.add(toni);
        Nurse masha = new Nurse("Власов", "Артём", "Александрович", 1, 30000, "gr@gmail.com", "74574", bankChet.get(1), "Медсестра");
        Nurse madina = new Nurse("Горбачева", "Юлия", "Михайловна", 3, 44500, "gr@gmail.com", "74574", bankChet.get(4), "Медсестра");
        nurses.add(madina);
        nurses.add(masha);
        Security jame = new Security("Александров", "Пётр", "Васильевич", 2, 88000, "gr@gmail.com", "74574", bankChet.get(4), "Охранник");
        securities.add(jame);
        Janitor nazima = new Janitor("Романова", "Ника", "Дмитриевна", 4, 89000, "gr@gmail.com", "74574", bankChet.get(5), "Дворник");
        janitors.add(nazima);

        employees.addAll(teachers);
        employees.addAll(nurses);
        employees.addAll(securities);
        employees.addAll(cooks);
        employees.addAll(janitors);
        employees.addAll(accountants);
        Student aman = new Student("Архипов", "Данила", "Андреевич", "fvgegeg@gmail.com", "344554", 3, 300000, bankChet.get(1));
        Student josef = new Student("Викулова", "Вероника", "Сергеевна", "gegergr@gmail.com", "53536", 2, 10000, bankChet.get(5));
        Student borya = new Student("Девятова", "Оксана", "Сергеевна", "gegrgeg@gmail.com", "5545466", 3, 20000, bankChet.get(4));
        Student yan = new Student("Демьянова", "Ирина", "Владимировна", "agvreafgag@gmail.com", "987654", 4, 5000, bankChet.get(2));
        Student kesha = new Student("Духов", "Денис", "Михайлович", "agrgbff@gmail.com", "htgh555", 3, 10670, bankChet.get(1));
        Student afonya = new Student("Вавилова", "София", "Данииловна", "efwgfgwgwg@gmail.com", "8765grg", 4, 50000, bankChet.get(6));
        Student yusuf = new Student("Киселева", "Роза", "Ивановна", "wgfwgtw@gmail.com", "96hyy009", 1, 8000, bankChet.get(3));
        Student ulyana = new Student("Ерофеева", "Ульяна", "Тимофеевна", "wwwwwwweggg@gmail.com", "5y4gg55", 2, 3000, bankChet.get(2));
        Student nika = new Student("Морозова", "Ника", " Алексеевна", "jtkjtjtj@gmail.com", "gerhh45", 2, 3000, bankChet.get(1));
        Student ahmed = new Student("Колесникова", "Александра", "Платоновна", "jtjththht@gmail.com", "65greeg", 4, 3000, bankChet.get(2));
        Student aleksandra = new Student("Сергеев", "Степан", " Ильич", "kuyhhhr@gmail.com", "5rgeg5e", 2, 3000, bankChet.get(5));
        Student bogdan = new Student("Соболев", "Богдан", "Никитич", "jwahrthg@gmail.com", "rgegedgdv", 2, 30000, bankChet.get(2));
        Student daya = new Student("Карасева", "Дарья", "Андреевна", "fnfvdtd@gmail.com", "hthfdftth6", 3, 2000, bankChet.get(6));
        Student ulya = new Student("Александрова", "Ульяна", "Григорьевна", "vdrghbdgd@gmail.com", "hfthffgf", 5, 16000, bankChet.get(1));
        Student margarita = new Student("Быкова", "Маргарита", "Максимовна", "jyhgrfev@gmail.com", "dgrgedg", 2, 8500, bankChet.get(2));
        Student kseniya = new Student("Зыкова", "Ксения", "Артёмовна", "uytrfgvf@gmail.com", "ghrrezg", 3, 9900, bankChet.get(2));
        Student arseniy = new Student("Шилов", "Арсений", "Николаевич", "jevwrhwrr@gmail.com", "ujuk666", 1, 12000, bankChet.get(5));
        Student elizaveta = new Student("Демина", "Елизавета", "Ивановна ", "nmjmunuh@gmail.com", "e5y5etefg", 2, 6700, bankChet.get(2));
        Student roma = new Student("Яшин", "Роман", "Макарович", "zFefefsff@gmail.com", "654gerg", 2, 22000, bankChet.get(3));
        Student arina = new Student("Соколова", "Арина", "Егоровна", "mnbvththrh@gmail.com", "45yegege", 1, 9900, bankChet.get(4));
        Student varvara = new Student("Моисеева", "Варвара", "Михайловна", "hrjrhrhjrj@gmail.com", "hbnfhtt", 5, 3000, bankChet.get(4));
        students.add(aman);
        students.add(ulya);
        students.add(ulyana);
        students.add(nika);
        students.add(aleksandra);
        students.add(varvara);
        students.add(bogdan);
        students.add(daya);
        students.add(margarita);
        students.add(kseniya);
        students.add(arseniy);
        students.add(elizaveta);
        students.add(roma);
        students.add(arina);
        students.add(josef);
        students.add(borya);
        students.add(yan);
        students.add(kesha);
        students.add(afonya);
        students.add(yusuf);
        students.add(ahmed);

        accountant = new Accountant("Комарова", "Елизавета", "Артёмовна", 4, 90030, "1", "1", bankChet.get(1), "Бухгалтер");
        accountants.add(accountant);
        School school = new School();
        School.readingFile();
        school.welcome();
        // Логин 1
        // пароль 1
//        afonya.payContract(afonya);


    }

}

