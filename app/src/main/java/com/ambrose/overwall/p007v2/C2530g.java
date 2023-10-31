package com.ambrose.overwall.p007v2;

import android.content.Context;
import android.text.TextUtils;
import androidx.core.p003os.C0740h;
import com.google.gson.C8686j;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.C10795h;
import kotlin.C10806j;
import kotlin.C10865m;
import kotlin.collections.C10752h;
import kotlin.collections.C10753i;
import kotlin.collections.C10757m;
import kotlin.collections.C10765u;
import kotlin.jvm.internal.C10843j;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.p061io.C10805a;
import kotlin.text.C10910b;
import kotlin.text.C10925n;
import kotlin.text.C10929r;
import libv2ray.V2rayConfig;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SourceDebugExtension({"SMAP\nV2rayConfigUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 V2rayConfigUtil.kt\ncom/ambrose/overwall/v2/V2rayConfigUtil\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,369:1\n1855#2,2:370\n766#2:372\n857#2,2:373\n1855#2,2:375\n2624#2,3:377\n2624#2,3:380\n1549#2:383\n1620#2,3:384\n1855#2,2:387\n1549#2:389\n1620#2,3:390\n1855#2,2:393\n1855#2,2:395\n1549#2:397\n1620#2,3:398\n*S KotlinDebug\n*F\n+ 1 V2rayConfigUtil.kt\ncom/ambrose/overwall/v2/V2rayConfigUtil\n*L\n48#1:370,2\n66#1:372\n66#1:373,2\n66#1:375,2\n89#1:377,3\n107#1:380,3\n216#1:383\n216#1:384,3\n216#1:387,2\n243#1:389\n243#1:390,3\n243#1:393,2\n260#1:395,2\n320#1:397\n320#1:398,3\n*E\n"})
/* renamed from: com.ambrose.overwall.v2.g */
/* loaded from: classes.dex */
public final class C2530g {

    /* renamed from: com.ambrose.overwall.v2.g$a */
    /* loaded from: classes.dex */
    public static final class C2531a {

        /* renamed from: a */
        public boolean f6022a = false;
        @NotNull

        /* renamed from: b */
        public String f6023b = "";

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C2531a) {
                C2531a c2531a = (C2531a) obj;
                return this.f6022a == c2531a.f6022a && C10843j.m435a(this.f6023b, c2531a.f6023b);
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v3 */
        /* JADX WARN: Type inference failed for: r0v4 */
        public final int hashCode() {
            boolean z = this.f6022a;
            ?? r0 = z;
            if (z) {
                r0 = 1;
            }
            return this.f6023b.hashCode() + (r0 * 31);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("Result(status=");
            sb.append(this.f6022a);
            sb.append(", content=");
            return C0740h.m11848b(sb, this.f6023b, ')');
        }
    }

