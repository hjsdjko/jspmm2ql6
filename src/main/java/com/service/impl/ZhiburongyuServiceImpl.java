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


import com.dao.ZhiburongyuDao;
import com.entity.ZhiburongyuEntity;
import com.service.ZhiburongyuService;
import com.entity.vo.ZhiburongyuVO;
import com.entity.view.ZhiburongyuView;

@Service("zhiburongyuService")
public class ZhiburongyuServiceImpl extends ServiceImpl<ZhiburongyuDao, ZhiburongyuEntity> implements ZhiburongyuService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZhiburongyuEntity> page = this.selectPage(
                new Query<ZhiburongyuEntity>(params).getPage(),
                new EntityWrapper<ZhiburongyuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZhiburongyuEntity> wrapper) {
		  Page<ZhiburongyuView> page =new Query<ZhiburongyuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZhiburongyuVO> selectListVO(Wrapper<ZhiburongyuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZhiburongyuVO selectVO(Wrapper<ZhiburongyuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZhiburongyuView> selectListView(Wrapper<ZhiburongyuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZhiburongyuView selectView(Wrapper<ZhiburongyuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
