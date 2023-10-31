package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.io.PushbackInputStream;

/* loaded from: classes.dex */
final class zzawq extends PushbackInputStream {
    final /* synthetic */ zzawr zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzawq(zzawr zzawrVar, InputStream inputStream, int i) {
        super(inputStream, 1);
        this.zza = zzawrVar;
    }

    @Override // java.io.PushbackInputStream, java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() throws IOException {
        zzawt.zze(this.zza.zzc);
        super.close();
    }
}
