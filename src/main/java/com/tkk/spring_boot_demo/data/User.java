package com.tkk.spring_boot_demo.data;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created  on 2018-05-24
 *
 * @author 唐开阔
 * @describe
 */
@Entity
@Table(name="t_demo")
public class User {
    @Id
    @GeneratedValue
    private Integer _id;
    private String name;
    private String id;
    private String password;
    private String sax;
    private String age;

    public User() {
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSax() {
        return sax;
    }

    public void setSax(String sax) {
        this.sax = sax;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
