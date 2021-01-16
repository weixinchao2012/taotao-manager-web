package com.taotao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.taotao.common.pojo.EasyUIResult;
import com.taotao.pojo.TaotaoResult;
import com.taotao.pojo.TbContent;
import com.taotao.service.ContentService;

@Controller
@RequestMapping("/content")
public class ContentController {
	
	@Autowired
	private ContentService contentService;
	
	@RequestMapping("/query/list")
	@ResponseBody
	public EasyUIResult getContentList(Long categoryId, Integer page, Integer rows) throws Exception {
		EasyUIResult result = contentService.getContentList(categoryId, page, rows);
		
		return result;
		
	}
	
	@RequestMapping("/save")
	@ResponseBody
	public TaotaoResult addContent(TbContent content) throws Exception {
		TaotaoResult result = contentService.addContent(content);
		return result;
	}
}