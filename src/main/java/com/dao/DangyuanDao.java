package com.dao;

import com.entity.DangyuanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DangyuanVO;
import com.entity.view.DangyuanView;


/**
 * 党员
 * 
 * @author 
 * @email 
 * @date 2020-12-17 17:40:13
 */
public interface DangyuanDao extends BaseMapper<DangyuanEntity> {
	
	List<DangyuanVO> selectListVO(@Param("ew") Wrapper<DangyuanEntity> wrapper);
	
	DangyuanVO selectVO(@Param("ew") Wrapper<DangyuanEntity> wrapper);
	
	List<DangyuanView> selectListView(@Param("ew") Wrapper<DangyuanEntity> wrapper);

	List<DangyuanView> selectListView(Pagination page,@Param("ew") Wrapper<DangyuanEntity> wrapper);
	
	DangyuanView selectView(@Param("ew") Wrapper<DangyuanEntity> wrapper);
	
}
