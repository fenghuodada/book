package com.applovin.impl.sdk.utils;

import android.os.Bundle;
import com.applovin.adview.AppLovinAdView;
import com.applovin.impl.mediation.p011a.AbstractC2823a;
import com.applovin.impl.p008a.C2649a;
import com.applovin.impl.sdk.C3214m;
import com.applovin.impl.sdk.p029ad.AbstractC3080e;
import com.applovin.impl.sdk.p029ad.C3075a;

/* renamed from: com.applovin.impl.sdk.utils.k */
/* loaded from: classes.dex */
public class C3333k {

    /* renamed from: a */
    private final StringBuilder f8786a = new StringBuilder();

    /* renamed from: a */
    public C3333k m6939a() {
        this.f8786a.append("\n========================================");
        return this;
    }

    /* renamed from: a */
    public C3333k m6938a(Bundle bundle) {
        if (bundle == null) {
            return this;
        }
        for (String str : bundle.keySet()) {
            m6932a(str, bundle.get(str));
        }
        return this;
    }

    /* renamed from: a */
    public C3333k m6937a(AppLovinAdView appLovinAdView) {
        return m6932a("Size", appLovinAdView.getSize().getWidth() + "x" + appLovinAdView.getSize().getHeight()).m6932a("Alpha", Float.valueOf(appLovinAdView.getAlpha())).m6932a("Visibility", C3340q.m6886b(appLovinAdView.getVisibility()));
    }

    /* renamed from: a */
    public C3333k m6936a(AbstractC2823a abstractC2823a) {
        return m6932a("Network", abstractC2823a.m8742M()).m6932a("Format", abstractC2823a.getFormat().getLabel()).m6932a("Ad Unit ID", abstractC2823a.getAdUnitId()).m6932a("Placement", abstractC2823a.getPlacement()).m6932a("Network Placement", abstractC2823a.m8792l()).m6932a("Serve ID", abstractC2823a.m8798f()).m6932a("Creative ID", StringUtils.isValidString(abstractC2823a.getCreativeId()) ? abstractC2823a.getCreativeId() : "None").m6932a("DSP Name", StringUtils.isValidString(abstractC2823a.getDspName()) ? abstractC2823a.getDspName() : "None").m6932a("DSP ID", StringUtils.isValidString(abstractC2823a.getDspId()) ? abstractC2823a.getDspId() : "None").m6932a("Server Parameters", abstractC2823a.m8734U());
    }

    /* renamed from: a */
    public C3333k m6935a(AbstractC3080e abstractC3080e) {
        boolean z = abstractC3080e instanceof C2649a;
        m6932a("Format", abstractC3080e.getAdZone().m7986b() != null ? abstractC3080e.getAdZone().m7986b().getLabel() : null).m6932a("Ad ID", Long.valueOf(abstractC3080e.getAdIdNumber())).m6932a("Zone ID", abstractC3080e.getAdZone().m7991a()).m6932a("Source", abstractC3080e.getSource()).m6932a("Ad Class", z ? "VastAd" : "AdServerAd");
        String dspName = abstractC3080e.getDspName();
        if (StringUtils.isValidString(dspName)) {
            m6932a("DSP Name", dspName);
        }
        if (z) {
            m6932a("VAST DSP", ((C2649a) abstractC3080e).m9287l());
        }
        return this;
    }

    /* renamed from: a */
    public C3333k m6934a(C3214m c3214m) {
        return m6932a("Muted", Boolean.valueOf(c3214m.m7396p().isMuted())).m6932a("ExoPlayer eligible", Boolean.valueOf(Utils.checkExoPlayerEligibility(c3214m)));
    }

    /* renamed from: a */
    public C3333k m6933a(String str) {
        StringBuilder sb = this.f8786a;
        sb.append("\n");
        sb.append(str);
        return this;
    }

    /* renamed from: a */
    public C3333k m6932a(String str, Object obj) {
        return m6931a(str, obj, "");
    }

    /* renamed from: a */
    public C3333k m6931a(String str, Object obj, String str2) {
        StringBuilder sb = this.f8786a;
        sb.append("\n");
        sb.append(str);
        sb.append(": ");
        sb.append(obj);
        sb.append(str2);
        return this;
    }

    /* renamed from: b */
    public C3333k m6930b(AbstractC3080e abstractC3080e) {
        m6932a("Target", abstractC3080e.m7883p()).m6932a("close_style", abstractC3080e.m7878u()).m6931a("close_delay_graphic", Long.valueOf(abstractC3080e.m7880s()), "s");
        if (abstractC3080e instanceof C3075a) {
            C3075a c3075a = (C3075a) abstractC3080e;
            m6932a("HTML", c3075a.m8006b().substring(0, Math.min(c3075a.m8006b().length(), 64)));
        }
        if (abstractC3080e.hasVideoUrl()) {
            m6931a("close_delay", Long.valueOf(abstractC3080e.m7882q()), "s").m6932a("skip_style", abstractC3080e.m7876w()).m6932a("Streaming", Boolean.valueOf(abstractC3080e.mo7890f())).m6932a("Video Location", abstractC3080e.mo7894d()).m6932a("video_button_properties", abstractC3080e.m7972C());
        }
        return this;
    }

    /* renamed from: b */
    public C3333k m6929b(String str) {
        this.f8786a.append(str);
        return this;
    }

    public String toString() {
        return this.f8786a.toString();
    }
}
