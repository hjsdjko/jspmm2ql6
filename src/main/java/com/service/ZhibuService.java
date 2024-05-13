package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZhibuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZhibuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZhibuView;


/**
 * 支部
 *
 * @author 
 * @email 
 * @date 2020-12-17 17:40:13
 */
public interface ZhibuService extends IService<ZhibuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZhibuVO> selectListVO(Wrapper<ZhibuEntity> wrapper);
   	
   	ZhibuVO selectVO(@Param("ew") Wrapper<ZhibuEntity> wrapper);
   	
   	List<ZhibuView> selectListView(Wrapper<ZhibuEntity> wrapper);
   	
   	ZhibuView selectView(@Param("ew") Wrapper<ZhibuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZhibuEntity> wrapper);
   	
}

