package com.example.bkt3_vophongnha;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;

public class TacPhamAdapter extends BaseAdapter {
    private Context context;
    private List<TacPham> list;

    public TacPhamAdapter(Context context, List<TacPham> list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int i) {
        return list.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        TacPham user = list.get(i);
        if (view == null) {
            view = LayoutInflater.from(context).inflate(R.layout.item_tacpham, null);
        }
        TextView tvTP = view.findViewById(R.id.tv_tp);
        TextView tvSao = view.findViewById(R.id.tv_saotp);

        LinearLayout layout = view.findViewById(R.id.layout_tp);

        layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onClickDetail(user);
            }
        });

        tvTP.setText(user.getName());
        tvSao.setText("Đánh giá: " + user.getSao());

        return view;
    }

    private void onClickDetail(TacPham tp) {
        Intent intent = new Intent(context, TacPhamActivity.class);
        Bundle bundle = new Bundle();
//        bundle.putSerializable("object", tp);
        intent.putExtras(bundle);
        context.startActivity(intent);
    }
}
