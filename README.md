>  一款模仿 Eyepetizer | 开眼视频的 开源app

- 本文参考 ：https://github.com/darryrzhong/Android-MvvmComponent-App

- 这是一款根据网上开源项目代码进行二次开发的，在原有项目基础上进行相关版本升级以及最新系统兼容优化之后的项目，后续逐步实现kotlin转换，全部使用kotlin开发。

## 效果图：

| ![app_02.png](https://upload-images.jianshu.io/upload_images/5549640-9380bb706c59e3af.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/260) | ![app_03.png](https://upload-images.jianshu.io/upload_images/5549640-0fd473371888d8ac.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/260) | ![app_04.png](https://upload-images.jianshu.io/upload_images/5549640-2e2421bce1e93e26.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/260) | 
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| ![app_05.png](https://upload-images.jianshu.io/upload_images/5549640-5d56b2b27f5e942e.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/260) | ![app_06.png](https://upload-images.jianshu.io/upload_images/5549640-de207f28f6b3bdf7.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/260) | ![app_07.png](https://upload-images.jianshu.io/upload_images/5549640-7e5261c0c5a6f7cd.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/260) | 
| ![app_08.png](https://upload-images.jianshu.io/upload_images/5549640-2b5e338fb31a0c25.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/260) |  ![app_09.png](https://upload-images.jianshu.io/upload_images/5549640-6950f3f3ed412191.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/260) | ![app_10.png](https://upload-images.jianshu.io/upload_images/5549640-58b719bb47a3dbfc.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/260) |



## 项目结构
该开源项目采用组件化的方式开发，使用MVVM + AndroidX + jetpack 组件为基本架构进行开发。


- app 架构图

![app_os.png](https://upload-images.jianshu.io/upload_images/5549640-7e2562e5f83a2e03.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/720)



## app 使用技术介绍

- Mvvm 架构设计
关于各种mvx 的区别，我就不一一介绍了，上Google 搜一下就好，关于项目中使用的mvvm设计封装，请移步 [这里](https://developer.android.google.cn/jetpack/androidx) ；代码是最好的老师，直接看源码吧。

- Android X 
这个也没啥好说的，就是android Support 库的升级迁移版而已，现在新项目肯定都是直接androidX了，对Android X 不熟悉的小伙伴，请移步 [官方介绍](https://developer.android.google.cn/jetpack/androidx) ；

- jetpack
这个也没啥好说的，jetpack就是Google推出的一套组件开发库，直接上图可能更好， [官方介绍](https://developer.android.google.cn/jetpack)

基本最主要使用的就是这些了
 ![jetpack](https://upload-images.jianshu.io/upload_images/5549640-6bcafd8c14058d02.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

## app 第三方的依赖

- RxEasyHttp
 RxEasyHttp是一款github上开源的RxJava2+Retrofit2实现简单易用的网络请求框架，在本人发现并观摩其源码和设计原理后，发现着实写的不错，各种业务场景基本都设计到了，api 设计的也不错，当然也存在一些瑕疵，所以实际项目中还需根据自己的业务需求进行二次开发，推荐给各位看官[RxEasyHttp](https://github.com/darryrzhong/RxEasyHttp)

- Loadsir
loadsir是一个app 页面状态管理的第三方库，也非常得实用，用来控制app 内的加载页面 、加载错误页面、空页面显示，点击重试等，从此告别自己控制网络加载失败等页面 show 、 hint 操作 和ViewStub等的控制，
可以基于自己的业务进行基类封装，具体请看项目base库中activity 和fragment 基类的封装。推荐给各位看官
[Loadsir](https://github.com/darryrzhong/LoadSir/blob/master/README-cn.md
)

- mmkv 
mmkv 是腾讯开源的一个轻量级的存储库，用来代替SharedPreferences 再好不过了，具体使用请看官方介绍

- BaseRecyclerViewAdapterHelper
相信对于这个库大家应该是非常熟悉了吧，基本做android 开发的都用过吧，不多说了

- SmartRefreshLayout
这个库和上面那个库一样，用的非常多，

- immersionbar
实现沉浸式状态栏的一个第三方库，也是非常常用

- glide
图片加载库

- rxpermissions 
权限加载库

- logger
日志打印库，打出来的日志格式看得比较舒服

- utilcodex
一个android 工具库，里面有非常多的工具类，当然实际项目用不到这么多，所以可以根据需求copy代码就好，不用集成

- BannerViewPager
一个第三方轮播图的库，这个库比较新，所以start数比较少，但是挺好用，推荐

- PagerBottomTabStrip
一个第三方导航库，app中的底部导航就是基于这个库，挺好用，自带小红点管理

- gsyVideoPlayer
一个第三方视频播放库，基于bilibili 开源的 ijkplayer，可自定义性也还不错，
主要使用这个库实现类似微博等视频列表根据滚动判断自动播放，

 
## 项目Api 

> 声明 ，项目中所有api接口都是抓取自开眼app，所有版权均归属开眼app所有，仅供学习借鉴使用，请勿用做商业用途，若有侵权，请联系作者删除。

### 首页

1.发现更多

- 请求地址： http://baobab.kaiyanapp.com/api/v7/index/tab/discovery

2.每日推荐

- 请求地址： http://baobab.kaiyanapp.com/api/v5/index/tab/allRec

3.日报精选

- 请求地址 ： http://baobab.kaiyanapp.com/api/v5/index/tab/feed


### 社区

1.推荐

- 请求地址： http://baobab.kaiyanapp.com/api/v7/community/tab/rec

2.关注

- 请求地址： http://baobab.kaiyanapp.com/api/v6/community/tab/follow


### 通知

1.主题 

- 请求地址： http://baobab.kaiyanapp.com/api/v7/tag/tabList

2.通知 

- 请求地址 ：  http://baobab.kaiyanapp.com/api/v3/messages

3.互动

- 请求地址 ：  http://baobab.kaiyanapp.com/api/v7/topic/list

### 视频详情页 

1.相关推荐 

- 请求地址 ：http://baobab.kaiyanapp.com/api/v4/video/related?id=186856


|参数说明 |说明 |是否必须 |默认值 |
|-|-|-|-|
|id|当前播放视频的id，从跳转页面视频item中获取|是|无|


2. 评论

- 请求地址 ：http://baobab.kaiyanapp.com/api/v2/replies/video?videoId=186856


|参数说明 |说明 |是否必须 |默认值 |
|-|-|-|-|
|videoId|当前播放视频的id，从跳转页面视频item中获取|是|无|

## apk下载

链接: https://pan.baidu.com/s/11m8cfgJ2zGoZ7rLMXLRuHA 提取码: j6f4


## 项目地址 
- # **[Eyepetizer-master](https://github.com/VincentStory/Eyepetizer-master)**








