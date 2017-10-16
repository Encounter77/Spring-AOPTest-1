# Spring-AOPTest-1

模拟吃饭流程
####

* 准备开始吃饭<br>
* 开始吃饭/吃面<br>
* 无意外情况--------- 吃饭结束 <br>
* 有意外情况--------- 筷子掉了，洗筷子-------吃饭结束<br>

将配置类替换为XML文档的形式的时候需要注意
----
* 命名空间aop(三条)<br>
* 自动扫描<context:component-scan base-package="*"/><br>
* AOP开启自动代理<aop:aspectj-autoproxy></aop:aspectj-autoproxy><br>
* 相关Bean<br>

替换注解
----

