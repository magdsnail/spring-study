## spring-study
``控制反转 依赖注入``
## 常用依赖
```xml
 <dependency>
            <groupId>org.springframework</groupId>
            <artifactId>spring-webmvc</artifactId>
            <version>5.2.0.RELEASE</version>
        </dependency>
        <dependency>
            <groupId>junit</groupId>
            <artifactId>junit</artifactId>
            <version>4.13.2</version>
        </dependency>
```

## 注解说明
@Autowired: 自动装配通过类型 名字
    如果autowired不能唯一自动装配上属性 则需要通过@Qualifier(value = "x")
@Nullable 字段标记了这个注解说明这个字段可以为null
@Resource: 自动装配通过名字 类型