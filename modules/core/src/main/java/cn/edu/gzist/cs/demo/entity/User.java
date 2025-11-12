package cn.edu.gzist.cs.demo.entity;

public class User {
    private Long id;
    private String username;
    private int age;

    // 必须要有无参构造函数
    public User() {}

    // getter和setter方法
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }
}
