package com.chenbuer.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.chenbuer.dao.BlogDao;
import com.chenbuer.entity.Blog;
import com.chenbuer.service.BlogService;

/**
 * blogService��ʵ����
 * @author czy
 *
 */
@Service("blogService")
public class BlogServiceImpl implements BlogService {
	
	@Resource
	private BlogDao blogDao;

	public List<Blog> countList() {
		return blogDao.countList();
	}

}