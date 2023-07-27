package practice.enums;
//Task: Okul yönetimi için student ve teacher silme programını yazınız
//User için role tanımlayın(ADMIN,TEACHER, STUDENT) ve role göre silme yetkisi veriniz.
//student silme yetkisi (ADMIN,TEACHER)
//teacher silme yetkisi ADMIN
public class SchoolManagement   {
    public static void main(String[] args) {

        //1 öğretmen ve öğrenci tanımla
        Student student = new Student("Helen Keller");
        Teacher teacher = new Teacher("Anne Sullivan Macy");

        //3 kullanıcı tanımla
        User user1 = new User("James Gosling",Role.ROLE_ADMIN);
        User user2 = new User("Mike Sheridan",Role.ROLE_TEACHER);
        User user3 = new User("Patrick Naughton",Role.ROLE_STUDENT);

        //methodların silme yetkilerini test et
        deleteStudents(student,user1);
        deleteStudents(student,user2);
        deleteStudents(student,user3);
        System.out.println();
        deleteTeachers(teacher,user1);
        deleteTeachers(teacher,user2);
        deleteTeachers(teacher,user3);
    }

    //deleteStudents methodunu oluştur
    public static void deleteStudents(Student std,User user){
        if (user.getRole().equals(Role.ROLE_ADMIN) || user.getRole().equals(Role.ROLE_TEACHER)){
            System.out.println("Student is deleted succesfully by "+ user.getRole().getName());
        }else{
            System.out.println(user.getRole().getName()+" is not permitted to delete students");
        }
    }

    //deleteTeachers methodunu oluştur
    public static void deleteTeachers(Teacher thc,User user){
        if (user.getRole().equals(Role.ROLE_ADMIN)){
            System.out.println("Teacher is deleted succesfully by "+ user.getRole().getName());
        }else{
            System.out.println(user.getRole().getName()+" is not permitted to delete Teachers");
        }
    }

}
