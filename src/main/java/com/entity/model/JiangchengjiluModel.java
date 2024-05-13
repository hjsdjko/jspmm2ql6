package com.entity.model;

import com.entity.JiangchengjiluEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 奖惩记录
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2020-12-17 17:40:13
 */
public class JiangchengjiluModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 所在支部
	 */
	
	private String suozaizhibu;
		
	/**
	 * 奖惩
	 */
	
	private String jiangcheng;
		
	/**
	 * 类型
	 */
	
	private String leixing;
		
	/**
	 * 条文
	 */
	
	private String tiaowen;
		
	/**
	 * 文档
	 */
	
	private String wendang;
		
	/**
	 * 日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date riqi;
				
	
	/**
	 * 设置：姓名
	 */
	 
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
				
	
	/**
	 * 设置：所在支部
	 */
	 
	public void setSuozaizhibu(String suozaizhibu) {
		this.suozaizhibu = suozaizhibu;
	}
	
	/**
	 * 获取：所在支部
	 */
	public String getSuozaizhibu() {
		return suozaizhibu;
	}
				
	
	/**
	 * 设置：奖惩
	 */
	 
	public void setJiangcheng(String jiangcheng) {
		this.jiangcheng = jiangcheng;
	}
	
	/**
	 * 获取：奖惩
	 */
	public String getJiangcheng() {
		return jiangcheng;
	}
				
	
	/**
	 * 设置：类型
	 */
	 
	public void setLeixing(String leixing) {
		this.leixing = leixing;
	}
	
	/**
	 * 获取：类型
	 */
	public String getLeixing() {
		return leixing;
	}
				
	
	/**
	 * 设置：条文
	 */
	 
	public void setTiaowen(String tiaowen) {
		this.tiaowen = tiaowen;
	}
	
	/**
	 * 获取：条文
	 */
	public String getTiaowen() {
		return tiaowen;
	}
				
	
	/**
	 * 设置：文档
	 */
	 
	public void setWendang(String wendang) {
		this.wendang = wendang;
	}
	
	/**
	 * 获取：文档
	 */
	public String getWendang() {
		return wendang;
	}
				
	
	/**
	 * 设置：日期
	 */
	 
	public void setRiqi(Date riqi) {
		this.riqi = riqi;
	}
	
	/**
	 * 获取：日期
	 */
	public Date getRiqi() {
		return riqi;
	}
			
}
