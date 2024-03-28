package run.freshr.common.data;

import lombok.Builder;
import lombok.Data;

/**
 * Logstash 데이터 모델
 *
 * @author FreshR
 * @apiNote Logstash 데이터 모델
 * @since 2024. 3. 28. 오전 10:45:11
 */
@Data
@Builder
public class LogstashData {

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
