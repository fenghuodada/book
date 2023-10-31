package com.vungle.warren.model;

import android.text.TextUtils;
import android.util.Pair;
import android.webkit.URLUtil;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.coordinatorlayout.C0585a;
import com.google.gson.C8686j;
import com.google.gson.C8690m;
import com.google.gson.C8695r;
import com.google.gson.annotations.SerializedName;
import com.google.gson.internal.C8668n;
import com.vungle.warren.AdConfig;
import java.io.File;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import okhttp3.HttpUrl;

/* loaded from: classes3.dex */
public final class Advertisement implements Comparable<Advertisement> {

    /* renamed from: X */
    public static final List f19711X = Arrays.asList("play_percentage", "checkpoint.0", "checkpoint.25", "checkpoint.50", "checkpoint.75", "checkpoint.100");

    /* renamed from: Y */
    public static final String[] f19712Y = new String[0];

    /* renamed from: A */
    public Map<String, String> f19713A;

    /* renamed from: B */
    public Map<String, String> f19714B;

    /* renamed from: C */
    public Map<String, Pair<String, String>> f19715C;

    /* renamed from: D */
    public final HashMap f19716D;

    /* renamed from: E */
    public String f19717E;

    /* renamed from: F */
    public String f19718F;

    /* renamed from: G */
    public boolean f19719G;
    @Nullable

    /* renamed from: H */
    public String f19720H;

    /* renamed from: I */
    public boolean f19721I;

    /* renamed from: J */
    public String f19722J;

    /* renamed from: K */
    public String f19723K;

    /* renamed from: L */
    public boolean f19724L;

    /* renamed from: M */
    public int f19725M;

    /* renamed from: N */
    public String f19726N;

    /* renamed from: O */
    public long f19727O;

    /* renamed from: P */
    public String f19728P;
    @VisibleForTesting

    /* renamed from: Q */
    public long f19729Q;
    @VisibleForTesting

    /* renamed from: R */
    public long f19730R;
    @VisibleForTesting

    /* renamed from: S */
    public long f19731S;

    /* renamed from: T */
    public long f19732T;

    /* renamed from: U */
    public boolean f19733U;

    /* renamed from: V */
    public boolean f19734V;

    /* renamed from: W */
    public List<String> f19735W;

    /* renamed from: a */
    public final C8686j f19736a;
    @AdType

    /* renamed from: b */
    public int f19737b;

    /* renamed from: c */
    public String f19738c;

    /* renamed from: d */
    public String f19739d;

    /* renamed from: e */
    public long f19740e;

    /* renamed from: f */
    public List<C9850a> f19741f;

    /* renamed from: g */
    public Map<String, ArrayList<String>> f19742g;

    /* renamed from: h */
    public int f19743h;

    /* renamed from: i */
    public String f19744i;

    /* renamed from: j */
    public int f19745j;

    /* renamed from: k */
    public int f19746k;

    /* renamed from: l */
    public int f19747l;

    /* renamed from: m */
    public String f19748m;

    /* renamed from: n */
    public int f19749n;

    /* renamed from: o */
    public int f19750o;

    /* renamed from: p */
    public String f19751p;

    /* renamed from: q */
    public String f19752q;

    /* renamed from: r */
    public boolean f19753r;

    /* renamed from: s */
    public boolean f19754s;

    /* renamed from: t */
    public String f19755t;

    /* renamed from: u */
    public String f19756u;

    /* renamed from: v */
    public AdConfig f19757v;

    /* renamed from: w */
    public int f19758w;

    /* renamed from: x */
    public String f19759x;

    /* renamed from: y */
    public String f19760y;

    /* renamed from: z */
    public String f19761z;

    /* loaded from: classes3.dex */
    public @interface AdType {
    }

    /* loaded from: classes3.dex */
    public @interface CacheKey {
    }

    /* loaded from: classes3.dex */
    public @interface Orientation {
    }

    /* loaded from: classes3.dex */
    public @interface State {
    }

    /* renamed from: com.vungle.warren.model.Advertisement$a */
    /* loaded from: classes3.dex */
    public static class C9850a implements Comparable<C9850a> {
        @SerializedName("percentage")

        /* renamed from: a */
        private byte f19762a;
        @SerializedName("urls")

