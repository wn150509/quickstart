package com.example.quickstart.controller;

import com.example.quickstart.dao.LittleDao;
import com.example.quickstart.entity.Card;
import com.example.quickstart.entity.Topic;
import com.example.quickstart.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class LittleController {
    @Resource
    private LittleDao littleDao;

    @GetMapping("little")
    public String getAll(ModelMap map){
        List<Card> cardList=littleDao.getCard();
        List<Topic>topicList=littleDao.getTopic();
        User user=littleDao.getUser();
        map.addAttribute("cardList",cardList);
        map.addAttribute("topicList",topicList);
        map.addAttribute("user",user);
        return "little";
    }
}
