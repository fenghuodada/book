package androidx.core.view;

import android.graphics.Rect;
import android.view.DisplayCutout;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.core.util.C0799c;
import java.util.List;

/* renamed from: androidx.core.view.i */
/* loaded from: classes.dex */
public final class C0930i {

    /* renamed from: a */
    public final DisplayCutout f2637a;

    @RequiresApi(28)
    /* renamed from: androidx.core.view.i$a */
    /* loaded from: classes.dex */
    public static class C0931a {
        @DoNotInline
        /* renamed from: a */
        public static DisplayCutout m11460a(Rect rect, List<Rect> list) {
            return new DisplayCutout(rect, list);
        }

        @DoNotInline
        /* renamed from: b */
        public static List<Rect> m11459b(DisplayCutout displayCutout) {
            List<Rect> boundingRects;
            boundingRects = displayCutout.getBoundingRects();
            return boundingRects;
        }

        @DoNotInline
        /* renamed from: c */
        public static int m11458c(DisplayCutout displayCutout) {
            int safeInsetBottom;
            safeInsetBottom = displayCutout.getSafeInsetBottom();
            return safeInsetBottom;
        }

        @DoNotInline
        /* renamed from: d */
        public static int m11457d(DisplayCutout displayCutout) {
            int safeInsetLeft;
            safeInsetLeft = displayCutout.getSafeInsetLeft();
            return safeInsetLeft;
        }

        @DoNotInline
        /* renamed from: e */
        public static int m11456e(DisplayCutout displayCutout) {
            int safeInsetRight;
            safeInsetRight = displayCutout.getSafeInsetRight();
            return safeInsetRight;
        }

        @DoNotInline
        /* renamed from: f */
        public static int m11455f(DisplayCutout displayCutout) {
            int safeInsetTop;
            safeInsetTop = displayCutout.getSafeInsetTop();
            return safeInsetTop;
        }
    }

    public C0930i(DisplayCutout displayCutout) {
        this.f2637a = displayCutout;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0930i.class == obj.getClass()) {
            return C0799c.m11795a(this.f2637a, ((C0930i) obj).f2637a);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        DisplayCutout displayCutout = this.f2637a;
        if (displayCutout == null) {
            return 0;
        }
        hashCode = displayCutout.hashCode();
        return hashCode;
    }

    @NonNull
    public final String toString() {
        return "DisplayCutoutCompat{" + this.f2637a + "}";
    }
}
