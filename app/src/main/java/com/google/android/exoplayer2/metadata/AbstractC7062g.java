package com.google.android.exoplayer2.metadata;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.util.C7394a;
import java.nio.ByteBuffer;

/* renamed from: com.google.android.exoplayer2.metadata.g */
/* loaded from: classes.dex */
public abstract class AbstractC7062g implements InterfaceC7045b {
    @Override // com.google.android.exoplayer2.metadata.InterfaceC7045b
    @Nullable
    /* renamed from: a */
    public final C7042a mo5535a(C7048d c7048d) {
        boolean z;
        ByteBuffer byteBuffer = c7048d.f10904c;
        byteBuffer.getClass();
        if (byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0) {
            z = true;
        } else {
            z = false;
        }
        C7394a.m5134a(z);
        if (c7048d.m6017g()) {
            return null;
        }
        return mo5507b(c7048d, byteBuffer);
    }

    @Nullable
    /* renamed from: b */
    public abstract C7042a mo5507b(C7048d c7048d, ByteBuffer byteBuffer);
}
