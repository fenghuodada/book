package com.google.crypto.tink;

import androidx.cardview.C0463a;
import com.google.crypto.tink.proto.EnumC8153i0;
import com.google.crypto.tink.proto.EnumC8192z;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p060j$.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.crypto.tink.l */
/* loaded from: classes3.dex */
public final class C8097l<P> {

    /* renamed from: a */
    public final ConcurrentHashMap f15898a = new ConcurrentHashMap();

    /* renamed from: b */
    public C8098a<P> f15899b;

    /* renamed from: c */
    public final Class<P> f15900c;

    /* renamed from: com.google.crypto.tink.l$a */
    /* loaded from: classes3.dex */
    public static final class C8098a<P> {

        /* renamed from: a */
        public final P f15901a;

        /* renamed from: b */
        public final byte[] f15902b;

        /* renamed from: c */
        public final EnumC8192z f15903c;

        /* renamed from: d */
        public final EnumC8153i0 f15904d;

        /* JADX WARN: Multi-variable type inference failed */
        public C8098a(Object obj, byte[] bArr, EnumC8192z enumC8192z, EnumC8153i0 enumC8153i0) {
            this.f15901a = obj;
            this.f15902b = Arrays.copyOf(bArr, bArr.length);
            this.f15903c = enumC8192z;
            this.f15904d = enumC8153i0;
        }

        /* renamed from: a */
        public final byte[] m4180a() {
            byte[] bArr = this.f15902b;
            if (bArr == null) {
                return null;
            }
            return Arrays.copyOf(bArr, bArr.length);
        }
    }

    /* renamed from: com.google.crypto.tink.l$b */
    /* loaded from: classes3.dex */
    public static class C8099b implements Comparable<C8099b> {

        /* renamed from: a */
        public final byte[] f15905a;

        public C8099b(byte[] bArr) {
            this.f15905a = Arrays.copyOf(bArr, bArr.length);
        }

        @Override // java.lang.Comparable
        public final int compareTo(C8099b c8099b) {
            C8099b c8099b2 = c8099b;
            byte[] bArr = this.f15905a;
            int length = bArr.length;
            byte[] bArr2 = c8099b2.f15905a;
            if (length != bArr2.length) {
                return bArr.length - bArr2.length;
            }
            for (int i = 0; i < bArr.length; i++) {
                byte b = bArr[i];
                byte b2 = c8099b2.f15905a[i];
                if (b != b2) {
                    return b - b2;
                }
            }
            return 0;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof C8099b) {
                return Arrays.equals(this.f15905a, ((C8099b) obj).f15905a);
            }
            return false;
        }

        public final int hashCode() {
            return Arrays.hashCode(this.f15905a);
        }

        public final String toString() {
            return C0463a.m12438c(this.f15905a);
        }
    }

    public C8097l(Class<P> cls) {
        this.f15900c = cls;
    }

    /* renamed from: a */
    public final List<C8098a<P>> m4181a(byte[] bArr) {
        List<C8098a<P>> list = (List) this.f15898a.get(new C8099b(bArr));
        return list != null ? list : Collections.emptyList();
    }
}
