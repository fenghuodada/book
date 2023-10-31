package androidx.transition;

import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.core.view.C0922g2;
import androidx.core.view.ViewCompat;
import java.util.WeakHashMap;

/* renamed from: androidx.transition.s */
/* loaded from: classes.dex */
public final class C1770s {

    /* renamed from: a */
    public static final C1740c0 f4286a;

    /* renamed from: b */
    public static final C1771a f4287b;

    /* renamed from: androidx.transition.s$a */
    /* loaded from: classes.dex */
    public static class C1771a extends Property<View, Float> {
        public C1771a() {
            super(Float.class, "translationAlpha");
        }

        @Override // android.util.Property
        public final Float get(View view) {
            return Float.valueOf(C1770s.f4286a.mo9953b(view));
        }

        @Override // android.util.Property
        public final void set(View view, Float f) {
            float floatValue = f.floatValue();
            C1770s.f4286a.mo9952c(floatValue, view);
        }
    }

    /* renamed from: androidx.transition.s$b */
    /* loaded from: classes.dex */
    public static class C1772b extends Property<View, Rect> {
        public C1772b() {
            super(Rect.class, "clipBounds");
        }

        @Override // android.util.Property
        public final Rect get(View view) {
            WeakHashMap<View, C0922g2> weakHashMap = ViewCompat.f2518a;
            return ViewCompat.C0816f.m11734a(view);
        }

        @Override // android.util.Property
        public final void set(View view, Rect rect) {
            WeakHashMap<View, C0922g2> weakHashMap = ViewCompat.f2518a;
            ViewCompat.C0816f.m11732c(view, rect);
        }
    }

    static {
        f4286a = Build.VERSION.SDK_INT >= 29 ? new C1743d0() : new C1740c0();
        f4287b = new C1771a();
        new C1772b();
    }

    /* renamed from: a */
    public static void m9956a(@NonNull View view, int i, int i2, int i3, int i4) {
        f4286a.mo9990f(view, i, i2, i3, i4);
    }
}
