package com.vincent.main.application;


import com.vincent.library_base.base.BaseApplication;
import com.vincent.library_common.IModuleInit;

/**
 * 应用模块: main
 * <p>
 * 类描述: main组件的业务初始化
 * <p>
 *
 * @author darryrzhoong
 * @since 2020-02-26
 */
public class MainModuleInit implements IModuleInit {
    @Override
    public boolean onInitAhead(BaseApplication application) {
//        ScreenAutoAdapter.setup(application);
//        EasyHttp.init(application);
//        if (application.issDebug()) {
//            EasyHttp.getInstance().debug("easyhttp", true);
//        }
//        EasyHttp.getInstance()
//                .setBaseUrl("http://baobab.kaiyanapp.com")
//                .setReadTimeOut(15 * 1000)
//                .setWriteTimeOut(15 * 1000)
//                .setConnectTimeout(15 * 1000)
//                .setRetryCount(3)
//                .setCacheDiskConverter(new GsonDiskConverter())
//                .setCacheMode(CacheMode.FIRSTREMOTE);
//        LoadSir.beginBuilder()
//                .addCallback(new ErrorCallback())
//                .addCallback(new LoadingCallback())
//                .addCallback(new EmptyCallback())
//                .addCallback(new TimeoutCallback())
//                .setDefaultCallback(LoadingCallback.class)
//                .commit();
//        Utils.init(application);
//        Logger.i("main组件初始化完成 -- onInitAhead");
        return false;
    }

    @Override
    public boolean onInitLow(BaseApplication application) {
        return false;
    }
}
