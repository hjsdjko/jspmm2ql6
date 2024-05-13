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


import com.dao.ZhiburizhiDao;
import com.entity.ZhiburizhiEntity;
import com.service.ZhiburizhiService;
import com.entity.vo.ZhiburizhiVO;
import com.entity.view.ZhiburizhiView;

@Service("zhiburizhiService")
public class ZhiburizhiServiceImpl extends ServiceImpl<ZhiburizhiDao, ZhiburizhiEntity> implements ZhiburizhiService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZhiburizhiEntity> page = this.selectPage(
                new Query<ZhiburizhiEntity>(params).getPage(),
                new EntityWrapper<ZhiburizhiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZhiburizhiEntity> wrapper) {
		  Page<ZhiburizhiView> page =new Query<ZhiburizhiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZhiburizhiVO> selectListVO(Wrapper<ZhiburizhiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZhiburizhiVO selectVO(Wrapper<ZhiburizhiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZhiburizhiView> selectListView(Wrapper<ZhiburizhiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZhiburizhiView selectView(Wrapper<ZhiburizhiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
