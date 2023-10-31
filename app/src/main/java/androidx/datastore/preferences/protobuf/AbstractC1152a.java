package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.AbstractC1152a;
import androidx.datastore.preferences.protobuf.AbstractC1152a.AbstractC1153a;
import androidx.datastore.preferences.protobuf.AbstractC1183i;
import androidx.datastore.preferences.protobuf.AbstractC1214m;
import androidx.datastore.preferences.protobuf.InterfaceC1240s0;
import java.io.IOException;
import java.util.logging.Logger;

/* renamed from: androidx.datastore.preferences.protobuf.a */
/* loaded from: classes.dex */
public abstract class AbstractC1152a<MessageType extends AbstractC1152a<MessageType, BuilderType>, BuilderType extends AbstractC1153a<MessageType, BuilderType>> implements InterfaceC1240s0 {
    protected int memoizedHashCode = 0;

    /* renamed from: androidx.datastore.preferences.protobuf.a$a */
    /* loaded from: classes.dex */
    public static abstract class AbstractC1153a<MessageType extends AbstractC1152a<MessageType, BuilderType>, BuilderType extends AbstractC1153a<MessageType, BuilderType>> implements InterfaceC1240s0.InterfaceC1241a {
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1240s0
    /* renamed from: b */
    public final AbstractC1183i.C1188e mo10837b() {
        try {
            AbstractC1273z abstractC1273z = (AbstractC1273z) this;
            int mo10715c = abstractC1273z.mo10715c();
            AbstractC1183i.C1188e c1188e = AbstractC1183i.f2982b;
            byte[] bArr = new byte[mo10715c];
            Logger logger = AbstractC1214m.f3045b;
            AbstractC1214m.C1216b c1216b = new AbstractC1214m.C1216b(bArr, mo10715c);
            abstractC1273z.mo10713f(c1216b);
            if (c1216b.f3052e - c1216b.f3053f == 0) {
                return new AbstractC1183i.C1188e(bArr);
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e) {
            throw new RuntimeException("Serializing " + getClass().getName() + " to a ByteString threw an IOException (should never happen).", e);
        }
    }

    /* renamed from: e */
    int mo10714e() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: h */
    public final int m11150h(InterfaceC1182h1 interfaceC1182h1) {
        int mo10714e = mo10714e();
        if (mo10714e == -1) {
            int mo10727e = interfaceC1182h1.mo10727e(this);
            mo10712i(mo10727e);
            return mo10727e;
        }
        return mo10714e;
    }

    /* renamed from: i */
    void mo10712i(int i) {
        throw new UnsupportedOperationException();
    }
}
