package com.entity.view;

import com.entity.ZhiburongyuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 支部荣誉
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2020-12-17 17:40:13
 */
@TableName("zhiburongyu")
public class ZhiburongyuView  extends ZhiburongyuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ZhiburongyuView(){
	}
 
 	public ZhiburongyuView(ZhiburongyuEntity zhiburongyuEntity){
 	try {
			BeanUtils.copyProperties(this, zhiburongyuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
