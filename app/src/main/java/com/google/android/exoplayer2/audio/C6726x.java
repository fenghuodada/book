package com.google.android.exoplayer2.audio;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.audio.InterfaceC6699h;
import java.nio.ByteBuffer;

/* renamed from: com.google.android.exoplayer2.audio.x */
/* loaded from: classes.dex */
public final class C6726x extends AbstractC6725w {
    @Nullable

    /* renamed from: i */
    public int[] f10872i;
    @Nullable

    /* renamed from: j */
    public int[] f10873j;

    @Override // com.google.android.exoplayer2.audio.AbstractC6725w
    /* renamed from: a */
    public final InterfaceC6699h.C6700a mo6033a(InterfaceC6699h.C6700a c6700a) throws InterfaceC6699h.C6701b {
        int[] iArr = this.f10872i;
        if (iArr == null) {
            return InterfaceC6699h.C6700a.f10732e;
        }
        if (c6700a.f10735c == 2) {
            int length = iArr.length;
            int i = c6700a.f10734b;
            boolean z = i != length;
            int i2 = 0;
            while (i2 < iArr.length) {
                int i3 = iArr[i2];
                if (i3 >= i) {
                    throw new InterfaceC6699h.C6701b(c6700a);
                }
                z |= i3 != i2;
                i2++;
            }
            return z ? new InterfaceC6699h.C6700a(c6700a.f10733a, iArr.length, 2) : InterfaceC6699h.C6700a.f10732e;
        }
        throw new InterfaceC6699h.C6701b(c6700a);
    }

    @Override // com.google.android.exoplayer2.audio.InterfaceC6699h
    /* renamed from: e */
    public final void mo6032e(ByteBuffer byteBuffer) {
        int[] iArr = this.f10873j;
        iArr.getClass();
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        ByteBuffer m6034k = m6034k(((limit - position) / this.f10865b.f10736d) * this.f10866c.f10736d);
        while (position < limit) {
            for (int i : iArr) {
                m6034k.putShort(byteBuffer.getShort((i * 2) + position));
            }
            position += this.f10865b.f10736d;
        }
        byteBuffer.position(limit);
        m6034k.flip();
    }

    @Override // com.google.android.exoplayer2.audio.AbstractC6725w
    /* renamed from: h */
    public final void mo6031h() {
        this.f10873j = this.f10872i;
    }

    @Override // com.google.android.exoplayer2.audio.AbstractC6725w
    /* renamed from: j */
    public final void mo6030j() {
        this.f10873j = null;
        this.f10872i = null;
    }
}
