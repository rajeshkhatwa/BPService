/*package customer.bpeventhandler;

import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
@Order(1) // needs to have higher priority than CAP security config
public class AppSecurityConfig extends WebSecurityConfigurerAdapter {
@Override
protected void configure(HttpSecurity http) throws Exception {
  http
    .requestMatchers().antMatchers("/odata/v4/BPService**").and()
      .csrf().disable() // don't insist on csrf tokens in put, post etc.
    .authorizeRequests()
      .anyRequest().permitAll();
  }
}
*/