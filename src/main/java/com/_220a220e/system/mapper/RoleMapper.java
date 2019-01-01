package com._220a220e.system.mapper;

import com._220a220e.system.entity.Role;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Garrosh
 * @date 2018/5/26
 */
@Repository
public interface RoleMapper {
    /**
     * 删除角色信息
     * @param id
     * @return
     */
    int deleteByPrimaryKey(@Param("id") Integer id);
    /**
     * 插入角色信息
     * @param record
     * @return
     */
    int insert(Role record);
    /**
     * 根据ID查询角色
     * @param id
     * @return
     */
    Role selectByPrimaryKey(@Param("id") Integer id);
    /**
     * 查询全部
     * @return
     */
    List<Role> selectAll();
    /**
     * 更新角色信息
     * @param record
     * @return
     */
    int updateByPrimaryKey(Role record);
    /**
     * 查询用户的角色
     * @param userId
     * @return
     */
    List<Role> selectByUserId(@Param("userId") Integer userId);
}
