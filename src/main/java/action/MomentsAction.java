package action;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import model.Moments;
import model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import service.MomentsService;
import service.UploadService;
import utils.ResponseUtils;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * 朋友圈照片的展示，管理
 * Created by lq on 2017/12/13.
 */
@Controller
@RequestMapping("/moments")
public class MomentsAction {
    @Resource
    private MomentsService momentsService;


    @RequestMapping("list")
    public String  list(HttpServletRequest request, HttpServletResponse response) {
        String  result = null;

        try {
            result = momentsService.queryAll();

            //System.out.println(momentsList.size());
        } catch (Exception e) {
            e.printStackTrace();
        }

//        ObjectMapper mapper = new ObjectMapper();
//        String str = mapper.writeValueAsString(momentsList);
//        ResponseUtils.renderJson(response, str);


        ResponseUtils.renderJson(response, result);
        return null;
    }
}
