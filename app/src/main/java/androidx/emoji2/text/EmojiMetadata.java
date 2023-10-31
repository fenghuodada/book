package androidx.emoji2.text;

import androidx.annotation.AnyThread;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.emoji2.text.flatbuffer.C1303a;
import androidx.emoji2.text.flatbuffer.C1304b;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;

@AnyThread
@RequiresApi(19)
@RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP})
/* loaded from: classes.dex */
public final class EmojiMetadata {

    /* renamed from: d */
    public static final ThreadLocal<C1303a> f3174d = new ThreadLocal<>();

    /* renamed from: a */
    public final int f3175a;
    @NonNull

    /* renamed from: b */
    public final C1317m f3176b;

    /* renamed from: c */
    public volatile int f3177c = 0;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface HasGlyph {
    }

    public EmojiMetadata(@NonNull C1317m c1317m, @IntRange(from = 0) int i) {
        this.f3176b = c1317m;
        this.f3175a = i;
    }

    /* renamed from: a */
    public final int m10683a(int i) {
        C1303a m10681c = m10681c();
        int m10677a = m10681c.m10677a(16);
        if (m10677a != 0) {
            ByteBuffer byteBuffer = m10681c.f3186b;
            int i2 = m10677a + m10681c.f3185a;
            return byteBuffer.getInt((i * 4) + byteBuffer.getInt(i2) + i2 + 4);
        }
        return 0;
    }

    /* renamed from: b */
    public final int m10682b() {
        C1303a m10681c = m10681c();
        int m10677a = m10681c.m10677a(16);
        if (m10677a != 0) {
            int i = m10677a + m10681c.f3185a;
            return m10681c.f3186b.getInt(m10681c.f3186b.getInt(i) + i);
        }
        return 0;
    }

    /* renamed from: c */
    public final C1303a m10681c() {
        short s;
        ThreadLocal<C1303a> threadLocal = f3174d;
        C1303a c1303a = threadLocal.get();
        if (c1303a == null) {
            c1303a = new C1303a();
            threadLocal.set(c1303a);
        }
        C1304b c1304b = this.f3176b.f3215a;
        int m10677a = c1304b.m10677a(6);
        if (m10677a != 0) {
            int i = m10677a + c1304b.f3185a;
            int i2 = (this.f3175a * 4) + c1304b.f3186b.getInt(i) + i + 4;
            int i3 = c1304b.f3186b.getInt(i2) + i2;
            ByteBuffer byteBuffer = c1304b.f3186b;
            c1303a.f3186b = byteBuffer;
            if (byteBuffer != null) {
                c1303a.f3185a = i3;
                int i4 = i3 - byteBuffer.getInt(i3);
                c1303a.f3187c = i4;
                s = c1303a.f3186b.getShort(i4);
            } else {
                s = 0;
                c1303a.f3185a = 0;
                c1303a.f3187c = 0;
            }
            c1303a.f3188d = s;
        }
        return c1303a;
    }

    public final String toString() {
        int i;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        C1303a m10681c = m10681c();
        int m10677a = m10681c.m10677a(4);
        if (m10677a != 0) {
            i = m10681c.f3186b.getInt(m10677a + m10681c.f3185a);
        } else {
            i = 0;
        }
        sb.append(Integer.toHexString(i));
        sb.append(", codepoints:");
        int m10682b = m10682b();
        for (int i2 = 0; i2 < m10682b; i2++) {
            sb.append(Integer.toHexString(m10683a(i2)));
            sb.append(" ");
        }
        return sb.toString();
    }
}
