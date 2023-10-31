package androidx.core.widget;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.EdgeEffect;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

/* renamed from: androidx.core.widget.d */
/* loaded from: classes.dex */
public final class C1047d {

    @RequiresApi(21)
    /* renamed from: androidx.core.widget.d$a */
    /* loaded from: classes.dex */
    public static class C1048a {
        @DoNotInline
        /* renamed from: a */
        public static void m11261a(EdgeEffect edgeEffect, float f, float f2) {
            edgeEffect.onPull(f, f2);
        }
    }

    @RequiresApi(31)
    /* renamed from: androidx.core.widget.d$b */
    /* loaded from: classes.dex */
    public static class C1049b {
        @DoNotInline
        /* renamed from: a */
        public static EdgeEffect m11260a(Context context, AttributeSet attributeSet) {
            try {
                return new EdgeEffect(context, attributeSet);
            } catch (Throwable unused) {
                return new EdgeEffect(context);
            }
        }

        @DoNotInline
        /* renamed from: b */
        public static float m11259b(EdgeEffect edgeEffect) {
            float distance;
            try {
                distance = edgeEffect.getDistance();
                return distance;
            } catch (Throwable unused) {
                return 0.0f;
            }
        }

        @DoNotInline
        /* renamed from: c */
        public static float m11258c(EdgeEffect edgeEffect, float f, float f2) {
            float onPullDistance;
            try {
                onPullDistance = edgeEffect.onPullDistance(f, f2);
                return onPullDistance;
            } catch (Throwable unused) {
                edgeEffect.onPull(f, f2);
                return 0.0f;
            }
        }
    }

    /* renamed from: a */
    public static float m11263a(@NonNull EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return C1049b.m11259b(edgeEffect);
        }
        return 0.0f;
    }

    /* renamed from: b */
    public static float m11262b(@NonNull EdgeEffect edgeEffect, float f, float f2) {
        if (Build.VERSION.SDK_INT >= 31) {
            return C1049b.m11258c(edgeEffect, f, f2);
        }
        C1048a.m11261a(edgeEffect, f, f2);
        return f;
    }
}
