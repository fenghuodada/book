package com.google.crypto.tink.subtle;

import com.adcolony.sdk.C2102e4;
import com.google.crypto.tink.InterfaceC8038a;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import javax.crypto.AEADBadTagException;

/* renamed from: com.google.crypto.tink.subtle.j */
/* loaded from: classes3.dex */
public abstract class AbstractC8334j implements InterfaceC8038a {

    /* renamed from: a */
    public final AbstractC8332h f16166a;

    /* renamed from: b */
    public final AbstractC8332h f16167b;

    public AbstractC8334j(byte[] bArr) throws InvalidKeyException {
        this.f16166a = mo3413d(1, bArr);
        this.f16167b = mo3413d(0, bArr);
    }

    /* renamed from: c */
    public static byte[] m3429c(byte[] bArr, ByteBuffer byteBuffer) {
        int length = bArr.length % 16 == 0 ? bArr.length : (bArr.length + 16) - (bArr.length % 16);
        int remaining = byteBuffer.remaining();
        int i = remaining % 16;
        int i2 = (i == 0 ? remaining : (remaining + 16) - i) + length;
        ByteBuffer order = ByteBuffer.allocate(i2 + 16).order(ByteOrder.LITTLE_ENDIAN);
        order.put(bArr);
        order.position(length);
        order.put(byteBuffer);
        order.position(i2);
        order.putLong(bArr.length);
        order.putLong(remaining);
        return order.array();
    }

    @Override // com.google.crypto.tink.InterfaceC8038a
    /* renamed from: a */
    public final byte[] mo3428a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        AbstractC8332h abstractC8332h = this.f16166a;
        if (length <= (Integer.MAX_VALUE - abstractC8332h.mo3414g()) - 16) {
            ByteBuffer allocate = ByteBuffer.allocate(abstractC8332h.mo3414g() + bArr.length + 16);
            if (allocate.remaining() >= abstractC8332h.mo3414g() + bArr.length + 16) {
                int position = allocate.position();
                abstractC8332h.m3434f(bArr, allocate);
                allocate.position(position);
                byte[] bArr3 = new byte[abstractC8332h.mo3414g()];
                allocate.get(bArr3);
                allocate.limit(allocate.limit() - 16);
                if (bArr2 == null) {
                    bArr2 = new byte[0];
                }
                byte[] bArr4 = new byte[32];
                this.f16167b.m3436c(0, bArr3).get(bArr4);
                byte[] m9639b = C2102e4.m9639b(bArr4, m3429c(bArr2, allocate));
                allocate.limit(allocate.limit() + 16);
                allocate.put(m9639b);
                return allocate.array();
            }
            throw new IllegalArgumentException("Given ByteBuffer output is too small");
        }
        throw new GeneralSecurityException("plaintext too long");
    }

    @Override // com.google.crypto.tink.InterfaceC8038a
    /* renamed from: b */
    public final byte[] mo3427b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        int remaining = wrap.remaining();
        AbstractC8332h abstractC8332h = this.f16166a;
        if (remaining >= abstractC8332h.mo3414g() + 16) {
            int position = wrap.position();
            byte[] bArr3 = new byte[16];
            wrap.position(wrap.limit() - 16);
            wrap.get(bArr3);
            wrap.position(position);
            wrap.limit(wrap.limit() - 16);
            byte[] bArr4 = new byte[abstractC8332h.mo3414g()];
            wrap.get(bArr4);
            if (bArr2 == null) {
                bArr2 = new byte[0];
            }
            try {
                byte[] bArr5 = new byte[32];
                this.f16167b.m3436c(0, bArr4).get(bArr5);
                if (C8330f.m3440b(C2102e4.m9639b(bArr5, m3429c(bArr2, wrap)), bArr3)) {
                    wrap.position(position);
                    return abstractC8332h.m3435e(wrap);
                }
                throw new GeneralSecurityException("invalid MAC");
            } catch (GeneralSecurityException e) {
                throw new AEADBadTagException(e.toString());
            }
        }
        throw new GeneralSecurityException("ciphertext too short");
    }

    /* renamed from: d */
    public abstract AbstractC8332h mo3413d(int i, byte[] bArr) throws InvalidKeyException;
}
