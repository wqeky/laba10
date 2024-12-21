public class AdministrativeEmployee extends Employee {
    public AdministrativeEmployee(int ssNo, String name, String email) {
        super(ssNo, name, email);
    }

    static class Main {
        public static void main(String[] args) {
            Employee admin = new AdministrativeEmployee(1245, "Sofya Kulakova", "sofakulakova@mail.ru");
            Faculty faculty = new Faculty(new AdministrativeEmployee(1902, "Krylovetskiy Alexandr", "dekanFkn@yandex.ru"), "Faculty of Computer Science");
            ResearchAssociate scientist = new ResearchAssociate(100902, "Lazovoy Dmitriy", "dimitriFIZ@yandex.ru", "Radio electronics");
            String adminStr = admin.toString();
            String facultyStr = faculty.toString();
            String scientistStr = scientist.toString();
            System.out.println(adminStr);
            System.out.println(facultyStr);
            System.out.println(scientistStr);
            admin.setEmail("wqeky@yandex.ru");
            admin.setSsNo(9432);
            faculty.setName("Faculty of Applied Computer Science and Mathematics");
            scientist.setFieldOfStudy("Nuclear power plant enginering");
            System.out.println("------------------------------------------------");
            System.out.println(admin);
            System.out.println(faculty);
            System.out.println(scientist);
        }
    }

}