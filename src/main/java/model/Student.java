/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author dvan2301
 */
public class Student {
    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author dvan2301
 */

//   sinh viên có các thuộc tính: id, name, pass,  email, phone, gender, address
    private String stuId;
    private String stuName;
    private String stuPass;
    private String stuEmail;
    private String stuPhone; 
    private String stuGender;
    private String stuAddress;

    public Student() {
    }

    
    
    public Student(String stuId, String stuName, String stuPass, String stuEmail, String stuPhone, String stuGender, String stuAddress) {
        this.stuId = stuId;
        this.stuName = stuName;
        this.stuPass = stuPass;
        this.stuEmail = stuEmail;
        this.stuPhone = stuPhone;
        this.stuGender = stuGender;
        this.stuAddress = stuAddress;
    }

    public String getStuId() {
        return stuId;
    }

    public void setStuId(String stuId) {
        this.stuId = stuId;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public String getStuPass() {
        return stuPass;
    }

    public void setStuPass(String stuPass) {
        this.stuPass = stuPass;
    }

    public String getStuEmail() {
        return stuEmail;
    }

    public void setStuEmail(String stuEmail) {
        this.stuEmail = stuEmail;
    }

    public String getStuPhone() {
        return stuPhone;
    }

    public void setStuPhone(String stuPhone) {
        this.stuPhone = stuPhone;
    }

    public String getStuGender() {
        return stuGender;
    }

    public void setStuGender(String stuGender) {
        this.stuGender = stuGender;
    }

    public String getStuAddress() {
        return stuAddress;
    }

    public void setStuAddress(String stuAddress) {
        this.stuAddress = stuAddress;
    }

    @Override
    public String toString() {
        return  stuId + "|" + stuName + "|" + stuPass + "|" + stuEmail + "|" + stuPhone + "|" + stuGender + "|" + stuAddress + "\n";
    }

 
    
}


