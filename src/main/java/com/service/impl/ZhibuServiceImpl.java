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


import com.dao.ZhibuDao;
import com.entity.ZhibuEntity;
import com.service.ZhibuService;
import com.entity.vo.ZhibuVO;
import com.entity.view.ZhibuView;

@Service("zhibuService")
public class ZhibuServiceImpl extends ServiceImpl<ZhibuDao, ZhibuEntity> implements ZhibuService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZhibuEntity> page = this.selectPage(
                new Query<ZhibuEntity>(params).getPage(),
                new EntityWrapper<ZhibuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZhibuEntity> wrapper) {
		  Page<ZhibuView> page =new Query<ZhibuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZhibuVO> selectListVO(Wrapper<ZhibuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZhibuVO selectVO(Wrapper<ZhibuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZhibuView> selectListView(Wrapper<ZhibuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZhibuView selectView(Wrapper<ZhibuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
