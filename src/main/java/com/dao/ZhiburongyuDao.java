package com.dao;

import com.entity.ZhiburongyuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZhiburongyuVO;
import com.entity.view.ZhiburongyuView;


/**
 * 支部荣誉
 * 
 * @author 
 * @email 
 * @date 2020-12-17 17:40:13
 */
public interface ZhiburongyuDao extends BaseMapper<ZhiburongyuEntity> {
	
	List<ZhiburongyuVO> selectListVO(@Param("ew") Wrapper<ZhiburongyuEntity> wrapper);
	
	ZhiburongyuVO selectVO(@Param("ew") Wrapper<ZhiburongyuEntity> wrapper);
	
	List<ZhiburongyuView> selectListView(@Param("ew") Wrapper<ZhiburongyuEntity> wrapper);

	List<ZhiburongyuView> selectListView(Pagination page,@Param("ew") Wrapper<ZhiburongyuEntity> wrapper);
	
	ZhiburongyuView selectView(@Param("ew") Wrapper<ZhiburongyuEntity> wrapper);
	
}
