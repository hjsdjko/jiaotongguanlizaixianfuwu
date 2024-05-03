package com.dao;

import com.entity.JiashizhengEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.JiashizhengView;

/**
 * 驾驶证业务 Dao 接口
 *
 * @author 
 */
public interface JiashizhengDao extends BaseMapper<JiashizhengEntity> {

   List<JiashizhengView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
