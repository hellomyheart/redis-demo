package cn.hellomyheart.redis.demo.test;

import org.junit.Test;
import redis.clients.jedis.Jedis;

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

    }


}
