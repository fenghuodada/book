package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.AbstractC8194a;
import com.google.crypto.tink.shaded.protobuf.AbstractC8194a.AbstractC8195a;
import com.google.crypto.tink.shaded.protobuf.AbstractC8228i;
import com.google.crypto.tink.shaded.protobuf.AbstractC8253l;
import com.google.crypto.tink.shaded.protobuf.InterfaceC8287r0;
import java.io.IOException;
import java.util.logging.Logger;

/* renamed from: com.google.crypto.tink.shaded.protobuf.a */
/* loaded from: classes3.dex */
public abstract class AbstractC8194a<MessageType extends AbstractC8194a<MessageType, BuilderType>, BuilderType extends AbstractC8195a<MessageType, BuilderType>> implements InterfaceC8287r0 {
    protected int memoizedHashCode = 0;

    /* renamed from: com.google.crypto.tink.shaded.protobuf.a$a */
    /* loaded from: classes3.dex */
    public static abstract class AbstractC8195a<MessageType extends AbstractC8194a<MessageType, BuilderType>, BuilderType extends AbstractC8195a<MessageType, BuilderType>> implements InterfaceC8287r0.InterfaceC8288a {
    }

    /* renamed from: i */
    private String m3935i(String str) {
        return "Serializing " + getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC8287r0
    /* renamed from: b */
    public final AbstractC8228i.C8234f mo3557b() {
        try {
            AbstractC8308y abstractC8308y = (AbstractC8308y) this;
            int mo3478c = abstractC8308y.mo3478c();
            AbstractC8228i.C8234f c8234f = AbstractC8228i.f15998b;
            byte[] bArr = new byte[mo3478c];
            Logger logger = AbstractC8253l.f16040b;
            AbstractC8253l.C8254a c8254a = new AbstractC8253l.C8254a(bArr, mo3478c);
            abstractC8308y.mo3477d(c8254a);
            if (c8254a.m3678Q() == 0) {
                return new AbstractC8228i.C8234f(bArr);
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e) {
            throw new RuntimeException(m3935i("ByteString"), e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public int mo3476e() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC8287r0
    /* renamed from: g */
    public final byte[] mo3556g() {
        try {
            AbstractC8308y abstractC8308y = (AbstractC8308y) this;
            int mo3478c = abstractC8308y.mo3478c();
            byte[] bArr = new byte[mo3478c];
            Logger logger = AbstractC8253l.f16040b;
            AbstractC8253l.C8254a c8254a = new AbstractC8253l.C8254a(bArr, mo3478c);
            abstractC8308y.mo3477d(c8254a);
            if (c8254a.m3678Q() == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e) {
            throw new RuntimeException(m3935i("byte array"), e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo3473j(int i) {
        throw new UnsupportedOperationException();
    }
}
