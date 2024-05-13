package com.dao;

import com.entity.ZhibuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZhibuVO;
import com.entity.view.ZhibuView;


/**
 * 支部
 * 
 * @author 
 * @email 
 * @date 2020-12-17 17:40:13
 */
public interface ZhibuDao extends BaseMapper<ZhibuEntity> {
	
	List<ZhibuVO> selectListVO(@Param("ew") Wrapper<ZhibuEntity> wrapper);
	
	ZhibuVO selectVO(@Param("ew") Wrapper<ZhibuEntity> wrapper);
	
	List<ZhibuView> selectListView(@Param("ew") Wrapper<ZhibuEntity> wrapper);

	List<ZhibuView> selectListView(Pagination page,@Param("ew") Wrapper<ZhibuEntity> wrapper);
	
	ZhibuView selectView(@Param("ew") Wrapper<ZhibuEntity> wrapper);
	
}
