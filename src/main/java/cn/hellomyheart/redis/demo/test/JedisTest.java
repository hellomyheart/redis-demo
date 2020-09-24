package cn.hellomyheart.redis.demo.test;

import cn.hellomyheart.redis.demo.entity.User;
import com.alibaba.fastjson.JSON;
import org.junit.Test;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

/**
 * @description
 * @className: JedisTest
 * @package: cn.hellomyheart.redis.demo
 * @author: Stephen Shen
 * @date: 2020/9/24 下午2:11
 */
public class JedisTest {

    @Test
    public void test() {
        //获得连接对象
        Jedis jedis = new Jedis("127.0.0.1", 6379);

        //认证密码
        //jedis.auth("root");

        //存值
        String cm = jedis.set("cm", "18");

        //取值
        String cm1 = jedis.get("cm");

        //输出
        System.out.println(cm1);

        jedis.close();
    }

    @Test
    public void test1() {

        JedisPoolConfig jedisPoolConfig = new JedisPoolConfig();
        jedisPoolConfig.setMaxTotal(50);// 最大连接数
        jedisPoolConfig.setMaxIdle(30);//最小闲置数
        jedisPoolConfig.setMinIdle(10);//最小闲置数

        JedisPool jedisPool = new JedisPool(jedisPoolConfig, "127.0.0.1", 6379);

        Jedis resource = jedisPool.getResource();
        User user = new User(17, "stephen", "0.17");

        resource.set("cm2", JSON.toJSONString(user));

        String cm2 = resource.get("cm2");
        System.out.println(cm2);

        resource.close();
        jedisPool.close();


    }


}
