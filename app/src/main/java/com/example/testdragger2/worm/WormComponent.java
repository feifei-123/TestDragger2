package com.example.testdragger2.worm;

import com.example.testdragger2.ActivityScoped;
import com.example.testdragger2.MainActivity;
import com.example.testdragger2.SecondActivity;
import com.example.testdragger2.app.AppComponent;

import dagger.Component;

/**
 * 定义Component方法，指定modules
 *
 *  1、Compoent中的方法只能是两类:
 *  (1)带返回值的 - 被识别为provider类
 *  (2)无返回值，带参数的 - 被识别成injector类 。如果参数为void inject(A a),若A中没有使用inject标签，则内部使默认的
 *  MembersInjectors.<Object>noOp().injectMembers(activity);
 *  若A 中定义了@inject标签，则会生成一个新的类MainActivity_MembersInjector,方式inject()内部 使用
 *  mainActivityMembersInjector.injectMembers(activity);
 * 2、一个compoent可以依赖多个module : @Component(modules = {AModule.class,BModule.class})
 *
 */


@ActivityScoped
@Component(modules = {WormModule.class},dependencies = AppComponent.class)
public interface WormComponent {

    /**
     * Component当中可以定义多个方法，dagger会自动补充方法的实现体
     * 如 provideWorm 返回
     * @return
     */

    //提供一个返回Worm的方法
    Worm provideW();

    //返回一个字符串
    String provideN();

    void testInject(MainActivity activity);
    void testInject(SecondActivity activity);

}
