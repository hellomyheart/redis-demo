package cn.hellomyheart.redis.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @description
 * @className: User
 * @package: cn.hellomyheart.redis.demo.entity
 * @author: Stephen Shen
 * @date: 2020/9/24 下午2:25
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable {
    private Integer uid;
    private String username;
    private String password;
}
