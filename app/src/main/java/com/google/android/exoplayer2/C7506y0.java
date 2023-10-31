package com.google.android.exoplayer2;

import androidx.annotation.Nullable;
import java.io.IOException;

/* renamed from: com.google.android.exoplayer2.y0 */
/* loaded from: classes.dex */
public class C7506y0 extends IOException {

    /* renamed from: a */
    public final boolean f14251a;

    /* renamed from: b */
    public final int f14252b;

    public C7506y0(@Nullable String str, @Nullable RuntimeException runtimeException, boolean z, int i) {
        super(str, runtimeException);
        this.f14251a = z;
        this.f14252b = i;
    }

    /* renamed from: a */
    public static C7506y0 m4869a(@Nullable String str, @Nullable RuntimeException runtimeException) {
        return new C7506y0(str, runtimeException, true, 1);
    }

    /* renamed from: b */
    public static C7506y0 m4868b(@Nullable String str) {
        return new C7506y0(str, null, false, 1);
    }
}
