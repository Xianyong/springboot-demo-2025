package cn.edu.gzist.cs.demo.devenv.entity;

import cn.edu.gzist.cs.demo.devenv.entity.User;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * @author VVulpes
 * @CreateDate 2024/1/5
 * @ProjectDetails [P7·多表查询]
 */
@TableName("t_order")
public class Order {

    private Integer id;
    @TableField("order_time")
    private String ordertime;
    private String total;
    private int uid;

    @TableField(exist = false)
    private User user;
}
