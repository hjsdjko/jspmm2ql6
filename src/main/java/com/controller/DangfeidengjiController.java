package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.DangfeidengjiEntity;
import com.entity.view.DangfeidengjiView;

import com.service.DangfeidengjiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 党费登记
 * 后端接口
 * @author 
 * @email 
 * @date 2020-12-17 17:40:13
 */
@RestController
@RequestMapping("/dangfeidengji")
public class DangfeidengjiController {
    @Autowired
    private DangfeidengjiService dangfeidengjiService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,DangfeidengjiEntity dangfeidengji, HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("dangyuan")) {
			dangfeidengji.setZhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<DangfeidengjiEntity> ew = new EntityWrapper<DangfeidengjiEntity>();
    	PageUtils page = dangfeidengjiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, dangfeidengji), params), params));
		request.setAttribute("data", page);
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,DangfeidengjiEntity dangfeidengji, HttpServletRequest request){
        EntityWrapper<DangfeidengjiEntity> ew = new EntityWrapper<DangfeidengjiEntity>();
    	PageUtils page = dangfeidengjiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, dangfeidengji), params), params));
		request.setAttribute("data", page);
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( DangfeidengjiEntity dangfeidengji){
       	EntityWrapper<DangfeidengjiEntity> ew = new EntityWrapper<DangfeidengjiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( dangfeidengji, "dangfeidengji")); 
        return R.ok().put("data", dangfeidengjiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(DangfeidengjiEntity dangfeidengji){
        EntityWrapper< DangfeidengjiEntity> ew = new EntityWrapper< DangfeidengjiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( dangfeidengji, "dangfeidengji")); 
		DangfeidengjiView dangfeidengjiView =  dangfeidengjiService.selectView(ew);
		return R.ok("查询党费登记成功").put("data", dangfeidengjiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") String id){
        DangfeidengjiEntity dangfeidengji = dangfeidengjiService.selectById(id);
        return R.ok().put("data", dangfeidengji);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") String id){
        DangfeidengjiEntity dangfeidengji = dangfeidengjiService.selectById(id);
        return R.ok().put("data", dangfeidengji);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody DangfeidengjiEntity dangfeidengji, HttpServletRequest request){
    	dangfeidengji.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(dangfeidengji);

        dangfeidengjiService.insert(dangfeidengji);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody DangfeidengjiEntity dangfeidengji, HttpServletRequest request){
    	dangfeidengji.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(dangfeidengji);

        dangfeidengjiService.insert(dangfeidengji);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody DangfeidengjiEntity dangfeidengji, HttpServletRequest request){
        //ValidatorUtils.validateEntity(dangfeidengji);
        dangfeidengjiService.updateById(dangfeidengji);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        dangfeidengjiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<DangfeidengjiEntity> wrapper = new EntityWrapper<DangfeidengjiEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("dangyuan")) {
			wrapper.eq("zhanghao", (String)request.getSession().getAttribute("username"));
		}

		int count = dangfeidengjiService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	
	


}
