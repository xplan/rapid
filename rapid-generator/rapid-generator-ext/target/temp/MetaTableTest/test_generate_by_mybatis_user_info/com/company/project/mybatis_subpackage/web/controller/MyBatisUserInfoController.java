
package com.company.project.web.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.servlet.ModelAndView;
import cn.org.rapid_framework.web.scope.Flash;
import cn.org.rapid_framework.page.Page;
import cn.org.rapid_framework.page.PageRequest;



@Controller
@RequestMapping("/mybatisuserinfo")
public class MyBatisUserInfoController {
	//默认多列排序,example: username desc,createTime asc
	protected static final String DEFAULT_SORT_COLUMNS = null; 
	
	private MyBatisUserInfoManager myBatisUserInfoManager;
	
	private final String LIST_ACTION = "redirect:/mybatisuserinfo";
		
	/** 
	 * 增加setXXXX()方法,spring就可以通过autowire自动设置对象属性,注意大小写
	 **/
	public void setMyBatisUserInfoManager(MyBatisUserInfoManager manager) {
		this.myBatisUserInfoManager = manager;
	}

	/**
	 * 增加了@ModelAttribute的方法可以在本controller的方法调用前执行,可以存放一些共享变量,如枚举值
	 */
	@ModelAttribute
	public void init(ModelMap model) {
		model.put("now", new java.sql.Timestamp(System.currentTimeMillis()));
	}
	
	/** 列表 */
	@RequestMapping
	public String index(ModelMap model,MyBatisUserInfoQuery query,HttpServletRequest request,HttpServletResponse response) {
		Page page = this.myBatisUserInfoManager.findPage(query);
		
		model.addAllAttributes(toModelMap(page, query));
		return "/mybatisuserinfo/index";
	}
	
	/** 进入新增 */
	@RequestMapping(value="/new")
	public String _new(ModelMap model,MyBatisUserInfo myBatisUserInfo,HttpServletRequest request,HttpServletResponse response) throws Exception {
		model.addAttribute("myBatisUserInfo",myBatisUserInfo);
		return "/mybatisuserinfo/new";
	}
	
	/** 显示 */
	@RequestMapping(value="/{id}")
	public String show(ModelMap model,@PathVariable java.lang.Long id) throws Exception {
		MyBatisUserInfo myBatisUserInfo = (MyBatisUserInfo)myBatisUserInfoManager.getById(id);
		model.addAttribute("myBatisUserInfo",myBatisUserInfo);
		return "/mybatisuserinfo/show";
	}
	
	/** 编辑 */
	@RequestMapping(value="/{id}/edit")
	public String edit(ModelMap model,@PathVariable java.lang.Long id) throws Exception {
		MyBatisUserInfo myBatisUserInfo = (MyBatisUserInfo)myBatisUserInfoManager.getById(id);
		model.addAttribute("myBatisUserInfo",myBatisUserInfo);
		return "/mybatisuserinfo/edit";
	}
	
	/** 保存新增 */
	@RequestMapping(method=RequestMethod.POST)
	public String create(ModelMap model,MyBatisUserInfo myBatisUserInfo,HttpServletRequest request,HttpServletResponse response) throws Exception {
		myBatisUserInfoManager.save(myBatisUserInfo);
		Flash.current().success("创建成功"); //存放在Flash中的数据,在下一次http请求中仍然可以读取数据,error()用于显示错误消息
		return LIST_ACTION;
	}
	
	/** 保存更新 */
	@RequestMapping(value="/{id}",method=RequestMethod.PUT)
	public String update(ModelMap model,@PathVariable java.lang.Long id,HttpServletRequest request,HttpServletResponse response) throws Exception {
		MyBatisUserInfo myBatisUserInfo = (MyBatisUserInfo)myBatisUserInfoManager.getById(id);
		bind(request,myBatisUserInfo);
		myBatisUserInfoManager.update(myBatisUserInfo);
		Flash.current().success("更新成功");
		return LIST_ACTION;
	}
	
	/** 删除 */
	@RequestMapping(value="/{id}",method=RequestMethod.DELETE)
	public String delete(ModelMap model,@PathVariable java.lang.Long id) {
		myBatisUserInfoManager.removeById(id);
		Flash.current().success("删除成功");
		return LIST_ACTION;
	}

	/** 批量删除 */
	@RequestMapping(method=RequestMethod.DELETE)
	public String batchDelete(ModelMap model,@RequestParam("items") java.lang.Long[] items) {
		for(int i = 0; i < items.length; i++) {
			myBatisUserInfoManager.removeById(items[i]);
		}
		Flash.current().success("删除成功");
		return LIST_ACTION;
	}
	
	/**
	 * 
	 */
	/**
	 * 
	 */
	/**
	 * 
	 */
	/**
	 * 
	 */
	/**
	 * 
	 */
	@RequestMapping(value="/UserInfo.findPage.count",method=RequestMethod.GET
)
	public Long UserInfo.findPage.count(ModelMap model,countQuery param) throws DataAccessException {
		Result result = MyBatisUserInfoFacade.UserInfo.findPage.count(param);
		model.addAttribute();
	}
	/**
	 * 
	 */
	@RequestMapping(value="/UserInfo.findPage",method=RequestMethod.GET
)
	public UserInfo UserInfo.findPage(ModelMap model,findPageQuery param) throws DataAccessException {
		Result result = MyBatisUserInfoFacade.UserInfo.findPage(param);
		model.addAttribute();
	}
	/**
	 * 
	 */
	/**
	 * 
	 */
	
}

