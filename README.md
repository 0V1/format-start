# 基于import注解（不推荐，不优雅）
引用start的工程，在主入口上加上import注解，引入start的主配置类，也就是让springboot项目启动的时候额外加载指定配置，然后相关的bean都会加载进ioc
~~~
@Import(FormatTemplateConfiguration.class)
~~~
# 基于自定义enablexxx注解（推荐，使用方便，随意开关）
start项目中提供enablexxx的注解，以供引用后开启start的功能,一个enablexxx总会对应一个import。
~~~
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import(FormatTemplateConfiguration.class)
public @interface EnableFormat {}
~~~
在引用start的工程主入口上加入enable注解即可
~~~
@EnableFormat
~~~
# 基于spring.factories（框架中多使用该方式，因为需要引入大量配置）
在start项目或者引用方工程的加入resources/META-INF/spring.factories，在start中加的话，意味着start被引用到pom时便开启自动配置，
如果是使用start的工程下加入，表明主动加载。其作用都一样，只是看哪里做，在引用方做的话，可以管理所有的自定义start，
~~~
# Auto Configure
org.springframework.boot.autoconfigure.EnableAutoConfiguration=\
com.start.demo.configuration.FormatTemplateConfiguration
~~~
