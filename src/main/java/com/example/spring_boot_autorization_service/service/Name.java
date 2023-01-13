package com.example.spring_boot_autorization_service.service;

import java.util.Objects;

public class Name {

    private String user;
    private String password;

    public Name(String user, String password) {
        this.user = user;
        this.password = password;
    }

    public String getUser() {
        return user;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Name name = (Name) o;
        return Objects.equals(user, name.user) && Objects.equals(password, name.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(user, password);
    }

}
