package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JicengdanweiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JicengdanweiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JicengdanweiView;


/**
 * 基层单位
 *
 * @author 
 * @email 
 * @date 2020-12-17 17:40:13
 */
public interface JicengdanweiService extends IService<JicengdanweiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JicengdanweiVO> selectListVO(Wrapper<JicengdanweiEntity> wrapper);
   	
   	JicengdanweiVO selectVO(@Param("ew") Wrapper<JicengdanweiEntity> wrapper);
   	
   	List<JicengdanweiView> selectListView(Wrapper<JicengdanweiEntity> wrapper);
   	
   	JicengdanweiView selectView(@Param("ew") Wrapper<JicengdanweiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JicengdanweiEntity> wrapper);
   	
}

