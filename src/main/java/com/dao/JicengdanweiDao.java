package com.dao;

import com.entity.JicengdanweiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JicengdanweiVO;
import com.entity.view.JicengdanweiView;


/**
 * 基层单位
 * 
 * @author 
 * @email 
 * @date 2020-12-17 17:40:13
 */
public interface JicengdanweiDao extends BaseMapper<JicengdanweiEntity> {
	
	List<JicengdanweiVO> selectListVO(@Param("ew") Wrapper<JicengdanweiEntity> wrapper);
	
	JicengdanweiVO selectVO(@Param("ew") Wrapper<JicengdanweiEntity> wrapper);
	
	List<JicengdanweiView> selectListView(@Param("ew") Wrapper<JicengdanweiEntity> wrapper);

	List<JicengdanweiView> selectListView(Pagination page,@Param("ew") Wrapper<JicengdanweiEntity> wrapper);
	
	JicengdanweiView selectView(@Param("ew") Wrapper<JicengdanweiEntity> wrapper);
	
}
