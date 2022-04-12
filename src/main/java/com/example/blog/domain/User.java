package com.example.blog.domain;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Builder
@Data
@Entity
public class User {

    @Id
    private Long id;

    private String name;

//    @Builder.Default
    @OneToMany(mappedBy = "user")
    List<Blog> blogList = new ArrayList<>();

    public static User create(Long id, String name) {
        return new User(
                id,
                name,
                new ArrayList<>()
        );
    }
}