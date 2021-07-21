package org.spider.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.nio.ByteBuffer;
import java.util.LinkedList;
import java.util.List;

/**
 * describe:
 *
 * @author programmer_qn
 * @date 2020/04/18
 */

@RestController
@RequestMapping(value = "users")
public class UsersController {


    @GetMapping(value = "list")
    public List<String> list(){
        List<String> list = new LinkedList<>();
        list.add("a");
        list.add("b");
        return list;
    }

    @GetMapping(value = "{id}")
    public String detail(@PathVariable(value = "id") Integer id){

        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(20 * 1024 * 1024);

        return String.join(":", id.toString(), String.valueOf(byteBuffer.position()));
    }
}
