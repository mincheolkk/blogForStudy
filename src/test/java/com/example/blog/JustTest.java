package com.example.blog;

import com.example.blog.domain.Blog;
import com.example.blog.domain.User;
import com.example.blog.dto.BlogDto;
import com.example.blog.repo.BlogRepository;
import com.example.blog.service.BlogService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Commit;

import java.util.ArrayList;
import java.util.List;

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

//        blogService.findOrCreateBlogPost(request);
    }

    @Test
    void 리스트를_가져온다() {

        User kim = User.builder()
                .id(1L)
                .name("kim")
                .build();

        List<String> testList = new ArrayList<>();
        System.out.println("testList = " + testList);

        List<Blog> blogList = kim.getBlogList();
        System.out.println("blogList = " + blogList);
        if (!blogList.isEmpty()) {
            System.out.println("not empty");
        }
    }

    @Test
    void 초기화_테스트() {

        User kim = User.builder()
                .id(1L)
                .name("kim")
                .build();

        List<Blog> blogList = kim.getBlogList();
        System.out.println("blogList = " + blogList);

        List<String> testList = new ArrayList<>();
        System.out.println("testList = " + testList);

        User mincheol = User.create(2L, "mincheol");
        System.out.println("mincheol.getBlogList() = " + mincheol.getBlogList());
    }
}
