package com.kongzue.dialogx.impl;

import android.app.Activity;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import com.kongzue.dialogx.C8877a;
import com.kongzue.dialogx.interfaces.BaseDialog;
import com.kongzue.dialogx.style.C8941a;
import java.lang.ref.WeakReference;
import java.util.Iterator;

/* renamed from: com.kongzue.dialogx.impl.c */
/* loaded from: classes3.dex */
public final class C8920c extends DialogFragment {

    /* renamed from: a */
    public final View f17001a;

    /* renamed from: b */
    public final BaseDialog f17002b;

    /* renamed from: c */
    public final WeakReference<Activity> f17003c;

    /* renamed from: com.kongzue.dialogx.impl.c$a */
    /* loaded from: classes3.dex */
    public class View$OnTouchListenerC8921a implements View.OnTouchListener {

        /* renamed from: a */
        public final /* synthetic */ Activity f17004a;

        public View$OnTouchListenerC8921a(Activity activity) {
            this.f17004a = activity;
        }

        @Override // android.view.View.OnTouchListener
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            Iterator<BaseDialog> it = BaseDialog.m2867o().iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                C8920c c8920c = C8920c.this;
                if (hasNext) {
                    BaseDialog next = it.next();
                    if (next.m2871k() == this.f17004a && next != c8920c.f17002b) {
                        next.m2873i().dispatchTouchEvent(motionEvent);
                        return true;
                    }
                } else {
                    BaseDialog baseDialog = c8920c.f17002b;
                    return true;
                }
            }
        }
    }

    public C8920c(View view, BaseDialog baseDialog) {
        this.f17003c = null;
        this.f17001a = view;
        this.f17002b = baseDialog;
        this.f17003c = new WeakReference<>(baseDialog.m2871k());
    }

    @Override // androidx.fragment.app.DialogFragment
    public final void dismiss() {
        dismissAllowingStateLoss();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        return this.f17001a;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        Window window;
        super.onStart();
        Activity activity = this.f17003c.get();
        if (getDialog() == null || (window = getDialog().getWindow()) == null) {
            return;
        }
        window.clearFlags(8);
        window.setSoftInputMode(16);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        attributes.dimAmount = 0.0f;
        attributes.format = -2;
        this.f17001a.setOnTouchListener(new View$OnTouchListenerC8921a(activity));
        window.setAttributes(attributes);
        window.addFlags(67108864);
        window.getDecorView().setPadding(0, 0, 0, 0);
        if (Build.VERSION.SDK_INT >= 28) {
            attributes.layoutInDisplayCutoutMode = 1;
        }
        window.setBackgroundDrawable(new ColorDrawable(0));
        window.getDecorView().setSystemUiVisibility((activity == null || (activity.getWindow().getDecorView().getSystemUiVisibility() & 8192) != 8192) ? 1280 : 9472);
        window.addFlags(-2013265920);
        window.setStatusBarColor(0);
        window.setNavigationBarColor(0);
    }

    @Override // androidx.fragment.app.DialogFragment
    public final void show(FragmentManager fragmentManager, @Nullable String str) {
        if (fragmentManager == null) {
            C8941a c8941a = C8877a.f16910a;
            Log.e(">>>", "DialogX.DialogFragment 模式无法支持非 AppCompatActivity 启动。".toString());
            return;
        }
        FragmentTransaction beginTransaction = fragmentManager.beginTransaction();
        beginTransaction.add(this, str);
        beginTransaction.commitAllowingStateLoss();
    }
}
