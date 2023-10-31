package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.AbstractC1197k;
import androidx.datastore.preferences.protobuf.AbstractC1273z;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: androidx.datastore.preferences.protobuf.b0 */
/* loaded from: classes.dex */
public final class C1157b0 {

    /* renamed from: a */
    public static final Charset f2944a = Charset.forName("UTF-8");

    /* renamed from: b */
    public static final byte[] f2945b;

    /* renamed from: androidx.datastore.preferences.protobuf.b0$a */
    /* loaded from: classes.dex */
    public interface InterfaceC1158a {
        int getNumber();
    }

    /* renamed from: androidx.datastore.preferences.protobuf.b0$b */
    /* loaded from: classes.dex */
    public interface InterfaceC1159b {
        /* renamed from: a */
        boolean m11143a();
    }

    /* renamed from: androidx.datastore.preferences.protobuf.b0$c */
    /* loaded from: classes.dex */
    public interface InterfaceC1160c<E> extends List<E>, RandomAccess {
        /* renamed from: c */
        void mo11141c();

        /* renamed from: d */
        InterfaceC1160c<E> mo10720d(int i);

        /* renamed from: h */
        boolean mo11140h();
    }

    static {
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f2945b = bArr;
        ByteBuffer.wrap(bArr);
        try {
            new AbstractC1197k.C1198a(bArr, 0, 0, false).mo11037e(0);
        } catch (C1163c0 e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: a */
    public static int m11146a(boolean z) {
        return z ? 1231 : 1237;
    }

    /* renamed from: b */
    public static int m11145b(long j) {
        return (int) (j ^ (j >>> 32));
    }

    /* renamed from: c */
    public static AbstractC1273z m11144c(Object obj, Object obj2) {
        AbstractC1273z.AbstractC1274a mo10700d = ((InterfaceC1240s0) obj).mo10700d();
        InterfaceC1240s0 interfaceC1240s0 = (InterfaceC1240s0) obj2;
        mo10700d.getClass();
        if (mo10700d.f3141a.getClass().isInstance(interfaceC1240s0)) {
            mo10700d.m10703k((AbstractC1273z) ((AbstractC1152a) interfaceC1240s0));
            return mo10700d.m10705i();
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }
}
