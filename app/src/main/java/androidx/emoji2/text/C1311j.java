package androidx.emoji2.text;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.os.Handler;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.WorkerThread;
import androidx.core.graphics.C0711e;
import androidx.core.graphics.C0723o;
import androidx.core.p003os.C0740h;
import androidx.core.p003os.C0749q;
import androidx.core.provider.C0759f;
import androidx.core.provider.C0762h;
import androidx.core.provider.C0769n;
import androidx.core.provider.C0770o;
import androidx.emoji2.text.C1311j;
import androidx.emoji2.text.EmojiCompat;
import java.nio.MappedByteBuffer;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: androidx.emoji2.text.j */
/* loaded from: classes.dex */
public final class C1311j extends EmojiCompat.AbstractC1283c {

    /* renamed from: d */
    public static final C1312a f3204d = new C1312a();

    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY})
    /* renamed from: androidx.emoji2.text.j$a */
    /* loaded from: classes.dex */
    public static class C1312a {
    }

    /* renamed from: androidx.emoji2.text.j$b */
    /* loaded from: classes.dex */
    public static class C1313b implements EmojiCompat.InterfaceC1287g {
        @NonNull

        /* renamed from: a */
        public final Context f3205a;
        @NonNull

        /* renamed from: b */
        public final C0762h f3206b;
        @NonNull

        /* renamed from: c */
        public final C1312a f3207c;
        @NonNull

        /* renamed from: d */
        public final Object f3208d;
        @Nullable
        @GuardedBy("mLock")

        /* renamed from: e */
        public Handler f3209e;
        @Nullable
        @GuardedBy("mLock")

        /* renamed from: f */
        public Executor f3210f;
        @Nullable
        @GuardedBy("mLock")

        /* renamed from: g */
        public ThreadPoolExecutor f3211g;
        @Nullable
        @GuardedBy("mLock")

        /* renamed from: h */
        public EmojiCompat.AbstractC1288h f3212h;

        public C1313b(@NonNull Context context, @NonNull C0762h c0762h) {
            C1312a c1312a = C1311j.f3204d;
            this.f3208d = new Object();
            if (context != null) {
                this.f3205a = context.getApplicationContext();
                this.f3206b = c0762h;
                this.f3207c = c1312a;
                return;
            }
            throw new NullPointerException("Context cannot be null");
        }

        @Override // androidx.emoji2.text.EmojiCompat.InterfaceC1287g
        @RequiresApi(19)
        /* renamed from: a */
        public final void mo10669a(@NonNull EmojiCompat.AbstractC1288h abstractC1288h) {
            synchronized (this.f3208d) {
                this.f3212h = abstractC1288h;
            }
            m10667c();
        }

        /* renamed from: b */
        public final void m10668b() {
            synchronized (this.f3208d) {
                this.f3212h = null;
                Handler handler = this.f3209e;
                if (handler != null) {
                    handler.removeCallbacks(null);
                }
                this.f3209e = null;
                ThreadPoolExecutor threadPoolExecutor = this.f3211g;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.f3210f = null;
                this.f3211g = null;
            }
        }

        @RequiresApi(19)
        /* renamed from: c */
        public final void m10667c() {
            synchronized (this.f3208d) {
                if (this.f3212h == null) {
                    return;
                }
                if (this.f3210f == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadFactoryC1294a("emojiCompat"));
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                    this.f3211g = threadPoolExecutor;
                    this.f3210f = threadPoolExecutor;
                }
                this.f3210f.execute(new Runnable() { // from class: androidx.emoji2.text.k
                    @Override // java.lang.Runnable
                    public final void run() {
                        C1311j.C1313b c1313b = C1311j.C1313b.this;
                        synchronized (c1313b.f3208d) {
                            if (c1313b.f3212h != null) {
                                try {
                                    C0770o m10666d = c1313b.m10666d();
                                    int i = m10666d.f2466e;
                                    if (i == 2) {
                                        synchronized (c1313b.f3208d) {
                                        }
                                    }
                                    if (i == 0) {
                                        int i2 = C0749q.f2431a;
                                        C0749q.C0750a.m11833a("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                                        C1311j.C1312a c1312a = c1313b.f3207c;
                                        Context context = c1313b.f3205a;
                                        c1312a.getClass();
                                        Typeface mo11885b = C0711e.f2402a.mo11885b(context, new C0770o[]{m10666d}, 0);
                                        MappedByteBuffer m11874e = C0723o.m11874e(c1313b.f3205a, m10666d.f2462a);
                                        if (m11874e != null && mo11885b != null) {
                                            try {
                                                C0749q.C0750a.m11833a("EmojiCompat.MetadataRepo.create");
                                                C1317m c1317m = new C1317m(mo11885b, C1315l.m10665a(m11874e));
                                                C0749q.C0750a.m11832b();
                                                C0749q.C0750a.m11832b();
                                                synchronized (c1313b.f3208d) {
                                                    EmojiCompat.AbstractC1288h abstractC1288h = c1313b.f3212h;
                                                    if (abstractC1288h != null) {
                                                        abstractC1288h.mo10675b(c1317m);
                                                    }
                                                }
                                                c1313b.m10668b();
                                                return;
                                            } catch (Throwable th) {
                                                int i3 = C0749q.f2431a;
                                                C0749q.C0750a.m11832b();
                                                throw th;
                                            }
                                        }
                                        throw new RuntimeException("Unable to open file.");
                                    }
                                    throw new RuntimeException("fetchFonts result is not OK. (" + i + ")");
                                } catch (Throwable th2) {
                                    synchronized (c1313b.f3208d) {
                                        EmojiCompat.AbstractC1288h abstractC1288h2 = c1313b.f3212h;
                                        if (abstractC1288h2 != null) {
                                            abstractC1288h2.mo10676a(th2);
                                        }
                                        c1313b.m10668b();
                                    }
                                }
                            }
                        }
                    }
                });
            }
        }

        @WorkerThread
        /* renamed from: d */
        public final C0770o m10666d() {
            try {
                C1312a c1312a = this.f3207c;
                Context context = this.f3205a;
                C0762h c0762h = this.f3206b;
                c1312a.getClass();
                C0769n m11826a = C0759f.m11826a(context, c0762h);
                int i = m11826a.f2460a;
                if (i == 0) {
                    C0770o[] c0770oArr = m11826a.f2461b;
                    if (c0770oArr != null && c0770oArr.length != 0) {
                        return c0770oArr[0];
                    }
                    throw new RuntimeException("fetchFonts failed (empty result)");
                }
                throw new RuntimeException(C0740h.m11849a("fetchFonts failed (", i, ")"));
            } catch (PackageManager.NameNotFoundException e) {
                throw new RuntimeException("provider not found", e);
            }
        }
    }

    public C1311j(@NonNull Context context, @NonNull C0762h c0762h) {
        super(new C1313b(context, c0762h));
    }
}
