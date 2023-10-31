package com.vungle.warren;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.vungle.warren.AdLoader;
import com.vungle.warren.downloader.AssetDownloadListener;
import com.vungle.warren.downloader.DownloadRequest;
import com.vungle.warren.model.Advertisement;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.vungle.warren.i */
/* loaded from: classes3.dex */
public final class C9804i implements AssetDownloadListener {

    /* renamed from: a */
    public final AtomicLong f19540a;

    /* renamed from: b */
    public final List<AssetDownloadListener.DownloadError> f19541b = Collections.synchronizedList(new ArrayList());

    /* renamed from: c */
    public final /* synthetic */ AdLoader.C9718f f19542c;

    /* renamed from: d */
    public final /* synthetic */ Advertisement f19543d;

    /* renamed from: e */
    public final /* synthetic */ AdLoader f19544e;

    /* renamed from: com.vungle.warren.i$a */
    /* loaded from: classes3.dex */
    public class RunnableC9805a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ DownloadRequest f19545a;

        /* renamed from: b */
        public final /* synthetic */ AssetDownloadListener.DownloadError f19546b;

        public RunnableC9805a(DownloadRequest downloadRequest, AssetDownloadListener.DownloadError downloadError) {
            this.f19545a = downloadRequest;
            this.f19546b = downloadError;
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x007e  */
        /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void run() {
            /*
                r8 = this;
                int r0 = com.vungle.warren.AdLoader.f19266q
                java.lang.String r0 = "com.vungle.warren.AdLoader"
                java.lang.String r1 = "Download Failed"
                android.util.Log.e(r0, r1)
                r0 = 1
                r1 = 4
                r2 = -1
                com.vungle.warren.i r3 = com.vungle.warren.C9804i.this
                com.vungle.warren.downloader.DownloadRequest r4 = r8.f19545a
                if (r4 == 0) goto L61
                java.lang.String r4 = r4.f19481g
                boolean r5 = android.text.TextUtils.isEmpty(r4)
                if (r5 == 0) goto L1c
                r4 = 0
                goto L2c
            L1c:
                com.vungle.warren.AdLoader r5 = r3.f19544e
                com.vungle.warren.persistence.h r5 = r5.f19272f
                java.lang.Class<com.vungle.warren.model.AdAsset> r6 = com.vungle.warren.model.AdAsset.class
                com.vungle.warren.persistence.f r4 = r5.m1383p(r6, r4)
                java.lang.Object r4 = r4.get()
                com.vungle.warren.model.AdAsset r4 = (com.vungle.warren.model.AdAsset) r4
            L2c:
                if (r4 == 0) goto L4f
                java.util.List<com.vungle.warren.downloader.AssetDownloadListener$DownloadError> r5 = r3.f19541b
                com.vungle.warren.downloader.AssetDownloadListener$DownloadError r6 = r8.f19546b
                r5.add(r6)
                r5 = 2
                r4.f19706f = r5
                com.vungle.warren.AdLoader r5 = r3.f19544e     // Catch: com.vungle.warren.persistence.C9919c.C9920a -> L40
                com.vungle.warren.persistence.h r5 = r5.f19272f     // Catch: com.vungle.warren.persistence.C9919c.C9920a -> L40
                r5.m1376w(r4)     // Catch: com.vungle.warren.persistence.C9919c.C9920a -> L40
                goto L72
            L40:
                java.util.List<com.vungle.warren.downloader.AssetDownloadListener$DownloadError> r4 = r3.f19541b
                com.vungle.warren.downloader.AssetDownloadListener$DownloadError r5 = new com.vungle.warren.downloader.AssetDownloadListener$DownloadError
                com.vungle.warren.error.VungleException r6 = new com.vungle.warren.error.VungleException
                r7 = 26
                r6.<init>(r7)
                r5.<init>(r2, r6, r1)
                goto L6f
            L4f:
                java.util.List<com.vungle.warren.downloader.AssetDownloadListener$DownloadError> r1 = r3.f19541b
                com.vungle.warren.downloader.AssetDownloadListener$DownloadError r4 = new com.vungle.warren.downloader.AssetDownloadListener$DownloadError
                java.io.IOException r5 = new java.io.IOException
                java.lang.String r6 = "Downloaded file not found!"
                r5.<init>(r6)
                r4.<init>(r2, r5, r0)
                r1.add(r4)
                goto L72
            L61:
                java.util.List<com.vungle.warren.downloader.AssetDownloadListener$DownloadError> r4 = r3.f19541b
                com.vungle.warren.downloader.AssetDownloadListener$DownloadError r5 = new com.vungle.warren.downloader.AssetDownloadListener$DownloadError
                java.lang.RuntimeException r6 = new java.lang.RuntimeException
                java.lang.String r7 = "error in request"
                r6.<init>(r7)
                r5.<init>(r2, r6, r1)
            L6f:
                r4.add(r5)
            L72:
                java.util.concurrent.atomic.AtomicLong r1 = r3.f19540a
                long r1 = r1.decrementAndGet()
                r4 = 0
                int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
                if (r1 > 0) goto L8d
                com.vungle.warren.AdLoader r1 = r3.f19544e
                com.vungle.warren.AdLoader$f r2 = r3.f19542c
                com.vungle.warren.model.Advertisement r4 = r3.f19543d
                java.lang.String r4 = r4.getId()
                java.util.List<com.vungle.warren.downloader.AssetDownloadListener$DownloadError> r3 = r3.f19541b
                r1.m1635n(r2, r4, r3, r0)
            L8d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.vungle.warren.C9804i.RunnableC9805a.run():void");
        }
    }

    /* renamed from: com.vungle.warren.i$b */
    /* loaded from: classes3.dex */
    public class RunnableC9806b implements Runnable {
        public RunnableC9806b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            C9804i c9804i = C9804i.this;
            c9804i.f19544e.m1634o(c9804i.f19542c.f19294a);
        }
    }

    /* renamed from: com.vungle.warren.i$c */
    /* loaded from: classes3.dex */
    public class RunnableC9807c implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ File f19549a;

        /* renamed from: b */
        public final /* synthetic */ DownloadRequest f19550b;

        public RunnableC9807c(File file, DownloadRequest downloadRequest) {
            this.f19549a = file;
            this.f19550b = downloadRequest;
        }

        /* JADX WARN: Removed duplicated region for block: B:51:0x0137  */
        /* JADX WARN: Removed duplicated region for block: B:52:0x013f  */
        /* JADX WARN: Removed duplicated region for block: B:70:0x0260  */
        /* JADX WARN: Removed duplicated region for block: B:93:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Type inference failed for: r14v0, types: [long] */
        /* JADX WARN: Type inference failed for: r14v2 */
        /* JADX WARN: Type inference failed for: r14v3 */
        /* JADX WARN: Type inference failed for: r14v4 */
        /* JADX WARN: Type inference failed for: r14v6 */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void run() {
            /*
                Method dump skipped, instructions count: 674
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.vungle.warren.C9804i.RunnableC9807c.run():void");
        }
    }

    /* renamed from: com.vungle.warren.i$d */
    /* loaded from: classes3.dex */
    public class RunnableC9808d implements Runnable {
        public RunnableC9808d() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            C9804i c9804i = C9804i.this;
            c9804i.f19544e.m1634o(c9804i.f19542c.f19294a);
        }
    }

    public C9804i(AdLoader adLoader, AdLoader.C9718f c9718f, Advertisement advertisement) {
        this.f19544e = adLoader;
        this.f19542c = c9718f;
        this.f19543d = advertisement;
        this.f19540a = new AtomicLong(c9718f.f19305l.size());
    }

    @Override // com.vungle.warren.downloader.AssetDownloadListener
    /* renamed from: a */
    public final void mo1510a(@NonNull File file, @NonNull DownloadRequest downloadRequest) {
        this.f19544e.f19273g.mo1240j().m1236a(new RunnableC9807c(file, downloadRequest), new RunnableC9808d());
    }

    @Override // com.vungle.warren.downloader.AssetDownloadListener
    /* renamed from: b */
    public final void mo1509b() {
    }

    @Override // com.vungle.warren.downloader.AssetDownloadListener
    /* renamed from: c */
    public final void mo1508c(@NonNull AssetDownloadListener.DownloadError downloadError, @Nullable DownloadRequest downloadRequest) {
        this.f19544e.f19273g.mo1240j().m1236a(new RunnableC9805a(downloadRequest, downloadError), new RunnableC9806b());
    }
}
