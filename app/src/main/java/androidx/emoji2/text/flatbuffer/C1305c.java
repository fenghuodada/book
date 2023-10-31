package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;

/* renamed from: androidx.emoji2.text.flatbuffer.c */
/* loaded from: classes.dex */
public class C1305c {

    /* renamed from: a */
    public int f3185a;

    /* renamed from: b */
    public ByteBuffer f3186b;

    /* renamed from: c */
    public int f3187c;

    /* renamed from: d */
    public int f3188d;

    public C1305c() {
        if (C1306d.f3189a == null) {
            C1306d.f3189a = new C1306d();
        }
    }

    /* renamed from: a */
    public final int m10677a(int i) {
        if (i < this.f3188d) {
            return this.f3186b.getShort(this.f3187c + i);
        }
        return 0;
    }
}
