package com.google.common.base;

import androidx.appcompat.view.menu.C0235r;
import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.firebase.analytics.FirebaseAnalytics;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
/* renamed from: com.google.common.base.g */
/* loaded from: classes3.dex */
public final class C7938g {
    /* renamed from: a */
    public static String m4289a(int i, int i2, @NullableDecl String str) {
        if (i < 0) {
            return C7945l.m4284a("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return C7945l.m4284a("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        throw new IllegalArgumentException(C0235r.m12816a("negative size: ", i2));
    }

    @CanIgnoreReturnValue
    /* renamed from: b */
    public static void m4288b(int i, int i2) {
        String m4284a;
        if (i >= 0 && i < i2) {
            return;
        }
        if (i >= 0) {
            if (i2 >= 0) {
                m4284a = C7945l.m4284a("%s (%s) must be less than size (%s)", FirebaseAnalytics.Param.INDEX, Integer.valueOf(i), Integer.valueOf(i2));
            } else {
                throw new IllegalArgumentException(C0235r.m12816a("negative size: ", i2));
            }
        } else {
            m4284a = C7945l.m4284a("%s (%s) must not be negative", FirebaseAnalytics.Param.INDEX, Integer.valueOf(i));
        }
        throw new IndexOutOfBoundsException(m4284a);
    }

    @CanIgnoreReturnValue
    /* renamed from: c */
    public static void m4287c(int i, int i2) {
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(m4289a(i, i2, FirebaseAnalytics.Param.INDEX));
        }
    }

    /* renamed from: d */
    public static void m4286d(int i, int i2, int i3) {
        String m4289a;
        if (i >= 0 && i2 >= i && i2 <= i3) {
            return;
        }
        if (i >= 0 && i <= i3) {
            if (i2 >= 0 && i2 <= i3) {
                m4289a = C7945l.m4284a("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
            } else {
                m4289a = m4289a(i2, i3, "end index");
            }
        } else {
            m4289a = m4289a(i, i3, "start index");
        }
        throw new IndexOutOfBoundsException(m4289a);
    }
}