    @NotNull
    /* renamed from: a */
    public static C2531a m9384a(@NotNull Context context, @NotNull V2rayConfig.OutboundBean outboundBean) {
        BufferedReader bufferedReader;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        String str;
        String str2;
        String str3;
        List<String> list;
        List<String> list2;
        V2rayConfig.OutboundBean.StreamSettingsBean.TcpSettingsBean.HeaderBean headerBean;
        V2rayConfig.OutboundBean.StreamSettingsBean.TcpSettingsBean.HeaderBean.RequestBean requestBean;
        V2rayConfig.OutboundBean.StreamSettingsBean.TcpSettingsBean.HeaderBean.RequestBean.HeadersBean headersBean;
        V2rayConfig.OutboundBean.StreamSettingsBean.TcpSettingsBean tcpSettings;
        V2rayConfig.OutboundBean.StreamSettingsBean.TcpSettingsBean.HeaderBean header;
        V2rayConfig.OutboundBean.StreamSettingsBean.TcpSettingsBean.HeaderBean.RequestBean request;
        V2rayConfig.OutboundBean.StreamSettingsBean.TcpSettingsBean tcpSettings2;
        V2rayConfig.OutboundBean.StreamSettingsBean.TcpSettingsBean.HeaderBean header2;
        V2rayConfig.OutboundBean.StreamSettingsBean.TcpSettingsBean tcpSettings3;
        V2rayConfig.OutboundBean.StreamSettingsBean.TcpSettingsBean tcpSettings4;
        V2rayConfig.OutboundBean.StreamSettingsBean.TcpSettingsBean.HeaderBean header3;
        V2rayConfig.OutboundBean.StreamSettingsBean.TcpSettingsBean.HeaderBean.RequestBean request2;
        V2rayConfig.OutboundBean.StreamSettingsBean.TcpSettingsBean.HeaderBean.RequestBean.HeadersBean headers;
        V2rayConfig.OutboundBean.StreamSettingsBean.TcpSettingsBean tcpSettings5;
        V2rayConfig.OutboundBean.StreamSettingsBean.TcpSettingsBean.HeaderBean header4;
        V2rayConfig.OutboundBean.StreamSettingsBean.TcpSettingsBean.HeaderBean.RequestBean request3;
        V2rayConfig.OutboundBean.StreamSettingsBean.TcpSettingsBean tcpSettings6;
        V2rayConfig.OutboundBean.StreamSettingsBean.TcpSettingsBean.HeaderBean header5;
        ArrayList<String> destOverride;
        C2531a c2531a = new C2531a();
        C2524e c2524e = C2524e.f6008a;
        InputStream open = context.getAssets().open("gofly.json");
        C10843j.m431e(open, "context.assets.open(fileName)");
        InputStreamReader inputStreamReader = new InputStreamReader(open, C10910b.f21450b);
        if (inputStreamReader instanceof BufferedReader) {
            bufferedReader = (BufferedReader) inputStreamReader;
        } else {
            bufferedReader = new BufferedReader(inputStreamReader, 8192);
        }
        try {
            StringWriter stringWriter = new StringWriter();
            char[] cArr = new char[8192];
            while (true) {
                int read = bufferedReader.read(cArr);
                if (read < 0) {
                    break;
                }
                stringWriter.write(cArr, 0, read);
            }
            String stringWriter2 = stringWriter.toString();
            C10843j.m431e(stringWriter2, "buffer.toString()");
            C10805a.m443a(bufferedReader, null);
            if (TextUtils.isEmpty(stringWriter2)) {
                return c2531a;
            }
            V2rayConfig v2rayConfig = (V2rayConfig) new C8686j().m3235c(V2rayConfig.class, stringWriter2);
            if (v2rayConfig == null) {
                return c2531a;
            }
            try {
                for (V2rayConfig.InboundBean inboundBean : v2rayConfig.getInbounds()) {
                    inboundBean.setListen("127.0.0.1");
                }
                v2rayConfig.getInbounds().get(0).setPort(10808);
                V2rayConfig.InboundBean.SniffingBean sniffing = v2rayConfig.getInbounds().get(0).getSniffing();
                if (sniffing != null) {
                    sniffing.setEnabled(true);
                }
                V2rayConfig.InboundBean.SniffingBean sniffing2 = v2rayConfig.getInbounds().get(0).getSniffing();
                if (sniffing2 != null && (destOverride = sniffing2.getDestOverride()) != null) {
                    destOverride.add("fakedns");
                }
                v2rayConfig.getInbounds().get(1).setPort(10809);
            } catch (Exception e) {
                e.printStackTrace();
            }
            try {
                V2rayConfig.OutboundBean.StreamSettingsBean streamSettings = outboundBean.getStreamSettings();
                if (streamSettings != null) {
                    str2 = streamSettings.getNetwork();
                } else {
                    str2 = null;
                }
                if (C10843j.m435a(str2, V2rayConfig.DEFAULT_NETWORK)) {
                    V2rayConfig.OutboundBean.StreamSettingsBean streamSettings2 = outboundBean.getStreamSettings();
                    if (streamSettings2 != null && (tcpSettings6 = streamSettings2.getTcpSettings()) != null && (header5 = tcpSettings6.getHeader()) != null) {
                        str3 = header5.getType();
                    } else {
                        str3 = null;
                    }
                    if (C10843j.m435a(str3, V2rayConfig.HTTP)) {
                        V2rayConfig.OutboundBean.StreamSettingsBean streamSettings3 = outboundBean.getStreamSettings();
                        if (streamSettings3 != null && (tcpSettings5 = streamSettings3.getTcpSettings()) != null && (header4 = tcpSettings5.getHeader()) != null && (request3 = header4.getRequest()) != null) {
                            list = request3.getPath();
                        } else {
                            list = null;
                        }
                        V2rayConfig.OutboundBean.StreamSettingsBean streamSettings4 = outboundBean.getStreamSettings();
                        if (streamSettings4 != null && (tcpSettings4 = streamSettings4.getTcpSettings()) != null && (header3 = tcpSettings4.getHeader()) != null && (request2 = header3.getRequest()) != null && (headers = request2.getHeaders()) != null) {
                            list2 = headers.getHost();
                        } else {
                            list2 = null;
                        }
                        C10865m m446a = C10795h.m446a(C2532h.f6024a);
                        V2rayConfig.OutboundBean.StreamSettingsBean streamSettings5 = outboundBean.getStreamSettings();
                        if (streamSettings5 != null && (tcpSettings3 = streamSettings5.getTcpSettings()) != null) {
                            headerBean = tcpSettings3.getHeader();
                        } else {
                            headerBean = null;
                        }
                        if (headerBean != null) {
                            headerBean.setRequest((V2rayConfig.OutboundBean.StreamSettingsBean.TcpSettingsBean.HeaderBean.RequestBean) new C8686j().m3235c(V2rayConfig.OutboundBean.StreamSettingsBean.TcpSettingsBean.HeaderBean.RequestBean.class, (String) m446a.getValue()));
                        }
                        V2rayConfig.OutboundBean.StreamSettingsBean streamSettings6 = outboundBean.getStreamSettings();
                        if (streamSettings6 != null && (tcpSettings2 = streamSettings6.getTcpSettings()) != null && (header2 = tcpSettings2.getHeader()) != null) {
                            requestBean = header2.getRequest();
                        } else {
                            requestBean = null;
                        }
                        if (requestBean != null) {
                            C10843j.m433c(list);
                            requestBean.setPath(list);
                        }
                        V2rayConfig.OutboundBean.StreamSettingsBean streamSettings7 = outboundBean.getStreamSettings();
                        if (streamSettings7 != null && (tcpSettings = streamSettings7.getTcpSettings()) != null && (header = tcpSettings.getHeader()) != null && (request = header.getRequest()) != null) {
                            headersBean = request.getHeaders();
                        } else {
                            headersBean = null;
                        }
                        if (headersBean != null) {
                            C10843j.m433c(list2);
                            headersBean.setHost(list2);
                        }
                    }
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            v2rayConfig.getOutbounds().set(0, outboundBean);
            try {
                m9383b(v2rayConfig);
                v2rayConfig.getRouting().setDomainStrategy("IPIfNonMatch");
                v2rayConfig.getRouting().setDomainMatcher("mph");
                new V2rayConfig.RoutingBean.RulesBean("field", null, C10752h.m488a("domain:googleapis.cn"), "proxy", null, null, null, null, null, null, null, null, null, null, 16370, null);
            } catch (Exception e3) {
                e3.printStackTrace();
            }
            v2rayConfig.setFakedns(C10752h.m486c(new V2rayConfig.FakednsBean(null, 0, 3, null)));
            ArrayList<V2rayConfig.OutboundBean> outbounds = v2rayConfig.getOutbounds();
            ArrayList arrayList = new ArrayList();
            for (Object obj : outbounds) {
                if (C10843j.m435a(((V2rayConfig.OutboundBean) obj).getProtocol(), "freedom")) {
                    arrayList.add(obj);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                V2rayConfig.OutboundBean.OutSettingsBean settings = ((V2rayConfig.OutboundBean) it.next()).getSettings();
                if (settings != null) {
                    settings.setDomainStrategy("UseIP");
                }
            }
            try {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                ArrayList arrayList2 = new ArrayList();
                C2524e c2524e2 = C2524e.f6008a;
                List<String> m9394c = C2524e.m9394c();
                ArrayList m9382c = m9382c();
                for (String str4 : m9394c) {
                    arrayList2.add(str4);
                }
                if (m9382c.size() > 0) {
                    arrayList2.add(new V2rayConfig.DnsBean.ServersBean((String) C10757m.m479j(m9394c), 53, m9382c, null, null, 16, null));
                }
                ArrayList m9382c2 = m9382c();
                if (m9382c2.size() > 0 || C10843j.m435a("0", "2") || C10843j.m435a("0", "3")) {
                    C2524e c2524e3 = C2524e.f6008a;
                    List m9395b = C2524e.m9395b();
                    ArrayList m488a = C10752h.m488a("");
                    ArrayList m488a2 = C10752h.m488a("");
                    if (m9382c2.size() > 0) {
                        arrayList2.add(new V2rayConfig.DnsBean.ServersBean((String) C10757m.m479j(m9395b), 53, m9382c2, m488a2, null, 16, null));
                    }
                    if (C10843j.m435a("0", "2") || C10843j.m435a("0", "3")) {
                        arrayList2.add(new V2rayConfig.DnsBean.ServersBean((String) C10757m.m479j(m9395b), 53, m488a, m488a2, null, 16, null));
                    }
                    if (!C10925n.m392k((String) C10757m.m479j(m9395b), "https", false)) {
                        v2rayConfig.getRouting().getRules().add(0, new V2rayConfig.RoutingBean.RulesBean("field", C10752h.m488a((String) C10757m.m479j(m9395b)), null, "proxy", null, "53", null, null, null, null, null, null, null, null, 16336, null));
                    }
                }
                ArrayList m9382c3 = m9382c();
                if (m9382c3.size() > 0) {
                    ArrayList arrayList3 = new ArrayList(C10753i.m482g(m9382c3));
                    Iterator it2 = m9382c3.iterator();
                    while (it2.hasNext()) {
                        arrayList3.add(new C10806j((String) it2.next(), "127.0.0.1"));
                    }
                    C10765u.m465d(arrayList3, linkedHashMap);
                }
                linkedHashMap.put("domain:googleapis.cn", "googleapis.com");
                v2rayConfig.setDns(new V2rayConfig.DnsBean(arrayList2, linkedHashMap, null, null, null, null, 60, null));
                if (!C10925n.m392k((String) C10757m.m479j(m9394c), "https", false)) {
                    v2rayConfig.getRouting().getRules().add(0, new V2rayConfig.RoutingBean.RulesBean("field", C10752h.m488a((String) C10757m.m479j(m9394c)), null, "proxy", null, "53", null, null, null, null, null, null, null, null, 16336, null));
                }
            } catch (Exception e4) {
                e4.printStackTrace();
            }
            try {
                ArrayList m488a3 = C10752h.m488a("");
                ArrayList<Object> servers = v2rayConfig.getDns().getServers();
                if (servers != null) {
                    servers.add(0, new V2rayConfig.DnsBean.ServersBean("fakedns", null, C10757m.m473p("", C10757m.m473p("", m488a3)), null, null, 26, null));
                }
                C2524e c2524e4 = C2524e.f6008a;
                List m9394c2 = C2524e.m9394c();
                ArrayList<V2rayConfig.InboundBean> inbounds = v2rayConfig.getInbounds();
                if (!(inbounds instanceof Collection) || !inbounds.isEmpty()) {
                    for (V2rayConfig.InboundBean inboundBean2 : inbounds) {
                        if (C10843j.m435a(inboundBean2.getProtocol(), "dokodemo-door") && C10843j.m435a(inboundBean2.getTag(), "dns-in")) {
                            z = true;
                            continue;
                        } else {
                            z = false;
                            continue;
                        }
                        if (z) {
                            z2 = false;
                            break;
                        }
                    }
                }
                z2 = true;
                if (z2) {
                    if (C10925n.m392k((String) C10757m.m479j(m9394c2), "https", false)) {
                        str = "1.1.1.1";
                    } else {
                        str = (String) C10757m.m479j(m9394c2);
                    }
                    v2rayConfig.getInbounds().add(new V2rayConfig.InboundBean("dns-in", Integer.parseInt("10853"), "dokodemo-door", "127.0.0.1", new V2rayConfig.InboundBean.InSettingsBean(null, null, null, str, 53, "tcp,udp", 7, null), null, null, null, 192, null));
                }
                ArrayList<V2rayConfig.OutboundBean> outbounds2 = v2rayConfig.getOutbounds();
                if (!(outbounds2 instanceof Collection) || !outbounds2.isEmpty()) {
                    for (V2rayConfig.OutboundBean outboundBean2 : outbounds2) {
                        if (C10843j.m435a(outboundBean2.getProtocol(), "dns") && C10843j.m435a(outboundBean2.getTag(), "dns-out")) {
                            z3 = true;
                            continue;
                        } else {
                            z3 = false;
                            continue;
                        }
                        if (z3) {
                            z4 = false;
                            break;
                        }
                    }
                }
                z4 = true;
                if (z4) {
                    v2rayConfig.getOutbounds().add(new V2rayConfig.OutboundBean("dns-out", "dns", null, null, null, null, null, 48, null));
                }
                v2rayConfig.getRouting().getRules().add(0, new V2rayConfig.RoutingBean.RulesBean("field", null, null, "dns-out", null, null, null, null, null, null, C10752h.m488a("dns-in"), null, null, null, 15346, null));
            } catch (Exception e5) {
                e5.printStackTrace();
            }
            c2531a.f6022a = true;
            String prettyPrinting = v2rayConfig.toPrettyPrinting();
            C10843j.m430f(prettyPrinting, "<set-?>");
            c2531a.f6023b = prettyPrinting;
            return c2531a;
        } finally {
        }
    }

    /* renamed from: b */
    public static void m9383b(V2rayConfig v2rayConfig) {
        Integer num;
        ArrayList<String> arrayList;
        try {
            if (!TextUtils.isEmpty("")) {
                V2rayConfig.RoutingBean.RulesBean rulesBean = new V2rayConfig.RoutingBean.RulesBean(null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16383, null);
                rulesBean.setType("field");
                rulesBean.setOutboundTag("proxy");
                rulesBean.setDomain(new ArrayList<>());
                V2rayConfig.RoutingBean.RulesBean rulesBean2 = new V2rayConfig.RoutingBean.RulesBean(null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16383, null);
                rulesBean2.setType("field");
                rulesBean2.setOutboundTag("proxy");
                rulesBean2.setIp(new ArrayList<>());
                List<String> m386F = C10929r.m386F("", new String[]{","});
                ArrayList arrayList2 = new ArrayList(C10753i.m482g(m386F));
                for (String str : m386F) {
                    arrayList2.add(C10929r.m381K(str).toString());
                }
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    String str2 = (String) it.next();
                    C2524e c2524e = C2524e.f6008a;
                    if (!C2524e.m9393d(str2)) {
                        boolean z = false;
                        if (!C10925n.m392k(str2, "geoip:", false)) {
                            if (str2.length() > 0) {
                                z = true;
                            }
                            if (z && (arrayList = rulesBean.getDomain()) != null) {
                                arrayList.add(str2);
                            }
                        }
                    }
                    arrayList = rulesBean2.getIp();
                    if (arrayList != null) {
                        arrayList.add(str2);
                    }
                }
                ArrayList<String> domain = rulesBean.getDomain();
                Integer num2 = null;
                if (domain != null) {
                    num = Integer.valueOf(domain.size());
                } else {
                    num = null;
                }
                C10843j.m433c(num);
                if (num.intValue() > 0) {
                    v2rayConfig.getRouting().getRules().add(rulesBean);
                }
                ArrayList<String> ip = rulesBean2.getIp();
                if (ip != null) {
                    num2 = Integer.valueOf(ip.size());
                }
                C10843j.m433c(num2);
                if (num2.intValue() > 0) {
                    v2rayConfig.getRouting().getRules().add(rulesBean2);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: c */
    public static ArrayList m9382c() {
        ArrayList arrayList = new ArrayList();
        List<String> m386F = C10929r.m386F("", new String[]{","});
        ArrayList arrayList2 = new ArrayList(C10753i.m482g(m386F));
        for (String str : m386F) {
            arrayList2.add(C10929r.m381K(str).toString());
        }
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            if (C10925n.m392k(str2, "geosite:", false) || C10925n.m392k(str2, "domain:", false)) {
                arrayList.add(str2);
            }
        }
        return arrayList;
    }
}
