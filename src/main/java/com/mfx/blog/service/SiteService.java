package com.mfx.blog.service;

import com.mfx.blog.dto.MetaDto;
import com.mfx.blog.dto.MetaDto;
import com.mfx.blog.modal.bo.ArchiveBo;
import com.mfx.blog.modal.bo.BackResponseBo;
import com.mfx.blog.modal.bo.StatisticsBo;
import com.mfx.blog.modal.entity.ArticleDO;
import com.mfx.blog.modal.entity.CommentDO;

import java.util.List;

/**
 * 站点服务
 *
 * @author 13
 * @date 2017/2/23
 */
public interface SiteService {


    /**
     * 最新收到的评论
     *
     * @param limit
     * @return
     */
    List<CommentDO> recentComments(int limit);

    /**
     * 最新发表的文章
     *
     * @param limit
     * @return
     */
    List<ArticleDO> recentContents(int limit);

    /**
     * 查询一条评论
     *
     * @param commentId
     * @return
     */
    CommentDO getComment(Long commentId);


    /**
     * 获取后台统计数据
     *
     * @return
     */
    StatisticsBo getStatistics();

    /**
     * 查询文章归档
     *
     * @return
     */
    List<ArchiveBo> getArchives(String year, String month, String category, String tag);

    /**
     * 获取分类/标签列表
     *
     * @param type
     * @param orderBy
     * @param limit
     * @return
     */
    List<MetaDto> metas(String type, String orderBy, int limit);

}
