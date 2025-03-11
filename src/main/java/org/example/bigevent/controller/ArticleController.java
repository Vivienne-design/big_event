package org.example.bigevent.controller;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletResponse;
import org.example.bigevent.pojo.Result;
import org.example.bigevent.utils.JwtUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * Author: Vivienne
 */
@RestController
@RequestMapping("/article")
public class ArticleController {

    @GetMapping("/list")
    public Result<String> list(){
//        //验证token
//        try {
//            Map<String, Object> claims = JwtUtil.parseToken(token);
//            return Result.success("");
//        }catch (Exception e){
//            //http状态码401
//            response.setStatus(401);
//            return Result.error("未登录");
//        }
        return Result.success("所有数据！");
    }

}
