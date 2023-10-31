package com.google.android.exoplayer2.upstream;

import androidx.annotation.Nullable;
import java.io.IOException;

/* renamed from: com.google.android.exoplayer2.upstream.j */
/* loaded from: classes.dex */
public class C7365j extends IOException {

    /* renamed from: a */
    public final int f13771a;

    public C7365j(int i) {
        this.f13771a = i;
    }

    public C7365j(@Nullable String str, int i) {
        super(str);
        this.f13771a = i;
    }

    public C7365j(@Nullable String str, @Nullable Throwable th, int i) {
        super(str, th);
        this.f13771a = i;
    }

    public C7365j(@Nullable Throwable th, int i) {
        super(th);
        this.f13771a = i;
    }
}
