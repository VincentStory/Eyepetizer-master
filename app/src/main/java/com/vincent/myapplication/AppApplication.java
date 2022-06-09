package com.vincent.myapplication;


import android.util.Log;

import com.vincent.library_base.base.BaseApplication;
import com.vincent.library_common.config.ModuleLifecycleConfig;

import java.util.logging.Logger;

/**
 * 应用模块: 宿主app
 * <p>
 * 类描述: 宿主app的 application ,在这里通过common组件中定义的组件生命周期配置类进行相应初始化(通过反射调用各个组件的初始化器)
 * <p>
 *
 * @author darryrzhoong
 * @since 2020-02-26
 */
public class AppApplication extends BaseApplication {

    @Override
    public void onCreate() {
        super.onCreate();
        setsDebug(BuildConfig.DEBUG);
        // 初始化需要初始化的组件
        ModuleLifecycleConfig.getInstance().initModuleAhead(this);


        Log.i("tag", "AppApplication");
    }
}
