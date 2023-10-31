package com.qmuiteam.qmui.util;

import android.annotation.TargetApi;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* renamed from: com.qmuiteam.qmui.util.h */
/* loaded from: classes3.dex */
public final class C9147h {

    /* renamed from: a */
    public static int f17582a;

    @TargetApi(23)
    /* renamed from: a */
    public static void m2632a(Window window, boolean z) {
        int i;
        View decorView = window.getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility();
        if (z) {
            i = systemUiVisibility | 8192;
        } else {
            i = systemUiVisibility & (-8193);
        }
        decorView.setSystemUiVisibility(i);
        if ("v9".equals(C9140a.f17574b)) {
            m2630c(window, z);
        }
    }

    /* renamed from: b */
    public static boolean m2631b(Window window, boolean z) {
        int i;
        boolean z2;
        if (window == null) {
            return false;
        }
        m2632a(window, z);
        if (C9140a.m2647a(7)) {
            try {
                WindowManager.LayoutParams attributes = window.getAttributes();
                Field declaredField = WindowManager.LayoutParams.class.getDeclaredField("MEIZU_FLAG_DARK_STATUS_BAR_ICON");
                Field declaredField2 = WindowManager.LayoutParams.class.getDeclaredField("meizuFlags");
                declaredField.setAccessible(true);
                declaredField2.setAccessible(true);
                int i2 = declaredField.getInt(null);
                int i3 = declaredField2.getInt(attributes);
                if (z) {
                    i = i3 | i2;
                } else {
                    i = (~i2) & i3;
                }
                declaredField2.setInt(attributes, i);
                window.setAttributes(attributes);
            } catch (Exception unused) {
                return false;
            }
        } else {
            String str = C9140a.f17575c;
            if (!TextUtils.isEmpty(str) && str.contains("flyme")) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: c */
    public static boolean m2630c(Window window, boolean z) {
        if (window != null) {
            Class<?> cls = window.getClass();
            try {
                Class<?> cls2 = Class.forName("android.view.MiuiWindowManager$LayoutParams");
                int i = cls2.getField("EXTRA_FLAG_STATUS_BAR_DARK_MODE").getInt(cls2);
                Class<?> cls3 = Integer.TYPE;
                Method method = cls.getMethod("setExtraFlags", cls3, cls3);
                if (z) {
                    method.invoke(window, Integer.valueOf(i), Integer.valueOf(i));
                } else {
                    method.invoke(window, 0, Integer.valueOf(i));
                }
                return true;
            } catch (Exception unused) {
                return false;
            }
        }
        return false;
    }
}
