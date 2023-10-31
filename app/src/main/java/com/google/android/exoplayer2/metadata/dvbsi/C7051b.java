package com.google.android.exoplayer2.metadata.dvbsi;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.metadata.AbstractC7062g;
import com.google.android.exoplayer2.metadata.C7042a;
import com.google.android.exoplayer2.metadata.C7048d;
import com.google.android.exoplayer2.util.C7435u;
import com.google.common.base.C7935d;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;

/* renamed from: com.google.android.exoplayer2.metadata.dvbsi.b */
/* loaded from: classes.dex */
public final class C7051b extends AbstractC7062g {
    @Override // com.google.android.exoplayer2.metadata.AbstractC7062g
    @Nullable
    /* renamed from: b */
    public final C7042a mo5507b(C7048d c7048d, ByteBuffer byteBuffer) {
        String str;
        if (byteBuffer.get() != 116) {
            return null;
        }
        C7435u c7435u = new C7435u(byteBuffer.array(), byteBuffer.limit());
        c7435u.m5020l(12);
        int m5028d = (c7435u.m5028d() + c7435u.m5026f(12)) - 4;
        c7435u.m5020l(44);
        c7435u.m5019m(c7435u.m5026f(12));
        c7435u.m5020l(16);
        ArrayList arrayList = new ArrayList();
        while (c7435u.m5028d() < m5028d) {
            c7435u.m5020l(48);
            int m5026f = c7435u.m5026f(8);
            c7435u.m5020l(4);
            int m5028d2 = c7435u.m5028d() + c7435u.m5026f(12);
            String str2 = null;
            String str3 = null;
            while (c7435u.m5028d() < m5028d2) {
                int m5026f2 = c7435u.m5026f(8);
                int m5026f3 = c7435u.m5026f(8);
                int m5028d3 = c7435u.m5028d() + m5026f3;
                if (m5026f2 == 2) {
                    int m5026f4 = c7435u.m5026f(16);
                    c7435u.m5020l(8);
                    if (m5026f4 != 3) {
                    }
                    while (c7435u.m5028d() < m5028d3) {
                        int m5026f5 = c7435u.m5026f(8);
                        Charset charset = C7935d.f15691a;
                        byte[] bArr = new byte[m5026f5];
                        c7435u.m5024h(bArr, m5026f5);
                        str2 = new String(bArr, charset);
                        int m5026f6 = c7435u.m5026f(8);
                        for (int i = 0; i < m5026f6; i++) {
                            c7435u.m5019m(c7435u.m5026f(8));
                        }
                    }
                } else if (m5026f2 == 21) {
                    Charset charset2 = C7935d.f15691a;
                    byte[] bArr2 = new byte[m5026f3];
                    c7435u.m5024h(bArr2, m5026f3);
                    str3 = new String(bArr2, charset2);
                }
                c7435u.m5022j(m5028d3 * 8);
            }
            c7435u.m5022j(m5028d2 * 8);
            if (str2 != null && str3 != null) {
                if (str3.length() != 0) {
                    str = str2.concat(str3);
                } else {
                    str = new String(str2);
                }
                arrayList.add(new C7049a(m5026f, str));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new C7042a(arrayList);
    }
}
