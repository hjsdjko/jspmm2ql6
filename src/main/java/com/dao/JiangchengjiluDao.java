package com.dao;

import com.entity.JiangchengjiluEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiangchengjiluVO;
import com.entity.view.JiangchengjiluView;


/**
 * 奖惩记录
 * 
 * @author 
 * @email 
 * @date 2020-12-17 17:40:13
 */
public interface JiangchengjiluDao extends BaseMapper<JiangchengjiluEntity> {
	
	List<JiangchengjiluVO> selectListVO(@Param("ew") Wrapper<JiangchengjiluEntity> wrapper);
	
	JiangchengjiluVO selectVO(@Param("ew") Wrapper<JiangchengjiluEntity> wrapper);
	
	List<JiangchengjiluView> selectListView(@Param("ew") Wrapper<JiangchengjiluEntity> wrapper);

	List<JiangchengjiluView> selectListView(Pagination page,@Param("ew") Wrapper<JiangchengjiluEntity> wrapper);
	
	JiangchengjiluView selectView(@Param("ew") Wrapper<JiangchengjiluEntity> wrapper);
	
}
