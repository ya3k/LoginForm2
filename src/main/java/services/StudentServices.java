/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import model.Student;

/**
 *
 * @author dvan2301
 */
public class StudentServices {

    List<Student> stu = new ArrayList<>();
    

    public StudentServices() throws IOException {
      

    }

    public List<Student> ShowStudentList() {
        return stu;

    }
    
    
    //add student
     public void addStudent(String stuId, String stuName, String stuPass, String stuEmail, String stuPhone, String stuGender, String stuAddress) throws IOException{
     loadFromFileStudent();
     
         Student student = new Student(stuId, stuName, stuPass, stuEmail, stuPhone, stuGender, stuAddress);
      stu.add(student);
      
       saveToFileStudent();
    
    }
    
//delete student
     public void DeleteStudent(String id) throws IOException{
         
          loadFromFileStudent();
          
          
          for(Student s: stu){
              if(id.equals(s.getStuId())){
                 stu.remove(s);
              }
          }
          
          
          saveToFileStudent();
     }
     
     
    private void StudentDefault() throws IOException {
        //   sinh viên có các thuộc tính:id , name, passs,  email, phone, gender, address
  
    }

    
    //search student
    public void SearchStudent(String name) throws IOException{
       
         loadFromFileStudent();
         
         if(name != null){
             for(Student s: stu){
              if(s.getStuName().toLowerCase().contains(name.toLowerCase())){
                 
              }
          }
         }
         
      
     }
    
    
    //test save utf8
//    
//    public void saveUTF8() throws FileNotFoundException, IOException{
//         File f = new File("D:\\SEM4\\Login2\\test.txt");
//        try (FileOutputStream fos = new FileOutputStream(f);
//       OutputStreamWriter osw = new OutputStreamWriter(fos, StandardCharsets.UTF_8);
//       BufferedWriter bw = new BufferedWriter(osw)) {
//             for (Student st : stu) {
//                bw.write(st.toString());
//            }
//            bw.close();
//        }
//    }
    
  
    
//save to file
    public void saveToFileStudent() throws IOException {
       
        File f = new File("D:\\SEM4\\Login2\\student.txt");
        if (!f.exists()) {
//            System.out.println("NEW FILE IS CREATED");
            f.createNewFile();
        }
        try (FileWriter fw = new FileWriter( f)) {
            BufferedWriter bw = new BufferedWriter(fw);
            for (Student st : stu) {
                bw.write(st.toString());
            }
            bw.close();
        }
    }

    //load file
    public void loadFromFileStudent() throws FileNotFoundException, IOException {
        
        File f = new File("D:\\SEM4\\Login2\\student.txt");
        if (!f.exists()) {
//            System.out.println("NEW FILE IS CREATED");
            f.createNewFile();
        }
        try (FileReader fr = new FileReader(f)) {
            BufferedReader br = new BufferedReader(fr);
            
            while (true) {
                String line = br.readLine();
                if (line == null) {
                    break;
                }
                //   sinh viên có các thuộc tính:id , name, passs,  email, phone, gender, address
                String[] info = line.split("[|]");
                String id = info[0].trim();
                String name = info[1].trim();
                String pass = info[2].trim();
                String email = info[3].trim();
                String phone = info[4].trim();
                String gender = info[5].trim();
                String address = info[6].trim();
                
                stu.add(new Student(id, name, pass, email, phone, gender, address));
            }
//            System.out.println("LOAD SUCCESSFULL !");
            br.close();
        }
    }

}
