package com.unity3d.services.core.api;

import com.unity3d.services.core.log.C9549a;
import com.unity3d.services.core.request.C9583h;
import com.unity3d.services.core.request.C9588l;
import com.unity3d.services.core.request.EnumC9585i;
import com.unity3d.services.core.request.EnumC9586j;
import com.unity3d.services.core.request.InterfaceC9578c;
import com.unity3d.services.core.webview.C9620a;
import com.unity3d.services.core.webview.EnumC9627b;
import com.unity3d.services.core.webview.bridge.C9644l;
import com.unity3d.services.core.webview.bridge.WebViewExposed;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: classes3.dex */
public class Request {

    /* renamed from: com.unity3d.services.core.api.Request$a */
    /* loaded from: classes3.dex */
    public static class C9458a implements InterfaceC9578c {

        /* renamed from: a */
        final /* synthetic */ String f18580a;

        public C9458a(String str) {
            this.f18580a = str;
        }

        @Override // com.unity3d.services.core.request.InterfaceC9578c
        /* renamed from: a */
        public void mo1906a(String str, String str2) {
            C9620a.m1774c().m1784a(EnumC9627b.REQUEST, EnumC9586j.FAILED, this.f18580a, str, str2);
        }

        @Override // com.unity3d.services.core.request.InterfaceC9578c
        /* renamed from: a */
        public void mo1905a(String str, String str2, int i, Map<String, List<String>> map) {
            try {
                C9620a.m1774c().m1784a(EnumC9627b.REQUEST, EnumC9586j.COMPLETE, this.f18580a, str, str2, Integer.valueOf(i), Request.getResponseHeadersMap(map));
            } catch (Exception e) {
                C9549a.m2023a("Error parsing response headers", e);
                C9620a.m1774c().m1784a(EnumC9627b.REQUEST, EnumC9586j.FAILED, this.f18580a, str, "Error parsing response headers");
            }
        }
    }

    /* renamed from: com.unity3d.services.core.api.Request$b */
    /* loaded from: classes3.dex */
    public static class C9459b implements InterfaceC9578c {

        /* renamed from: a */
        final /* synthetic */ String f18581a;

        public C9459b(String str) {
            this.f18581a = str;
        }

        @Override // com.unity3d.services.core.request.InterfaceC9578c
        /* renamed from: a */
        public void mo1906a(String str, String str2) {
            C9620a.m1774c().m1784a(EnumC9627b.REQUEST, EnumC9586j.FAILED, this.f18581a, str, str2);
        }

        @Override // com.unity3d.services.core.request.InterfaceC9578c
        /* renamed from: a */
        public void mo1905a(String str, String str2, int i, Map<String, List<String>> map) {
            try {
                C9620a.m1774c().m1784a(EnumC9627b.REQUEST, EnumC9586j.COMPLETE, this.f18581a, str, str2, Integer.valueOf(i), Request.getResponseHeadersMap(map));
            } catch (Exception e) {
                C9549a.m2023a("Error parsing response headers", e);
                C9620a.m1774c().m1784a(EnumC9627b.REQUEST, EnumC9586j.FAILED, this.f18581a, str, "Error parsing response headers");
            }
        }
    }

    /* renamed from: com.unity3d.services.core.api.Request$c */
    /* loaded from: classes3.dex */
    public static class C9460c implements InterfaceC9578c {

        /* renamed from: a */
        final /* synthetic */ String f18582a;

        public C9460c(String str) {
            this.f18582a = str;
        }

        @Override // com.unity3d.services.core.request.InterfaceC9578c
        /* renamed from: a */
        public void mo1906a(String str, String str2) {
            C9620a.m1774c().m1784a(EnumC9627b.REQUEST, EnumC9586j.FAILED, this.f18582a, str, str2);
        }

        @Override // com.unity3d.services.core.request.InterfaceC9578c
        /* renamed from: a */
        public void mo1905a(String str, String str2, int i, Map<String, List<String>> map) {
            try {
                C9620a.m1774c().m1784a(EnumC9627b.REQUEST, EnumC9586j.COMPLETE, this.f18582a, str, str2, Integer.valueOf(i), Request.getResponseHeadersMap(map));
            } catch (Exception e) {
                C9549a.m2023a("Error parsing response headers", e);
                C9620a.m1774c().m1784a(EnumC9627b.REQUEST, EnumC9586j.FAILED, this.f18582a, str, "Error parsing response headers");
            }
        }
    }

