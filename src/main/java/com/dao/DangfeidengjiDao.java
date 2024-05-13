package com.dao;

import com.entity.DangfeidengjiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DangfeidengjiVO;
import com.entity.view.DangfeidengjiView;


/**
 * 党费登记
 * 
 * @author 
 * @email 
 * @date 2020-12-17 17:40:13
 */
public interface DangfeidengjiDao extends BaseMapper<DangfeidengjiEntity> {
	
	List<DangfeidengjiVO> selectListVO(@Param("ew") Wrapper<DangfeidengjiEntity> wrapper);
	
	DangfeidengjiVO selectVO(@Param("ew") Wrapper<DangfeidengjiEntity> wrapper);
	
	List<DangfeidengjiView> selectListView(@Param("ew") Wrapper<DangfeidengjiEntity> wrapper);

	List<DangfeidengjiView> selectListView(Pagination page,@Param("ew") Wrapper<DangfeidengjiEntity> wrapper);
	
	DangfeidengjiView selectView(@Param("ew") Wrapper<DangfeidengjiEntity> wrapper);
	
}
