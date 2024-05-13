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
 * 党员
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2020-12-17 17:40:13
 */
@TableName("dangyuan")
public class DangyuanEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public DangyuanEntity() {
		
	}
	
	public DangyuanEntity(T t) {
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
	 * 密码
	 */
					
	private String mima;
	
	/**
	 * 姓名
	 */
					
	private String xingming;
	
	/**
	 * 民族
	 */
					
	private String minzu;
	
	/**
	 * 性别
	 */
					
	private String xingbie;
	
	/**
	 * 籍贯
	 */
					
	private String jiguan;
	
	/**
	 * 出生日期
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date chushengriqi;
	
	/**
	 * 文化程度
	 */
					
	private String wenhuachengdu;
	
	/**
	 * 工作单位
	 */
					
	private String gongzuodanwei;
	
	/**
	 * 工作职务
	 */
					
	private String gongzuozhiwu;
	
	/**
	 * 入党时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date rudangshijian;
	
	/**
	 * 转正时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date zhuanzhengshijian;
	
	/**
	 * 所在支部
	 */
					
	private String suozaizhibu;
	
	/**
	 * 证件照片
	 */
					
	private String zhengjianzhaopian;
	
	/**
	 * 签发日期
	 */
					
	private String qianfariqi;
	
	
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
	 * 设置：民族
	 */
	public void setMinzu(String minzu) {
		this.minzu = minzu;
	}
	/**
	 * 获取：民族
	 */
	public String getMinzu() {
		return minzu;
	}
	/**
	 * 设置：性别
	 */
	public void setXingbie(String xingbie) {
		this.xingbie = xingbie;
	}
	/**
	 * 获取：性别
	 */
	public String getXingbie() {
		return xingbie;
	}
	/**
	 * 设置：籍贯
	 */
	public void setJiguan(String jiguan) {
		this.jiguan = jiguan;
	}
	/**
	 * 获取：籍贯
	 */
	public String getJiguan() {
		return jiguan;
	}
	/**
	 * 设置：出生日期
	 */
	public void setChushengriqi(Date chushengriqi) {
		this.chushengriqi = chushengriqi;
	}
	/**
	 * 获取：出生日期
	 */
	public Date getChushengriqi() {
		return chushengriqi;
	}
	/**
	 * 设置：文化程度
	 */
	public void setWenhuachengdu(String wenhuachengdu) {
		this.wenhuachengdu = wenhuachengdu;
	}
	/**
	 * 获取：文化程度
	 */
	public String getWenhuachengdu() {
		return wenhuachengdu;
	}
	/**
	 * 设置：工作单位
	 */
	public void setGongzuodanwei(String gongzuodanwei) {
		this.gongzuodanwei = gongzuodanwei;
	}
	/**
	 * 获取：工作单位
	 */
	public String getGongzuodanwei() {
		return gongzuodanwei;
	}
	/**
	 * 设置：工作职务
	 */
	public void setGongzuozhiwu(String gongzuozhiwu) {
		this.gongzuozhiwu = gongzuozhiwu;
	}
	/**
	 * 获取：工作职务
	 */
	public String getGongzuozhiwu() {
		return gongzuozhiwu;
	}
	/**
	 * 设置：入党时间
	 */
	public void setRudangshijian(Date rudangshijian) {
		this.rudangshijian = rudangshijian;
	}
	/**
	 * 获取：入党时间
	 */
	public Date getRudangshijian() {
		return rudangshijian;
	}
	/**
	 * 设置：转正时间
	 */
	public void setZhuanzhengshijian(Date zhuanzhengshijian) {
		this.zhuanzhengshijian = zhuanzhengshijian;
	}
	/**
	 * 获取：转正时间
	 */
	public Date getZhuanzhengshijian() {
		return zhuanzhengshijian;
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
	 * 设置：证件照片
	 */
	public void setZhengjianzhaopian(String zhengjianzhaopian) {
		this.zhengjianzhaopian = zhengjianzhaopian;
	}
	/**
	 * 获取：证件照片
	 */
	public String getZhengjianzhaopian() {
		return zhengjianzhaopian;
	}
	/**
	 * 设置：签发日期
	 */
	public void setQianfariqi(String qianfariqi) {
		this.qianfariqi = qianfariqi;
	}
	/**
	 * 获取：签发日期
	 */
	public String getQianfariqi() {
		return qianfariqi;
	}

}
