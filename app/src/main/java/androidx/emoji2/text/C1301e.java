package androidx.emoji2.text;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.emoji2.text.EmojiCompat;

/* renamed from: androidx.emoji2.text.e */
/* loaded from: classes.dex */
public final class C1301e extends EmojiCompat.AbstractC1288h {

    /* renamed from: a */
    public final /* synthetic */ EmojiCompat.C1281a f3181a;

    public C1301e(EmojiCompat.C1281a c1281a) {
        this.f3181a = c1281a;
    }

    @Override // androidx.emoji2.text.EmojiCompat.AbstractC1288h
    /* renamed from: a */
    public final void mo10676a(@Nullable Throwable th) {
        this.f3181a.f3165a.m10690d(th);
    }

    @Override // androidx.emoji2.text.EmojiCompat.AbstractC1288h
    /* renamed from: b */
    public final void mo10675b(@NonNull C1317m c1317m) {
        EmojiCompat.C1281a c1281a = this.f3181a;
        c1281a.f3164c = c1317m;
        c1281a.f3163b = new C1308h(c1281a.f3164c, new EmojiCompat.C1289i(), c1281a.f3165a.f3162h);
        c1281a.f3165a.m10689e();
    }
}
