package com.vincent.library_common;


import android.util.Log;

import androidx.annotation.Nullable;

import com.tencent.mmkv.MMKV;
import com.vincent.library_base.base.BaseApplication;

/**
 * 应用模块:
 * <p>
 * 类描述: 通用库 & 基础库 自身初始化操作
 * <p>
 *
 * @author darryrzhoong
 * @since 2020-02-25
 */
public class CommonModuleInit implements IModuleInit
{
    @Override
    public boolean onInitAhead(BaseApplication application)
    {
        // 初始化日志
//        Logger.addLogAdapter(new AndroidLogAdapter()
//        {
//            @Override
//            public boolean isLoggable(int priority, @Nullable String tag)
//            {
//                return application.issDebug();
//            }
//        });
//        if (application.issDebug())
//        {
//            ARouter.openLog(); // 开启日志
//            ARouter.openDebug(); // 使用InstantRun的时候，需要打开该开关，上线之后关闭，否则有安全风险
//        }
//        ARouter.init(application);
        Log.i("tag", "onInitAhead");
        MMKV.initialize(application);
//        Logger.i("基础层初始化完毕 -- onInitAhead");

        return false;
    }
    
    @Override
    public boolean onInitLow(BaseApplication application)
    {
        return false;
    }
    
}
