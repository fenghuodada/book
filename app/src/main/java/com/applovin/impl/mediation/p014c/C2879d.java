package com.applovin.impl.mediation.p014c;

import android.net.Uri;
import androidx.activity.result.C0063d;
import com.applovin.impl.mediation.MaxErrorImpl;
import com.applovin.impl.mediation.p011a.AbstractC2823a;
import com.applovin.impl.mediation.p011a.C2828f;
import com.applovin.impl.sdk.C3214m;
import com.applovin.impl.sdk.C3349v;
import com.applovin.impl.sdk.network.C3262h;
import com.applovin.impl.sdk.network.C3265i;
import com.applovin.impl.sdk.p031c.C3108a;
import com.applovin.impl.sdk.p033e.AbstractRunnableC3131a;
import com.applovin.impl.sdk.p033e.C3163o;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.adapter.MaxAdapterError;
import com.applovin.sdk.AppLovinPostbackListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.mediation.c.d */
/* loaded from: classes.dex */
public class C2879d extends AbstractRunnableC3131a {

    /* renamed from: a */
    private final String f6966a;

    /* renamed from: c */
    private final String f6967c;

    /* renamed from: d */
    private final C2828f f6968d;

    /* renamed from: e */
    private final Map<String, String> f6969e;

    /* renamed from: f */
    private final Map<String, String> f6970f;

    /* renamed from: g */
    private final MaxError f6971g;

    public C2879d(String str, Map<String, String> map, MaxError maxError, C2828f c2828f, C3214m c3214m) {
        super("TaskFireMediationPostbacks", c3214m);
        MaxError maxErrorImpl;
        this.f6966a = str;
        this.f6967c = C0063d.m13053a(str, "_urls");
        this.f6969e = Utils.toUrlSafeMap(map, c3214m);
        if (maxError != null) {
            maxErrorImpl = maxError;
        } else {
            maxErrorImpl = new MaxErrorImpl(-1);
        }
        this.f6971g = maxErrorImpl;
        this.f6968d = c2828f;
        HashMap hashMap = new HashMap(7);
        hashMap.put("AppLovin-Event-Type", str);
        hashMap.put("AppLovin-Ad-Network-Name", c2828f.m8743L());
        if (c2828f instanceof AbstractC2823a) {
            AbstractC2823a abstractC2823a = (AbstractC2823a) c2828f;
            hashMap.put("AppLovin-Ad-Unit-Id", abstractC2823a.getAdUnitId());
            hashMap.put("AppLovin-Ad-Format", abstractC2823a.getFormat().getLabel());
            hashMap.put("AppLovin-Third-Party-Ad-Placement-ID", abstractC2823a.m8792l());
        }
        if (maxError != null) {
            hashMap.put("AppLovin-Error-Code", String.valueOf(maxError.getCode()));
            hashMap.put("AppLovin-Error-Message", maxError.getMessage());
        }
        this.f6970f = hashMap;
    }

    /* renamed from: a */
    private String m8517a(String str, MaxError maxError) {
        int i;
        String str2;
        if (maxError instanceof MaxAdapterError) {
            MaxAdapterError maxAdapterError = (MaxAdapterError) maxError;
            i = maxAdapterError.getMediatedNetworkErrorCode();
            str2 = maxAdapterError.getMediatedNetworkErrorMessage();
        } else {
            i = 0;
            str2 = "";
        }
        return str.replace("{ERROR_CODE}", String.valueOf(maxError.getCode())).replace("{ERROR_MESSAGE}", StringUtils.encodeUriString(maxError.getMessage(), m7701d())).replace("{THIRD_PARTY_SDK_ERROR_CODE}", String.valueOf(i)).replace("{THIRD_PARTY_SDK_ERROR_MESSAGE}", StringUtils.encodeUriString(str2, m7701d()));
    }

    /* renamed from: a */
    private List<String> m8514a(List<String> list, Map<String, String> map, Map<String, String> map2, MaxError maxError) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String next = it.next();
            for (String str : map.keySet()) {
                next = next.replace(str, this.f6968d.m8706g(map.get(str)));
            }
            arrayList.add(m8517a(m8513b(next, map2), maxError));
        }
        return arrayList;
    }

    /* renamed from: a */
    private Map<String, String> m8519a() {
        try {
            return JsonUtils.toStringMap(new JSONObject((String) this.f8192b.m7456a(C3108a.f7773i)));
        } catch (JSONException unused) {
            return Collections.EMPTY_MAP;
        }
    }

    /* renamed from: a */
    private void m8516a(String str, Map<String, Object> map) {
        m7701d().m7467U().m7253a(C3262h.m7216o().m7205c(str).m7209b("POST").m7208b(this.f6970f).m7211a(false).m7204c(map).m7207b(((Boolean) this.f8192b.m7456a(C3108a.f7764V)).booleanValue()).m7215a());
    }

    /* renamed from: a */
    private void m8515a(List<String> list) {
        if (list.isEmpty()) {
            return;
        }
        for (String str : list) {
            m7701d().m7467U().m7253a(C3262h.m7216o().m7205c(str).m7211a(false).m7208b(this.f6970f).m7215a());
        }
    }

    /* renamed from: b */
    private String m8513b(String str, Map<String, String> map) {
        for (String str2 : map.keySet()) {
            str = str.replace(str2, StringUtils.emptyIfNull(map.get(str2)));
        }
        return str;
    }

    /* renamed from: b */
    private void m8512b(List<String> list) {
        if (list.isEmpty()) {
            return;
        }
        for (String str : list) {
            m7701d().m7464X().dispatchPostbackRequest(C3265i.m7194b(m7701d()).mo7186a(str).mo7173c(false).mo7178b(this.f6970f).mo7190a(), C3163o.EnumC3165a.MEDIATION_POSTBACKS, new AppLovinPostbackListener() { // from class: com.applovin.impl.mediation.c.d.1
                @Override // com.applovin.sdk.AppLovinPostbackListener
                public void onPostbackFailure(String str2, int i) {
                    if (C3349v.m6862a()) {
                        C2879d c2879d = C2879d.this;
                        c2879d.m7700d("Failed to fire postback with code: " + i + " and url: " + str2);
                    }
                }

                @Override // com.applovin.sdk.AppLovinPostbackListener
                public void onPostbackSuccess(String str2) {
                }
            });
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        List<String> m8707f = this.f6968d.m8707f(this.f6967c);
        Map<String, String> m8519a = m8519a();
        if (!((Boolean) m7701d().m7456a(C3108a.f7758P)).booleanValue()) {
            List<String> m8514a = m8514a(m8707f, m8519a, this.f6969e, this.f6971g);
            if (((Boolean) m7701d().m7456a(C3108a.f7774j)).booleanValue()) {
                m8515a(m8514a);
                return;
            } else {
                m8512b(m8514a);
                return;
            }
        }
        for (String str : m8707f) {
            Uri parse = Uri.parse(m8517a(m8513b(str, this.f6969e), this.f6971g));
            Uri.Builder clearQuery = parse.buildUpon().clearQuery();
            HashMap hashMap = new HashMap(m8519a.size());
            for (String str2 : parse.getQueryParameterNames()) {
                String queryParameter = parse.getQueryParameter(str2);
                if (m8519a.containsKey(queryParameter)) {
                    hashMap.put(str2, this.f6968d.m8706g(m8519a.get(queryParameter)));
                } else {
                    clearQuery.appendQueryParameter(str2, queryParameter);
                }
            }
            m8516a(clearQuery.build().toString(), hashMap);
        }
    }
}
