package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
final class zzamp extends ThreadLocal {
    public zzamp(zzamq zzamqVar) {
    }

    @Override // java.lang.ThreadLocal
    public final /* synthetic */ Object initialValue() {
        return ByteBuffer.allocate(32);
    }
}
