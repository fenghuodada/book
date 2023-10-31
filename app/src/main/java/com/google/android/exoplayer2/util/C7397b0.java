package com.google.android.exoplayer2.util;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.annotation.Nullable;

/* renamed from: com.google.android.exoplayer2.util.b0 */
/* loaded from: classes.dex */
public final class C7397b0 implements InterfaceC7396b {
    @Override // com.google.android.exoplayer2.util.InterfaceC7396b
    /* renamed from: a */
    public final long mo5127a() {
        return SystemClock.uptimeMillis();
    }

    @Override // com.google.android.exoplayer2.util.InterfaceC7396b
    /* renamed from: b */
    public final C7399c0 mo5126b(Looper looper, @Nullable Handler.Callback callback) {
        return new C7399c0(new Handler(looper, callback));
    }

    @Override // com.google.android.exoplayer2.util.InterfaceC7396b
    /* renamed from: c */
    public final void mo5125c() {
    }

    @Override // com.google.android.exoplayer2.util.InterfaceC7396b
    public final long elapsedRealtime() {
        return SystemClock.elapsedRealtime();
    }
}
