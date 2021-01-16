package com.taotao.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.taotao.common.pojo.EasyUIResult;
import com.taotao.pojo.TaotaoResult;
import com.taotao.pojo.TbItem;
import com.taotao.pojo.TbItemDesc;
import com.taotao.service.ItemService;
import com.taotao.service.ItemServiceImp;

@Controller
public class ItemController {

	@Autowired ItemService itemService;
	

	private static Logger logger = Logger.getLogger(ItemController.class);

	@RequestMapping("/item/{itemId}")
	
	@ResponseBody
	public TbItem getItemById(@PathVariable long itemId)
	{
		System.out.println("test");
		logger.info("getItemById start...");
		return itemService.getItemById(itemId);
	}
	@RequestMapping("/item/list")
	//设置相应的内容为json数据
	@ResponseBody
	public EasyUIResult getItemlist(@RequestParam(defaultValue="1")Integer page, 
			@RequestParam(defaultValue="30")Integer rows) throws Exception {
		//查询商品列表
		EasyUIResult result = itemService.getItemList(page, rows);
		
		return result;
	}
	
	@RequestMapping("/item/save")
	@ResponseBody
	public TaotaoResult addItem(TbItem item, String desc) {
		TbItemDesc itemDesc = new TbItemDesc();
		itemDesc.setItemDesc(desc);
		TaotaoResult result = itemService.addItem(item, itemDesc);
		return result;
	}
}
