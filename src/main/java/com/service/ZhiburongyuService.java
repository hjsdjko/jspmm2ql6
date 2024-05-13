package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZhiburongyuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZhiburongyuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZhiburongyuView;


/**
 * 支部荣誉
 *
 * @author 
 * @email 
 * @date 2020-12-17 17:40:13
 */
public interface ZhiburongyuService extends IService<ZhiburongyuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZhiburongyuVO> selectListVO(Wrapper<ZhiburongyuEntity> wrapper);
   	
   	ZhiburongyuVO selectVO(@Param("ew") Wrapper<ZhiburongyuEntity> wrapper);
   	
   	List<ZhiburongyuView> selectListView(Wrapper<ZhiburongyuEntity> wrapper);
   	
   	ZhiburongyuView selectView(@Param("ew") Wrapper<ZhiburongyuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZhiburongyuEntity> wrapper);
   	
}

