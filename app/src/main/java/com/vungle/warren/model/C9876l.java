package com.vungle.warren.model;

import android.content.ContentValues;
import androidx.annotation.NonNull;
import androidx.core.content.res.C0672b;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.C8686j;
import com.google.gson.C8688k;
import com.google.gson.reflect.C8696a;
import com.unity3d.ads.metadata.MediationMetaData;
import com.vungle.warren.model.Report;
import com.vungle.warren.persistence.InterfaceC9918b;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.vungle.warren.model.l */
/* loaded from: classes3.dex */
public final class C9876l implements InterfaceC9918b<Report> {

    /* renamed from: a */
    public final C8686j f19835a = new C8688k().m3226a();

    /* renamed from: b */
    public final Type f19836b = new C9877a().getType();

    /* renamed from: c */
    public final Type f19837c = new C9878b().getType();

    /* renamed from: com.vungle.warren.model.l$a */
    /* loaded from: classes3.dex */
    public class C9877a extends C8696a<ArrayList<String>> {
    }

    /* renamed from: com.vungle.warren.model.l$b */
    /* loaded from: classes3.dex */
    public class C9878b extends C8696a<ArrayList<Report.C9851a>> {
    }

    @Override // com.vungle.warren.persistence.InterfaceC9918b
    /* renamed from: a */
    public final ContentValues mo1413a(Report report) {
        Report report2 = report;
        ContentValues contentValues = new ContentValues();
        contentValues.put(FirebaseAnalytics.Param.ITEM_ID, report2.m1457a());
        contentValues.put("ad_duration", Long.valueOf(report2.f19791k));
        contentValues.put("adStartTime", Long.valueOf(report2.f19788h));
        contentValues.put("adToken", report2.f19783c);
        contentValues.put("ad_type", report2.f19798r);
        contentValues.put("appId", report2.f19784d);
        contentValues.put(FirebaseAnalytics.Param.CAMPAIGN, report2.f19793m);
        contentValues.put("incentivized", Boolean.valueOf(report2.f19785e));
        contentValues.put("header_bidding", Boolean.valueOf(report2.f19786f));
        contentValues.put(MediationMetaData.KEY_ORDINAL, Integer.valueOf(report2.f19801u));
        contentValues.put("placementId", report2.f19782b);
        contentValues.put("template_id", report2.f19799s);
        contentValues.put("tt_download", Long.valueOf(report2.f19792l));
        contentValues.put(ImagesContract.URL, report2.f19789i);
        contentValues.put("user_id", report2.f19800t);
        contentValues.put("videoLength", Long.valueOf(report2.f19790j));
        contentValues.put("videoViewed", Integer.valueOf(report2.f19794n));
        contentValues.put("was_CTAC_licked", Boolean.valueOf(report2.f19803w));
        contentValues.put("user_actions", this.f19835a.m3229i(new ArrayList(report2.f19795o), this.f19837c));
        contentValues.put("clicked_through", this.f19835a.m3229i(new ArrayList(report2.f19796p), this.f19836b));
        contentValues.put("errors", this.f19835a.m3229i(new ArrayList(report2.f19797q), this.f19836b));
        contentValues.put("status", Integer.valueOf(report2.f19781a));
        contentValues.put("ad_size", report2.f19802v);
        contentValues.put("init_timestamp", Long.valueOf(report2.f19804x));
        contentValues.put("asset_download_duration", Long.valueOf(report2.f19805y));
        contentValues.put("play_remote_url", Boolean.valueOf(report2.f19787g));
        return contentValues;
    }

    @Override // com.vungle.warren.persistence.InterfaceC9918b
    @NonNull
    /* renamed from: b */
    public final Report mo1412b(ContentValues contentValues) {
        Report report = new Report();
        report.f19791k = contentValues.getAsLong("ad_duration").longValue();
        report.f19788h = contentValues.getAsLong("adStartTime").longValue();
        report.f19783c = contentValues.getAsString("adToken");
        report.f19798r = contentValues.getAsString("ad_type");
        report.f19784d = contentValues.getAsString("appId");
        report.f19793m = contentValues.getAsString(FirebaseAnalytics.Param.CAMPAIGN);
        report.f19801u = contentValues.getAsInteger(MediationMetaData.KEY_ORDINAL).intValue();
        report.f19782b = contentValues.getAsString("placementId");
        report.f19799s = contentValues.getAsString("template_id");
        report.f19792l = contentValues.getAsLong("tt_download").longValue();
        report.f19789i = contentValues.getAsString(ImagesContract.URL);
        report.f19800t = contentValues.getAsString("user_id");
        report.f19790j = contentValues.getAsLong("videoLength").longValue();
        report.f19794n = contentValues.getAsInteger("videoViewed").intValue();
        report.f19803w = C0672b.m11997a(contentValues, "was_CTAC_licked");
        report.f19785e = C0672b.m11997a(contentValues, "incentivized");
        report.f19786f = C0672b.m11997a(contentValues, "header_bidding");
        report.f19781a = contentValues.getAsInteger("status").intValue();
        report.f19802v = contentValues.getAsString("ad_size");
        report.f19804x = contentValues.getAsLong("init_timestamp").longValue();
        report.f19805y = contentValues.getAsLong("asset_download_duration").longValue();
        report.f19787g = C0672b.m11997a(contentValues, "play_remote_url");
        List list = (List) this.f19835a.m3234d(contentValues.getAsString("clicked_through"), this.f19836b);
        List list2 = (List) this.f19835a.m3234d(contentValues.getAsString("errors"), this.f19836b);
        List list3 = (List) this.f19835a.m3234d(contentValues.getAsString("user_actions"), this.f19837c);
        if (list != null) {
            report.f19796p.addAll(list);
        }
        if (list2 != null) {
            report.f19797q.addAll(list2);
        }
        if (list3 != null) {
            report.f19795o.addAll(list3);
        }
        return report;
    }

    @Override // com.vungle.warren.persistence.InterfaceC9918b
    public final String tableName() {
        return "report";
    }
}
