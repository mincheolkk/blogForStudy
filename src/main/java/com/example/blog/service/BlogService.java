package com.example.blog.service;

import com.example.blog.domain.Blog;
import com.example.blog.dto.BlogDto;
import com.example.blog.repo.BlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Service
public class BlogService {

    @Autowired
    BlogRepository blogRepository;


    @Transactional
    public void findOrCreateBlogPost(BlogDto request) {
        Blog blog = blogRepository.findByTitle(request.getTitle());

        if (blog == null) {
            Blog newBlog = Blog.builder()
                    .id(request.getId())
                    .title(request.getTitle())
                    .text(request.getText())
                    .build();

            blogRepository.save(newBlog);
            System.out.println("메서드 호출됨");
        }
        else if (blog != null) {
            blog.updateBlog(
                    request.getTitle(),
                    request.getText()
            );
            System.out.println("메서드 호출됨");
        }

        System.out.println("서비스 로직 끝");
    }
}

