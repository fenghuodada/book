package com.google.android.material.internal;

import android.graphics.PorterDuff;
import android.view.View;
import androidx.annotation.RestrictTo;
import androidx.core.view.C0922g2;
import androidx.core.view.ViewCompat;
import java.util.WeakHashMap;

@RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP})
/* renamed from: com.google.android.material.internal.q */
/* loaded from: classes3.dex */
public final class C7764q {

    /* renamed from: com.google.android.material.internal.q$a */
    /* loaded from: classes3.dex */
    public interface InterfaceC7765a {
    }

    /* renamed from: com.google.android.material.internal.q$b */
    /* loaded from: classes3.dex */
    public static class C7766b {

        /* renamed from: a */
        public final int f15126a;

        /* renamed from: b */
        public final int f15127b;

        /* renamed from: c */
        public final int f15128c;

        public C7766b(int i, int i2, int i3, int i4) {
            this.f15126a = i;
            this.f15127b = i3;
            this.f15128c = i4;
        }
    }

    /* renamed from: a */
    public static boolean m4505a(View view) {
        WeakHashMap<View, C0922g2> weakHashMap = ViewCompat.f2518a;
        if (ViewCompat.C0815e.m11742d(view) == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static PorterDuff.Mode m4504b(int i, PorterDuff.Mode mode) {
        if (i != 3) {
            if (i != 5) {
                if (i != 9) {
                    switch (i) {
                        case 14:
                            return PorterDuff.Mode.MULTIPLY;
                        case 15:
                            return PorterDuff.Mode.SCREEN;
                        case 16:
                            return PorterDuff.Mode.ADD;
                        default:
                            return mode;
                    }
                }
                return PorterDuff.Mode.SRC_ATOP;
            }
            return PorterDuff.Mode.SRC_IN;
        }
        return PorterDuff.Mode.SRC_OVER;
    }
}
