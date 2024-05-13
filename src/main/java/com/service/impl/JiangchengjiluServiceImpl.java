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


import com.dao.JiangchengjiluDao;
import com.entity.JiangchengjiluEntity;
import com.service.JiangchengjiluService;
import com.entity.vo.JiangchengjiluVO;
import com.entity.view.JiangchengjiluView;

@Service("jiangchengjiluService")
public class JiangchengjiluServiceImpl extends ServiceImpl<JiangchengjiluDao, JiangchengjiluEntity> implements JiangchengjiluService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiangchengjiluEntity> page = this.selectPage(
                new Query<JiangchengjiluEntity>(params).getPage(),
                new EntityWrapper<JiangchengjiluEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiangchengjiluEntity> wrapper) {
		  Page<JiangchengjiluView> page =new Query<JiangchengjiluView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JiangchengjiluVO> selectListVO(Wrapper<JiangchengjiluEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JiangchengjiluVO selectVO(Wrapper<JiangchengjiluEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JiangchengjiluView> selectListView(Wrapper<JiangchengjiluEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiangchengjiluView selectView(Wrapper<JiangchengjiluEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
