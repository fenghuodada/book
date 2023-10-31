package androidx.emoji2.text;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.emoji2.text.EmojiCompat;
import java.util.concurrent.ThreadPoolExecutor;

/* renamed from: androidx.emoji2.text.g */
/* loaded from: classes.dex */
public final class C1307g extends EmojiCompat.AbstractC1288h {

    /* renamed from: a */
    public final /* synthetic */ EmojiCompat.AbstractC1288h f3190a;

    /* renamed from: b */
    public final /* synthetic */ ThreadPoolExecutor f3191b;

    public C1307g(EmojiCompat.AbstractC1288h abstractC1288h, ThreadPoolExecutor threadPoolExecutor) {
        this.f3190a = abstractC1288h;
        this.f3191b = threadPoolExecutor;
    }

    @Override // androidx.emoji2.text.EmojiCompat.AbstractC1288h
    /* renamed from: a */
    public final void mo10676a(@Nullable Throwable th) {
        ThreadPoolExecutor threadPoolExecutor = this.f3191b;
        try {
            this.f3190a.mo10676a(th);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    @Override // androidx.emoji2.text.EmojiCompat.AbstractC1288h
    /* renamed from: b */
    public final void mo10675b(@NonNull C1317m c1317m) {
        ThreadPoolExecutor threadPoolExecutor = this.f3191b;
        try {
            this.f3190a.mo10675b(c1317m);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
