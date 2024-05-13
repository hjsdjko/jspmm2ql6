package com.entity.vo;

import com.entity.DangyuanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 党员
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2020-12-17 17:40:13
 */
public class DangyuanVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
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
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date rudangshijian;
		
	/**
	 * 转正时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
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
