package com._220a220e.system.mapper;

import com._220a220e.system.entity.Permission;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Garrosh
 * @date 2018/5/26
 */
@Repository
public interface PermissionMapper {
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
    int insert(Permission record);
    /**
     * 根据ID查询权限信息
     * @param id
     * @return
     */
    Permission selectByPrimaryKey(@Param("id") Integer id);
    /**
     * 查询全部
     * @return
     */
    List<Permission> selectAll();
    /**
     * 更新权限信息
     * @param record
     * @return
     */
    int updateByPrimaryKey(Permission record);


}
