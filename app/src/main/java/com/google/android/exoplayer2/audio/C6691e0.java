package com.google.android.exoplayer2.audio;

import com.google.android.exoplayer2.audio.InterfaceC6699h;
import java.nio.ByteBuffer;

/* renamed from: com.google.android.exoplayer2.audio.e0 */
/* loaded from: classes.dex */
public final class C6691e0 extends AbstractC6725w {

    /* renamed from: i */
    public static final int f10699i = Float.floatToIntBits(Float.NaN);

    @Override // com.google.android.exoplayer2.audio.AbstractC6725w
    /* renamed from: a */
    public final InterfaceC6699h.C6700a mo6033a(InterfaceC6699h.C6700a c6700a) throws InterfaceC6699h.C6701b {
        int i = c6700a.f10735c;
        if (i == 536870912 || i == 805306368 || i == 4) {
            return i != 4 ? new InterfaceC6699h.C6700a(c6700a.f10733a, c6700a.f10734b, 4) : InterfaceC6699h.C6700a.f10732e;
        }
        throw new InterfaceC6699h.C6701b(c6700a);
    }

    @Override // com.google.android.exoplayer2.audio.InterfaceC6699h
    /* renamed from: e */
    public final void mo6032e(ByteBuffer byteBuffer) {
        ByteBuffer m6034k;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i = limit - position;
        int i2 = this.f10865b.f10735c;
        int i3 = f10699i;
        if (i2 != 536870912) {
            if (i2 == 805306368) {
                m6034k = m6034k(i);
                while (position < limit) {
                    int floatToIntBits = Float.floatToIntBits((float) (((byteBuffer.get(position) & 255) | ((byteBuffer.get(position + 1) & 255) << 8) | ((byteBuffer.get(position + 2) & 255) << 16) | ((byteBuffer.get(position + 3) & 255) << 24)) * 4.656612875245797E-10d));
                    if (floatToIntBits == i3) {
                        floatToIntBits = Float.floatToIntBits(0.0f);
                    }
                    m6034k.putInt(floatToIntBits);
                    position += 4;
                }
            } else {
                throw new IllegalStateException();
            }
        } else {
            m6034k = m6034k((i / 3) * 4);
            while (position < limit) {
                int floatToIntBits2 = Float.floatToIntBits((float) ((((byteBuffer.get(position) & 255) << 8) | ((byteBuffer.get(position + 1) & 255) << 16) | ((byteBuffer.get(position + 2) & 255) << 24)) * 4.656612875245797E-10d));
                if (floatToIntBits2 == i3) {
                    floatToIntBits2 = Float.floatToIntBits(0.0f);
                }
                m6034k.putInt(floatToIntBits2);
                position += 3;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        m6034k.flip();
    }
}
