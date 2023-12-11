package com.example.appMusic.DTO;

public class UserDTO{
        Integer Id;
        String fullName;
        String phone;
        String avatar;

    public UserDTO(Integer id, String fullName, String phone, String avatar) {
        Id = id;
        this.fullName = fullName;
        this.phone = phone;
        this.avatar = avatar;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }
}
