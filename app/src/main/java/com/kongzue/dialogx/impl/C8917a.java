package com.kongzue.dialogx.impl;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.util.ArrayMap;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.kongzue.dialogx.C8877a;
import com.kongzue.dialogx.interfaces.BaseDialog;
import com.kongzue.dialogx.style.C8941a;
import com.kongzue.dialogx.util.ActivityC8943b;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;

/* renamed from: com.kongzue.dialogx.impl.a */
/* loaded from: classes3.dex */
public final class C8917a implements Application.ActivityLifecycleCallbacks {

    /* renamed from: b */
    public static C8917a f16998b;

    /* renamed from: c */
    public static Application f16999c;

    /* renamed from: a */
    public final InterfaceC8918a f17000a;

    /* renamed from: com.kongzue.dialogx.impl.a$a */
    /* loaded from: classes3.dex */
    public interface InterfaceC8918a {
    }

    public C8917a(BaseDialog.C8923a c8923a) {
        this.f17000a = c8923a;
    }

    /* renamed from: a */
    public static Application m2889a() {
        Application application = f16999c;
        if (application != null) {
            return application;
        }
        try {
            try {
                try {
                    return (Application) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null);
                } catch (Exception unused) {
                    return null;
                }
            } catch (Exception unused2) {
                Class<?> cls = Class.forName("android.app.ActivityThread");
                return (Application) cls.getDeclaredMethod("getApplication", new Class[0]).invoke(cls.getDeclaredMethod("currentActivityThread", new Class[0]).invoke(null, new Object[0]), new Object[0]);
            }
        } catch (Exception unused3) {
            return (Application) Class.forName("android.app.AppGlobals").getMethod("getInitialApplication", new Class[0]).invoke(null, null);
        }
    }

    /* renamed from: b */
    public static Activity m2888b() {
        ArrayMap arrayMap;
        try {
            Class<?> cls = Class.forName("android.app.ActivityThread");
            Object invoke = cls.getMethod("currentActivityThread", new Class[0]).invoke(null, new Object[0]);
            Field declaredField = cls.getDeclaredField("mActivities");
            declaredField.setAccessible(true);
            arrayMap = (ArrayMap) declaredField.get(invoke);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (arrayMap.size() < 1) {
            return null;
        }
        for (Object obj : arrayMap.values()) {
            Class<?> cls2 = obj.getClass();
            Field declaredField2 = cls2.getDeclaredField("paused");
            declaredField2.setAccessible(true);
            if (!declaredField2.getBoolean(obj)) {
                Field declaredField3 = cls2.getDeclaredField("activity");
                declaredField3.setAccessible(true);
                return (Activity) declaredField3.get(obj);
            }
        }
        return null;
    }

    /* renamed from: c */
    public static void m2887c(Context context, BaseDialog.C8923a c8923a) {
        if (context != null) {
            Application application = (Application) context.getApplicationContext();
            if (application == null) {
                C8941a c8941a = C8877a.f16910a;
                Log.e(">>>", "DialogX 未初始化(E1)。\n请检查是否在启动对话框前进行初始化操作，使用以下代码进行初始化：\nDialogX.init(context);\n\n另外建议您前往查看 DialogX 的文档进行使用：https://github.com/kongzue/DialogX".toString());
                return;
            }
            f16999c = application;
            C8917a c8917a = f16998b;
            if (c8917a != null) {
                application.unregisterActivityLifecycleCallbacks(c8917a);
            }
            C8917a c8917a2 = new C8917a(c8923a);
            f16998b = c8917a2;
            application.registerActivityLifecycleCallbacks(c8917a2);
            return;
        }
        Application application2 = f16999c;
        if (application2 != null) {
            m2887c(application2, c8923a);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(@NonNull Activity activity, @Nullable Bundle bundle) {
        InterfaceC8918a interfaceC8918a = this.f17000a;
        if (interfaceC8918a == null || (activity instanceof ActivityC8943b)) {
            return;
        }
        ((BaseDialog.C8923a) interfaceC8918a).getClass();
        BaseDialog.m2863s(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(@NonNull Activity activity) {
        if (BaseDialog.m2866p() == activity) {
            WeakReference<Activity> weakReference = BaseDialog.f17007r;
            if (weakReference != null) {
                weakReference.clear();
            }
            BaseDialog.f17007r = null;
            System.gc();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(@NonNull Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPreDestroyed(@NonNull Activity activity) {
        BaseDialog.m2858x(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPreResumed(@NonNull Activity activity) {
        InterfaceC8918a interfaceC8918a;
        super.onActivityPreResumed(activity);
        if (!activity.isDestroyed() && !activity.isFinishing() && !(activity instanceof ActivityC8943b) && (interfaceC8918a = this.f17000a) != null) {
            ((BaseDialog.C8923a) interfaceC8918a).getClass();
            BaseDialog.m2863s(activity);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0066, code lost:
        r5 = r2.getRootWindowInsets().getStableInsets();
     */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onActivityResumed(@androidx.annotation.NonNull android.app.Activity r5) {
        /*
            r4 = this;
            boolean r0 = r5.isDestroyed()
            if (r0 != 0) goto L95
            boolean r0 = r5.isFinishing()
            if (r0 != 0) goto L95
            boolean r0 = r5 instanceof com.kongzue.dialogx.util.ActivityC8943b
            if (r0 == 0) goto L12
            goto L95
        L12:
            java.util.concurrent.CopyOnWriteArrayList r0 = com.kongzue.dialogx.interfaces.BaseDialog.f17008s
            if (r0 == 0) goto L95
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            java.util.concurrent.CopyOnWriteArrayList r1 = com.kongzue.dialogx.interfaces.BaseDialog.f17008s
            r0.<init>(r1)
            int r1 = r0.size()
        L21:
            int r1 = r1 + (-1)
            if (r1 < 0) goto L95
            java.lang.Object r2 = r0.get(r1)
            com.kongzue.dialogx.interfaces.BaseDialog r2 = (com.kongzue.dialogx.interfaces.BaseDialog) r2
            android.app.Activity r3 = r2.m2871k()
            if (r3 != r5) goto L21
            boolean r3 = r2.f17019h
            if (r3 == 0) goto L21
            android.view.View r3 = r2.m2873i()
            if (r3 == 0) goto L21
            android.view.View r2 = r2.m2873i()
            r3 = 2131361934(0x7f0a008e, float:1.8343634E38)
            android.view.View r2 = r2.findViewById(r3)
            boolean r3 = r2 instanceof com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout
            if (r3 == 0) goto L21
            com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r2 = (com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout) r2
            boolean r3 = r2.f17063c
            if (r3 == 0) goto L21
            int r5 = android.os.Build.VERSION.SDK_INT
            r0 = 29
            if (r5 < r0) goto L83
            android.view.WindowInsets r5 = r2.getRootWindowInsets()
            if (r5 == 0) goto L83
            android.view.WindowInsets r5 = r2.getRootWindowInsets()
            android.graphics.Insets r5 = androidx.appcompat.widget.C0421v0.m12488b(r5)
            if (r5 == 0) goto L83
            android.view.WindowInsets r5 = r2.getRootWindowInsets()
            android.graphics.Insets r5 = androidx.appcompat.widget.C0421v0.m12488b(r5)
            if (r5 == 0) goto L83
            int r0 = androidx.appcompat.widget.C0415t0.m12497a(r5)
            int r1 = androidx.appcompat.widget.C0418u0.m12493a(r5)
            int r3 = androidx.appcompat.widget.C0421v0.m12489a(r5)
            int r5 = androidx.appcompat.widget.C0424w0.m12484a(r5)
            r2.m2841c(r0, r1, r3, r5)
        L83:
            r2.m2842b()
            android.view.View r5 = r2.findFocus()
            if (r5 == 0) goto L92
            if (r5 == r2) goto L92
            r5.requestFocus()
            goto L95
        L92:
            r2.requestFocus()
        L95:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kongzue.dialogx.impl.C8917a.onActivityResumed(android.app.Activity):void");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(@NonNull Activity activity, @NonNull Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(@NonNull Activity activity) {
        if (f16999c == null) {
            BaseDialog.m2864r(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(@NonNull Activity activity) {
    }
}
