# spring-hello
spring笔记
##### 1 控制反转 依赖注入
- **ioc** 控制反转，以往对象的创建式通过new方式，现在对应都由spring管理通过反射形式将对象初始化放在spring容器中。
- **di** 依赖注入，bean与bean之间根据依赖关系进行引用，之所以引入这个名词，应该是bean之间相互依赖的关系更能体现spring容器管理的特点。例如在下面例子中UserInfoService对象需要初始化User对象。
- `applicationContext.xml` 中将对象配置到bean标签下，**value**指定的是示例参数，**ref**指定的是引用（例如在某个对象中需要使用另一个对象）。
- 使用`ClassPathXmlApplicationContext`加载并初始化bean容器（可以理解成解析xml文件，通过Java反射机制初始化对象放在类似Hashmap中，例 `user = Class.forName("com.hiro.entity.User");`并设置属性，放入类似Hashmap中），当获取时候通过id获取即可。
- `ClassPathXmlApplicationContext`操作是占用内存的，所以保证`ApplicationContext`是单态的。
