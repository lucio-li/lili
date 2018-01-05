package action;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import service.UserService;
import utils.ResponseUtils;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by lq on 2017/12/10.
 */
@Controller
public class Test {
    @Resource
    private UserService userService;

    @RequestMapping("/test")
    public String  index(HttpServletRequest request, HttpServletResponse response) throws JsonProcessingException {
        try {
            userService.queryAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        List<User> userList;
        userList = userService.queryAll();
        ObjectMapper mapper = new ObjectMapper();
        String str = mapper.writeValueAsString(userList);
        ResponseUtils.renderJson(response, str);
        return null;
    }
}
