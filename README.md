# spring-hello
[csdn blog](https://blog.csdn.net/persistinlife/article/details/90314082)
spring笔记
##### 1 控制反转 依赖注入
- **ioc** 控制反转，以往对象的创建式通过new方式，现在对应都由spring管理通过反射形式将对象初始化放在spring容器中。
- **di** 依赖注入，bean与bean之间根据依赖关系进行引用，之所以引入这个名词，应该是bean之间相互依赖的关系更能体现spring容器管理的特点。例如在下面例子中UserInfoService对象需要初始化User对象。
- `applicationContext.xml` 中将对象配置到bean标签下，**value**指定的是示例参数，**ref**指定的是引用（例如在某个对象中需要使用另一个对象）。
- 使用`ClassPathXmlApplicationContext`加载并初始化bean容器（可以理解成解析xml文件，通过Java反射机制初始化对象放在类似Hashmap中，例 `user = Class.forName("com.hiro.entity.User");`并设置属性，放入类似Hashmap中），当获取时候通过id获取即可。
- `ClassPathXmlApplicationContext`操作是占用内存的，所以保证`ApplicationContext`是单态的。
##### 2 bean生命周期
- 1实例化bean 通过加载xml文件。
- 2设置bean属性值 
- 3调用`BeanNameAware setBeanName`
- 4调用`BeanFactoryAware setBeanFactory` 
- 5调用` ApplicationContextAware setApplicationContext` 
- 6`BeanPostProcessor postProcessBeforeInitialization`预先初始化处理方法，通常可以对所有的bean进行自定义操作
- 7`InitializingBean afterPropertiesSet`
- 8自定义初始化方法 在bean中创建方法，在xml文件通过`<bean name="student" class="com.hiro.beanLifecycle.entity.Student" init-method="init">`加入。
- 9`BeanPostProcessor postProcessAfterInitialization`后处理方法
- 10使用bean。。。。。
- 11容器关闭 `DisposableBean destroy`方法
- 12或者自定义destroy 同理按照init配置
**注意**
在手动启动关闭容器使用`AbstractApplicationContext`代替`ApplicationContext`使用close()方法
