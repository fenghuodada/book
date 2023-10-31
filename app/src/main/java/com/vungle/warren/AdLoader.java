package com.vungle.warren;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.URLUtil;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import androidx.concurrent.futures.C0484a;
import androidx.constraintlayout.core.widgets.C0539e;
import androidx.work.C1828a;
import com.google.firebase.sessions.settings.RemoteSettings;
import com.google.gson.C8695r;
import com.vungle.warren.AdConfig;
import com.vungle.warren.C9763d0;
import com.vungle.warren.downloader.C9777d;
import com.vungle.warren.downloader.DownloadRequest;
import com.vungle.warren.downloader.Downloader;
import com.vungle.warren.error.VungleException;
import com.vungle.warren.model.AdAsset;
import com.vungle.warren.model.Advertisement;
import com.vungle.warren.model.C9867g;
import com.vungle.warren.model.C9874j;
import com.vungle.warren.model.C9879m;
import com.vungle.warren.model.Placement;
import com.vungle.warren.network.C9901e;
import com.vungle.warren.network.InterfaceC9892b;
import com.vungle.warren.omsdk.C9907b;
import com.vungle.warren.persistence.C9914a;
import com.vungle.warren.persistence.C9919c;
import com.vungle.warren.persistence.C9928h;
import com.vungle.warren.persistence.RunnableC9957u;
import com.vungle.warren.tasks.AnalyticsJob;
import com.vungle.warren.tasks.C9980c;
import com.vungle.warren.tasks.InterfaceC9982e;
import com.vungle.warren.tasks.JobInfo;
import com.vungle.warren.utility.C10089k;
import com.vungle.warren.utility.C10108w;
import com.vungle.warren.utility.InterfaceC10086h;
import io.reactivex.rxjava3.annotations.SchedulerSupport;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import p060j$.util.concurrent.ConcurrentHashMap;

/* loaded from: classes3.dex */
public final class AdLoader {

    /* renamed from: q */
    public static final /* synthetic */ int f19266q = 0;

    /* renamed from: d */
    public final C9763d0 f19270d;
    @NonNull

    /* renamed from: f */
    public final C9928h f19272f;
    @NonNull

    /* renamed from: g */
    public final InterfaceC10086h f19273g;
    @NonNull

    /* renamed from: h */
    public final VungleApiClient f19274h;
    @NonNull

    /* renamed from: i */
    public final C9914a f19275i;
    @NonNull

    /* renamed from: j */
    public final Downloader f19276j;
    @NonNull

    /* renamed from: k */
    public final C9822k0 f19277k;
    @NonNull

    /* renamed from: m */
    public final InterfaceC10128w1 f19279m;
    @NonNull

    /* renamed from: n */
    public final C9890n1 f19280n;
    @NonNull

    /* renamed from: o */
    public final C9907b f19281o;

    /* renamed from: a */
    public final ConcurrentHashMap f19267a = new ConcurrentHashMap();

    /* renamed from: b */
    public final ConcurrentHashMap f19268b = new ConcurrentHashMap();

    /* renamed from: c */
    public final CopyOnWriteArrayList f19269c = new CopyOnWriteArrayList();
    @Nullable

    /* renamed from: e */
    public AdRequest f19271e = null;
    @NonNull

    /* renamed from: l */
    public final AtomicReference<InterfaceC9982e> f19278l = new AtomicReference<>();

    /* renamed from: p */
    public boolean f19282p = false;

    /* loaded from: classes3.dex */
    public @interface Priority {
        public static final int HIGH = 1;
        public static final int HIGHEST = 0;
        public static final int LOWEST = Integer.MAX_VALUE;
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface ReschedulePolicy {
        public static final int EXPONENTIAL = 0;
        public static final int EXPONENTIAL_ENDLESS_AD = 1;
    }

    /* renamed from: com.vungle.warren.AdLoader$a */
    /* loaded from: classes3.dex */
    public class RunnableC9712a implements Runnable {
        public RunnableC9712a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            AdLoader adLoader = AdLoader.this;
            adLoader.f19271e = null;
            C9763d0 c9763d0 = adLoader.f19270d;
            c9763d0.getClass();
            ArrayList arrayList = new ArrayList();
            while (true) {
                PriorityQueue<C9763d0.C9765b> priorityQueue = c9763d0.f19437a;
                if (priorityQueue.isEmpty()) {
                    break;
                }
                C9763d0.C9765b poll = priorityQueue.poll();
                if (poll != null) {
                    arrayList.add(poll);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                AdLoader.m1631r(((C9763d0.C9765b) it.next()).f19440b, 25);
            }
        }
    }

    /* renamed from: com.vungle.warren.AdLoader$b */
    /* loaded from: classes3.dex */
    public class RunnableC9713b implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ C9718f f19284a;

        public RunnableC9713b(C9718f c9718f) {
            this.f19284a = c9718f;
        }

