package com.kongzue.dialogx.dialogs;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.app.ActivityC0101d;
import androidx.constraintlayout.core.C0511i;
import androidx.fragment.app.FragmentManager;
import com.kongzue.dialogx.dialogs.C8897o;
import com.kongzue.dialogx.impl.C8917a;
import com.kongzue.dialogx.impl.C8920c;
import com.kongzue.dialogx.interfaces.BaseDialog;
import com.kongzue.dialogx.interfaces.C8928a;
import com.kongzue.dialogx.interfaces.RunnableC8930b;
import com.kongzue.dialogx.style.C8941a;
import com.kongzue.dialogx.util.ActivityC8943b;
import com.kongzue.dialogx.util.C8946d;
import com.kongzue.dialogx.util.InterfaceC8942a;
import com.qmuiteam.qmui.arch.AbstractActivityC9024f;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.kongzue.dialogx.dialogs.n */
/* loaded from: classes3.dex */
public final class RunnableC8896n implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Activity f16953a;

    /* renamed from: b */
    public final /* synthetic */ C8897o f16954b;

    public RunnableC8896n(C8897o c8897o, AbstractActivityC9024f abstractActivityC9024f) {
        this.f16954b = c8897o;
        this.f16953a = abstractActivityC9024f;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ActivityC8943b activityC8943b;
        int systemUiVisibility;
        StringBuilder sb;
        String str;
        C8897o c8897o = this.f16954b;
        c8897o.f17020i.getClass();
        C8941a c8941a = c8897o.f17020i;
        c8941a.getClass();
        c8897o.mo2862t();
        c8941a.getClass();
        c8897o.mo2862t();
        c8897o.f16963H = new WeakReference<>(new C8897o.C8899b());
        if (c8897o.m2904F() != null) {
            c8897o.m2904F().m2893c();
            if (c8897o.m2902H() != null) {
                c8897o.m2902H().setTag(c8897o);
                View m2902H = c8897o.m2902H();
                Activity activity = this.f16953a;
                if (activity != null && m2902H != null) {
                    WeakReference<Activity> weakReference = BaseDialog.f17007r;
                    if (weakReference == null || weakReference.get() == null || C8917a.m2889a() == null) {
                        BaseDialog.m2864r(activity.getApplicationContext());
                    }
                    BaseDialog baseDialog = (BaseDialog) m2902H.getTag();
                    if (baseDialog != null) {
                        if (baseDialog.m2873i() != null) {
                            baseDialog.m2873i().setVisibility(0);
                        }
                        if (baseDialog.f17019h) {
                            sb = new StringBuilder();
                            sb.append(((BaseDialog) m2902H.getTag()).mo2879c());
                            str = "已处于显示状态，请勿重复执行 show() 指令。";
                        } else if (activity.isDestroyed()) {
                            sb = new StringBuilder();
                            sb.append(((BaseDialog) m2902H.getTag()).mo2879c());
                            str = ".show ERROR: activity is Destroyed.";
                        } else {
                            baseDialog.f17013b = new WeakReference<>(m2902H);
                            int i = Build.VERSION.SDK_INT;
                            BaseDialog.m2859w(baseDialog.m2868n().getRootWindowInsets());
                            BaseDialog.m2860v(baseDialog + ".show");
                            if (BaseDialog.f17008s == null) {
                                BaseDialog.f17008s = new CopyOnWriteArrayList();
                            }
                            BaseDialog.f17008s.add(baseDialog);
                            int m12337b = C0511i.m12337b(baseDialog.f17015d);
                            boolean z = true;
                            if (m12337b != 1) {
                                FragmentManager fragmentManager = null;
                                InterfaceC8942a interfaceC8942a = null;
                                if (m12337b != 2) {
                                    if (m12337b != 3) {
                                        FrameLayout m2874h = BaseDialog.m2874h(activity);
                                        if (m2874h != null) {
                                            BaseDialog.m2856z(new RunnableC8930b(m2902H, baseDialog, m2874h));
                                            return;
                                        }
                                        return;
                                    }
                                    if (BaseDialog.f17009t == null) {
                                        BaseDialog.f17009t = new HashMap();
                                    }
                                    BaseDialog.f17009t.put(baseDialog.mo2879c(), new C8928a(m2902H, baseDialog));
                                    WeakReference<ActivityC8943b> weakReference2 = ActivityC8943b.f17045d;
                                    if (weakReference2 == null) {
                                        activityC8943b = null;
                                    } else {
                                        activityC8943b = weakReference2.get();
                                    }
                                    if (activityC8943b != null) {
                                        if (activity.hashCode() != activityC8943b.f17046a) {
                                            z = false;
                                        }
                                        if (z) {
                                            String mo2879c = baseDialog.mo2879c();
                                            if (mo2879c != null) {
                                                interfaceC8942a = (InterfaceC8942a) BaseDialog.f17009t.get(mo2879c);
                                            }
                                            if (interfaceC8942a != null) {
                                                activityC8943b.f17047b.add(mo2879c);
                                                interfaceC8942a.mo2849a(activityC8943b);
                                                return;
                                            }
                                            return;
                                        }
                                    }
                                    Intent intent = new Intent(activity, ActivityC8943b.class);
                                    intent.putExtra("dialogXKey", baseDialog.mo2879c());
                                    intent.putExtra("from", activity.hashCode());
                                    if (BaseDialog.m2874h(activity) == null) {
                                        systemUiVisibility = 0;
                                    } else {
                                        systemUiVisibility = BaseDialog.m2874h(activity).getSystemUiVisibility();
                                    }
                                    intent.putExtra("fromActivityUiStatus", systemUiVisibility);
                                    activity.startActivity(intent);
                                    if (Integer.valueOf(i).intValue() > 5) {
                                        activity.overridePendingTransition(0, 0);
                                        return;
                                    }
                                    return;
                                }
                                C8920c c8920c = new C8920c(m2902H, baseDialog);
                                if (activity instanceof ActivityC0101d) {
                                    fragmentManager = ((ActivityC0101d) activity).getSupportFragmentManager();
                                }
                                c8920c.show(fragmentManager, "DialogX");
                                baseDialog.f17014c = new WeakReference<>(c8920c);
                                return;
                            }
                            C8946d.m2846a(activity, m2902H);
                            return;
                        }
                        sb.append(str);
                        BaseDialog.m2877e(sb.toString());
                    }
                }
            }
        }
    }
}
