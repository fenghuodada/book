package com.qmuiteam.qmui.util;

import android.os.Build;
import android.view.View;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import java.lang.reflect.Field;

/* renamed from: com.qmuiteam.qmui.util.k */
/* loaded from: classes3.dex */
public final class C9151k {
    /* renamed from: a */
    public static Object m2622a(@NonNull View view) {
        ViewParent parent;
        Object obj = null;
        if (Build.VERSION.SDK_INT > 28) {
            View rootView = view.getRootView();
            if (rootView != null && (parent = rootView.getParent()) != null) {
                Field declaredField = parent.getClass().getDeclaredField("mAttachInfo");
                declaredField.setAccessible(true);
                obj = declaredField.get(parent);
            }
            return obj;
        }
        Field declaredField2 = View.class.getDeclaredField("mAttachInfo");
        declaredField2.setAccessible(true);
        obj = declaredField2.get(view);
        return obj;
    }
}
