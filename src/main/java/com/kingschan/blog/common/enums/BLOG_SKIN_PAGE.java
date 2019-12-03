package com.kingschan.blog.common.enums;
/ **
 * Blog template page
* @author Administrator
 *
 * /
public  enum  BLOG_SKIN_PAGE {
	
	PAGE_INDEX ( " page_index " , " skin /% s / font / index " ), // blog homepage
	PAGE_ARTICLE_INFO ( " page_article_info " , " skin /% s / font / article_info " ), // Article details
	PAGE_ARTICLE_PSW ( " page_article_psw " , " skin /% s / font / article_psw " ), // Enter password to view blog posts
	PAGE_ARTICLE_LIS ( " page_article_lis " , " skin /% s / font / article_lis " ), // blog post directory
	PAGE_LABLE_LIS ( " page_lable_lis " , " skin /% s / font / lable_lis " ), // Hot tags
	PAGE_ARTICLE_TIMELINE ( " page_article_timeline " , " skin /% s / font / article_timeline " ), // article timeline
	PAGE_BOOKMARK_LIS ( " page_bookmark_lis " , " skin /% s / font / bookmark_lis " ), // bookmark directory
	PAGE_MSG_BOARD ( " page_msg_board " , " skin /% s / font / msg_board " ), // message board
	PAGE_MSG ( " page_msg_board " , " skin /% s / font / msg " ), // message prompt
	PAGE_TIMELINE ( " page_timeline " , " skin /% s / font / timeline " ) // timeline
	;
	private  String key;
	private  String path;
	
	public  String  getKey () {
		return key;
	}
	public  void  setKey ( String  key ) {
		this . key = key;
	}
	public  String  getPath () {
		return path;
	}
	public  void  setPath ( String  path ) {
		this . path = path;
	}
	private  BLOG_SKIN_PAGE ( String  p_key , String  p_path ) {
		this . key = p_key;
		this . path = p_path;
	}
}
