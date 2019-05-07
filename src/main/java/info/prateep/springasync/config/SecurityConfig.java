package info.prateep.springasync.config;

import info.prateep.springasync.service.MyUserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.authentication.encoding.PlaintextPasswordEncoder;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

import javax.sql.DataSource;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter{
    @Autowired
    CustomAuthenticationProvider authenticationProvider;
    @Autowired
    MyUserDetailsService userDetailsService;
    @Autowired
    DataSource dataSource;

    @Override
    protected void configure(HttpSecurity http) throws Exception
    {
        http
            .csrf().disable()
            .authorizeRequests().anyRequest().authenticated()
            .and()
            .httpBasic();
    }

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth)
            throws Exception
    {
        /*auth.inMemoryAuthentication()
                .withUser("admin")
                .password("pwd")
                .roles("USER");*/
        auth.authenticationProvider(authenticationProvider);
        //auth.authenticationProvider(authenticationProvider());
        //auth.jdbcAuthentication().dataSource(dataSource).usersByUsernameQuery("select NAME as username, PASSWORD,1 as enabled from USER where NAME=?");
    }

    @Bean
    public DaoAuthenticationProvider authenticationProvider() {
        DaoAuthenticationProvider authProvider
                = new DaoAuthenticationProvider();
        authProvider.setUserDetailsService(userDetailsService);
        return authProvider;
    }
}
