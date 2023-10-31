package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.AbstractC8244j;
import com.google.crypto.tink.shaded.protobuf.AbstractC8308y;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.crypto.tink.shaded.protobuf.a0 */
/* loaded from: classes3.dex */
public final class C8196a0 {

    /* renamed from: a */
    public static final Charset f15949a = Charset.forName("UTF-8");

    /* renamed from: b */
    public static final byte[] f15950b;

    /* renamed from: com.google.crypto.tink.shaded.protobuf.a0$a */
    /* loaded from: classes3.dex */
    public interface InterfaceC8197a {
        int getNumber();
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.a0$b */
    /* loaded from: classes3.dex */
    public interface InterfaceC8198b {
        /* renamed from: a */
        boolean m3931a();
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.a0$c */
    /* loaded from: classes3.dex */
    public interface InterfaceC8199c<E> extends List<E>, RandomAccess {
        /* renamed from: c */
        void mo3922c();

        /* renamed from: d */
        InterfaceC8199c<E> mo3453d(int i);

        /* renamed from: h */
        boolean mo3921h();
    }

    static {
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f15950b = bArr;
        ByteBuffer.wrap(bArr);
        try {
            new AbstractC8244j.C8245a(bArr, 0, 0, false).mo3784g(0);
        } catch (C8202b0 e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: a */
    public static int m3934a(boolean z) {
        return z ? 1231 : 1237;
    }

    /* renamed from: b */
    public static int m3933b(long j) {
        return (int) (j ^ (j >>> 32));
    }

    /* renamed from: c */
    public static AbstractC8308y m3932c(Object obj, Object obj2) {
        AbstractC8308y.AbstractC8309a mo3475f = ((InterfaceC8287r0) obj).mo3475f();
        InterfaceC8287r0 interfaceC8287r0 = (InterfaceC8287r0) obj2;
        mo3475f.getClass();
        if (mo3475f.f16129a.getClass().isInstance(interfaceC8287r0)) {
            mo3475f.m3461k();
            AbstractC8308y.AbstractC8309a.m3460l(mo3475f.f16130b, (AbstractC8308y) ((AbstractC8194a) interfaceC8287r0));
            return mo3475f.m3462j();
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }
}
