package com.google.crypto.tink.aead;

import com.google.crypto.tink.AbstractC8082f;
import com.google.crypto.tink.C8074d;
import com.google.crypto.tink.C8112p;
import com.google.crypto.tink.InterfaceC8038a;
import com.google.crypto.tink.proto.C8117a0;
import com.google.crypto.tink.shaded.protobuf.AbstractC8228i;
import com.google.crypto.tink.shaded.protobuf.C8202b0;
import com.google.crypto.tink.shaded.protobuf.InterfaceC8287r0;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.logging.Logger;

/* renamed from: com.google.crypto.tink.aead.j */
/* loaded from: classes3.dex */
public final class C8063j implements InterfaceC8038a {

    /* renamed from: c */
    public static final byte[] f15858c = new byte[0];

    /* renamed from: a */
    public final C8117a0 f15859a;

    /* renamed from: b */
    public final InterfaceC8038a f15860b;

    public C8063j(C8117a0 c8117a0, InterfaceC8038a interfaceC8038a) {
        this.f15859a = c8117a0;
        this.f15860b = interfaceC8038a;
    }

    @Override // com.google.crypto.tink.InterfaceC8038a
    /* renamed from: a */
    public final byte[] mo3428a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        InterfaceC8287r0 interfaceC8287r0;
        C8117a0 c8117a0 = this.f15859a;
        Logger logger = C8112p.f15912a;
        synchronized (C8112p.class) {
            C8074d mo4157b = C8112p.m4163b(c8117a0.m4138y()).mo4157b();
            if (((Boolean) C8112p.f15915d.get(c8117a0.m4138y())).booleanValue()) {
                AbstractC8228i m4137z = c8117a0.m4137z();
                mo4157b.getClass();
                try {
                    AbstractC8082f.AbstractC8083a mo4177c = mo4157b.f15866a.mo4177c();
                    InterfaceC8287r0 mo4169b = mo4177c.mo4169b(m4137z);
                    mo4177c.mo4168c(mo4169b);
                    interfaceC8287r0 = (InterfaceC8287r0) mo4177c.mo4170a(mo4169b);
                } catch (C8202b0 e) {
                    throw new GeneralSecurityException("Failures parsing proto of type ".concat(mo4157b.f15866a.mo4177c().f15876a.getName()), e);
                }
            } else {
                throw new GeneralSecurityException("newKey-operation not permitted for key type " + c8117a0.m4138y());
            }
        }
        byte[] mo3556g = interfaceC8287r0.mo3556g();
        byte[] mo3428a = this.f15860b.mo3428a(mo3556g, f15858c);
        String m4138y = this.f15859a.m4138y();
        AbstractC8228i.C8234f c8234f = AbstractC8228i.f15998b;
        byte[] mo3428a2 = ((InterfaceC8038a) C8112p.m4162c(m4138y, AbstractC8228i.m3821i(0, mo3556g, mo3556g.length), InterfaceC8038a.class)).mo3428a(bArr, bArr2);
        return ByteBuffer.allocate(mo3428a.length + 4 + mo3428a2.length).putInt(mo3428a.length).put(mo3428a).put(mo3428a2).array();
    }

    @Override // com.google.crypto.tink.InterfaceC8038a
    /* renamed from: b */
    public final byte[] mo3427b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        try {
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            int i = wrap.getInt();
            if (i > 0 && i <= bArr.length - 4) {
                byte[] bArr3 = new byte[i];
                wrap.get(bArr3, 0, i);
                byte[] bArr4 = new byte[wrap.remaining()];
                wrap.get(bArr4, 0, wrap.remaining());
                byte[] mo3427b = this.f15860b.mo3427b(bArr3, f15858c);
                String m4138y = this.f15859a.m4138y();
                Logger logger = C8112p.f15912a;
                AbstractC8228i.C8234f c8234f = AbstractC8228i.f15998b;
                return ((InterfaceC8038a) C8112p.m4162c(m4138y, AbstractC8228i.m3821i(0, mo3427b, mo3427b.length), InterfaceC8038a.class)).mo3427b(bArr4, bArr2);
            }
            throw new GeneralSecurityException("invalid ciphertext");
        } catch (IndexOutOfBoundsException e) {
            e = e;
            throw new GeneralSecurityException("invalid ciphertext", e);
        } catch (NegativeArraySizeException e2) {
            e = e2;
            throw new GeneralSecurityException("invalid ciphertext", e);
        } catch (BufferUnderflowException e3) {
            e = e3;
            throw new GeneralSecurityException("invalid ciphertext", e);
        }
    }
}
