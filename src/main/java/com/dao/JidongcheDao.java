package com.dao;

import com.entity.JidongcheEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.JidongcheView;

/**
 * 机动车业务 Dao 接口
 *
 * @author 
 */
public interface JidongcheDao extends BaseMapper<JidongcheEntity> {

   List<JidongcheView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
