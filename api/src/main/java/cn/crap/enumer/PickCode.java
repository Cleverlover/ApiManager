package cn.crap.enumer;

import cn.crap.utils.MyString;

public enum PickCode {

	/**
	 * Front code : 前端code，未登录时可以访问的数据
	 */
    REQUEST_METHOD("REQUEST_METHOD", "接口请求方式"),
    INTERFACE_STATUS("INTERFACE_STATUS", "接口状态"),
    PROJECT_TYPE("PROJECT_TYPE", "项目类型"),
    LUCENE_SEARCH_TYPE("LUCENE_SEARCH_TYPE", "lucene 搜索类型"),
    MENU("MENU", "一级菜单"),
    SETTING_TYPE("SETTING_TYPE", "设置类型"),
    MENU_TYPE("MENU_TYPE", "菜单类型"),
    FONT_FAMILY("FONT_FAMILY", "字体选择"),
	ICONFONT("ICONFONT", "图标库地址"),
    MODEL_NAME("MODEL_NAME", "日志模块名称（接口、文章）"),
    INTERFACE_CONTENT_TYPE("INTERFACE_CONTENT_TYPE", "返回类型"),
	IMAGE_CODE("IMAGE_CODE", "图形验证码风格"),



    // 暂时不用
    MONITOR_TYPE("MONITOR_TYPE", "监控类型"),

	/**
	 * User code : 登录后可见，和用户信息绑定
	 */
    ERROR_CODE("ERROR_CODE", "错误码"),
    CATEGORY("CATEGORY", "文章分类"),
    MY_MODULE("MY_MODULE", "我的所有模块"),
    PROJECT_MODULES("PROJECT_MODULES", "项目中的模块"),
    USER("USER", "用户列表"),
	MENU_ICON("MENU_ICON", "菜单图标"),
    // 推荐项目...
    PROJECT_STATUE("PROJECT_STATUE", "项目状态"),


	/**
	 * Admin code : 仅管理员可见
	 */
    USER_TYPE("USER_TYPE", "用户类型"),
    INDEX_PAGE("INDEX_PAGE", "首页地址"),
    ROLE("ROLE", "角色"),
    AUTH("AUTH", "权限"),
    MENU_URL("MENU_URL", "菜单地址"),
	ARTICLE_STATUS("ARTICLE_STATUS", "文章状态");


	private final String code;
	private final String name;


	PickCode(String code, String name){
		this.code = code;
		this.name = name;
	}
	
	public static PickCode getByCode(String code){
		if (MyString.isEmpty(code)){
			return null;
		}
		for(PickCode pickCode : PickCode.values()){
			if(pickCode.getCode().equals(code)) {
                return pickCode;
            }
		}
		return null;
	}
	
	public String getCode(){
		return code;
	}
	
	public String getName(){
		return name;
	}
}
