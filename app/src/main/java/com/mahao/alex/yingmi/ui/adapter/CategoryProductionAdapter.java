package com.mahao.alex.yingmi.ui.adapter;

import android.content.Intent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.mahao.alex.yingmi.R;
import com.mahao.alex.yingmi.bean.Production;
import com.mahao.alex.yingmi.ui.activity.ProducitonDetailActivity;
import com.mahao.alex.yingmi.utils.AppManager;
import com.mahao.alex.yingmi.utils.BitmapUtils;

import java.util.List;

/**
 * 分类 ---》电影
 * Created by mdw on 2016/4/26.
 */
public class CategoryProductionAdapter extends  BaseRecycleAdapter<Production> {

    public CategoryProductionAdapter(List<Production> data) {
        super(data);
    }

    @Override
    protected void bindData(BaseViewHolder holder, final int position) {
        BitmapUtils.loadImage((ImageView) holder.getView(R.id.item_horizontal_list_image),datas.get(position).getFileImagePath());
        ((TextView) holder.getView(R.id.item_horizontal_list_text)).setText(datas.get(position).getFileName());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AppManager.getAppManager().currentActivity(), ProducitonDetailActivity.class);

                intent.putExtra("production",datas.get(position));

                AppManager.getAppManager().currentActivity().startActivity(intent);
            }
        });
    }

    @Override
    public int getLayoutId() {
        return R.layout.item_category_list;
    }

}
