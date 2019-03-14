package net.greatsoft.bjjj.mapper;

import net.greatsoft.bjjj.entity.budget.Items;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface ItemsMapper {

    /**
     * 根据条件查询项目列表信息
     * @param param
     * @return
     */
    public List<Items> findItemsList(Map<String, Object> param);
}
