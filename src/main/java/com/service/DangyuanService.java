package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DangyuanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DangyuanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DangyuanView;


/**
 * 党员
 *
 * @author 
 * @email 
 * @date 2020-12-17 17:40:13
 */
public interface DangyuanService extends IService<DangyuanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DangyuanVO> selectListVO(Wrapper<DangyuanEntity> wrapper);
   	
   	DangyuanVO selectVO(@Param("ew") Wrapper<DangyuanEntity> wrapper);
   	
   	List<DangyuanView> selectListView(Wrapper<DangyuanEntity> wrapper);
   	
   	DangyuanView selectView(@Param("ew") Wrapper<DangyuanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DangyuanEntity> wrapper);
   	
}

