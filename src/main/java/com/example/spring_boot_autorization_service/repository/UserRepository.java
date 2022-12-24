package com.example.spring_boot_autorization_service.repository;

import com.example.spring_boot_autorization_service.service.Authorities;
import com.example.spring_boot_autorization_service.service.Name;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Repository
public class UserRepository {

    public final List<Authorities> ADMIN = new ArrayList<>();

    {
        ADMIN.add(Authorities.READ);
        ADMIN.add(Authorities.DELETE);
        ADMIN.add(Authorities.WRITE);
    }

    public final List<Authorities> APPUSER = new ArrayList<>();

    {
        APPUSER.add(Authorities.READ);
        APPUSER.add(Authorities.WRITE);
    }

    public final List<Authorities> READER = new ArrayList<>();

    {
        READER.add(Authorities.READ);
    }

    public Map<Name, List<Authorities>> users = new ConcurrentHashMap<>();

    {
        users.put(new Name("Anna", "anna123"), ADMIN);
        users.put(new Name("Misha", "misha123"), READER);
        users.put(new Name("Pasha", "pasha123"), APPUSER);
    }

    public List<Authorities> getUserAuthorities(String user, String password) {
        Name inputUser = new Name(user, password);
        return users.getOrDefault(inputUser, null);
    }
}
