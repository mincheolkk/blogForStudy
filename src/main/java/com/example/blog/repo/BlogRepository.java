package com.example.blog.repo;

import com.example.blog.domain.Blog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Blog, Long> {

    Blog findByTitle(String title);
}
