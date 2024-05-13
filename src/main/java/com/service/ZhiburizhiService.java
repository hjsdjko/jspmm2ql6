package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZhiburizhiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZhiburizhiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZhiburizhiView;


/**
 * 支部日志
 *
 * @author 
 * @email 
 * @date 2020-12-17 17:40:13
 */
public interface ZhiburizhiService extends IService<ZhiburizhiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZhiburizhiVO> selectListVO(Wrapper<ZhiburizhiEntity> wrapper);
   	
   	ZhiburizhiVO selectVO(@Param("ew") Wrapper<ZhiburizhiEntity> wrapper);
   	
   	List<ZhiburizhiView> selectListView(Wrapper<ZhiburizhiEntity> wrapper);
   	
   	ZhiburizhiView selectView(@Param("ew") Wrapper<ZhiburizhiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZhiburizhiEntity> wrapper);
   	
}

