package com.kongzue.dialogx.interfaces;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.app.ActivityC0101d;
import androidx.constraintlayout.core.C0511i;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.AbstractC1464h;
import androidx.lifecycle.C1484n;
import androidx.lifecycle.InterfaceC1479k;
import androidx.lifecycle.InterfaceC1483m;
import com.ambrose.overwall.R;
import com.kongzue.dialogx.C8877a;
import com.kongzue.dialogx.impl.C8917a;
import com.kongzue.dialogx.impl.C8920c;
import com.kongzue.dialogx.style.C8941a;
import com.kongzue.dialogx.util.ActivityC8943b;
import com.kongzue.dialogx.util.C8946d;
import com.kongzue.dialogx.util.InterfaceC8942a;
import com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes3.dex */
public abstract class BaseDialog implements InterfaceC1483m {

    /* renamed from: q */
    public static Thread f17006q;

    /* renamed from: r */
    public static WeakReference<Activity> f17007r;

    /* renamed from: s */
    public static CopyOnWriteArrayList f17008s;

    /* renamed from: t */
    public static HashMap f17009t;

    /* renamed from: u */
    public static WindowInsets f17010u;

    /* renamed from: v */
    public static WeakReference<Handler> f17011v;

    /* renamed from: a */
    public WeakReference<Activity> f17012a;

    /* renamed from: b */
    public WeakReference<View> f17013b;

    /* renamed from: c */
    public WeakReference<C8920c> f17014c;

    /* renamed from: d */
    public final int f17015d;

    /* renamed from: e */
    public WeakReference<ActivityC8943b> f17016e;

    /* renamed from: f */
    public final C1484n f17017f;

    /* renamed from: g */
    public boolean f17018g;

    /* renamed from: h */
    public boolean f17019h;

    /* renamed from: i */
    public final C8941a f17020i;

    /* renamed from: j */
    public final int f17021j;

    /* renamed from: k */
    public final boolean f17022k;

    /* renamed from: l */
    public int f17023l;

    /* renamed from: m */
    public long f17024m;

    /* renamed from: n */
    public final long f17025n;

    /* renamed from: o */
    public final int[] f17026o;

    /* renamed from: p */
    public boolean f17027p;

    /* renamed from: com.kongzue.dialogx.interfaces.BaseDialog$a */
    /* loaded from: classes3.dex */
    public class C8923a implements C8917a.InterfaceC8918a {
    }

    /* renamed from: com.kongzue.dialogx.interfaces.BaseDialog$b */
    /* loaded from: classes3.dex */
    public class C8924b implements InterfaceC8942a {

        /* renamed from: a */
        public final /* synthetic */ BaseDialog f17029a;

        /* renamed from: b */
        public final /* synthetic */ View f17030b;

        /* renamed from: com.kongzue.dialogx.interfaces.BaseDialog$b$a */
        /* loaded from: classes3.dex */
        public class RunnableC8925a implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ FrameLayout f17031a;

            public RunnableC8925a(FrameLayout frameLayout) {
                this.f17031a = frameLayout;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C8924b c8924b = C8924b.this;
                ViewParent parent = c8924b.f17030b.getParent();
                FrameLayout m2868n = c8924b.f17029a.m2868n();
                View view = c8924b.f17030b;
                if (parent != m2868n) {
                    if (view.getParent() != null) {
                        ((ViewGroup) view.getParent()).removeView(view);
                    }
                    this.f17031a.addView(view);
                    return;
                }
                BaseDialog.m2877e(((BaseDialog) view.getTag()).mo2879c() + "已处于显示状态，请勿重复执行 show() 指令。");
            }
        }

        public C8924b(View view, BaseDialog baseDialog) {
            this.f17029a = baseDialog;
            this.f17030b = view;
        }