        /* renamed from: b */
        private String[] f19763b;

        public C9850a(C8690m c8690m, byte b) {
            if (c8690m.size() == 0) {
                throw new IllegalArgumentException("Empty URLS!");
            }
            this.f19763b = new String[c8690m.size()];
            for (int i = 0; i < c8690m.size(); i++) {
                this.f19763b[i] = c8690m.m3222t(i).mo3202p();
            }
            this.f19762a = b;
        }

        public C9850a(C8695r c8695r) throws IllegalArgumentException {
            if (!C9874j.m1441c(c8695r, "checkpoint")) {
                throw new IllegalArgumentException("Checkpoint missing percentage!");
            }
            this.f19762a = (byte) (c8695r.m3213w("checkpoint").mo3205j() * 100.0f);
            if (!C9874j.m1441c(c8695r, "urls")) {
                throw new IllegalArgumentException("Checkpoint missing reporting URL!");
            }
            C8690m m3212y = c8695r.m3212y("urls");
            this.f19763b = new String[m3212y.size()];
            for (int i = 0; i < m3212y.size(); i++) {
                if (m3212y.m3222t(i) == null || "null".equalsIgnoreCase(m3212y.m3222t(i).toString())) {
                    this.f19763b[i] = "";
                } else {
                    this.f19763b[i] = m3212y.m3222t(i).mo3202p();
                }
            }
        }

        /* renamed from: a */
        public final byte m1467a() {
            return this.f19762a;
        }

        /* renamed from: b */
        public final String[] m1466b() {
            return (String[]) this.f19763b.clone();
        }

