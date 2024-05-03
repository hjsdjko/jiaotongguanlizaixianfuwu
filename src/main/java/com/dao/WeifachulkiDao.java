package com.dao;

import com.entity.WeifachulkiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.WeifachulkiView;

/**
 * 违法处理业务 Dao 接口
 *
 * @author 
 */
public interface WeifachulkiDao extends BaseMapper<WeifachulkiEntity> {

   List<WeifachulkiView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