    @WebViewExposed
    public static void get(String str, String str2, JSONArray jSONArray, Integer num, Integer num2, C9644l c9644l) {
        if (jSONArray != null && jSONArray.length() == 0) {
            jSONArray = null;
        }
        try {
            C9588l.m1874a(str2, C9583h.EnumC9584a.GET, getHeadersMap(jSONArray), null, num, num2, new C9458a(str));
            c9644l.m1736a(str);
        } catch (Exception e) {
            C9549a.m2023a("Error mapping headers for the request", e);
            c9644l.m1737a(EnumC9585i.MAPPING_HEADERS_FAILED, str);
        }
    }

    public static HashMap<String, List<String>> getHeadersMap(JSONArray jSONArray) throws JSONException {
        if (jSONArray != null) {
            HashMap<String, List<String>> hashMap = new HashMap<>();
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONArray jSONArray2 = (JSONArray) jSONArray.get(i);
                List<String> list = hashMap.get(jSONArray2.getString(0));
                if (list == null) {
                    list = new ArrayList<>();
                }
                list.add(jSONArray2.getString(1));
                hashMap.put(jSONArray2.getString(0), list);
            }
            return hashMap;
        }
        return null;
    }

    public static JSONArray getResponseHeadersMap(Map<String, List<String>> map) {
        JSONArray jSONArray = new JSONArray();
        if (map != null && map.size() > 0) {
            for (String str : map.keySet()) {
                JSONArray jSONArray2 = null;
                for (String str2 : map.get(str)) {
                    JSONArray jSONArray3 = new JSONArray();
                    jSONArray3.put(str);
                    jSONArray3.put(str2);
                    jSONArray2 = jSONArray3;
                }
                jSONArray.put(jSONArray2);
            }
        }
        return jSONArray;
    }

    @WebViewExposed
    public static void head(String str, String str2, JSONArray jSONArray, Integer num, Integer num2, C9644l c9644l) {
        if (jSONArray != null && jSONArray.length() == 0) {
            jSONArray = null;
        }
        try {
            C9588l.m1875a(str2, C9583h.EnumC9584a.HEAD, getHeadersMap(jSONArray), num, num2, new C9460c(str));
            c9644l.m1736a(str);
        } catch (Exception e) {
            C9549a.m2023a("Error mapping headers for the request", e);
            c9644l.m1737a(EnumC9585i.MAPPING_HEADERS_FAILED, str);
        }
    }

    @WebViewExposed
    public static void post(String str, String str2, String str3, JSONArray jSONArray, Integer num, Integer num2, C9644l c9644l) {
        String str4 = (str3 == null || str3.length() != 0) ? str3 : null;
        if (jSONArray != null && jSONArray.length() == 0) {
            jSONArray = null;
        }
        try {
            C9588l.m1874a(str2, C9583h.EnumC9584a.POST, getHeadersMap(jSONArray), str4, num, num2, new C9459b(str));
            c9644l.m1736a(str);
        } catch (Exception e) {
            C9549a.m2023a("Error mapping headers for the request", e);
            c9644l.m1737a(EnumC9585i.MAPPING_HEADERS_FAILED, str);
        }
    }

    @WebViewExposed
    public static void setConcurrentRequestCount(Integer num, C9644l c9644l) {
        C9588l.m1878a(num.intValue());
        c9644l.m1736a(new Object[0]);
    }

    @WebViewExposed
    public static void setKeepAliveTime(Integer num, C9644l c9644l) {
        C9588l.m1877a(num.longValue());
        c9644l.m1736a(new Object[0]);
    }

    @WebViewExposed
    public static void setMaximumPoolSize(Integer num, C9644l c9644l) {
        C9588l.m1871b(num.intValue());
        c9644l.m1736a(new Object[0]);
    }
}
