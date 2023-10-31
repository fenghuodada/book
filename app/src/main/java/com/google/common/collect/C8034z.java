package com.google.common.collect;

/* renamed from: com.google.common.collect.z */
/* loaded from: classes3.dex */
public final class C8034z<T> extends AbstractC7947a<T> {

    /* renamed from: e */
    public static final C8034z f15843e = new C8034z(new Object[0]);

    /* renamed from: c */
    public final T[] f15844c;

    /* renamed from: d */
    public final int f15845d;

    /* JADX WARN: Multi-variable type inference failed */
    public C8034z(Object[] objArr) {
        super(0, 0);
        this.f15844c = objArr;
        this.f15845d = 0;
    }

    @Override // com.google.common.collect.AbstractC7947a
    /* renamed from: b */
    public final T mo4212b(int i) {
        return this.f15844c[this.f15845d + i];
    }
}
