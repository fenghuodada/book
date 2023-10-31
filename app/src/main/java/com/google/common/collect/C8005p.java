package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
/* renamed from: com.google.common.collect.p */
/* loaded from: classes3.dex */
public final class C8005p {
    /* renamed from: a */
    public static int m4251a(int i) {
        return (int) (Integer.rotateLeft((int) (i * (-862048943)), 15) * 461845907);
    }

    /* renamed from: b */
    public static int m4250b(@NullableDecl Object obj) {
        return m4251a(obj == null ? 0 : obj.hashCode());
    }
}
