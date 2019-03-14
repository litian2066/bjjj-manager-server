package net.greatsoft.bjjj.web.system;

import net.greatsoft.bjjj.web.dto.ResultDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping(value = "/notice")
public class NoticeController {

    @PostMapping(value="/list")
    public ResultDto list() {
        Map<String,Object> result = new HashMap<>();
        result.put("notice","notice");
        return new ResultDto(ResultDto.CODE_SUCCESS,"访问成功",result);
    }

}
