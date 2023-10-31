package com.applovin.impl.mediation.p012b.p013a;

import com.applovin.impl.sdk.C3349v;
import com.applovin.impl.sdk.utils.C3334l;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.nativeAds.adPlacer.MaxAdPlacerSettings;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;

/* renamed from: com.applovin.impl.mediation.b.a.a */
/* loaded from: classes.dex */
public class C2859a {

    /* renamed from: a */
    private final C3334l<Integer> f6910a = new C3334l<>();

    /* renamed from: b */
    private final TreeSet<Integer> f6911b = new TreeSet<>();

    /* renamed from: c */
    private final Map<Integer, MaxAd> f6912c = new HashMap();

    /* renamed from: d */
    private int f6913d;

    /* renamed from: e */
    private int f6914e;

    public C2859a(MaxAdPlacerSettings maxAdPlacerSettings) {
        m8594a(maxAdPlacerSettings);
    }

    /* renamed from: a */
    private int m8596a(int i, boolean z) {
        int m6921d = this.f6910a.m6921d(Integer.valueOf(i));
        if (!z) {
            int i2 = i + m6921d;
            while (m6921d < this.f6910a.size() && i2 >= this.f6910a.m6927a(m6921d).intValue()) {
                i2++;
                m6921d++;
            }
        }
        return m6921d;
    }

    /* renamed from: a */
    private void m8594a(MaxAdPlacerSettings maxAdPlacerSettings) {
        if (!maxAdPlacerSettings.hasValidPositioning()) {
            C3349v.m6846i("MaxAdPlacerData", "No positioning info was provided with ad placer settings. You must set at least (1) one or more fixed positions or (2) a repeating interval greater than or equal to 2 for the ad placer to determine where to position ads.");
            return;
        }
        this.f6910a.addAll(maxAdPlacerSettings.getFixedPositions());
        if (!maxAdPlacerSettings.isRepeatingEnabled()) {
            return;
        }
        int repeatingInterval = maxAdPlacerSettings.getRepeatingInterval();
        if (this.f6910a.isEmpty()) {
            this.f6910a.m6925a((C3334l<Integer>) Integer.valueOf(repeatingInterval - 1));
        }
        int intValue = this.f6910a.m6928a().intValue();
        while (true) {
            intValue += repeatingInterval;
            if (this.f6910a.size() >= maxAdPlacerSettings.getMaxAdCount()) {
                return;
            }
            this.f6910a.m6925a((C3334l<Integer>) Integer.valueOf(intValue));
        }
    }

    /* renamed from: c */
    private void m8587c(int i, int i2) {
        if (this.f6912c.containsKey(Integer.valueOf(i))) {
            this.f6912c.put(Integer.valueOf(i2), this.f6912c.get(Integer.valueOf(i)));
            this.f6911b.add(Integer.valueOf(i2));
            this.f6912c.remove(Integer.valueOf(i));
            this.f6911b.remove(Integer.valueOf(i));
        }
    }

    /* renamed from: a */
    public int m8599a() {
        int i = this.f6913d;
        if (i != -1 && this.f6914e != -1) {
            while (i <= this.f6914e) {
                if (m8598a(i) && !m8591b(i)) {
                    return i;
                }
                i++;
            }
        }
        return -1;
    }

    /* renamed from: a */
    public void m8597a(int i, int i2) {
        this.f6913d = i;
        this.f6914e = i2;
    }

    /* renamed from: a */
    public void m8595a(MaxAd maxAd, int i) {
        this.f6912c.put(Integer.valueOf(i), maxAd);
        this.f6911b.add(Integer.valueOf(i));
    }

    /* renamed from: a */
    public void m8593a(Collection<Integer> collection) {
        for (Integer num : collection) {
            this.f6912c.remove(num);
            this.f6911b.remove(num);
        }
    }

    /* renamed from: a */
    public boolean m8598a(int i) {
        return this.f6910a.contains(Integer.valueOf(i));
    }

    /* renamed from: b */
    public Collection<Integer> m8592b() {
        return new TreeSet((SortedSet) this.f6911b);
    }

    /* renamed from: b */
    public void m8590b(int i, int i2) {
        m8581i(i);
        m8582h(i2);
    }

    /* renamed from: b */
    public boolean m8591b(int i) {
        return this.f6911b.contains(Integer.valueOf(i));
    }

    /* renamed from: c */
    public MaxAd m8588c(int i) {
        return this.f6912c.get(Integer.valueOf(i));
    }

    /* renamed from: c */
    public void m8589c() {
        this.f6912c.clear();
        this.f6911b.clear();
    }

    /* renamed from: d */
    public Collection<Integer> m8586d(int i) {
        return new TreeSet((SortedSet) this.f6911b.tailSet(Integer.valueOf(i), false));
    }

    /* renamed from: e */
    public int m8585e(int i) {
        if (i == 0) {
            return 0;
        }
        return i + m8596a(i - 1, false);
    }

    /* renamed from: f */
    public int m8584f(int i) {
        return i + m8596a(i, false);
    }

    /* renamed from: g */
    public int m8583g(int i) {
        if (m8598a(i)) {
            return -1;
        }
        return i - m8596a(i, true);
    }

    /* renamed from: h */
    public void m8582h(int i) {
        int m6922c = this.f6910a.m6922c(Integer.valueOf(i));
        for (int size = this.f6910a.size() - 1; size >= m6922c; size--) {
            Integer m6927a = this.f6910a.m6927a(size);
            int intValue = m6927a.intValue() + 1;
            m8587c(m6927a.intValue(), intValue);
            this.f6910a.m6926a(size, Integer.valueOf(intValue));
        }
    }

    /* renamed from: i */
    public void m8581i(int i) {
        int m6922c = this.f6910a.m6922c(Integer.valueOf(i));
        if (m8598a(i)) {
            this.f6912c.remove(Integer.valueOf(i));
            this.f6911b.remove(Integer.valueOf(i));
            this.f6910a.m6924b(m6922c);
        }
        while (m6922c < this.f6910a.size()) {
            Integer m6927a = this.f6910a.m6927a(m6922c);
            int intValue = m6927a.intValue() - 1;
            m8587c(m6927a.intValue(), intValue);
            this.f6910a.m6926a(m6922c, Integer.valueOf(intValue));
            m6922c++;
        }
    }
}
