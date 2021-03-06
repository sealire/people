package org.leesia.resource.controller;

import org.leesia.resource.redis.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.concurrent.TimeUnit;

/**
 * @Auther: leesia
 * @Date: 2018/7/24 13:48
 * @Description:
 */
@RestController
@RequestMapping(value = "test")
public class TestController {

    @Autowired
    private RedisService redisService;

    @RequestMapping(value = "reversal", method = RequestMethod.GET)
    @ResponseBody
    public Object reversal(HttpServletRequest request, @RequestParam String param) {
        if (param == null) {
            return "";
        }

        String v = redisService.getString(param);
        if (v == null) {
            String rev =  new StringBuilder(param).reverse().toString();
            redisService.setString(param, rev, 60, TimeUnit.SECONDS);
            return rev;
        }
        return v;
    }

    @RequestMapping(value = "delete", method = RequestMethod.GET)
    @ResponseBody
    public Object delete(HttpServletRequest request, @RequestParam String param) {
        String v = redisService.getString(param);
        if (v != null) {
            redisService.deleteString(param);
            return true;
        }
        return false;
    }

    @RequestMapping(value = "test", method = RequestMethod.GET)
    @ResponseBody
    public Object test(HttpServletRequest request, @RequestParam String param) {
        return param;
    }
}
