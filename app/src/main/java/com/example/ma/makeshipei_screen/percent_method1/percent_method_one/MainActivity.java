package com.example.ma.makeshipei_screen.percent_method1.percent_method_one;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.ma.makeshipei_screen.R;

public class MainActivity extends Activity {
Button btn_two;


//
//    layout_widthPercent、layout_heightPercent、
//    layout_marginPercent、layout_marginLeftPercent、
//    layout_marginTopPercent、layout_marginRightPercent、
//    layout_marginBottomPercent、layout_marginStartPercent、layout_marginEndPercent。
//

    //对应的是 FrameLayout的百分比布局

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        btn_two= (Button) findViewById(btn_dianwo);
//        TextView tv1= (TextView) findViewById(R.id.tv_data);
//
//        String imei=tools.getIMEI(this);
//        String imsi=tools.getIMSI(this);
//        Log.d("info","获取的型号是,,IMEI==="+imei+",,IMSI==="+imsi);
//        tv1.setText("IMEI==="+imei+",,IMSI==="+imsi);

        btn_two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,PercentRelativeLayout_Activity.class));
            }
        });
    }
}
