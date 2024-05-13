package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DangfeidengjiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DangfeidengjiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DangfeidengjiView;


/**
 * 党费登记
 *
 * @author 
 * @email 
 * @date 2020-12-17 17:40:13
 */
public interface DangfeidengjiService extends IService<DangfeidengjiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DangfeidengjiVO> selectListVO(Wrapper<DangfeidengjiEntity> wrapper);
   	
   	DangfeidengjiVO selectVO(@Param("ew") Wrapper<DangfeidengjiEntity> wrapper);
   	
   	List<DangfeidengjiView> selectListView(Wrapper<DangfeidengjiEntity> wrapper);
   	
   	DangfeidengjiView selectView(@Param("ew") Wrapper<DangfeidengjiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DangfeidengjiEntity> wrapper);
   	
}

