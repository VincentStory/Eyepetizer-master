package com.drz.main.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentPagerAdapter
import com.alibaba.android.arouter.facade.annotation.Route
import com.alibaba.android.arouter.launcher.ARouter
import com.drz.base.activity.MvvmBaseActivity
import com.drz.base.storage.MmkvHelper
import com.drz.base.viewmodel.IMvvmBaseViewModel
import com.drz.common.adapter.ScreenAutoAdapter
import com.drz.common.router.RouterActivityPath
import com.drz.common.router.RouterFragmentPath
import com.drz.main.R
import com.drz.main.adapter.MainPageAdapter
import com.drz.main.databinding.MainActivityMainBinding
import com.drz.main.utils.ColorUtils
import com.gyf.immersionbar.ImmersionBar
import me.majiajie.pagerbottomtabstrip.NavigationController

/**
 * @author : wangwenbo
 * @date : 2022/6/10
 * Desc :
 */
@Route(path = RouterActivityPath.Main.PAGER_MAIN)
class MainActivity :
    MvvmBaseActivity<MainActivityMainBinding?, IMvvmBaseViewModel<*>?>() {
    private var fragments: MutableList<Fragment>? = null
    private var adapter: MainPageAdapter? = null
    private var mNavigationController: NavigationController? = null
    override fun getViewModel(): IMvvmBaseViewModel<*>? {
        return null
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        ScreenAutoAdapter.match(this, 375.0f)
        super.onCreate(savedInstanceState)
        ImmersionBar.with(this)
            .statusBarColor(R.color.main_color_bar)
            .navigationBarColor(R.color.main_color_bar)
            .fitsSystemWindows(true)
            .autoDarkModeEnable(true)
            .init()
        initView()
        initFragment()
    }

    private fun initView() {
        mNavigationController = viewDataBinding?.bottomView?.material()
            ?.addItem(
                R.drawable.main_home,
                "首页",
                ColorUtils.getColor(this, R.color.main_bottom_check_color)
            )
            ?.addItem(
                R.drawable.main_community,
                "社区",
                ColorUtils.getColor(this, R.color.main_bottom_check_color)
            )
            ?.addItem(
                R.drawable.main_notify,
                "通知",
                ColorUtils.getColor(this, R.color.main_bottom_check_color)
            )
            ?.addItem(
                R.drawable.main_user,
                "我的",
                ColorUtils.getColor(this, R.color.main_bottom_check_color)
            )
            ?.setDefaultColor(
                ColorUtils.getColor(this, R.color.main_bottom_default_color)
            )
            ?.enableAnimateLayoutChanges()
            ?.build()
        mNavigationController!!.setHasMessage(2, true)
        mNavigationController!!.setMessageNumber(3, 6)
        adapter = MainPageAdapter(
            supportFragmentManager,
            FragmentPagerAdapter.BEHAVIOR_SET_USER_VISIBLE_HINT
        )
        viewDataBinding?.cvContentView?.setOffscreenPageLimit(1)
        viewDataBinding?.cvContentView?.setAdapter(adapter)
        viewDataBinding?.cvContentView?.let { mNavigationController!!.setupWithViewPager(it) }
    }

    private fun initFragment() {
        fragments = ArrayList()
        //通过ARouter 获取其他组件提供的fragment
        val homeFragment =
            ARouter.getInstance().build(RouterFragmentPath.Home.PAGER_HOME).navigation() as Fragment
        val communityFragment =
            ARouter.getInstance().build(RouterFragmentPath.Community.PAGER_COMMUNITY)
                .navigation() as Fragment
        val moreFragment =
            ARouter.getInstance().build(RouterFragmentPath.More.PAGER_MORE).navigation() as Fragment
        val userFragment =
            ARouter.getInstance().build(RouterFragmentPath.User.PAGER_USER).navigation() as Fragment
        fragments?.add(homeFragment)
        fragments?.add(communityFragment)
        fragments?.add(moreFragment)
        fragments?.add(userFragment)
        adapter!!.setData(fragments)
    }

    override fun getBindingVariable(): Int {
        return 0
    }

    override fun getLayoutId(): Int {
        return R.layout.main_activity_main
    }

    override fun onRetryBtnClick() {}

    companion object {
        fun start(context: Context) {
            MmkvHelper.getInstance().mmkv.encode("first", false)
            context.startActivity(Intent(context, MainActivity::class.java))
        }
    }
}
