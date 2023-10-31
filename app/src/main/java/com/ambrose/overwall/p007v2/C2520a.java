package com.ambrose.overwall.p007v2;

import android.content.Context;
import android.text.TextUtils;
import com.ambrose.overwall.p007v2.C2530g;
import com.google.gson.C8686j;
import io.reactivex.rxjava3.annotations.SchedulerSupport;
import java.net.URI;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.C10806j;
import kotlin.collections.C10752h;
import kotlin.collections.C10753i;
import kotlin.collections.C10765u;
import kotlin.jvm.internal.C10843j;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.C10914e;
import kotlin.text.C10925n;
import kotlin.text.C10929r;
import libv2ray.ServerConfig;
import libv2ray.V2rayConfig;
import libv2ray.VmessQRCode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SourceDebugExtension({"SMAP\nCustomConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CustomConfig.kt\ncom/ambrose/overwall/v2/CustomConfig\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,407:1\n1549#2:408\n1620#2,2:409\n1622#2:412\n1549#2:413\n1620#2,3:414\n1549#2:417\n1620#2,3:418\n1#3:411\n*S KotlinDebug\n*F\n+ 1 CustomConfig.kt\ncom/ambrose/overwall/v2/CustomConfig\n*L\n162#1:408\n162#1:409,2\n162#1:412\n170#1:413\n170#1:414,3\n208#1:417\n208#1:418,3\n*E\n"})
/* renamed from: com.ambrose.overwall.v2.a */
/* loaded from: classes.dex */
public final class C2520a {
    @NotNull

    /* renamed from: a */
    public static final C2520a f5999a = new C2520a();

