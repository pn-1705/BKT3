package com.example.bkt3_vophongnha;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ActorAdapter actorAdapter;
    ListView lv_Actor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Actor> list = new ArrayList<>();

        list.add(new Actor("1", "Huy Cận", "Cù Huy Cận (1919 – 2005), bút danh hoạt động nghệ thuật là Huy Cận, là một chính khách, từng giữ nhiều chức vụ lãnh đạo cao cấp trong chính phủ Việt Nam như Bộ trưởng Bộ Canh nông (nay là Bộ Nông nghiệp và Phát triển nông thôn)", R.drawable.huycan, 5));
        list.add(new Actor("2", "Mạc Ngôn", "Mạc Ngôn (sinh ngày 17 tháng 2 năm 1955) là một nhà văn người Trung Quốc xuất thân từ nông dân. Ông đã từng được thế giới biết đến với tác phẩm Cao lương đỏ đã được đạo diễn nổi tiếng Trương Nghệ Mưu chuyển thể thành phim", R.drawable.macngon, 5));
        list.add(new Actor("3", "Hemingway", "Ernest Miller Hemingway (21 tháng 7 năm 1899 – 2 tháng 7 năm 1961) là một tiểu thuyết gia người Mỹ, nhà văn viết truyện ngắn và là một nhà báo", R.drawable.h, 5));
        list.add(new Actor("4", "Shakespeare", "William Shakespeare (tên phiên âm: Uy-li-am Sếch-xpia; không rõ ngày sinh của ông, nhưng theo truyền thống được ghi nhận là vào ngày 23 tháng 4 năm 1564, ngày thánh George; mất ngày 23 tháng 4 năm 1616 theo lịch Julius hoặc ngày 3 tháng 5 năm 1616 theo lịch Gregorius) là một nhà văn và nhà viết kịch Anh", R.drawable.sk, 5));
        list.add(new Actor("5", "Tố Hữu", "Tố Hữu, tên thật là Nguyễn Kim Thành (4 tháng 10 năm 1920 – 9 tháng 12 năm 2002) quê gốc ở làng Phù Lai, nay thuộc xã Quảng Thọ, huyện Quảng Điền, tỉnh Thừa Thiên Huế", R.drawable.tohuu, 5));

        lv_Actor = findViewById(R.id.lv_Tacgia);

        actorAdapter = new ActorAdapter(this, list);

        lv_Actor.setAdapter(actorAdapter);
    }
}