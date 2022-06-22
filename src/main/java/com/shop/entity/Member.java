package com.shop.entity;

import com.shop.constant.Role;
import com.shop.dto.JoinFormDto;
import lombok.ToString;
import org.springframework.security.crypto.password.PasswordEncoder;

import javax.persistence.*;

@Entity
@Table(name = "member")
@ToString
public class Member extends BaseEntity {

    @Id
    @Column(name = "member_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(unique = true)
    private String email;
    private String name;
    private String address;
    private String password;

    @Enumerated(EnumType.STRING)
    private Role role;

    public static Member createMember(JoinFormDto joinFormDto, PasswordEncoder passwordEncoder) {
        Member member = new Member();
        member.setName(joinFormDto.getName());
        member.setEmail(joinFormDto.getEmail());
        member.setAddress(joinFormDto.getAddress());
        String password = passwordEncoder.encode(joinFormDto.getPassword());
        member.setPassword(password);
        member.setRole(Role.ADMIN);
        return member;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

}
