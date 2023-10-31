package libv2ray;

import androidx.appcompat.widget.C0406q1;
import androidx.core.p003os.C0740h;
import com.google.ads.mediation.facebook.FacebookAdapter;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.common.Scopes;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.AbstractC8576a0;
import com.google.gson.AbstractC8692o;
import com.google.gson.C8688k;
import com.google.gson.C8700u;
import com.google.gson.InterfaceC8689l;
import com.google.gson.InterfaceC8701v;
import com.google.gson.InterfaceC8702w;
import com.google.gson.annotations.SerializedName;
import com.google.gson.internal.bind.TreeTypeAdapter;
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.reflect.C8696a;
import com.unity3d.ads.metadata.MediationMetaData;
import io.reactivex.rxjava3.annotations.SchedulerSupport;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C10752h;
import kotlin.collections.C10757m;
import kotlin.jvm.internal.C10839f;
import kotlin.jvm.internal.C10843j;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.C10925n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m509d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b/\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\b\u0018\u0000 H2\u00020\u0001:\bHIJKLMNOB\u009f\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0016\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\n\u0012\u0016\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\f0\bj\b\u0012\u0004\u0012\u00020\f`\n\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0001\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0001\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0001\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0001\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0001¢\u0006\u0002\u0010\u0016J\u000b\u00102\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\t\u00106\u001a\u00020\u0004HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0019\u00108\u001a\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\nHÆ\u0003J\u0019\u00109\u001a\u0012\u0012\u0004\u0012\u00020\f0\bj\b\u0012\u0004\u0012\u00020\f`\nHÆ\u0003J\t\u0010:\u001a\u00020\u000eHÆ\u0003J\t\u0010;\u001a\u00020\u0010HÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0001HÆ\u0003J¯\u0001\u0010>\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0018\b\u0002\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\n2\u0018\b\u0002\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\f0\bj\b\u0012\u0004\u0012\u00020\f`\n2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÆ\u0001J\u0013\u0010?\u001a\u00020@2\b\u0010A\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\b\u0010B\u001a\u0004\u0018\u00010\fJ\t\u0010C\u001a\u00020DHÖ\u0001J\u0006\u0010E\u001a\u00020FJ\t\u0010G\u001a\u00020FHÖ\u0001R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0001X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0018\"\u0004\b\u001f\u0010 R!\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\n¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R*\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\f0\bj\b\u0012\u0004\u0012\u00020\f`\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\"\"\u0004\b&\u0010'R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u0018R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0001X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u0018\"\u0004\b0\u0010 R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b1\u0010\u0018¨\u0006P"}, m508d2 = {"Llibv2ray/V2rayConfig;", "", "stats", "log", "Llibv2ray/V2rayConfig$LogBean;", "policy", "Llibv2ray/V2rayConfig$PolicyBean;", "inbounds", "Ljava/util/ArrayList;", "Llibv2ray/V2rayConfig$InboundBean;", "Lkotlin/collections/ArrayList;", "outbounds", "Llibv2ray/V2rayConfig$OutboundBean;", "dns", "Llibv2ray/V2rayConfig$DnsBean;", "routing", "Llibv2ray/V2rayConfig$RoutingBean;", "api", "transport", "reverse", "fakedns", "browserForwarder", "(Ljava/lang/Object;Llibv2ray/V2rayConfig$LogBean;Llibv2ray/V2rayConfig$PolicyBean;Ljava/util/ArrayList;Ljava/util/ArrayList;Llibv2ray/V2rayConfig$DnsBean;Llibv2ray/V2rayConfig$RoutingBean;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", "getApi", "()Ljava/lang/Object;", "getBrowserForwarder", "getDns", "()Llibv2ray/V2rayConfig$DnsBean;", "setDns", "(Llibv2ray/V2rayConfig$DnsBean;)V", "getFakedns", "setFakedns", "(Ljava/lang/Object;)V", "getInbounds", "()Ljava/util/ArrayList;", "getLog", "()Llibv2ray/V2rayConfig$LogBean;", "getOutbounds", "setOutbounds", "(Ljava/util/ArrayList;)V", "getPolicy", "()Llibv2ray/V2rayConfig$PolicyBean;", "setPolicy", "(Llibv2ray/V2rayConfig$PolicyBean;)V", "getReverse", "getRouting", "()Llibv2ray/V2rayConfig$RoutingBean;", "getStats", "setStats", "getTransport", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "getProxyOutbound", "hashCode", "", "toPrettyPrinting", "", "toString", "Companion", "DnsBean", "FakednsBean", "InboundBean", "LogBean", "OutboundBean", "PolicyBean", "RoutingBean", "app_release"}, m507k = 1, m506mv = {1, 8, 0}, m504xi = 48)
@SourceDebugExtension({"SMAP\nV2rayConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 V2rayConfig.kt\nlibv2ray/V2rayConfig\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,448:1\n1855#2,2:449\n*S KotlinDebug\n*F\n+ 1 V2rayConfig.kt\nlibv2ray/V2rayConfig\n*L\n424#1:449,2\n*E\n"})
/* loaded from: classes3.dex */
public final class V2rayConfig {
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    public static final String DEFAULT_FLOW = "xtls-rprx-splice";
    public static final int DEFAULT_LEVEL = 8;
    @NotNull
    public static final String DEFAULT_NETWORK = "tcp";
    public static final int DEFAULT_PORT = 443;
    @NotNull
    public static final String DEFAULT_SECURITY = "auto";
    @NotNull
    public static final String HTTP = "http";
    @NotNull
    public static final String TLS = "tls";
    @NotNull
    public static final String XTLS = "xtls";
    @Nullable
    private final Object api;
    @Nullable
    private final Object browserForwarder;
    @NotNull
    private DnsBean dns;
    @Nullable
    private Object fakedns;
    @NotNull
    private final ArrayList<InboundBean> inbounds;
    @NotNull
    private final LogBean log;
    @NotNull
    private ArrayList<OutboundBean> outbounds;
    @Nullable
    private PolicyBean policy;
    @Nullable
    private final Object reverse;
    @NotNull
    private final RoutingBean routing;
    @Nullable
    private Object stats;
    @Nullable
    private final Object transport;

