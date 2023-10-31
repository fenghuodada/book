package androidx.emoji2.text;

import android.graphics.Typeface;
import android.util.SparseArray;
import androidx.annotation.AnyThread;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.util.C0804h;
import androidx.emoji2.text.flatbuffer.C1303a;
import androidx.emoji2.text.flatbuffer.C1304b;

@AnyThread
@RequiresApi(19)
/* renamed from: androidx.emoji2.text.m */
/* loaded from: classes.dex */
public final class C1317m {
    @NonNull

    /* renamed from: a */
    public final C1304b f3215a;
    @NonNull

    /* renamed from: b */
    public final char[] f3216b;
    @NonNull

    /* renamed from: c */
    public final C1318a f3217c = new C1318a(1024);
    @NonNull

    /* renamed from: d */
    public final Typeface f3218d;

    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY})
    /* renamed from: androidx.emoji2.text.m$a */
    /* loaded from: classes.dex */
    public static class C1318a {

        /* renamed from: a */
        public final SparseArray<C1318a> f3219a;

        /* renamed from: b */
        public EmojiMetadata f3220b;

        public C1318a() {
            this(1);
        }

        public C1318a(int i) {
            this.f3219a = new SparseArray<>(i);
        }

        /* renamed from: a */
        public final void m10662a(@NonNull EmojiMetadata emojiMetadata, int i, int i2) {
            C1318a c1318a;
            int m10683a = emojiMetadata.m10683a(i);
            SparseArray<C1318a> sparseArray = this.f3219a;
            if (sparseArray == null) {
                c1318a = null;
            } else {
                c1318a = sparseArray.get(m10683a);
            }
            if (c1318a == null) {
                c1318a = new C1318a();
                sparseArray.put(emojiMetadata.m10683a(i), c1318a);
            }
            if (i2 > i) {
                c1318a.m10662a(emojiMetadata, i + 1, i2);
            } else {
                c1318a.f3220b = emojiMetadata;
            }
        }
    }

    public C1317m(@NonNull Typeface typeface, @NonNull C1304b c1304b) {
        int i;
        int i2;
        int i3;
        boolean z;
        this.f3218d = typeface;
        this.f3215a = c1304b;
        int m10677a = c1304b.m10677a(6);
        if (m10677a != 0) {
            int i4 = m10677a + c1304b.f3185a;
            i = c1304b.f3186b.getInt(c1304b.f3186b.getInt(i4) + i4);
        } else {
            i = 0;
        }
        this.f3216b = new char[i * 2];
        int m10677a2 = c1304b.m10677a(6);
        if (m10677a2 != 0) {
            int i5 = m10677a2 + c1304b.f3185a;
            i2 = c1304b.f3186b.getInt(c1304b.f3186b.getInt(i5) + i5);
        } else {
            i2 = 0;
        }
        for (int i6 = 0; i6 < i2; i6++) {
            EmojiMetadata emojiMetadata = new EmojiMetadata(this, i6);
            C1303a m10681c = emojiMetadata.m10681c();
            int m10677a3 = m10681c.m10677a(4);
            if (m10677a3 != 0) {
                i3 = m10681c.f3186b.getInt(m10677a3 + m10681c.f3185a);
            } else {
                i3 = 0;
            }
            Character.toChars(i3, this.f3216b, i6 * 2);
            if (emojiMetadata.m10682b() > 0) {
                z = true;
            } else {
                z = false;
            }
            C0804h.m11793a(z, "invalid metadata codepoint length");
            this.f3217c.m10662a(emojiMetadata, 0, emojiMetadata.m10682b() - 1);
        }
    }
}
