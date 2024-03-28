package run.freshr.common.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Logstash 속성 정의
 *
 * @author FreshR
 * @apiNote Logstash 속성을 정의해서 application.properties 또는 application.yml 에서 사용할 수 있도록 설정
 * @since 2024. 3. 28. 오전 10:45:11
 */
@Data
@ConfigurationProperties("freshr.logstash")
public class LogstashProperties {

  /**
   * 서비스 name
   *
   * @apiNote 서비스 name
   * @since 2024. 3. 28. 오전 10:45:11
   */
  private String name;
  /**
   * 활성 여부
   *
   * @apiNote 활성 여부
   * @since 2024. 3. 28. 오전 10:45:11
   */
  private Boolean enable;
  /**
   * Logstash URL
   *
   * @apiNote Logstash URL
   * @since 2024. 3. 28. 오전 10:45:11
   */
  private String url;
  /**
   * Logstash port
   *
   * @apiNote Logstash port
   * @since 2024. 3. 28. 오전 10:45:11
   */
  private Integer port;

}
