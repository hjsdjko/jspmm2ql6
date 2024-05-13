package com.dao;

import com.entity.ZhiburizhiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZhiburizhiVO;
import com.entity.view.ZhiburizhiView;


/**
 * 支部日志
 * 
 * @author 
 * @email 
 * @date 2020-12-17 17:40:13
 */
public interface ZhiburizhiDao extends BaseMapper<ZhiburizhiEntity> {
	
	List<ZhiburizhiVO> selectListVO(@Param("ew") Wrapper<ZhiburizhiEntity> wrapper);
	
	ZhiburizhiVO selectVO(@Param("ew") Wrapper<ZhiburizhiEntity> wrapper);
	
	List<ZhiburizhiView> selectListView(@Param("ew") Wrapper<ZhiburizhiEntity> wrapper);

	List<ZhiburizhiView> selectListView(Pagination page,@Param("ew") Wrapper<ZhiburizhiEntity> wrapper);
	
	ZhiburizhiView selectView(@Param("ew") Wrapper<ZhiburizhiEntity> wrapper);
	
}
