package com.kongzue.dialogx.util;

import android.app.Activity;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import com.kongzue.dialogx.C8877a;
import com.kongzue.dialogx.interfaces.BaseDialog;
import com.kongzue.dialogx.style.C8941a;

/* renamed from: com.kongzue.dialogx.util.d */
/* loaded from: classes3.dex */
public final class C8946d {

    /* renamed from: com.kongzue.dialogx.util.d$a */
    /* loaded from: classes3.dex */
    public class View$OnTouchListenerC8947a implements View.OnTouchListener {

        /* renamed from: a */
        public final /* synthetic */ Activity f17053a;

        public View$OnTouchListenerC8947a(Activity activity) {
            this.f17053a = activity;
        }

        @Override // android.view.View.OnTouchListener
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            int size = BaseDialog.m2867o().size();
            while (true) {
                size--;
                Activity activity = this.f17053a;
                if (size < 0) {
                    return activity.dispatchTouchEvent(motionEvent);
                }
                BaseDialog baseDialog = BaseDialog.m2867o().get(size);
                if (baseDialog.m2871k() == activity) {
                    if (baseDialog.m2873i() == null) {
                        return false;
                    }
                    return baseDialog.m2871k().dispatchTouchEvent(motionEvent);
                }
            }
        }
    }

    /* renamed from: a */
    public static void m2846a(Activity activity, View view) {
        try {
            if (activity.getWindow().getDecorView().isAttachedToWindow()) {
                m2845b(activity, view, true);
            } else {
                activity.getWindow().getDecorView().post(new RunnableC8945c(activity, view));
            }
        } catch (Exception unused) {
            if (activity == null || activity.isDestroyed()) {
                return;
            }
            m2845b(activity, view, true);
        }
    }

    /* renamed from: b */
    public static void m2845b(Activity activity, View view, boolean z) {
        C8941a c8941a = C8877a.f16910a;
        FrameLayout frameLayout = new FrameLayout(activity);
        if (view.getParent() != null) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
        frameLayout.addView(view, new FrameLayout.LayoutParams(-1, -1));
        WindowManager windowManager = (WindowManager) activity.getSystemService("window");
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.gravity = 16;
        layoutParams.format = -2;
        layoutParams.type = 1003;
        layoutParams.flags = 201327872;
        layoutParams.softInputMode = 16;
        if (!z) {
            view.setOnTouchListener(new View$OnTouchListenerC8947a(activity));
        }
        if (Build.VERSION.SDK_INT >= 28) {
            layoutParams.layoutInDisplayCutoutMode = 1;
        }
        windowManager.addView(frameLayout, layoutParams);
    }
}
