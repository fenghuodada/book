package com.vungle.warren.model;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.gson.C8695r;
import com.vungle.warren.VungleApiClient;
import com.vungle.warren.persistence.C9919c;
import com.vungle.warren.persistence.C9928h;
import com.vungle.warren.utility.InterfaceC10107v;
import java.util.concurrent.TimeUnit;

/* renamed from: com.vungle.warren.model.i */
/* loaded from: classes3.dex */
public final class C9873i {

    /* renamed from: a */
    public final C9867g f19833a;

    /* renamed from: b */
    public final C9928h f19834b;

    public C9873i(@NonNull C9928h c9928h, InterfaceC10107v interfaceC10107v) {
        this.f19834b = c9928h;
        C9867g c9867g = (C9867g) c9928h.m1383p(C9867g.class, "consentIsImportantToVungle").get(interfaceC10107v.mo1238a(), TimeUnit.MILLISECONDS);
        if (c9867g == null) {
            c9867g = new C9867g("consentIsImportantToVungle");
            c9867g.m1445d("", "consent_message_version");
            c9867g.m1445d(VungleApiClient.ConnectionTypeDetail.UNKNOWN, "consent_status");
            c9867g.m1445d("no_interaction", "consent_source");
            c9867g.m1445d(0L, "timestamp");
        }
        this.f19833a = c9867g;
    }

    /* renamed from: a */
    public final void m1444a(C8695r c8695r) throws C9919c.C9920a {
        boolean z = C9874j.m1441c(c8695r, "is_country_data_protected") && c8695r.m3213w("is_country_data_protected").mo3207b();
        String mo3202p = C9874j.m1441c(c8695r, "consent_title") ? c8695r.m3213w("consent_title").mo3202p() : "";
        String mo3202p2 = C9874j.m1441c(c8695r, "consent_message") ? c8695r.m3213w("consent_message").mo3202p() : "";
        String mo3202p3 = C9874j.m1441c(c8695r, "consent_message_version") ? c8695r.m3213w("consent_message_version").mo3202p() : "";
        String mo3202p4 = C9874j.m1441c(c8695r, "button_accept") ? c8695r.m3213w("button_accept").mo3202p() : "";
        String mo3202p5 = C9874j.m1441c(c8695r, "button_deny") ? c8695r.m3213w("button_deny").mo3202p() : "";
        Boolean valueOf = Boolean.valueOf(z);
        C9867g c9867g = this.f19833a;
        c9867g.m1445d(valueOf, "is_country_data_protected");
        if (TextUtils.isEmpty(mo3202p)) {
            mo3202p = "Targeted Ads";
        }
        c9867g.m1445d(mo3202p, "consent_title");
        if (TextUtils.isEmpty(mo3202p2)) {
            mo3202p2 = "To receive more relevant ad content based on your interactions with our ads, click \"I Consent\" below. Either way, you will see the same amount of ads.";
        }
        c9867g.m1445d(mo3202p2, "consent_message");
        if (!"publisher".equalsIgnoreCase(c9867g.m1446c("consent_source"))) {
            c9867g.m1445d(TextUtils.isEmpty(mo3202p3) ? "" : mo3202p3, "consent_message_version");
        }
        if (TextUtils.isEmpty(mo3202p4)) {
            mo3202p4 = "I Consent";
        }
        c9867g.m1445d(mo3202p4, "button_accept");
        if (TextUtils.isEmpty(mo3202p5)) {
            mo3202p5 = "I Do Not Consent";
        }
        c9867g.m1445d(mo3202p5, "button_deny");
        this.f19834b.m1376w(c9867g);
    }
}
