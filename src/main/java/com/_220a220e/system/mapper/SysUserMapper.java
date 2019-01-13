package com._220a220e.system.mapper;

import com._220a220e.system.entity.SysUser;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Garrosh
 * @date 2018/5/25
 */
@Repository
public interface SysUserMapper {
    /**
     * 根据ID删除数据
     * @param id
     * @return
     */
    int deleteByPrimaryKey(@Param("id") Integer id);
    /**
     * 插入数据
     * @param record
     * @return
     */
    int insert(SysUser record);
    /**
     * 根据ID查找数据
     * @param id
     * @return
     */
    SysUser selectByPrimaryKey(@Param("id") Integer id);
    /**
     * 查询全部
     * @return
     */
    List<SysUser> selectAll();
    /**
     * 更新数据
     * @param record
     * @return
     */
    int updateByPrimaryKey(SysUser record);
    /**
     * 根据用户名查找数据
     * @param username
     * @param status
     * @return
     */
    SysUser selectByUsername(@Param("username") String username, @Param("status") String status);
}
