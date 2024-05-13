package com.entity.view;

import com.entity.JiangchengjiluEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 奖惩记录
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2020-12-17 17:40:13
 */
@TableName("jiangchengjilu")
public class JiangchengjiluView  extends JiangchengjiluEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JiangchengjiluView(){
	}
 
 	public JiangchengjiluView(JiangchengjiluEntity jiangchengjiluEntity){
 	try {
			BeanUtils.copyProperties(this, jiangchengjiluEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
