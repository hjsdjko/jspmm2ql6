package com.entity.view;

import com.entity.JicengdanweiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 基层单位
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2020-12-17 17:40:13
 */
@TableName("jicengdanwei")
public class JicengdanweiView  extends JicengdanweiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JicengdanweiView(){
	}
 
 	public JicengdanweiView(JicengdanweiEntity jicengdanweiEntity){
 	try {
			BeanUtils.copyProperties(this, jicengdanweiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
