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

public class ActorAdapter extends BaseAdapter {
    private Context context;
    private List<Actor> list;

    public ActorAdapter(Context context, List<Actor> list) {
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
        Actor user = list.get(i);
        if (view == null) {
            view = LayoutInflater.from(context).inflate(R.layout.item_actor, null);
        }
        TextView tvName = view.findViewById(R.id.tv_name);
        TextView tvMota = view.findViewById(R.id.tv_mota);
        TextView tvSao = view.findViewById(R.id.tv_sao);
        ImageView anh = view.findViewById(R.id.img);
        LinearLayout layout = view.findViewById(R.id.actor_layout);

        layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onClickDetail(user);
            }
        });

        tvName.setText(user.getTen());
        tvMota.setText(user.getMota());
        tvSao.setText("" + user.getSao());
        anh.setImageResource(user.getHinhAnh());
        return view;
    }
    private void onClickDetail(Actor user) {
        Intent intent = new Intent(context, ActorDetailActivity.class);
        Bundle bundle = new Bundle();
        bundle.putSerializable("object", user);
        intent.putExtras(bundle);
        context.startActivity(intent);
    }
}
