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


import com.dao.DangfeidengjiDao;
import com.entity.DangfeidengjiEntity;
import com.service.DangfeidengjiService;
import com.entity.vo.DangfeidengjiVO;
import com.entity.view.DangfeidengjiView;

@Service("dangfeidengjiService")
public class DangfeidengjiServiceImpl extends ServiceImpl<DangfeidengjiDao, DangfeidengjiEntity> implements DangfeidengjiService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DangfeidengjiEntity> page = this.selectPage(
                new Query<DangfeidengjiEntity>(params).getPage(),
                new EntityWrapper<DangfeidengjiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DangfeidengjiEntity> wrapper) {
		  Page<DangfeidengjiView> page =new Query<DangfeidengjiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DangfeidengjiVO> selectListVO(Wrapper<DangfeidengjiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DangfeidengjiVO selectVO(Wrapper<DangfeidengjiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DangfeidengjiView> selectListView(Wrapper<DangfeidengjiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DangfeidengjiView selectView(Wrapper<DangfeidengjiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
