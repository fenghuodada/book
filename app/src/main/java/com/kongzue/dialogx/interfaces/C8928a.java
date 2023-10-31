package com.kongzue.dialogx.interfaces;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.kongzue.dialogx.util.ActivityC8943b;
import com.kongzue.dialogx.util.InterfaceC8942a;
import java.lang.ref.WeakReference;

/* renamed from: com.kongzue.dialogx.interfaces.a */
/* loaded from: classes3.dex */
public final class C8928a implements InterfaceC8942a {

    /* renamed from: a */
    public final /* synthetic */ BaseDialog f17037a;

    /* renamed from: b */
    public final /* synthetic */ View f17038b;

    /* renamed from: com.kongzue.dialogx.interfaces.a$a */
    /* loaded from: classes3.dex */
    public class RunnableC8929a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ FrameLayout f17039a;

        public RunnableC8929a(FrameLayout frameLayout) {
            this.f17039a = frameLayout;
        }

        @Override // java.lang.Runnable
        public final void run() {
            C8928a c8928a = C8928a.this;
            ViewParent parent = c8928a.f17038b.getParent();
            FrameLayout m2868n = c8928a.f17037a.m2868n();
            View view = c8928a.f17038b;
            if (parent != m2868n) {
                if (view.getParent() != null) {
                    ((ViewGroup) view.getParent()).removeView(view);
                }
                this.f17039a.addView(view);
                return;
            }
            BaseDialog.m2877e(((BaseDialog) view.getTag()).mo2879c() + "已处于显示状态，请勿重复执行 show() 指令。");
        }
    }

    public C8928a(View view, BaseDialog baseDialog) {
        this.f17037a = baseDialog;
        this.f17038b = view;
    }

    @Override // com.kongzue.dialogx.util.InterfaceC8942a
    /* renamed from: a */
    public final void mo2849a(Activity activity) {
        WeakReference<ActivityC8943b> weakReference = new WeakReference<>((ActivityC8943b) activity);
        BaseDialog baseDialog = this.f17037a;
        baseDialog.f17016e = weakReference;
        ActivityC8943b activityC8943b = weakReference.get();
        Activity m2871k = baseDialog.m2871k();
        activityC8943b.getClass();
        activityC8943b.f17048c = new WeakReference<>(m2871k);
        FrameLayout m2874h = BaseDialog.m2874h(activity);
        if (m2874h == null) {
            return;
        }
        BaseDialog.m2856z(new RunnableC8929a(m2874h));
    }
}
