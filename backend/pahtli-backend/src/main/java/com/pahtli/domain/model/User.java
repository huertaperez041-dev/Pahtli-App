package com.pahtli.domain.model;

import java.time.LocalDate;
import java.util.UUID;

public class User {

    private final UUID id;
    private String name;
    private String email;
    private String password;
    private String phone;
    private String city;
    private String state;
    private UserRoles role;
    private UserStatus status;
    private final LocalDate createdAt;

    public static User create(String name, String email, String password, String phone, String city, String state) {

        return new User(
                UUID.randomUUID(),
                name,
                email,
                password,
                phone,
                city,
                state,
                UserRoles.USER,
                UserStatus.PENDING,
                LocalDate.now());
    }

    private User(UUID id, String name, String email, String password, String phone, String city, String state,
            UserRoles role, UserStatus status, LocalDate createdAt) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.phone = phone;
        this.city = city;
        this.state = state;
        this.role = role;
        this.status = status;
        this.createdAt = createdAt;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getPhone() {
        return phone;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public UserRoles getRole() {
        return role;
    }

    public UserStatus getStatus() {
        return status;
    }

    public LocalDate getCreatedAt() {
        return createdAt;
    }

}
