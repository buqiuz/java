package day3;

import java.util.ArrayList;
import java.util.Scanner;

public class Test  {
    public static void main(String[] args) {
        ArrayList<Student> arrayList=new ArrayList<>();
        System.out.println("===============");
        System.out.println("===学生管理系统===");
        System.out.println("===============");
        Scanner scanner=new Scanner(System.in);
        int choice=1;
        while (choice!=0){
            System.out.println("1.增加学生");
            System.out.println("2.删除学生");
            System.out.println("3.修改学生");
            System.out.println("4.查询学生");
            System.out.println("0.退出");
            choice=scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("请输入学生信息");
                    System.out.print("id:");
                    int id = scanner.nextInt();
                    int flag=0;
                    for (Student student : arrayList) {
                        if(student.id==id){
                            System.out.println("该学生已存在！");
                            flag=1;
                            break;
                        }
                    }
                    if(flag==0){
                        System.out.print("name:");
                        String name = scanner.next();
                        System.out.print("age:");
                        int age=scanner.nextInt();
                        System.out.print("major:");
                        String major=scanner.next();
                        System.out.print("grade:");
                        int grade=scanner.nextInt();
                        Student student1=new Student(id,name,age,major,grade);
                        arrayList.add(student1);
                        System.out.println("增加成功！");
                    }
                    break;
                case 2:
                    System.out.print("请输入删除学生的id：");
                    int id1=scanner.nextInt();
                    for (Student student : arrayList) {
                        if (student.id==id1) {
                            arrayList.remove(student);
                            System.out.println("删除成功！");
                        }
                        else{
                            System.out.println("删除失败，找不到该学生。");
                        }
                    }
                    break;
                case 3:
                    System.out.print("请输入修改学生的id：");
                    int id2=scanner.nextInt();
                    for (Student student : arrayList) {
                        if (student.id==id2) {
                            System.out.print("id:");
                            student.id=scanner.nextInt();
                            System.out.print("name:");
                            student.name=scanner.next();
                            System.out.print("age:");
                            student.age=scanner.nextInt();
                            System.out.print("major:");
                            student.major=scanner.next();
                            System.out.print("grade:");
                            student.grade=scanner.nextInt();
                            System.out.println("修改成功");
                        }else{
                            System.out.println("修改失败，找不到该学生");
                        }
                    }
                    break;
                case 4:
                    System.out.print("请输入查询学生的id：");
                    int id3=scanner.nextInt();
                    for (Student student : arrayList) {
                        if (student.id==id3) {
                            System.out.println("查询成功！");
                            System.out.println("id      name        age       major        grade");
                            System.out.println(student.id+"      "+student.name+"        "+student.age+"       "+student.major+"        "+student.grade );
                        }else{
                            System.out.println("未找到该学生");
                        }
                    }
                    break;
                default:
                    break;
            }
        }
    }
}
