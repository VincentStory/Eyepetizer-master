package com.vincent.home.discover.adapter;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.vincent.home.databinding.HomeItemCategoryItemSubjectCardViewBinding;
import com.vincent.home.discover.bean.SquareCard;

import androidx.databinding.DataBindingUtil;

/**
 * 应用模块:
 * <p>
 * 类描述: 专题adapter
 * <p>
 *
 * @author wangwenbo
 * @since 2020-02-15
 */
public class SubjectItemAdapter
    extends BaseQuickAdapter<SquareCard, BaseViewHolder>
{
    
    public SubjectItemAdapter(int layoutResId)
    {
        super(layoutResId);
    }
    
    @Override
    protected void onItemViewHolderCreated(@NotNull BaseViewHolder viewHolder,
        int viewType)
    {
        DataBindingUtil.bind(viewHolder.itemView);
    }
    
    @Override
    protected void convert(@NotNull BaseViewHolder baseViewHolder,
        @Nullable SquareCard squareCard)
    {
        if (squareCard == null)
        {
            return;
        }
        HomeItemCategoryItemSubjectCardViewBinding binding =
            baseViewHolder.getBinding();
        if (binding != null)
        {
            binding.setViewModel(squareCard);
            binding.executePendingBindings();
        }
    }
}
