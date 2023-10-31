package com.applovin.impl.mediation.debugger.p021ui.p022a;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.C3393R;

/* renamed from: com.applovin.impl.mediation.debugger.ui.a.d */
/* loaded from: classes.dex */
public class DialogC2934d extends Dialog {

    /* renamed from: a */
    private ViewGroup f7178a;

    /* renamed from: b */
    private AppLovinSdkUtils.Size f7179b;

    /* renamed from: c */
    private Activity f7180c;

    /* renamed from: d */
    private RelativeLayout f7181d;

    public DialogC2934d(ViewGroup viewGroup, AppLovinSdkUtils.Size size, Activity activity) {
        super(activity, 16973840);
        this.f7178a = viewGroup;
        this.f7179b = size;
        this.f7180c = activity;
        requestWindowFeature(1);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        this.f7181d.removeView(this.f7178a);
        super.dismiss();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(AppLovinSdkUtils.dpToPx(this.f7180c, this.f7179b.getWidth()), AppLovinSdkUtils.dpToPx(this.f7180c, this.f7179b.getHeight()));
        layoutParams.addRule(13);
        this.f7178a.setLayoutParams(layoutParams);
        int dpToPx = AppLovinSdkUtils.dpToPx(this.f7180c, 60);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(dpToPx, dpToPx);
        layoutParams2.addRule(14);
        layoutParams2.addRule(12);
        ImageButton imageButton = new ImageButton(this.f7180c);
        imageButton.setLayoutParams(layoutParams2);
        imageButton.setImageDrawable(this.f7180c.getResources().getDrawable(C3393R.C3395drawable.applovin_ic_x_mark));
        imageButton.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageButton.setColorFilter(-1);
        imageButton.setBackground(null);
        imageButton.setOnClickListener(new View.OnClickListener() { // from class: com.applovin.impl.mediation.debugger.ui.a.d.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                DialogC2934d.this.dismiss();
            }
        });
        RelativeLayout relativeLayout = new RelativeLayout(this.f7180c);
        this.f7181d = relativeLayout;
        relativeLayout.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        this.f7181d.setBackgroundColor(Integer.MIN_VALUE);
        this.f7181d.addView(imageButton);
        this.f7181d.addView(this.f7178a);
        this.f7181d.setOnClickListener(new View.OnClickListener() { // from class: com.applovin.impl.mediation.debugger.ui.a.d.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                DialogC2934d.this.dismiss();
            }
        });
        setContentView(this.f7181d);
    }
}
