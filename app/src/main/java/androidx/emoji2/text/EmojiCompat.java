package androidx.emoji2.text;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.AnyThread;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.collection.C0472d;
import androidx.emoji2.text.EmojiCompatInitializer;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.locks.ReentrantReadWriteLock;

@AnyThread
/* loaded from: classes.dex */
public final class EmojiCompat {

    /* renamed from: i */
    public static final Object f3153i = new Object();
    @Nullable
    @GuardedBy("INSTANCE_LOCK")

    /* renamed from: j */
    public static volatile EmojiCompat f3154j;
    @NonNull

    /* renamed from: a */
    public final ReentrantReadWriteLock f3155a;
    @NonNull
    @GuardedBy("mInitLock")

    /* renamed from: b */
    public final C0472d f3156b;
    @GuardedBy("mInitLock")

    /* renamed from: c */
    public volatile int f3157c;
    @NonNull

    /* renamed from: d */
    public final Handler f3158d;
    @NonNull

    /* renamed from: e */
    public final C1281a f3159e;
    @NonNull

    /* renamed from: f */
    public final InterfaceC1287g f3160f;

    /* renamed from: g */
    public final int f3161g;

    /* renamed from: h */
    public final C1300d f3162h;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY})
    /* loaded from: classes.dex */
    public @interface CodepointSequenceMatchResult {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY})
    /* loaded from: classes.dex */
    public @interface LoadStrategy {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY})
    /* loaded from: classes.dex */
    public @interface ReplaceStrategy {
    }

    @RequiresApi(19)
    /* renamed from: androidx.emoji2.text.EmojiCompat$a */
    /* loaded from: classes.dex */
    public static final class C1281a extends C1282b {

        /* renamed from: b */
        public volatile C1308h f3163b;

        /* renamed from: c */
        public volatile C1317m f3164c;

        public C1281a(EmojiCompat emojiCompat) {
            super(emojiCompat);
        }
    }

    /* renamed from: androidx.emoji2.text.EmojiCompat$b */
    /* loaded from: classes.dex */
    public static class C1282b {

        /* renamed from: a */
        public final EmojiCompat f3165a;

        public C1282b(EmojiCompat emojiCompat) {
            this.f3165a = emojiCompat;
        }
    }

    /* renamed from: androidx.emoji2.text.EmojiCompat$c */
    /* loaded from: classes.dex */
    public static abstract class AbstractC1283c {
        @NonNull

        /* renamed from: a */
        public final InterfaceC1287g f3166a;

        /* renamed from: b */
        public int f3167b = 0;
        @NonNull

        /* renamed from: c */
        public final C1300d f3168c = new C1300d();

        public AbstractC1283c(@NonNull InterfaceC1287g interfaceC1287g) {
            this.f3166a = interfaceC1287g;
        }
    }

    /* renamed from: androidx.emoji2.text.EmojiCompat$d */
    /* loaded from: classes.dex */
    public interface InterfaceC1284d {
    }

    /* renamed from: androidx.emoji2.text.EmojiCompat$e */
    /* loaded from: classes.dex */
    public static abstract class AbstractC1285e {
        /* renamed from: a */
        public void mo10686a() {
        }

        /* renamed from: b */
        public void mo10645b() {
        }
    }

    /* renamed from: androidx.emoji2.text.EmojiCompat$f */
    /* loaded from: classes.dex */
    public static class RunnableC1286f implements Runnable {

        /* renamed from: a */
        public final ArrayList f3169a;

        /* renamed from: b */
        public final int f3170b;

        public RunnableC1286f(@NonNull List list, int i, @Nullable Throwable th) {
            if (list != null) {
                this.f3169a = new ArrayList(list);
                this.f3170b = i;
                return;
            }
            throw new NullPointerException("initCallbacks cannot be null");
        }

        @Override // java.lang.Runnable
        public final void run() {
            ArrayList arrayList = this.f3169a;
            int size = arrayList.size();
            int i = 0;
            if (this.f3170b != 1) {
                while (i < size) {
                    ((AbstractC1285e) arrayList.get(i)).mo10686a();
                    i++;
                }
                return;
            }
            while (i < size) {
                ((AbstractC1285e) arrayList.get(i)).mo10645b();
                i++;
            }
        }
    }

    /* renamed from: androidx.emoji2.text.EmojiCompat$g */
    /* loaded from: classes.dex */
    public interface InterfaceC1287g {
        /* renamed from: a */
        void mo10669a(@NonNull AbstractC1288h abstractC1288h);
    }

    /* renamed from: androidx.emoji2.text.EmojiCompat$h */
    /* loaded from: classes.dex */
    public static abstract class AbstractC1288h {
        /* renamed from: a */
        public abstract void mo10676a(@Nullable Throwable th);

        /* renamed from: b */
        public abstract void mo10675b(@NonNull C1317m c1317m);
    }

    @RequiresApi(19)
    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY})
    /* renamed from: androidx.emoji2.text.EmojiCompat$i */
    /* loaded from: classes.dex */
    public static class C1289i {
    }

    public EmojiCompat(@NonNull EmojiCompatInitializer.C1291a c1291a) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f3155a = reentrantReadWriteLock;
        this.f3157c = 3;
        InterfaceC1287g interfaceC1287g = c1291a.f3166a;
        this.f3160f = interfaceC1287g;
        int i = c1291a.f3167b;
        this.f3161g = i;
        this.f3162h = c1291a.f3168c;
        this.f3158d = new Handler(Looper.getMainLooper());
        this.f3156b = new C0472d();
        C1281a c1281a = new C1281a(this);
        this.f3159e = c1281a;
        reentrantReadWriteLock.writeLock().lock();
        if (i == 0) {
            try {
                this.f3157c = 0;
            } catch (Throwable th) {
                this.f3155a.writeLock().unlock();
                throw th;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (m10692b() == 0) {
            try {
                interfaceC1287g.mo10669a(new C1301e(c1281a));
            } catch (Throwable th2) {
                m10690d(th2);
            }
        }
    }

    @NonNull
    /* renamed from: a */
    public static EmojiCompat m10693a() {
        EmojiCompat emojiCompat;
        boolean z;
        synchronized (f3153i) {
            emojiCompat = f3154j;
            if (emojiCompat != null) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                throw new IllegalStateException("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
            }
        }
        return emojiCompat;
    }

    /* renamed from: b */
    public final int m10692b() {
        this.f3155a.readLock().lock();
        try {
            return this.f3157c;
        } finally {
            this.f3155a.readLock().unlock();
        }
    }

    /* renamed from: c */
    public final void m10691c() {
        boolean z;
        boolean z2 = true;
        if (this.f3161g == 1) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (m10692b() != 1) {
                z2 = false;
            }
            if (z2) {
                return;
            }
            this.f3155a.writeLock().lock();
            try {
                if (this.f3157c == 0) {
                    return;
                }
                this.f3157c = 0;
                this.f3155a.writeLock().unlock();
                C1281a c1281a = this.f3159e;
                EmojiCompat emojiCompat = c1281a.f3165a;
                try {
                    emojiCompat.f3160f.mo10669a(new C1301e(c1281a));
                    return;
                } catch (Throwable th) {
                    emojiCompat.m10690d(th);
                    return;
                }
            } finally {
                this.f3155a.writeLock().unlock();
            }
        }
        throw new IllegalStateException("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
    }

    /* renamed from: d */
    public final void m10690d(@Nullable Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.f3155a.writeLock().lock();
        try {
            this.f3157c = 2;
            arrayList.addAll(this.f3156b);
            this.f3156b.clear();
            this.f3155a.writeLock().unlock();
            this.f3158d.post(new RunnableC1286f(arrayList, this.f3157c, th));
        } catch (Throwable th2) {
            this.f3155a.writeLock().unlock();
            throw th2;
        }
    }

    /* renamed from: e */
    public final void m10689e() {
        ArrayList arrayList = new ArrayList();
        this.f3155a.writeLock().lock();
        try {
            this.f3157c = 1;
            arrayList.addAll(this.f3156b);
            this.f3156b.clear();
            this.f3155a.writeLock().unlock();
            this.f3158d.post(new RunnableC1286f(arrayList, this.f3157c, null));
        } catch (Throwable th) {
            this.f3155a.writeLock().unlock();
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x00e1, code lost:
        if (r3.m10673b(r15, r6, r13, r5.f3198d.f3220b) != false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00e3, code lost:
        if (r0 != null) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00e5, code lost:
        r0 = new androidx.emoji2.text.C1324r((android.text.Spannable) new android.text.SpannableString(r15));
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00ef, code lost:
        r10 = r5.f3198d.f3220b;
        r3.f3192a.getClass();
        r0.setSpan(new androidx.emoji2.text.C1321o(r10), r6, r13, 33);
        r7 = r7 + 1;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0110 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008f A[Catch: all -> 0x0175, TryCatch #0 {all -> 0x0175, blocks: (B:32:0x005a, B:35:0x005f, B:37:0x0063, B:39:0x0070, B:42:0x0080, B:44:0x0088, B:46:0x008b, B:48:0x008f, B:50:0x009b, B:51:0x009e, B:53:0x00ab, B:56:0x00b3, B:62:0x00cd, B:68:0x00d9, B:71:0x00e5, B:72:0x00ef, B:74:0x0104, B:76:0x010b, B:77:0x0110, B:79:0x011b, B:80:0x0120, B:82:0x0124, B:84:0x012a, B:86:0x012e, B:91:0x0139, B:94:0x0145, B:95:0x014b, B:97:0x015e, B:40:0x0076), top: B:117:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0145 A[Catch: all -> 0x0175, TryCatch #0 {all -> 0x0175, blocks: (B:32:0x005a, B:35:0x005f, B:37:0x0063, B:39:0x0070, B:42:0x0080, B:44:0x0088, B:46:0x008b, B:48:0x008f, B:50:0x009b, B:51:0x009e, B:53:0x00ab, B:56:0x00b3, B:62:0x00cd, B:68:0x00d9, B:71:0x00e5, B:72:0x00ef, B:74:0x0104, B:76:0x010b, B:77:0x0110, B:79:0x011b, B:80:0x0120, B:82:0x0124, B:84:0x012a, B:86:0x012e, B:91:0x0139, B:94:0x0145, B:95:0x014b, B:97:0x015e, B:40:0x0076), top: B:117:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x015e A[Catch: all -> 0x0175, TRY_LEAVE, TryCatch #0 {all -> 0x0175, blocks: (B:32:0x005a, B:35:0x005f, B:37:0x0063, B:39:0x0070, B:42:0x0080, B:44:0x0088, B:46:0x008b, B:48:0x008f, B:50:0x009b, B:51:0x009e, B:53:0x00ab, B:56:0x00b3, B:62:0x00cd, B:68:0x00d9, B:71:0x00e5, B:72:0x00ef, B:74:0x0104, B:76:0x010b, B:77:0x0110, B:79:0x011b, B:80:0x0120, B:82:0x0124, B:84:0x012a, B:86:0x012e, B:91:0x0139, B:94:0x0145, B:95:0x014b, B:97:0x015e, B:40:0x0076), top: B:117:0x005a }] */
    @androidx.annotation.Nullable
    @androidx.annotation.CheckResult
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.CharSequence m10688f(@androidx.annotation.IntRange(from = 0) int r13, @androidx.annotation.IntRange(from = 0) int r14, @androidx.annotation.Nullable java.lang.CharSequence r15) {
        /*
            Method dump skipped, instructions count: 407
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.emoji2.text.EmojiCompat.m10688f(int, int, java.lang.CharSequence):java.lang.CharSequence");
    }

    /* renamed from: g */
    public final void m10687g(@NonNull AbstractC1285e abstractC1285e) {
        if (abstractC1285e != null) {
            this.f3155a.writeLock().lock();
            try {
                if (this.f3157c != 1 && this.f3157c != 2) {
                    this.f3156b.add(abstractC1285e);
                    return;
                }
                this.f3158d.post(new RunnableC1286f(Arrays.asList(abstractC1285e), this.f3157c, null));
                return;
            } finally {
                this.f3155a.writeLock().unlock();
            }
        }
        throw new NullPointerException("initCallback cannot be null");
    }
}
