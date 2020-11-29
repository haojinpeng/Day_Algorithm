package qin_reflection.annotation;


import java.lang.annotation.*;

@MyAnnotation
public class Test1 {
    public void test(){

    }
}

//自定义一个注解
//Target 表示注解可以用在哪些地方
@Target(value = {ElementType.METHOD,ElementType.TYPE})
//Retention 表示注解在什么地方还有效
@Retention(value = RetentionPolicy.RUNTIME)
//Documented 表示是否生成文档
@Documented
//Inherited 子类是否可以继承父类注解
@Inherited

@interface MyAnnotation{

}