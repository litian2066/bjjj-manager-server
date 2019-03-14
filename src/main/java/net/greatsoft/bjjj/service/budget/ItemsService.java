package net.greatsoft.bjjj.service.budget;

import net.greatsoft.bjjj.entity.budget.Items;
import net.greatsoft.bjjj.mapper.ItemsMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class ItemsService {

    @Resource
    private ItemsMapper itemsMapper;

    public List<Items> findItemsList(Map<String, Object> param) {
        return this.itemsMapper.findItemsList(param);
    }
}
