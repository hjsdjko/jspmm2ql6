package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.JicengdanweiDao;
import com.entity.JicengdanweiEntity;
import com.service.JicengdanweiService;
import com.entity.vo.JicengdanweiVO;
import com.entity.view.JicengdanweiView;

@Service("jicengdanweiService")
public class JicengdanweiServiceImpl extends ServiceImpl<JicengdanweiDao, JicengdanweiEntity> implements JicengdanweiService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JicengdanweiEntity> page = this.selectPage(
                new Query<JicengdanweiEntity>(params).getPage(),
                new EntityWrapper<JicengdanweiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JicengdanweiEntity> wrapper) {
		  Page<JicengdanweiView> page =new Query<JicengdanweiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JicengdanweiVO> selectListVO(Wrapper<JicengdanweiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JicengdanweiVO selectVO(Wrapper<JicengdanweiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JicengdanweiView> selectListView(Wrapper<JicengdanweiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JicengdanweiView selectView(Wrapper<JicengdanweiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
