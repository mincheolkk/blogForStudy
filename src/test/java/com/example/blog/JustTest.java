package com.example.blog;

import com.example.blog.dto.BlogDto;
import com.example.blog.repo.BlogRepository;
import com.example.blog.service.BlogService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Commit;

@SpringBootTest
public class JustTest {

    @Autowired
    BlogService blogService;

    @Autowired
    BlogRepository blogRepository;


    @Test
    @Commit
    void 등록_or_수정한다() {
        BlogDto request = BlogDto.builder()
                .id(11L)
                .title("3")
                .text("6")
                .build();

        blogService.findOrCreateBlogPost(request);
    }
}
