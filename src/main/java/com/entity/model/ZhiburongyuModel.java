package com.entity.model;

import com.entity.ZhiburongyuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 支部荣誉
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2020-12-17 17:40:13
 */
public class ZhiburongyuModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 党支部
	 */
	
	private String dangzhibu;
		
	/**
	 * 成果
	 */
	
	private String chengguo;
		
	/**
	 * 证书
	 */
	
	private String zhengshu;
		
	/**
	 * 文件
	 */
	
	private String wenjian;
		
	/**
	 * 荣誉
	 */
	
	private String rongyu;
				
	
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
	 * 设置：成果
	 */
	 
	public void setChengguo(String chengguo) {
		this.chengguo = chengguo;
	}
	
	/**
	 * 获取：成果
	 */
	public String getChengguo() {
		return chengguo;
	}
				
	
	/**
	 * 设置：证书
	 */
	 
	public void setZhengshu(String zhengshu) {
		this.zhengshu = zhengshu;
	}
	
	/**
	 * 获取：证书
	 */
	public String getZhengshu() {
		return zhengshu;
	}
				
	
	/**
	 * 设置：文件
	 */
	 
	public void setWenjian(String wenjian) {
		this.wenjian = wenjian;
	}
	
	/**
	 * 获取：文件
	 */
	public String getWenjian() {
		return wenjian;
	}
				
	
	/**
	 * 设置：荣誉
	 */
	 
	public void setRongyu(String rongyu) {
		this.rongyu = rongyu;
	}
	
	/**
	 * 获取：荣誉
	 */
	public String getRongyu() {
		return rongyu;
	}
			
}
