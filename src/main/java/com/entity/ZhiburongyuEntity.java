package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 支部荣誉
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2020-12-17 17:40:13
 */
@TableName("zhiburongyu")
public class ZhiburongyuEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ZhiburongyuEntity() {
		
	}
	
	public ZhiburongyuEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 账号
	 */
					
	private String zhanghao;
	
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：账号
	 */
	public void setZhanghao(String zhanghao) {
		this.zhanghao = zhanghao;
	}
	/**
	 * 获取：账号
	 */
	public String getZhanghao() {
		return zhanghao;
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
