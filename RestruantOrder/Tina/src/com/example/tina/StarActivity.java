package com.example.tina;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class StarActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_star);
		// 闪屏的核心代码
		new Handler().postDelayed(new Runnable() {
			@Override
			public void run() {
				Intent intent = new Intent(StarActivity.this,
						MainActivity.class); // 从启动动画ui跳转到主ui
				startActivity(intent);
				finish(); // 结束启动动画界面
			}
		}, 3000); // 启动动画持续3秒钟
	}

}