        @Override // com.kongzue.dialogx.util.InterfaceC8942a
        /* renamed from: a */
        public final void mo2849a(Activity activity) {
            WeakReference<ActivityC8943b> weakReference = new WeakReference<>((ActivityC8943b) activity);
            BaseDialog baseDialog = this.f17029a;
            baseDialog.f17016e = weakReference;
            ActivityC8943b activityC8943b = weakReference.get();
            Activity m2871k = baseDialog.m2871k();
            activityC8943b.getClass();
            activityC8943b.f17048c = new WeakReference<>(m2871k);
            FrameLayout m2874h = BaseDialog.m2874h(activity);
            if (m2874h == null) {
                return;
            }
            BaseDialog.m2856z(new RunnableC8925a(m2874h));
        }
    }

    /* renamed from: com.kongzue.dialogx.interfaces.BaseDialog$c */
    /* loaded from: classes3.dex */
    public class RunnableC8926c implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ View f17033a;

        /* renamed from: b */
        public final /* synthetic */ BaseDialog f17034b;

        public RunnableC8926c(View view, BaseDialog baseDialog) {
            this.f17033a = view;
            this.f17034b = baseDialog;
        }

        @Override // java.lang.Runnable
        public final void run() {
            View view = this.f17033a;
            ViewParent parent = view.getParent();
            BaseDialog baseDialog = this.f17034b;
            if (parent != baseDialog.m2868n()) {
                if (view.getParent() != null) {
                    ((ViewGroup) view.getParent()).removeView(view);
                }
                baseDialog.m2868n().addView(view);
                return;
            }
            BaseDialog.m2877e(((BaseDialog) view.getTag()).mo2879c() + "已处于显示状态，请勿重复执行 show() 指令。");
        }
    }

    /* renamed from: com.kongzue.dialogx.interfaces.BaseDialog$d */
    /* loaded from: classes3.dex */
    public class RunnableC8927d implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ View f17035a;

        /* renamed from: b */
        public final /* synthetic */ BaseDialog f17036b;

        public RunnableC8927d(View view, BaseDialog baseDialog) {
            this.f17035a = view;
            this.f17036b = baseDialog;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ViewGroup m2868n;
            View view = this.f17035a;
            if (view.getParent() != null && (view.getParent() instanceof ViewGroup)) {
                m2868n = (ViewGroup) view.getParent();
            } else {
                BaseDialog baseDialog = this.f17036b;
                if (baseDialog.m2868n() == null) {
                    return;
                }
                m2868n = baseDialog.m2868n();
            }
            m2868n.removeView(view);
            BaseDialog.m2857y();
        }
    }

    public BaseDialog() {
        C8941a c8941a = C8877a.f16910a;
        this.f17015d = 1;
        this.f17017f = new C1484n(this);
        this.f17023l = -1;
        this.f17024m = -1L;
        this.f17025n = -1L;
        this.f17026o = new int[4];
        this.f17018g = true;
        this.f17020i = C8877a.f16910a;
        this.f17021j = 1;
        this.f17024m = -1L;
        this.f17025n = -1L;
        this.f17022k = true;
    }

    /* renamed from: A */
    public static void m2885A(Runnable runnable, long j) {
        if (j < 0) {
            return;
        }
        C8941a c8941a = C8877a.f16910a;
        m2872j().postDelayed(runnable, j);
    }

    /* renamed from: C */
    public static void m2883C(View view) {
        BaseDialog baseDialog;
        ActivityC8943b activityC8943b;
        int i;
        if (view != null && (baseDialog = (BaseDialog) view.getTag()) != null) {
            if (baseDialog.f17019h) {
                if (baseDialog.m2873i() != null) {
                    baseDialog.m2873i().setVisibility(0);
                    return;
                }
                m2877e(((BaseDialog) view.getTag()).mo2879c() + "已处于显示状态，请勿重复执行 show() 指令。");
                return;
            }
            baseDialog.f17013b = new WeakReference<>(view);
            int i2 = Build.VERSION.SDK_INT;
            m2859w(baseDialog.m2868n().getRootWindowInsets());
            m2860v(baseDialog.mo2879c() + ".show");
            if (f17008s == null) {
                f17008s = new CopyOnWriteArrayList();
            }
            f17008s.add(baseDialog);
            int m12337b = C0511i.m12337b(baseDialog.f17015d);
            boolean z = true;
            if (m12337b != 1) {
                FragmentManager fragmentManager = null;
                InterfaceC8942a interfaceC8942a = null;
                if (m12337b != 2) {
                    if (m12337b != 3) {
                        if (baseDialog.m2868n() == null) {
                            return;
                        }
                        m2856z(new RunnableC8926c(view, baseDialog));
                        return;
                    }
                    if (f17009t == null) {
                        f17009t = new HashMap();
                    }
                    f17009t.put(baseDialog.mo2879c(), new C8924b(view, baseDialog));
                    WeakReference<ActivityC8943b> weakReference = ActivityC8943b.f17045d;
                    if (weakReference == null) {
                        activityC8943b = null;
                    } else {
                        activityC8943b = weakReference.get();
                    }
                    if (activityC8943b != null) {
                        if (baseDialog.m2871k().hashCode() != activityC8943b.f17046a) {
                            z = false;
                        }
                        if (z) {
                            String mo2879c = baseDialog.mo2879c();
                            if (mo2879c != null) {
                                interfaceC8942a = (InterfaceC8942a) f17009t.get(mo2879c);
                            }
                            if (interfaceC8942a != null) {
                                activityC8943b.f17047b.add(mo2879c);
                                interfaceC8942a.mo2849a(activityC8943b);
                                return;
                            }
                            return;
                        }
                    }
                    Intent intent = new Intent(m2870l(), ActivityC8943b.class);
                    if (baseDialog.m2871k() == null) {
                        intent.addFlags(268435456);
                    }
                    intent.putExtra("dialogXKey", baseDialog.mo2879c());
                    if (baseDialog.m2871k() == null || m2874h(baseDialog.m2871k()) == null) {
                        i = 0;
                    } else {
                        i = m2874h(baseDialog.m2871k()).getSystemUiVisibility();
                    }
                    intent.putExtra("fromActivityUiStatus", i);
                    intent.putExtra("from", m2870l().hashCode());
                    m2870l().startActivity(intent);
                    if (Integer.valueOf(i2).intValue() > 5 && baseDialog.m2871k() != null) {
                        baseDialog.m2871k().overridePendingTransition(0, 0);
                        return;
                    }
                    return;
                }
                C8920c c8920c = new C8920c(view, baseDialog);
                Activity m2871k = baseDialog.m2871k();
                if (m2871k instanceof ActivityC0101d) {
                    fragmentManager = ((ActivityC0101d) m2871k).getSupportFragmentManager();
                }
                c8920c.show(fragmentManager, "DialogX");
                baseDialog.f17014c = new WeakReference<>(c8920c);
                return;
            }
            C8946d.m2846a(baseDialog.m2871k(), view);
        }
    }

    /* renamed from: D */
    public static void m2882D(TextView textView, CharSequence charSequence) {
        if (textView == null) {
            return;
        }
        if (m2861u(charSequence)) {
            textView.setVisibility(8);
            charSequence = "";
        } else {
            textView.setVisibility(0);
        }
        textView.setText(charSequence);
    }

    /* renamed from: b */
    public static View m2880b(int i) {
        if (C8917a.m2889a() == null) {
            m2877e("DialogX 未初始化(E3)。\n请检查是否在启动对话框前进行初始化操作，使用以下代码进行初始化：\nDialogX.init(context);\n\n另外建议您前往查看 DialogX 的文档进行使用：https://github.com/kongzue/DialogX");
            return null;
        }
        return LayoutInflater.from(C8917a.m2889a()).inflate(i, (ViewGroup) null);
    }

    /* renamed from: d */
    public static void m2878d(View view) {
        if (view == null) {
            return;
        }
        BaseDialog baseDialog = (BaseDialog) view.getTag();
        m2860v(baseDialog.mo2879c() + ".dismiss");
        CopyOnWriteArrayList copyOnWriteArrayList = f17008s;
        if (copyOnWriteArrayList != null) {
            copyOnWriteArrayList.remove(baseDialog);
        }
        WeakReference<View> weakReference = baseDialog.f17013b;
        if (weakReference != null) {
            weakReference.clear();
        }
        int m12337b = C0511i.m12337b(baseDialog.f17015d);
        if (m12337b != 1) {
            if (m12337b != 2) {
                if (m12337b != 3) {
                    m2872j().post(new RunnableC8927d(view, baseDialog));
                    return;
                }
                WeakReference<ActivityC8943b> weakReference2 = baseDialog.f17016e;
                if (weakReference2 != null && weakReference2.get() != null) {
                    FrameLayout m2874h = m2874h(baseDialog.f17016e.get());
                    if (m2874h != null) {
                        m2874h.removeView(view);
                    }
                    baseDialog.f17016e.get().m2848n(baseDialog.mo2879c());
                    m2857y();
                    return;
                }
                return;
            }
            WeakReference<C8920c> weakReference3 = baseDialog.f17014c;
            if (weakReference3 != null && weakReference3.get() != null) {
                baseDialog.f17014c.get().dismissAllowingStateLoss();
                return;
            }
            return;
        }
        BaseDialog baseDialog2 = (BaseDialog) view.getTag();
        if (baseDialog2 != null && baseDialog2.m2871k() != null) {
            ((WindowManager) baseDialog2.m2871k().getSystemService("window")).removeViewImmediate((View) view.getParent());
        }
    }

    /* renamed from: e */
    public static void m2877e(String str) {
        C8941a c8941a = C8877a.f16910a;
        Log.e(">>>", str.toString());
    }

    /* renamed from: f */
    public static ArrayList m2876f(View view) {
        ArrayList arrayList = new ArrayList();
        if (view instanceof InterfaceC8931c) {
            arrayList.add(view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                ArrayList m2876f = m2876f(viewGroup.getChildAt(i));
                if (m2876f != null) {
                    arrayList.addAll(m2876f);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }

    /* renamed from: h */
    public static FrameLayout m2874h(Activity activity) {
        if (activity == null || activity.getWindow() == null || !(activity.getWindow().getDecorView() instanceof FrameLayout)) {
            return null;
        }
        return (FrameLayout) activity.getWindow().getDecorView();
    }

    /* renamed from: j */
    public static Handler m2872j() {
        WeakReference<Handler> weakReference;
        WeakReference<Handler> weakReference2 = f17011v;
        if (weakReference2 == null || weakReference2.get() == null) {
            weakReference = new WeakReference<>(new Handler(Looper.getMainLooper()));
            f17011v = weakReference;
        } else {
            weakReference = f17011v;
        }
        return weakReference.get();
    }

    /* renamed from: l */
    public static ContextWrapper m2870l() {
        Activity m2866p = m2866p();
        if (m2866p == null) {
            Application m2889a = C8917a.m2889a();
            if (m2889a == null) {
                m2877e("DialogX 未初始化(E2)。\n请检查是否在启动对话框前进行初始化操作，使用以下代码进行初始化：\nDialogX.init(context);\n\n另外建议您前往查看 DialogX 的文档进行使用：https://github.com/kongzue/DialogX");
                return null;
            }
            return m2889a;
        }
        return m2866p;
    }

    /* renamed from: o */
    public static List<BaseDialog> m2867o() {
        return f17008s == null ? new ArrayList() : new CopyOnWriteArrayList(f17008s);
    }

    /* renamed from: p */
    public static Activity m2866p() {
        WeakReference<Activity> weakReference = f17007r;
        if (weakReference == null || weakReference.get() == null) {
            m2864r(null);
            WeakReference<Activity> weakReference2 = f17007r;
            if (weakReference2 == null || weakReference2.get() == null) {
                Activity m2888b = C8917a.m2888b();
                m2864r(m2888b);
                return m2888b;
            }
            return f17007r.get();
        }
        return f17007r.get();
    }

    /* renamed from: r */
    public static void m2864r(Context context) {
        if (context == null) {
            context = C8917a.m2888b();
        }
        if (context instanceof Activity) {
            m2863s((Activity) context);
        }
        C8917a.m2887c(context, new C8923a());
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0021 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0022 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void m2863s(android.app.Activity r6) {
        /*
            if (r6 != 0) goto L3
            goto L1a
        L3:
            java.lang.String[] r0 = com.kongzue.dialogx.C8877a.f16911b
            int r1 = r0.length
            r2 = 0
            r3 = r2
        L8:
            if (r3 >= r1) goto L1f
            r4 = r0[r3]
            java.lang.Class r5 = r6.getClass()
            java.lang.String r5 = r5.getName()
            boolean r4 = r5.contains(r4)
            if (r4 == 0) goto L1c
        L1a:
            r2 = 1
            goto L1f
        L1c:
            int r3 = r3 + 1
            goto L8
        L1f:
            if (r2 == 0) goto L22
            return
        L22:
            android.os.Looper r0 = android.os.Looper.getMainLooper()     // Catch: java.lang.Exception -> L34
            java.lang.Thread r0 = r0.getThread()     // Catch: java.lang.Exception -> L34
            com.kongzue.dialogx.interfaces.BaseDialog.f17006q = r0     // Catch: java.lang.Exception -> L34
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference     // Catch: java.lang.Exception -> L34
            r0.<init>(r6)     // Catch: java.lang.Exception -> L34
            com.kongzue.dialogx.interfaces.BaseDialog.f17007r = r0     // Catch: java.lang.Exception -> L34
            goto L3d
        L34:
            r6 = move-exception
            r6.printStackTrace()
            java.lang.String r6 = "DialogX.init: 初始化异常，找不到Activity的根布局"
            m2877e(r6)
        L3d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kongzue.dialogx.interfaces.BaseDialog.m2863s(android.app.Activity):void");
    }

    /* renamed from: u */
    public static boolean m2861u(CharSequence charSequence) {
        String valueOf = String.valueOf(charSequence);
        return charSequence == null || valueOf.trim().isEmpty() || "null".equals(valueOf) || "(null)".equals(valueOf);
    }

    /* renamed from: v */
    public static void m2860v(String str) {
        C8941a c8941a = C8877a.f16910a;
        Log.i(">>>", str.toString());
    }

    /* renamed from: w */
    public static void m2859w(WindowInsets windowInsets) {
        if (windowInsets == null) {
            return;
        }
        f17010u = windowInsets;
        if (f17008s == null) {
            return;
        }
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList(f17008s);
        int size = copyOnWriteArrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            BaseDialog baseDialog = (BaseDialog) copyOnWriteArrayList.get(size);
            if (baseDialog.f17019h && baseDialog.m2873i() != null) {
                View findViewById = baseDialog.m2873i().findViewById(R.id.box_root);
                if (findViewById instanceof DialogXBaseRelativeLayout) {
                    ((DialogXBaseRelativeLayout) findViewById).m2840d(windowInsets);
                }
            }
        }
    }

    /* renamed from: x */
    public static void m2858x(Activity activity) {
        C8941a c8941a = C8877a.f16910a;
        if (f17008s != null) {
            Iterator it = new CopyOnWriteArrayList(f17008s).iterator();
            while (it.hasNext()) {
                BaseDialog baseDialog = (BaseDialog) it.next();
                if (baseDialog.m2871k() == activity) {
                    WeakReference<Activity> weakReference = baseDialog.f17012a;
                    if (weakReference != null) {
                        weakReference.clear();
                    }
                    baseDialog.f17012a = null;
                    f17008s.remove(baseDialog);
                }
            }
        }
        if (activity == m2866p()) {
            WeakReference<Activity> weakReference2 = f17007r;
            if (weakReference2 != null) {
                weakReference2.clear();
            }
            f17007r = null;
            System.gc();
        }
    }

    /* renamed from: y */
    public static void m2857y() {
        if (f17008s != null) {
            CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList(f17008s);
            int size = copyOnWriteArrayList.size();
            while (true) {
                size--;
                if (size >= 0) {
                    BaseDialog baseDialog = (BaseDialog) copyOnWriteArrayList.get(size);
                    if (baseDialog.m2871k() == m2866p() && baseDialog.f17019h && baseDialog.m2873i() != null) {
                        View findViewById = baseDialog.m2873i().findViewById(R.id.box_root);
                        if ((findViewById instanceof DialogXBaseRelativeLayout) && ((DialogXBaseRelativeLayout) findViewById).f17063c) {
                            findViewById.requestFocus();
                            return;
                        }
                    }
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: z */
    public static void m2856z(Runnable runnable) {
        C8941a c8941a = C8877a.f16910a;
        if (f17006q == null) {
            f17006q = Looper.getMainLooper().getThread();
        }
        if (f17006q != null) {
            Thread currentThread = Thread.currentThread();
            if (f17006q == null) {
                f17006q = Looper.getMainLooper().getThread();
            }
            if (currentThread == f17006q) {
                runnable.run();
                return;
            }
        }
        m2872j().post(runnable);
    }

    /* renamed from: B */
    public final void m2884B(AbstractC1464h.EnumC1468b enumC1468b) {
        C1484n c1484n = this.f17017f;
        if (c1484n != null) {
            try {
                c1484n.m10532h(enumC1468b);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public final void m2881a() {
        this.f17027p = false;
        this.f17012a = new WeakReference<>(m2866p());
        if (m2871k() == null) {
            m2864r(null);
            if (m2871k() == null) {
                m2877e("DialogX 未初始化(E5)。\n请检查是否在启动对话框前进行初始化操作，使用以下代码进行初始化：\nDialogX.init(context);\n\n另外建议您前往查看 DialogX 的文档进行使用：https://github.com/kongzue/DialogX");
                return;
            }
        }
        if (this.f17015d != 1 && (m2871k() instanceof InterfaceC1483m)) {
            ((InterfaceC1483m) m2871k()).getLifecycle().mo10539a(new InterfaceC1479k() { // from class: com.kongzue.dialogx.interfaces.BaseDialog.7
                @Override // androidx.lifecycle.InterfaceC1479k
                public final void onStateChanged(@NonNull InterfaceC1483m interfaceC1483m, @NonNull AbstractC1464h.EnumC1465a enumC1465a) {
                    if (enumC1465a == AbstractC1464h.EnumC1465a.ON_DESTROY) {
                        BaseDialog.m2858x(BaseDialog.this.m2871k());
                    }
                }
            });
        }
        View currentFocus = m2871k().getCurrentFocus();
        if (currentFocus != null) {
            ((InputMethodManager) m2871k().getSystemService("input_method")).hideSoftInputFromWindow(currentFocus.getWindowToken(), 2);
        }
    }

    /* renamed from: c */
    public abstract String mo2879c();

    /* renamed from: g */
    public final int m2875g(int i) {
        if (C8917a.m2889a() == null) {
            m2877e("DialogX 未初始化(E7)。\n请检查是否在启动对话框前进行初始化操作，使用以下代码进行初始化：\nDialogX.init(context);\n\n另外建议您前往查看 DialogX 的文档进行使用：https://github.com/kongzue/DialogX");
            return -16777216;
        }
        return m2869m().getColor(i);
    }

    @Override // androidx.lifecycle.InterfaceC1483m
    @NonNull
    public final AbstractC1464h getLifecycle() {
        return this.f17017f;
    }

    /* renamed from: i */
    public final View m2873i() {
        WeakReference<View> weakReference = this.f17013b;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    /* renamed from: k */
    public final Activity m2871k() {
        WeakReference<Activity> weakReference = this.f17012a;
        if (weakReference == null || weakReference.get() == null) {
            this.f17012a = new WeakReference<>(m2866p());
        }
        return this.f17012a.get();
    }

    /* renamed from: m */
    public final Resources m2869m() {
        if (C8917a.m2889a() == null) {
            return Resources.getSystem();
        }
        return C8917a.m2889a().getResources();
    }

    /* renamed from: n */
    public final FrameLayout m2868n() {
        String str;
        Activity m2871k = m2871k();
        if (m2871k == null) {
            m2871k = m2866p();
            if (m2871k == null) {
                str = "DialogX 错误：在 getRootFrameLayout() 时无法获取绑定的 activity，请确认是否正确初始化：\nDialogX.init(context);\n\n或者使用 .show(activity) 启动对话框\n另外建议您前往查看 DialogX 的文档进行使用：https://github.com/kongzue/DialogX";
                m2877e(str);
                return null;
            }
            this.f17012a = new WeakReference<>(m2871k);
        }
        FrameLayout m2874h = m2874h(m2871k);
        if (m2874h == null) {
            str = "DialogX 错误：在 getRootFrameLayout() 时无法获 activity(" + m2871k + ") 的 decorView，请检查该 activity 是否正常显示且可以使 DialogX 基于其显示。\n若该 activity 不可用，可通过以下代码配置豁免 DialogX 对话框绑定至该 activity，例如：\nDialogX.unsupportedActivitiesPackageNames = new String[]{\n        \"com.bytedance.sdk.openadsdk.stub.activity\",\n        \"com.mobile.auth.gatewayauth\",\n        \"com.google.android.gms.ads\"\n};\n\n另外建议您前往查看 DialogX 的文档进行使用：https://github.com/kongzue/DialogX";
            m2877e(str);
            return null;
        }
        return (FrameLayout) new WeakReference(m2874h).get();
    }

    /* renamed from: q */
    public final void m2865q(EditText editText, boolean z) {
        if (m2871k() == null) {
            return;
        }
        InputMethodManager inputMethodManager = (InputMethodManager) m2871k().getSystemService("input_method");
        if (z) {
            inputMethodManager.showSoftInput(editText, 0);
        } else {
            inputMethodManager.hideSoftInputFromWindow(editText.getWindowToken(), 0);
        }
    }

    /* renamed from: t */
    public boolean mo2862t() {
        int i = this.f17021j;
        if (i == 3) {
            if (C8917a.m2889a() == null) {
                if (i == 1) {
                    return true;
                }
                return false;
            } else if ((m2869m().getConfiguration().uiMode & 48) == 16) {
                return true;
            } else {
                return false;
            }
        } else if (i == 1) {
            return true;
        } else {
            return false;
        }
    }
}
