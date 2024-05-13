package com.entity.view;

import com.entity.ZhibuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 支部
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2020-12-17 17:40:13
 */
@TableName("zhibu")
public class ZhibuView  extends ZhibuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ZhibuView(){
	}
 
 	public ZhibuView(ZhibuEntity zhibuEntity){
 	try {
			BeanUtils.copyProperties(this, zhibuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
