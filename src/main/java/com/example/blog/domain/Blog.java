package com.example.blog.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Entity
public class Blog {

    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title", length = 20, nullable = false)
    private String title;

    @Column(name = "content", length = 1000)
    private String text;

    public void updateBlog(String title, String text) {
        this.title = title;
        this.text = text;
    }
}
