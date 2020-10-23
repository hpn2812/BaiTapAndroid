package com.example.listview_add_update_delete;

public class SinhVien {
    int avata;
    String name;
    int age;

    public SinhVien() {
    }

    public SinhVien(int avata, String name, int age) {
        this.avata = avata;
        this.name = name;
        this.age = age;
    }

    public int getAvata() {
        return avata;
    }

    public void setAvata(int avata) {
        this.avata = avata;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
