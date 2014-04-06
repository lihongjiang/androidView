package com.example.wheel_demo1;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import com.example.wheel_demo1.wheel.NumericWheelAdapter;
import com.example.wheel_demo1.wheel.WheelView;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 14-4-6
 * Time: 下午2:48
 * To change this template use File | Settings | File Templates.
 */
public class MyDialog extends Dialog {
    public MyDialog(Context context) {
        super(context);

    }

    protected MyDialog(Context context, boolean cancelable, OnCancelListener cancelListener) {
        super(context, cancelable, cancelListener);
    }

    public MyDialog(Context context, int theme) {
        super(context, theme);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
      setContentView(R.layout.wheel_num);
        WheelView wheel = null;
        wheel = (WheelView) findViewById(R.id.wheel1);
        wheel.setAdapter(new NumericWheelAdapter(30, 300));
        wheel.setLabel("cm");
        wheel.setCurrentItem(100);
        WheelView wheel2 = null;
        wheel2 = (WheelView) findViewById(R.id.wheel2);
        wheel2.setAdapter(new NumericWheelAdapter(30, 300));
        wheel2.setLabel("cm");
        wheel2.setCurrentItem(100);
}
}
