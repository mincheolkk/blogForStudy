package com.example.blog.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

@AllArgsConstructor
@Builder
@Data
@NoArgsConstructor
public class BlogDto {

    Long id;
    String title;
    String text;
}
