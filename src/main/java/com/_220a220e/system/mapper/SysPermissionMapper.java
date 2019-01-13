package com._220a220e.system.mapper;

import com._220a220e.system.entity.SysPermission;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Garrosh
 * @date 2018/5/26
 */
@Repository
public interface SysPermissionMapper {
    /**
     * 删除权限信息
     * @param id
     * @return
     */
    int deleteByPrimaryKey(@Param("id") Integer id);
    /**
     * 插入权限信息
     * @param record
     * @return
     */
    int insert(SysPermission record);
    /**
     * 根据ID查询权限信息
     * @param id
     * @return
     */
    SysPermission selectByPrimaryKey(@Param("id") Integer id);
    /**
     * 查询全部
     * @return
     */
    List<SysPermission> selectAll();
    /**
     * 更新权限信息
     * @param record
     * @return
     */
    int updateByPrimaryKey(SysPermission record);


}
