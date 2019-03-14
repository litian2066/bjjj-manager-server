package net.greatsoft.bjjj.web.budget;

import net.greatsoft.bjjj.entity.budget.Items;
import net.greatsoft.bjjj.service.budget.ItemsService;
import net.greatsoft.bjjj.util.ResultSingleton;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "/budget/item")
public class ItemsController {

    @Resource
    private ItemsService itemsService;

    @PostMapping(value = "findItemsList")
    public ResultSingleton findItemsList(@RequestBody Map<String, Object> param) {
        List<Items> itemsList = this.itemsService.findItemsList(param);
        ResultSingleton r = ResultSingleton.getInstance(ResultSingleton.CODE_SUCCESS, "操作成功", itemsList);
        System.out.println(r);
        return r;
    }

    @PostMapping(value = "findItemsList2")
    public ResultSingleton findItemsList2(@RequestBody Map<String, Object> param) {
//        List<Items> itemsList = this.itemsService.findItemsList(param);
        String string = "123123123123123";
        Integer i = 1 / 0;
        ResultSingleton r = ResultSingleton.getInstance(ResultSingleton.CODE_SUCCESS, "操作成功", string);
        System.out.println("jey:" + r);
        return r;
    }
}
