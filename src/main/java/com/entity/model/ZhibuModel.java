package com.entity.model;

import com.entity.ZhibuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 支部
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2020-12-17 17:40:13
 */
public class ZhibuModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 密码
	 */
	
	private String mima;
		
	/**
	 * 党支部
	 */
	
	private String dangzhibu;
		
	/**
	 * 负责人
	 */
	
	private String fuzeren;
		
	/**
	 * 联系方式
	 */
	
	private String lianxifangshi;
		
	/**
	 * 办公地址
	 */
	
	private String bangongdizhi;
		
	/**
	 * 支部详情
	 */
	
	private String zhibuxiangqing;
				
	
	/**
	 * 设置：密码
	 */
	 
	public void setMima(String mima) {
		this.mima = mima;
	}
	
	/**
	 * 获取：密码
	 */
	public String getMima() {
		return mima;
	}
				
	
	/**
	 * 设置：党支部
	 */
	 
	public void setDangzhibu(String dangzhibu) {
		this.dangzhibu = dangzhibu;
	}
	
	/**
	 * 获取：党支部
	 */
	public String getDangzhibu() {
		return dangzhibu;
	}
				
	
	/**
	 * 设置：负责人
	 */
	 
	public void setFuzeren(String fuzeren) {
		this.fuzeren = fuzeren;
	}
	
	/**
	 * 获取：负责人
	 */
	public String getFuzeren() {
		return fuzeren;
	}
				
	
	/**
	 * 设置：联系方式
	 */
	 
	public void setLianxifangshi(String lianxifangshi) {
		this.lianxifangshi = lianxifangshi;
	}
	
	/**
	 * 获取：联系方式
	 */
	public String getLianxifangshi() {
		return lianxifangshi;
	}
				
	
	/**
	 * 设置：办公地址
	 */
	 
	public void setBangongdizhi(String bangongdizhi) {
		this.bangongdizhi = bangongdizhi;
	}
	
	/**
	 * 获取：办公地址
	 */
	public String getBangongdizhi() {
		return bangongdizhi;
	}
				
	
	/**
	 * 设置：支部详情
	 */
	 
	public void setZhibuxiangqing(String zhibuxiangqing) {
		this.zhibuxiangqing = zhibuxiangqing;
	}
	
	/**
	 * 获取：支部详情
	 */
	public String getZhibuxiangqing() {
		return zhibuxiangqing;
	}
			
}
