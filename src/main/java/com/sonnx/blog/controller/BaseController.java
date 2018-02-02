package com.sonnx.blog.controller;

import com.sonnx.blog.modal.entity.UserDO;
import com.sonnx.blog.utils.MapCache;
import com.sonnx.blog.utils.TaleUtils;

import javax.servlet.http.HttpServletRequest;

/**
 * @author 13
 * @date 2017/2/21
 */
public abstract class BaseController {

    public static String THEME = "themes/default";

    protected MapCache cache = MapCache.single();

    /**
     * 主页的页面主题
     *
     * @param viewName
     * @return
     */
    public String render(String viewName) {
        return THEME + "/" + viewName;
    }

    /**
     *
     *
     * @param viewName
     * @return
     */
    public String globalRender(String viewName) {
        return viewName;
    }

    public BaseController title(HttpServletRequest request, String title) {
        request.setAttribute("title", title);
        return this;
    }

    public BaseController keywords(HttpServletRequest request, String keywords) {
        request.setAttribute("keywords", keywords);
        return this;
    }

    /**
     * 获取请求绑定的登录对象
     *
     * @param request
     * @return
     */
    public UserDO user(HttpServletRequest request) {
        return TaleUtils.getLoginUser(request);
    }

    public Long getUid(HttpServletRequest request) {
        return this.user(request).getId();
    }

    public String render404() {
        return "comm/error_404";
    }

}