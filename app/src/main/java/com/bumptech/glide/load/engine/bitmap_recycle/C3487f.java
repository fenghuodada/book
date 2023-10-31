package com.bumptech.glide.load.engine.bitmap_recycle;

/* renamed from: com.bumptech.glide.load.engine.bitmap_recycle.f */
/* loaded from: classes.dex */
public final class C3487f implements InterfaceC3482a<byte[]> {
    @Override // com.bumptech.glide.load.engine.bitmap_recycle.InterfaceC3482a
    /* renamed from: a */
    public final String mo6707a() {
        return "ByteArrayPool";
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.InterfaceC3482a
    /* renamed from: b */
    public final int mo6706b() {
        return 1;
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.InterfaceC3482a
    /* renamed from: c */
    public final int mo6705c(byte[] bArr) {
        return bArr.length;
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.InterfaceC3482a
    public final byte[] newArray(int i) {
        return new byte[i];
    }
}
