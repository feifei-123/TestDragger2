package com.example.testdragger2.worm;

import com.example.testdragger2.ActivityScoped;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

/**
 * 定义一个Module
 *
 * 1、使用module 有两种方式:
 * （1）自定义实体类, 如 User类，直接用@module注解标注该实体类(User)，同时用@Inject标注实体类(User的)构造方法类
 *  (2) 对于第三方库中的类(如A 类)，我们无法修改其构造方法，所以我们需要，创建一个辅助类XXXModule,用@module标注 辅助类XXXModule;并提供provider方法
 *  :创建 proviceA方法，返回一个A类的对象，同时用@Provides标注proviceA()方法
 * 2、Module 可以引入另一个module。 @Module(includes = {User.class})
 * Dagger会现在A moudule 中寻找对象，如果没找到，会去找（include进入的）module B 中是否有被Inject注解的对象
 * 3、@Named注解使用，用于实例化同一个类型的不同的对象。
 *
 */
//@Module(includes = {User.class})
@Module
public class WormModule {
    private String name;
    //为module定义构造方法


    public WormModule(String name){
        this.name = name;
    }


    /**
     * 定义Provide方法
     * @return
     */
    @Provides
    public String provideName(){
        return name;
    }

    /**
     * 定义Provide方法
     * @param name
     * @return
     */

    @ActivityScoped
    @Provides
    public Worm provideWorm(String name){
        Worm worm = new Worm();
        worm.setName(name);
        return worm;
    }

    @Named("dev")
    @Provides
    public Worm provideWormDev(){
        Worm worm = new Worm();
        worm.setName("dev");
        return worm;
    }

    @Named("release")
    @Provides
    public Worm provideWormRelease(){
        Worm worm = new Worm();
        worm.setName("release");
        return worm;
    }


}