        @Override // java.lang.Comparable
        public final int compareTo(@NonNull C9850a c9850a) {
            return Float.compare(this.f19762a, c9850a.f19762a);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C9850a)) {
                return false;
            }
            C9850a c9850a = (C9850a) obj;
            if (c9850a.f19762a != this.f19762a || c9850a.f19763b.length != this.f19763b.length) {
                return false;
            }
            int i = 0;
            while (true) {
                String[] strArr = this.f19763b;
                if (i >= strArr.length) {
                    return true;
                }
                if (!c9850a.f19763b[i].equals(strArr[i])) {
                    return false;
                }
                i++;
            }
        }

        public final int hashCode() {
            String[] strArr = this.f19763b;
            return (((this.f19762a * 31) + strArr.length) * 31) + Arrays.hashCode(strArr);
        }
    }

    public Advertisement() {
        this.f19736a = new C8686j();
        this.f19742g = new C8668n();
        this.f19754s = true;
        this.f19714B = new HashMap();
        this.f19715C = new HashMap();
        this.f19716D = new HashMap();
        this.f19725M = 0;
        this.f19734V = false;
        this.f19735W = new ArrayList();
    }

    /* JADX WARN: Code restructure failed: missing block: B:115:0x028e, code lost:
        if (r2 > 0) goto L106;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public Advertisement(@androidx.annotation.NonNull com.google.gson.C8695r r15) throws java.lang.IllegalArgumentException {
        /*
            Method dump skipped, instructions count: 1516
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vungle.warren.model.Advertisement.<init>(com.google.gson.r):void");
    }

    @Nullable
    /* renamed from: a */
    public final String m1473a(boolean z) {
        int i = this.f19737b;
        if (i == 0) {
            return z ? this.f19756u : this.f19755t;
        } else if (i == 1) {
            return this.f19756u;
        } else {
            throw new IllegalArgumentException("Unknown AdType " + this.f19737b);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001d A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String m1472b() {
        /*
            r3 = this;
            java.lang.String r0 = r3.f19744i
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L16
            java.lang.String r1 = "\\|"
            java.lang.String[] r0 = r0.split(r1)
            int r1 = r0.length
            r2 = 1
            if (r1 < r2) goto L16
            r1 = 0
            r0 = r0[r1]
            goto L17
        L16:
            r0 = 0
        L17:
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L1f
            java.lang.String r0 = "unknown"
        L1f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vungle.warren.model.Advertisement.m1472b():java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001d A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String m1471c() {
        /*
            r3 = this;
            java.lang.String r0 = r3.f19744i
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L16
            java.lang.String r1 = "\\|"
            java.lang.String[] r0 = r0.split(r1)
            int r1 = r0.length
            r2 = 2
            if (r1 < r2) goto L16
            r1 = 1
            r0 = r0[r1]
            goto L17
        L16:
            r0 = 0
        L17:
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L1f
            java.lang.String r0 = "unknown"
        L1f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vungle.warren.model.Advertisement.m1471c():java.lang.String");
    }

    @Override // java.lang.Comparable
    public final int compareTo(Advertisement advertisement) {
        Advertisement advertisement2 = advertisement;
        if (advertisement2 == null) {
            return 1;
        }
        String str = advertisement2.f19738c;
        if (str == null) {
            if (this.f19738c != null) {
                return 1;
            }
            return 0;
        }
        String str2 = this.f19738c;
        if (str2 == null) {
            return -1;
        }
        return str2.compareTo(str);
    }

    /* renamed from: d */
    public final HashMap m1470d() {
        boolean z;
        HashMap hashMap = new HashMap();
        int i = this.f19737b;
        if (i != 0) {
            if (i == 1) {
                if (!"native".equals(this.f19718F)) {
                    hashMap.put("template", this.f19761z);
                }
                for (Map.Entry<String, Pair<String, String>> entry : this.f19715C.entrySet()) {
                    String str = (String) entry.getValue().first;
                    if (!TextUtils.isEmpty(str) && HttpUrl.parse(str) != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        hashMap.put(URLUtil.guessFileName(str, null, null), str);
                    }
                }
            } else {
                throw new IllegalStateException("Advertisement created without adType!");
            }
        } else {
            hashMap.put("video", this.f19748m);
            if (!TextUtils.isEmpty(this.f19752q)) {
                hashMap.put("postroll", this.f19752q);
            }
        }
        return hashMap;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof Advertisement) {
            Advertisement advertisement = (Advertisement) obj;
            if (advertisement.f19737b == this.f19737b && advertisement.f19743h == this.f19743h && advertisement.f19745j == this.f19745j && advertisement.f19746k == this.f19746k && advertisement.f19747l == this.f19747l && advertisement.f19749n == this.f19749n && advertisement.f19750o == this.f19750o && advertisement.f19753r == this.f19753r && advertisement.f19754s == this.f19754s && advertisement.f19758w == this.f19758w && advertisement.f19719G == this.f19719G && advertisement.f19721I == this.f19721I && advertisement.f19725M == this.f19725M && (str = advertisement.f19738c) != null && (str2 = this.f19738c) != null && str.equals(str2) && advertisement.f19744i.equals(this.f19744i) && advertisement.f19748m.equals(this.f19748m) && advertisement.f19751p.equals(this.f19751p) && advertisement.f19752q.equals(this.f19752q) && advertisement.f19755t.equals(this.f19755t) && advertisement.f19756u.equals(this.f19756u) && advertisement.f19759x.equals(this.f19759x) && advertisement.f19760y.equals(this.f19760y)) {
                String str3 = advertisement.f19720H;
                if (str3 == null ? this.f19720H == null : str3.equals(this.f19720H)) {
                    if (advertisement.f19722J.equals(this.f19722J) && advertisement.f19723K.equals(this.f19723K) && advertisement.f19741f.size() == this.f19741f.size()) {
                        for (int i = 0; i < this.f19741f.size(); i++) {
                            if (!advertisement.f19741f.get(i).equals(this.f19741f.get(i))) {
                                return false;
                            }
                        }
                        return this.f19742g.equals(advertisement.f19742g) && advertisement.f19732T == this.f19732T && advertisement.f19733U == this.f19733U && advertisement.f19724L == this.f19724L;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0040, code lost:
        if (r1 == null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004b, code lost:
        if (r1 == null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004d, code lost:
        com.vungle.warren.VungleLogger.m1599g(com.vungle.warren.model.Advertisement.class.getSimpleName().concat("#getTpatUrls"), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0058, code lost:
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005f, code lost:
        return (java.lang.String[]) r1.toArray(r5);
     */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String[] m1469f(@androidx.annotation.NonNull java.lang.String r8) {
        /*
            r7 = this;
            java.lang.String r0 = "Unknown TPAT Event "
            java.lang.String r0 = androidx.constraintlayout.motion.widget.C0552c.m12192b(r0, r8)
            java.util.Map<java.lang.String, java.util.ArrayList<java.lang.String>> r1 = r7.f19742g
            java.lang.Object r1 = r1.get(r8)
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            int r2 = r7.f19737b
            java.lang.String r3 = "#getTpatUrls"
            java.lang.Class<com.vungle.warren.model.Advertisement> r4 = com.vungle.warren.model.Advertisement.class
            java.lang.String[] r5 = com.vungle.warren.model.Advertisement.f19712Y
            if (r2 == 0) goto L4b
            r6 = 1
            if (r2 != r6) goto L43
            java.lang.String r2 = "checkpoint"
            boolean r2 = r8.startsWith(r2)
            if (r2 == 0) goto L40
            java.lang.String r0 = "\\."
            java.lang.String[] r8 = r8.split(r0)
            r8 = r8[r6]
            int r8 = java.lang.Integer.parseInt(r8)
            java.util.List<com.vungle.warren.model.Advertisement$a> r0 = r7.f19741f
            int r8 = r8 / 25
            java.lang.Object r8 = r0.get(r8)
            com.vungle.warren.model.Advertisement$a r8 = (com.vungle.warren.model.Advertisement.C9850a) r8
            if (r8 == 0) goto L3f
            java.lang.String[] r5 = r8.m1466b()
        L3f:
            return r5
        L40:
            if (r1 != 0) goto L59
            goto L4d
        L43:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "Unknown Advertisement Type!"
            r8.<init>(r0)
            throw r8
        L4b:
            if (r1 != 0) goto L59
        L4d:
            java.lang.String r8 = r4.getSimpleName()
            java.lang.String r8 = r8.concat(r3)
            com.vungle.warren.VungleLogger.m1599g(r8, r0)
            return r5
        L59:
            java.lang.Object[] r8 = r1.toArray(r5)
            java.lang.String[] r8 = (java.lang.String[]) r8
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vungle.warren.model.Advertisement.m1469f(java.lang.String):java.lang.String[]");
    }

    /* renamed from: g */
    public final void m1468g(List<AdAsset> list) {
        for (Map.Entry<String, Pair<String, String>> entry : this.f19715C.entrySet()) {
            String str = (String) entry.getValue().first;
            Iterator<AdAsset> it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    AdAsset next = it.next();
                    if (!TextUtils.isEmpty(next.f19704d) && next.f19704d.equals(str)) {
                        File file = new File(next.f19705e);
                        if (file.exists()) {
                            Map<String, String> map = this.f19714B;
                            String key = entry.getKey();
                            map.put(key, "file://" + file.getPath());
                        }
                    }
                }
            }
        }
    }

    @NonNull
    public final String getId() {
        String str = this.f19738c;
        return str == null ? "" : str;
    }

    public final int hashCode() {
        int m12131a = C0585a.m12131a(this.f19738c);
        int m12131a2 = C0585a.m12131a(this.f19741f);
        int m12131a3 = C0585a.m12131a(this.f19742g);
        int m12131a4 = C0585a.m12131a(this.f19744i);
        int m12131a5 = C0585a.m12131a(this.f19748m);
        int m12131a6 = C0585a.m12131a(this.f19751p);
        int m12131a7 = C0585a.m12131a(this.f19752q);
        int m12131a8 = C0585a.m12131a(this.f19755t);
        int m12131a9 = C0585a.m12131a(this.f19756u);
        int m12131a10 = C0585a.m12131a(this.f19759x);
        int m12131a11 = C0585a.m12131a(this.f19760y);
        int m12131a12 = C0585a.m12131a(this.f19735W);
        int m12131a13 = C0585a.m12131a(this.f19722J);
        return (((((int) (((((C0585a.m12131a(this.f19723K) + ((m12131a13 + ((((((((m12131a12 + ((m12131a11 + ((m12131a10 + ((((m12131a9 + ((m12131a8 + ((((((m12131a7 + ((m12131a6 + ((((((m12131a5 + ((((((((m12131a4 + ((((m12131a3 + ((m12131a2 + ((m12131a + (this.f19737b * 31)) * 31)) * 31)) * 31) + this.f19743h) * 31)) * 31) + this.f19745j) * 31) + this.f19746k) * 31) + this.f19747l) * 31)) * 31) + this.f19749n) * 31) + this.f19750o) * 31)) * 31)) * 31) + (this.f19753r ? 1 : 0)) * 31) + (this.f19754s ? 1 : 0)) * 31)) * 31)) * 31) + this.f19758w) * 31)) * 31)) * 31)) * 31) + (this.f19719G ? 1 : 0)) * 31) + C0585a.m12131a(this.f19720H)) * 31) + (this.f19721I ? 1 : 0)) * 31)) * 31)) * 31) + this.f19725M) * 31) + this.f19732T)) * 31) + (this.f19733U ? 1 : 0)) * 31) + (this.f19724L ? 1 : 0);
    }

    @NonNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("Advertisement{adType=");
        sb.append(this.f19737b);
        sb.append(", identifier='");
        sb.append(this.f19738c);
        sb.append("', appID='");
        sb.append(this.f19739d);
        sb.append("', expireTime=");
        sb.append(this.f19740e);
        sb.append(", checkpoints=");
        List<C9850a> list = this.f19741f;
        Type type = C9856b.f19813e;
        C8686j c8686j = this.f19736a;
        sb.append(c8686j.m3229i(list, type));
        sb.append(", winNotifications='");
        sb.append(TextUtils.join(",", this.f19735W));
        sb.append(", dynamicEventsAndUrls=");
        sb.append(c8686j.m3229i(this.f19742g, C9856b.f19814f));
        sb.append(", delay=");
        sb.append(this.f19743h);
        sb.append(", campaign='");
        sb.append(this.f19744i);
        sb.append("', showCloseDelay=");
        sb.append(this.f19745j);
        sb.append(", showCloseIncentivized=");
        sb.append(this.f19746k);
        sb.append(", countdown=");
        sb.append(this.f19747l);
        sb.append(", videoUrl='");
        sb.append(this.f19748m);
        sb.append("', videoWidth=");
        sb.append(this.f19749n);
        sb.append(", videoHeight=");
        sb.append(this.f19750o);
        sb.append(", md5='");
        sb.append(this.f19751p);
        sb.append("', postrollBundleUrl='");
        sb.append(this.f19752q);
        sb.append("', ctaOverlayEnabled=");
        sb.append(this.f19753r);
        sb.append(", ctaClickArea=");
        sb.append(this.f19754s);
        sb.append(", ctaDestinationUrl='");
        sb.append(this.f19755t);
        sb.append("', ctaUrl='");
        sb.append(this.f19756u);
        sb.append("', adConfig=");
        sb.append(this.f19757v);
        sb.append(", retryCount=");
        sb.append(this.f19758w);
        sb.append(", adToken='");
        sb.append(this.f19759x);
        sb.append("', videoIdentifier='");
        sb.append(this.f19760y);
        sb.append("', templateUrl='");
        sb.append(this.f19761z);
        sb.append("', templateSettings=");
        sb.append(this.f19713A);
        sb.append(", mraidFiles=");
        sb.append(this.f19714B);
        sb.append(", cacheableAssets=");
        sb.append(this.f19715C);
        sb.append(", templateId='");
        sb.append(this.f19717E);
        sb.append("', templateType='");
        sb.append(this.f19718F);
        sb.append("', enableOm=");
        sb.append(this.f19719G);
        sb.append(", oMSDKExtraVast='");
        sb.append(this.f19720H);
        sb.append("', requiresNonMarketInstall=");
        sb.append(this.f19721I);
        sb.append(", adMarketId='");
        sb.append(this.f19722J);
        sb.append("', bidToken='");
        sb.append(this.f19723K);
        sb.append("', state=");
        sb.append(this.f19725M);
        sb.append("', assetDownloadStartTime='");
        sb.append(this.f19729Q);
        sb.append("', assetDownloadDuration='");
        sb.append(this.f19730R);
        sb.append("', adRequestStartTime='");
        sb.append(this.f19731S);
        sb.append("', requestTimestamp='");
        sb.append(this.f19732T);
        sb.append("', headerBidding='");
        sb.append(this.f19724L);
        sb.append('}');
        return sb.toString();
    }
}
