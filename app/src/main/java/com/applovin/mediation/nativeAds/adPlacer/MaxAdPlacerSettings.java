package com.applovin.mediation.nativeAds.adPlacer;

import androidx.annotation.NonNull;
import com.applovin.impl.sdk.C3349v;
import java.util.Set;
import java.util.TreeSet;

/* loaded from: classes.dex */
public class MaxAdPlacerSettings {
    public static final int MIN_REPEATING_INTERVAL = 2;

    /* renamed from: a */
    private final String f8941a;

    /* renamed from: b */
    private final Set<Integer> f8942b = new TreeSet();

    /* renamed from: c */
    private int f8943c = 0;

    /* renamed from: d */
    private int f8944d = 256;

    /* renamed from: e */
    private int f8945e = 4;

    public MaxAdPlacerSettings(String str) {
        this.f8941a = str;
    }

    public void addFixedPosition(int i) {
        this.f8942b.add(Integer.valueOf(i));
    }

    public String getAdUnitId() {
        return this.f8941a;
    }

    public Set<Integer> getFixedPositions() {
        return this.f8942b;
    }

    public int getMaxAdCount() {
        return this.f8944d;
    }

    public int getMaxPreloadedAdCount() {
        return this.f8945e;
    }

    public int getRepeatingInterval() {
        return this.f8943c;
    }

    public boolean hasValidPositioning() {
        return !this.f8942b.isEmpty() || isRepeatingEnabled();
    }

    public boolean isRepeatingEnabled() {
        return this.f8943c >= 2;
    }

    public void resetFixedPositions() {
        this.f8942b.clear();
    }

    public void setMaxAdCount(int i) {
        this.f8944d = i;
    }

    public void setMaxPreloadedAdCount(int i) {
        this.f8945e = i;
    }

    public void setRepeatingInterval(int i) {
        if (i >= 2) {
            this.f8943c = i;
            C3349v.m6849f("MaxAdPlacerSettings", "Repeating interval set to " + i);
            return;
        }
        this.f8943c = 0;
        C3349v.m6847h("MaxAdPlacerSettings", "Repeating interval has been disabled, since it has been set to " + i + ", which is less than minimum value of 2");
    }

    @NonNull
    public String toString() {
        return "MaxAdPlacerSettings{adUnitId='" + this.f8941a + "', fixedPositions=" + this.f8942b + ", repeatingInterval=" + this.f8943c + ", maxAdCount=" + this.f8944d + ", maxPreloadedAdCount=" + this.f8945e + '}';
    }
}
