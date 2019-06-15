
package cloudE.monitor.server;

import de.codecentric.boot.admin.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author vangao1989
 * @Description: 服务监控
 * @date 2017年7月24日
 */
@SpringBootApplication
@EnableEurekaClient
@EnableAdminServer
public class SpringBootAdminApplication {
    /**
     * 方法说明：
    
     *
     * Author：        hemin                
     * Create Date：   2019年6月15日 下午10:26:20
     * History:  2019年6月15日 下午10:26:20   hemin   Created.
     *主要监控文件
     * @param args
     *
     */
    public static void main(String[] args) {
        SpringApplication.run(SpringBootAdminApplication.class, args);
    }
}
