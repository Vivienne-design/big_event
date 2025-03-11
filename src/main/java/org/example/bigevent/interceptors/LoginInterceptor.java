package org.example.bigevent.interceptors;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.example.bigevent.pojo.Result;
import org.example.bigevent.utils.JwtUtil;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import java.util.Map;

/**
 * Author: Vivienne
 */

@Component
public class LoginInterceptor implements HandlerInterceptor {
    
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response,Object handler) throws Exception{
        //令牌验证
        String token = request.getHeader("Authorization");
        try {
            Map<String, Object> claims = JwtUtil.parseToken(token);
            return true;
        }catch (Exception e){
            //http状态码401
            response.setStatus(401);
            return false;
        }
    }
}
