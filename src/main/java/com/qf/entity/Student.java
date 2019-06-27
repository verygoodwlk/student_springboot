package com.qf.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.ibatis.type.JdbcType;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * @version 1.0
 * @user ken
 * @date 2019/6/26 15:01
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student implements Serializable {

    @TableId(type = IdType.AUTO)
    @TableField(jdbcType = JdbcType.INTEGER)
    private Integer id;
    private String name;
    @TableField(jdbcType = JdbcType.INTEGER)
    private Integer age;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date birthday;
    @TableField(jdbcType = JdbcType.INTEGER)
    private Integer cid;

    @TableField(exist = false)
    private Classes classes;
}
