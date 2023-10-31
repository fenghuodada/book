package com.vungle.warren.model;

import androidx.annotation.NonNull;
import com.vungle.warren.AdConfig;

/* loaded from: classes3.dex */
public final class Placement {

    /* renamed from: a */
    public String f19769a;

    /* renamed from: b */
    public boolean f19770b;

    /* renamed from: c */
    public boolean f19771c;

    /* renamed from: d */
    public long f19772d;

    /* renamed from: e */
    public int f19773e;

    /* renamed from: f */
    public int f19774f;

    /* renamed from: g */
    public boolean f19775g;

    /* renamed from: h */
    public boolean f19776h;
    @PlacementAdType

    /* renamed from: i */
    public int f19777i;

    /* renamed from: j */
    public AdConfig.AdSize f19778j;

    /* renamed from: k */
    public AdConfig.AdSize f19779k;

    /* renamed from: l */
    public int f19780l;

    /* loaded from: classes3.dex */
    public @interface PlacementAdType {
    }

    public Placement() {
        this.f19777i = 0;
        this.f19779k = AdConfig.AdSize.VUNGLE_DEFAULT;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0173, code lost:
        if (r8.equals("banner") == false) goto L70;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public Placement(com.google.gson.C8695r r8) throws java.lang.IllegalArgumentException {
        /*
            Method dump skipped, instructions count: 424
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vungle.warren.model.Placement.<init>(com.google.gson.r):void");
    }

    /* renamed from: a */
    public final AdConfig.AdSize m1460a() {
        AdConfig.AdSize adSize = this.f19778j;
        return adSize == null ? AdConfig.AdSize.VUNGLE_DEFAULT : adSize;
    }

    /* renamed from: b */
    public final boolean m1459b() {
        if (this.f19780l == 0 && this.f19775g) {
            return false;
        }
        if (AdConfig.AdSize.isNonMrecBannerAdSize(this.f19778j)) {
            return true;
        }
        return this.f19770b;
    }

    /* renamed from: c */
    public final boolean m1458c() {
        return this.f19775g && this.f19780l > 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Placement.class != obj.getClass()) {
            return false;
        }
        Placement placement = (Placement) obj;
        String str = this.f19769a;
        if (str == null ? placement.f19769a == null : str.equals(placement.f19769a)) {
            return this.f19777i == placement.f19777i && this.f19770b == placement.f19770b && this.f19771c == placement.f19771c && this.f19775g == placement.f19775g && this.f19776h == placement.f19776h;
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f19769a;
        return ((((((((((str != null ? str.hashCode() : 0) * 31) + this.f19777i) * 31) + (this.f19770b ? 1 : 0)) * 31) + (this.f19771c ? 1 : 0)) * 31) + (this.f19775g ? 1 : 0)) * 31) + (this.f19776h ? 1 : 0);
    }

    @NonNull
    public final String toString() {
        return "Placement{identifier='" + this.f19769a + "', autoCached=" + this.f19770b + ", incentivized=" + this.f19771c + ", wakeupTime=" + this.f19772d + ", adRefreshDuration=" + this.f19773e + ", autoCachePriority=" + this.f19774f + ", headerBidding=" + this.f19775g + ", isValid=" + this.f19776h + ", placementAdType=" + this.f19777i + ", adSize=" + this.f19778j + ", maxHbCache=" + this.f19780l + ", adSize=" + this.f19778j + ", recommendedAdSize=" + this.f19779k + '}';
    }
}
