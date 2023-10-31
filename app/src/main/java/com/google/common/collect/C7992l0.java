package com.google.common.collect;

import androidx.appcompat.view.menu.C0235r;
import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;

@GwtCompatible(emulated = true)
/* renamed from: com.google.common.collect.l0 */
/* loaded from: classes3.dex */
public final class C7992l0 {
    @CanIgnoreReturnValue
    /* renamed from: a */
    public static void m4258a(Object... objArr) {
        int length = objArr.length;
        for (int i = 0; i < length; i++) {
            if (objArr[i] == null) {
                throw new NullPointerException(C0235r.m12816a("at index ", i));
            }
        }
    }
}
