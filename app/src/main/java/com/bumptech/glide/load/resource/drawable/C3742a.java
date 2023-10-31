package com.bumptech.glide.load.resource.drawable;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import androidx.annotation.DrawableRes;
import androidx.annotation.Nullable;
import androidx.appcompat.content.res.C0158a;
import androidx.appcompat.view.C0181c;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.C0676f;

/* renamed from: com.bumptech.glide.load.resource.drawable.a */
/* loaded from: classes.dex */
public final class C3742a {

    /* renamed from: a */
    public static volatile boolean f9722a = true;

    /* renamed from: a */
    public static Drawable m6520a(Context context, Context context2, @DrawableRes int i, @Nullable Resources.Theme theme) {
        Context context3;
        try {
            if (f9722a) {
                if (theme != null) {
                    context3 = new C0181c(context2, theme);
                } else {
                    context3 = context2;
                }
                return C0158a.m12920a(context3, i);
            }
        } catch (Resources.NotFoundException unused) {
        } catch (IllegalStateException e) {
            if (!context.getPackageName().equals(context2.getPackageName())) {
                Object obj = ContextCompat.f2323a;
                return ContextCompat.C0651c.m12032b(context2, i);
            }
            throw e;
        } catch (NoClassDefFoundError unused2) {
            f9722a = false;
        }
        if (theme == null) {
            theme = context2.getTheme();
        }
        Resources resources = context2.getResources();
        ThreadLocal<TypedValue> threadLocal = C0676f.f2356a;
        return C0676f.C0677a.m11986a(resources, i, theme);
    }
}
