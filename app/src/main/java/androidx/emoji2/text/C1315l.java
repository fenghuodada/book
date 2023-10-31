package androidx.emoji2.text;

import androidx.annotation.AnyThread;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.emoji2.text.flatbuffer.C1304b;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;

@AnyThread
@RequiresApi(19)
@RestrictTo({RestrictTo.EnumC0076a.LIBRARY})
/* renamed from: androidx.emoji2.text.l */
/* loaded from: classes.dex */
public final class C1315l {

    /* renamed from: androidx.emoji2.text.l$a */
    /* loaded from: classes.dex */
    public static class C1316a {
        @NonNull

        /* renamed from: a */
        public final ByteBuffer f3214a;

        public C1316a(@NonNull ByteBuffer byteBuffer) {
            this.f3214a = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        /* renamed from: a */
        public final long m10664a() throws IOException {
            return this.f3214a.getInt() & 4294967295L;
        }

        /* renamed from: b */
        public final void m10663b(int i) throws IOException {
            ByteBuffer byteBuffer = this.f3214a;
            byteBuffer.position(byteBuffer.position() + i);
        }
    }

    /* renamed from: a */
    public static C1304b m10665a(MappedByteBuffer mappedByteBuffer) throws IOException {
        ByteBuffer byteBuffer;
        long j;
        ByteBuffer duplicate = mappedByteBuffer.duplicate();
        C1316a c1316a = new C1316a(duplicate);
        c1316a.m10663b(4);
        int i = duplicate.getShort() & 65535;
        if (i <= 100) {
            c1316a.m10663b(6);
            int i2 = 0;
            while (true) {
                byteBuffer = c1316a.f3214a;
                if (i2 < i) {
                    int i3 = byteBuffer.getInt();
                    c1316a.m10663b(4);
                    j = c1316a.m10664a();
                    c1316a.m10663b(4);
                    if (1835365473 == i3) {
                        break;
                    }
                    i2++;
                } else {
                    j = -1;
                    break;
                }
            }
            if (j != -1) {
                c1316a.m10663b((int) (j - duplicate.position()));
                c1316a.m10663b(12);
                long m10664a = c1316a.m10664a();
                for (int i4 = 0; i4 < m10664a; i4++) {
                    int i5 = byteBuffer.getInt();
                    long m10664a2 = c1316a.m10664a();
                    c1316a.m10664a();
                    if (1164798569 == i5 || 1701669481 == i5) {
                        duplicate.position((int) (m10664a2 + j));
                        C1304b c1304b = new C1304b();
                        duplicate.order(ByteOrder.LITTLE_ENDIAN);
                        int position = duplicate.position() + duplicate.getInt(duplicate.position());
                        c1304b.f3186b = duplicate;
                        c1304b.f3185a = position;
                        int i6 = position - duplicate.getInt(position);
                        c1304b.f3187c = i6;
                        c1304b.f3188d = c1304b.f3186b.getShort(i6);
                        return c1304b;
                    }
                }
            }
            throw new IOException("Cannot read metadata.");
        }
        throw new IOException("Cannot read metadata.");
    }
}