    @Metadata(m509d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\r"}, m508d2 = {"Llibv2ray/V2rayConfig$Companion;", "", "()V", "DEFAULT_FLOW", "", "DEFAULT_LEVEL", "", "DEFAULT_NETWORK", "DEFAULT_PORT", "DEFAULT_SECURITY", "HTTP", "TLS", "XTLS", "app_release"}, m507k = 1, m506mv = {1, 8, 0}, m504xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C10839f c10839f) {
            this();
        }
    }

    @Metadata(m509d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u001d\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0001*Bk\u0012\u001c\b\u0002\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003j\n\u0012\u0004\u0012\u00020\u0001\u0018\u0001`\u0004\u0012\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\rJ\u001d\u0010\u001d\u001a\u0016\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003j\n\u0012\u0004\u0012\u00020\u0001\u0018\u0001`\u0004HÆ\u0003J\u0017\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0010\u0010 \u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u0011J\u000b\u0010!\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0007HÆ\u0003Jt\u0010#\u001a\u00020\u00002\u001c\b\u0002\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003j\n\u0012\u0004\u0012\u00020\u0001\u0018\u0001`\u00042\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010$J\u0013\u0010%\u001a\u00020\n2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020(HÖ\u0001J\t\u0010)\u001a\u00020\u0007HÖ\u0001R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0015\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R(\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000fR.\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003j\n\u0012\u0004\u0012\u00020\u0001\u0018\u0001`\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0013\u0010\f\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u000f¨\u0006+"}, m508d2 = {"Llibv2ray/V2rayConfig$DnsBean;", "", "servers", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "hosts", "", "", "clientIp", "disableCache", "", "queryStrategy", "tag", "(Ljava/util/ArrayList;Ljava/util/Map;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)V", "getClientIp", "()Ljava/lang/String;", "getDisableCache", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getHosts", "()Ljava/util/Map;", "setHosts", "(Ljava/util/Map;)V", "getQueryStrategy", "getServers", "()Ljava/util/ArrayList;", "setServers", "(Ljava/util/ArrayList;)V", "getTag", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/util/ArrayList;Ljava/util/Map;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)Llibv2ray/V2rayConfig$DnsBean;", "equals", "other", "hashCode", "", "toString", "ServersBean", "app_release"}, m507k = 1, m506mv = {1, 8, 0}, m504xi = 48)
    /* loaded from: classes3.dex */
    public static final class DnsBean {
        @Nullable
        private final String clientIp;
        @Nullable
        private final Boolean disableCache;
        @Nullable
        private Map<String, ? extends Object> hosts;
        @Nullable
        private final String queryStrategy;
        @Nullable
        private ArrayList<Object> servers;
        @Nullable
        private final String tag;

        @Metadata(m509d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BK\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\nJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0017J\u0011\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007HÆ\u0003J\u0011\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003JT\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00072\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010!J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020\u0005HÖ\u0001J\t\u0010&\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0011\"\u0004\b\u0015\u0010\u0013R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001a\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006'"}, m508d2 = {"Llibv2ray/V2rayConfig$DnsBean$ServersBean;", "", "address", "", "port", "", "domains", "", "expectIPs", "clientIp", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;Ljava/lang/String;)V", "getAddress", "()Ljava/lang/String;", "setAddress", "(Ljava/lang/String;)V", "getClientIp", "getDomains", "()Ljava/util/List;", "setDomains", "(Ljava/util/List;)V", "getExpectIPs", "setExpectIPs", "getPort", "()Ljava/lang/Integer;", "setPort", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;Ljava/lang/String;)Llibv2ray/V2rayConfig$DnsBean$ServersBean;", "equals", "", "other", "hashCode", "toString", "app_release"}, m507k = 1, m506mv = {1, 8, 0}, m504xi = 48)
        /* loaded from: classes3.dex */
        public static final class ServersBean {
            @NotNull
            private String address;
            @Nullable
            private final String clientIp;
            @Nullable
            private List<String> domains;
            @Nullable
            private List<String> expectIPs;
            @Nullable
            private Integer port;

            public ServersBean() {
                this(null, null, null, null, null, 31, null);
            }

            public ServersBean(@NotNull String address, @Nullable Integer num, @Nullable List<String> list, @Nullable List<String> list2, @Nullable String str) {
                C10843j.m430f(address, "address");
                this.address = address;
                this.port = num;
                this.domains = list;
                this.expectIPs = list2;
                this.clientIp = str;
            }

            public /* synthetic */ ServersBean(String str, Integer num, List list, List list2, String str2, int i, C10839f c10839f) {
                this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : list, (i & 8) != 0 ? null : list2, (i & 16) == 0 ? str2 : null);
            }

            public static /* synthetic */ ServersBean copy$default(ServersBean serversBean, String str, Integer num, List list, List list2, String str2, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = serversBean.address;
                }
                if ((i & 2) != 0) {
                    num = serversBean.port;
                }
                Integer num2 = num;
                List<String> list3 = list;
                if ((i & 4) != 0) {
                    list3 = serversBean.domains;
                }
                List list4 = list3;
                List<String> list5 = list2;
                if ((i & 8) != 0) {
                    list5 = serversBean.expectIPs;
                }
                List list6 = list5;
                if ((i & 16) != 0) {
                    str2 = serversBean.clientIp;
                }
                return serversBean.copy(str, num2, list4, list6, str2);
            }

            @NotNull
            public final String component1() {
                return this.address;
            }

            @Nullable
            public final Integer component2() {
                return this.port;
            }

            @Nullable
            public final List<String> component3() {
                return this.domains;
            }

            @Nullable
            public final List<String> component4() {
                return this.expectIPs;
            }

            @Nullable
            public final String component5() {
                return this.clientIp;
            }

            @NotNull
            public final ServersBean copy(@NotNull String address, @Nullable Integer num, @Nullable List<String> list, @Nullable List<String> list2, @Nullable String str) {
                C10843j.m430f(address, "address");
                return new ServersBean(address, num, list, list2, str);
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof ServersBean) {
                    ServersBean serversBean = (ServersBean) obj;
                    return C10843j.m435a(this.address, serversBean.address) && C10843j.m435a(this.port, serversBean.port) && C10843j.m435a(this.domains, serversBean.domains) && C10843j.m435a(this.expectIPs, serversBean.expectIPs) && C10843j.m435a(this.clientIp, serversBean.clientIp);
                }
                return false;
            }

            @NotNull
            public final String getAddress() {
                return this.address;
            }

            @Nullable
            public final String getClientIp() {
                return this.clientIp;
            }

            @Nullable
            public final List<String> getDomains() {
                return this.domains;
            }

            @Nullable
            public final List<String> getExpectIPs() {
                return this.expectIPs;
            }

            @Nullable
            public final Integer getPort() {
                return this.port;
            }

            public int hashCode() {
                int hashCode = this.address.hashCode() * 31;
                Integer num = this.port;
                int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
                List<String> list = this.domains;
                int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
                List<String> list2 = this.expectIPs;
                int hashCode4 = (hashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
                String str = this.clientIp;
                return hashCode4 + (str != null ? str.hashCode() : 0);
            }

            public final void setAddress(@NotNull String str) {
                C10843j.m430f(str, "<set-?>");
                this.address = str;
            }

            public final void setDomains(@Nullable List<String> list) {
                this.domains = list;
            }

            public final void setExpectIPs(@Nullable List<String> list) {
                this.expectIPs = list;
            }

            public final void setPort(@Nullable Integer num) {
                this.port = num;
            }

            @NotNull
            public String toString() {
                StringBuilder sb = new StringBuilder("ServersBean(address=");
                sb.append(this.address);
                sb.append(", port=");
                sb.append(this.port);
                sb.append(", domains=");
                sb.append(this.domains);
                sb.append(", expectIPs=");
                sb.append(this.expectIPs);
                sb.append(", clientIp=");
                return C0740h.m11848b(sb, this.clientIp, ')');
            }
        }

        public DnsBean() {
            this(null, null, null, null, null, null, 63, null);
        }

        public DnsBean(@Nullable ArrayList<Object> arrayList, @Nullable Map<String, ? extends Object> map, @Nullable String str, @Nullable Boolean bool, @Nullable String str2, @Nullable String str3) {
            this.servers = arrayList;
            this.hosts = map;
            this.clientIp = str;
            this.disableCache = bool;
            this.queryStrategy = str2;
            this.tag = str3;
        }

        public /* synthetic */ DnsBean(ArrayList arrayList, Map map, String str, Boolean bool, String str2, String str3, int i, C10839f c10839f) {
            this((i & 1) != 0 ? null : arrayList, (i & 2) != 0 ? null : map, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : bool, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : str3);
        }

        public static /* synthetic */ DnsBean copy$default(DnsBean dnsBean, ArrayList arrayList, Map map, String str, Boolean bool, String str2, String str3, int i, Object obj) {
            ArrayList<Object> arrayList2 = arrayList;
            if ((i & 1) != 0) {
                arrayList2 = dnsBean.servers;
            }
            Map<String, ? extends Object> map2 = map;
            if ((i & 2) != 0) {
                map2 = dnsBean.hosts;
            }
            Map map3 = map2;
            if ((i & 4) != 0) {
                str = dnsBean.clientIp;
            }
            String str4 = str;
            if ((i & 8) != 0) {
                bool = dnsBean.disableCache;
            }
            Boolean bool2 = bool;
            if ((i & 16) != 0) {
                str2 = dnsBean.queryStrategy;
            }
            String str5 = str2;
            if ((i & 32) != 0) {
                str3 = dnsBean.tag;
            }
            return dnsBean.copy(arrayList2, map3, str4, bool2, str5, str3);
        }

        @Nullable
        public final ArrayList<Object> component1() {
            return this.servers;
        }

        @Nullable
        public final Map<String, Object> component2() {
            return this.hosts;
        }

        @Nullable
        public final String component3() {
            return this.clientIp;
        }

        @Nullable
        public final Boolean component4() {
            return this.disableCache;
        }

        @Nullable
        public final String component5() {
            return this.queryStrategy;
        }

        @Nullable
        public final String component6() {
            return this.tag;
        }

        @NotNull
        public final DnsBean copy(@Nullable ArrayList<Object> arrayList, @Nullable Map<String, ? extends Object> map, @Nullable String str, @Nullable Boolean bool, @Nullable String str2, @Nullable String str3) {
            return new DnsBean(arrayList, map, str, bool, str2, str3);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof DnsBean) {
                DnsBean dnsBean = (DnsBean) obj;
                return C10843j.m435a(this.servers, dnsBean.servers) && C10843j.m435a(this.hosts, dnsBean.hosts) && C10843j.m435a(this.clientIp, dnsBean.clientIp) && C10843j.m435a(this.disableCache, dnsBean.disableCache) && C10843j.m435a(this.queryStrategy, dnsBean.queryStrategy) && C10843j.m435a(this.tag, dnsBean.tag);
            }
            return false;
        }

        @Nullable
        public final String getClientIp() {
            return this.clientIp;
        }

        @Nullable
        public final Boolean getDisableCache() {
            return this.disableCache;
        }

        @Nullable
        public final Map<String, Object> getHosts() {
            return this.hosts;
        }

        @Nullable
        public final String getQueryStrategy() {
            return this.queryStrategy;
        }

        @Nullable
        public final ArrayList<Object> getServers() {
            return this.servers;
        }

        @Nullable
        public final String getTag() {
            return this.tag;
        }

        public int hashCode() {
            ArrayList<Object> arrayList = this.servers;
            int hashCode = (arrayList == null ? 0 : arrayList.hashCode()) * 31;
            Map<String, ? extends Object> map = this.hosts;
            int hashCode2 = (hashCode + (map == null ? 0 : map.hashCode())) * 31;
            String str = this.clientIp;
            int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            Boolean bool = this.disableCache;
            int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
            String str2 = this.queryStrategy;
            int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.tag;
            return hashCode5 + (str3 != null ? str3.hashCode() : 0);
        }

        public final void setHosts(@Nullable Map<String, ? extends Object> map) {
            this.hosts = map;
        }

        public final void setServers(@Nullable ArrayList<Object> arrayList) {
            this.servers = arrayList;
        }

        @NotNull
        public String toString() {
            StringBuilder sb = new StringBuilder("DnsBean(servers=");
            sb.append(this.servers);
            sb.append(", hosts=");
            sb.append(this.hosts);
            sb.append(", clientIp=");
            sb.append(this.clientIp);
            sb.append(", disableCache=");
            sb.append(this.disableCache);
            sb.append(", queryStrategy=");
            sb.append(this.queryStrategy);
            sb.append(", tag=");
            return C0740h.m11848b(sb, this.tag, ')');
        }
    }

    @Metadata(m509d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0017"}, m508d2 = {"Llibv2ray/V2rayConfig$FakednsBean;", "", "ipPool", "", "poolSize", "", "(Ljava/lang/String;I)V", "getIpPool", "()Ljava/lang/String;", "setIpPool", "(Ljava/lang/String;)V", "getPoolSize", "()I", "setPoolSize", "(I)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "app_release"}, m507k = 1, m506mv = {1, 8, 0}, m504xi = 48)
    /* loaded from: classes3.dex */
    public static final class FakednsBean {
        @NotNull
        private String ipPool;
        private int poolSize;

        public FakednsBean() {
            this(null, 0, 3, null);
        }

        public FakednsBean(@NotNull String ipPool, int i) {
            C10843j.m430f(ipPool, "ipPool");
            this.ipPool = ipPool;
            this.poolSize = i;
        }

        public /* synthetic */ FakednsBean(String str, int i, int i2, C10839f c10839f) {
            this((i2 & 1) != 0 ? "198.18.0.0/15" : str, (i2 & 2) != 0 ? 10000 : i);
        }

        public static /* synthetic */ FakednsBean copy$default(FakednsBean fakednsBean, String str, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = fakednsBean.ipPool;
            }
            if ((i2 & 2) != 0) {
                i = fakednsBean.poolSize;
            }
            return fakednsBean.copy(str, i);
        }

        @NotNull
        public final String component1() {
            return this.ipPool;
        }

        public final int component2() {
            return this.poolSize;
        }

        @NotNull
        public final FakednsBean copy(@NotNull String ipPool, int i) {
            C10843j.m430f(ipPool, "ipPool");
            return new FakednsBean(ipPool, i);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof FakednsBean) {
                FakednsBean fakednsBean = (FakednsBean) obj;
                return C10843j.m435a(this.ipPool, fakednsBean.ipPool) && this.poolSize == fakednsBean.poolSize;
            }
            return false;
        }

        @NotNull
        public final String getIpPool() {
            return this.ipPool;
        }

        public final int getPoolSize() {
            return this.poolSize;
        }

        public int hashCode() {
            return (this.ipPool.hashCode() * 31) + this.poolSize;
        }

        public final void setIpPool(@NotNull String str) {
            C10843j.m430f(str, "<set-?>");
            this.ipPool = str;
        }

        public final void setPoolSize(int i) {
            this.poolSize = i;
        }

        @NotNull
        public String toString() {
            return "FakednsBean(ipPool=" + this.ipPool + ", poolSize=" + this.poolSize + ')';
        }
    }

    @Metadata(m509d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001:\u0002./BW\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0001\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0001¢\u0006\u0002\u0010\rJ\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0005HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0001HÆ\u0003Jc\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0001HÆ\u0001J\u0013\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010,\u001a\u00020\u0005HÖ\u0001J\t\u0010-\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0011\"\u0004\b\u0019\u0010\u0013R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u000fR\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u000fR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0011\"\u0004\b\u001f\u0010\u0013¨\u00060"}, m508d2 = {"Llibv2ray/V2rayConfig$InboundBean;", "", "tag", "", "port", "", "protocol", "listen", "settings", "sniffing", "Llibv2ray/V2rayConfig$InboundBean$SniffingBean;", "streamSettings", "allocate", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/Object;Llibv2ray/V2rayConfig$InboundBean$SniffingBean;Ljava/lang/Object;Ljava/lang/Object;)V", "getAllocate", "()Ljava/lang/Object;", "getListen", "()Ljava/lang/String;", "setListen", "(Ljava/lang/String;)V", "getPort", "()I", "setPort", "(I)V", "getProtocol", "setProtocol", "getSettings", "getSniffing", "()Llibv2ray/V2rayConfig$InboundBean$SniffingBean;", "getStreamSettings", "getTag", "setTag", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "toString", "InSettingsBean", "SniffingBean", "app_release"}, m507k = 1, m506mv = {1, 8, 0}, m504xi = 48)
    /* loaded from: classes3.dex */
    public static final class InboundBean {
        @Nullable
        private final Object allocate;
        @Nullable
        private String listen;
        private int port;
        @NotNull
        private String protocol;
        @Nullable
        private final Object settings;
        @Nullable
        private final SniffingBean sniffing;
        @Nullable
        private final Object streamSettings;
        @NotNull
        private String tag;

        @Metadata(m509d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u001c\b\u0086\b\u0018\u00002\u00020\u0001BM\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u000bJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0014J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0011J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0011J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003JV\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u001eJ\u0013\u0010\u001f\u001a\u00020\u00052\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\u0007HÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0015\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0016\u0010\u0011¨\u0006#"}, m508d2 = {"Llibv2ray/V2rayConfig$InboundBean$InSettingsBean;", "", "auth", "", "udp", "", "userLevel", "", "address", "port", "network", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V", "getAddress", "()Ljava/lang/String;", "getAuth", "getNetwork", "getPort", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getUdp", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getUserLevel", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)Llibv2ray/V2rayConfig$InboundBean$InSettingsBean;", "equals", "other", "hashCode", "toString", "app_release"}, m507k = 1, m506mv = {1, 8, 0}, m504xi = 48)
        /* loaded from: classes3.dex */
        public static final class InSettingsBean {
            @Nullable
            private final String address;
            @Nullable
            private final String auth;
            @Nullable
            private final String network;
            @Nullable
            private final Integer port;
            @Nullable
            private final Boolean udp;
            @Nullable
            private final Integer userLevel;

            public InSettingsBean() {
                this(null, null, null, null, null, null, 63, null);
            }

            public InSettingsBean(@Nullable String str, @Nullable Boolean bool, @Nullable Integer num, @Nullable String str2, @Nullable Integer num2, @Nullable String str3) {
                this.auth = str;
                this.udp = bool;
                this.userLevel = num;
                this.address = str2;
                this.port = num2;
                this.network = str3;
            }

            public /* synthetic */ InSettingsBean(String str, Boolean bool, Integer num, String str2, Integer num2, String str3, int i, C10839f c10839f) {
                this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : num2, (i & 32) != 0 ? null : str3);
            }

            public static /* synthetic */ InSettingsBean copy$default(InSettingsBean inSettingsBean, String str, Boolean bool, Integer num, String str2, Integer num2, String str3, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = inSettingsBean.auth;
                }
                if ((i & 2) != 0) {
                    bool = inSettingsBean.udp;
                }
                Boolean bool2 = bool;
                if ((i & 4) != 0) {
                    num = inSettingsBean.userLevel;
                }
                Integer num3 = num;
                if ((i & 8) != 0) {
                    str2 = inSettingsBean.address;
                }
                String str4 = str2;
                if ((i & 16) != 0) {
                    num2 = inSettingsBean.port;
                }
                Integer num4 = num2;
                if ((i & 32) != 0) {
                    str3 = inSettingsBean.network;
                }
                return inSettingsBean.copy(str, bool2, num3, str4, num4, str3);
            }

            @Nullable
            public final String component1() {
                return this.auth;
            }

            @Nullable
            public final Boolean component2() {
                return this.udp;
            }

            @Nullable
            public final Integer component3() {
                return this.userLevel;
            }

            @Nullable
            public final String component4() {
                return this.address;
            }

            @Nullable
            public final Integer component5() {
                return this.port;
            }

            @Nullable
            public final String component6() {
                return this.network;
            }

            @NotNull
            public final InSettingsBean copy(@Nullable String str, @Nullable Boolean bool, @Nullable Integer num, @Nullable String str2, @Nullable Integer num2, @Nullable String str3) {
                return new InSettingsBean(str, bool, num, str2, num2, str3);
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof InSettingsBean) {
                    InSettingsBean inSettingsBean = (InSettingsBean) obj;
                    return C10843j.m435a(this.auth, inSettingsBean.auth) && C10843j.m435a(this.udp, inSettingsBean.udp) && C10843j.m435a(this.userLevel, inSettingsBean.userLevel) && C10843j.m435a(this.address, inSettingsBean.address) && C10843j.m435a(this.port, inSettingsBean.port) && C10843j.m435a(this.network, inSettingsBean.network);
                }
                return false;
            }

            @Nullable
            public final String getAddress() {
                return this.address;
            }

            @Nullable
            public final String getAuth() {
                return this.auth;
            }

            @Nullable
            public final String getNetwork() {
                return this.network;
            }

            @Nullable
            public final Integer getPort() {
                return this.port;
            }

            @Nullable
            public final Boolean getUdp() {
                return this.udp;
            }

            @Nullable
            public final Integer getUserLevel() {
                return this.userLevel;
            }

            public int hashCode() {
                String str = this.auth;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                Boolean bool = this.udp;
                int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
                Integer num = this.userLevel;
                int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
                String str2 = this.address;
                int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
                Integer num2 = this.port;
                int hashCode5 = (hashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
                String str3 = this.network;
                return hashCode5 + (str3 != null ? str3.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                StringBuilder sb = new StringBuilder("InSettingsBean(auth=");
                sb.append(this.auth);
                sb.append(", udp=");
                sb.append(this.udp);
                sb.append(", userLevel=");
                sb.append(this.userLevel);
                sb.append(", address=");
                sb.append(this.address);
                sb.append(", port=");
                sb.append(this.port);
                sb.append(", network=");
                return C0740h.m11848b(sb, this.network, ')');
            }
        }

        @Metadata(m509d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0016\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u0019\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007HÆ\u0003J\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0011J>\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0018\b\u0002\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\u00032\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0006HÖ\u0001R!\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0015\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, m508d2 = {"Llibv2ray/V2rayConfig$InboundBean$SniffingBean;", "", "enabled", "", "destOverride", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "metadataOnly", "(ZLjava/util/ArrayList;Ljava/lang/Boolean;)V", "getDestOverride", "()Ljava/util/ArrayList;", "getEnabled", "()Z", "setEnabled", "(Z)V", "getMetadataOnly", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "copy", "(ZLjava/util/ArrayList;Ljava/lang/Boolean;)Llibv2ray/V2rayConfig$InboundBean$SniffingBean;", "equals", "other", "hashCode", "", "toString", "app_release"}, m507k = 1, m506mv = {1, 8, 0}, m504xi = 48)
        /* loaded from: classes3.dex */
        public static final class SniffingBean {
            @NotNull
            private final ArrayList<String> destOverride;
            private boolean enabled;
            @Nullable
            private final Boolean metadataOnly;

            public SniffingBean(boolean z, @NotNull ArrayList<String> destOverride, @Nullable Boolean bool) {
                C10843j.m430f(destOverride, "destOverride");
                this.enabled = z;
                this.destOverride = destOverride;
                this.metadataOnly = bool;
            }

            public /* synthetic */ SniffingBean(boolean z, ArrayList arrayList, Boolean bool, int i, C10839f c10839f) {
                this(z, arrayList, (i & 4) != 0 ? null : bool);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ SniffingBean copy$default(SniffingBean sniffingBean, boolean z, ArrayList arrayList, Boolean bool, int i, Object obj) {
                if ((i & 1) != 0) {
                    z = sniffingBean.enabled;
                }
                if ((i & 2) != 0) {
                    arrayList = sniffingBean.destOverride;
                }
                if ((i & 4) != 0) {
                    bool = sniffingBean.metadataOnly;
                }
                return sniffingBean.copy(z, arrayList, bool);
            }

            public final boolean component1() {
                return this.enabled;
            }

            @NotNull
            public final ArrayList<String> component2() {
                return this.destOverride;
            }

            @Nullable
            public final Boolean component3() {
                return this.metadataOnly;
            }

            @NotNull
            public final SniffingBean copy(boolean z, @NotNull ArrayList<String> destOverride, @Nullable Boolean bool) {
                C10843j.m430f(destOverride, "destOverride");
                return new SniffingBean(z, destOverride, bool);
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof SniffingBean) {
                    SniffingBean sniffingBean = (SniffingBean) obj;
                    return this.enabled == sniffingBean.enabled && C10843j.m435a(this.destOverride, sniffingBean.destOverride) && C10843j.m435a(this.metadataOnly, sniffingBean.metadataOnly);
                }
                return false;
            }

            @NotNull
            public final ArrayList<String> getDestOverride() {
                return this.destOverride;
            }

            public final boolean getEnabled() {
                return this.enabled;
            }

            @Nullable
            public final Boolean getMetadataOnly() {
                return this.metadataOnly;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v1, types: [int] */
            /* JADX WARN: Type inference failed for: r0v7 */
            /* JADX WARN: Type inference failed for: r0v8 */
            public int hashCode() {
                boolean z = this.enabled;
                ?? r0 = z;
                if (z) {
                    r0 = 1;
                }
                int hashCode = (this.destOverride.hashCode() + (r0 * 31)) * 31;
                Boolean bool = this.metadataOnly;
                return hashCode + (bool == null ? 0 : bool.hashCode());
            }

            public final void setEnabled(boolean z) {
                this.enabled = z;
            }

            @NotNull
            public String toString() {
                return "SniffingBean(enabled=" + this.enabled + ", destOverride=" + this.destOverride + ", metadataOnly=" + this.metadataOnly + ')';
            }
        }

        public InboundBean(@NotNull String tag, int i, @NotNull String protocol, @Nullable String str, @Nullable Object obj, @Nullable SniffingBean sniffingBean, @Nullable Object obj2, @Nullable Object obj3) {
            C10843j.m430f(tag, "tag");
            C10843j.m430f(protocol, "protocol");
            this.tag = tag;
            this.port = i;
            this.protocol = protocol;
            this.listen = str;
            this.settings = obj;
            this.sniffing = sniffingBean;
            this.streamSettings = obj2;
            this.allocate = obj3;
        }

        public /* synthetic */ InboundBean(String str, int i, String str2, String str3, Object obj, SniffingBean sniffingBean, Object obj2, Object obj3, int i2, C10839f c10839f) {
            this(str, i, str2, (i2 & 8) != 0 ? null : str3, (i2 & 16) != 0 ? null : obj, sniffingBean, (i2 & 64) != 0 ? null : obj2, (i2 & 128) != 0 ? null : obj3);
        }

        @NotNull
        public final String component1() {
            return this.tag;
        }

        public final int component2() {
            return this.port;
        }

        @NotNull
        public final String component3() {
            return this.protocol;
        }

        @Nullable
        public final String component4() {
            return this.listen;
        }

        @Nullable
        public final Object component5() {
            return this.settings;
        }

        @Nullable
        public final SniffingBean component6() {
            return this.sniffing;
        }

        @Nullable
        public final Object component7() {
            return this.streamSettings;
        }

        @Nullable
        public final Object component8() {
            return this.allocate;
        }

        @NotNull
        public final InboundBean copy(@NotNull String tag, int i, @NotNull String protocol, @Nullable String str, @Nullable Object obj, @Nullable SniffingBean sniffingBean, @Nullable Object obj2, @Nullable Object obj3) {
            C10843j.m430f(tag, "tag");
            C10843j.m430f(protocol, "protocol");
            return new InboundBean(tag, i, protocol, str, obj, sniffingBean, obj2, obj3);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof InboundBean) {
                InboundBean inboundBean = (InboundBean) obj;
                return C10843j.m435a(this.tag, inboundBean.tag) && this.port == inboundBean.port && C10843j.m435a(this.protocol, inboundBean.protocol) && C10843j.m435a(this.listen, inboundBean.listen) && C10843j.m435a(this.settings, inboundBean.settings) && C10843j.m435a(this.sniffing, inboundBean.sniffing) && C10843j.m435a(this.streamSettings, inboundBean.streamSettings) && C10843j.m435a(this.allocate, inboundBean.allocate);
            }
            return false;
        }

        @Nullable
        public final Object getAllocate() {
            return this.allocate;
        }

        @Nullable
        public final String getListen() {
            return this.listen;
        }

        public final int getPort() {
            return this.port;
        }

        @NotNull
        public final String getProtocol() {
            return this.protocol;
        }

        @Nullable
        public final Object getSettings() {
            return this.settings;
        }

        @Nullable
        public final SniffingBean getSniffing() {
            return this.sniffing;
        }

        @Nullable
        public final Object getStreamSettings() {
            return this.streamSettings;
        }

        @NotNull
        public final String getTag() {
            return this.tag;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2;
            int hashCode3;
            int hashCode4;
            int m12537a = C0406q1.m12537a(this.protocol, ((this.tag.hashCode() * 31) + this.port) * 31, 31);
            String str = this.listen;
            int i = 0;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int i2 = (m12537a + hashCode) * 31;
            Object obj = this.settings;
            if (obj == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = obj.hashCode();
            }
            int i3 = (i2 + hashCode2) * 31;
            SniffingBean sniffingBean = this.sniffing;
            if (sniffingBean == null) {
                hashCode3 = 0;
            } else {
                hashCode3 = sniffingBean.hashCode();
            }
            int i4 = (i3 + hashCode3) * 31;
            Object obj2 = this.streamSettings;
            if (obj2 == null) {
                hashCode4 = 0;
            } else {
                hashCode4 = obj2.hashCode();
            }
            int i5 = (i4 + hashCode4) * 31;
            Object obj3 = this.allocate;
            if (obj3 != null) {
                i = obj3.hashCode();
            }
            return i5 + i;
        }

        public final void setListen(@Nullable String str) {
            this.listen = str;
        }

        public final void setPort(int i) {
            this.port = i;
        }

        public final void setProtocol(@NotNull String str) {
            C10843j.m430f(str, "<set-?>");
            this.protocol = str;
        }

        public final void setTag(@NotNull String str) {
            C10843j.m430f(str, "<set-?>");
            this.tag = str;
        }

        @NotNull
        public String toString() {
            return "InboundBean(tag=" + this.tag + ", port=" + this.port + ", protocol=" + this.protocol + ", listen=" + this.listen + ", settings=" + this.settings + ", sniffing=" + this.sniffing + ", streamSettings=" + this.streamSettings + ", allocate=" + this.allocate + ')';
        }
    }

    @Metadata(m509d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\fJ:\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\u00072\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\n\"\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, m508d2 = {"Llibv2ray/V2rayConfig$LogBean;", "", "access", "", "error", "loglevel", "dnsLog", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "getAccess", "()Ljava/lang/String;", "getDnsLog", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getError", "getLoglevel", "setLoglevel", "(Ljava/lang/String;)V", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Llibv2ray/V2rayConfig$LogBean;", "equals", "other", "hashCode", "", "toString", "app_release"}, m507k = 1, m506mv = {1, 8, 0}, m504xi = 48)
    /* loaded from: classes3.dex */
    public static final class LogBean {
        @NotNull
        private final String access;
        @Nullable
        private final Boolean dnsLog;
        @NotNull
        private final String error;
        @Nullable
        private String loglevel;

        public LogBean(@NotNull String access, @NotNull String error, @Nullable String str, @Nullable Boolean bool) {
            C10843j.m430f(access, "access");
            C10843j.m430f(error, "error");
            this.access = access;
            this.error = error;
            this.loglevel = str;
            this.dnsLog = bool;
        }

        public /* synthetic */ LogBean(String str, String str2, String str3, Boolean bool, int i, C10839f c10839f) {
            this(str, str2, str3, (i & 8) != 0 ? null : bool);
        }

        public static /* synthetic */ LogBean copy$default(LogBean logBean, String str, String str2, String str3, Boolean bool, int i, Object obj) {
            if ((i & 1) != 0) {
                str = logBean.access;
            }
            if ((i & 2) != 0) {
                str2 = logBean.error;
            }
            if ((i & 4) != 0) {
                str3 = logBean.loglevel;
            }
            if ((i & 8) != 0) {
                bool = logBean.dnsLog;
            }
            return logBean.copy(str, str2, str3, bool);
        }

        @NotNull
        public final String component1() {
            return this.access;
        }

        @NotNull
        public final String component2() {
            return this.error;
        }

        @Nullable
        public final String component3() {
            return this.loglevel;
        }

        @Nullable
        public final Boolean component4() {
            return this.dnsLog;
        }

        @NotNull
        public final LogBean copy(@NotNull String access, @NotNull String error, @Nullable String str, @Nullable Boolean bool) {
            C10843j.m430f(access, "access");
            C10843j.m430f(error, "error");
            return new LogBean(access, error, str, bool);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof LogBean) {
                LogBean logBean = (LogBean) obj;
                return C10843j.m435a(this.access, logBean.access) && C10843j.m435a(this.error, logBean.error) && C10843j.m435a(this.loglevel, logBean.loglevel) && C10843j.m435a(this.dnsLog, logBean.dnsLog);
            }
            return false;
        }

        @NotNull
        public final String getAccess() {
            return this.access;
        }

        @Nullable
        public final Boolean getDnsLog() {
            return this.dnsLog;
        }

        @NotNull
        public final String getError() {
            return this.error;
        }

        @Nullable
        public final String getLoglevel() {
            return this.loglevel;
        }

        public int hashCode() {
            int hashCode;
            int m12537a = C0406q1.m12537a(this.error, this.access.hashCode() * 31, 31);
            String str = this.loglevel;
            int i = 0;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int i2 = (m12537a + hashCode) * 31;
            Boolean bool = this.dnsLog;
            if (bool != null) {
                i = bool.hashCode();
            }
            return i2 + i;
        }

        public final void setLoglevel(@Nullable String str) {
            this.loglevel = str;
        }

        @NotNull
        public String toString() {
            return "LogBean(access=" + this.access + ", error=" + this.error + ", loglevel=" + this.loglevel + ", dnsLog=" + this.dnsLog + ')';
        }
    }

    @Metadata(m509d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001:\u0003567BS\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0001\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\rJ\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\fHÆ\u0003JY\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001J\u0013\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\b\u0010+\u001a\u0004\u0018\u00010\u0003J\b\u0010,\u001a\u0004\u0018\u00010\u0003J\b\u0010-\u001a\u0004\u0018\u00010\u0003J\r\u0010.\u001a\u0004\u0018\u00010/¢\u0006\u0002\u00100J\u000e\u00101\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u000102J\t\u00103\u001a\u00020/HÖ\u0001J\t\u00104\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0011¨\u00068"}, m508d2 = {"Llibv2ray/V2rayConfig$OutboundBean;", "", "tag", "", "protocol", "settings", "Llibv2ray/V2rayConfig$OutboundBean$OutSettingsBean;", "streamSettings", "Llibv2ray/V2rayConfig$OutboundBean$StreamSettingsBean;", "proxySettings", "sendThrough", "mux", "Llibv2ray/V2rayConfig$OutboundBean$MuxBean;", "(Ljava/lang/String;Ljava/lang/String;Llibv2ray/V2rayConfig$OutboundBean$OutSettingsBean;Llibv2ray/V2rayConfig$OutboundBean$StreamSettingsBean;Ljava/lang/Object;Ljava/lang/String;Llibv2ray/V2rayConfig$OutboundBean$MuxBean;)V", "getMux", "()Llibv2ray/V2rayConfig$OutboundBean$MuxBean;", "getProtocol", "()Ljava/lang/String;", "setProtocol", "(Ljava/lang/String;)V", "getProxySettings", "()Ljava/lang/Object;", "getSendThrough", "getSettings", "()Llibv2ray/V2rayConfig$OutboundBean$OutSettingsBean;", "setSettings", "(Llibv2ray/V2rayConfig$OutboundBean$OutSettingsBean;)V", "getStreamSettings", "()Llibv2ray/V2rayConfig$OutboundBean$StreamSettingsBean;", "setStreamSettings", "(Llibv2ray/V2rayConfig$OutboundBean$StreamSettingsBean;)V", "getTag", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "getPassword", "getSecurityEncryption", "getServerAddress", "getServerPort", "", "()Ljava/lang/Integer;", "getTransportSettingDetails", "", "hashCode", "toString", "MuxBean", "OutSettingsBean", "StreamSettingsBean", "app_release"}, m507k = 1, m506mv = {1, 8, 0}, m504xi = 48)
    /* loaded from: classes3.dex */
    public static final class OutboundBean {
        @Nullable
        private final MuxBean mux;
        @NotNull
        private String protocol;
        @Nullable
        private final Object proxySettings;
        @Nullable
        private final String sendThrough;
        @Nullable
        private OutSettingsBean settings;
        @Nullable
        private StreamSettingsBean streamSettings;
        @NotNull
        private final String tag;

        @Metadata(m509d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00032\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0017"}, m508d2 = {"Llibv2ray/V2rayConfig$OutboundBean$MuxBean;", "", "enabled", "", "concurrency", "", "(ZI)V", "getConcurrency", "()I", "setConcurrency", "(I)V", "getEnabled", "()Z", "setEnabled", "(Z)V", "component1", "component2", "copy", "equals", "other", "hashCode", "toString", "", "app_release"}, m507k = 1, m506mv = {1, 8, 0}, m504xi = 48)
        /* loaded from: classes3.dex */
        public static final class MuxBean {
            private int concurrency;
            private boolean enabled;

            public MuxBean(boolean z, int i) {
                this.enabled = z;
                this.concurrency = i;
            }

            public /* synthetic */ MuxBean(boolean z, int i, int i2, C10839f c10839f) {
                this(z, (i2 & 2) != 0 ? 8 : i);
            }

            public static /* synthetic */ MuxBean copy$default(MuxBean muxBean, boolean z, int i, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    z = muxBean.enabled;
                }
                if ((i2 & 2) != 0) {
                    i = muxBean.concurrency;
                }
                return muxBean.copy(z, i);
            }

            public final boolean component1() {
                return this.enabled;
            }

            public final int component2() {
                return this.concurrency;
            }

            @NotNull
            public final MuxBean copy(boolean z, int i) {
                return new MuxBean(z, i);
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof MuxBean) {
                    MuxBean muxBean = (MuxBean) obj;
                    return this.enabled == muxBean.enabled && this.concurrency == muxBean.concurrency;
                }
                return false;
            }

            public final int getConcurrency() {
                return this.concurrency;
            }

            public final boolean getEnabled() {
                return this.enabled;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v1, types: [int] */
            /* JADX WARN: Type inference failed for: r0v4 */
            /* JADX WARN: Type inference failed for: r0v5 */
            public int hashCode() {
                boolean z = this.enabled;
                ?? r0 = z;
                if (z) {
                    r0 = 1;
                }
                return (r0 * 31) + this.concurrency;
            }

            public final void setConcurrency(int i) {
                this.concurrency = i;
            }

            public final void setEnabled(boolean z) {
                this.enabled = z;
            }

            @NotNull
            public String toString() {
                return "MuxBean(enabled=" + this.enabled + ", concurrency=" + this.concurrency + ')';
            }
        }

        @Metadata(m509d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b(\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001:\u0003:;<B\u0089\u0001\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u0012J\u0011\u0010)\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\nHÆ\u0003J\u0011\u0010+\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\nHÆ\u0003J\u0010\u0010/\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010\u001bJ\u000b\u00100\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\nHÆ\u0003J\u0010\u00102\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010\u001bJ\u0092\u0001\u00103\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0002\u00104J\u0013\u00105\u001a\u0002062\b\u00107\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00108\u001a\u00020\rHÖ\u0001J\t\u00109\u001a\u00020\nHÖ\u0001R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0014\"\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0014R\u0015\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0014R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\"\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u0015\u0010\u0010\u001a\u0004\u0018\u00010\r¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b&\u0010\u001bR\"\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010#\"\u0004\b(\u0010%¨\u0006="}, m508d2 = {"Llibv2ray/V2rayConfig$OutboundBean$OutSettingsBean;", "", "vnext", "", "Llibv2ray/V2rayConfig$OutboundBean$OutSettingsBean$VnextBean;", "servers", "Llibv2ray/V2rayConfig$OutboundBean$OutSettingsBean$ServersBean;", "response", "Llibv2ray/V2rayConfig$OutboundBean$OutSettingsBean$Response;", "network", "", "address", "port", "", "domainStrategy", "redirect", "userLevel", "inboundTag", "(Ljava/util/List;Ljava/util/List;Llibv2ray/V2rayConfig$OutboundBean$OutSettingsBean$Response;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V", "getAddress", "()Ljava/lang/String;", "getDomainStrategy", "setDomainStrategy", "(Ljava/lang/String;)V", "getInboundTag", "getNetwork", "getPort", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getRedirect", "getResponse", "()Llibv2ray/V2rayConfig$OutboundBean$OutSettingsBean$Response;", "setResponse", "(Llibv2ray/V2rayConfig$OutboundBean$OutSettingsBean$Response;)V", "getServers", "()Ljava/util/List;", "setServers", "(Ljava/util/List;)V", "getUserLevel", "getVnext", "setVnext", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/util/List;Ljava/util/List;Llibv2ray/V2rayConfig$OutboundBean$OutSettingsBean$Response;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)Llibv2ray/V2rayConfig$OutboundBean$OutSettingsBean;", "equals", "", "other", "hashCode", "toString", "Response", "ServersBean", "VnextBean", "app_release"}, m507k = 1, m506mv = {1, 8, 0}, m504xi = 48)
        /* loaded from: classes3.dex */
        public static final class OutSettingsBean {
            @Nullable
            private final String address;
            @Nullable
            private String domainStrategy;
            @Nullable
            private final String inboundTag;
            @Nullable
            private final String network;
            @Nullable
            private final Integer port;
            @Nullable
            private final String redirect;
            @Nullable
            private Response response;
            @Nullable
            private List<ServersBean> servers;
            @Nullable
            private final Integer userLevel;
            @Nullable
            private List<VnextBean> vnext;

            @Metadata(m509d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\u0010"}, m508d2 = {"Llibv2ray/V2rayConfig$OutboundBean$OutSettingsBean$Response;", "", "type", "", "(Ljava/lang/String;)V", "getType", "()Ljava/lang/String;", "setType", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, m507k = 1, m506mv = {1, 8, 0}, m504xi = 48)
            /* loaded from: classes3.dex */
            public static final class Response {
                @NotNull
                private String type;

                public Response(@NotNull String type) {
                    C10843j.m430f(type, "type");
                    this.type = type;
                }

                public static /* synthetic */ Response copy$default(Response response, String str, int i, Object obj) {
                    if ((i & 1) != 0) {
                        str = response.type;
                    }
                    return response.copy(str);
                }

                @NotNull
                public final String component1() {
                    return this.type;
                }

                @NotNull
                public final Response copy(@NotNull String type) {
                    C10843j.m430f(type, "type");
                    return new Response(type);
                }

                public boolean equals(@Nullable Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof Response) && C10843j.m435a(this.type, ((Response) obj).type);
                }

                @NotNull
                public final String getType() {
                    return this.type;
                }

                public int hashCode() {
                    return this.type.hashCode();
                }

                public final void setType(@NotNull String str) {
                    C10843j.m430f(str, "<set-?>");
                    this.type = str;
                }

                @NotNull
                public String toString() {
                    return C0740h.m11848b(new StringBuilder("Response(type="), this.type, ')');
                }
            }

            @Metadata(m509d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b.\b\u0086\b\u0018\u00002\u00020\u0001:\u0001=Bw\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f¢\u0006\u0002\u0010\u0011J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\u0011\u0010.\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fHÆ\u0003J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\t\u00100\u001a\u00020\u0006HÆ\u0003J\t\u00101\u001a\u00020\u0003HÆ\u0003J\t\u00102\u001a\u00020\tHÆ\u0003J\t\u00103\u001a\u00020\tHÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u00106\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0019J\u0080\u0001\u00107\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fHÆ\u0001¢\u0006\u0002\u00108J\u0013\u00109\u001a\u00020\u00062\b\u0010:\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010;\u001a\u00020\tHÖ\u0001J\t\u0010<\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0015\u0010\r\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\n\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0013\"\u0004\b \u0010\u0015R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0013\"\u0004\b&\u0010\u0015R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u001c\"\u0004\b(\u0010\u001eR\"\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,¨\u0006>"}, m508d2 = {"Llibv2ray/V2rayConfig$OutboundBean$OutSettingsBean$ServersBean;", "", "address", "", FirebaseAnalytics.Param.METHOD, "ota", "", "password", "port", "", "level", Scopes.EMAIL, "flow", "ivCheck", "users", "", "Llibv2ray/V2rayConfig$OutboundBean$OutSettingsBean$ServersBean$SocksUsersBean;", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;)V", "getAddress", "()Ljava/lang/String;", "setAddress", "(Ljava/lang/String;)V", "getEmail", "getFlow", "getIvCheck", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getLevel", "()I", "setLevel", "(I)V", "getMethod", "setMethod", "getOta", "()Z", "setOta", "(Z)V", "getPassword", "setPassword", "getPort", "setPort", "getUsers", "()Ljava/util/List;", "setUsers", "(Ljava/util/List;)V", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;)Llibv2ray/V2rayConfig$OutboundBean$OutSettingsBean$ServersBean;", "equals", "other", "hashCode", "toString", "SocksUsersBean", "app_release"}, m507k = 1, m506mv = {1, 8, 0}, m504xi = 48)
            /* loaded from: classes3.dex */
            public static final class ServersBean {
                @NotNull
                private String address;
                @Nullable
                private final String email;
                @Nullable
                private final String flow;
                @Nullable
                private final Boolean ivCheck;
                private int level;
                @NotNull
                private String method;
                private boolean ota;
                @NotNull
                private String password;
                private int port;
                @Nullable
                private List<SocksUsersBean> users;

                @Metadata(m509d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J'\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\u000f¨\u0006\u001b"}, m508d2 = {"Llibv2ray/V2rayConfig$OutboundBean$OutSettingsBean$ServersBean$SocksUsersBean;", "", "user", "", "pass", "level", "", "(Ljava/lang/String;Ljava/lang/String;I)V", "getLevel", "()I", "setLevel", "(I)V", "getPass", "()Ljava/lang/String;", "setPass", "(Ljava/lang/String;)V", "getUser", "setUser", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "app_release"}, m507k = 1, m506mv = {1, 8, 0}, m504xi = 48)
                /* loaded from: classes3.dex */
                public static final class SocksUsersBean {
                    private int level;
                    @NotNull
                    private String pass;
                    @NotNull
                    private String user;

                    public SocksUsersBean() {
                        this(null, null, 0, 7, null);
                    }

                    public SocksUsersBean(@NotNull String user, @NotNull String pass, int i) {
                        C10843j.m430f(user, "user");
                        C10843j.m430f(pass, "pass");
                        this.user = user;
                        this.pass = pass;
                        this.level = i;
                    }

                    public /* synthetic */ SocksUsersBean(String str, String str2, int i, int i2, C10839f c10839f) {
                        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? 8 : i);
                    }

                    public static /* synthetic */ SocksUsersBean copy$default(SocksUsersBean socksUsersBean, String str, String str2, int i, int i2, Object obj) {
                        if ((i2 & 1) != 0) {
                            str = socksUsersBean.user;
                        }
                        if ((i2 & 2) != 0) {
                            str2 = socksUsersBean.pass;
                        }
                        if ((i2 & 4) != 0) {
                            i = socksUsersBean.level;
                        }
                        return socksUsersBean.copy(str, str2, i);
                    }

                    @NotNull
                    public final String component1() {
                        return this.user;
                    }

                    @NotNull
                    public final String component2() {
                        return this.pass;
                    }

                    public final int component3() {
                        return this.level;
                    }

                    @NotNull
                    public final SocksUsersBean copy(@NotNull String user, @NotNull String pass, int i) {
                        C10843j.m430f(user, "user");
                        C10843j.m430f(pass, "pass");
                        return new SocksUsersBean(user, pass, i);
                    }

                    public boolean equals(@Nullable Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (obj instanceof SocksUsersBean) {
                            SocksUsersBean socksUsersBean = (SocksUsersBean) obj;
                            return C10843j.m435a(this.user, socksUsersBean.user) && C10843j.m435a(this.pass, socksUsersBean.pass) && this.level == socksUsersBean.level;
                        }
                        return false;
                    }

                    public final int getLevel() {
                        return this.level;
                    }

                    @NotNull
                    public final String getPass() {
                        return this.pass;
                    }

                    @NotNull
                    public final String getUser() {
                        return this.user;
                    }

                    public int hashCode() {
                        return C0406q1.m12537a(this.pass, this.user.hashCode() * 31, 31) + this.level;
                    }

                    public final void setLevel(int i) {
                        this.level = i;
                    }

                    public final void setPass(@NotNull String str) {
                        C10843j.m430f(str, "<set-?>");
                        this.pass = str;
                    }

                    public final void setUser(@NotNull String str) {
                        C10843j.m430f(str, "<set-?>");
                        this.user = str;
                    }

                    @NotNull
                    public String toString() {
                        return "SocksUsersBean(user=" + this.user + ", pass=" + this.pass + ", level=" + this.level + ')';
                    }
                }

                public ServersBean() {
                    this(null, null, false, null, 0, 0, null, null, null, null, 1023, null);
                }

                public ServersBean(@NotNull String address, @NotNull String method, boolean z, @NotNull String password, int i, int i2, @Nullable String str, @Nullable String str2, @Nullable Boolean bool, @Nullable List<SocksUsersBean> list) {
                    C10843j.m430f(address, "address");
                    C10843j.m430f(method, "method");
                    C10843j.m430f(password, "password");
                    this.address = address;
                    this.method = method;
                    this.ota = z;
                    this.password = password;
                    this.port = i;
                    this.level = i2;
                    this.email = str;
                    this.flow = str2;
                    this.ivCheck = bool;
                    this.users = list;
                }

                public /* synthetic */ ServersBean(String str, String str2, boolean z, String str3, int i, int i2, String str4, String str5, Boolean bool, List list, int i3, C10839f c10839f) {
                    this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? "chacha20-poly1305" : str2, (i3 & 4) != 0 ? false : z, (i3 & 8) == 0 ? str3 : "", (i3 & 16) != 0 ? V2rayConfig.DEFAULT_PORT : i, (i3 & 32) != 0 ? 8 : i2, (i3 & 64) != 0 ? null : str4, (i3 & 128) != 0 ? null : str5, (i3 & 256) != 0 ? null : bool, (i3 & AdRequest.MAX_CONTENT_URL_LENGTH) == 0 ? list : null);
                }

                @NotNull
                public final String component1() {
                    return this.address;
                }

                @Nullable
                public final List<SocksUsersBean> component10() {
                    return this.users;
                }

                @NotNull
                public final String component2() {
                    return this.method;
                }

                public final boolean component3() {
                    return this.ota;
                }

                @NotNull
                public final String component4() {
                    return this.password;
                }

                public final int component5() {
                    return this.port;
                }

                public final int component6() {
                    return this.level;
                }

                @Nullable
                public final String component7() {
                    return this.email;
                }

                @Nullable
                public final String component8() {
                    return this.flow;
                }

                @Nullable
                public final Boolean component9() {
                    return this.ivCheck;
                }

                @NotNull
                public final ServersBean copy(@NotNull String address, @NotNull String method, boolean z, @NotNull String password, int i, int i2, @Nullable String str, @Nullable String str2, @Nullable Boolean bool, @Nullable List<SocksUsersBean> list) {
                    C10843j.m430f(address, "address");
                    C10843j.m430f(method, "method");
                    C10843j.m430f(password, "password");
                    return new ServersBean(address, method, z, password, i, i2, str, str2, bool, list);
                }

                public boolean equals(@Nullable Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj instanceof ServersBean) {
                        ServersBean serversBean = (ServersBean) obj;
                        return C10843j.m435a(this.address, serversBean.address) && C10843j.m435a(this.method, serversBean.method) && this.ota == serversBean.ota && C10843j.m435a(this.password, serversBean.password) && this.port == serversBean.port && this.level == serversBean.level && C10843j.m435a(this.email, serversBean.email) && C10843j.m435a(this.flow, serversBean.flow) && C10843j.m435a(this.ivCheck, serversBean.ivCheck) && C10843j.m435a(this.users, serversBean.users);
                    }
                    return false;
                }

                @NotNull
                public final String getAddress() {
                    return this.address;
                }

                @Nullable
                public final String getEmail() {
                    return this.email;
                }

                @Nullable
                public final String getFlow() {
                    return this.flow;
                }

                @Nullable
                public final Boolean getIvCheck() {
                    return this.ivCheck;
                }

                public final int getLevel() {
                    return this.level;
                }

                @NotNull
                public final String getMethod() {
                    return this.method;
                }

                public final boolean getOta() {
                    return this.ota;
                }

                @NotNull
                public final String getPassword() {
                    return this.password;
                }

                public final int getPort() {
                    return this.port;
                }

                @Nullable
                public final List<SocksUsersBean> getUsers() {
                    return this.users;
                }

                /* JADX WARN: Multi-variable type inference failed */
                public int hashCode() {
                    int hashCode;
                    int hashCode2;
                    int hashCode3;
                    int m12537a = C0406q1.m12537a(this.method, this.address.hashCode() * 31, 31);
                    boolean z = this.ota;
                    int i = z;
                    if (z != 0) {
                        i = 1;
                    }
                    int m12537a2 = (((C0406q1.m12537a(this.password, (m12537a + i) * 31, 31) + this.port) * 31) + this.level) * 31;
                    String str = this.email;
                    int i2 = 0;
                    if (str == null) {
                        hashCode = 0;
                    } else {
                        hashCode = str.hashCode();
                    }
                    int i3 = (m12537a2 + hashCode) * 31;
                    String str2 = this.flow;
                    if (str2 == null) {
                        hashCode2 = 0;
                    } else {
                        hashCode2 = str2.hashCode();
                    }
                    int i4 = (i3 + hashCode2) * 31;
                    Boolean bool = this.ivCheck;
                    if (bool == null) {
                        hashCode3 = 0;
                    } else {
                        hashCode3 = bool.hashCode();
                    }
                    int i5 = (i4 + hashCode3) * 31;
                    List<SocksUsersBean> list = this.users;
                    if (list != null) {
                        i2 = list.hashCode();
                    }
                    return i5 + i2;
                }

                public final void setAddress(@NotNull String str) {
                    C10843j.m430f(str, "<set-?>");
                    this.address = str;
                }

                public final void setLevel(int i) {
                    this.level = i;
                }

                public final void setMethod(@NotNull String str) {
                    C10843j.m430f(str, "<set-?>");
                    this.method = str;
                }

                public final void setOta(boolean z) {
                    this.ota = z;
                }

                public final void setPassword(@NotNull String str) {
                    C10843j.m430f(str, "<set-?>");
                    this.password = str;
                }

                public final void setPort(int i) {
                    this.port = i;
                }

                public final void setUsers(@Nullable List<SocksUsersBean> list) {
                    this.users = list;
                }

                @NotNull
                public String toString() {
                    return "ServersBean(address=" + this.address + ", method=" + this.method + ", ota=" + this.ota + ", password=" + this.password + ", port=" + this.port + ", level=" + this.level + ", email=" + this.email + ", flow=" + this.flow + ", ivCheck=" + this.ivCheck + ", users=" + this.users + ')';
                }
            }

            @Metadata(m509d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u001fB'\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\u0010\tJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J-\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006 "}, m508d2 = {"Llibv2ray/V2rayConfig$OutboundBean$OutSettingsBean$VnextBean;", "", "address", "", "port", "", "users", "", "Llibv2ray/V2rayConfig$OutboundBean$OutSettingsBean$VnextBean$UsersBean;", "(Ljava/lang/String;ILjava/util/List;)V", "getAddress", "()Ljava/lang/String;", "setAddress", "(Ljava/lang/String;)V", "getPort", "()I", "setPort", "(I)V", "getUsers", "()Ljava/util/List;", "setUsers", "(Ljava/util/List;)V", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "UsersBean", "app_release"}, m507k = 1, m506mv = {1, 8, 0}, m504xi = 48)
            /* loaded from: classes3.dex */
            public static final class VnextBean {
                @NotNull
                private String address;
                private int port;
                @NotNull
                private List<UsersBean> users;

                @Metadata(m509d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b!\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003¢\u0006\u0002\u0010\nJ\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\fJ\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0005HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003JL\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001¢\u0006\u0002\u0010%J\u0013\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010)\u001a\u00020\u0005HÖ\u0001J\t\u0010*\u001a\u00020\u0003HÖ\u0001R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\t\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0011\"\u0004\b\u0015\u0010\u0013R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0011\"\u0004\b\u0017\u0010\u0013R\u001a\u0010\u0007\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0011\"\u0004\b\u001d\u0010\u0013¨\u0006+"}, m508d2 = {"Llibv2ray/V2rayConfig$OutboundBean$OutSettingsBean$VnextBean$UsersBean;", "", FacebookAdapter.KEY_ID, "", "alterId", "", "security", "level", "encryption", "flow", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getAlterId", "()Ljava/lang/Integer;", "setAlterId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getEncryption", "()Ljava/lang/String;", "setEncryption", "(Ljava/lang/String;)V", "getFlow", "setFlow", "getId", "setId", "getLevel", "()I", "setLevel", "(I)V", "getSecurity", "setSecurity", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)Llibv2ray/V2rayConfig$OutboundBean$OutSettingsBean$VnextBean$UsersBean;", "equals", "", "other", "hashCode", "toString", "app_release"}, m507k = 1, m506mv = {1, 8, 0}, m504xi = 48)
                /* loaded from: classes3.dex */
                public static final class UsersBean {
                    @Nullable
                    private Integer alterId;
                    @NotNull
                    private String encryption;
                    @NotNull
                    private String flow;
                    @NotNull

                    /* renamed from: id */
                    private String f21820id;
                    private int level;
                    @NotNull
                    private String security;

                    public UsersBean() {
                        this(null, null, null, 0, null, null, 63, null);
                    }

                    public UsersBean(@NotNull String id, @Nullable Integer num, @NotNull String security, int i, @NotNull String encryption, @NotNull String flow) {
                        C10843j.m430f(id, "id");
                        C10843j.m430f(security, "security");
                        C10843j.m430f(encryption, "encryption");
                        C10843j.m430f(flow, "flow");
                        this.f21820id = id;
                        this.alterId = num;
                        this.security = security;
                        this.level = i;
                        this.encryption = encryption;
                        this.flow = flow;
                    }

                    public /* synthetic */ UsersBean(String str, Integer num, String str2, int i, String str3, String str4, int i2, C10839f c10839f) {
                        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? null : num, (i2 & 4) != 0 ? V2rayConfig.DEFAULT_SECURITY : str2, (i2 & 8) != 0 ? 8 : i, (i2 & 16) != 0 ? "" : str3, (i2 & 32) != 0 ? "" : str4);
                    }

                    public static /* synthetic */ UsersBean copy$default(UsersBean usersBean, String str, Integer num, String str2, int i, String str3, String str4, int i2, Object obj) {
                        if ((i2 & 1) != 0) {
                            str = usersBean.f21820id;
                        }
                        if ((i2 & 2) != 0) {
                            num = usersBean.alterId;
                        }
                        Integer num2 = num;
                        if ((i2 & 4) != 0) {
                            str2 = usersBean.security;
                        }
                        String str5 = str2;
                        if ((i2 & 8) != 0) {
                            i = usersBean.level;
                        }
                        int i3 = i;
                        if ((i2 & 16) != 0) {
                            str3 = usersBean.encryption;
                        }
                        String str6 = str3;
                        if ((i2 & 32) != 0) {
                            str4 = usersBean.flow;
                        }
                        return usersBean.copy(str, num2, str5, i3, str6, str4);
                    }

                    @NotNull
                    public final String component1() {
                        return this.f21820id;
                    }

                    @Nullable
                    public final Integer component2() {
                        return this.alterId;
                    }

                    @NotNull
                    public final String component3() {
                        return this.security;
                    }

                    public final int component4() {
                        return this.level;
                    }

                    @NotNull
                    public final String component5() {
                        return this.encryption;
                    }

                    @NotNull
                    public final String component6() {
                        return this.flow;
                    }

                    @NotNull
                    public final UsersBean copy(@NotNull String id, @Nullable Integer num, @NotNull String security, int i, @NotNull String encryption, @NotNull String flow) {
                        C10843j.m430f(id, "id");
                        C10843j.m430f(security, "security");
                        C10843j.m430f(encryption, "encryption");
                        C10843j.m430f(flow, "flow");
                        return new UsersBean(id, num, security, i, encryption, flow);
                    }

                    public boolean equals(@Nullable Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (obj instanceof UsersBean) {
                            UsersBean usersBean = (UsersBean) obj;
                            return C10843j.m435a(this.f21820id, usersBean.f21820id) && C10843j.m435a(this.alterId, usersBean.alterId) && C10843j.m435a(this.security, usersBean.security) && this.level == usersBean.level && C10843j.m435a(this.encryption, usersBean.encryption) && C10843j.m435a(this.flow, usersBean.flow);
                        }
                        return false;
                    }

                    @Nullable
                    public final Integer getAlterId() {
                        return this.alterId;
                    }

                    @NotNull
                    public final String getEncryption() {
                        return this.encryption;
                    }

                    @NotNull
                    public final String getFlow() {
                        return this.flow;
                    }

                    @NotNull
                    public final String getId() {
                        return this.f21820id;
                    }

                    public final int getLevel() {
                        return this.level;
                    }

                    @NotNull
                    public final String getSecurity() {
                        return this.security;
                    }

                    public int hashCode() {
                        int hashCode;
                        int hashCode2 = this.f21820id.hashCode() * 31;
                        Integer num = this.alterId;
                        if (num == null) {
                            hashCode = 0;
                        } else {
                            hashCode = num.hashCode();
                        }
                        String str = this.security;
                        return this.flow.hashCode() + C0406q1.m12537a(this.encryption, (C0406q1.m12537a(str, (hashCode2 + hashCode) * 31, 31) + this.level) * 31, 31);
                    }

                    public final void setAlterId(@Nullable Integer num) {
                        this.alterId = num;
                    }

                    public final void setEncryption(@NotNull String str) {
                        C10843j.m430f(str, "<set-?>");
                        this.encryption = str;
                    }

                    public final void setFlow(@NotNull String str) {
                        C10843j.m430f(str, "<set-?>");
                        this.flow = str;
                    }

                    public final void setId(@NotNull String str) {
                        C10843j.m430f(str, "<set-?>");
                        this.f21820id = str;
                    }

                    public final void setLevel(int i) {
                        this.level = i;
                    }

                    public final void setSecurity(@NotNull String str) {
                        C10843j.m430f(str, "<set-?>");
                        this.security = str;
                    }

                    @NotNull
                    public String toString() {
                        StringBuilder sb = new StringBuilder("UsersBean(id=");
                        sb.append(this.f21820id);
                        sb.append(", alterId=");
                        sb.append(this.alterId);
                        sb.append(", security=");
                        sb.append(this.security);
                        sb.append(", level=");
                        sb.append(this.level);
                        sb.append(", encryption=");
                        sb.append(this.encryption);
                        sb.append(", flow=");
                        return C0740h.m11848b(sb, this.flow, ')');
                    }
                }

                public VnextBean(@NotNull String address, int i, @NotNull List<UsersBean> users) {
                    C10843j.m430f(address, "address");
                    C10843j.m430f(users, "users");
                    this.address = address;
                    this.port = i;
                    this.users = users;
                }

                public /* synthetic */ VnextBean(String str, int i, List list, int i2, C10839f c10839f) {
                    this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? V2rayConfig.DEFAULT_PORT : i, list);
                }

                /* JADX WARN: Multi-variable type inference failed */
                public static /* synthetic */ VnextBean copy$default(VnextBean vnextBean, String str, int i, List list, int i2, Object obj) {
                    if ((i2 & 1) != 0) {
                        str = vnextBean.address;
                    }
                    if ((i2 & 2) != 0) {
                        i = vnextBean.port;
                    }
                    if ((i2 & 4) != 0) {
                        list = vnextBean.users;
                    }
                    return vnextBean.copy(str, i, list);
                }

                @NotNull
                public final String component1() {
                    return this.address;
                }

                public final int component2() {
                    return this.port;
                }

                @NotNull
                public final List<UsersBean> component3() {
                    return this.users;
                }

                @NotNull
                public final VnextBean copy(@NotNull String address, int i, @NotNull List<UsersBean> users) {
                    C10843j.m430f(address, "address");
                    C10843j.m430f(users, "users");
                    return new VnextBean(address, i, users);
                }

                public boolean equals(@Nullable Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj instanceof VnextBean) {
                        VnextBean vnextBean = (VnextBean) obj;
                        return C10843j.m435a(this.address, vnextBean.address) && this.port == vnextBean.port && C10843j.m435a(this.users, vnextBean.users);
                    }
                    return false;
                }

                @NotNull
                public final String getAddress() {
                    return this.address;
                }

                public final int getPort() {
                    return this.port;
                }

                @NotNull
                public final List<UsersBean> getUsers() {
                    return this.users;
                }

                public int hashCode() {
                    return this.users.hashCode() + (((this.address.hashCode() * 31) + this.port) * 31);
                }

                public final void setAddress(@NotNull String str) {
                    C10843j.m430f(str, "<set-?>");
                    this.address = str;
                }

                public final void setPort(int i) {
                    this.port = i;
                }

                public final void setUsers(@NotNull List<UsersBean> list) {
                    C10843j.m430f(list, "<set-?>");
                    this.users = list;
                }

                @NotNull
                public String toString() {
                    return "VnextBean(address=" + this.address + ", port=" + this.port + ", users=" + this.users + ')';
                }
            }

            public OutSettingsBean() {
                this(null, null, null, null, null, null, null, null, null, null, 1023, null);
            }

            public OutSettingsBean(@Nullable List<VnextBean> list, @Nullable List<ServersBean> list2, @Nullable Response response, @Nullable String str, @Nullable String str2, @Nullable Integer num, @Nullable String str3, @Nullable String str4, @Nullable Integer num2, @Nullable String str5) {
                this.vnext = list;
                this.servers = list2;
                this.response = response;
                this.network = str;
                this.address = str2;
                this.port = num;
                this.domainStrategy = str3;
                this.redirect = str4;
                this.userLevel = num2;
                this.inboundTag = str5;
            }

            public /* synthetic */ OutSettingsBean(List list, List list2, Response response, String str, String str2, Integer num, String str3, String str4, Integer num2, String str5, int i, C10839f c10839f) {
                this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : list2, (i & 4) != 0 ? null : response, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : num, (i & 64) != 0 ? null : str3, (i & 128) != 0 ? null : str4, (i & 256) != 0 ? null : num2, (i & AdRequest.MAX_CONTENT_URL_LENGTH) == 0 ? str5 : null);
            }

            @Nullable
            public final List<VnextBean> component1() {
                return this.vnext;
            }

            @Nullable
            public final String component10() {
                return this.inboundTag;
            }

            @Nullable
            public final List<ServersBean> component2() {
                return this.servers;
            }

            @Nullable
            public final Response component3() {
                return this.response;
            }

            @Nullable
            public final String component4() {
                return this.network;
            }

            @Nullable
            public final String component5() {
                return this.address;
            }

            @Nullable
            public final Integer component6() {
                return this.port;
            }

            @Nullable
            public final String component7() {
                return this.domainStrategy;
            }

            @Nullable
            public final String component8() {
                return this.redirect;
            }

            @Nullable
            public final Integer component9() {
                return this.userLevel;
            }

            @NotNull
            public final OutSettingsBean copy(@Nullable List<VnextBean> list, @Nullable List<ServersBean> list2, @Nullable Response response, @Nullable String str, @Nullable String str2, @Nullable Integer num, @Nullable String str3, @Nullable String str4, @Nullable Integer num2, @Nullable String str5) {
                return new OutSettingsBean(list, list2, response, str, str2, num, str3, str4, num2, str5);
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof OutSettingsBean) {
                    OutSettingsBean outSettingsBean = (OutSettingsBean) obj;
                    return C10843j.m435a(this.vnext, outSettingsBean.vnext) && C10843j.m435a(this.servers, outSettingsBean.servers) && C10843j.m435a(this.response, outSettingsBean.response) && C10843j.m435a(this.network, outSettingsBean.network) && C10843j.m435a(this.address, outSettingsBean.address) && C10843j.m435a(this.port, outSettingsBean.port) && C10843j.m435a(this.domainStrategy, outSettingsBean.domainStrategy) && C10843j.m435a(this.redirect, outSettingsBean.redirect) && C10843j.m435a(this.userLevel, outSettingsBean.userLevel) && C10843j.m435a(this.inboundTag, outSettingsBean.inboundTag);
                }
                return false;
            }

            @Nullable
            public final String getAddress() {
                return this.address;
            }

            @Nullable
            public final String getDomainStrategy() {
                return this.domainStrategy;
            }

            @Nullable
            public final String getInboundTag() {
                return this.inboundTag;
            }

            @Nullable
            public final String getNetwork() {
                return this.network;
            }

            @Nullable
            public final Integer getPort() {
                return this.port;
            }

            @Nullable
            public final String getRedirect() {
                return this.redirect;
            }

            @Nullable
            public final Response getResponse() {
                return this.response;
            }

            @Nullable
            public final List<ServersBean> getServers() {
                return this.servers;
            }

            @Nullable
            public final Integer getUserLevel() {
                return this.userLevel;
            }

            @Nullable
            public final List<VnextBean> getVnext() {
                return this.vnext;
            }

            public int hashCode() {
                List<VnextBean> list = this.vnext;
                int hashCode = (list == null ? 0 : list.hashCode()) * 31;
                List<ServersBean> list2 = this.servers;
                int hashCode2 = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
                Response response = this.response;
                int hashCode3 = (hashCode2 + (response == null ? 0 : response.hashCode())) * 31;
                String str = this.network;
                int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.address;
                int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
                Integer num = this.port;
                int hashCode6 = (hashCode5 + (num == null ? 0 : num.hashCode())) * 31;
                String str3 = this.domainStrategy;
                int hashCode7 = (hashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
                String str4 = this.redirect;
                int hashCode8 = (hashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
                Integer num2 = this.userLevel;
                int hashCode9 = (hashCode8 + (num2 == null ? 0 : num2.hashCode())) * 31;
                String str5 = this.inboundTag;
                return hashCode9 + (str5 != null ? str5.hashCode() : 0);
            }

            public final void setDomainStrategy(@Nullable String str) {
                this.domainStrategy = str;
            }

            public final void setResponse(@Nullable Response response) {
                this.response = response;
            }

            public final void setServers(@Nullable List<ServersBean> list) {
                this.servers = list;
            }

            public final void setVnext(@Nullable List<VnextBean> list) {
                this.vnext = list;
            }

            @NotNull
            public String toString() {
                StringBuilder sb = new StringBuilder("OutSettingsBean(vnext=");
                sb.append(this.vnext);
                sb.append(", servers=");
                sb.append(this.servers);
                sb.append(", response=");
                sb.append(this.response);
                sb.append(", network=");
                sb.append(this.network);
                sb.append(", address=");
                sb.append(this.address);
                sb.append(", port=");
                sb.append(this.port);
                sb.append(", domainStrategy=");
                sb.append(this.domainStrategy);
                sb.append(", redirect=");
                sb.append(this.redirect);
                sb.append(", userLevel=");
                sb.append(this.userLevel);
                sb.append(", inboundTag=");
                return C0740h.m11848b(sb, this.inboundTag, ')');
            }
        }

        @Metadata(m509d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b=\b\u0086\b\u0018\u00002\u00020\u0001:\u0007jklmnopB\u0093\u0001\u0012\b\b\u0002\u0010&\u001a\u00020\u0002\u0012\b\b\u0002\u0010'\u001a\u00020\u0002\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u001f\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\"\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u0001\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\bh\u0010iJ^\u0010\f\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u00022\b\u0010\t\u001a\u0004\u0018\u00010\u00022\b\u0010\n\u001a\u0004\u0018\u00010\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002J\u001e\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0002J\t\u0010\u0013\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u001fHÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u001dHÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\"HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\u0095\u0001\u00102\u001a\u00020\u00002\b\b\u0002\u0010&\u001a\u00020\u00022\b\b\u0002\u0010'\u001a\u00020\u00022\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u001f2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\"2\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u0001HÆ\u0001J\t\u00103\u001a\u00020\u0002HÖ\u0001J\t\u00105\u001a\u000204HÖ\u0001J\u0013\u00107\u001a\u00020\u000e2\b\u00106\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010&\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\"\u0010'\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u00108\u001a\u0004\b=\u0010:\"\u0004\b>\u0010<R$\u0010(\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR$\u0010)\u001a\u0004\u0018\u00010\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR$\u0010*\u001a\u0004\u0018\u00010\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010I\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR$\u0010+\u001a\u0004\u0018\u00010\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010N\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR$\u0010,\u001a\u0004\u0018\u00010\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010S\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR$\u0010-\u001a\u0004\u0018\u00010\u001f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010X\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\R$\u0010.\u001a\u0004\u0018\u00010\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010S\u001a\u0004\b]\u0010U\"\u0004\b^\u0010WR$\u0010/\u001a\u0004\u0018\u00010\"8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u0010_\u001a\u0004\b`\u0010a\"\u0004\bb\u0010cR\u0019\u00100\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b0\u0010d\u001a\u0004\be\u0010fR\u0019\u00101\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b1\u0010d\u001a\u0004\bg\u0010f¨\u0006q"}, m508d2 = {"Llibv2ray/V2rayConfig$OutboundBean$StreamSettingsBean;", "", "", "transport", "headerType", "host", "path", "seed", "quicSecurity", "key", "mode", "serviceName", "populateTransportSettings", "streamSecurity", "", "allowInsecure", "sni", "Lkotlin/p;", "populateTlsSettings", "component1", "component2", "Llibv2ray/V2rayConfig$OutboundBean$StreamSettingsBean$TcpSettingsBean;", "component3", "Llibv2ray/V2rayConfig$OutboundBean$StreamSettingsBean$KcpSettingsBean;", "component4", "Llibv2ray/V2rayConfig$OutboundBean$StreamSettingsBean$WsSettingsBean;", "component5", "Llibv2ray/V2rayConfig$OutboundBean$StreamSettingsBean$HttpSettingsBean;", "component6", "Llibv2ray/V2rayConfig$OutboundBean$StreamSettingsBean$TlsSettingsBean;", "component7", "Llibv2ray/V2rayConfig$OutboundBean$StreamSettingsBean$QuicSettingBean;", "component8", "component9", "Llibv2ray/V2rayConfig$OutboundBean$StreamSettingsBean$GrpcSettingsBean;", "component10", "component11", "component12", "network", "security", "tcpSettings", "kcpSettings", "wsSettings", "httpSettings", "tlsSettings", "quicSettings", "xtlsSettings", "grpcSettings", "dsSettings", "sockopt", "copy", "toString", "", "hashCode", "other", "equals", "Ljava/lang/String;", "getNetwork", "()Ljava/lang/String;", "setNetwork", "(Ljava/lang/String;)V", "getSecurity", "setSecurity", "Llibv2ray/V2rayConfig$OutboundBean$StreamSettingsBean$TcpSettingsBean;", "getTcpSettings", "()Llibv2ray/V2rayConfig$OutboundBean$StreamSettingsBean$TcpSettingsBean;", "setTcpSettings", "(Llibv2ray/V2rayConfig$OutboundBean$StreamSettingsBean$TcpSettingsBean;)V", "Llibv2ray/V2rayConfig$OutboundBean$StreamSettingsBean$KcpSettingsBean;", "getKcpSettings", "()Llibv2ray/V2rayConfig$OutboundBean$StreamSettingsBean$KcpSettingsBean;", "setKcpSettings", "(Llibv2ray/V2rayConfig$OutboundBean$StreamSettingsBean$KcpSettingsBean;)V", "Llibv2ray/V2rayConfig$OutboundBean$StreamSettingsBean$WsSettingsBean;", "getWsSettings", "()Llibv2ray/V2rayConfig$OutboundBean$StreamSettingsBean$WsSettingsBean;", "setWsSettings", "(Llibv2ray/V2rayConfig$OutboundBean$StreamSettingsBean$WsSettingsBean;)V", "Llibv2ray/V2rayConfig$OutboundBean$StreamSettingsBean$HttpSettingsBean;", "getHttpSettings", "()Llibv2ray/V2rayConfig$OutboundBean$StreamSettingsBean$HttpSettingsBean;", "setHttpSettings", "(Llibv2ray/V2rayConfig$OutboundBean$StreamSettingsBean$HttpSettingsBean;)V", "Llibv2ray/V2rayConfig$OutboundBean$StreamSettingsBean$TlsSettingsBean;", "getTlsSettings", "()Llibv2ray/V2rayConfig$OutboundBean$StreamSettingsBean$TlsSettingsBean;", "setTlsSettings", "(Llibv2ray/V2rayConfig$OutboundBean$StreamSettingsBean$TlsSettingsBean;)V", "Llibv2ray/V2rayConfig$OutboundBean$StreamSettingsBean$QuicSettingBean;", "getQuicSettings", "()Llibv2ray/V2rayConfig$OutboundBean$StreamSettingsBean$QuicSettingBean;", "setQuicSettings", "(Llibv2ray/V2rayConfig$OutboundBean$StreamSettingsBean$QuicSettingBean;)V", "getXtlsSettings", "setXtlsSettings", "Llibv2ray/V2rayConfig$OutboundBean$StreamSettingsBean$GrpcSettingsBean;", "getGrpcSettings", "()Llibv2ray/V2rayConfig$OutboundBean$StreamSettingsBean$GrpcSettingsBean;", "setGrpcSettings", "(Llibv2ray/V2rayConfig$OutboundBean$StreamSettingsBean$GrpcSettingsBean;)V", "Ljava/lang/Object;", "getDsSettings", "()Ljava/lang/Object;", "getSockopt", "<init>", "(Ljava/lang/String;Ljava/lang/String;Llibv2ray/V2rayConfig$OutboundBean$StreamSettingsBean$TcpSettingsBean;Llibv2ray/V2rayConfig$OutboundBean$StreamSettingsBean$KcpSettingsBean;Llibv2ray/V2rayConfig$OutboundBean$StreamSettingsBean$WsSettingsBean;Llibv2ray/V2rayConfig$OutboundBean$StreamSettingsBean$HttpSettingsBean;Llibv2ray/V2rayConfig$OutboundBean$StreamSettingsBean$TlsSettingsBean;Llibv2ray/V2rayConfig$OutboundBean$StreamSettingsBean$QuicSettingBean;Llibv2ray/V2rayConfig$OutboundBean$StreamSettingsBean$TlsSettingsBean;Llibv2ray/V2rayConfig$OutboundBean$StreamSettingsBean$GrpcSettingsBean;Ljava/lang/Object;Ljava/lang/Object;)V", "GrpcSettingsBean", "HttpSettingsBean", "KcpSettingsBean", "QuicSettingBean", "TcpSettingsBean", "TlsSettingsBean", "WsSettingsBean", "app_release"}, m507k = 1, m506mv = {1, 8, 0})
        @SourceDebugExtension({"SMAP\nV2rayConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 V2rayConfig.kt\nlibv2ray/V2rayConfig$OutboundBean$StreamSettingsBean\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,448:1\n1549#2:449\n1620#2,3:450\n766#2:453\n857#2,2:454\n1549#2:456\n1620#2,3:457\n766#2:460\n857#2,2:461\n1549#2:463\n1620#2,3:464\n766#2:467\n857#2,2:468\n*S KotlinDebug\n*F\n+ 1 V2rayConfig.kt\nlibv2ray/V2rayConfig$OutboundBean$StreamSettingsBean\n*L\n209#1:449\n209#1:450,3\n209#1:453\n209#1:454,2\n210#1:456\n210#1:457,3\n210#1:460\n210#1:461,2\n240#1:463\n240#1:464,3\n240#1:467\n240#1:468,2\n*E\n"})
        /* loaded from: classes3.dex */
        public static final class StreamSettingsBean {
            @Nullable
            private final Object dsSettings;
            @Nullable
            private GrpcSettingsBean grpcSettings;
            @Nullable
            private HttpSettingsBean httpSettings;
            @Nullable
            private KcpSettingsBean kcpSettings;
            @NotNull
            private String network;
            @Nullable
            private QuicSettingBean quicSettings;
            @NotNull
            private String security;
            @Nullable
            private final Object sockopt;
            @Nullable
            private TcpSettingsBean tcpSettings;
            @Nullable
            private TlsSettingsBean tlsSettings;
            @Nullable
            private WsSettingsBean wsSettings;
            @Nullable
            private TlsSettingsBean xtlsSettings;

            @Metadata(m509d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\bJ$\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u00052\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000b\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, m508d2 = {"Llibv2ray/V2rayConfig$OutboundBean$StreamSettingsBean$GrpcSettingsBean;", "", "serviceName", "", "multiMode", "", "(Ljava/lang/String;Ljava/lang/Boolean;)V", "getMultiMode", "()Ljava/lang/Boolean;", "setMultiMode", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getServiceName", "()Ljava/lang/String;", "setServiceName", "(Ljava/lang/String;)V", "component1", "component2", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;)Llibv2ray/V2rayConfig$OutboundBean$StreamSettingsBean$GrpcSettingsBean;", "equals", "other", "hashCode", "", "toString", "app_release"}, m507k = 1, m506mv = {1, 8, 0}, m504xi = 48)
            /* loaded from: classes3.dex */
            public static final class GrpcSettingsBean {
                @Nullable
                private Boolean multiMode;
                @NotNull
                private String serviceName;

                public GrpcSettingsBean() {
                    this(null, null, 3, null);
                }

                public GrpcSettingsBean(@NotNull String serviceName, @Nullable Boolean bool) {
                    C10843j.m430f(serviceName, "serviceName");
                    this.serviceName = serviceName;
                    this.multiMode = bool;
                }

                public /* synthetic */ GrpcSettingsBean(String str, Boolean bool, int i, C10839f c10839f) {
                    this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : bool);
                }

                public static /* synthetic */ GrpcSettingsBean copy$default(GrpcSettingsBean grpcSettingsBean, String str, Boolean bool, int i, Object obj) {
                    if ((i & 1) != 0) {
                        str = grpcSettingsBean.serviceName;
                    }
                    if ((i & 2) != 0) {
                        bool = grpcSettingsBean.multiMode;
                    }
                    return grpcSettingsBean.copy(str, bool);
                }

                @NotNull
                public final String component1() {
                    return this.serviceName;
                }

                @Nullable
                public final Boolean component2() {
                    return this.multiMode;
                }

                @NotNull
                public final GrpcSettingsBean copy(@NotNull String serviceName, @Nullable Boolean bool) {
                    C10843j.m430f(serviceName, "serviceName");
                    return new GrpcSettingsBean(serviceName, bool);
                }

                public boolean equals(@Nullable Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj instanceof GrpcSettingsBean) {
                        GrpcSettingsBean grpcSettingsBean = (GrpcSettingsBean) obj;
                        return C10843j.m435a(this.serviceName, grpcSettingsBean.serviceName) && C10843j.m435a(this.multiMode, grpcSettingsBean.multiMode);
                    }
                    return false;
                }

                @Nullable
                public final Boolean getMultiMode() {
                    return this.multiMode;
                }

                @NotNull
                public final String getServiceName() {
                    return this.serviceName;
                }

                public int hashCode() {
                    int hashCode = this.serviceName.hashCode() * 31;
                    Boolean bool = this.multiMode;
                    return hashCode + (bool == null ? 0 : bool.hashCode());
                }

                public final void setMultiMode(@Nullable Boolean bool) {
                    this.multiMode = bool;
                }

                public final void setServiceName(@NotNull String str) {
                    C10843j.m430f(str, "<set-?>");
                    this.serviceName = str;
                }

                @NotNull
                public String toString() {
                    return "GrpcSettingsBean(serviceName=" + this.serviceName + ", multiMode=" + this.multiMode + ')';
                }
            }

            @Metadata(m509d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0002\u0010\u0006J\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0004HÆ\u0003J#\u0010\u0011\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0004HÖ\u0001R \u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0018"}, m508d2 = {"Llibv2ray/V2rayConfig$OutboundBean$StreamSettingsBean$HttpSettingsBean;", "", "host", "", "", "path", "(Ljava/util/List;Ljava/lang/String;)V", "getHost", "()Ljava/util/List;", "setHost", "(Ljava/util/List;)V", "getPath", "()Ljava/lang/String;", "setPath", "(Ljava/lang/String;)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, m507k = 1, m506mv = {1, 8, 0}, m504xi = 48)
            /* loaded from: classes3.dex */
            public static final class HttpSettingsBean {
                @NotNull
                private List<String> host;
                @NotNull
                private String path;

                public HttpSettingsBean() {
                    this(null, null, 3, null);
                }

                public HttpSettingsBean(@NotNull List<String> host, @NotNull String path) {
                    C10843j.m430f(host, "host");
                    C10843j.m430f(path, "path");
                    this.host = host;
                    this.path = path;
                }

                public /* synthetic */ HttpSettingsBean(List list, String str, int i, C10839f c10839f) {
                    this((i & 1) != 0 ? new ArrayList() : list, (i & 2) != 0 ? "" : str);
                }

                /* JADX WARN: Multi-variable type inference failed */
                public static /* synthetic */ HttpSettingsBean copy$default(HttpSettingsBean httpSettingsBean, List list, String str, int i, Object obj) {
                    if ((i & 1) != 0) {
                        list = httpSettingsBean.host;
                    }
                    if ((i & 2) != 0) {
                        str = httpSettingsBean.path;
                    }
                    return httpSettingsBean.copy(list, str);
                }

                @NotNull
                public final List<String> component1() {
                    return this.host;
                }

                @NotNull
                public final String component2() {
                    return this.path;
                }

                @NotNull
                public final HttpSettingsBean copy(@NotNull List<String> host, @NotNull String path) {
                    C10843j.m430f(host, "host");
                    C10843j.m430f(path, "path");
                    return new HttpSettingsBean(host, path);
                }

                public boolean equals(@Nullable Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj instanceof HttpSettingsBean) {
                        HttpSettingsBean httpSettingsBean = (HttpSettingsBean) obj;
                        return C10843j.m435a(this.host, httpSettingsBean.host) && C10843j.m435a(this.path, httpSettingsBean.path);
                    }
                    return false;
                }

                @NotNull
                public final List<String> getHost() {
                    return this.host;
                }

                @NotNull
                public final String getPath() {
                    return this.path;
                }

                public int hashCode() {
                    return this.path.hashCode() + (this.host.hashCode() * 31);
                }

                public final void setHost(@NotNull List<String> list) {
                    C10843j.m430f(list, "<set-?>");
                    this.host = list;
                }

                public final void setPath(@NotNull String str) {
                    C10843j.m430f(str, "<set-?>");
                    this.path = str;
                }

                @NotNull
                public String toString() {
                    StringBuilder sb = new StringBuilder("HttpSettingsBean(host=");
                    sb.append(this.host);
                    sb.append(", path=");
                    return C0740h.m11848b(sb, this.path, ')');
                }
            }

            @Metadata(m509d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b+\b\u0086\b\u0018\u00002\u00020\u0001:\u00018Ba\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0002\u0010\u000fJ\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\bHÆ\u0003J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\t\u00100\u001a\u00020\u0003HÆ\u0003J\t\u00101\u001a\u00020\fHÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u000eHÆ\u0003Je\u00103\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eHÆ\u0001J\u0013\u00104\u001a\u00020\b2\b\u00105\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00106\u001a\u00020\u0003HÖ\u0001J\t\u00107\u001a\u00020\u000eHÖ\u0001R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0015\"\u0004\b\u001d\u0010\u0017R\u001a\u0010\t\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0015\"\u0004\b\u001f\u0010\u0017R\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0015\"\u0004\b%\u0010\u0017R\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0015\"\u0004\b'\u0010\u0017R\u001a\u0010\n\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0015\"\u0004\b)\u0010\u0017¨\u00069"}, m508d2 = {"Llibv2ray/V2rayConfig$OutboundBean$StreamSettingsBean$KcpSettingsBean;", "", "mtu", "", "tti", "uplinkCapacity", "downlinkCapacity", "congestion", "", "readBufferSize", "writeBufferSize", "header", "Llibv2ray/V2rayConfig$OutboundBean$StreamSettingsBean$KcpSettingsBean$HeaderBean;", "seed", "", "(IIIIZIILlibv2ray/V2rayConfig$OutboundBean$StreamSettingsBean$KcpSettingsBean$HeaderBean;Ljava/lang/String;)V", "getCongestion", "()Z", "setCongestion", "(Z)V", "getDownlinkCapacity", "()I", "setDownlinkCapacity", "(I)V", "getHeader", "()Llibv2ray/V2rayConfig$OutboundBean$StreamSettingsBean$KcpSettingsBean$HeaderBean;", "setHeader", "(Llibv2ray/V2rayConfig$OutboundBean$StreamSettingsBean$KcpSettingsBean$HeaderBean;)V", "getMtu", "setMtu", "getReadBufferSize", "setReadBufferSize", "getSeed", "()Ljava/lang/String;", "setSeed", "(Ljava/lang/String;)V", "getTti", "setTti", "getUplinkCapacity", "setUplinkCapacity", "getWriteBufferSize", "setWriteBufferSize", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "HeaderBean", "app_release"}, m507k = 1, m506mv = {1, 8, 0}, m504xi = 48)
            /* loaded from: classes3.dex */
            public static final class KcpSettingsBean {
                private boolean congestion;
                private int downlinkCapacity;
                @NotNull
                private HeaderBean header;
                private int mtu;
                private int readBufferSize;
                @Nullable
                private String seed;
                private int tti;
                private int uplinkCapacity;
                private int writeBufferSize;

                @Metadata(m509d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\u0010"}, m508d2 = {"Llibv2ray/V2rayConfig$OutboundBean$StreamSettingsBean$KcpSettingsBean$HeaderBean;", "", "type", "", "(Ljava/lang/String;)V", "getType", "()Ljava/lang/String;", "setType", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, m507k = 1, m506mv = {1, 8, 0}, m504xi = 48)
                /* loaded from: classes3.dex */
                public static final class HeaderBean {
                    @NotNull
                    private String type;

                    public HeaderBean() {
                        this(null, 1, null);
                    }

                    public HeaderBean(@NotNull String type) {
                        C10843j.m430f(type, "type");
                        this.type = type;
                    }

                    public /* synthetic */ HeaderBean(String str, int i, C10839f c10839f) {
                        this((i & 1) != 0 ? SchedulerSupport.NONE : str);
                    }

                    public static /* synthetic */ HeaderBean copy$default(HeaderBean headerBean, String str, int i, Object obj) {
                        if ((i & 1) != 0) {
                            str = headerBean.type;
                        }
                        return headerBean.copy(str);
                    }

                    @NotNull
                    public final String component1() {
                        return this.type;
                    }

                    @NotNull
                    public final HeaderBean copy(@NotNull String type) {
                        C10843j.m430f(type, "type");
                        return new HeaderBean(type);
                    }

                    public boolean equals(@Nullable Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return (obj instanceof HeaderBean) && C10843j.m435a(this.type, ((HeaderBean) obj).type);
                    }

                    @NotNull
                    public final String getType() {
                        return this.type;
                    }

                    public int hashCode() {
                        return this.type.hashCode();
                    }

                    public final void setType(@NotNull String str) {
                        C10843j.m430f(str, "<set-?>");
                        this.type = str;
                    }

                    @NotNull
                    public String toString() {
                        return C0740h.m11848b(new StringBuilder("HeaderBean(type="), this.type, ')');
                    }
                }

                public KcpSettingsBean() {
                    this(0, 0, 0, 0, false, 0, 0, null, null, 511, null);
                }

                public KcpSettingsBean(int i, int i2, int i3, int i4, boolean z, int i5, int i6, @NotNull HeaderBean header, @Nullable String str) {
                    C10843j.m430f(header, "header");
                    this.mtu = i;
                    this.tti = i2;
                    this.uplinkCapacity = i3;
                    this.downlinkCapacity = i4;
                    this.congestion = z;
                    this.readBufferSize = i5;
                    this.writeBufferSize = i6;
                    this.header = header;
                    this.seed = str;
                }

                public /* synthetic */ KcpSettingsBean(int i, int i2, int i3, int i4, boolean z, int i5, int i6, HeaderBean headerBean, String str, int i7, C10839f c10839f) {
                    this((i7 & 1) != 0 ? 1350 : i, (i7 & 2) != 0 ? 50 : i2, (i7 & 4) != 0 ? 12 : i3, (i7 & 8) != 0 ? 100 : i4, (i7 & 16) != 0 ? false : z, (i7 & 32) != 0 ? 1 : i5, (i7 & 64) != 0 ? 1 : i6, (i7 & 128) != 0 ? new HeaderBean(null, 1, null) : headerBean, (i7 & 256) == 0 ? str : null);
                }

                public final int component1() {
                    return this.mtu;
                }

                public final int component2() {
                    return this.tti;
                }

                public final int component3() {
                    return this.uplinkCapacity;
                }

                public final int component4() {
                    return this.downlinkCapacity;
                }

                public final boolean component5() {
                    return this.congestion;
                }

                public final int component6() {
                    return this.readBufferSize;
                }

                public final int component7() {
                    return this.writeBufferSize;
                }

                @NotNull
                public final HeaderBean component8() {
                    return this.header;
                }

                @Nullable
                public final String component9() {
                    return this.seed;
                }

                @NotNull
                public final KcpSettingsBean copy(int i, int i2, int i3, int i4, boolean z, int i5, int i6, @NotNull HeaderBean header, @Nullable String str) {
                    C10843j.m430f(header, "header");
                    return new KcpSettingsBean(i, i2, i3, i4, z, i5, i6, header, str);
                }

                public boolean equals(@Nullable Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj instanceof KcpSettingsBean) {
                        KcpSettingsBean kcpSettingsBean = (KcpSettingsBean) obj;
                        return this.mtu == kcpSettingsBean.mtu && this.tti == kcpSettingsBean.tti && this.uplinkCapacity == kcpSettingsBean.uplinkCapacity && this.downlinkCapacity == kcpSettingsBean.downlinkCapacity && this.congestion == kcpSettingsBean.congestion && this.readBufferSize == kcpSettingsBean.readBufferSize && this.writeBufferSize == kcpSettingsBean.writeBufferSize && C10843j.m435a(this.header, kcpSettingsBean.header) && C10843j.m435a(this.seed, kcpSettingsBean.seed);
                    }
                    return false;
                }

                public final boolean getCongestion() {
                    return this.congestion;
                }

                public final int getDownlinkCapacity() {
                    return this.downlinkCapacity;
                }

                @NotNull
                public final HeaderBean getHeader() {
                    return this.header;
                }

                public final int getMtu() {
                    return this.mtu;
                }

                public final int getReadBufferSize() {
                    return this.readBufferSize;
                }

                @Nullable
                public final String getSeed() {
                    return this.seed;
                }

                public final int getTti() {
                    return this.tti;
                }

                public final int getUplinkCapacity() {
                    return this.uplinkCapacity;
                }

                public final int getWriteBufferSize() {
                    return this.writeBufferSize;
                }

                /* JADX WARN: Multi-variable type inference failed */
                public int hashCode() {
                    int i = ((((((this.mtu * 31) + this.tti) * 31) + this.uplinkCapacity) * 31) + this.downlinkCapacity) * 31;
                    boolean z = this.congestion;
                    int i2 = z;
                    if (z != 0) {
                        i2 = 1;
                    }
                    int hashCode = (this.header.hashCode() + ((((((i + i2) * 31) + this.readBufferSize) * 31) + this.writeBufferSize) * 31)) * 31;
                    String str = this.seed;
                    return hashCode + (str == null ? 0 : str.hashCode());
                }

                public final void setCongestion(boolean z) {
                    this.congestion = z;
                }

                public final void setDownlinkCapacity(int i) {
                    this.downlinkCapacity = i;
                }

                public final void setHeader(@NotNull HeaderBean headerBean) {
                    C10843j.m430f(headerBean, "<set-?>");
                    this.header = headerBean;
                }

                public final void setMtu(int i) {
                    this.mtu = i;
                }

                public final void setReadBufferSize(int i) {
                    this.readBufferSize = i;
                }

                public final void setSeed(@Nullable String str) {
                    this.seed = str;
                }

                public final void setTti(int i) {
                    this.tti = i;
                }

                public final void setUplinkCapacity(int i) {
                    this.uplinkCapacity = i;
                }

                public final void setWriteBufferSize(int i) {
                    this.writeBufferSize = i;
                }

                @NotNull
                public String toString() {
                    StringBuilder sb = new StringBuilder("KcpSettingsBean(mtu=");
                    sb.append(this.mtu);
                    sb.append(", tti=");
                    sb.append(this.tti);
                    sb.append(", uplinkCapacity=");
                    sb.append(this.uplinkCapacity);
                    sb.append(", downlinkCapacity=");
                    sb.append(this.downlinkCapacity);
                    sb.append(", congestion=");
                    sb.append(this.congestion);
                    sb.append(", readBufferSize=");
                    sb.append(this.readBufferSize);
                    sb.append(", writeBufferSize=");
                    sb.append(this.writeBufferSize);
                    sb.append(", header=");
                    sb.append(this.header);
                    sb.append(", seed=");
                    return C0740h.m11848b(sb, this.seed, ')');
                }
            }

            @Metadata(m509d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u001cB#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J'\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\u000f¨\u0006\u001d"}, m508d2 = {"Llibv2ray/V2rayConfig$OutboundBean$StreamSettingsBean$QuicSettingBean;", "", "security", "", "key", "header", "Llibv2ray/V2rayConfig$OutboundBean$StreamSettingsBean$QuicSettingBean$HeaderBean;", "(Ljava/lang/String;Ljava/lang/String;Llibv2ray/V2rayConfig$OutboundBean$StreamSettingsBean$QuicSettingBean$HeaderBean;)V", "getHeader", "()Llibv2ray/V2rayConfig$OutboundBean$StreamSettingsBean$QuicSettingBean$HeaderBean;", "setHeader", "(Llibv2ray/V2rayConfig$OutboundBean$StreamSettingsBean$QuicSettingBean$HeaderBean;)V", "getKey", "()Ljava/lang/String;", "setKey", "(Ljava/lang/String;)V", "getSecurity", "setSecurity", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "HeaderBean", "app_release"}, m507k = 1, m506mv = {1, 8, 0}, m504xi = 48)
            /* loaded from: classes3.dex */
            public static final class QuicSettingBean {
                @NotNull
                private HeaderBean header;
                @NotNull
                private String key;
                @NotNull
                private String security;

                @Metadata(m509d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\u0010"}, m508d2 = {"Llibv2ray/V2rayConfig$OutboundBean$StreamSettingsBean$QuicSettingBean$HeaderBean;", "", "type", "", "(Ljava/lang/String;)V", "getType", "()Ljava/lang/String;", "setType", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, m507k = 1, m506mv = {1, 8, 0}, m504xi = 48)
                /* loaded from: classes3.dex */
                public static final class HeaderBean {
                    @NotNull
                    private String type;

                    public HeaderBean() {
                        this(null, 1, null);
                    }

                    public HeaderBean(@NotNull String type) {
                        C10843j.m430f(type, "type");
                        this.type = type;
                    }

                    public /* synthetic */ HeaderBean(String str, int i, C10839f c10839f) {
                        this((i & 1) != 0 ? SchedulerSupport.NONE : str);
                    }

                    public static /* synthetic */ HeaderBean copy$default(HeaderBean headerBean, String str, int i, Object obj) {
                        if ((i & 1) != 0) {
                            str = headerBean.type;
                        }
                        return headerBean.copy(str);
                    }

                    @NotNull
                    public final String component1() {
                        return this.type;
                    }

                    @NotNull
                    public final HeaderBean copy(@NotNull String type) {
                        C10843j.m430f(type, "type");
                        return new HeaderBean(type);
                    }

                    public boolean equals(@Nullable Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return (obj instanceof HeaderBean) && C10843j.m435a(this.type, ((HeaderBean) obj).type);
                    }

                    @NotNull
                    public final String getType() {
                        return this.type;
                    }

                    public int hashCode() {
                        return this.type.hashCode();
                    }

                    public final void setType(@NotNull String str) {
                        C10843j.m430f(str, "<set-?>");
                        this.type = str;
                    }

                    @NotNull
                    public String toString() {
                        return C0740h.m11848b(new StringBuilder("HeaderBean(type="), this.type, ')');
                    }
                }

                public QuicSettingBean() {
                    this(null, null, null, 7, null);
                }

                public QuicSettingBean(@NotNull String security, @NotNull String key, @NotNull HeaderBean header) {
                    C10843j.m430f(security, "security");
                    C10843j.m430f(key, "key");
                    C10843j.m430f(header, "header");
                    this.security = security;
                    this.key = key;
                    this.header = header;
                }

                public /* synthetic */ QuicSettingBean(String str, String str2, HeaderBean headerBean, int i, C10839f c10839f) {
                    this((i & 1) != 0 ? SchedulerSupport.NONE : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? new HeaderBean(null, 1, null) : headerBean);
                }

                public static /* synthetic */ QuicSettingBean copy$default(QuicSettingBean quicSettingBean, String str, String str2, HeaderBean headerBean, int i, Object obj) {
                    if ((i & 1) != 0) {
                        str = quicSettingBean.security;
                    }
                    if ((i & 2) != 0) {
                        str2 = quicSettingBean.key;
                    }
                    if ((i & 4) != 0) {
                        headerBean = quicSettingBean.header;
                    }
                    return quicSettingBean.copy(str, str2, headerBean);
                }

                @NotNull
                public final String component1() {
                    return this.security;
                }

                @NotNull
                public final String component2() {
                    return this.key;
                }

                @NotNull
                public final HeaderBean component3() {
                    return this.header;
                }

                @NotNull
                public final QuicSettingBean copy(@NotNull String security, @NotNull String key, @NotNull HeaderBean header) {
                    C10843j.m430f(security, "security");
                    C10843j.m430f(key, "key");
                    C10843j.m430f(header, "header");
                    return new QuicSettingBean(security, key, header);
                }

                public boolean equals(@Nullable Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj instanceof QuicSettingBean) {
                        QuicSettingBean quicSettingBean = (QuicSettingBean) obj;
                        return C10843j.m435a(this.security, quicSettingBean.security) && C10843j.m435a(this.key, quicSettingBean.key) && C10843j.m435a(this.header, quicSettingBean.header);
                    }
                    return false;
                }

                @NotNull
                public final HeaderBean getHeader() {
                    return this.header;
                }

                @NotNull
                public final String getKey() {
                    return this.key;
                }

                @NotNull
                public final String getSecurity() {
                    return this.security;
                }

                public int hashCode() {
                    return this.header.hashCode() + C0406q1.m12537a(this.key, this.security.hashCode() * 31, 31);
                }

                public final void setHeader(@NotNull HeaderBean headerBean) {
                    C10843j.m430f(headerBean, "<set-?>");
                    this.header = headerBean;
                }

                public final void setKey(@NotNull String str) {
                    C10843j.m430f(str, "<set-?>");
                    this.key = str;
                }

                public final void setSecurity(@NotNull String str) {
                    C10843j.m430f(str, "<set-?>");
                    this.security = str;
                }

                @NotNull
                public String toString() {
                    return "QuicSettingBean(security=" + this.security + ", key=" + this.key + ", header=" + this.header + ')';
                }
            }

            @Metadata(m509d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0018B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\bJ$\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0011J\u0013\u0010\u0012\u001a\u00020\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0019"}, m508d2 = {"Llibv2ray/V2rayConfig$OutboundBean$StreamSettingsBean$TcpSettingsBean;", "", "header", "Llibv2ray/V2rayConfig$OutboundBean$StreamSettingsBean$TcpSettingsBean$HeaderBean;", "acceptProxyProtocol", "", "(Llibv2ray/V2rayConfig$OutboundBean$StreamSettingsBean$TcpSettingsBean$HeaderBean;Ljava/lang/Boolean;)V", "getAcceptProxyProtocol", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getHeader", "()Llibv2ray/V2rayConfig$OutboundBean$StreamSettingsBean$TcpSettingsBean$HeaderBean;", "setHeader", "(Llibv2ray/V2rayConfig$OutboundBean$StreamSettingsBean$TcpSettingsBean$HeaderBean;)V", "component1", "component2", "copy", "(Llibv2ray/V2rayConfig$OutboundBean$StreamSettingsBean$TcpSettingsBean$HeaderBean;Ljava/lang/Boolean;)Llibv2ray/V2rayConfig$OutboundBean$StreamSettingsBean$TcpSettingsBean;", "equals", "other", "hashCode", "", "toString", "", "HeaderBean", "app_release"}, m507k = 1, m506mv = {1, 8, 0}, m504xi = 48)
            /* loaded from: classes3.dex */
            public static final class TcpSettingsBean {
                @Nullable
                private final Boolean acceptProxyProtocol;
                @NotNull
                private HeaderBean header;

                @Metadata(m509d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u001eB'\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0001¢\u0006\u0002\u0010\u0007J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÆ\u0003J+\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0001X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, m508d2 = {"Llibv2ray/V2rayConfig$OutboundBean$StreamSettingsBean$TcpSettingsBean$HeaderBean;", "", "type", "", "request", "Llibv2ray/V2rayConfig$OutboundBean$StreamSettingsBean$TcpSettingsBean$HeaderBean$RequestBean;", "response", "(Ljava/lang/String;Llibv2ray/V2rayConfig$OutboundBean$StreamSettingsBean$TcpSettingsBean$HeaderBean$RequestBean;Ljava/lang/Object;)V", "getRequest", "()Llibv2ray/V2rayConfig$OutboundBean$StreamSettingsBean$TcpSettingsBean$HeaderBean$RequestBean;", "setRequest", "(Llibv2ray/V2rayConfig$OutboundBean$StreamSettingsBean$TcpSettingsBean$HeaderBean$RequestBean;)V", "getResponse", "()Ljava/lang/Object;", "setResponse", "(Ljava/lang/Object;)V", "getType", "()Ljava/lang/String;", "setType", "(Ljava/lang/String;)V", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "RequestBean", "app_release"}, m507k = 1, m506mv = {1, 8, 0}, m504xi = 48)
                /* loaded from: classes3.dex */
                public static final class HeaderBean {
                    @Nullable
                    private RequestBean request;
                    @Nullable
                    private Object response;
                    @NotNull
                    private String type;

                    @Metadata(m509d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0001 B7\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\tJ\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0004HÆ\u0003J;\u0010\u0019\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0004HÖ\u0001R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR \u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000f¨\u0006!"}, m508d2 = {"Llibv2ray/V2rayConfig$OutboundBean$StreamSettingsBean$TcpSettingsBean$HeaderBean$RequestBean;", "", "path", "", "", "headers", "Llibv2ray/V2rayConfig$OutboundBean$StreamSettingsBean$TcpSettingsBean$HeaderBean$RequestBean$HeadersBean;", MediationMetaData.KEY_VERSION, FirebaseAnalytics.Param.METHOD, "(Ljava/util/List;Llibv2ray/V2rayConfig$OutboundBean$StreamSettingsBean$TcpSettingsBean$HeaderBean$RequestBean$HeadersBean;Ljava/lang/String;Ljava/lang/String;)V", "getHeaders", "()Llibv2ray/V2rayConfig$OutboundBean$StreamSettingsBean$TcpSettingsBean$HeaderBean$RequestBean$HeadersBean;", "setHeaders", "(Llibv2ray/V2rayConfig$OutboundBean$StreamSettingsBean$TcpSettingsBean$HeaderBean$RequestBean$HeadersBean;)V", "getMethod", "()Ljava/lang/String;", "getPath", "()Ljava/util/List;", "setPath", "(Ljava/util/List;)V", "getVersion", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "HeadersBean", "app_release"}, m507k = 1, m506mv = {1, 8, 0}, m504xi = 48)
                    /* loaded from: classes3.dex */
                    public static final class RequestBean {
                        @NotNull
                        private HeadersBean headers;
                        @Nullable
                        private final String method;
                        @NotNull
                        private List<String> path;
                        @Nullable
                        private final String version;

                        @Metadata(m509d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BW\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\tJ\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0011\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0004HÆ\u0003J[\u0010\u0018\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0004HÖ\u0001R\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR \u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\u000b\"\u0004\b\r\u0010\u000eR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000bR\u001e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000b¨\u0006\u001f"}, m508d2 = {"Llibv2ray/V2rayConfig$OutboundBean$StreamSettingsBean$TcpSettingsBean$HeaderBean$RequestBean$HeadersBean;", "", "Host", "", "", "userAgent", "acceptEncoding", "Connection", "Pragma", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;)V", "getConnection", "()Ljava/util/List;", "getHost", "setHost", "(Ljava/util/List;)V", "getPragma", "()Ljava/lang/String;", "getAcceptEncoding", "getUserAgent", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, m507k = 1, m506mv = {1, 8, 0}, m504xi = 48)
                        /* loaded from: classes3.dex */
                        public static final class HeadersBean {
                            @Nullable
                            private final List<String> Connection;
                            @NotNull
                            private List<String> Host;
                            @Nullable
                            private final String Pragma;
                            @SerializedName("Accept-Encoding")
                            @Nullable
                            private final List<String> acceptEncoding;
                            @SerializedName("User-Agent")
                            @Nullable
                            private final List<String> userAgent;

                            public HeadersBean() {
                                this(null, null, null, null, null, 31, null);
                            }

                            public HeadersBean(@NotNull List<String> Host, @Nullable List<String> list, @Nullable List<String> list2, @Nullable List<String> list3, @Nullable String str) {
                                C10843j.m430f(Host, "Host");
                                this.Host = Host;
                                this.userAgent = list;
                                this.acceptEncoding = list2;
                                this.Connection = list3;
                                this.Pragma = str;
                            }

                            public /* synthetic */ HeadersBean(List list, List list2, List list3, List list4, String str, int i, C10839f c10839f) {
                                this((i & 1) != 0 ? new ArrayList() : list, (i & 2) != 0 ? null : list2, (i & 4) != 0 ? null : list3, (i & 8) != 0 ? null : list4, (i & 16) == 0 ? str : null);
                            }

                            public static /* synthetic */ HeadersBean copy$default(HeadersBean headersBean, List list, List list2, List list3, List list4, String str, int i, Object obj) {
                                List<String> list5 = list;
                                if ((i & 1) != 0) {
                                    list5 = headersBean.Host;
                                }
                                List<String> list6 = list2;
                                if ((i & 2) != 0) {
                                    list6 = headersBean.userAgent;
                                }
                                List list7 = list6;
                                List<String> list8 = list3;
                                if ((i & 4) != 0) {
                                    list8 = headersBean.acceptEncoding;
                                }
                                List list9 = list8;
                                List<String> list10 = list4;
                                if ((i & 8) != 0) {
                                    list10 = headersBean.Connection;
                                }
                                List list11 = list10;
                                if ((i & 16) != 0) {
                                    str = headersBean.Pragma;
                                }
                                return headersBean.copy(list5, list7, list9, list11, str);
                            }

                            @NotNull
                            public final List<String> component1() {
                                return this.Host;
                            }

                            @Nullable
                            public final List<String> component2() {
                                return this.userAgent;
                            }

                            @Nullable
                            public final List<String> component3() {
                                return this.acceptEncoding;
                            }

                            @Nullable
                            public final List<String> component4() {
                                return this.Connection;
                            }

                            @Nullable
                            public final String component5() {
                                return this.Pragma;
                            }

                            @NotNull
                            public final HeadersBean copy(@NotNull List<String> Host, @Nullable List<String> list, @Nullable List<String> list2, @Nullable List<String> list3, @Nullable String str) {
                                C10843j.m430f(Host, "Host");
                                return new HeadersBean(Host, list, list2, list3, str);
                            }

                            public boolean equals(@Nullable Object obj) {
                                if (this == obj) {
                                    return true;
                                }
                                if (obj instanceof HeadersBean) {
                                    HeadersBean headersBean = (HeadersBean) obj;
                                    return C10843j.m435a(this.Host, headersBean.Host) && C10843j.m435a(this.userAgent, headersBean.userAgent) && C10843j.m435a(this.acceptEncoding, headersBean.acceptEncoding) && C10843j.m435a(this.Connection, headersBean.Connection) && C10843j.m435a(this.Pragma, headersBean.Pragma);
                                }
                                return false;
                            }

                            @Nullable
                            public final List<String> getAcceptEncoding() {
                                return this.acceptEncoding;
                            }

                            @Nullable
                            public final List<String> getConnection() {
                                return this.Connection;
                            }

                            @NotNull
                            public final List<String> getHost() {
                                return this.Host;
                            }

                            @Nullable
                            public final String getPragma() {
                                return this.Pragma;
                            }

                            @Nullable
                            public final List<String> getUserAgent() {
                                return this.userAgent;
                            }

                            public int hashCode() {
                                int hashCode = this.Host.hashCode() * 31;
                                List<String> list = this.userAgent;
                                int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
                                List<String> list2 = this.acceptEncoding;
                                int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
                                List<String> list3 = this.Connection;
                                int hashCode4 = (hashCode3 + (list3 == null ? 0 : list3.hashCode())) * 31;
                                String str = this.Pragma;
                                return hashCode4 + (str != null ? str.hashCode() : 0);
                            }

                            public final void setHost(@NotNull List<String> list) {
                                C10843j.m430f(list, "<set-?>");
                                this.Host = list;
                            }

                            @NotNull
                            public String toString() {
                                StringBuilder sb = new StringBuilder("HeadersBean(Host=");
                                sb.append(this.Host);
                                sb.append(", userAgent=");
                                sb.append(this.userAgent);
                                sb.append(", acceptEncoding=");
                                sb.append(this.acceptEncoding);
                                sb.append(", Connection=");
                                sb.append(this.Connection);
                                sb.append(", Pragma=");
                                return C0740h.m11848b(sb, this.Pragma, ')');
                            }
                        }

                        public RequestBean() {
                            this(null, null, null, null, 15, null);
                        }

                        public RequestBean(@NotNull List<String> path, @NotNull HeadersBean headers, @Nullable String str, @Nullable String str2) {
                            C10843j.m430f(path, "path");
                            C10843j.m430f(headers, "headers");
                            this.path = path;
                            this.headers = headers;
                            this.version = str;
                            this.method = str2;
                        }

                        public /* synthetic */ RequestBean(List list, HeadersBean headersBean, String str, String str2, int i, C10839f c10839f) {
                            this((i & 1) != 0 ? new ArrayList() : list, (i & 2) != 0 ? new HeadersBean(null, null, null, null, null, 31, null) : headersBean, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2);
                        }

                        /* JADX WARN: Multi-variable type inference failed */
                        public static /* synthetic */ RequestBean copy$default(RequestBean requestBean, List list, HeadersBean headersBean, String str, String str2, int i, Object obj) {
                            if ((i & 1) != 0) {
                                list = requestBean.path;
                            }
                            if ((i & 2) != 0) {
                                headersBean = requestBean.headers;
                            }
                            if ((i & 4) != 0) {
                                str = requestBean.version;
                            }
                            if ((i & 8) != 0) {
                                str2 = requestBean.method;
                            }
                            return requestBean.copy(list, headersBean, str, str2);
                        }

                        @NotNull
                        public final List<String> component1() {
                            return this.path;
                        }

                        @NotNull
                        public final HeadersBean component2() {
                            return this.headers;
                        }

                        @Nullable
                        public final String component3() {
                            return this.version;
                        }

                        @Nullable
                        public final String component4() {
                            return this.method;
                        }

                        @NotNull
                        public final RequestBean copy(@NotNull List<String> path, @NotNull HeadersBean headers, @Nullable String str, @Nullable String str2) {
                            C10843j.m430f(path, "path");
                            C10843j.m430f(headers, "headers");
                            return new RequestBean(path, headers, str, str2);
                        }

                        public boolean equals(@Nullable Object obj) {
                            if (this == obj) {
                                return true;
                            }
                            if (obj instanceof RequestBean) {
                                RequestBean requestBean = (RequestBean) obj;
                                return C10843j.m435a(this.path, requestBean.path) && C10843j.m435a(this.headers, requestBean.headers) && C10843j.m435a(this.version, requestBean.version) && C10843j.m435a(this.method, requestBean.method);
                            }
                            return false;
                        }

                        @NotNull
                        public final HeadersBean getHeaders() {
                            return this.headers;
                        }

                        @Nullable
                        public final String getMethod() {
                            return this.method;
                        }

                        @NotNull
                        public final List<String> getPath() {
                            return this.path;
                        }

                        @Nullable
                        public final String getVersion() {
                            return this.version;
                        }

                        public int hashCode() {
                            int hashCode = (this.headers.hashCode() + (this.path.hashCode() * 31)) * 31;
                            String str = this.version;
                            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
                            String str2 = this.method;
                            return hashCode2 + (str2 != null ? str2.hashCode() : 0);
                        }

                        public final void setHeaders(@NotNull HeadersBean headersBean) {
                            C10843j.m430f(headersBean, "<set-?>");
                            this.headers = headersBean;
                        }

                        public final void setPath(@NotNull List<String> list) {
                            C10843j.m430f(list, "<set-?>");
                            this.path = list;
                        }

                        @NotNull
                        public String toString() {
                            StringBuilder sb = new StringBuilder("RequestBean(path=");
                            sb.append(this.path);
                            sb.append(", headers=");
                            sb.append(this.headers);
                            sb.append(", version=");
                            sb.append(this.version);
                            sb.append(", method=");
                            return C0740h.m11848b(sb, this.method, ')');
                        }
                    }

                    public HeaderBean() {
                        this(null, null, null, 7, null);
                    }

                    public HeaderBean(@NotNull String type, @Nullable RequestBean requestBean, @Nullable Object obj) {
                        C10843j.m430f(type, "type");
                        this.type = type;
                        this.request = requestBean;
                        this.response = obj;
                    }

                    public /* synthetic */ HeaderBean(String str, RequestBean requestBean, Object obj, int i, C10839f c10839f) {
                        this((i & 1) != 0 ? SchedulerSupport.NONE : str, (i & 2) != 0 ? null : requestBean, (i & 4) != 0 ? null : obj);
                    }

                    public static /* synthetic */ HeaderBean copy$default(HeaderBean headerBean, String str, RequestBean requestBean, Object obj, int i, Object obj2) {
                        if ((i & 1) != 0) {
                            str = headerBean.type;
                        }
                        if ((i & 2) != 0) {
                            requestBean = headerBean.request;
                        }
                        if ((i & 4) != 0) {
                            obj = headerBean.response;
                        }
                        return headerBean.copy(str, requestBean, obj);
                    }

                    @NotNull
                    public final String component1() {
                        return this.type;
                    }

                    @Nullable
                    public final RequestBean component2() {
                        return this.request;
                    }

                    @Nullable
                    public final Object component3() {
                        return this.response;
                    }

                    @NotNull
                    public final HeaderBean copy(@NotNull String type, @Nullable RequestBean requestBean, @Nullable Object obj) {
                        C10843j.m430f(type, "type");
                        return new HeaderBean(type, requestBean, obj);
                    }

                    public boolean equals(@Nullable Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (obj instanceof HeaderBean) {
                            HeaderBean headerBean = (HeaderBean) obj;
                            return C10843j.m435a(this.type, headerBean.type) && C10843j.m435a(this.request, headerBean.request) && C10843j.m435a(this.response, headerBean.response);
                        }
                        return false;
                    }

                    @Nullable
                    public final RequestBean getRequest() {
                        return this.request;
                    }

                    @Nullable
                    public final Object getResponse() {
                        return this.response;
                    }

                    @NotNull
                    public final String getType() {
                        return this.type;
                    }

                    public int hashCode() {
                        int hashCode = this.type.hashCode() * 31;
                        RequestBean requestBean = this.request;
                        int hashCode2 = (hashCode + (requestBean == null ? 0 : requestBean.hashCode())) * 31;
                        Object obj = this.response;
                        return hashCode2 + (obj != null ? obj.hashCode() : 0);
                    }

                    public final void setRequest(@Nullable RequestBean requestBean) {
                        this.request = requestBean;
                    }

                    public final void setResponse(@Nullable Object obj) {
                        this.response = obj;
                    }

                    public final void setType(@NotNull String str) {
                        C10843j.m430f(str, "<set-?>");
                        this.type = str;
                    }

                    @NotNull
                    public String toString() {
                        return "HeaderBean(type=" + this.type + ", request=" + this.request + ", response=" + this.response + ')';
                    }
                }

                public TcpSettingsBean() {
                    this(null, null, 3, null);
                }

                public TcpSettingsBean(@NotNull HeaderBean header, @Nullable Boolean bool) {
                    C10843j.m430f(header, "header");
                    this.header = header;
                    this.acceptProxyProtocol = bool;
                }

                public /* synthetic */ TcpSettingsBean(HeaderBean headerBean, Boolean bool, int i, C10839f c10839f) {
                    this((i & 1) != 0 ? new HeaderBean(null, null, null, 7, null) : headerBean, (i & 2) != 0 ? null : bool);
                }

                public static /* synthetic */ TcpSettingsBean copy$default(TcpSettingsBean tcpSettingsBean, HeaderBean headerBean, Boolean bool, int i, Object obj) {
                    if ((i & 1) != 0) {
                        headerBean = tcpSettingsBean.header;
                    }
                    if ((i & 2) != 0) {
                        bool = tcpSettingsBean.acceptProxyProtocol;
                    }
                    return tcpSettingsBean.copy(headerBean, bool);
                }

                @NotNull
                public final HeaderBean component1() {
                    return this.header;
                }

                @Nullable
                public final Boolean component2() {
                    return this.acceptProxyProtocol;
                }

                @NotNull
                public final TcpSettingsBean copy(@NotNull HeaderBean header, @Nullable Boolean bool) {
                    C10843j.m430f(header, "header");
                    return new TcpSettingsBean(header, bool);
                }

                public boolean equals(@Nullable Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj instanceof TcpSettingsBean) {
                        TcpSettingsBean tcpSettingsBean = (TcpSettingsBean) obj;
                        return C10843j.m435a(this.header, tcpSettingsBean.header) && C10843j.m435a(this.acceptProxyProtocol, tcpSettingsBean.acceptProxyProtocol);
                    }
                    return false;
                }

                @Nullable
                public final Boolean getAcceptProxyProtocol() {
                    return this.acceptProxyProtocol;
                }

                @NotNull
                public final HeaderBean getHeader() {
                    return this.header;
                }

                public int hashCode() {
                    int hashCode = this.header.hashCode() * 31;
                    Boolean bool = this.acceptProxyProtocol;
                    return hashCode + (bool == null ? 0 : bool.hashCode());
                }

                public final void setHeader(@NotNull HeaderBean headerBean) {
                    C10843j.m430f(headerBean, "<set-?>");
                    this.header = headerBean;
                }

                @NotNull
                public String toString() {
                    return "TcpSettingsBean(header=" + this.header + ", acceptProxyProtocol=" + this.acceptProxyProtocol + ')';
                }
            }

            @Metadata(m509d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b-\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0091\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0010J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\u0010\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001bJ\u0010\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001bJ\t\u0010(\u001a\u00020\u0005HÆ\u0003J\u0011\u0010)\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001bJ\u000b\u0010-\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u0010/\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0007HÆ\u0003J\u009a\u0001\u00100\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00072\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u00101J\u0013\u00102\u001a\u00020\u00032\b\u00103\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00104\u001a\u000205HÖ\u0001J\t\u00106\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u001a\u0010\u001bR\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u001d\u0010\u001bR\u0013\u0010\f\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0019R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0019R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0019R\u0015\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b!\u0010\u001bR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0019\"\u0004\b#\u0010$¨\u00067"}, m508d2 = {"Llibv2ray/V2rayConfig$OutboundBean$StreamSettingsBean$TlsSettingsBean;", "", "allowInsecure", "", "serverName", "", "alpn", "", "minVersion", "maxVersion", "preferServerCipherSuites", "cipherSuites", "fingerprint", "certificates", "disableSystemRoot", "enableSessionResumption", "(ZLjava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "getAllowInsecure", "()Z", "setAllowInsecure", "(Z)V", "getAlpn", "()Ljava/util/List;", "getCertificates", "getCipherSuites", "()Ljava/lang/String;", "getDisableSystemRoot", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getEnableSessionResumption", "getFingerprint", "getMaxVersion", "getMinVersion", "getPreferServerCipherSuites", "getServerName", "setServerName", "(Ljava/lang/String;)V", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(ZLjava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;)Llibv2ray/V2rayConfig$OutboundBean$StreamSettingsBean$TlsSettingsBean;", "equals", "other", "hashCode", "", "toString", "app_release"}, m507k = 1, m506mv = {1, 8, 0}, m504xi = 48)
            /* loaded from: classes3.dex */
            public static final class TlsSettingsBean {
                private boolean allowInsecure;
                @Nullable
                private final List<String> alpn;
                @Nullable
                private final List<Object> certificates;
                @Nullable
                private final String cipherSuites;
                @Nullable
                private final Boolean disableSystemRoot;
                @Nullable
                private final Boolean enableSessionResumption;
                @Nullable
                private final String fingerprint;
                @Nullable
                private final String maxVersion;
                @Nullable
                private final String minVersion;
                @Nullable
                private final Boolean preferServerCipherSuites;
                @NotNull
                private String serverName;

                public TlsSettingsBean() {
                    this(false, null, null, null, null, null, null, null, null, null, null, 2047, null);
                }

                public TlsSettingsBean(boolean z, @NotNull String serverName, @Nullable List<String> list, @Nullable String str, @Nullable String str2, @Nullable Boolean bool, @Nullable String str3, @Nullable String str4, @Nullable List<? extends Object> list2, @Nullable Boolean bool2, @Nullable Boolean bool3) {
                    C10843j.m430f(serverName, "serverName");
                    this.allowInsecure = z;
                    this.serverName = serverName;
                    this.alpn = list;
                    this.minVersion = str;
                    this.maxVersion = str2;
                    this.preferServerCipherSuites = bool;
                    this.cipherSuites = str3;
                    this.fingerprint = str4;
                    this.certificates = list2;
                    this.disableSystemRoot = bool2;
                    this.enableSessionResumption = bool3;
                }

                public /* synthetic */ TlsSettingsBean(boolean z, String str, List list, String str2, String str3, Boolean bool, String str4, String str5, List list2, Boolean bool2, Boolean bool3, int i, C10839f c10839f) {
                    this((i & 1) != 0 ? false : z, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? null : list, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : bool, (i & 64) != 0 ? null : str4, (i & 128) != 0 ? null : str5, (i & 256) != 0 ? null : list2, (i & AdRequest.MAX_CONTENT_URL_LENGTH) != 0 ? null : bool2, (i & 1024) == 0 ? bool3 : null);
                }

                public final boolean component1() {
                    return this.allowInsecure;
                }

                @Nullable
                public final Boolean component10() {
                    return this.disableSystemRoot;
                }

                @Nullable
                public final Boolean component11() {
                    return this.enableSessionResumption;
                }

                @NotNull
                public final String component2() {
                    return this.serverName;
                }

                @Nullable
                public final List<String> component3() {
                    return this.alpn;
                }

                @Nullable
                public final String component4() {
                    return this.minVersion;
                }

                @Nullable
                public final String component5() {
                    return this.maxVersion;
                }

                @Nullable
                public final Boolean component6() {
                    return this.preferServerCipherSuites;
                }

                @Nullable
                public final String component7() {
                    return this.cipherSuites;
                }

                @Nullable
                public final String component8() {
                    return this.fingerprint;
                }

                @Nullable
                public final List<Object> component9() {
                    return this.certificates;
                }

                @NotNull
                public final TlsSettingsBean copy(boolean z, @NotNull String serverName, @Nullable List<String> list, @Nullable String str, @Nullable String str2, @Nullable Boolean bool, @Nullable String str3, @Nullable String str4, @Nullable List<? extends Object> list2, @Nullable Boolean bool2, @Nullable Boolean bool3) {
                    C10843j.m430f(serverName, "serverName");
                    return new TlsSettingsBean(z, serverName, list, str, str2, bool, str3, str4, list2, bool2, bool3);
                }

                public boolean equals(@Nullable Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj instanceof TlsSettingsBean) {
                        TlsSettingsBean tlsSettingsBean = (TlsSettingsBean) obj;
                        return this.allowInsecure == tlsSettingsBean.allowInsecure && C10843j.m435a(this.serverName, tlsSettingsBean.serverName) && C10843j.m435a(this.alpn, tlsSettingsBean.alpn) && C10843j.m435a(this.minVersion, tlsSettingsBean.minVersion) && C10843j.m435a(this.maxVersion, tlsSettingsBean.maxVersion) && C10843j.m435a(this.preferServerCipherSuites, tlsSettingsBean.preferServerCipherSuites) && C10843j.m435a(this.cipherSuites, tlsSettingsBean.cipherSuites) && C10843j.m435a(this.fingerprint, tlsSettingsBean.fingerprint) && C10843j.m435a(this.certificates, tlsSettingsBean.certificates) && C10843j.m435a(this.disableSystemRoot, tlsSettingsBean.disableSystemRoot) && C10843j.m435a(this.enableSessionResumption, tlsSettingsBean.enableSessionResumption);
                    }
                    return false;
                }

                public final boolean getAllowInsecure() {
                    return this.allowInsecure;
                }

                @Nullable
                public final List<String> getAlpn() {
                    return this.alpn;
                }

                @Nullable
                public final List<Object> getCertificates() {
                    return this.certificates;
                }

                @Nullable
                public final String getCipherSuites() {
                    return this.cipherSuites;
                }

                @Nullable
                public final Boolean getDisableSystemRoot() {
                    return this.disableSystemRoot;
                }

                @Nullable
                public final Boolean getEnableSessionResumption() {
                    return this.enableSessionResumption;
                }

                @Nullable
                public final String getFingerprint() {
                    return this.fingerprint;
                }

                @Nullable
                public final String getMaxVersion() {
                    return this.maxVersion;
                }

                @Nullable
                public final String getMinVersion() {
                    return this.minVersion;
                }

                @Nullable
                public final Boolean getPreferServerCipherSuites() {
                    return this.preferServerCipherSuites;
                }

                @NotNull
                public final String getServerName() {
                    return this.serverName;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r0v1, types: [int] */
                /* JADX WARN: Type inference failed for: r0v21 */
                /* JADX WARN: Type inference failed for: r0v22 */
                public int hashCode() {
                    int hashCode;
                    int hashCode2;
                    int hashCode3;
                    int hashCode4;
                    int hashCode5;
                    int hashCode6;
                    int hashCode7;
                    int hashCode8;
                    boolean z = this.allowInsecure;
                    ?? r0 = z;
                    if (z) {
                        r0 = 1;
                    }
                    int m12537a = C0406q1.m12537a(this.serverName, r0 * 31, 31);
                    List<String> list = this.alpn;
                    int i = 0;
                    if (list == null) {
                        hashCode = 0;
                    } else {
                        hashCode = list.hashCode();
                    }
                    int i2 = (m12537a + hashCode) * 31;
                    String str = this.minVersion;
                    if (str == null) {
                        hashCode2 = 0;
                    } else {
                        hashCode2 = str.hashCode();
                    }
                    int i3 = (i2 + hashCode2) * 31;
                    String str2 = this.maxVersion;
                    if (str2 == null) {
                        hashCode3 = 0;
                    } else {
                        hashCode3 = str2.hashCode();
                    }
                    int i4 = (i3 + hashCode3) * 31;
                    Boolean bool = this.preferServerCipherSuites;
                    if (bool == null) {
                        hashCode4 = 0;
                    } else {
                        hashCode4 = bool.hashCode();
                    }
                    int i5 = (i4 + hashCode4) * 31;
                    String str3 = this.cipherSuites;
                    if (str3 == null) {
                        hashCode5 = 0;
                    } else {
                        hashCode5 = str3.hashCode();
                    }
                    int i6 = (i5 + hashCode5) * 31;
                    String str4 = this.fingerprint;
                    if (str4 == null) {
                        hashCode6 = 0;
                    } else {
                        hashCode6 = str4.hashCode();
                    }
                    int i7 = (i6 + hashCode6) * 31;
                    List<Object> list2 = this.certificates;
                    if (list2 == null) {
                        hashCode7 = 0;
                    } else {
                        hashCode7 = list2.hashCode();
                    }
                    int i8 = (i7 + hashCode7) * 31;
                    Boolean bool2 = this.disableSystemRoot;
                    if (bool2 == null) {
                        hashCode8 = 0;
                    } else {
                        hashCode8 = bool2.hashCode();
                    }
                    int i9 = (i8 + hashCode8) * 31;
                    Boolean bool3 = this.enableSessionResumption;
                    if (bool3 != null) {
                        i = bool3.hashCode();
                    }
                    return i9 + i;
                }

                public final void setAllowInsecure(boolean z) {
                    this.allowInsecure = z;
                }

                public final void setServerName(@NotNull String str) {
                    C10843j.m430f(str, "<set-?>");
                    this.serverName = str;
                }

                @NotNull
                public String toString() {
                    return "TlsSettingsBean(allowInsecure=" + this.allowInsecure + ", serverName=" + this.serverName + ", alpn=" + this.alpn + ", minVersion=" + this.minVersion + ", maxVersion=" + this.maxVersion + ", preferServerCipherSuites=" + this.preferServerCipherSuites + ", cipherSuites=" + this.cipherSuites + ", fingerprint=" + this.fingerprint + ", certificates=" + this.certificates + ", disableSystemRoot=" + this.disableSystemRoot + ", enableSessionResumption=" + this.enableSessionResumption + ')';
                }
            }

            @Metadata(m509d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001e\b\u0086\b\u0018\u00002\u00020\u0001:\u0001&B=\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\u000bJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0014J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\rJ\u0010\u0010\u001f\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\rJF\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010!J\u0013\u0010\"\u001a\u00020\t2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020\u0007HÖ\u0001J\t\u0010%\u001a\u00020\u0003HÖ\u0001R\u0015\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u001a\u0010\r¨\u0006'"}, m508d2 = {"Llibv2ray/V2rayConfig$OutboundBean$StreamSettingsBean$WsSettingsBean;", "", "path", "", "headers", "Llibv2ray/V2rayConfig$OutboundBean$StreamSettingsBean$WsSettingsBean$HeadersBean;", "maxEarlyData", "", "useBrowserForwarding", "", "acceptProxyProtocol", "(Ljava/lang/String;Llibv2ray/V2rayConfig$OutboundBean$StreamSettingsBean$WsSettingsBean$HeadersBean;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "getAcceptProxyProtocol", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getHeaders", "()Llibv2ray/V2rayConfig$OutboundBean$StreamSettingsBean$WsSettingsBean$HeadersBean;", "setHeaders", "(Llibv2ray/V2rayConfig$OutboundBean$StreamSettingsBean$WsSettingsBean$HeadersBean;)V", "getMaxEarlyData", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getPath", "()Ljava/lang/String;", "setPath", "(Ljava/lang/String;)V", "getUseBrowserForwarding", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Llibv2ray/V2rayConfig$OutboundBean$StreamSettingsBean$WsSettingsBean$HeadersBean;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;)Llibv2ray/V2rayConfig$OutboundBean$StreamSettingsBean$WsSettingsBean;", "equals", "other", "hashCode", "toString", "HeadersBean", "app_release"}, m507k = 1, m506mv = {1, 8, 0}, m504xi = 48)
            /* loaded from: classes3.dex */
            public static final class WsSettingsBean {
                @Nullable
                private final Boolean acceptProxyProtocol;
                @NotNull
                private HeadersBean headers;
                @Nullable
                private final Integer maxEarlyData;
                @NotNull
                private String path;
                @Nullable
                private final Boolean useBrowserForwarding;

                @Metadata(m509d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\u0010"}, m508d2 = {"Llibv2ray/V2rayConfig$OutboundBean$StreamSettingsBean$WsSettingsBean$HeadersBean;", "", "Host", "", "(Ljava/lang/String;)V", "getHost", "()Ljava/lang/String;", "setHost", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, m507k = 1, m506mv = {1, 8, 0}, m504xi = 48)
                /* loaded from: classes3.dex */
                public static final class HeadersBean {
                    @NotNull
                    private String Host;

                    public HeadersBean() {
                        this(null, 1, null);
                    }

                    public HeadersBean(@NotNull String Host) {
                        C10843j.m430f(Host, "Host");
                        this.Host = Host;
                    }

                    public /* synthetic */ HeadersBean(String str, int i, C10839f c10839f) {
                        this((i & 1) != 0 ? "" : str);
                    }

                    public static /* synthetic */ HeadersBean copy$default(HeadersBean headersBean, String str, int i, Object obj) {
                        if ((i & 1) != 0) {
                            str = headersBean.Host;
                        }
                        return headersBean.copy(str);
                    }

                    @NotNull
                    public final String component1() {
                        return this.Host;
                    }

                    @NotNull
                    public final HeadersBean copy(@NotNull String Host) {
                        C10843j.m430f(Host, "Host");
                        return new HeadersBean(Host);
                    }

                    public boolean equals(@Nullable Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return (obj instanceof HeadersBean) && C10843j.m435a(this.Host, ((HeadersBean) obj).Host);
                    }

                    @NotNull
                    public final String getHost() {
                        return this.Host;
                    }

                    public int hashCode() {
                        return this.Host.hashCode();
                    }

                    public final void setHost(@NotNull String str) {
                        C10843j.m430f(str, "<set-?>");
                        this.Host = str;
                    }

                    @NotNull
                    public String toString() {
                        return C0740h.m11848b(new StringBuilder("HeadersBean(Host="), this.Host, ')');
                    }
                }

                public WsSettingsBean() {
                    this(null, null, null, null, null, 31, null);
                }

                public WsSettingsBean(@NotNull String path, @NotNull HeadersBean headers, @Nullable Integer num, @Nullable Boolean bool, @Nullable Boolean bool2) {
                    C10843j.m430f(path, "path");
                    C10843j.m430f(headers, "headers");
                    this.path = path;
                    this.headers = headers;
                    this.maxEarlyData = num;
                    this.useBrowserForwarding = bool;
                    this.acceptProxyProtocol = bool2;
                }

                public /* synthetic */ WsSettingsBean(String str, HeadersBean headersBean, Integer num, Boolean bool, Boolean bool2, int i, C10839f c10839f) {
                    this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? new HeadersBean(null, 1, null) : headersBean, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : bool, (i & 16) == 0 ? bool2 : null);
                }

                public static /* synthetic */ WsSettingsBean copy$default(WsSettingsBean wsSettingsBean, String str, HeadersBean headersBean, Integer num, Boolean bool, Boolean bool2, int i, Object obj) {
                    if ((i & 1) != 0) {
                        str = wsSettingsBean.path;
                    }
                    if ((i & 2) != 0) {
                        headersBean = wsSettingsBean.headers;
                    }
                    HeadersBean headersBean2 = headersBean;
                    if ((i & 4) != 0) {
                        num = wsSettingsBean.maxEarlyData;
                    }
                    Integer num2 = num;
                    if ((i & 8) != 0) {
                        bool = wsSettingsBean.useBrowserForwarding;
                    }
                    Boolean bool3 = bool;
                    if ((i & 16) != 0) {
                        bool2 = wsSettingsBean.acceptProxyProtocol;
                    }
                    return wsSettingsBean.copy(str, headersBean2, num2, bool3, bool2);
                }

                @NotNull
                public final String component1() {
                    return this.path;
                }

                @NotNull
                public final HeadersBean component2() {
                    return this.headers;
                }

                @Nullable
                public final Integer component3() {
                    return this.maxEarlyData;
                }

                @Nullable
                public final Boolean component4() {
                    return this.useBrowserForwarding;
                }

                @Nullable
                public final Boolean component5() {
                    return this.acceptProxyProtocol;
                }

                @NotNull
                public final WsSettingsBean copy(@NotNull String path, @NotNull HeadersBean headers, @Nullable Integer num, @Nullable Boolean bool, @Nullable Boolean bool2) {
                    C10843j.m430f(path, "path");
                    C10843j.m430f(headers, "headers");
                    return new WsSettingsBean(path, headers, num, bool, bool2);
                }

                public boolean equals(@Nullable Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj instanceof WsSettingsBean) {
                        WsSettingsBean wsSettingsBean = (WsSettingsBean) obj;
                        return C10843j.m435a(this.path, wsSettingsBean.path) && C10843j.m435a(this.headers, wsSettingsBean.headers) && C10843j.m435a(this.maxEarlyData, wsSettingsBean.maxEarlyData) && C10843j.m435a(this.useBrowserForwarding, wsSettingsBean.useBrowserForwarding) && C10843j.m435a(this.acceptProxyProtocol, wsSettingsBean.acceptProxyProtocol);
                    }
                    return false;
                }

                @Nullable
                public final Boolean getAcceptProxyProtocol() {
                    return this.acceptProxyProtocol;
                }

                @NotNull
                public final HeadersBean getHeaders() {
                    return this.headers;
                }

                @Nullable
                public final Integer getMaxEarlyData() {
                    return this.maxEarlyData;
                }

                @NotNull
                public final String getPath() {
                    return this.path;
                }

                @Nullable
                public final Boolean getUseBrowserForwarding() {
                    return this.useBrowserForwarding;
                }

                public int hashCode() {
                    int hashCode = (this.headers.hashCode() + (this.path.hashCode() * 31)) * 31;
                    Integer num = this.maxEarlyData;
                    int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
                    Boolean bool = this.useBrowserForwarding;
                    int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
                    Boolean bool2 = this.acceptProxyProtocol;
                    return hashCode3 + (bool2 != null ? bool2.hashCode() : 0);
                }

                public final void setHeaders(@NotNull HeadersBean headersBean) {
                    C10843j.m430f(headersBean, "<set-?>");
                    this.headers = headersBean;
                }

                public final void setPath(@NotNull String str) {
                    C10843j.m430f(str, "<set-?>");
                    this.path = str;
                }

                @NotNull
                public String toString() {
                    return "WsSettingsBean(path=" + this.path + ", headers=" + this.headers + ", maxEarlyData=" + this.maxEarlyData + ", useBrowserForwarding=" + this.useBrowserForwarding + ", acceptProxyProtocol=" + this.acceptProxyProtocol + ')';
                }
            }

            public StreamSettingsBean() {
                this(null, null, null, null, null, null, null, null, null, null, null, null, 4095, null);
            }

            public StreamSettingsBean(@NotNull String network, @NotNull String security, @Nullable TcpSettingsBean tcpSettingsBean, @Nullable KcpSettingsBean kcpSettingsBean, @Nullable WsSettingsBean wsSettingsBean, @Nullable HttpSettingsBean httpSettingsBean, @Nullable TlsSettingsBean tlsSettingsBean, @Nullable QuicSettingBean quicSettingBean, @Nullable TlsSettingsBean tlsSettingsBean2, @Nullable GrpcSettingsBean grpcSettingsBean, @Nullable Object obj, @Nullable Object obj2) {
                C10843j.m430f(network, "network");
                C10843j.m430f(security, "security");
                this.network = network;
                this.security = security;
                this.tcpSettings = tcpSettingsBean;
                this.kcpSettings = kcpSettingsBean;
                this.wsSettings = wsSettingsBean;
                this.httpSettings = httpSettingsBean;
                this.tlsSettings = tlsSettingsBean;
                this.quicSettings = quicSettingBean;
                this.xtlsSettings = tlsSettingsBean2;
                this.grpcSettings = grpcSettingsBean;
                this.dsSettings = obj;
                this.sockopt = obj2;
            }

            public /* synthetic */ StreamSettingsBean(String str, String str2, TcpSettingsBean tcpSettingsBean, KcpSettingsBean kcpSettingsBean, WsSettingsBean wsSettingsBean, HttpSettingsBean httpSettingsBean, TlsSettingsBean tlsSettingsBean, QuicSettingBean quicSettingBean, TlsSettingsBean tlsSettingsBean2, GrpcSettingsBean grpcSettingsBean, Object obj, Object obj2, int i, C10839f c10839f) {
                this((i & 1) != 0 ? V2rayConfig.DEFAULT_NETWORK : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : tcpSettingsBean, (i & 8) != 0 ? null : kcpSettingsBean, (i & 16) != 0 ? null : wsSettingsBean, (i & 32) != 0 ? null : httpSettingsBean, (i & 64) != 0 ? null : tlsSettingsBean, (i & 128) != 0 ? null : quicSettingBean, (i & 256) != 0 ? null : tlsSettingsBean2, (i & AdRequest.MAX_CONTENT_URL_LENGTH) != 0 ? null : grpcSettingsBean, (i & 1024) != 0 ? null : obj, (i & 2048) == 0 ? obj2 : null);
            }

            @NotNull
            public final String component1() {
                return this.network;
            }

            @Nullable
            public final GrpcSettingsBean component10() {
                return this.grpcSettings;
            }

            @Nullable
            public final Object component11() {
                return this.dsSettings;
            }

            @Nullable
            public final Object component12() {
                return this.sockopt;
            }

            @NotNull
            public final String component2() {
                return this.security;
            }

            @Nullable
            public final TcpSettingsBean component3() {
                return this.tcpSettings;
            }

            @Nullable
            public final KcpSettingsBean component4() {
                return this.kcpSettings;
            }

            @Nullable
            public final WsSettingsBean component5() {
                return this.wsSettings;
            }

            @Nullable
            public final HttpSettingsBean component6() {
                return this.httpSettings;
            }

            @Nullable
            public final TlsSettingsBean component7() {
                return this.tlsSettings;
            }

            @Nullable
            public final QuicSettingBean component8() {
                return this.quicSettings;
            }

            @Nullable
            public final TlsSettingsBean component9() {
                return this.xtlsSettings;
            }

            @NotNull
            public final StreamSettingsBean copy(@NotNull String network, @NotNull String security, @Nullable TcpSettingsBean tcpSettingsBean, @Nullable KcpSettingsBean kcpSettingsBean, @Nullable WsSettingsBean wsSettingsBean, @Nullable HttpSettingsBean httpSettingsBean, @Nullable TlsSettingsBean tlsSettingsBean, @Nullable QuicSettingBean quicSettingBean, @Nullable TlsSettingsBean tlsSettingsBean2, @Nullable GrpcSettingsBean grpcSettingsBean, @Nullable Object obj, @Nullable Object obj2) {
                C10843j.m430f(network, "network");
                C10843j.m430f(security, "security");
                return new StreamSettingsBean(network, security, tcpSettingsBean, kcpSettingsBean, wsSettingsBean, httpSettingsBean, tlsSettingsBean, quicSettingBean, tlsSettingsBean2, grpcSettingsBean, obj, obj2);
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof StreamSettingsBean) {
                    StreamSettingsBean streamSettingsBean = (StreamSettingsBean) obj;
                    return C10843j.m435a(this.network, streamSettingsBean.network) && C10843j.m435a(this.security, streamSettingsBean.security) && C10843j.m435a(this.tcpSettings, streamSettingsBean.tcpSettings) && C10843j.m435a(this.kcpSettings, streamSettingsBean.kcpSettings) && C10843j.m435a(this.wsSettings, streamSettingsBean.wsSettings) && C10843j.m435a(this.httpSettings, streamSettingsBean.httpSettings) && C10843j.m435a(this.tlsSettings, streamSettingsBean.tlsSettings) && C10843j.m435a(this.quicSettings, streamSettingsBean.quicSettings) && C10843j.m435a(this.xtlsSettings, streamSettingsBean.xtlsSettings) && C10843j.m435a(this.grpcSettings, streamSettingsBean.grpcSettings) && C10843j.m435a(this.dsSettings, streamSettingsBean.dsSettings) && C10843j.m435a(this.sockopt, streamSettingsBean.sockopt);
                }
                return false;
            }

            @Nullable
            public final Object getDsSettings() {
                return this.dsSettings;
            }

            @Nullable
            public final GrpcSettingsBean getGrpcSettings() {
                return this.grpcSettings;
            }

            @Nullable
            public final HttpSettingsBean getHttpSettings() {
                return this.httpSettings;
            }

            @Nullable
            public final KcpSettingsBean getKcpSettings() {
                return this.kcpSettings;
            }

            @NotNull
            public final String getNetwork() {
                return this.network;
            }

            @Nullable
            public final QuicSettingBean getQuicSettings() {
                return this.quicSettings;
            }

            @NotNull
            public final String getSecurity() {
                return this.security;
            }

            @Nullable
            public final Object getSockopt() {
                return this.sockopt;
            }

            @Nullable
            public final TcpSettingsBean getTcpSettings() {
                return this.tcpSettings;
            }

            @Nullable
            public final TlsSettingsBean getTlsSettings() {
                return this.tlsSettings;
            }

            @Nullable
            public final WsSettingsBean getWsSettings() {
                return this.wsSettings;
            }

            @Nullable
            public final TlsSettingsBean getXtlsSettings() {
                return this.xtlsSettings;
            }

            public int hashCode() {
                int hashCode;
                int hashCode2;
                int hashCode3;
                int hashCode4;
                int hashCode5;
                int hashCode6;
                int hashCode7;
                int hashCode8;
                int hashCode9;
                int m12537a = C0406q1.m12537a(this.security, this.network.hashCode() * 31, 31);
                TcpSettingsBean tcpSettingsBean = this.tcpSettings;
                int i = 0;
                if (tcpSettingsBean == null) {
                    hashCode = 0;
                } else {
                    hashCode = tcpSettingsBean.hashCode();
                }
                int i2 = (m12537a + hashCode) * 31;
                KcpSettingsBean kcpSettingsBean = this.kcpSettings;
                if (kcpSettingsBean == null) {
                    hashCode2 = 0;
                } else {
                    hashCode2 = kcpSettingsBean.hashCode();
                }
                int i3 = (i2 + hashCode2) * 31;
                WsSettingsBean wsSettingsBean = this.wsSettings;
                if (wsSettingsBean == null) {
                    hashCode3 = 0;
                } else {
                    hashCode3 = wsSettingsBean.hashCode();
                }
                int i4 = (i3 + hashCode3) * 31;
                HttpSettingsBean httpSettingsBean = this.httpSettings;
                if (httpSettingsBean == null) {
                    hashCode4 = 0;
                } else {
                    hashCode4 = httpSettingsBean.hashCode();
                }
                int i5 = (i4 + hashCode4) * 31;
                TlsSettingsBean tlsSettingsBean = this.tlsSettings;
                if (tlsSettingsBean == null) {
                    hashCode5 = 0;
                } else {
                    hashCode5 = tlsSettingsBean.hashCode();
                }
                int i6 = (i5 + hashCode5) * 31;
                QuicSettingBean quicSettingBean = this.quicSettings;
                if (quicSettingBean == null) {
                    hashCode6 = 0;
                } else {
                    hashCode6 = quicSettingBean.hashCode();
                }
                int i7 = (i6 + hashCode6) * 31;
                TlsSettingsBean tlsSettingsBean2 = this.xtlsSettings;
                if (tlsSettingsBean2 == null) {
                    hashCode7 = 0;
                } else {
                    hashCode7 = tlsSettingsBean2.hashCode();
                }
                int i8 = (i7 + hashCode7) * 31;
                GrpcSettingsBean grpcSettingsBean = this.grpcSettings;
                if (grpcSettingsBean == null) {
                    hashCode8 = 0;
                } else {
                    hashCode8 = grpcSettingsBean.hashCode();
                }
                int i9 = (i8 + hashCode8) * 31;
                Object obj = this.dsSettings;
                if (obj == null) {
                    hashCode9 = 0;
                } else {
                    hashCode9 = obj.hashCode();
                }
                int i10 = (i9 + hashCode9) * 31;
                Object obj2 = this.sockopt;
                if (obj2 != null) {
                    i = obj2.hashCode();
                }
                return i10 + i;
            }

            public final void populateTlsSettings(@NotNull String streamSecurity, boolean z, @NotNull String sni) {
                C10843j.m430f(streamSecurity, "streamSecurity");
                C10843j.m430f(sni, "sni");
                this.security = streamSecurity;
                TlsSettingsBean tlsSettingsBean = new TlsSettingsBean(z, sni, null, null, null, null, null, null, null, null, null, 2044, null);
                if (C10843j.m435a(this.security, V2rayConfig.TLS)) {
                    this.tlsSettings = tlsSettingsBean;
                } else if (C10843j.m435a(this.security, V2rayConfig.XTLS)) {
                    this.xtlsSettings = tlsSettingsBean;
                }
            }

            /* JADX WARN: Code restructure failed: missing block: B:192:0x0064, code lost:
                if (r29.equals(libv2ray.V2rayConfig.HTTP) == false) goto L150;
             */
            /* JADX WARN: Code restructure failed: missing block: B:291:0x024a, code lost:
                if (r29.equals("h2") == false) goto L150;
             */
            /* JADX WARN: Code restructure failed: missing block: B:293:0x024e, code lost:
                r28.network = "h2";
                r1 = new libv2ray.V2rayConfig.OutboundBean.StreamSettingsBean.HttpSettingsBean(null, null, 3, null);
             */
            /* JADX WARN: Code restructure failed: missing block: B:294:0x0255, code lost:
                if (r31 != null) goto L50;
             */
            /* JADX WARN: Code restructure failed: missing block: B:295:0x0257, code lost:
                r2 = "";
             */
            /* JADX WARN: Code restructure failed: missing block: B:296:0x0259, code lost:
                r2 = r31;
             */
            /* JADX WARN: Code restructure failed: missing block: B:297:0x025b, code lost:
                r2 = kotlin.text.C10929r.m386F(r2, new java.lang.String[]{","});
                r3 = new java.util.ArrayList(kotlin.collections.C10753i.m482g(r2));
                r2 = r2.iterator();
             */
            /* JADX WARN: Code restructure failed: missing block: B:299:0x0276, code lost:
                if (r2.hasNext() == false) goto L26;
             */
            /* JADX WARN: Code restructure failed: missing block: B:300:0x0278, code lost:
                r3.add(kotlin.text.C10929r.m381K((java.lang.String) r2.next()).toString());
             */
            /* JADX WARN: Code restructure failed: missing block: B:301:0x028a, code lost:
                r2 = new java.util.ArrayList();
                r3 = r3.iterator();
             */
            /* JADX WARN: Code restructure failed: missing block: B:303:0x0297, code lost:
                if (r3.hasNext() == false) goto L40;
             */
            /* JADX WARN: Code restructure failed: missing block: B:304:0x0299, code lost:
                r4 = r3.next();
             */
            /* JADX WARN: Code restructure failed: missing block: B:305:0x02a4, code lost:
                if (((java.lang.String) r4).length() <= 0) goto L39;
             */
            /* JADX WARN: Code restructure failed: missing block: B:306:0x02a6, code lost:
                r7 = true;
             */
            /* JADX WARN: Code restructure failed: missing block: B:307:0x02a8, code lost:
                r7 = false;
             */
            /* JADX WARN: Code restructure failed: missing block: B:308:0x02a9, code lost:
                if (r7 == false) goto L38;
             */
            /* JADX WARN: Code restructure failed: missing block: B:309:0x02ab, code lost:
                r2.add(r4);
             */
            /* JADX WARN: Code restructure failed: missing block: B:310:0x02af, code lost:
                r1.setHost(r2);
                r2 = r1.getHost();
                kotlin.jvm.internal.C10843j.m430f(r2, "<this>");
             */
            /* JADX WARN: Code restructure failed: missing block: B:311:0x02bd, code lost:
                if (kotlin.collections.C10752h.m487b(r2) < 0) goto L44;
             */
            /* JADX WARN: Code restructure failed: missing block: B:312:0x02bf, code lost:
                r14 = r2.get(0);
             */
            /* JADX WARN: Code restructure failed: missing block: B:313:0x02c3, code lost:
                r14 = r14;
             */
            /* JADX WARN: Code restructure failed: missing block: B:314:0x02c5, code lost:
                if (r14 != null) goto L46;
             */
            /* JADX WARN: Code restructure failed: missing block: B:316:0x02c8, code lost:
                r15 = r14;
             */
            /* JADX WARN: Code restructure failed: missing block: B:317:0x02c9, code lost:
                if (r32 != null) goto L48;
             */
            /* JADX WARN: Code restructure failed: missing block: B:319:0x02cc, code lost:
                r6 = r32;
             */
            /* JADX WARN: Code restructure failed: missing block: B:320:0x02ce, code lost:
                r1.setPath(r6);
                r28.httpSettings = r1;
             */
            @org.jetbrains.annotations.NotNull
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.String populateTransportSettings(@org.jetbrains.annotations.NotNull java.lang.String r29, @org.jetbrains.annotations.Nullable java.lang.String r30, @org.jetbrains.annotations.Nullable java.lang.String r31, @org.jetbrains.annotations.Nullable java.lang.String r32, @org.jetbrains.annotations.Nullable java.lang.String r33, @org.jetbrains.annotations.Nullable java.lang.String r34, @org.jetbrains.annotations.Nullable java.lang.String r35, @org.jetbrains.annotations.Nullable java.lang.String r36, @org.jetbrains.annotations.Nullable java.lang.String r37) {
                /*
                    Method dump skipped, instructions count: 754
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: libv2ray.V2rayConfig.OutboundBean.StreamSettingsBean.populateTransportSettings(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):java.lang.String");
            }

            public final void setGrpcSettings(@Nullable GrpcSettingsBean grpcSettingsBean) {
                this.grpcSettings = grpcSettingsBean;
            }

            public final void setHttpSettings(@Nullable HttpSettingsBean httpSettingsBean) {
                this.httpSettings = httpSettingsBean;
            }

            public final void setKcpSettings(@Nullable KcpSettingsBean kcpSettingsBean) {
                this.kcpSettings = kcpSettingsBean;
            }

            public final void setNetwork(@NotNull String str) {
                C10843j.m430f(str, "<set-?>");
                this.network = str;
            }

            public final void setQuicSettings(@Nullable QuicSettingBean quicSettingBean) {
                this.quicSettings = quicSettingBean;
            }

            public final void setSecurity(@NotNull String str) {
                C10843j.m430f(str, "<set-?>");
                this.security = str;
            }

            public final void setTcpSettings(@Nullable TcpSettingsBean tcpSettingsBean) {
                this.tcpSettings = tcpSettingsBean;
            }

            public final void setTlsSettings(@Nullable TlsSettingsBean tlsSettingsBean) {
                this.tlsSettings = tlsSettingsBean;
            }

            public final void setWsSettings(@Nullable WsSettingsBean wsSettingsBean) {
                this.wsSettings = wsSettingsBean;
            }

            public final void setXtlsSettings(@Nullable TlsSettingsBean tlsSettingsBean) {
                this.xtlsSettings = tlsSettingsBean;
            }

            @NotNull
            public String toString() {
                return "StreamSettingsBean(network=" + this.network + ", security=" + this.security + ", tcpSettings=" + this.tcpSettings + ", kcpSettings=" + this.kcpSettings + ", wsSettings=" + this.wsSettings + ", httpSettings=" + this.httpSettings + ", tlsSettings=" + this.tlsSettings + ", quicSettings=" + this.quicSettings + ", xtlsSettings=" + this.xtlsSettings + ", grpcSettings=" + this.grpcSettings + ", dsSettings=" + this.dsSettings + ", sockopt=" + this.sockopt + ')';
            }
        }

        public OutboundBean(@NotNull String tag, @NotNull String protocol, @Nullable OutSettingsBean outSettingsBean, @Nullable StreamSettingsBean streamSettingsBean, @Nullable Object obj, @Nullable String str, @Nullable MuxBean muxBean) {
            C10843j.m430f(tag, "tag");
            C10843j.m430f(protocol, "protocol");
            this.tag = tag;
            this.protocol = protocol;
            this.settings = outSettingsBean;
            this.streamSettings = streamSettingsBean;
            this.proxySettings = obj;
            this.sendThrough = str;
            this.mux = muxBean;
        }

        public /* synthetic */ OutboundBean(String str, String str2, OutSettingsBean outSettingsBean, StreamSettingsBean streamSettingsBean, Object obj, String str3, MuxBean muxBean, int i, C10839f c10839f) {
            this((i & 1) != 0 ? "proxy" : str, str2, (i & 4) != 0 ? null : outSettingsBean, (i & 8) != 0 ? null : streamSettingsBean, (i & 16) != 0 ? null : obj, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? new MuxBean(false, 0, 2, null) : muxBean);
        }

        public static /* synthetic */ OutboundBean copy$default(OutboundBean outboundBean, String str, String str2, OutSettingsBean outSettingsBean, StreamSettingsBean streamSettingsBean, Object obj, String str3, MuxBean muxBean, int i, Object obj2) {
            if ((i & 1) != 0) {
                str = outboundBean.tag;
            }
            if ((i & 2) != 0) {
                str2 = outboundBean.protocol;
            }
            String str4 = str2;
            if ((i & 4) != 0) {
                outSettingsBean = outboundBean.settings;
            }
            OutSettingsBean outSettingsBean2 = outSettingsBean;
            if ((i & 8) != 0) {
                streamSettingsBean = outboundBean.streamSettings;
            }
            StreamSettingsBean streamSettingsBean2 = streamSettingsBean;
            if ((i & 16) != 0) {
                obj = outboundBean.proxySettings;
            }
            Object obj3 = obj;
            if ((i & 32) != 0) {
                str3 = outboundBean.sendThrough;
            }
            String str5 = str3;
            if ((i & 64) != 0) {
                muxBean = outboundBean.mux;
            }
            return outboundBean.copy(str, str4, outSettingsBean2, streamSettingsBean2, obj3, str5, muxBean);
        }

        @NotNull
        public final String component1() {
            return this.tag;
        }

        @NotNull
        public final String component2() {
            return this.protocol;
        }

        @Nullable
        public final OutSettingsBean component3() {
            return this.settings;
        }

        @Nullable
        public final StreamSettingsBean component4() {
            return this.streamSettings;
        }

        @Nullable
        public final Object component5() {
            return this.proxySettings;
        }

        @Nullable
        public final String component6() {
            return this.sendThrough;
        }

        @Nullable
        public final MuxBean component7() {
            return this.mux;
        }

        @NotNull
        public final OutboundBean copy(@NotNull String tag, @NotNull String protocol, @Nullable OutSettingsBean outSettingsBean, @Nullable StreamSettingsBean streamSettingsBean, @Nullable Object obj, @Nullable String str, @Nullable MuxBean muxBean) {
            C10843j.m430f(tag, "tag");
            C10843j.m430f(protocol, "protocol");
            return new OutboundBean(tag, protocol, outSettingsBean, streamSettingsBean, obj, str, muxBean);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof OutboundBean) {
                OutboundBean outboundBean = (OutboundBean) obj;
                return C10843j.m435a(this.tag, outboundBean.tag) && C10843j.m435a(this.protocol, outboundBean.protocol) && C10843j.m435a(this.settings, outboundBean.settings) && C10843j.m435a(this.streamSettings, outboundBean.streamSettings) && C10843j.m435a(this.proxySettings, outboundBean.proxySettings) && C10843j.m435a(this.sendThrough, outboundBean.sendThrough) && C10843j.m435a(this.mux, outboundBean.mux);
            }
            return false;
        }

        @Nullable
        public final MuxBean getMux() {
            return this.mux;
        }

        @Nullable
        public final String getPassword() {
            List<OutSettingsBean.VnextBean> vnext;
            OutSettingsBean.VnextBean vnextBean;
            List<OutSettingsBean.VnextBean.UsersBean> users;
            OutSettingsBean.VnextBean.UsersBean usersBean;
            List<OutSettingsBean.ServersBean> servers;
            OutSettingsBean.ServersBean serversBean;
            OutSettingsBean outSettingsBean;
            List<OutSettingsBean.ServersBean> servers2;
            OutSettingsBean.ServersBean serversBean2;
            List<OutSettingsBean.ServersBean.SocksUsersBean> users2;
            OutSettingsBean.ServersBean.SocksUsersBean socksUsersBean;
            if (C10925n.m398e(this.protocol, "VMESS") || C10925n.m398e(this.protocol, "VLESS")) {
                OutSettingsBean outSettingsBean2 = this.settings;
                if (outSettingsBean2 == null || (vnext = outSettingsBean2.getVnext()) == null || (vnextBean = vnext.get(0)) == null || (users = vnextBean.getUsers()) == null || (usersBean = users.get(0)) == null) {
                    return null;
                }
                return usersBean.getId();
            } else if (C10925n.m398e(this.protocol, "SHADOWSOCKS") || C10925n.m398e(this.protocol, "TROJAN")) {
                OutSettingsBean outSettingsBean3 = this.settings;
                if (outSettingsBean3 == null || (servers = outSettingsBean3.getServers()) == null || (serversBean = servers.get(0)) == null) {
                    return null;
                }
                return serversBean.getPassword();
            } else if (!C10925n.m398e(this.protocol, "SOCKS") || (outSettingsBean = this.settings) == null || (servers2 = outSettingsBean.getServers()) == null || (serversBean2 = servers2.get(0)) == null || (users2 = serversBean2.getUsers()) == null || (socksUsersBean = users2.get(0)) == null) {
                return null;
            } else {
                return socksUsersBean.getPass();
            }
        }

        @NotNull
        public final String getProtocol() {
            return this.protocol;
        }

        @Nullable
        public final Object getProxySettings() {
            return this.proxySettings;
        }

        @Nullable
        public final String getSecurityEncryption() {
            OutSettingsBean outSettingsBean;
            List<OutSettingsBean.ServersBean> servers;
            OutSettingsBean.ServersBean serversBean;
            List<OutSettingsBean.VnextBean> vnext;
            OutSettingsBean.VnextBean vnextBean;
            List<OutSettingsBean.VnextBean.UsersBean> users;
            OutSettingsBean.VnextBean.UsersBean usersBean;
            List<OutSettingsBean.VnextBean> vnext2;
            OutSettingsBean.VnextBean vnextBean2;
            List<OutSettingsBean.VnextBean.UsersBean> users2;
            OutSettingsBean.VnextBean.UsersBean usersBean2;
            if (C10925n.m398e(this.protocol, "VMESS")) {
                OutSettingsBean outSettingsBean2 = this.settings;
                if (outSettingsBean2 != null && (vnext2 = outSettingsBean2.getVnext()) != null && (vnextBean2 = vnext2.get(0)) != null && (users2 = vnextBean2.getUsers()) != null && (usersBean2 = users2.get(0)) != null) {
                    return usersBean2.getSecurity();
                }
            } else if (C10925n.m398e(this.protocol, "VLESS")) {
                OutSettingsBean outSettingsBean3 = this.settings;
                if (outSettingsBean3 != null && (vnext = outSettingsBean3.getVnext()) != null && (vnextBean = vnext.get(0)) != null && (users = vnextBean.getUsers()) != null && (usersBean = users.get(0)) != null) {
                    return usersBean.getEncryption();
                }
            } else if (C10925n.m398e(this.protocol, "SHADOWSOCKS") && (outSettingsBean = this.settings) != null && (servers = outSettingsBean.getServers()) != null && (serversBean = servers.get(0)) != null) {
                return serversBean.getMethod();
            }
            return null;
        }

        @Nullable
        public final String getSendThrough() {
            return this.sendThrough;
        }

        @Nullable
        public final String getServerAddress() {
            List<OutSettingsBean.VnextBean> vnext;
            OutSettingsBean.VnextBean vnextBean;
            OutSettingsBean outSettingsBean;
            List<OutSettingsBean.ServersBean> servers;
            OutSettingsBean.ServersBean serversBean;
            if (C10925n.m398e(this.protocol, "VMESS") || C10925n.m398e(this.protocol, "VLESS")) {
                OutSettingsBean outSettingsBean2 = this.settings;
                if (outSettingsBean2 == null || (vnext = outSettingsBean2.getVnext()) == null || (vnextBean = vnext.get(0)) == null) {
                    return null;
                }
                return vnextBean.getAddress();
            } else if ((!C10925n.m398e(this.protocol, "SHADOWSOCKS") && !C10925n.m398e(this.protocol, "SOCKS") && !C10925n.m398e(this.protocol, "TROJAN")) || (outSettingsBean = this.settings) == null || (servers = outSettingsBean.getServers()) == null || (serversBean = servers.get(0)) == null) {
                return null;
            } else {
                return serversBean.getAddress();
            }
        }

        @Nullable
        public final Integer getServerPort() {
            List<OutSettingsBean.VnextBean> vnext;
            OutSettingsBean.VnextBean vnextBean;
            OutSettingsBean outSettingsBean;
            List<OutSettingsBean.ServersBean> servers;
            OutSettingsBean.ServersBean serversBean;
            if (C10925n.m398e(this.protocol, "VMESS") || C10925n.m398e(this.protocol, "VLESS")) {
                OutSettingsBean outSettingsBean2 = this.settings;
                if (outSettingsBean2 == null || (vnext = outSettingsBean2.getVnext()) == null || (vnextBean = vnext.get(0)) == null) {
                    return null;
                }
                return Integer.valueOf(vnextBean.getPort());
            } else if ((!C10925n.m398e(this.protocol, "SHADOWSOCKS") && !C10925n.m398e(this.protocol, "SOCKS") && !C10925n.m398e(this.protocol, "TROJAN")) || (outSettingsBean = this.settings) == null || (servers = outSettingsBean.getServers()) == null || (serversBean = servers.get(0)) == null) {
                return null;
            } else {
                return Integer.valueOf(serversBean.getPort());
            }
        }

        @Nullable
        public final OutSettingsBean getSettings() {
            return this.settings;
        }

        @Nullable
        public final StreamSettingsBean getStreamSettings() {
            return this.streamSettings;
        }

        @NotNull
        public final String getTag() {
            return this.tag;
        }

        @Nullable
        public final List<String> getTransportSettingDetails() {
            StreamSettingsBean streamSettingsBean;
            String network;
            StreamSettingsBean streamSettingsBean2;
            StreamSettingsBean.HttpSettingsBean httpSettings;
            StreamSettingsBean streamSettingsBean3;
            StreamSettingsBean.WsSettingsBean wsSettings;
            StreamSettingsBean streamSettingsBean4;
            StreamSettingsBean.KcpSettingsBean kcpSettings;
            StreamSettingsBean streamSettingsBean5;
            StreamSettingsBean.TcpSettingsBean tcpSettings;
            List<String> path;
            StreamSettingsBean.TcpSettingsBean.HeaderBean.RequestBean.HeadersBean headers;
            List<String> host;
            StreamSettingsBean streamSettingsBean6;
            StreamSettingsBean.GrpcSettingsBean grpcSettings;
            StreamSettingsBean streamSettingsBean7;
            StreamSettingsBean.QuicSettingBean quicSettings;
            String str = null;
            if ((!C10925n.m398e(this.protocol, "VMESS") && !C10925n.m398e(this.protocol, "VLESS")) || (streamSettingsBean = this.streamSettings) == null || (network = streamSettingsBean.getNetwork()) == null) {
                return null;
            }
            switch (network.hashCode()) {
                case 3274:
                    if (!network.equals("h2") || (streamSettingsBean2 = this.streamSettings) == null || (httpSettings = streamSettingsBean2.getHttpSettings()) == null) {
                        return null;
                    }
                    return C10752h.m485d("", C10757m.m475n(httpSettings.getHost(), null, null, null, null, 63), httpSettings.getPath());
                case 3804:
                    if (!network.equals("ws") || (streamSettingsBean3 = this.streamSettings) == null || (wsSettings = streamSettingsBean3.getWsSettings()) == null) {
                        return null;
                    }
                    return C10752h.m485d("", wsSettings.getHeaders().getHost(), wsSettings.getPath());
                case 106008:
                    if (!network.equals("kcp") || (streamSettingsBean4 = this.streamSettings) == null || (kcpSettings = streamSettingsBean4.getKcpSettings()) == null) {
                        return null;
                    }
                    String[] strArr = new String[3];
                    strArr[0] = kcpSettings.getHeader().getType();
                    strArr[1] = "";
                    String seed = kcpSettings.getSeed();
                    strArr[2] = seed != null ? seed : "";
                    return C10752h.m485d(strArr);
                case 114657:
                    if (!network.equals(V2rayConfig.DEFAULT_NETWORK) || (streamSettingsBean5 = this.streamSettings) == null || (tcpSettings = streamSettingsBean5.getTcpSettings()) == null) {
                        return null;
                    }
                    String[] strArr2 = new String[3];
                    strArr2[0] = tcpSettings.getHeader().getType();
                    StreamSettingsBean.TcpSettingsBean.HeaderBean.RequestBean request = tcpSettings.getHeader().getRequest();
                    String m475n = (request == null || (headers = request.getHeaders()) == null || (host = headers.getHost()) == null) ? null : C10757m.m475n(host, null, null, null, null, 63);
                    if (m475n == null) {
                        m475n = "";
                    }
                    strArr2[1] = m475n;
                    StreamSettingsBean.TcpSettingsBean.HeaderBean.RequestBean request2 = tcpSettings.getHeader().getRequest();
                    if (request2 != null && (path = request2.getPath()) != null) {
                        str = C10757m.m475n(path, null, null, null, null, 63);
                    }
                    strArr2[2] = str != null ? str : "";
                    return C10752h.m485d(strArr2);
                case 3181598:
                    if (!network.equals("grpc") || (streamSettingsBean6 = this.streamSettings) == null || (grpcSettings = streamSettingsBean6.getGrpcSettings()) == null) {
                        return null;
                    }
                    String[] strArr3 = new String[3];
                    strArr3[0] = C10843j.m435a(grpcSettings.getMultiMode(), Boolean.TRUE) ? "multi" : "gun";
                    strArr3[1] = "";
                    strArr3[2] = grpcSettings.getServiceName();
                    return C10752h.m485d(strArr3);
                case 3482174:
                    if (!network.equals("quic") || (streamSettingsBean7 = this.streamSettings) == null || (quicSettings = streamSettingsBean7.getQuicSettings()) == null) {
                        return null;
                    }
                    return C10752h.m485d(quicSettings.getHeader().getType(), quicSettings.getSecurity(), quicSettings.getKey());
                default:
                    return null;
            }
        }

        public int hashCode() {
            int hashCode;
            int hashCode2;
            int hashCode3;
            int hashCode4;
            int m12537a = C0406q1.m12537a(this.protocol, this.tag.hashCode() * 31, 31);
            OutSettingsBean outSettingsBean = this.settings;
            int i = 0;
            if (outSettingsBean == null) {
                hashCode = 0;
            } else {
                hashCode = outSettingsBean.hashCode();
            }
            int i2 = (m12537a + hashCode) * 31;
            StreamSettingsBean streamSettingsBean = this.streamSettings;
            if (streamSettingsBean == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = streamSettingsBean.hashCode();
            }
            int i3 = (i2 + hashCode2) * 31;
            Object obj = this.proxySettings;
            if (obj == null) {
                hashCode3 = 0;
            } else {
                hashCode3 = obj.hashCode();
            }
            int i4 = (i3 + hashCode3) * 31;
            String str = this.sendThrough;
            if (str == null) {
                hashCode4 = 0;
            } else {
                hashCode4 = str.hashCode();
            }
            int i5 = (i4 + hashCode4) * 31;
            MuxBean muxBean = this.mux;
            if (muxBean != null) {
                i = muxBean.hashCode();
            }
            return i5 + i;
        }

        public final void setProtocol(@NotNull String str) {
            C10843j.m430f(str, "<set-?>");
            this.protocol = str;
        }

        public final void setSettings(@Nullable OutSettingsBean outSettingsBean) {
            this.settings = outSettingsBean;
        }

        public final void setStreamSettings(@Nullable StreamSettingsBean streamSettingsBean) {
            this.streamSettings = streamSettingsBean;
        }

        @NotNull
        public String toString() {
            return "OutboundBean(tag=" + this.tag + ", protocol=" + this.protocol + ", settings=" + this.settings + ", streamSettings=" + this.streamSettings + ", proxySettings=" + this.proxySettings + ", sendThrough=" + this.sendThrough + ", mux=" + this.mux + ')';
        }
    }

    @Metadata(m509d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0019B%\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0001¢\u0006\u0002\u0010\u0007J\u0015\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÆ\u0003J+\u0010\u0012\u001a\u00020\u00002\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0004HÖ\u0001R&\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0001X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, m508d2 = {"Llibv2ray/V2rayConfig$PolicyBean;", "", "levels", "", "", "Llibv2ray/V2rayConfig$PolicyBean$LevelBean;", "system", "(Ljava/util/Map;Ljava/lang/Object;)V", "getLevels", "()Ljava/util/Map;", "setLevels", "(Ljava/util/Map;)V", "getSystem", "()Ljava/lang/Object;", "setSystem", "(Ljava/lang/Object;)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "LevelBean", "app_release"}, m507k = 1, m506mv = {1, 8, 0}, m504xi = 48)
    /* loaded from: classes3.dex */
    public static final class PolicyBean {
        @NotNull
        private Map<String, LevelBean> levels;
        @Nullable
        private Object system;

        @Metadata(m509d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b!\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BY\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\rJ\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\rJ\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\rJ\u0010\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\rJ\u0010\u0010!\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0018J\u0010\u0010\"\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0018J\u0010\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\rJb\u0010$\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010%J\u0013\u0010&\u001a\u00020\b2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020\u0003HÖ\u0001J\t\u0010)\u001a\u00020*HÖ\u0001R\u001e\u0010\n\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\u0013\u0010\r\"\u0004\b\u0014\u0010\u000fR\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\u0015\u0010\r\"\u0004\b\u0016\u0010\u000fR\u0015\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u001a\u0010\u0018R\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\u001b\u0010\r\"\u0004\b\u001c\u0010\u000f¨\u0006+"}, m508d2 = {"Llibv2ray/V2rayConfig$PolicyBean$LevelBean;", "", "handshake", "", "connIdle", "uplinkOnly", "downlinkOnly", "statsUserUplink", "", "statsUserDownlink", "bufferSize", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;)V", "getBufferSize", "()Ljava/lang/Integer;", "setBufferSize", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getConnIdle", "setConnIdle", "getDownlinkOnly", "setDownlinkOnly", "getHandshake", "setHandshake", "getStatsUserDownlink", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getStatsUserUplink", "getUplinkOnly", "setUplinkOnly", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;)Llibv2ray/V2rayConfig$PolicyBean$LevelBean;", "equals", "other", "hashCode", "toString", "", "app_release"}, m507k = 1, m506mv = {1, 8, 0}, m504xi = 48)
        /* loaded from: classes3.dex */
        public static final class LevelBean {
            @Nullable
            private Integer bufferSize;
            @Nullable
            private Integer connIdle;
            @Nullable
            private Integer downlinkOnly;
            @Nullable
            private Integer handshake;
            @Nullable
            private final Boolean statsUserDownlink;
            @Nullable
            private final Boolean statsUserUplink;
            @Nullable
            private Integer uplinkOnly;

            public LevelBean() {
                this(null, null, null, null, null, null, null, 127, null);
            }

            public LevelBean(@Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Integer num5) {
                this.handshake = num;
                this.connIdle = num2;
                this.uplinkOnly = num3;
                this.downlinkOnly = num4;
                this.statsUserUplink = bool;
                this.statsUserDownlink = bool2;
                this.bufferSize = num5;
            }

            public /* synthetic */ LevelBean(Integer num, Integer num2, Integer num3, Integer num4, Boolean bool, Boolean bool2, Integer num5, int i, C10839f c10839f) {
                this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? null : num3, (i & 8) != 0 ? null : num4, (i & 16) != 0 ? null : bool, (i & 32) != 0 ? null : bool2, (i & 64) != 0 ? null : num5);
            }

            public static /* synthetic */ LevelBean copy$default(LevelBean levelBean, Integer num, Integer num2, Integer num3, Integer num4, Boolean bool, Boolean bool2, Integer num5, int i, Object obj) {
                if ((i & 1) != 0) {
                    num = levelBean.handshake;
                }
                if ((i & 2) != 0) {
                    num2 = levelBean.connIdle;
                }
                Integer num6 = num2;
                if ((i & 4) != 0) {
                    num3 = levelBean.uplinkOnly;
                }
                Integer num7 = num3;
                if ((i & 8) != 0) {
                    num4 = levelBean.downlinkOnly;
                }
                Integer num8 = num4;
                if ((i & 16) != 0) {
                    bool = levelBean.statsUserUplink;
                }
                Boolean bool3 = bool;
                if ((i & 32) != 0) {
                    bool2 = levelBean.statsUserDownlink;
                }
                Boolean bool4 = bool2;
                if ((i & 64) != 0) {
                    num5 = levelBean.bufferSize;
                }
                return levelBean.copy(num, num6, num7, num8, bool3, bool4, num5);
            }

            @Nullable
            public final Integer component1() {
                return this.handshake;
            }

            @Nullable
            public final Integer component2() {
                return this.connIdle;
            }

            @Nullable
            public final Integer component3() {
                return this.uplinkOnly;
            }

            @Nullable
            public final Integer component4() {
                return this.downlinkOnly;
            }

            @Nullable
            public final Boolean component5() {
                return this.statsUserUplink;
            }

            @Nullable
            public final Boolean component6() {
                return this.statsUserDownlink;
            }

            @Nullable
            public final Integer component7() {
                return this.bufferSize;
            }

            @NotNull
            public final LevelBean copy(@Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Integer num5) {
                return new LevelBean(num, num2, num3, num4, bool, bool2, num5);
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof LevelBean) {
                    LevelBean levelBean = (LevelBean) obj;
                    return C10843j.m435a(this.handshake, levelBean.handshake) && C10843j.m435a(this.connIdle, levelBean.connIdle) && C10843j.m435a(this.uplinkOnly, levelBean.uplinkOnly) && C10843j.m435a(this.downlinkOnly, levelBean.downlinkOnly) && C10843j.m435a(this.statsUserUplink, levelBean.statsUserUplink) && C10843j.m435a(this.statsUserDownlink, levelBean.statsUserDownlink) && C10843j.m435a(this.bufferSize, levelBean.bufferSize);
                }
                return false;
            }

            @Nullable
            public final Integer getBufferSize() {
                return this.bufferSize;
            }

            @Nullable
            public final Integer getConnIdle() {
                return this.connIdle;
            }

            @Nullable
            public final Integer getDownlinkOnly() {
                return this.downlinkOnly;
            }

            @Nullable
            public final Integer getHandshake() {
                return this.handshake;
            }

            @Nullable
            public final Boolean getStatsUserDownlink() {
                return this.statsUserDownlink;
            }

            @Nullable
            public final Boolean getStatsUserUplink() {
                return this.statsUserUplink;
            }

            @Nullable
            public final Integer getUplinkOnly() {
                return this.uplinkOnly;
            }

            public int hashCode() {
                Integer num = this.handshake;
                int hashCode = (num == null ? 0 : num.hashCode()) * 31;
                Integer num2 = this.connIdle;
                int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
                Integer num3 = this.uplinkOnly;
                int hashCode3 = (hashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
                Integer num4 = this.downlinkOnly;
                int hashCode4 = (hashCode3 + (num4 == null ? 0 : num4.hashCode())) * 31;
                Boolean bool = this.statsUserUplink;
                int hashCode5 = (hashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
                Boolean bool2 = this.statsUserDownlink;
                int hashCode6 = (hashCode5 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
                Integer num5 = this.bufferSize;
                return hashCode6 + (num5 != null ? num5.hashCode() : 0);
            }

            public final void setBufferSize(@Nullable Integer num) {
                this.bufferSize = num;
            }

            public final void setConnIdle(@Nullable Integer num) {
                this.connIdle = num;
            }

            public final void setDownlinkOnly(@Nullable Integer num) {
                this.downlinkOnly = num;
            }

            public final void setHandshake(@Nullable Integer num) {
                this.handshake = num;
            }

            public final void setUplinkOnly(@Nullable Integer num) {
                this.uplinkOnly = num;
            }

            @NotNull
            public String toString() {
                return "LevelBean(handshake=" + this.handshake + ", connIdle=" + this.connIdle + ", uplinkOnly=" + this.uplinkOnly + ", downlinkOnly=" + this.downlinkOnly + ", statsUserUplink=" + this.statsUserUplink + ", statsUserDownlink=" + this.statsUserDownlink + ", bufferSize=" + this.bufferSize + ')';
            }
        }

        public PolicyBean(@NotNull Map<String, LevelBean> levels, @Nullable Object obj) {
            C10843j.m430f(levels, "levels");
            this.levels = levels;
            this.system = obj;
        }

        public /* synthetic */ PolicyBean(Map map, Object obj, int i, C10839f c10839f) {
            this(map, (i & 2) != 0 ? null : obj);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ PolicyBean copy$default(PolicyBean policyBean, Map map, Object obj, int i, Object obj2) {
            if ((i & 1) != 0) {
                map = policyBean.levels;
            }
            if ((i & 2) != 0) {
                obj = policyBean.system;
            }
            return policyBean.copy(map, obj);
        }

        @NotNull
        public final Map<String, LevelBean> component1() {
            return this.levels;
        }

        @Nullable
        public final Object component2() {
            return this.system;
        }

        @NotNull
        public final PolicyBean copy(@NotNull Map<String, LevelBean> levels, @Nullable Object obj) {
            C10843j.m430f(levels, "levels");
            return new PolicyBean(levels, obj);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof PolicyBean) {
                PolicyBean policyBean = (PolicyBean) obj;
                return C10843j.m435a(this.levels, policyBean.levels) && C10843j.m435a(this.system, policyBean.system);
            }
            return false;
        }

        @NotNull
        public final Map<String, LevelBean> getLevels() {
            return this.levels;
        }

        @Nullable
        public final Object getSystem() {
            return this.system;
        }

        public int hashCode() {
            int hashCode = this.levels.hashCode() * 31;
            Object obj = this.system;
            return hashCode + (obj == null ? 0 : obj.hashCode());
        }

        public final void setLevels(@NotNull Map<String, LevelBean> map) {
            C10843j.m430f(map, "<set-?>");
            this.levels = map;
        }

        public final void setSystem(@Nullable Object obj) {
            this.system = obj;
        }

        @NotNull
        public String toString() {
            return "PolicyBean(levels=" + this.levels + ", system=" + this.system + ')';
        }
    }

    @Metadata(m509d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0001#BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\b\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\n¢\u0006\u0002\u0010\u000bJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0019\u0010\u001a\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\bHÆ\u0003J\u0011\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\nHÆ\u0003JK\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0018\b\u0002\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\b2\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001R\u0019\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000f\"\u0004\b\u0013\u0010\u0011R*\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006$"}, m508d2 = {"Llibv2ray/V2rayConfig$RoutingBean;", "", "domainStrategy", "", "domainMatcher", "rules", "Ljava/util/ArrayList;", "Llibv2ray/V2rayConfig$RoutingBean$RulesBean;", "Lkotlin/collections/ArrayList;", "balancers", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/List;)V", "getBalancers", "()Ljava/util/List;", "getDomainMatcher", "()Ljava/lang/String;", "setDomainMatcher", "(Ljava/lang/String;)V", "getDomainStrategy", "setDomainStrategy", "getRules", "()Ljava/util/ArrayList;", "setRules", "(Ljava/util/ArrayList;)V", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "RulesBean", "app_release"}, m507k = 1, m506mv = {1, 8, 0}, m504xi = 48)
    /* loaded from: classes3.dex */
    public static final class RoutingBean {
        @Nullable
        private final List<Object> balancers;
        @Nullable
        private String domainMatcher;
        @NotNull
        private String domainStrategy;
        @NotNull
        private ArrayList<RulesBean> rules;

        @Metadata(m509d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b1\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001Bå\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u001c\b\u0002\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00020\u0003\u0018\u0001`\u0006\u0012\u001c\b\u0002\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00020\u0003\u0018\u0001`\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000e\u0012\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000e\u0012\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000e\u0012\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0014J\t\u00100\u001a\u00020\u0003HÆ\u0003J\u0011\u00101\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000eHÆ\u0003J\u0011\u00102\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000eHÆ\u0003J\u0011\u00103\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000eHÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001d\u00106\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00020\u0003\u0018\u0001`\u0006HÆ\u0003J\u001d\u00107\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00020\u0003\u0018\u0001`\u0006HÆ\u0003J\t\u00108\u001a\u00020\u0003HÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010=\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000eHÆ\u0003Jé\u0001\u0010>\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u001c\b\u0002\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00020\u0003\u0018\u0001`\u00062\u001c\b\u0002\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00020\u0003\u0018\u0001`\u00062\b\b\u0002\u0010\b\u001a\u00020\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000e2\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000e2\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000e2\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000e2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010?\u001a\u00020@2\b\u0010A\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010B\u001a\u00020CHÖ\u0001J\t\u0010D\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0016\"\u0004\b\u0018\u0010\u0019R.\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00020\u0003\u0018\u0001`\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0016R\"\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R.\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00020\u0003\u0018\u0001`\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u001b\"\u0004\b$\u0010\u001dR\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0016R\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0016\"\u0004\b'\u0010\u0019R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0016\"\u0004\b)\u0010\u0019R\u0019\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b*\u0010 R\u0019\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b+\u0010 R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u0016\"\u0004\b.\u0010\u0019R\u0019\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b/\u0010 ¨\u0006E"}, m508d2 = {"Llibv2ray/V2rayConfig$RoutingBean$RulesBean;", "", "type", "", "ip", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "domain", "outboundTag", "balancerTag", "port", "sourcePort", "network", FirebaseAnalytics.Param.SOURCE, "", "user", "inboundTag", "protocol", "attrs", "domainMatcher", "(Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "getAttrs", "()Ljava/lang/String;", "getBalancerTag", "setBalancerTag", "(Ljava/lang/String;)V", "getDomain", "()Ljava/util/ArrayList;", "setDomain", "(Ljava/util/ArrayList;)V", "getDomainMatcher", "getInboundTag", "()Ljava/util/List;", "setInboundTag", "(Ljava/util/List;)V", "getIp", "setIp", "getNetwork", "getOutboundTag", "setOutboundTag", "getPort", "setPort", "getProtocol", "getSource", "getSourcePort", "getType", "setType", "getUser", "component1", "component10", "component11", "component12", "component13", "component14", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, m507k = 1, m506mv = {1, 8, 0}, m504xi = 48)
        /* loaded from: classes3.dex */
        public static final class RulesBean {
            @Nullable
            private final String attrs;
            @Nullable
            private String balancerTag;
            @Nullable
            private ArrayList<String> domain;
            @Nullable
            private final String domainMatcher;
            @Nullable
            private List<String> inboundTag;
            @Nullable

            /* renamed from: ip */
            private ArrayList<String> f21821ip;
            @Nullable
            private final String network;
            @NotNull
            private String outboundTag;
            @Nullable
            private String port;
            @Nullable
            private final List<String> protocol;
            @Nullable
            private final List<String> source;
            @Nullable
            private final String sourcePort;
            @NotNull
            private String type;
            @Nullable
            private final List<String> user;

            public RulesBean() {
                this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16383, null);
            }

            public RulesBean(@NotNull String type, @Nullable ArrayList<String> arrayList, @Nullable ArrayList<String> arrayList2, @NotNull String outboundTag, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable List<String> list, @Nullable List<String> list2, @Nullable List<String> list3, @Nullable List<String> list4, @Nullable String str5, @Nullable String str6) {
                C10843j.m430f(type, "type");
                C10843j.m430f(outboundTag, "outboundTag");
                this.type = type;
                this.f21821ip = arrayList;
                this.domain = arrayList2;
                this.outboundTag = outboundTag;
                this.balancerTag = str;
                this.port = str2;
                this.sourcePort = str3;
                this.network = str4;
                this.source = list;
                this.user = list2;
                this.inboundTag = list3;
                this.protocol = list4;
                this.attrs = str5;
                this.domainMatcher = str6;
            }

            public /* synthetic */ RulesBean(String str, ArrayList arrayList, ArrayList arrayList2, String str2, String str3, String str4, String str5, String str6, List list, List list2, List list3, List list4, String str7, String str8, int i, C10839f c10839f) {
                this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : arrayList, (i & 4) != 0 ? null : arrayList2, (i & 8) == 0 ? str2 : "", (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : str5, (i & 128) != 0 ? null : str6, (i & 256) != 0 ? null : list, (i & AdRequest.MAX_CONTENT_URL_LENGTH) != 0 ? null : list2, (i & 1024) != 0 ? null : list3, (i & 2048) != 0 ? null : list4, (i & 4096) != 0 ? null : str7, (i & 8192) == 0 ? str8 : null);
            }

            @NotNull
            public final String component1() {
                return this.type;
            }

            @Nullable
            public final List<String> component10() {
                return this.user;
            }

            @Nullable
            public final List<String> component11() {
                return this.inboundTag;
            }

            @Nullable
            public final List<String> component12() {
                return this.protocol;
            }

            @Nullable
            public final String component13() {
                return this.attrs;
            }

            @Nullable
            public final String component14() {
                return this.domainMatcher;
            }

            @Nullable
            public final ArrayList<String> component2() {
                return this.f21821ip;
            }

            @Nullable
            public final ArrayList<String> component3() {
                return this.domain;
            }

            @NotNull
            public final String component4() {
                return this.outboundTag;
            }

            @Nullable
            public final String component5() {
                return this.balancerTag;
            }

            @Nullable
            public final String component6() {
                return this.port;
            }

            @Nullable
            public final String component7() {
                return this.sourcePort;
            }

            @Nullable
            public final String component8() {
                return this.network;
            }

            @Nullable
            public final List<String> component9() {
                return this.source;
            }

            @NotNull
            public final RulesBean copy(@NotNull String type, @Nullable ArrayList<String> arrayList, @Nullable ArrayList<String> arrayList2, @NotNull String outboundTag, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable List<String> list, @Nullable List<String> list2, @Nullable List<String> list3, @Nullable List<String> list4, @Nullable String str5, @Nullable String str6) {
                C10843j.m430f(type, "type");
                C10843j.m430f(outboundTag, "outboundTag");
                return new RulesBean(type, arrayList, arrayList2, outboundTag, str, str2, str3, str4, list, list2, list3, list4, str5, str6);
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof RulesBean) {
                    RulesBean rulesBean = (RulesBean) obj;
                    return C10843j.m435a(this.type, rulesBean.type) && C10843j.m435a(this.f21821ip, rulesBean.f21821ip) && C10843j.m435a(this.domain, rulesBean.domain) && C10843j.m435a(this.outboundTag, rulesBean.outboundTag) && C10843j.m435a(this.balancerTag, rulesBean.balancerTag) && C10843j.m435a(this.port, rulesBean.port) && C10843j.m435a(this.sourcePort, rulesBean.sourcePort) && C10843j.m435a(this.network, rulesBean.network) && C10843j.m435a(this.source, rulesBean.source) && C10843j.m435a(this.user, rulesBean.user) && C10843j.m435a(this.inboundTag, rulesBean.inboundTag) && C10843j.m435a(this.protocol, rulesBean.protocol) && C10843j.m435a(this.attrs, rulesBean.attrs) && C10843j.m435a(this.domainMatcher, rulesBean.domainMatcher);
                }
                return false;
            }

            @Nullable
            public final String getAttrs() {
                return this.attrs;
            }

            @Nullable
            public final String getBalancerTag() {
                return this.balancerTag;
            }

            @Nullable
            public final ArrayList<String> getDomain() {
                return this.domain;
            }

            @Nullable
            public final String getDomainMatcher() {
                return this.domainMatcher;
            }

            @Nullable
            public final List<String> getInboundTag() {
                return this.inboundTag;
            }

            @Nullable
            public final ArrayList<String> getIp() {
                return this.f21821ip;
            }

            @Nullable
            public final String getNetwork() {
                return this.network;
            }

            @NotNull
            public final String getOutboundTag() {
                return this.outboundTag;
            }

            @Nullable
            public final String getPort() {
                return this.port;
            }

            @Nullable
            public final List<String> getProtocol() {
                return this.protocol;
            }

            @Nullable
            public final List<String> getSource() {
                return this.source;
            }

            @Nullable
            public final String getSourcePort() {
                return this.sourcePort;
            }

            @NotNull
            public final String getType() {
                return this.type;
            }

            @Nullable
            public final List<String> getUser() {
                return this.user;
            }

            public int hashCode() {
                int hashCode;
                int hashCode2;
                int hashCode3;
                int hashCode4;
                int hashCode5;
                int hashCode6;
                int hashCode7;
                int hashCode8;
                int hashCode9;
                int hashCode10;
                int hashCode11;
                int hashCode12 = this.type.hashCode() * 31;
                ArrayList<String> arrayList = this.f21821ip;
                int i = 0;
                if (arrayList == null) {
                    hashCode = 0;
                } else {
                    hashCode = arrayList.hashCode();
                }
                int i2 = (hashCode12 + hashCode) * 31;
                ArrayList<String> arrayList2 = this.domain;
                if (arrayList2 == null) {
                    hashCode2 = 0;
                } else {
                    hashCode2 = arrayList2.hashCode();
                }
                int m12537a = C0406q1.m12537a(this.outboundTag, (i2 + hashCode2) * 31, 31);
                String str = this.balancerTag;
                if (str == null) {
                    hashCode3 = 0;
                } else {
                    hashCode3 = str.hashCode();
                }
                int i3 = (m12537a + hashCode3) * 31;
                String str2 = this.port;
                if (str2 == null) {
                    hashCode4 = 0;
                } else {
                    hashCode4 = str2.hashCode();
                }
                int i4 = (i3 + hashCode4) * 31;
                String str3 = this.sourcePort;
                if (str3 == null) {
                    hashCode5 = 0;
                } else {
                    hashCode5 = str3.hashCode();
                }
                int i5 = (i4 + hashCode5) * 31;
                String str4 = this.network;
                if (str4 == null) {
                    hashCode6 = 0;
                } else {
                    hashCode6 = str4.hashCode();
                }
                int i6 = (i5 + hashCode6) * 31;
                List<String> list = this.source;
                if (list == null) {
                    hashCode7 = 0;
                } else {
                    hashCode7 = list.hashCode();
                }
                int i7 = (i6 + hashCode7) * 31;
                List<String> list2 = this.user;
                if (list2 == null) {
                    hashCode8 = 0;
                } else {
                    hashCode8 = list2.hashCode();
                }
                int i8 = (i7 + hashCode8) * 31;
                List<String> list3 = this.inboundTag;
                if (list3 == null) {
                    hashCode9 = 0;
                } else {
                    hashCode9 = list3.hashCode();
                }
                int i9 = (i8 + hashCode9) * 31;
                List<String> list4 = this.protocol;
                if (list4 == null) {
                    hashCode10 = 0;
                } else {
                    hashCode10 = list4.hashCode();
                }
                int i10 = (i9 + hashCode10) * 31;
                String str5 = this.attrs;
                if (str5 == null) {
                    hashCode11 = 0;
                } else {
                    hashCode11 = str5.hashCode();
                }
                int i11 = (i10 + hashCode11) * 31;
                String str6 = this.domainMatcher;
                if (str6 != null) {
                    i = str6.hashCode();
                }
                return i11 + i;
            }

            public final void setBalancerTag(@Nullable String str) {
                this.balancerTag = str;
            }

            public final void setDomain(@Nullable ArrayList<String> arrayList) {
                this.domain = arrayList;
            }

            public final void setInboundTag(@Nullable List<String> list) {
                this.inboundTag = list;
            }

            public final void setIp(@Nullable ArrayList<String> arrayList) {
                this.f21821ip = arrayList;
            }

            public final void setOutboundTag(@NotNull String str) {
                C10843j.m430f(str, "<set-?>");
                this.outboundTag = str;
            }

            public final void setPort(@Nullable String str) {
                this.port = str;
            }

            public final void setType(@NotNull String str) {
                C10843j.m430f(str, "<set-?>");
                this.type = str;
            }

            @NotNull
            public String toString() {
                StringBuilder sb = new StringBuilder("RulesBean(type=");
                sb.append(this.type);
                sb.append(", ip=");
                sb.append(this.f21821ip);
                sb.append(", domain=");
                sb.append(this.domain);
                sb.append(", outboundTag=");
                sb.append(this.outboundTag);
                sb.append(", balancerTag=");
                sb.append(this.balancerTag);
                sb.append(", port=");
                sb.append(this.port);
                sb.append(", sourcePort=");
                sb.append(this.sourcePort);
                sb.append(", network=");
                sb.append(this.network);
                sb.append(", source=");
                sb.append(this.source);
                sb.append(", user=");
                sb.append(this.user);
                sb.append(", inboundTag=");
                sb.append(this.inboundTag);
                sb.append(", protocol=");
                sb.append(this.protocol);
                sb.append(", attrs=");
                sb.append(this.attrs);
                sb.append(", domainMatcher=");
                return C0740h.m11848b(sb, this.domainMatcher, ')');
            }
        }

        public RoutingBean(@NotNull String domainStrategy, @Nullable String str, @NotNull ArrayList<RulesBean> rules, @Nullable List<? extends Object> list) {
            C10843j.m430f(domainStrategy, "domainStrategy");
            C10843j.m430f(rules, "rules");
            this.domainStrategy = domainStrategy;
            this.domainMatcher = str;
            this.rules = rules;
            this.balancers = list;
        }

        public /* synthetic */ RoutingBean(String str, String str2, ArrayList arrayList, List list, int i, C10839f c10839f) {
            this(str, (i & 2) != 0 ? null : str2, arrayList, (i & 8) != 0 ? null : list);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ RoutingBean copy$default(RoutingBean routingBean, String str, String str2, ArrayList arrayList, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                str = routingBean.domainStrategy;
            }
            if ((i & 2) != 0) {
                str2 = routingBean.domainMatcher;
            }
            if ((i & 4) != 0) {
                arrayList = routingBean.rules;
            }
            if ((i & 8) != 0) {
                list = routingBean.balancers;
            }
            return routingBean.copy(str, str2, arrayList, list);
        }

        @NotNull
        public final String component1() {
            return this.domainStrategy;
        }

        @Nullable
        public final String component2() {
            return this.domainMatcher;
        }

        @NotNull
        public final ArrayList<RulesBean> component3() {
            return this.rules;
        }

        @Nullable
        public final List<Object> component4() {
            return this.balancers;
        }

        @NotNull
        public final RoutingBean copy(@NotNull String domainStrategy, @Nullable String str, @NotNull ArrayList<RulesBean> rules, @Nullable List<? extends Object> list) {
            C10843j.m430f(domainStrategy, "domainStrategy");
            C10843j.m430f(rules, "rules");
            return new RoutingBean(domainStrategy, str, rules, list);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof RoutingBean) {
                RoutingBean routingBean = (RoutingBean) obj;
                return C10843j.m435a(this.domainStrategy, routingBean.domainStrategy) && C10843j.m435a(this.domainMatcher, routingBean.domainMatcher) && C10843j.m435a(this.rules, routingBean.rules) && C10843j.m435a(this.balancers, routingBean.balancers);
            }
            return false;
        }

        @Nullable
        public final List<Object> getBalancers() {
            return this.balancers;
        }

        @Nullable
        public final String getDomainMatcher() {
            return this.domainMatcher;
        }

        @NotNull
        public final String getDomainStrategy() {
            return this.domainStrategy;
        }

        @NotNull
        public final ArrayList<RulesBean> getRules() {
            return this.rules;
        }

        public int hashCode() {
            int hashCode = this.domainStrategy.hashCode() * 31;
            String str = this.domainMatcher;
            int hashCode2 = (this.rules.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31;
            List<Object> list = this.balancers;
            return hashCode2 + (list != null ? list.hashCode() : 0);
        }

        public final void setDomainMatcher(@Nullable String str) {
            this.domainMatcher = str;
        }

        public final void setDomainStrategy(@NotNull String str) {
            C10843j.m430f(str, "<set-?>");
            this.domainStrategy = str;
        }

        public final void setRules(@NotNull ArrayList<RulesBean> arrayList) {
            C10843j.m430f(arrayList, "<set-?>");
            this.rules = arrayList;
        }

        @NotNull
        public String toString() {
            return "RoutingBean(domainStrategy=" + this.domainStrategy + ", domainMatcher=" + this.domainMatcher + ", rules=" + this.rules + ", balancers=" + this.balancers + ')';
        }
    }

    public V2rayConfig(@Nullable Object obj, @NotNull LogBean log, @Nullable PolicyBean policyBean, @NotNull ArrayList<InboundBean> inbounds, @NotNull ArrayList<OutboundBean> outbounds, @NotNull DnsBean dns, @NotNull RoutingBean routing, @Nullable Object obj2, @Nullable Object obj3, @Nullable Object obj4, @Nullable Object obj5, @Nullable Object obj6) {
        C10843j.m430f(log, "log");
        C10843j.m430f(inbounds, "inbounds");
        C10843j.m430f(outbounds, "outbounds");
        C10843j.m430f(dns, "dns");
        C10843j.m430f(routing, "routing");
        this.stats = obj;
        this.log = log;
        this.policy = policyBean;
        this.inbounds = inbounds;
        this.outbounds = outbounds;
        this.dns = dns;
        this.routing = routing;
        this.api = obj2;
        this.transport = obj3;
        this.reverse = obj4;
        this.fakedns = obj5;
        this.browserForwarder = obj6;
    }

    public /* synthetic */ V2rayConfig(Object obj, LogBean logBean, PolicyBean policyBean, ArrayList arrayList, ArrayList arrayList2, DnsBean dnsBean, RoutingBean routingBean, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i, C10839f c10839f) {
        this((i & 1) != 0 ? null : obj, logBean, policyBean, arrayList, arrayList2, dnsBean, routingBean, (i & 128) != 0 ? null : obj2, (i & 256) != 0 ? null : obj3, (i & AdRequest.MAX_CONTENT_URL_LENGTH) != 0 ? null : obj4, (i & 1024) != 0 ? null : obj5, (i & 2048) != 0 ? null : obj6);
    }

    /* renamed from: a */
    public static /* synthetic */ AbstractC8692o m98a(Double d, Type type, TreeTypeAdapter.C8608a c8608a) {
        return toPrettyPrinting$lambda$1(d, type, c8608a);
    }

    public static final AbstractC8692o toPrettyPrinting$lambda$1(Double d, Type type, InterfaceC8701v interfaceC8701v) {
        return new C8700u(d != null ? Integer.valueOf((int) d.doubleValue()) : null);
    }

    @Nullable
    public final Object component1() {
        return this.stats;
    }

    @Nullable
    public final Object component10() {
        return this.reverse;
    }

    @Nullable
    public final Object component11() {
        return this.fakedns;
    }

    @Nullable
    public final Object component12() {
        return this.browserForwarder;
    }

    @NotNull
    public final LogBean component2() {
        return this.log;
    }

    @Nullable
    public final PolicyBean component3() {
        return this.policy;
    }

    @NotNull
    public final ArrayList<InboundBean> component4() {
        return this.inbounds;
    }

    @NotNull
    public final ArrayList<OutboundBean> component5() {
        return this.outbounds;
    }

    @NotNull
    public final DnsBean component6() {
        return this.dns;
    }

    @NotNull
    public final RoutingBean component7() {
        return this.routing;
    }

    @Nullable
    public final Object component8() {
        return this.api;
    }

    @Nullable
    public final Object component9() {
        return this.transport;
    }

    @NotNull
    public final V2rayConfig copy(@Nullable Object obj, @NotNull LogBean log, @Nullable PolicyBean policyBean, @NotNull ArrayList<InboundBean> inbounds, @NotNull ArrayList<OutboundBean> outbounds, @NotNull DnsBean dns, @NotNull RoutingBean routing, @Nullable Object obj2, @Nullable Object obj3, @Nullable Object obj4, @Nullable Object obj5, @Nullable Object obj6) {
        C10843j.m430f(log, "log");
        C10843j.m430f(inbounds, "inbounds");
        C10843j.m430f(outbounds, "outbounds");
        C10843j.m430f(dns, "dns");
        C10843j.m430f(routing, "routing");
        return new V2rayConfig(obj, log, policyBean, inbounds, outbounds, dns, routing, obj2, obj3, obj4, obj5, obj6);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof V2rayConfig) {
            V2rayConfig v2rayConfig = (V2rayConfig) obj;
            return C10843j.m435a(this.stats, v2rayConfig.stats) && C10843j.m435a(this.log, v2rayConfig.log) && C10843j.m435a(this.policy, v2rayConfig.policy) && C10843j.m435a(this.inbounds, v2rayConfig.inbounds) && C10843j.m435a(this.outbounds, v2rayConfig.outbounds) && C10843j.m435a(this.dns, v2rayConfig.dns) && C10843j.m435a(this.routing, v2rayConfig.routing) && C10843j.m435a(this.api, v2rayConfig.api) && C10843j.m435a(this.transport, v2rayConfig.transport) && C10843j.m435a(this.reverse, v2rayConfig.reverse) && C10843j.m435a(this.fakedns, v2rayConfig.fakedns) && C10843j.m435a(this.browserForwarder, v2rayConfig.browserForwarder);
        }
        return false;
    }

    @Nullable
    public final Object getApi() {
        return this.api;
    }

    @Nullable
    public final Object getBrowserForwarder() {
        return this.browserForwarder;
    }

    @NotNull
    public final DnsBean getDns() {
        return this.dns;
    }

    @Nullable
    public final Object getFakedns() {
        return this.fakedns;
    }

    @NotNull
    public final ArrayList<InboundBean> getInbounds() {
        return this.inbounds;
    }

    @NotNull
    public final LogBean getLog() {
        return this.log;
    }

    @NotNull
    public final ArrayList<OutboundBean> getOutbounds() {
        return this.outbounds;
    }

    @Nullable
    public final PolicyBean getPolicy() {
        return this.policy;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x000c  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final libv2ray.V2rayConfig.OutboundBean getProxyOutbound() {
        /*
            r4 = this;
            java.util.ArrayList<libv2ray.V2rayConfig$OutboundBean> r0 = r4.outbounds
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L4f
            java.lang.Object r1 = r0.next()
            libv2ray.V2rayConfig$OutboundBean r1 = (libv2ray.V2rayConfig.OutboundBean) r1
            java.lang.String r2 = r1.getProtocol()
            java.lang.String r3 = "VMESS"
            boolean r2 = kotlin.text.C10925n.m398e(r2, r3)
            if (r2 != 0) goto L4e
            java.lang.String r2 = r1.getProtocol()
            java.lang.String r3 = "VLESS"
            boolean r2 = kotlin.text.C10925n.m398e(r2, r3)
            if (r2 != 0) goto L4e
            java.lang.String r2 = r1.getProtocol()
            java.lang.String r3 = "SHADOWSOCKS"
            boolean r2 = kotlin.text.C10925n.m398e(r2, r3)
            if (r2 != 0) goto L4e
            java.lang.String r2 = r1.getProtocol()
            java.lang.String r3 = "SOCKS"
            boolean r2 = kotlin.text.C10925n.m398e(r2, r3)
            if (r2 != 0) goto L4e
            java.lang.String r2 = r1.getProtocol()
            java.lang.String r3 = "TROJAN"
            boolean r2 = kotlin.text.C10925n.m398e(r2, r3)
            if (r2 == 0) goto L6
        L4e:
            return r1
        L4f:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: libv2ray.V2rayConfig.getProxyOutbound():libv2ray.V2rayConfig$OutboundBean");
    }

    @Nullable
    public final Object getReverse() {
        return this.reverse;
    }

    @NotNull
    public final RoutingBean getRouting() {
        return this.routing;
    }

    @Nullable
    public final Object getStats() {
        return this.stats;
    }

    @Nullable
    public final Object getTransport() {
        return this.transport;
    }

    public int hashCode() {
        Object obj = this.stats;
        int hashCode = (this.log.hashCode() + ((obj == null ? 0 : obj.hashCode()) * 31)) * 31;
        PolicyBean policyBean = this.policy;
        int hashCode2 = policyBean == null ? 0 : policyBean.hashCode();
        int hashCode3 = this.inbounds.hashCode();
        int hashCode4 = this.outbounds.hashCode();
        int hashCode5 = (this.routing.hashCode() + ((this.dns.hashCode() + ((hashCode4 + ((hashCode3 + ((hashCode + hashCode2) * 31)) * 31)) * 31)) * 31)) * 31;
        Object obj2 = this.api;
        int hashCode6 = (hashCode5 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Object obj3 = this.transport;
        int hashCode7 = (hashCode6 + (obj3 == null ? 0 : obj3.hashCode())) * 31;
        Object obj4 = this.reverse;
        int hashCode8 = (hashCode7 + (obj4 == null ? 0 : obj4.hashCode())) * 31;
        Object obj5 = this.fakedns;
        int hashCode9 = (hashCode8 + (obj5 == null ? 0 : obj5.hashCode())) * 31;
        Object obj6 = this.browserForwarder;
        return hashCode9 + (obj6 != null ? obj6.hashCode() : 0);
    }

    public final void setDns(@NotNull DnsBean dnsBean) {
        C10843j.m430f(dnsBean, "<set-?>");
        this.dns = dnsBean;
    }

    public final void setFakedns(@Nullable Object obj) {
        this.fakedns = obj;
    }

    public final void setOutbounds(@NotNull ArrayList<OutboundBean> arrayList) {
        C10843j.m430f(arrayList, "<set-?>");
        this.outbounds = arrayList;
    }

    public final void setPolicy(@Nullable PolicyBean policyBean) {
        this.policy = policyBean;
    }

    public final void setStats(@Nullable Object obj) {
        this.stats = obj;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [libv2ray.a] */
    @NotNull
    public final String toPrettyPrinting() {
        C8688k c8688k = new C8688k();
        c8688k.f16513j = true;
        c8688k.f16512i = false;
        Type type = new C8696a<Double>() { // from class: libv2ray.V2rayConfig$toPrettyPrinting$1
        }.getType();
        ?? r2 = new InterfaceC8702w() { // from class: libv2ray.a
            @Override // com.google.gson.InterfaceC8702w
            /* renamed from: a */
            public final AbstractC8692o mo97a(Object obj, Type type2, TreeTypeAdapter.C8608a c8608a) {
                return V2rayConfig.m98a((Double) obj, type2, c8608a);
            }
        };
        if (r2 instanceof InterfaceC8689l) {
            c8688k.f16507d.put(type, (InterfaceC8689l) r2);
        }
        ArrayList arrayList = c8688k.f16508e;
        arrayList.add(TreeTypeAdapter.m3271c(C8696a.get(type), r2));
        if (r2 instanceof AbstractC8576a0) {
            arrayList.add(TypeAdapters.m3270a(C8696a.get(type), (AbstractC8576a0) r2));
        }
        String m3230h = c8688k.m3226a().m3230h(this);
        C10843j.m431e(m3230h, "GsonBuilder()\n          …            .toJson(this)");
        return m3230h;
    }

    @NotNull
    public String toString() {
        return "V2rayConfig(stats=" + this.stats + ", log=" + this.log + ", policy=" + this.policy + ", inbounds=" + this.inbounds + ", outbounds=" + this.outbounds + ", dns=" + this.dns + ", routing=" + this.routing + ", api=" + this.api + ", transport=" + this.transport + ", reverse=" + this.reverse + ", fakedns=" + this.fakedns + ", browserForwarder=" + this.browserForwarder + ')';
    }
}
