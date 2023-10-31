package com.bumptech.glide.load.resource.transcode;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.C3581i;
import com.bumptech.glide.load.engine.InterfaceC3573x;
import com.bumptech.glide.load.resource.bytes.C3739b;
import com.bumptech.glide.load.resource.gif.C3757c;
import com.bumptech.glide.util.C3846a;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.bumptech.glide.load.resource.transcode.d */
/* loaded from: classes.dex */
public final class C3774d implements InterfaceC3775e<C3757c, byte[]> {
    @Override // com.bumptech.glide.load.resource.transcode.InterfaceC3775e
    @Nullable
    /* renamed from: a */
    public final InterfaceC3573x<byte[]> mo6498a(@NonNull InterfaceC3573x<C3757c> interfaceC3573x, @NonNull C3581i c3581i) {
        C3846a.C3848b c3848b;
        byte[] bArr;
        ByteBuffer asReadOnlyBuffer = interfaceC3573x.get().f9743a.f9753a.f9755a.getData().asReadOnlyBuffer();
        AtomicReference<byte[]> atomicReference = C3846a.f9931a;
        if (!asReadOnlyBuffer.isReadOnly() && asReadOnlyBuffer.hasArray()) {
            c3848b = new C3846a.C3848b(asReadOnlyBuffer.array(), asReadOnlyBuffer.arrayOffset(), asReadOnlyBuffer.limit());
        } else {
            c3848b = null;
        }
        if (c3848b != null && c3848b.f9934a == 0) {
            if (c3848b.f9935b == c3848b.f9936c.length) {
                bArr = asReadOnlyBuffer.array();
                return new C3739b(bArr);
            }
        }
        ByteBuffer asReadOnlyBuffer2 = asReadOnlyBuffer.asReadOnlyBuffer();
        byte[] bArr2 = new byte[asReadOnlyBuffer2.limit()];
        asReadOnlyBuffer2.position(0);
        asReadOnlyBuffer2.get(bArr2);
        bArr = bArr2;
        return new C3739b(bArr);
    }
}
