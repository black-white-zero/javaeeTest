# javaeeTest
吉林大学软件学院软构件与中间件JavaEE实验源码
```
注意事项：使用前核对实验题目是否一致。
```
## 实验1
> 题目1 （必做）搭建Java EE开发环境。
> 题目2（必做）  用户注册登录功能模块的实现。

- 搭建Java EE开发环境
```
安装Tomcat服务器
安装MySQL建立数据库
本项目所用的编辑器为IntelliJ IDEA，使用项目前配置tomcat并导入jar包
```
- 源码地址
```
test1
https://github.com/Mrlshadows/javaeeTest/tree/master/test1/app
注意事项：使用时，更改相应位置的数据库用户名、密码、数据库名与字段名与创建的相一致。
```
- 参考资料
> 新手推荐JSP+JavaBean+Servlet MVC模式用户注册模块
https://blog.csdn.net/a153375250/article/details/50935948

> IntelliJ IDEA2016.1新建JSP工程
https://blog.csdn.net/icarus_wang/article/details/51046083

> MySql指令集（一）
https://blog.csdn.net/cl05300629/article/details/9464007

## 实验2
> 题目1 使用JSF标签构建图书添加页面。
> 题目2 使用托管Bean获得用户输入的图书信息。
> 题目3 使用转换器和验证器对用户输入的图书信息进行转换和验证。
> 题目4 使用导航功能，用户点击添加按钮后，将其导航到添加确认页面。
> 题目5 使用值更改事件，实现类别与子类别的联动关系。

- 注意事项
实验2完成了题目1和题目2，后面的没有包括。
- 配置开发环境
```
idea 可以直接新建 JSF项目，可以用以下网址参考配置。
在 IntelliJ IDEA 中配置 JSF 开发环境的入门详解
https://www.cnblogs.com/cyberniuniu/p/5877380.html

注意：
1. 我们的实验项目是可以用tomcat实现的，没有必要下载文章中所说的完整版应用服务器。
2. 即按照文中配置服务器的办法配置tomcat即可。
3. 项目所需的jar包，已经包含在了源代码中，注意编译jar包。
```
- 源码地址
```
test2
https://github.com/Mrlshadows/javaeeTest/tree/master/test2/jsf_f
```
- 参考资料
> JSF教程（1）——简介 + HelloWorld
https://blog.csdn.net/beijiguangyong/article/details/22455787

> JSF学习之最简单jsf
https://blog.csdn.net/qq931399960/article/details/45130855

> 解决报错NoClassDefFoundError: javax/servlet/jsp/jstl/core/Config
https://blog.csdn.net/king0406/article/details/54025410

> JSF <h:inputText>标签
https://www.yiibai.com/jsf/inputtext.html

> 解决Jetty JSF2错误：java.lang.IllegalStateException: Singleton is not set
https://jerval.iteye.com/blog/1871426

> 用JSF的valueChangeListener实现表单联动
http://www.voidcn.com/article/p-babauths-bhq.html

## 实验3
无
## 实验4
无
## 提示
- 应付实验的同时可以看下源码，捋一下逻辑。