        @Override // java.lang.Runnable
        public final void run() {
            C9763d0.C9765b c9765b;
            int i;
            AdLoader adLoader = AdLoader.this;
            CopyOnWriteArrayList copyOnWriteArrayList = adLoader.f19269c;
            C9718f c9718f = this.f19284a;
            if (!copyOnWriteArrayList.contains(c9718f)) {
                return;
            }
            C9718f c9718f2 = (C9718f) adLoader.f19267a.get(c9718f.f19294a);
            if (c9718f2 != null) {
                int i2 = c9718f2.f19304k;
                c9718f2.m1623b(c9718f);
                if (c9718f2.f19304k < i2) {
                    Iterator it = c9718f2.f19305l.iterator();
                    while (it.hasNext()) {
                        DownloadRequest downloadRequest = (DownloadRequest) it.next();
                        int i3 = c9718f2.f19304k;
                        String str = downloadRequest.f19477c;
                        int max = Math.max(-2147483646, i3);
                        if (!adLoader.f19282p) {
                            i = 0;
                        } else {
                            i = !str.endsWith("template");
                        }
                        downloadRequest.f19479e.set(new C9777d(max, i));
                        adLoader.f19276j.mo1535j(downloadRequest);
                    }
                }
            } else {
                C9763d0 c9763d0 = adLoader.f19270d;
                PriorityQueue<C9763d0.C9765b> priorityQueue = c9763d0.f19437a;
                Iterator<C9763d0.C9765b> it2 = priorityQueue.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        c9765b = it2.next();
                        if (c9765b.f19440b.f19294a.equals(c9718f.f19294a)) {
                            break;
                        }
                    } else {
                        c9765b = null;
                        break;
                    }
                }
                priorityQueue.remove(c9765b);
                if (c9765b != null) {
                    C9718f c9718f3 = c9765b.f19440b;
                    c9718f3.m1623b(c9718f);
                    c9718f = c9718f3;
                }
                if (c9718f.f19304k <= 0) {
                    adLoader.m1627v(c9718f);
                } else {
                    if (c9765b == null) {
                        c9765b = new C9763d0.C9765b(c9718f);
                    }
                    c9763d0.f19437a.offer(c9765b);
                    adLoader.m1626w(null);
                }
            }
            adLoader.f19269c.remove(c9718f);
        }
    }

    /* renamed from: com.vungle.warren.AdLoader$c */
    /* loaded from: classes3.dex */
    public class RunnableC9714c implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ C9718f f19286a;

        public RunnableC9714c(C9718f c9718f) {
            this.f19286a = c9718f;
        }

        @Override // java.lang.Runnable
        public final void run() {
            AdLoader.this.getClass();
            AdLoader.m1631r(this.f19286a, 39);
        }
    }

    /* renamed from: com.vungle.warren.AdLoader$d */
    /* loaded from: classes3.dex */
    public class C9715d implements InterfaceC9892b<C8695r> {

        /* renamed from: a */
        public final /* synthetic */ C9718f f19288a;

        /* renamed from: b */
        public final /* synthetic */ long f19289b;

        public C9715d(C9718f c9718f, long j) {
            this.f19288a = c9718f;
            this.f19289b = j;
        }

        @Override // com.vungle.warren.network.InterfaceC9892b
        /* renamed from: a */
        public final void mo1435a(C9901e c9901e) {
            int i = AdLoader.f19266q;
            VungleLogger.m1600f("com.vungle.warren.AdLoader", "ttDownloadContext", String.format("Request ad got response, request = %1$s, elapsed time = %2$dms", this.f19288a.f19294a, Long.valueOf(System.currentTimeMillis() - this.f19289b)));
            AdLoader.this.f19273g.mo1240j().m1236a(new RunnableC9796g(this, c9901e), new RunnableC9799h(this));
        }

        @Override // com.vungle.warren.network.InterfaceC9892b
        /* renamed from: b */
        public final void mo1434b(Throwable th) {
            int i = AdLoader.f19266q;
            C9718f c9718f = this.f19288a;
            VungleLogger.m1600f("com.vungle.warren.AdLoader", "ttDownloadContext", String.format("Request ad failed, request = %1$s, elapsed time = %2$dms", c9718f.f19294a, Long.valueOf(System.currentTimeMillis() - this.f19289b)));
            VungleLogger.m1603c("AdLoader#fetchAdMetadata; loadAd sequence", String.format("failed to request ad, request = %1$s, throwable = %2$s", c9718f.f19294a, th));
            AdLoader.this.f19273g.mo1240j().m1236a(new RunnableC9781e(this, th), new RunnableC9784f(this));
        }
    }

    /* renamed from: com.vungle.warren.AdLoader$e */
    /* loaded from: classes3.dex */
    public class C9716e implements C9928h.InterfaceC9943n {

        /* renamed from: a */
        public final /* synthetic */ File f19291a;

        /* renamed from: com.vungle.warren.AdLoader$e$a */
        /* loaded from: classes3.dex */
        public class RunnableC9717a implements Runnable {
            public RunnableC9717a() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                try {
                    C10089k.m1268b(C9716e.this.f19291a);
                } catch (IOException e) {
                    int i = AdLoader.f19266q;
                    Log.e("com.vungle.warren.AdLoader", "Error on deleting zip assets archive", e);
                }
            }
        }

        public C9716e(File file) {
            this.f19291a = file;
        }

        @Override // com.vungle.warren.persistence.C9928h.InterfaceC9943n
        /* renamed from: a */
        public final void mo1326a() {
        }

        @Override // com.vungle.warren.persistence.C9928h.InterfaceC9943n
        /* renamed from: b */
        public final void mo1325b() {
            AdLoader.this.f19273g.mo1240j().execute(new RunnableC9717a());
        }
    }

    /* renamed from: com.vungle.warren.AdLoader$f */
    /* loaded from: classes3.dex */
    public static class C9718f {
        @NonNull

        /* renamed from: a */
        public final AdRequest f19294a;
        @NonNull

        /* renamed from: b */
        public final AdConfig.AdSize f19295b;

        /* renamed from: c */
        public long f19296c;

        /* renamed from: d */
        public long f19297d;

        /* renamed from: e */
        public int f19298e;

        /* renamed from: f */
        public int f19299f;

        /* renamed from: g */
        public int f19300g;
        @NonNull

        /* renamed from: h */
        public final CopyOnWriteArraySet f19301h;
        @NonNull

        /* renamed from: i */
        public final AtomicBoolean f19302i;

        /* renamed from: j */
        public boolean f19303j;
        @Priority

        /* renamed from: k */
        public int f19304k;

        /* renamed from: l */
        public final CopyOnWriteArrayList f19305l;

        public C9718f(@NonNull AdRequest adRequest, @NonNull AdConfig.AdSize adSize, long j, long j2, int i, int i2, int i3, boolean z, @Priority int i4, @Nullable InterfaceC10136z... interfaceC10136zArr) {
            CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
            this.f19301h = copyOnWriteArraySet;
            this.f19305l = new CopyOnWriteArrayList();
            this.f19294a = adRequest;
            this.f19296c = j;
            this.f19297d = j2;
            this.f19299f = i;
            this.f19300g = i2;
            this.f19298e = i3;
            this.f19302i = new AtomicBoolean();
            this.f19295b = adSize;
            this.f19303j = z;
            this.f19304k = i4;
            if (interfaceC10136zArr != null) {
                copyOnWriteArraySet.addAll(Arrays.asList(interfaceC10136zArr));
            }
        }

        /* renamed from: a */
        public final C9718f m1624a(long j) {
            return new C9718f(this.f19294a, this.f19295b, j, this.f19297d, this.f19299f, this.f19300g, this.f19298e, this.f19303j, this.f19304k, (InterfaceC10136z[]) this.f19301h.toArray(new InterfaceC10136z[0]));
        }

        /* renamed from: b */
        public final void m1623b(C9718f c9718f) {
            this.f19296c = Math.min(this.f19296c, c9718f.f19296c);
            this.f19297d = Math.min(this.f19297d, c9718f.f19297d);
            this.f19299f = Math.min(this.f19299f, c9718f.f19299f);
            int i = c9718f.f19300g;
            if (i != 0) {
                i = this.f19300g;
            }
            this.f19300g = i;
            this.f19298e = Math.min(this.f19298e, c9718f.f19298e);
            this.f19303j |= c9718f.f19303j;
            this.f19304k = Math.min(this.f19304k, c9718f.f19304k);
            this.f19301h.addAll(c9718f.f19301h);
        }

        /* renamed from: c */
        public final C9718f m1622c(int i) {
            return new C9718f(this.f19294a, this.f19295b, this.f19296c, this.f19297d, this.f19299f, this.f19300g, i, this.f19303j, this.f19304k, (InterfaceC10136z[]) this.f19301h.toArray(new InterfaceC10136z[0]));
        }

        /* renamed from: d */
        public final C9718f m1621d(long j) {
            return new C9718f(this.f19294a, this.f19295b, this.f19296c, j, this.f19299f, this.f19300g, this.f19298e, this.f19303j, this.f19304k, (InterfaceC10136z[]) this.f19301h.toArray(new InterfaceC10136z[0]));
        }

        @NonNull
        public final String toString() {
            return "request=" + this.f19294a.toString() + " size=" + this.f19295b.toString() + " priority=" + this.f19304k + " policy=" + this.f19300g + " retry=" + this.f19298e + RemoteSettings.FORWARD_SLASH_STRING + this.f19299f + " delay=" + this.f19296c + "->" + this.f19297d + " log=" + this.f19303j;
        }
    }

    public AdLoader(@NonNull InterfaceC10086h interfaceC10086h, @NonNull C9928h c9928h, @NonNull VungleApiClient vungleApiClient, @NonNull C9914a c9914a, @NonNull Downloader downloader, @NonNull C9822k0 c9822k0, @NonNull InterfaceC10128w1 interfaceC10128w1, @NonNull C9890n1 c9890n1, @NonNull C9763d0 c9763d0, @NonNull C9907b c9907b) {
        this.f19273g = interfaceC10086h;
        this.f19272f = c9928h;
        this.f19274h = vungleApiClient;
        this.f19275i = c9914a;
        this.f19276j = downloader;
        this.f19277k = c9822k0;
        this.f19279m = interfaceC10128w1;
        this.f19280n = c9890n1;
        this.f19270d = c9763d0;
        this.f19281o = c9907b;
    }

    /* renamed from: a */
    public static boolean m1648a(AdLoader adLoader, File file) {
        adLoader.getClass();
        if (!file.getName().equals("postroll") && !file.getName().equals("template")) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public static boolean m1643f(File file, AdAsset adAsset) {
        return file.exists() && file.length() == adAsset.f19708h;
    }

    /* renamed from: k */
    public static boolean m1638k(@NonNull C9718f c9718f, @NonNull C9928h c9928h) {
        List<Advertisement> list = c9928h.m1386m(c9718f.f19294a.f19307b, null).get();
        if (list != null && list.size() >= c9718f.f19294a.f19310e) {
            return true;
        }
        return false;
    }

    /* renamed from: r */
    public static void m1631r(@Nullable C9718f c9718f, @VungleException.ExceptionCode int i) {
        Object obj;
        Object[] objArr = new Object[2];
        objArr[0] = new VungleException(i);
        if (c9718f != null) {
            obj = c9718f;
        } else {
            obj = "null";
        }
        objArr[1] = obj;
        VungleLogger.m1603c("AdLoader#onError; loadAd sequence", String.format("Error %1$s occured; operation is %2$s", objArr));
        if (c9718f != null) {
            Iterator it = c9718f.f19301h.iterator();
            while (it.hasNext()) {
                ((InterfaceC10136z) it.next()).onError(c9718f.f19294a.f19307b, new VungleException(i));
            }
        }
    }

    /* renamed from: b */
    public final void m1647b() {
        CopyOnWriteArrayList copyOnWriteArrayList;
        HashSet hashSet = new HashSet();
        ConcurrentHashMap concurrentHashMap = this.f19267a;
        hashSet.addAll(concurrentHashMap.keySet());
        ConcurrentHashMap concurrentHashMap2 = this.f19268b;
        hashSet.addAll(concurrentHashMap2.keySet());
        Iterator it = hashSet.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            copyOnWriteArrayList = this.f19269c;
            if (!hasNext) {
                break;
            }
            AdRequest adRequest = (AdRequest) it.next();
            C9718f c9718f = (C9718f) concurrentHashMap.remove(adRequest);
            copyOnWriteArrayList.remove(c9718f);
            m1631r(c9718f, 25);
            m1631r((C9718f) concurrentHashMap2.remove(adRequest), 25);
        }
        Iterator it2 = copyOnWriteArrayList.iterator();
        while (it2.hasNext()) {
            C9718f c9718f2 = (C9718f) it2.next();
            copyOnWriteArrayList.remove(c9718f2);
            m1631r(c9718f2, 25);
        }
        this.f19273g.mo1240j().execute(new RunnableC9712a());
    }

    /* renamed from: c */
    public final void m1646c(C9718f c9718f, Advertisement advertisement) {
        AdRequest adRequest;
        AdRequest adRequest2;
        int i;
        boolean z;
        int i2;
        boolean z2;
        Map.Entry entry;
        Advertisement advertisement2 = advertisement;
        C9928h c9928h = this.f19272f;
        c9718f.f19305l.clear();
        Iterator it = advertisement.m1470d().entrySet().iterator();
        do {
            boolean hasNext = it.hasNext();
            String str = "AdLoader#downloadAdAssets; loadAd sequence";
            adRequest = c9718f.f19294a;
            if (hasNext) {
                entry = (Map.Entry) it.next();
                if (TextUtils.isEmpty((CharSequence) entry.getKey()) || TextUtils.isEmpty((CharSequence) entry.getValue())) {
                    break;
                }
            } else {
                try {
                    c9928h.m1376w(advertisement2);
                    List<AdAsset> list = c9928h.m1380s(advertisement.getId()).get();
                    if (list == null) {
                        VungleLogger.m1603c("AdLoader#downloadAdAssets; loadAd sequence", String.format("Cannot load all ad assets; op.request = %1$s; advertisement = %2$s", adRequest, advertisement2));
                        m1632q(new VungleException(26), adRequest, advertisement.getId());
                        return;
                    }
                    Iterator<AdAsset> it2 = list.iterator();
                    boolean z3 = false;
                    while (true) {
                        boolean hasNext2 = it2.hasNext();
                        CopyOnWriteArrayList copyOnWriteArrayList = c9718f.f19305l;
                        Downloader downloader = this.f19276j;
                        if (hasNext2) {
                            AdAsset next = it2.next();
                            int i3 = next.f19706f;
                            Iterator<AdAsset> it3 = it2;
                            String str2 = next.f19705e;
                            boolean z4 = z3;
                            String str3 = next.f19704d;
                            if (i3 == 3) {
                                if (m1643f(new File(str2), next)) {
                                    List<Class<?>> list2 = C10089k.f20313a;
                                    if (str3 != null) {
                                        z2 = str3.endsWith(".mp4");
                                    } else {
                                        z2 = false;
                                    }
                                    if (z2) {
                                        C9846m1 m1477b = C9846m1.m1477b();
                                        C8695r c8695r = new C8695r();
                                        c8695r.m3215u("event", C0539e.m12265a(11));
                                        c8695r.m3215u(C1828a.m9909a(4), advertisement.getId());
                                        m1477b.m1474e(new C9879m(11, c8695r));
                                        it2 = it3;
                                        z3 = true;
                                    } else {
                                        it2 = it3;
                                        z3 = z4;
                                    }
                                } else if (next.f19707g == 1) {
                                    VungleLogger.m1603c(str, String.format("Cannot download ad assets - asset filetype is zip_asset;request = %1$s; advertisement = %2$s", adRequest, advertisement2));
                                    m1632q(new VungleException(24), adRequest, advertisement.getId());
                                    return;
                                }
                            }
                            if (next.f19706f != 4 || next.f19707g != 0) {
                                if (TextUtils.isEmpty(str3)) {
                                    VungleLogger.m1603c(str, String.format("Cannot download ad assets - empty ;request = %1$s; advertisement = %2$s", adRequest, advertisement2));
                                    m1632q(new VungleException(24), adRequest, advertisement.getId());
                                    return;
                                }
                                int max = Math.max(-2147483646, c9718f.f19304k);
                                if (!this.f19282p) {
                                    adRequest2 = adRequest;
                                    i = 0;
                                } else {
                                    adRequest2 = adRequest;
                                    i = !str2.endsWith("template");
                                }
                                C9777d c9777d = new C9777d(max, i);
                                String str4 = next.f19701a;
                                DownloadRequest downloadRequest = new DownloadRequest(c9777d, str3, str2, str4);
                                String str5 = str;
                                if (next.f19706f == 1) {
                                    downloader.mo1536i(downloadRequest);
                                    int max2 = Math.max(-2147483646, c9718f.f19304k);
                                    if (!this.f19282p) {
                                        i2 = 0;
                                    } else {
                                        i2 = !str2.endsWith("template");
                                    }
                                    downloadRequest = new DownloadRequest(new C9777d(max2, i2), str3, str2, str4);
                                }
                                Log.d("com.vungle.warren.AdLoader", "Starting download for " + next);
                                next.f19706f = 1;
                                try {
                                    c9928h.m1376w(next);
                                    copyOnWriteArrayList.add(downloadRequest);
                                    List<Class<?>> list3 = C10089k.f20313a;
                                    if (str3 != null) {
                                        z = str3.endsWith(".mp4");
                                    } else {
                                        z = false;
                                    }
                                    if (z) {
                                        C9846m1 m1477b2 = C9846m1.m1477b();
                                        C8695r c8695r2 = new C8695r();
                                        c8695r2.m3215u("event", C0539e.m12265a(11));
                                        c8695r2.m3215u(C1828a.m9909a(4), advertisement.getId());
                                        c8695r2.m3215u(C1828a.m9909a(8), str3);
                                        m1477b2.m1474e(new C9879m(11, c8695r2));
                                        z3 = true;
                                    } else {
                                        z3 = z4;
                                    }
                                    advertisement2 = advertisement;
                                    it2 = it3;
                                    adRequest = adRequest2;
                                    str = str5;
                                } catch (C9919c.C9920a e) {
                                    VungleLogger.m1603c(str5, String.format("Can't save asset %1$s; exception = %2$s", next, e));
                                    m1632q(new VungleException(26), adRequest2, advertisement.getId());
                                    return;
                                }
                            }
                            it2 = it3;
                            z3 = z4;
                        } else {
                            AdRequest adRequest3 = adRequest;
                            if (!z3) {
                                C9846m1 m1477b3 = C9846m1.m1477b();
                                C8695r c8695r3 = new C8695r();
                                c8695r3.m3215u("event", C0539e.m12265a(11));
                                c8695r3.m3215u(C1828a.m9909a(4), advertisement.getId());
                                c8695r3.m3215u(C1828a.m9909a(6), SchedulerSupport.NONE);
                                m1477b3.m1474e(new C9879m(11, c8695r3));
                            }
                            if (copyOnWriteArrayList.size() == 0) {
                                m1635n(c9718f, advertisement.getId(), Collections.emptyList(), true);
                                return;
                            }
                            VungleLogger.m1600f("com.vungle.warren.AdLoader", "ttDownloadContext", String.format("Start to download assets,  request = %1$s at: %2$d", adRequest3, Long.valueOf(System.currentTimeMillis())));
                            C9804i c9804i = new C9804i(this, c9718f, advertisement);
                            Iterator it4 = copyOnWriteArrayList.iterator();
                            while (it4.hasNext()) {
                                downloader.mo1539f((DownloadRequest) it4.next(), c9804i);
                            }
                            return;
                        }
                    }
                } catch (C9919c.C9920a unused) {
                    VungleLogger.m1603c("AdLoader#downloadAdAssets; loadAd sequence", String.format("Cannot save advertisement op.request = %1$s; advertisement = %2$s", adRequest, advertisement2));
                    m1632q(new VungleException(26), adRequest, advertisement.getId());
                    return;
                }
            }
        } while (URLUtil.isValidUrl((String) entry.getValue()));
        VungleLogger.m1603c("AdLoader#downloadAdAssets; loadAd sequence", String.format("One or more ad asset URLs is empty or not valid;request = %1$s; advertisement = %2$s", adRequest, advertisement2));
        m1632q(new VungleException(11), adRequest, null);
        Log.e("com.vungle.warren.AdLoader", "Aborting, Failed to download Ad assets for: " + advertisement.getId());
    }

    /* renamed from: d */
    public final void m1645d(String str) {
        C9928h c9928h = this.f19272f;
        List<AdAsset> list = c9928h.m1380s(str).get();
        if (list == null) {
            Log.w("com.vungle.warren.AdLoader", "No assets found in ad cache to cleanup");
            return;
        }
        HashSet hashSet = new HashSet();
        for (AdAsset adAsset : list) {
            hashSet.add(adAsset.f19704d);
        }
        Advertisement advertisement = (Advertisement) c9928h.m1383p(Advertisement.class, str).get();
        if (advertisement != null) {
            hashSet.addAll(advertisement.m1470d().values());
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            this.f19276j.mo1540e((String) it.next());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00ae, code lost:
        if (r11 > 0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b7, code lost:
        if (r11 > 0) goto L33;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v11, types: [com.google.gson.r, com.google.gson.o] */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v4, types: [com.google.gson.r] */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r6v1, types: [com.google.gson.m, com.google.gson.o] */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m1644e(@androidx.annotation.NonNull com.vungle.warren.AdLoader.C9718f r33, @androidx.annotation.NonNull com.vungle.warren.model.Placement r34) {
        /*
            Method dump skipped, instructions count: 730
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vungle.warren.AdLoader.m1644e(com.vungle.warren.AdLoader$f, com.vungle.warren.model.Placement):void");
    }

    @Nullable
    /* renamed from: g */
    public final File m1642g(Advertisement advertisement) {
        return this.f19272f.m1385n(advertisement.getId()).get();
    }

    /* renamed from: h */
    public final void m1641h(C9718f c9718f, long j, Advertisement advertisement, Placement placement, C8695r c8695r) throws IllegalArgumentException {
        String str;
        String str2;
        boolean z;
        int i;
        C9890n1 c9890n1 = this.f19280n;
        C9928h c9928h = this.f19272f;
        InterfaceC10113v interfaceC10113v = this.f19277k.f19610a.get();
        try {
            if (c9890n1.f19870c.f20373a) {
                boolean m1441c = C9874j.m1441c(c8695r, "data_science_cache");
                C9928h c9928h2 = c9890n1.f19868a;
                if (m1441c) {
                    String mo3202p = c8695r.m3213w("data_science_cache").mo3202p();
                    C9867g c9867g = new C9867g("visionCookie");
                    if (mo3202p != null) {
                        c9867g.m1445d(mo3202p, "data_science_cache");
                    }
                    c9928h2.m1376w(c9867g);
                } else {
                    c9928h2.m1376w(new C9867g("visionCookie"));
                }
            }
            Advertisement advertisement2 = (Advertisement) c9928h.m1383p(Advertisement.class, advertisement.getId()).get();
            if (advertisement2 != null && ((i = advertisement2.f19725M) == 0 || i == 1 || i == 2)) {
                Log.d("com.vungle.warren.AdLoader", "Operation Cancelled");
                m1632q(new VungleException(25), c9718f.f19294a, null);
                return;
            }
            if (placement.f19775g && interfaceC10113v != null) {
                interfaceC10113v.mo1229a(c9718f.f19294a.f19307b, advertisement.f19723K);
            }
            c9928h.m1392g(advertisement.getId());
            Set<Map.Entry> entrySet = advertisement.m1470d().entrySet();
            File m1642g = m1642g(advertisement);
            if (m1642g != null && m1642g.isDirectory()) {
                for (Map.Entry entry : entrySet) {
                    String str3 = (String) entry.getValue();
                    if (!TextUtils.isEmpty(str3) && (URLUtil.isHttpsUrl(str3) || URLUtil.isHttpUrl(str3))) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        m1629t(advertisement, m1642g, (String) entry.getKey(), (String) entry.getValue());
                    } else {
                        VungleLogger.m1603c("AdLoader#fetchAdMetadata; loadAd sequence", String.format("Response was successful, but one of downloadable urls is neither http nor https : url = %1$s; op.request = %2$s, ad.getId() = %3$s", entry.getValue(), c9718f.f19294a, advertisement.getId()));
                        m1632q(new VungleException(11), c9718f.f19294a, advertisement.getId());
                        return;
                    }
                }
                if (placement.f19777i == 1 && (advertisement.f19737b != 1 || !"banner".equals(advertisement.f19718F))) {
                    Object[] objArr = new Object[3];
                    if (advertisement.f19737b != 1) {
                        str2 = "ad type is not MRAID";
                    } else {
                        str2 = "advertisement template type is not banner";
                    }
                    objArr[0] = str2;
                    objArr[1] = c9718f.f19294a;
                    objArr[2] = advertisement.getId();
                    VungleLogger.m1603c("AdLoader#fetchAdMetadata; loadAd sequence", String.format("Response was successful, but placement is banner while %1$s; op.request = %2$s, ad.getId() = %3$s", objArr));
                    m1632q(new VungleException(1), c9718f.f19294a, advertisement.getId());
                    return;
                }
                AdConfig adConfig = advertisement.f19757v;
                AdConfig.AdSize adSize = c9718f.f19295b;
                AdRequest adRequest = c9718f.f19294a;
                adConfig.m1423c(adSize);
                advertisement.f19731S = j;
                advertisement.f19729Q = System.currentTimeMillis();
                advertisement.f19724L = placement.f19775g;
                c9928h.m1374y(advertisement, adRequest.f19307b, 0);
                int i2 = adRequest.f19309d;
                if (i2 != 0 && i2 != 2) {
                    if (i2 == 1) {
                        if (m1638k(c9718f, c9928h)) {
                            m1626w(adRequest);
                            m1630s(adRequest, placement, null);
                            return;
                        }
                        m1644e(c9718f, placement);
                        return;
                    }
                    return;
                }
                m1626w(adRequest);
                m1646c(c9718f, advertisement);
                return;
            }
            Object[] objArr2 = new Object[3];
            if (m1642g == null) {
                str = "null";
            } else {
                str = "not a dir";
            }
            objArr2[0] = str;
            objArr2[1] = c9718f.f19294a;
            objArr2[2] = advertisement.getId();
            VungleLogger.m1603c("AdLoader#fetchAdMetadata; loadAd sequence", String.format("Response was successful, but adv directory is %1$s; op.request = %2$s, ad.getId() = %3$s", objArr2));
            m1632q(new VungleException(26), c9718f.f19294a, advertisement.getId());
        } catch (C9919c.C9920a e) {
            VungleLogger.m1603c("AdLoader#fetchAdMetadata; loadAd sequence", String.format("BadAd - DBException; can't proceed; placement = %1$s; op.request = %2$s; exception = %3$s", placement, c9718f.f19294a, e));
            m1632q(new VungleException(26), c9718f.f19294a, null);
        }
    }

    /* renamed from: i */
    public final boolean m1640i(Advertisement advertisement) throws IllegalStateException {
        List<AdAsset> list;
        if (advertisement == null || (list = this.f19272f.m1380s(advertisement.getId()).get()) == null || list.size() == 0) {
            return false;
        }
        Iterator<AdAsset> it = list.iterator();
        while (true) {
            boolean z = true;
            if (!it.hasNext()) {
                return true;
            }
            AdAsset next = it.next();
            if (next.f19707g == 0) {
                if (next.f19706f != 4) {
                    return false;
                }
            } else {
                String str = next.f19704d;
                if (TextUtils.isEmpty(str) || (!URLUtil.isHttpsUrl(str) && !URLUtil.isHttpUrl(str))) {
                    z = false;
                }
                if (!z || !m1639j(advertisement)) {
                    if (next.f19706f != 3 || !m1643f(new File(next.f19705e), next)) {
                        return false;
                    }
                }
            }
        }
    }

    /* renamed from: j */
    public final boolean m1639j(Advertisement advertisement) {
        if (this.f19282p && advertisement != null && advertisement.f19737b == 1 && advertisement.f19724L) {
            return true;
        }
        return false;
    }

    /* renamed from: l */
    public final void m1637l(@NonNull C9718f c9718f) {
        InterfaceC9982e interfaceC9982e = this.f19278l.get();
        if (interfaceC9982e == null) {
            VungleLogger.m1603c("AdLoader#load; loadAd sequence", String.format("Cannot load operation %s; job runner is null", c9718f));
            m1631r(c9718f, 9);
            return;
        }
        AdRequest adRequest = c9718f.f19294a;
        if (adRequest.f19306a) {
            C9846m1 m1477b = C9846m1.m1477b();
            C8695r c8695r = new C8695r();
            c8695r.m3215u("event", C0539e.m12265a(7));
            c8695r.m3215u(C1828a.m9909a(1), adRequest.f19307b);
            m1477b.m1474e(new C9879m(7, c8695r));
        }
        String str = adRequest.f19307b;
        C9762d c9762d = new C9762d(this, c9718f.f19295b);
        C9928h c9928h = this.f19272f;
        c9928h.getClass();
        c9928h.f19930b.execute(new RunnableC9957u(c9928h, str, Placement.class, c9762d));
        ConcurrentHashMap concurrentHashMap = this.f19268b;
        C9718f c9718f2 = (C9718f) concurrentHashMap.remove(adRequest);
        if (c9718f2 != null) {
            c9718f.m1623b(c9718f2);
        }
        if (c9718f.f19296c <= 0) {
            adRequest.f19311f.set(System.currentTimeMillis());
            this.f19269c.add(c9718f);
            this.f19273g.mo1240j().m1236a(new RunnableC9713b(c9718f), new RunnableC9714c(c9718f));
            return;
        }
        concurrentHashMap.put(adRequest, c9718f);
        int i = C9980c.f20067c;
        Bundle bundle = new Bundle();
        bundle.putSerializable("request", adRequest);
        JobInfo jobInfo = new JobInfo("com.vungle.warren.tasks.c " + adRequest);
        jobInfo.f20055f = bundle;
        jobInfo.f20057h = 4;
        jobInfo.f20052c = c9718f.f19296c;
        jobInfo.f20051b = true;
        interfaceC9982e.mo1353a(jobInfo);
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m1636m(@androidx.annotation.NonNull com.vungle.warren.model.Placement r18, @androidx.annotation.NonNull com.vungle.warren.AdConfig.AdSize r19, long r20, boolean r22) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            boolean r2 = r18.m1458c()
            r3 = 1
            if (r2 == 0) goto L19
            int r2 = r1.f19777i
            if (r2 != r3) goto L19
            boolean r2 = com.vungle.warren.AdConfig.AdSize.isBannerAdSize(r19)
            if (r2 != 0) goto L19
            com.vungle.warren.AdConfig$AdSize r2 = r1.f19779k
            r6 = r2
            goto L1b
        L19:
            r6 = r19
        L1b:
            int r2 = r1.f19777i
            r4 = 0
            if (r2 != r3) goto L26
            boolean r2 = com.vungle.warren.AdConfig.AdSize.isNonMrecBannerAdSize(r6)
            if (r2 == 0) goto L30
        L26:
            int r2 = r1.f19777i
            if (r2 != 0) goto L32
            boolean r2 = com.vungle.warren.AdConfig.AdSize.isDefaultAdSize(r6)
            if (r2 != 0) goto L32
        L30:
            r2 = r3
            goto L33
        L32:
            r2 = r4
        L33:
            if (r2 == 0) goto L36
            return
        L36:
            int r2 = r1.f19774f
            com.vungle.warren.k0 r5 = r0.f19277k
            java.util.concurrent.atomic.AtomicReference<com.vungle.warren.v1> r5 = r5.f19612c
            java.lang.Object r5 = r5.get()
            com.vungle.warren.v1 r5 = (com.vungle.warren.C10118v1) r5
            r7 = 0
            if (r5 == 0) goto L4f
            java.lang.String r5 = r1.f19769a
            boolean r5 = r5.equals(r7)
            if (r5 == 0) goto L4f
            r15 = r4
            goto L50
        L4f:
            r15 = r2
        L50:
            boolean r2 = r18.m1458c()
            if (r2 == 0) goto L72
            boolean r2 = r1.f19775g
            if (r2 == 0) goto L60
            int r2 = r1.f19780l
            if (r2 != r3) goto L60
            r2 = r3
            goto L61
        L60:
            r2 = r4
        L61:
            if (r2 != 0) goto L72
            com.vungle.warren.AdRequest r2 = new com.vungle.warren.AdRequest
            java.lang.String r9 = r1.f19769a
            r10 = 1
            int r1 = r1.f19780l
            long r11 = (long) r1
            r8 = r2
            r13 = r22
            r8.<init>(r9, r10, r11, r13)
            goto L8b
        L72:
            boolean r2 = r1.f19775g
            if (r2 == 0) goto L7b
            int r2 = r1.f19780l
            if (r2 != r3) goto L7b
            goto L7c
        L7b:
            r3 = r4
        L7c:
            if (r3 == 0) goto L8d
            com.vungle.warren.AdRequest r2 = new com.vungle.warren.AdRequest
            java.lang.String r9 = r1.f19769a
            r10 = 2
            r11 = 1
            r8 = r2
            r13 = r22
            r8.<init>(r9, r10, r11, r13)
        L8b:
            r5 = r2
            goto La2
        L8d:
            boolean r2 = r18.m1459b()
            if (r2 == 0) goto La1
            com.vungle.warren.AdRequest r2 = new com.vungle.warren.AdRequest
            java.lang.String r9 = r1.f19769a
            r10 = 0
            r11 = 1
            r8 = r2
            r13 = r22
            r8.<init>(r9, r10, r11, r13)
            goto L8b
        La1:
            r5 = r7
        La2:
            if (r5 == 0) goto Lb9
            com.vungle.warren.AdLoader$f r1 = new com.vungle.warren.AdLoader$f
            r9 = 2000(0x7d0, double:9.88E-321)
            r11 = 5
            r12 = 1
            r13 = 0
            r14 = 0
            com.vungle.warren.z[] r2 = new com.vungle.warren.InterfaceC10136z[r4]
            r4 = r1
            r7 = r20
            r16 = r2
            r4.<init>(r5, r6, r7, r9, r11, r12, r13, r14, r15, r16)
            r0.m1637l(r1)
        Lb9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vungle.warren.AdLoader.m1636m(com.vungle.warren.model.Placement, com.vungle.warren.AdConfig$AdSize, long, boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:126:0x024c A[EDGE_INSN: B:126:0x024c->B:104:0x024c ?: BREAK  , SYNTHETIC] */
    /* renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m1635n(@androidx.annotation.NonNull com.vungle.warren.AdLoader.C9718f r18, @androidx.annotation.NonNull java.lang.String r19, @androidx.annotation.NonNull java.util.List<com.vungle.warren.downloader.AssetDownloadListener.DownloadError> r20, boolean r21) {
        /*
            Method dump skipped, instructions count: 594
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vungle.warren.AdLoader.m1635n(com.vungle.warren.AdLoader$f, java.lang.String, java.util.List, boolean):void");
    }

    /* renamed from: o */
    public final void m1634o(@NonNull AdRequest adRequest) {
        m1631r((C9718f) this.f19267a.remove(adRequest), 39);
    }

    @WorkerThread
    /* renamed from: p */
    public final void m1633p(@NonNull AdRequest adRequest, @NonNull String str) {
        Advertisement advertisement;
        VungleException vungleException;
        Log.d("com.vungle.warren.AdLoader", "download completed " + adRequest);
        String str2 = adRequest.f19307b;
        C9928h c9928h = this.f19272f;
        Placement placement = (Placement) c9928h.m1383p(Placement.class, str2).get();
        if (placement == null) {
            VungleLogger.m1603c("AdLoader#DownloadAdCallback#onDownloadCompleted; loadAd sequence", String.format("loaded placement is null: request = %1$s; advertisementId = %2$s", adRequest, str));
            vungleException = new VungleException(13);
        } else {
            if (TextUtils.isEmpty(str)) {
                advertisement = null;
            } else {
                advertisement = (Advertisement) c9928h.m1383p(Advertisement.class, str).get();
            }
            if (advertisement == null) {
                VungleLogger.m1603c("AdLoader#DownloadAdCallback#onDownloadCompleted; loadAd sequence", String.format("advertisement is null: request = %1$s; advertisementId = %2$s", adRequest, str));
                vungleException = new VungleException(11);
            } else {
                long currentTimeMillis = System.currentTimeMillis();
                advertisement.f19730R = currentTimeMillis - advertisement.f19729Q;
                advertisement.f19727O = currentTimeMillis - advertisement.f19731S;
                try {
                    c9928h.m1374y(advertisement, adRequest.f19307b, 1);
                    m1630s(adRequest, placement, advertisement);
                    return;
                } catch (C9919c.C9920a e) {
                    VungleLogger.m1603c("AdLoader#DownloadAdCallback#onDownloadCompleted; loadAd sequence", String.format("Can't save/apply state READY: exception = %1$s;request = %2$s; advertisement = %3$s", e, adRequest, advertisement));
                    vungleException = new VungleException(26);
                }
            }
        }
        m1632q(vungleException, adRequest, str);
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x015d A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @androidx.annotation.WorkerThread
    /* renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m1632q(@androidx.annotation.NonNull com.vungle.warren.error.VungleException r17, @androidx.annotation.NonNull com.vungle.warren.AdRequest r18, @androidx.annotation.Nullable java.lang.String r19) {
        /*
            Method dump skipped, instructions count: 350
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vungle.warren.AdLoader.m1632q(com.vungle.warren.error.VungleException, com.vungle.warren.AdRequest, java.lang.String):void");
    }

    @WorkerThread
    /* renamed from: s */
    public final void m1630s(@NonNull AdRequest adRequest, @NonNull Placement placement, @Nullable Advertisement advertisement) {
        String str;
        String str2;
        List arrayList;
        m1628u(adRequest, false);
        C9822k0 c9822k0 = this.f19277k;
        InterfaceC10113v interfaceC10113v = c9822k0.f19610a.get();
        if (advertisement != null && placement.f19775g && interfaceC10113v != null) {
            interfaceC10113v.mo1228b(adRequest.f19307b, advertisement.f19723K);
        }
        Log.i("com.vungle.warren.AdLoader", "found already cached valid adv, calling onAdLoad callback for request " + adRequest);
        InterfaceC10129x interfaceC10129x = c9822k0.f19611b.get();
        int i = adRequest.f19309d;
        boolean m1459b = placement.m1459b();
        String str3 = adRequest.f19307b;
        if (m1459b && interfaceC10129x != null && (i == 2 || i == 0)) {
            interfaceC10129x.onAutoCacheAdAvailable(str3);
        }
        C9718f c9718f = (C9718f) this.f19267a.remove(adRequest);
        if (advertisement != null) {
            str = advertisement.getId();
        } else {
            str = null;
        }
        if (c9718f != null) {
            placement.f19778j = c9718f.f19295b;
            try {
                this.f19272f.m1376w(placement);
                Log.i("com.vungle.warren.AdLoader", "loading took " + (System.currentTimeMillis() - adRequest.f19311f.get()) + "ms for:" + adRequest);
                boolean z = adRequest.f19306a;
                if (z) {
                    C9846m1 m1477b = C9846m1.m1477b();
                    C8695r c8695r = new C8695r();
                    c8695r.m3215u("event", C0539e.m12265a(8));
                    c8695r.m3217s(C1828a.m9909a(3), Boolean.TRUE);
                    c8695r.m3215u(C1828a.m9909a(1), placement.f19769a);
                    m1477b.m1474e(new C9879m(8, c8695r));
                }
                Iterator it = c9718f.f19301h.iterator();
                while (it.hasNext()) {
                    InterfaceC10136z interfaceC10136z = (InterfaceC10136z) it.next();
                    if (interfaceC10136z instanceof C9759c0) {
                        ((C9759c0) interfaceC10136z).mo1586a(advertisement);
                    } else {
                        interfaceC10136z.onAdLoad(str3);
                    }
                }
                C9846m1 m1477b2 = C9846m1.m1477b();
                C8695r c8695r2 = new C8695r();
                c8695r2.m3215u("event", C0539e.m12265a(9));
                if (advertisement != null) {
                    str2 = advertisement.getId();
                } else {
                    str2 = null;
                }
                c8695r2.m3215u(C1828a.m9909a(4), str2);
                c8695r2.m3215u(C1828a.m9909a(1), str3);
                m1477b2.m1474e(new C9879m(9, c8695r2));
                if (z) {
                    if (advertisement != null) {
                        arrayList = advertisement.f19735W;
                    } else {
                        arrayList = new ArrayList();
                    }
                    if (!arrayList.isEmpty()) {
                        InterfaceC9982e interfaceC9982e = this.f19278l.get();
                        if (interfaceC9982e == null) {
                            VungleLogger.m1603c("AdLoader#load; loadAd sequence", String.format("Cannot load operation %s; job runner is null", c9718f));
                            m1631r(c9718f, 9);
                            return;
                        }
                        String[] strArr = (String[]) arrayList.toArray(new String[0]);
                        interfaceC9982e.mo1353a(AnalyticsJob.m1362b(3, null, strArr, 0));
                        interfaceC9982e.mo1353a(AnalyticsJob.m1362b(1, null, strArr, 1));
                    }
                }
            } catch (C9919c.C9920a e) {
                VungleLogger.m1603c("AdLoader#DownloadAdCallback#onReady; loadAd sequence", String.format("Can't save placement: exception = %1$s;placement = %2$s; advertisement = %3$s", e, placement, advertisement));
                m1632q(new VungleException(26), adRequest, str);
            }
        }
    }

    /* renamed from: t */
    public final void m1629t(Advertisement advertisement, File file, String str, String str2) throws C9919c.C9920a {
        int i;
        StringBuilder sb = new StringBuilder();
        sb.append(file.getPath());
        String m12392a = C0484a.m12392a(sb, File.separator, str);
        if (!m12392a.endsWith("postroll") && !m12392a.endsWith("template")) {
            i = 2;
        } else {
            i = 0;
        }
        AdAsset adAsset = new AdAsset(advertisement.getId(), str2, m12392a);
        adAsset.f19706f = 0;
        adAsset.f19707g = i;
        try {
            this.f19272f.m1376w(adAsset);
        } catch (C9919c.C9920a e) {
            VungleLogger.m1603c("AdLoader#saveAsset; loadAd sequence", String.format("Can't save adAsset %1$s; exception = %2$s", adAsset, e));
            throw e;
        }
    }

    /* renamed from: u */
    public final void m1628u(AdRequest adRequest, boolean z) {
        C9718f c9718f = (C9718f) this.f19267a.get(adRequest);
        if (c9718f != null) {
            c9718f.f19302i.set(z);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0186  */
    @androidx.annotation.WorkerThread
    /* renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m1627v(com.vungle.warren.AdLoader.C9718f r20) {
        /*
            Method dump skipped, instructions count: 926
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vungle.warren.AdLoader.m1627v(com.vungle.warren.AdLoader$f):void");
    }

    @WorkerThread
    /* renamed from: w */
    public final void m1626w(@Nullable AdRequest adRequest) {
        AdRequest adRequest2 = this.f19271e;
        if (adRequest2 == null || adRequest2.equals(adRequest)) {
            this.f19271e = null;
            C9763d0.C9765b poll = this.f19270d.f19437a.poll();
            if (poll != null) {
                C9718f c9718f = poll.f19440b;
                this.f19271e = c9718f.f19294a;
                m1627v(c9718f);
            }
        }
    }

    /* renamed from: x */
    public final void m1625x(Advertisement advertisement, AdAsset adAsset, @NonNull File file, List<AdAsset> list) throws IOException, C9919c.C9920a {
        String str;
        ZipFile zipFile;
        boolean z;
        File file2;
        ArrayList arrayList = new ArrayList();
        for (AdAsset adAsset2 : list) {
            if (adAsset2.f19707g == 2) {
                arrayList.add(adAsset2.f19705e);
            }
        }
        File m1642g = m1642g(advertisement);
        if (m1642g != null && m1642g.isDirectory()) {
            String path = file.getPath();
            String path2 = m1642g.getPath();
            int i = C10108w.f20355a;
            if (!TextUtils.isEmpty(path)) {
                File file3 = new File(path);
                if (file3.exists()) {
                    File file4 = new File(path2);
                    if (!file4.exists()) {
                        file4.mkdir();
                    }
                    ArrayList arrayList2 = new ArrayList();
                    try {
                        zipFile = new ZipFile(file3);
                    } catch (Throwable th) {
                        th = th;
                        zipFile = null;
                    }
                    try {
                        Enumeration<? extends ZipEntry> entries = zipFile.entries();
                        while (entries.hasMoreElements()) {
                            ZipEntry nextElement = entries.nextElement();
                            String str2 = path2 + File.separator + nextElement.getName();
                            File file5 = new File(str2);
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                if (!new File((String) it.next()).equals(file5)) {
                                    if (file5.getPath().startsWith(file2.getPath() + File.separator)) {
                                    }
                                }
                                z = false;
                            }
                            z = true;
                            if (z) {
                                if (new File(str2).getCanonicalPath().startsWith(new File(path2).getCanonicalPath())) {
                                    if (nextElement.isDirectory()) {
                                        File file6 = new File(str2);
                                        if (!file6.exists()) {
                                            file6.mkdir();
                                        }
                                    } else {
                                        C10108w.m1237a(zipFile.getInputStream(nextElement), str2);
                                        arrayList2.add(new File(str2));
                                    }
                                } else {
                                    Log.e("com.vungle.warren.utility.w", "File is outside extraction target directory.");
                                    throw new C10108w.C10109a();
                                }
                            }
                        }
                        try {
                            zipFile.close();
                        } catch (IOException unused) {
                        }
                        if (file.getName().equals("template")) {
                            StringBuilder sb = new StringBuilder();
                            sb.append(m1642g.getPath());
                            File file7 = new File(C0484a.m12392a(sb, File.separator, "mraid.js"));
                            if (file7.exists()) {
                                PrintWriter printWriter = new PrintWriter(new BufferedWriter(new FileWriter(file7, true)));
                                printWriter.println("!function(e){var t={};function r(n){if(t[n])return t[n].exports;var o=t[n]={i:n,l:!1,exports:{}};return e[n].call(o.exports,o,o.exports,r),o.l=!0,o.exports}r.m=e,r.c=t,r.d=function(e,t,n){r.o(e,t)||Object.defineProperty(e,t,{enumerable:!0,get:n})},r.r=function(e){\"undefined\"!=typeof Symbol&&Symbol.toStringTag&&Object.defineProperty(e,Symbol.toStringTag,{value:\"Module\"}),Object.defineProperty(e,\"__esModule\",{value:!0})},r.t=function(e,t){if(1&t&&(e=r(e)),8&t)return e;if(4&t&&\"object\"==typeof e&&e&&e.__esModule)return e;var n=Object.create(null);if(r.r(n),Object.defineProperty(n,\"default\",{enumerable:!0,value:e}),2&t&&\"string\"!=typeof e)for(var o in e)r.d(n,o,function(t){return e[t]}.bind(null,o));return n},r.n=function(e){var t=e&&e.__esModule?function(){return e.default}:function(){return e};return r.d(t,\"a\",t),t},r.o=function(e,t){return Object.prototype.hasOwnProperty.call(e,t)},r.p=\"\",r(r.s=0)}([function(e,t,r){\"use strict\";r.r(t);r(1),r(2),r(3),r(4)},function(e,t){!function(e){\"use strict\";var t,r=e.vungle=e.vungle||{};r.error||((t=r.error=r.error||{}).bridgeError={BRG000:\"Missing command in mraidBridge.executeSDKCommand method call!\",BRG001:\"Vungle SDK is not ready to process MRAID command!\"},t.bridgeExtError={BRX000:\"Cannot retrieve #dynamic container in Ad Unit!\"},t.mraidError={MRD000:\"Cannot add listener for unknown MRAID event!\",MRD001:\"Missing argument(s)! Both event and/or listener are required for method call!\",MRD002:\"Unable to find listener registered for event!\",MRD003:\"Missing MRAID event! Cannot remove event listener!\",MRD004:\"Missing object! An expand properties object is required for method call!\",MRD005:\"Missing object! An orientation properties object is required for method call!\",MRD006:\"Missing object! An resize properties object is required for method call!\",MRD007:\"Missing URL! A URL is required for method call!\",MRD008:\"Ad unit is hidden and cannot be closed!\",MRD009:\"Missing URL! A video/caption URL is required for method call!\",MRD010:\"Ad Unit is not viewable! Please make sure isViewAble is set to true!\",MRD011:\"Ad unit can only be expanded from the default or resized state!\",MRD012:\"Ad unit can only be resized from the default or resized state!\",MRD013:\"Missing URI! A valid URI is required for method call!\",MRD015:\"Invalid data/type detected when updating MRAID properties!\",MRD016:\"Missing app store id! An app store id is required for method call!\"},t.mraidClientError={MRC000:\"MRAID SDK error detected!\",MRC001:\"Missing MRAID object in window!\",MRC002:\"Missing video URL!  mraidClient.playVideo cannot retrieve video URL from arguments!\"},t.adTemplateError={ADT000:\"Missing page template JavaScript!\",ADT001:\"Error encountered loading template configuration!\"},t.gestureTrackingError={GET000:\"Cannot serialize user interaction tracking event object!\"})}(window)},function(e,t){!function(e){\"use strict\";var t=e.vungle=e.vungle||{},r=t.mraidCore=t.mraidCore||{},n=t.debugLog=t.debugLog||[];n&&n.push(\"vungle.mraidCore loaded.\"),r.consts={versions:{V1:\"1.0\",V2:\"2.0\"},states:{LOADING:\"loading\",DEFAULT:\"default\",RESIZED:\"resized\",EXPANDED:\"expanded\",HIDDEN:\"hidden\"},events:{INFO:\"info\",READY:\"ready\",ERROR:\"error\",STATE_CHANGE:\"stateChange\",ORIENTATION_CHANGE:\"orientationChange\",VIEWABLE_CHANGE:\"viewableChange\",SIZE_CHANGE:\"sizeChange\"},placements:{UNKNOWN:\"unknown\",INLINE:\"inline\",INTERSTITIAL:\"interstitial\"},orientations:{PORTRAIT:\"portrait\",LANDSCAPE:\"landscape\",NONE:\"none\"},closePositions:{CENTER:\"center\",TOP_LEFT:\"top-left\",TOP_CENTER:\"top-center\",TOP_RIGHT:\"top-right\",BOTTOM_LEFT:\"bottom-left\",BOTTOM_CENTER:\"bottom-center\",BOTTOM_RIGHT:\"bottom-right\"}},r.PropertiesValueObject=function(e){var t=function(e){var t;return e&&\"object\"==typeof e?(t={},Object.keys(e).forEach(function(r){t[r]=e[r]})):t=e,t};this.value=t(e),this.clone=function(){return t(this.value)},this.update=function(e){if(e&&\"object\"==typeof e){var t=this;Object.keys(e).forEach(function(r){t.value[r]=e[r]})}else this.value=e}},r.EventListeners=function(e){var t={};this.event=e,this.listenerCount=0,this.add=function(e){var r=String(e);return!t[r]&&(t[r]=e,this.listenerCount++,!0)},this.remove=function(e){var r=String(e);return!(!t.hasOwnProperty(r)||!t[r])&&(t[r]=null,delete t[r],this.listenerCount--,!0)},this.removeAll=function(){var e=this;Object.keys(t).forEach(function(r){e.remove(t[r])})},this.broadcast=function(e){var r=this;Object.keys(t).forEach(function(n){t[n].apply(r.mraid,e)})}};var o=new r.PropertiesValueObject(r.consts.versions.V1),i=new r.PropertiesValueObject({width:0,height:0}),a=new r.PropertiesValueObject({width:0,height:0}),s=new r.PropertiesValueObject({x:0,y:0,width:0,height:0}),c=new r.PropertiesValueObject({x:0,y:0,width:0,height:0}),d=new r.PropertiesValueObject({width:0,height:0,useCustomClose:!1,isModal:!0}),u=new r.PropertiesValueObject({width:0,height:0,offsetX:0,offsetY:0,customClosePosition:r.consts.closePositions.TOP_RIGHT,allowOffscreen:!0}),l=new r.PropertiesValueObject({allowOrientationChange:!0,forceOrientation:r.consts.orientations.NONE}),p=new r.PropertiesValueObject({sms:!1,tel:!1,calendar:!1,storePicture:!1,inlineVideo:!1}),m=new r.PropertiesValueObject(r.consts.states.LOADING),f=new r.PropertiesValueObject(r.consts.placements.UNKNOWN),E=new r.PropertiesValueObject(!1),g=new r.PropertiesValueObject(!1),v=new r.PropertiesValueObject(!1),y=new r.PropertiesValueObject(!1),R=new r.PropertiesValueObject(!1),h=new r.PropertiesValueObject(!1),O=new r.PropertiesValueObject(!1),S=new r.PropertiesValueObject(!1),C=new r.PropertiesValueObject(!1),x=new r.PropertiesValueObject(!1),b={},P=new r.PropertiesValueObject(\"\"),B=new r.PropertiesValueObject(\"\"),D=new r.PropertiesValueObject(\"\");r.eventListeners=b,r.propertiesHandlers={os:{update:function(e){P.update(e)},clone:function(){return P.clone()}},osVersion:{update:function(e){B.update(e)},clone:function(){return B.clone()}},sdkVersion:{update:function(e){D.update(e)},clone:function(){return D.clone()}},incentivized:{update:function(e){g.update(e)},clone:function(){return g.clone()}},consentRequired:{update:function(e){v.update(e)},clone:function(){return v.clone()}},consentTitleText:{update:function(e){y.update(e)},clone:function(){return y.clone()}},consentBodyText:{update:function(e){R.update(e)},clone:function(){return R.clone()}},consentAcceptButtonText:{update:function(e){h.update(e)},clone:function(){return h.clone()}},consentDenyButtonText:{update:function(e){O.update(e)},clone:function(){return O.clone()}},version:{update:function(e){o.update(e),r.broadcastEvent(r.consts.events.INFO,\"Setting MRAID version to: \"+String(e))},clone:function(){return o.clone()}},maxSize:{update:function(e){i.update(e),d.update(e),r.broadcastEvent(r.consts.events.INFO,\"Setting maxSize to: \"+String(e))},clone:function(){return i.clone()}},screenSize:{update:function(e){var t;a.update(e),t=a.clone(),r.broadcastEvent(r.consts.events.INFO,\"Setting screenSize to: \"+String(e)),r.broadcastEvent(r.consts.events.SIZE_CHANGE,t.width,t.height)},clone:function(){return a.clone()}},defaultPosition:{update:function(e){s.update(e),r.broadcastEvent(r.consts.events.INFO,\"Setting defaultPosition to: \"+String(e))},clone:function(){return s.clone()}},currentPosition:{update:function(e){c.update(e),r.broadcastEvent(r.consts.events.INFO,\"Setting currentPosition to: \"+String(e))},clone:function(){return c.clone()}},expandProperties:{update:function(e){d.update(e),r.broadcastEvent(r.consts.events.INFO,\"Setting expandProperties to: \"+String(e))},clone:function(){return d.clone()}},resizeProperties:{update:function(e){u.update(e),r.broadcastEvent(r.consts.events.INFO,\"Setting resizeProperties to: \"+String(e))},clone:function(){return u.clone()}},orientationProperties:{update:function(e){l.update(e),r.broadcastEvent(r.consts.events.INFO,\"Setting orientationProperties to: \"+String(e))},clone:function(){return l.clone()}},supports:{update:function(e){p.update(e),r.broadcastEvent(r.consts.events.INFO,\"Setting supports to: \"+String(e))},clone:function(){return p.clone()}},state:{update:function(e){m.update(e),r.broadcastEvent(r.consts.events.INFO,\"Setting state to: \"+String(e)),r.broadcastEvent(r.consts.events.STATE_CHANGE,m.clone()),m.clone()===r.consts.states.DEFAULT&&r.broadcastEvent(r.consts.events.READY)},clone:function(){return m.clone()}},placementType:{update:function(e){f.update(e),r.broadcastEvent(r.consts.events.INFO,\"Setting placementType to: \"+String(e))},clone:function(){return f.clone()}},isViewable:{update:function(e){E.update(e),r.broadcastEvent(r.consts.events.INFO,\"Setting isViewable to: \"+String(e)),r.broadcastEvent(r.consts.events.VIEWABLE_CHANGE,E.clone())},clone:function(){return E.clone()}},customClose:{update:function(e){S.update(e),r.broadcastEvent(r.consts.events.INFO,\"Setting useCustomClose to: \"+String(e))},clone:function(){return S.clone()}},customPrivacy:{update:function(e){C.update(e),r.broadcastEvent(r.consts.events.INFO,\"Setting useCustomPrivacy to: \"+String(e))},clone:function(){return C.clone()}},enableBackImmediately:{update:function(e){x.update(e),r.broadcastEvent(r.consts.events.INFO,\"Setting enableBackImmediately to: \"+String(e))},clone:function(){return x.clone()}}},r.propertiesValidator=function(e,r,n){var o=!0;return typeof e!=typeof r&&\"useCustomClose\"!==n?(o=!1,t.mraidBridgeExt&&t.mraidBridgeExt.notifyError([\"MRD015\",n,e].join(\":\"))):\"object\"==typeof e&&Object.keys(e).forEach(function(e){e in r||(o=!1,t.mraidBridgeExt&&t.mraidBridgeExt.notifyError([\"MRD015\",n,e].join(\":\")))}),o},r.broadcastEvent=function(){var e=Array.prototype.slice.call(arguments),t=e.shift(),r=b[t];r&&r.broadcast(e)},r.isValidMARIDEvent=function(e){for(var t in r.consts.events)if(r.consts.events[t]===e)return!0;return!1}}(window)},function(e,t){!function(e){\"use strict\";var t,r=e.vungle=e.vungle||{},n=r.mraidBridge=r.mraidBridge||{},o=r.mraidBridgeExt=r.mraidBridgeExt||{},i=r.debugLog=r.debugLog||[],a=!1,s=!1,c=[],d=!1,u=!1,l=!1,p=!1,m=r.mraidCore.broadcastEvent,f=r.mraidCore.consts.states,E=r.mraidCore.consts.events;i&&i.push(\"vungle.mraidBridge loaded.\"),n.notifyContainer=function(t){e.location=t},n.notifyPropertiesChange=function(e,t){i&&i.push(\"mraidBridge.notifyPropertiesChange:\"+JSON.stringify(e)),Object.keys(e).forEach(function(t){r.mraidCore.propertiesHandlers[t]?r.mraidCore.propertiesHandlers[t].update(e[t]):n.notifyErrorEvent(\"notifyPropertiesChange\",\"MRD015: Unhandled Property received - \"+t+\" - \"+e[t])}),void 0!==t&&!0===t&&n.notifyContainer(\"mraid://propertiesChangeCompleted\")},n.notifyCommandComplete=function(){i&&i.push(\"mraidBridge.notifyCommandComplete\");var e=\"\";c.length?(e=c.shift(),n.notifyContainer(e)):s=!1},n.notifyReadyEvent=function(e){i&&i.push(\"mraidBridge.notifyReadyEvent\");var n=r.mraidCore.propertiesHandlers.state.clone();a=!0,void 0!==e?(d=!0,p=e.isInstalled,l=e.isDisplayIAP,u=e.isDirectDownload,t=e):r.mraidBridgeExt.notifySuccessfulViewAd(),n!==f.DEFAULT?r.mraidCore.propertiesHandlers.state.update(f.DEFAULT):m(E.READY)},n.notifyErrorEvent=function(e,t){i&&i.push(\"mraidBridge.notifyErrorEvent:\"+e+\":\"+t),m(E.ERROR,e,t)},n.executeSDKCommand=function(){var e,t,o,d=\"\";if(!a)throw n.notifyErrorEvent(d,r.error.bridgeError.BRG001),{name:\"VungleMRAIDBridgeException\",message:\"BRG001\"};if(!arguments)throw n.notifyErrorEvent(d,r.error.bridgeError.BRG000),{name:\"VungleMRAIDBridgeException\",message:\"BRG000\"};for(d+=\"mraid://\"+arguments[0],o=1;o<arguments.length;o+=2)e=arguments[o],t=arguments[o+1],d+=(1===o?\"?\":\"&\")+encodeURIComponent(e),void 0!==t&&(d+=\"=\"+encodeURIComponent(t));s?c.push(d):(s=!0,n.notifyContainer(d)),i&&i.push(\"mraidBridge.executeSDKCommand: \"+d)},o.getReplacementTokens=function(){return t},o.getIsVungleAd=function(){return d},o.getIsDirectDownload=function(){return u},o.getIsDisplayIAP=function(){return l},o.getIsInstalled=function(){return p},o.getEnableBackButtonImmediately=function(){return r.mraidCore.propertiesHandlers.enableBackImmediately.clone()},o.fireVideoCompleteEvent=function(){i&&i.push(\"mraidBridgeExt.fireVideoCompleteEvent\");var t=e.document.querySelector(\"#dynamic\"),r=new e.Event(\"vungle.events.video.ended\");t?t.dispatchEvent(r):o.notifyError(e.vungle.error.bridgeExtError.BRX000)},o.notifyPrepareStoreViewSuccess=function(){i&&i.push(\"mraidBridgeExt.notifyPrepareStoreViewSuccess\");var t=e.document.querySelector(\"#dynamic\"),r=new e.Event(\"vungle.events.preparestore.success\");t?t.dispatchEvent(r):o.notifyError(e.vungle.error.bridgeExtError.BRX000)},o.notifyPresentStoreViewFinished=function(){i&&i.push(\"mraidBridgeExt.notifyPresentStoreViewFinished\");var t=e.document.querySelector(\"#dynamic\"),r=new e.Event(\"vungle.events.preparestore.finished\");t?t.dispatchEvent(r):o.notifyError(e.vungle.error.bridgeExtError.BRX000)},o.notifyPrepareStoreOverlayViewSuccess=function(){i&&i.push(\"mraidBridgeExt.notifyPrepareStoreOverlayViewSuccess\");var t=e.document.querySelector(\"#dynamic\"),r=new e.Event(\"vungle.events.storeoverlay.success\");t?t.dispatchEvent(r):o.notifyError(e.vungle.error.bridgeExtError.BRX000)},o.notifyPresentStoreOverlayViewFinished=function(){i&&i.push(\"mraidBridgeExt.notifyPresentStoreOverlayViewFinished\");var t=e.document.querySelector(\"#dynamic\"),r=new e.Event(\"vungle.events.storeoverlay.finished\");t?t.dispatchEvent(r):o.notifyError(e.vungle.error.bridgeExtError.BRX000)},o.notifyPresentStoreOverlayViewVisible=function(){i&&i.push(\"mraidBridgeExt.notifyPresentStoreOverlayViewVisible\");var t=e.document.querySelector(\"#dynamic\"),r=new e.Event(\"vungle.events.storeoverlay.visible\");t?t.dispatchEvent(r):o.notifyError(e.vungle.error.bridgeExtError.BRX000)},o.notifyPresentStoreOverlayViewFailed=function(){i&&i.push(\"mraidBridgeExt.notifyPresentStoreOverlayViewFailed\");var t=e.document.querySelector(\"#dynamic\"),r=new e.Event(\"vungle.events.storeoverlay.failed\");t?t.dispatchEvent(r):o.notifyError(e.vungle.error.bridgeExtError.BRX000)},o.notifyError=function(t){i&&i.push(\"mraidBridgeExt.notifyError:\"+t);try{r.mraidBridge.executeSDKCommand(\"error\",\"code\",t)}catch(t){\"VungleMRAIDBridgeException\"===t.name?i&&i.push(\"%cVungleMRAIDBridgeException caught in mraidBridgeExt.notifyError! Message: %s\",\"color: red; font-size: x-large\",e.vungle.error.bridgeError[t.message]):i&&i.push(\"%cUnknown Exception caught in mraidBridgeExt.notifyError! Message: %s\",\"color: red; font-size: x-large\",t.message)}},o.notifyTPAT=function(e){i&&i.push(\"mraidBridgeExt.notifyTPATEvent:\"+e);try{r.mraidBridge.executeSDKCommand(\"tpat\",\"event\",e)}catch(e){r.mraidBridge.notifyErrorEvent(\"mraidBridgeExt.notifyTPAT\",e.message)}},o.consentAction=function(e){i&&i.push(\"mraidBridgeExt.consentActionEvent:\"+e);try{r.mraidBridge.executeSDKCommand(\"consentAction\",\"event\",e)}catch(e){r.mraidBridge.notifyErrorEvent(\"mraidBridgeExt.consentActionEvent\",e.message)}},o.notifyUserInteraction=function(e,t){i&&i.push(\"mraidBridgeExt.notifyUserInteraction\");try{r.mraidBridge.executeSDKCommand(\"action\",e,t)}catch(e){r.mraidBridge.notifyErrorEvent(\"mraidBridgeExt.notifyUserInteraction\",e.message)}},o.notifyEventValuePairEvent=function(e,t){i&&i.push(\"mraidBridgeExt.notifyEventValuePairEvent\");var n=e||\"null\",o=t||\"null\";try{r.mraidBridge.executeSDKCommand(\"actionWithValue\",\"event\",n,\"value\",o)}catch(n){r.mraidBridge.notifyErrorEvent(\"mraidBridgeExt.notifyEventValuePairEvent\",n.message)}},o.playHTML5Video=function(e){i&&i.push(\"mraidBridgeExt.playHTML5Video\");try{r.mraidBridge.executeSDKCommand(\"playHTML5Video\",\"selector\",e)}catch(e){r.mraidBridge.notifyErrorEvent(\"mraidBridgeExt.playHTML5Video\",e.message)}},o.openPrivacy=function(e){i&&i.push(\"mraidBridgeExt.openPrivacy\");try{r.mraidBridge.executeSDKCommand(\"openPrivacy\",\"url\",e)}catch(e){r.mraidBridge.notifyErrorEvent(\"mraidBridgeExt.openPrivacy\",e.message)}},o.requestMRAIDClose=function(){i&&i.push(\"mraidBridgeExt.requestMRAIDClose\");try{var e,t=\"windows\"===r.mraidExt.getOS()&&(0===r.mraidExt.getOSVersion().indexOf(\"WinPhone81\")||0===r.mraidExt.getOSVersion().indexOf(\"Win81\")),n=\"android\"===r.mraidExt.getOS()&&parseInt(r.mraidExt.getOSVersion(),10)<=17;t||n?(e=document.createEvent(\"Event\")).initEvent(\"vungle.events.request.close\",!0,!0):e=new Event(\"vungle.events.request.close\"),d?document.querySelector(\"#dynamic\").dispatchEvent(e):r.mraidBridge.executeSDKCommand(\"close\")}catch(e){r.mraidBridge.notifyErrorEvent(\"mraidBridgeExt.requestMRAIDClose\",e.message)}},o.notifySuccessfulViewAd=function(){i&&i.push(\"mraidBridgeExt.notifySuccessfulViewAd\");try{r.mraidBridge.executeSDKCommand(\"successfulView\")}catch(e){r.mraidBridge.notifyErrorEvent(\"mraidBridgeExt.notifySuccessfulViewAd\",e.message)}},o.openAppInDevice=function(){i&&i.push(\"mraidBridgeExt.openAppInDevice\");try{r.mraidBridge.executeSDKCommand(\"openAppInDevice\")}catch(e){r.mraidBridge.notifyErrorEvent(\"mraidBridgeExt.openAppInDevice\",e.message)}},o.openStorePage=function(){i&&i.push(\"mraidBridgeExt.openStorePage\");try{r.mraidBridge.executeSDKCommand(\"openStorePage\")}catch(e){r.mraidBridge.notifyErrorEvent(\"mraidBridgeExt.openStorePage\",e.message)}},o.cancelDownload=function(){i&&i.push(\"mraidBridgeExt.cancelDownload\");try{r.mraidBridge.executeSDKCommand(\"cancelDownload\")}catch(e){r.mraidBridge.notifyErrorEvent(\"mraidBridgeExt.cancelDownload\",e.message)}},o.getInstallationStatus=function(t){i&&i.push(\"mraidBridgeExt.getInstallationStatus\");var r=e.document.querySelector(\"#dynamic\"),n=new e.CustomEvent(\"vungle.events.installationStatus.updated\",{detail:t});r?r.dispatchEvent(n):o.notifyError(e.vungle.error.bridgeExtError.BRX000)},o.startDownloadAppOnDevice=function(){i&&i.push(\"mraidBridgeExt.startDownloadAppOnDevice\");try{r.mraidBridge.executeSDKCommand(\"startDownloadAppOnDevice\")}catch(e){r.mraidBridge.notifyErrorEvent(\"mraidBridgeExt.startDownloadAppOnDevice\",e.message)}}}(window)},function(e,t){!function(e){\"use strict\";var t=e.vungle=e.vungle||{},r=e.mraid=t.mraid=t.mraid||{},n=t.mraidExt=t.mraidExt||{},o=t.debugLog=t.debugLog||[],i=t.mraidBridge.executeSDKCommand,a=t.mraidCore.broadcastEvent,s=t.mraidCore.propertiesHandlers,c=t.mraidCore.propertiesValidator,d=t.mraidCore.consts.states,u=t.mraidCore.consts.events,l=t.mraidCore.consts.placements;o&&o.push(\"vungle.mraid loaded.\"),r.addEventListener=function(e,r){e&&r?t.mraidCore.isValidMARIDEvent(e)?(t.mraidCore.eventListeners[e]||(t.mraidCore.eventListeners[e]=new t.mraidCore.EventListeners(e)),t.mraidCore.eventListeners[e].add(r)):a(u.ERROR,\"mraid.addEventListener\",t.error.mraidError.MRD000+\":\"+e):a(u.ERROR,\"mraid.addEventListener\",t.error.mraidError.MRD001)},r.removeEventListener=function(e,r){var n,o=!1;e?(n=t.mraidCore.eventListeners[e],r?(n&&(o=n.remove(r)),o||a(u.ERROR,\"mraid.removeEventListener\",t.error.mraidError.MRD002+\":\"+e)):n&&t.mraidCore.eventListeners.removeAll(),n&&0===n.count&&(t.mraidCore.eventListeners[e]=null,delete t.mraidCore.eventListeners[e])):a(u.ERROR,\"mraid.removeEventListener\",t.error.mraidError.MRD003)},r.getVersion=function(){return s.version.clone()},r.getMaxSize=function(){return s.maxSize.clone()},r.getScreenSize=function(){return s.screenSize.clone()},r.getDefaultPosition=function(){return s.defaultPosition.clone()},r.getCurrentPosition=function(){return s.currentPosition.clone()},r.getExpandProperties=function(){return s.expandProperties.clone()},r.getResizeProperties=function(){return s.resizeProperties.clone()},r.getState=function(){return s.state.clone()},r.getPlacementType=function(){return s.placementType.clone()},r.getOrientationProperties=function(){return s.orientationProperties.clone()},r.setOrientationProperties=function(e){var r;\"object\"==typeof e?(r=[\"setOrientationProperties\",\"allowOrientationChange\",e.allowOrientationChange,\"forceOrientation\",e.forceOrientation],c(e,s.orientationProperties.clone(),\"orientationProperties\")&&(s.orientationProperties.update(e),i.apply(null,r))):(a(u.ERROR,\"mraid.setOrientationProperties\",t.error.mraidError.MRD005),t.mraidBridgeExt&&t.mraidBridgeExt.notifyError(\"MRD005\"))},r.setExpandProperties=function(e){var r={};\"object\"==typeof e?(Object.keys(e).forEach(function(t){\"isModal\"!==t&&(r[t]=e[t])}),c(r,s.expandProperties.clone(),\"expandProperties\")&&s.expandProperties.update(r)):(a(u.ERROR,\"mraid.setExpandProperties\",t.error.mraidError.MRD004),t.mraidBridgeExt&&t.mraidBridgeExt.notifyError(\"MRD004\"))},r.setResizeProperties=function(e){\"object\"==typeof e?c(e,s.resizeProperties.clone(),\"resizeProperties\")&&s.resizeProperties.update(e):(a(u.ERROR,\"mraid.setResizeProperties\",t.error.mraidError.MRD006),t.mraidBridgeExt&&t.mraidBridgeExt.notifyError(\"MRD006\"))},r.open=function(e){e?i(\"open\",\"url\",e):a(u.ERROR,\"mraid.open\",t.error.mraidError.MRD007)},r.close=function(){r.getState()!==d.HIDDEN?i(\"close\"):a(u.ERROR,\"mraid.close\",t.error.mraidError.MRD008)},r.expand=function(e){var r=s.customClose.clone(),n=s.placementType.clone(),o=s.state.clone(),c=[\"expand\",\"useCustomClose\",r];n!==l.INLINE||o!==d.DEFAULT&&o!==d.RESIZED?a(u.ERROR,\"mraid.expand\",t.error.mraidError.MRD011):(e&&(arguments.push(\"url\"),arguments.push(encodeURI(e))),i.apply(null,c))},r.resize=function(){var e=s.resize.clone(),n=[\"resize\"],o=r.getState();o!==d.DEFAULT&&o!==d.RESIZED?(n.push(\"width\"),n.push(e.width),n.push(\"height\"),n.push(e.height),n.push(\"offsetX\"),n.push(e.offsetX),n.push(\"offsetY\"),n.push(e.offsetY),n.push(\"customClosePosition\"),n.push(e.customClosePosition),n.push(\"allowOffscreen\"),n.push(e.allowOffscreen),i.apply(null,n)):a(u.ERROR,\"mraid.resize\",t.error.mraidError.MRD012)},r.supports=function(e){return s.supports.clone()[e]},r.isViewable=function(){return s.isViewable.clone()},r.useCustomClose=function(e){c(e,s.customClose.clone(),\"useCustomClose\")&&c({useCustomClose:e},s.expandProperties.clone(),\"expandProperties\")&&(s.customClose.update(e),s.expandProperties.update({useCustomClose:e}),i(\"useCustomClose\",\"sdkCloseButton\",!0===e?\"invisible\":!1===e?\"visible\":void 0===e?\"gone\":\"\"))},r.playVideo=function(){var e=arguments&&arguments[0]?arguments[0]:\"\",n=arguments&&arguments[1]?arguments[1]:\"\";r.isViewable()?e.length>0?i(\"playVideo\",\"uri\",e,\"captionUrl\",n):a(u.ERROR,\"mraid.playVideo\",t.error.mraidError.MRD009):a(u.ERROR,\"mraid.playVideo\",t.error.mraidError.MRD010)},r.createCalendarEvent=function(){},r.storePicture=function(e){r.isViewable()?e?a(u.ERROR,\"mraid.storePicture\",t.error.mraidError.MRD013):i(\"storePicture\",\"uri\",e):a(u.ERROR,\"mraid.storePicture\",t.error.mraidError.MRD010)},r.getViewable=r.isViewable,n.getConsentRequired=function(){return s.consentRequired.clone()},n.getConsentTitleText=function(){return s.consentTitleText.clone()},n.getConsentBodyText=function(){return s.consentBodyText.clone()},n.getConsentAcceptButtonText=function(){return s.consentAcceptButtonText.clone()},n.getConsentDenyButtonText=function(){return s.consentDenyButtonText.clone()},n.prepareStoreView=function(e){e?i(\"prepareStoreView\",\"appStoreId\",e):a(u.ERROR,\"mraid.prepareStoreView\",t.error.mraidError.MRD016)},n.presentStoreView=function(e){e?i(\"presentStoreView\",\"appStoreId\",e):a(u.ERROR,\"mraid.presentStoreView\",t.error.mraidError.MRD016)},n.prepareStoreOverlayView=function(e,r){if(e&&r){var n=[\"prepareStoreOverlayView\"];n.push(\"appStoreId\"),n.push(e),Object.keys(r).forEach(function(e){n.push(e),n.push(r[e])}),i.apply(null,n)}else a(u.ERROR,\"mraid.prepareStoreOverlayView\",t.error.mraidError.MRD016)},n.presentStoreOverlayView=function(e,r){if(e&&r){var n=[\"presentStoreOverlayView\"];n.push(\"appStoreId\"),n.push(e),Object.keys(r).forEach(function(e){n.push(e),n.push(r[e])}),i.apply(null,n)}else a(u.ERROR,\"mraid.presentStoreOverlayView\",t.error.mraidError.MRD016)},n.dismissStoreOverlayView=function(e){e?i(\"dismissStoreOverlayView\",\"appStoreId\",e):a(u.ERROR,\"mraid.dismissStoreOverlayView\",t.error.mraidError.MRD016)},n.getMraidVersion=function(){return\"v4.5.0\"},n.getOS=function(){return s.os.clone()},n.getOSVersion=function(){return s.osVersion.clone()},n.getSDKVersion=function(){return s.sdkVersion.clone()},n.getIncentivized=function(){return s.incentivized.clone()},n.useCustomPrivacy=function(e){c(e,s.customPrivacy.clone(),\"useCustomPrivacy\")&&(s.customPrivacy.update(e),i(\"useCustomPrivacy\",\"useCustomPrivacy\",e))},r.getConsentRequired=n.getConsentRequired,r.getConsentTitleText=n.getConsentTitleText,r.getConsentBodyText=n.getConsentBodyText,r.getConsentAcceptButtonText=n.getConsentAcceptButtonText,r.getConsentDenyButtonText=n.getConsentDenyButtonText}(window)}]);");
                                printWriter.close();
                            }
                        }
                        Iterator it2 = arrayList2.iterator();
                        while (true) {
                            boolean hasNext = it2.hasNext();
                            C9928h c9928h = this.f19272f;
                            if (hasNext) {
                                File file8 = (File) it2.next();
                                AdAsset adAsset3 = new AdAsset(advertisement.getId(), null, file8.getPath());
                                adAsset3.f19708h = file8.length();
                                adAsset3.f19707g = 1;
                                adAsset3.f19703c = adAsset.f19701a;
                                adAsset3.f19706f = 3;
                                c9928h.m1376w(adAsset3);
                            } else {
                                Log.d("com.vungle.warren.AdLoader", "Uzipped " + m1642g);
                                List<Class<?>> list2 = C10089k.f20313a;
                                adAsset.f19706f = 4;
                                c9928h.m1375x(adAsset, new C9716e(file), true);
                                return;
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        if (zipFile != null) {
                            try {
                                zipFile.close();
                            } catch (IOException unused2) {
                            }
                        }
                        throw th;
                    }
                } else {
                    throw new IOException("File does not exist");
                }
            } else {
                throw new IOException("Path is empty");
            }
        } else {
            Object[] objArr = new Object[2];
            if (m1642g == null) {
                str = "null";
            } else {
                str = "not a dir";
            }
            objArr[0] = str;
            objArr[1] = advertisement;
            VungleLogger.m1603c("AdLoader#unzipFile; loadAd sequence", String.format("Can't unzip file: destination dir is %1$s; advertisement = %2$s", objArr));
            throw new IOException("Unable to access Destination Directory");
        }
    }
}
