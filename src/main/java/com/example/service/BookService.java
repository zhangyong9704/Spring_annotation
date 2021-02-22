package com.example.service;

import com.example.dao.BookMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author zy
 * @version 1.0.0
 * @ClassName BookService.java
 * @Description
 * @CreateDate 2021-02-20  22:21:51
 */
@Service
public class BookService {

    @Autowired
    private BookMapper bookMapper;
}