    @Nullable
    /* renamed from: a */
    public static ServerConfig m9400a(@Nullable String str) {
        ServerConfig create;
        V2rayConfig.OutboundBean.StreamSettingsBean streamSettings;
        V2rayConfig.OutboundBean.OutSettingsBean settings;
        List<V2rayConfig.OutboundBean.OutSettingsBean.VnextBean> vnext;
        V2rayConfig.OutboundBean.OutSettingsBean.VnextBean vnextBean;
        V2rayConfig.OutboundBean.StreamSettingsBean streamSettings2;
        V2rayConfig.OutboundBean.OutSettingsBean settings2;
        List<V2rayConfig.OutboundBean.OutSettingsBean.ServersBean> servers;
        V2rayConfig.OutboundBean.OutSettingsBean.ServersBean serversBean;
        C10914e c10914e;
        V2rayConfig.OutboundBean.OutSettingsBean settings3;
        List<V2rayConfig.OutboundBean.OutSettingsBean.ServersBean> servers2;
        V2rayConfig.OutboundBean.OutSettingsBean.ServersBean serversBean2;
        String input;
        C10914e c10914e2;
        V2rayConfig.OutboundBean.OutSettingsBean settings4;
        List<V2rayConfig.OutboundBean.OutSettingsBean.ServersBean> servers3;
        V2rayConfig.OutboundBean.OutSettingsBean.ServersBean serversBean3;
        V2rayConfig.OutboundBean.StreamSettingsBean streamSettings3;
        V2rayConfig.OutboundBean.OutSettingsBean settings5;
        List<V2rayConfig.OutboundBean.OutSettingsBean.VnextBean> vnext2;
        V2rayConfig.OutboundBean.OutSettingsBean.VnextBean vnextBean2;
        int i;
        int i2;
        if (str != null) {
            try {
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
            if (!TextUtils.isEmpty(str)) {
                EnumC2521b enumC2521b = EnumC2521b.VMESS;
                String str2 = "";
                if (C10925n.m392k(str, "vmess://", false)) {
                    ServerConfig create2 = ServerConfig.Companion.create(enumC2521b);
                    V2rayConfig.OutboundBean outboundBean = create2.getOutboundBean();
                    if (outboundBean != null && (streamSettings3 = outboundBean.getStreamSettings()) != null) {
                        if (!m9398c(str, create2)) {
                            if (C10929r.m373s(str, "?", 0, false, 6) > 0) {
                                m9397d(str, create2);
                            } else {
                                String m394i = C10925n.m394i(str, "vmess://", "");
                                C2524e c2524e = C2524e.f6008a;
                                VmessQRCode vmessQRCode = (VmessQRCode) new C8686j().m3235c(VmessQRCode.class, C2524e.m9396a(m394i));
                                if (TextUtils.isEmpty(vmessQRCode.getAdd()) || TextUtils.isEmpty(vmessQRCode.getPort()) || TextUtils.isEmpty(vmessQRCode.getId()) || TextUtils.isEmpty(vmessQRCode.getAid()) || TextUtils.isEmpty(vmessQRCode.getNet())) {
                                    vmessQRCode.getPs();
                                }
                                create2.setRemarks(vmessQRCode.getPs());
                                V2rayConfig.OutboundBean outboundBean2 = create2.getOutboundBean();
                                if (outboundBean2 != null && (settings5 = outboundBean2.getSettings()) != null && (vnext2 = settings5.getVnext()) != null && (vnextBean2 = vnext2.get(0)) != null) {
                                    vnextBean2.setAddress(vmessQRCode.getAdd());
                                    String str3 = vmessQRCode.getPort();
                                    C10843j.m430f(str3, "str");
                                    try {
                                        i = Integer.parseInt(str3);
                                    } catch (Exception e2) {
                                        e2.printStackTrace();
                                        i = 0;
                                    }
                                    vnextBean2.setPort(i);
                                    vnextBean2.getUsers().get(0).setId(vmessQRCode.getId());
                                    vnextBean2.getUsers().get(0).setEncryption(V2rayConfig.DEFAULT_SECURITY);
                                    V2rayConfig.OutboundBean.OutSettingsBean.VnextBean.UsersBean usersBean = vnextBean2.getUsers().get(0);
                                    String str4 = vmessQRCode.getAid();
                                    C10843j.m430f(str4, "str");
                                    try {
                                        i2 = Integer.parseInt(str4);
                                    } catch (Exception e3) {
                                        e3.printStackTrace();
                                        i2 = 0;
                                    }
                                    usersBean.setAlterId(Integer.valueOf(i2));
                                }
                                String populateTransportSettings = streamSettings3.populateTransportSettings(vmessQRCode.getNet(), vmessQRCode.getType(), vmessQRCode.getHost(), vmessQRCode.getPath(), vmessQRCode.getPath(), vmessQRCode.getHost(), vmessQRCode.getPath(), vmessQRCode.getType(), vmessQRCode.getPath());
                                String tls = vmessQRCode.getTls();
                                if (!TextUtils.isEmpty(vmessQRCode.getSni())) {
                                    populateTransportSettings = vmessQRCode.getSni();
                                }
                                streamSettings3.populateTlsSettings(tls, false, populateTransportSettings);
                            }
                        }
                        return create2;
                    }
                    return create2;
                }
                EnumC2521b enumC2521b2 = EnumC2521b.SHADOWSOCKS;
                if (C10925n.m392k(str, "ss://", false)) {
                    String m394i2 = C10925n.m394i(str, "ss://", "");
                    int m373s = C10929r.m373s(m394i2, "#", 0, false, 6);
                    create = ServerConfig.Companion.create(enumC2521b2);
                    if (m373s > 0) {
                        try {
                            C2524e c2524e2 = C2524e.f6008a;
                            String substring = m394i2.substring(m373s + 1, m394i2.length());
                            C10843j.m431e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                            try {
                                String decode = URLDecoder.decode(substring, "UTF-8");
                                C10843j.m431e(decode, "decode(url, \"UTF-8\")");
                                substring = decode;
                            } catch (Exception e4) {
                                e4.printStackTrace();
                            }
                            create.setRemarks(substring);
                        } catch (Exception e5) {
                            e5.printStackTrace();
                        }
                        m394i2 = m394i2.substring(0, m373s);
                        C10843j.m431e(m394i2, "this as java.lang.String…ing(startIndex, endIndex)");
                    }
                    int m373s2 = C10929r.m373s(m394i2, "@", 0, false, 6);
                    if (m373s2 > 0) {
                        C2524e c2524e3 = C2524e.f6008a;
                        String substring2 = m394i2.substring(0, m373s2);
                        C10843j.m431e(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                        String m9396a = C2524e.m9396a(substring2);
                        String substring3 = m394i2.substring(m373s2, m394i2.length());
                        C10843j.m431e(substring3, "this as java.lang.String…ing(startIndex, endIndex)");
                        input = m9396a.concat(substring3);
                    } else {
                        C2524e c2524e4 = C2524e.f6008a;
                        input = C2524e.m9396a(m394i2);
                    }
                    Pattern compile = Pattern.compile("^(.+?):(.*)@(.+?):(\\d+?)/?$");
                    C10843j.m431e(compile, "compile(pattern)");
                    C10843j.m430f(input, "input");
                    Matcher matcher = compile.matcher(input);
                    C10843j.m431e(matcher, "nativePattern.matcher(input)");
                    if (!matcher.matches()) {
                        c10914e2 = null;
                    } else {
                        c10914e2 = new C10914e(matcher, input);
                    }
                    if (c10914e2 == null) {
                        return null;
                    }
                    V2rayConfig.OutboundBean outboundBean3 = create.getOutboundBean();
                    if (outboundBean3 != null && (settings4 = outboundBean3.getSettings()) != null && (servers3 = settings4.getServers()) != null && (serversBean3 = servers3.get(0)) != null) {
                        serversBean3.setAddress(C10929r.m390B((String) ((C10914e.C10915a) c10914e2.m403a()).get(3), "[", "]"));
                        serversBean3.setPort(Integer.parseInt((String) ((C10914e.C10915a) c10914e2.m403a()).get(4)));
                        serversBean3.setPassword((String) ((C10914e.C10915a) c10914e2.m403a()).get(2));
                        Locale locale = Locale.getDefault();
                        C10843j.m431e(locale, "getDefault()");
                        String lowerCase = ((String) ((C10914e.C10915a) c10914e2.m403a()).get(1)).toLowerCase(locale);
                        C10843j.m431e(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                        serversBean3.setMethod(lowerCase);
                    }
                    return create;
                }
                EnumC2521b enumC2521b3 = EnumC2521b.SOCKS;
                if (C10925n.m392k(str, "socks://", false)) {
                    String m394i3 = C10925n.m394i(str, "socks://", "");
                    int m373s3 = C10929r.m373s(m394i3, "#", 0, false, 6);
                    create = ServerConfig.Companion.create(enumC2521b3);
                    if (m373s3 > 0) {
                        try {
                            C2524e c2524e5 = C2524e.f6008a;
                            String substring4 = m394i3.substring(m373s3 + 1, m394i3.length());
                            C10843j.m431e(substring4, "this as java.lang.String…ing(startIndex, endIndex)");
                            try {
                                String decode2 = URLDecoder.decode(substring4, "UTF-8");
                                C10843j.m431e(decode2, "decode(url, \"UTF-8\")");
                                substring4 = decode2;
                            } catch (Exception e6) {
                                e6.printStackTrace();
                            }
                            create.setRemarks(substring4);
                        } catch (Exception e7) {
                            e7.printStackTrace();
                        }
                        m394i3 = m394i3.substring(0, m373s3);
                        C10843j.m431e(m394i3, "this as java.lang.String…ing(startIndex, endIndex)");
                    }
                    if (C10929r.m373s(m394i3, "@", 0, false, 6) <= 0) {
                        C2524e c2524e6 = C2524e.f6008a;
                        m394i3 = C2524e.m9396a(m394i3);
                    }
                    Pattern compile2 = Pattern.compile("^(.*):(.*)@(.+?):(\\d+?)$");
                    C10843j.m431e(compile2, "compile(pattern)");
                    Matcher matcher2 = compile2.matcher(m394i3);
                    C10843j.m431e(matcher2, "nativePattern.matcher(input)");
                    if (!matcher2.matches()) {
                        c10914e = null;
                    } else {
                        c10914e = new C10914e(matcher2, m394i3);
                    }
                    if (c10914e == null) {
                        return null;
                    }
                    V2rayConfig.OutboundBean outboundBean4 = create.getOutboundBean();
                    if (outboundBean4 != null && (settings3 = outboundBean4.getSettings()) != null && (servers2 = settings3.getServers()) != null && (serversBean2 = servers2.get(0)) != null) {
                        serversBean2.setAddress(C10929r.m390B((String) ((C10914e.C10915a) c10914e.m403a()).get(3), "[", "]"));
                        serversBean2.setPort(Integer.parseInt((String) ((C10914e.C10915a) c10914e.m403a()).get(4)));
                        V2rayConfig.OutboundBean.OutSettingsBean.ServersBean.SocksUsersBean socksUsersBean = new V2rayConfig.OutboundBean.OutSettingsBean.ServersBean.SocksUsersBean(null, null, 0, 7, null);
                        Locale locale2 = Locale.getDefault();
                        C10843j.m431e(locale2, "getDefault()");
                        String lowerCase2 = ((String) ((C10914e.C10915a) c10914e.m403a()).get(1)).toLowerCase(locale2);
                        C10843j.m431e(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
                        socksUsersBean.setUser(lowerCase2);
                        socksUsersBean.setPass((String) ((C10914e.C10915a) c10914e.m403a()).get(2));
                        serversBean2.setUsers(C10752h.m486c(socksUsersBean));
                    }
                } else {
                    EnumC2521b enumC2521b4 = EnumC2521b.TROJAN;
                    if (C10925n.m392k(str, "trojan://", false)) {
                        URI uri = new URI(str);
                        ServerConfig create3 = ServerConfig.Companion.create(enumC2521b4);
                        String fragment = uri.getFragment();
                        if (fragment == null) {
                            fragment = "";
                        }
                        create3.setRemarks(fragment);
                        V2rayConfig.OutboundBean outboundBean5 = create3.getOutboundBean();
                        if (outboundBean5 != null && (settings2 = outboundBean5.getSettings()) != null && (servers = settings2.getServers()) != null && (serversBean = servers.get(0)) != null) {
                            String host = uri.getHost();
                            C10843j.m431e(host, "uri.host");
                            serversBean.setAddress(host);
                            serversBean.setPort(uri.getPort());
                            String userInfo = uri.getUserInfo();
                            C10843j.m431e(userInfo, "uri.userInfo");
                            serversBean.setPassword(userInfo);
                        }
                        String rawQuery = uri.getRawQuery();
                        if (rawQuery != null) {
                            List<String> m386F = C10929r.m386F(rawQuery, new String[]{"&"});
                            ArrayList arrayList = new ArrayList(C10753i.m482g(m386F));
                            for (String str5 : m386F) {
                                List m386F2 = C10929r.m386F(str5, new String[]{"="});
                                String decode3 = URLDecoder.decode((String) m386F2.get(1), "utf-8");
                                C10843j.m433c(decode3);
                                arrayList.add(new C10806j((String) m386F2.get(0), decode3));
                            }
                            String str6 = (String) C10765u.m464e(arrayList).get("sni");
                            if (str6 != null) {
                                str2 = str6;
                            }
                        }
                        V2rayConfig.OutboundBean outboundBean6 = create3.getOutboundBean();
                        if (outboundBean6 != null && (streamSettings2 = outboundBean6.getStreamSettings()) != null) {
                            streamSettings2.populateTlsSettings(V2rayConfig.TLS, false, str2);
                        }
                        return create3;
                    }
                    EnumC2521b enumC2521b5 = EnumC2521b.VLESS;
                    if (C10925n.m392k(str, "vless://", false)) {
                        URI uri2 = new URI(str);
                        String rawQuery2 = uri2.getRawQuery();
                        C10843j.m431e(rawQuery2, "uri.rawQuery");
                        List<String> m386F3 = C10929r.m386F(rawQuery2, new String[]{"&"});
                        ArrayList arrayList2 = new ArrayList(C10753i.m482g(m386F3));
                        for (String str7 : m386F3) {
                            List m386F4 = C10929r.m386F(str7, new String[]{"="});
                            String decode4 = URLDecoder.decode((String) m386F4.get(1), "utf-8");
                            C10843j.m433c(decode4);
                            arrayList2.add(new C10806j((String) m386F4.get(0), decode4));
                        }
                        Map m464e = C10765u.m464e(arrayList2);
                        create = ServerConfig.Companion.create(enumC2521b5);
                        V2rayConfig.OutboundBean outboundBean7 = create.getOutboundBean();
                        if (outboundBean7 != null && (streamSettings = outboundBean7.getStreamSettings()) != null) {
                            String fragment2 = uri2.getFragment();
                            if (fragment2 == null) {
                                fragment2 = "";
                            }
                            create.setRemarks(fragment2);
                            V2rayConfig.OutboundBean outboundBean8 = create.getOutboundBean();
                            if (outboundBean8 != null && (settings = outboundBean8.getSettings()) != null && (vnext = settings.getVnext()) != null && (vnextBean = vnext.get(0)) != null) {
                                String host2 = uri2.getHost();
                                C10843j.m431e(host2, "uri.host");
                                vnextBean.setAddress(host2);
                                vnextBean.setPort(uri2.getPort());
                                String userInfo2 = uri2.getUserInfo();
                                C10843j.m431e(userInfo2, "uri.userInfo");
                                vnextBean.getUsers().get(0).setId(userInfo2);
                                V2rayConfig.OutboundBean.OutSettingsBean.VnextBean.UsersBean usersBean2 = vnextBean.getUsers().get(0);
                                String str8 = (String) m464e.get("encryption");
                                if (str8 == null) {
                                    str8 = SchedulerSupport.NONE;
                                }
                                usersBean2.setEncryption(str8);
                                V2rayConfig.OutboundBean.OutSettingsBean.VnextBean.UsersBean usersBean3 = vnextBean.getUsers().get(0);
                                String str9 = (String) m464e.get("flow");
                                if (str9 == null) {
                                    str9 = "";
                                }
                                usersBean3.setFlow(str9);
                            }
                            String str10 = (String) m464e.get("type");
                            if (str10 == null) {
                                str10 = V2rayConfig.DEFAULT_NETWORK;
                            }
                            String populateTransportSettings2 = streamSettings.populateTransportSettings(str10, (String) m464e.get("headerType"), (String) m464e.get("host"), (String) m464e.get("path"), (String) m464e.get("seed"), (String) m464e.get("quicSecurity"), (String) m464e.get("key"), (String) m464e.get("mode"), (String) m464e.get("serviceName"));
                            String str11 = (String) m464e.get("security");
                            if (str11 != null) {
                                str2 = str11;
                            }
                            String str12 = (String) m464e.get("sni");
                            if (str12 != null) {
                                populateTransportSettings2 = str12;
                            }
                            streamSettings.populateTlsSettings(str2, false, populateTransportSettings2);
                        }
                        return null;
                    }
                    return null;
                }
                return create;
                e.printStackTrace();
                return null;
            }
            return null;
        }
        return null;
    }

    @NotNull
    /* renamed from: b */
    public static C2530g.C2531a m9399b(@NotNull Context context, @NotNull ServerConfig serverConfig) {
        try {
            V2rayConfig.OutboundBean proxyOutbound = serverConfig.getProxyOutbound();
            return proxyOutbound == null ? new C2530g.C2531a() : C2530g.m9384a(context, proxyOutbound);
        } catch (Exception e) {
            e.printStackTrace();
            return new C2530g.C2531a();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0174 A[Catch: all -> 0x01e6, TryCatch #0 {all -> 0x01e6, blocks: (B:2:0x0000, B:4:0x0013, B:9:0x0040, B:13:0x006d, B:14:0x008f, B:16:0x0095, B:17:0x00c3, B:19:0x00cd, B:22:0x00d5, B:24:0x00ed, B:26:0x00f3, B:28:0x00fb, B:29:0x013f, B:32:0x0153, B:37:0x016a, B:39:0x0174, B:46:0x018d, B:49:0x01c5, B:51:0x01ce, B:52:0x01d9, B:7:0x0039, B:53:0x01da, B:54:0x01e5), top: B:63:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01f2  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean m9398c(java.lang.String r17, libv2ray.ServerConfig r18) {
        /*
            Method dump skipped, instructions count: 507
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ambrose.overwall.p007v2.C2520a.m9398c(java.lang.String, libv2ray.ServerConfig):boolean");
    }

    /* renamed from: d */
    public static void m9397d(String str, ServerConfig serverConfig) {
        V2rayConfig.OutboundBean.OutSettingsBean settings;
        List<V2rayConfig.OutboundBean.OutSettingsBean.VnextBean> vnext;
        V2rayConfig.OutboundBean.OutSettingsBean.VnextBean vnextBean;
        int i;
        String m394i = C10925n.m394i(str, "vmess://", "");
        int m373s = C10929r.m373s(m394i, "?", 0, false, 6);
        if (m373s > 0) {
            m394i = m394i.substring(0, m373s);
            C10843j.m431e(m394i, "this as java.lang.String…ing(startIndex, endIndex)");
        }
        C2524e c2524e = C2524e.f6008a;
        List m387E = C10929r.m387E(C2524e.m9396a(m394i), new char[]{'@'});
        if (m387E.size() != 2) {
            return;
        }
        List m387E2 = C10929r.m387E((CharSequence) m387E.get(0), new char[]{':'});
        List m387E3 = C10929r.m387E((CharSequence) m387E.get(1), new char[]{':'});
        if (m387E2.size() != 2) {
            return;
        }
        serverConfig.setRemarks("Tempo");
        V2rayConfig.OutboundBean outboundBean = serverConfig.getOutboundBean();
        if (outboundBean != null && (settings = outboundBean.getSettings()) != null && (vnext = settings.getVnext()) != null && (vnextBean = vnext.get(0)) != null) {
            vnextBean.setAddress((String) m387E3.get(0));
            String str2 = (String) m387E3.get(1);
            C10843j.m430f(str2, "str");
            try {
                i = Integer.parseInt(str2);
            } catch (Exception e) {
                e.printStackTrace();
                i = 0;
            }
            vnextBean.setPort(i);
            vnextBean.getUsers().get(0).setId((String) m387E2.get(1));
            vnextBean.getUsers().get(0).setEncryption((String) m387E2.get(0));
            vnextBean.getUsers().get(0).setAlterId(0);
        }
    }
}
