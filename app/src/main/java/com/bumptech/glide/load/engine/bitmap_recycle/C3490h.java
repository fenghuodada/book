package com.bumptech.glide.load.engine.bitmap_recycle;

/* renamed from: com.bumptech.glide.load.engine.bitmap_recycle.h */
/* loaded from: classes.dex */
public final class C3490h implements InterfaceC3482a<int[]> {
    @Override // com.bumptech.glide.load.engine.bitmap_recycle.InterfaceC3482a
    /* renamed from: a */
    public final String mo6707a() {
        return "IntegerArrayPool";
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.InterfaceC3482a
    /* renamed from: b */
    public final int mo6706b() {
        return 4;
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.InterfaceC3482a
    /* renamed from: c */
    public final int mo6705c(int[] iArr) {
        return iArr.length;
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.InterfaceC3482a
    public final int[] newArray(int i) {
        return new int[i];
    }
}
