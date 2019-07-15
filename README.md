# Log4j2-Demo
#个人感觉在springboot上使用log4j2还是比较麻烦的，有很多坑会踩。而且spring官方文档就这一部分介绍挺简略的。
====
##说说几个需要注意的地方吧。
----
* 首先是在pom中，仅仅去掉spring-boot-starter-web中的logging是不行的，依然会报slf4j不止一个的错误。我是把所有的依赖都去掉了logging，连thymeleaf框架中都有这个jar。。。
* 最新的springboot框架要求把log4j2的配置文件命名为log4j2-spring.xml或log4j2.xml，但是我自己做的时候，发现用log4j2.xml命名完全没用，而改成前者就好了。方便点就按这个命名，然后放在resources目录下。
* 如果仅仅写完配置文件的一些信息还是不好用的，因为各种框架都有相应的日志信息会输出，会导致整个控制台都是无用的信息。这就需要用拦截器拦截一下这些没用的信息，详细请参考我的log4j2-spring.xml。
* 所有工作完成后，我们会发现所有级别的输出信息都是一个字体一种颜色，很不容易查看。可以下载Grep Console这个插件。
