package com.example.demo.bootstrap.model;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Created by DGM on 2019/10/24.
 */
@Data
@AllArgsConstructor
public class Article {
    private String title;
    private String content;
    private String url;
}
