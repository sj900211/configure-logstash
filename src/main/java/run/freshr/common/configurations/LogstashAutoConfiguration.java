package run.freshr.common.configurations;

import static java.util.Optional.ofNullable;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import run.freshr.common.data.LogstashData;
import run.freshr.common.properties.LogstashProperties;

/**
 * Logstash 설정
 *
 * @author FreshR
 * @apiNote application.properties 와 application.yml 에서 설정한 값과<br>
 *          기본 설정 값으로 Logstash 데이터 객체 설정
 * @since 2024. 3. 28. 오전 10:45:11
 */
@Configuration(value="LogstashAutoConfiguration", proxyBeanMethods = false)
@EnableConfigurationProperties(LogstashProperties.class)
public class LogstashAutoConfiguration {

  /**
   * Logstash 데이터 객체 설정
   *
   * @param properties application.properties 와 application.yml 에서 설정한 값
   * @return Logstash 데이터 객체
   * @apiNote application.properties 와 application.yml 에서 설정한 값과<br>
   *          기본 설정 값으로 Logstash 데이터 객체 설정
   * @author FreshR
   * @since 2024. 3. 28. 오전 10:45:11
   */
  @Bean
  @ConditionalOnMissingBean
  public LogstashData logstashData(LogstashProperties properties) {
    return LogstashData
        .builder()
        .enable(ofNullable(properties.getEnable()).orElse(false))
        .name(ofNullable(properties.getName()).orElse("unnamed"))
        .url(ofNullable(properties.getUrl()).orElse(""))
        .port(ofNullable(properties.getPort()).orElse(50000))
        .build();
  }

}
