新闻发布网站

20171110 -增加在线人数统计功能； 涉及技术application <br/>
20171110 -增加登陆页面的验证码和记住我功能； 涉及技术 session，cookie<br/>
20171115 -增加登陆页面的自动登录，（成功访问管理员界面后，关闭浏览器后，下次访问时自动登录。）  涉及技术filter<br/>
20171118 -增强自动登录功能，自动登录只能一次，并且需要排除和登录、注册相关的资源<br/>
20171120 -使用servlet3.0实现文件上传<br/>
20171122 -servlet路径配置改为注解模式<br/>
20171125 -增加BaseServlet基类。所有servlet改写 ，由之前的每个动作写一个servlet，改为目前的通用Userservlet<br/>
           &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; 添加用户的时候<br/>
           &nbsp; &nbsp; &nbsp; &nbsp;  &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; 以前: /store/addUser<br/>
           &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;  现在: /store/user?method=add<br/>
         &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; -所有jsp页面中加入自定义标签 fns  /WEB-INF/tlds/fns.tld<br/>
        &nbsp; &nbsp; &nbsp; &nbsp;  &nbsp; &nbsp; -用户注册成功后，发送激活邮件。<br/>
20171126 -dao层全部改用c3p0数据库连接池的方式链接，利用dbutils工具包来操作数据库<br/>
        &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;  -模仿spring写一个工厂BeanFactory,进行控制层（Servlet层）与service层、service层与dao层的简单解耦<br/>
       &nbsp; &nbsp; &nbsp; &nbsp;  &nbsp; &nbsp;  -添加缓存技术；<br/>

20171129 -做简单的过滤器的权限控制<br/>
       &nbsp; &nbsp; &nbsp; &nbsp;  &nbsp; &nbsp;  -文件上传工厂<br/>
       &nbsp; &nbsp; &nbsp; &nbsp;  &nbsp; &nbsp;  -分页封装<br/>
&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; -增强所有的添加操作：动态代理<br/>
