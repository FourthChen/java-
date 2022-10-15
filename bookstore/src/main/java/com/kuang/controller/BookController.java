package com.kuang.controller;

import com.kuang.pojo.Books;
import com.kuang.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/book")
public class BookController {
    @Autowired
    @Qualifier("BookServiceImpl")
    private BookService bookService;

    //查询全部的书籍，并且返回到一个书籍展示页面
    @RequestMapping("/allBook")
    public String list(Model model) {
        List<Books> list = bookService.queryAllBook();
        model.addAttribute("list", list);
        return "allBook";
    }

    //跳转到增加书籍页面
    @RequestMapping("toAddBook")
    public String toAddPageer(){
        return "addBook";
    }

    //添加书籍的请求
    @RequestMapping("addbook")
    public String addBook(Books books){
        System.out.println("addBook-->"+books);
        bookService.addBook(books);
        return "redirect:/book/allBook"; //重定向到我们的@RequestMapping("/allBook")请求
    }

    //跳转到修改数据页面
    @RequestMapping("toUpdate")
    public String toupdatePager(int id,Model model){
        Books books = bookService.queryBookById(id);
        model.addAttribute("Qbooks",books);
        return "updateBook";
    }

    //修改书籍的请求
    @RequestMapping("updatebook")
    public String updateBook(Books books){
        System.out.println("updateBook-->"+books);
        bookService.updateBook(books);
        return "redirect:/book/allBook"; //重定向到我们的@RequestMapping("/allBook")请求
    }

    //删除书籍的请求
    @RequestMapping("deletebook")
    public String deleteBook(int id){

        bookService.deleteBookById(id);
        return "redirect:/book/allBook"; //重定向到我们的@RequestMapping("/allBook")请求
    }

    //查询书籍
    @RequestMapping("/queryBook")
    public String queryBook(String queryBookName,Model model){
        Books books = bookService.queryBookByName(queryBookName);

        List<Books> list=new ArrayList<Books>();
        list.add(books);
        model.addAttribute("list",list);

        return "allBook";
    }
}
