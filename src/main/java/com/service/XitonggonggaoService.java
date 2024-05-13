package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XitonggonggaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XitonggonggaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XitonggonggaoView;


/**
 * 公告信息
 *
 * @author 
 * @email 
 * @date 2020-12-17 17:40:13
 */
public interface XitonggonggaoService extends IService<XitonggonggaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XitonggonggaoVO> selectListVO(Wrapper<XitonggonggaoEntity> wrapper);
   	
   	XitonggonggaoVO selectVO(@Param("ew") Wrapper<XitonggonggaoEntity> wrapper);
   	
   	List<XitonggonggaoView> selectListView(Wrapper<XitonggonggaoEntity> wrapper);
   	
   	XitonggonggaoView selectView(@Param("ew") Wrapper<XitonggonggaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XitonggonggaoEntity> wrapper);
   	
}

