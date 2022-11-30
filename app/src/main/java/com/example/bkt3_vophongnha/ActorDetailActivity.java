package com.example.bkt3_vophongnha;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class ActorDetailActivity extends AppCompatActivity {

    Button ql;
    TextView ten, mota, sao;
    ImageView img;
    ListView lv_TacPham;

    TacPhamAdapter tacPhamAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actor_detail);
        Anhxa();

        //quay lại trang tác chính
        ql.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ActorDetailActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        Bundle bundle = getIntent().getExtras();
        Actor actor = (Actor) bundle.get("object");

        ten.setText("Tác giả: " + actor.getTen());
        mota.setText(actor.getMota());
        sao.setText("Đánh giá: " + actor.getSao() + " sao");
        img.setImageResource(actor.getHinhAnh());

        List<TacPham> list = new ArrayList<>();

        list.add(new TacPham("1","Suy nghĩ về nghệ thuật", "Nếu như lao động sáng tạo ra con người, thì lao động nghệ thuật sáng tạo ra con người nghệ sĩ… Người nghệ sĩ phải tự tạo luôn luôn thì mới sáng tạo được tác phẩm. Tự tạo bằng cách, tự nhào nặn mình trong cuộc sống, qua hành động, và cũng tự nhào nặn thường xuyên qua lao động nghệ thuật nữa. Chính lao động nghệ thuật ấy tiếp tục sáng tạo ra nội dung, sáng tạo ra tâm hồn. Không phải rằng lúc ta đến bàn viết, lúc ta vào xưởng vẽ là ta đã có sẵn, hoàn chỉnh, tác phẩm trong đầu và chỉ còn cái việc thể hiện ra bằng tay vẽ, tay viết.", 5));
        list.add(new TacPham("1","Suy nghĩ về nghệ thuật 2", "Nếu như lao động sáng tạo ra con người, thì lao động nghệ thuật sáng tạo ra con người nghệ sĩ… Người nghệ sĩ phải tự tạo luôn luôn thì mới sáng tạo được tác phẩm. Tự tạo bằng cách, tự nhào nặn mình trong cuộc sống, qua hành động, và cũng tự nhào nặn thường xuyên qua lao động nghệ thuật nữa. Chính lao động nghệ thuật ấy tiếp tục sáng tạo ra nội dung, sáng tạo ra tâm hồn. Không phải rằng lúc ta đến bàn viết, lúc ta vào xưởng vẽ là ta đã có sẵn, hoàn chỉnh, tác phẩm trong đầu và chỉ còn cái việc thể hiện ra bằng tay vẽ, tay viết.", 5));
        list.add(new TacPham("2","Suy nghĩ về nghệ thuật 4", "Nếu như lao động sáng tạo ra con người, thì lao động nghệ thuật sáng tạo ra con người nghệ sĩ… Người nghệ sĩ phải tự tạo luôn luôn thì mới sáng tạo được tác phẩm. Tự tạo bằng cách, tự nhào nặn mình trong cuộc sống, qua hành động, và cũng tự nhào nặn thường xuyên qua lao động nghệ thuật nữa. Chính lao động nghệ thuật ấy tiếp tục sáng tạo ra nội dung, sáng tạo ra tâm hồn. Không phải rằng lúc ta đến bàn viết, lúc ta vào xưởng vẽ là ta đã có sẵn, hoàn chỉnh, tác phẩm trong đầu và chỉ còn cái việc thể hiện ra bằng tay vẽ, tay viết.", 5));
        list.add(new TacPham("1","Suy nghĩ về nghệ thuật 3", "Nếu như lao động sáng tạo ra con người, thì lao động nghệ thuật sáng tạo ra con người nghệ sĩ… Người nghệ sĩ phải tự tạo luôn luôn thì mới sáng tạo được tác phẩm. Tự tạo bằng cách, tự nhào nặn mình trong cuộc sống, qua hành động, và cũng tự nhào nặn thường xuyên qua lao động nghệ thuật nữa. Chính lao động nghệ thuật ấy tiếp tục sáng tạo ra nội dung, sáng tạo ra tâm hồn. Không phải rằng lúc ta đến bàn viết, lúc ta vào xưởng vẽ là ta đã có sẵn, hoàn chỉnh, tác phẩm trong đầu và chỉ còn cái việc thể hiện ra bằng tay vẽ, tay viết.", 5));
        list.add(new TacPham("1","Suy nghĩ về nghệ thuật", "Nếu như lao động sáng tạo ra con người, thì lao động nghệ thuật sáng tạo ra con người nghệ sĩ… Người nghệ sĩ phải tự tạo luôn luôn thì mới sáng tạo được tác phẩm. Tự tạo bằng cách, tự nhào nặn mình trong cuộc sống, qua hành động, và cũng tự nhào nặn thường xuyên qua lao động nghệ thuật nữa. Chính lao động nghệ thuật ấy tiếp tục sáng tạo ra nội dung, sáng tạo ra tâm hồn. Không phải rằng lúc ta đến bàn viết, lúc ta vào xưởng vẽ là ta đã có sẵn, hoàn chỉnh, tác phẩm trong đầu và chỉ còn cái việc thể hiện ra bằng tay vẽ, tay viết.", 5));

        tacPhamAdapter = new TacPhamAdapter(this, list);

        lv_TacPham.setAdapter(tacPhamAdapter);
    }

    private void Anhxa() {
        ql = findViewById(R.id.btn_back);
        ten = findViewById(R.id.tv_ten);
        mota = findViewById(R.id.tv_mt);
        sao = findViewById(R.id.tv_sao);
        img = findViewById(R.id.img_actor);
        lv_TacPham = findViewById(R.id.lv_tacpham);
    }
}