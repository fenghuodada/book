package libv2ray;

import androidx.appcompat.widget.C0406q1;
import com.ambrose.overwall.p007v2.C2524e;
import com.ambrose.overwall.p007v2.EnumC2521b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlin.C10796i;
import kotlin.Metadata;
import kotlin.collections.C10748d;
import kotlin.collections.C10752h;
import kotlin.collections.C10753i;
import kotlin.collections.C10757m;
import kotlin.jvm.internal.C10839f;
import kotlin.jvm.internal.C10843j;
import kotlin.jvm.internal.SourceDebugExtension;
import libv2ray.V2rayConfig;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m509d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u001d\b\u0086\b\u0018\u0000 :2\u00020\u0001:\u0001:BO\u0012\b\b\u0002\u0010\u0013\u001a\u00020\b\u0012\u0006\u0010\u0014\u001a\u00020\n\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0016\u001a\u00020\r\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b8\u00109J\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004J\u0006\u0010\u0007\u001a\u00020\u0005J\t\u0010\t\u001a\u00020\bHÆ\u0003J\t\u0010\u000b\u001a\u00020\nHÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000e\u001a\u00020\rHÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÆ\u0003JS\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0013\u001a\u00020\b2\b\b\u0002\u0010\u0014\u001a\u00020\n2\b\b\u0002\u0010\u0015\u001a\u00020\u00052\b\b\u0002\u0010\u0016\u001a\u00020\r2\b\b\u0002\u0010\u0017\u001a\u00020\u00052\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0011HÆ\u0001J\t\u0010\u001b\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001c\u001a\u00020\bHÖ\u0001J\u0013\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0013\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0013\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0014\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0014\u0010#\u001a\u0004\b$\u0010%R\"\u0010\u0015\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u0017\u0010\u0016\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u0016\u0010+\u001a\u0004\b,\u0010-R\"\u0010\u0017\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010&\u001a\u0004\b.\u0010(\"\u0004\b/\u0010*R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u00100\u001a\u0004\b1\u00102R$\u0010\u0019\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107¨\u0006;"}, m508d2 = {"Llibv2ray/ServerConfig;", "", "Llibv2ray/V2rayConfig$OutboundBean;", "getProxyOutbound", "", "", "getAllOutboundTags", "getV2rayPointDomainAndPort", "", "component1", "Lcom/ambrose/overwall/v2/b;", "component2", "component3", "", "component4", "component5", "component6", "Llibv2ray/V2rayConfig;", "component7", "configVersion", "configType", "subscriptionId", "addedTime", "remarks", "outboundBean", "fullConfig", "copy", "toString", "hashCode", "other", "", "equals", "I", "getConfigVersion", "()I", "Lcom/ambrose/overwall/v2/b;", "getConfigType", "()Lcom/ambrose/overwall/v2/b;", "Ljava/lang/String;", "getSubscriptionId", "()Ljava/lang/String;", "setSubscriptionId", "(Ljava/lang/String;)V", "J", "getAddedTime", "()J", "getRemarks", "setRemarks", "Llibv2ray/V2rayConfig$OutboundBean;", "getOutboundBean", "()Llibv2ray/V2rayConfig$OutboundBean;", "Llibv2ray/V2rayConfig;", "getFullConfig", "()Llibv2ray/V2rayConfig;", "setFullConfig", "(Llibv2ray/V2rayConfig;)V", "<init>", "(ILcom/ambrose/overwall/v2/b;Ljava/lang/String;JLjava/lang/String;Llibv2ray/V2rayConfig$OutboundBean;Llibv2ray/V2rayConfig;)V", "Companion", "app_release"}, m507k = 1, m506mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nServerConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ServerConfig.kt\nlibv2ray/ServerConfig\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,79:1\n1549#2:80\n1620#2,3:81\n*S KotlinDebug\n*F\n+ 1 ServerConfig.kt\nlibv2ray/ServerConfig\n*L\n63#1:80\n63#1:81,3\n*E\n"})
/* loaded from: classes3.dex */
public final class ServerConfig {
    @NotNull
    public static final Companion Companion = new Companion(null);
    private final long addedTime;
    @NotNull
    private final EnumC2521b configType;
    private final int configVersion;
    @Nullable
    private V2rayConfig fullConfig;
    @Nullable
    private final V2rayConfig.OutboundBean outboundBean;
    @NotNull
    private String remarks;
    @NotNull
    private String subscriptionId;

    @Metadata(m509d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, m508d2 = {"Llibv2ray/ServerConfig$Companion;", "", "Lcom/ambrose/overwall/v2/b;", "configType", "Llibv2ray/ServerConfig;", "create", "<init>", "()V", "app_release"}, m507k = 1, m506mv = {1, 8, 0})
    /* loaded from: classes3.dex */
    public static final class Companion {

        @Metadata(m507k = 3, m506mv = {1, 8, 0}, m504xi = 48)
        /* loaded from: classes3.dex */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[EnumC2521b.values().length];
                try {
                    iArr[0] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[4] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[1] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[2] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[3] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[5] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        private Companion() {
        }

        public /* synthetic */ Companion(C10839f c10839f) {
            this();
        }

        @NotNull
        public final ServerConfig create(@NotNull EnumC2521b configType) {
            C10843j.m430f(configType, "configType");
            int ordinal = configType.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2 && ordinal != 3) {
                        if (ordinal != 4) {
                            if (ordinal != 5) {
                                throw new C10796i();
                            }
                        }
                    }
                    String name = configType.name();
                    Locale locale = Locale.getDefault();
                    C10843j.m431e(locale, "getDefault()");
                    String lowerCase = name.toLowerCase(locale);
                    C10843j.m431e(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                    return new ServerConfig(0, configType, null, 0L, null, new V2rayConfig.OutboundBean(null, lowerCase, new V2rayConfig.OutboundBean.OutSettingsBean(null, C10752h.m486c(new V2rayConfig.OutboundBean.OutSettingsBean.ServersBean(null, null, false, null, 0, 0, null, null, null, null, 1023, null)), null, null, null, null, null, null, null, null, 1021, null), new V2rayConfig.OutboundBean.StreamSettingsBean(null, null, null, null, null, null, null, null, null, null, null, null, 4095, null), null, null, null, 113, null), null, 93, null);
                }
                return new ServerConfig(0, configType, null, 0L, null, null, null, 125, null);
            }
            String name2 = configType.name();
            Locale locale2 = Locale.getDefault();
            C10843j.m431e(locale2, "getDefault()");
            String lowerCase2 = name2.toLowerCase(locale2);
            C10843j.m431e(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
            return new ServerConfig(0, configType, null, 0L, null, new V2rayConfig.OutboundBean(null, lowerCase2, new V2rayConfig.OutboundBean.OutSettingsBean(C10752h.m486c(new V2rayConfig.OutboundBean.OutSettingsBean.VnextBean(null, 0, C10752h.m486c(new V2rayConfig.OutboundBean.OutSettingsBean.VnextBean.UsersBean(null, null, null, 0, null, null, 63, null)), 3, null)), null, null, null, null, null, null, null, null, null, 1022, null), new V2rayConfig.OutboundBean.StreamSettingsBean(null, null, null, null, null, null, null, null, null, null, null, null, 4095, null), null, null, null, 113, null), null, 93, null);
        }
    }

    public ServerConfig(int i, @NotNull EnumC2521b configType, @NotNull String subscriptionId, long j, @NotNull String remarks, @Nullable V2rayConfig.OutboundBean outboundBean, @Nullable V2rayConfig v2rayConfig) {
        C10843j.m430f(configType, "configType");
        C10843j.m430f(subscriptionId, "subscriptionId");
        C10843j.m430f(remarks, "remarks");
        this.configVersion = i;
        this.configType = configType;
        this.subscriptionId = subscriptionId;
        this.addedTime = j;
        this.remarks = remarks;
        this.outboundBean = outboundBean;
        this.fullConfig = v2rayConfig;
    }

    public /* synthetic */ ServerConfig(int i, EnumC2521b enumC2521b, String str, long j, String str2, V2rayConfig.OutboundBean outboundBean, V2rayConfig v2rayConfig, int i2, C10839f c10839f) {
        this((i2 & 1) != 0 ? 3 : i, enumC2521b, (i2 & 4) != 0 ? "" : str, (i2 & 8) != 0 ? System.currentTimeMillis() : j, (i2 & 16) != 0 ? "" : str2, (i2 & 32) != 0 ? null : outboundBean, (i2 & 64) != 0 ? null : v2rayConfig);
    }

    public final int component1() {
        return this.configVersion;
    }

    @NotNull
    public final EnumC2521b component2() {
        return this.configType;
    }

    @NotNull
    public final String component3() {
        return this.subscriptionId;
    }

    public final long component4() {
        return this.addedTime;
    }

    @NotNull
    public final String component5() {
        return this.remarks;
    }

    @Nullable
    public final V2rayConfig.OutboundBean component6() {
        return this.outboundBean;
    }

    @Nullable
    public final V2rayConfig component7() {
        return this.fullConfig;
    }

    @NotNull
    public final ServerConfig copy(int i, @NotNull EnumC2521b configType, @NotNull String subscriptionId, long j, @NotNull String remarks, @Nullable V2rayConfig.OutboundBean outboundBean, @Nullable V2rayConfig v2rayConfig) {
        C10843j.m430f(configType, "configType");
        C10843j.m430f(subscriptionId, "subscriptionId");
        C10843j.m430f(remarks, "remarks");
        return new ServerConfig(i, configType, subscriptionId, j, remarks, outboundBean, v2rayConfig);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ServerConfig) {
            ServerConfig serverConfig = (ServerConfig) obj;
            return this.configVersion == serverConfig.configVersion && this.configType == serverConfig.configType && C10843j.m435a(this.subscriptionId, serverConfig.subscriptionId) && this.addedTime == serverConfig.addedTime && C10843j.m435a(this.remarks, serverConfig.remarks) && C10843j.m435a(this.outboundBean, serverConfig.outboundBean) && C10843j.m435a(this.fullConfig, serverConfig.fullConfig);
        }
        return false;
    }

    public final long getAddedTime() {
        return this.addedTime;
    }

    @NotNull
    public final List<String> getAllOutboundTags() {
        if (this.configType != EnumC2521b.CUSTOM) {
            return new ArrayList(new C10748d(new String[]{"proxy"}, true));
        }
        V2rayConfig v2rayConfig = this.fullConfig;
        if (v2rayConfig != null) {
            ArrayList<V2rayConfig.OutboundBean> outbounds = v2rayConfig.getOutbounds();
            ArrayList arrayList = new ArrayList(C10753i.m482g(outbounds));
            for (V2rayConfig.OutboundBean outboundBean : outbounds) {
                arrayList.add(outboundBean.getTag());
            }
            return C10757m.m470s(arrayList);
        }
        return new ArrayList();
    }

    @NotNull
    public final EnumC2521b getConfigType() {
        return this.configType;
    }

    public final int getConfigVersion() {
        return this.configVersion;
    }

    @Nullable
    public final V2rayConfig getFullConfig() {
        return this.fullConfig;
    }

    @Nullable
    public final V2rayConfig.OutboundBean getOutboundBean() {
        return this.outboundBean;
    }

    @Nullable
    public final V2rayConfig.OutboundBean getProxyOutbound() {
        if (this.configType != EnumC2521b.CUSTOM) {
            return this.outboundBean;
        }
        V2rayConfig v2rayConfig = this.fullConfig;
        if (v2rayConfig != null) {
            return v2rayConfig.getProxyOutbound();
        }
        return null;
    }

    @NotNull
    public final String getRemarks() {
        return this.remarks;
    }

    @NotNull
    public final String getSubscriptionId() {
        return this.subscriptionId;
    }

    @NotNull
    public final String getV2rayPointDomainAndPort() {
        V2rayConfig.OutboundBean proxyOutbound = getProxyOutbound();
        String serverAddress = proxyOutbound != null ? proxyOutbound.getServerAddress() : null;
        if (serverAddress == null) {
            serverAddress = "";
        }
        V2rayConfig.OutboundBean proxyOutbound2 = getProxyOutbound();
        Integer serverPort = proxyOutbound2 != null ? proxyOutbound2.getServerPort() : null;
        C2524e c2524e = C2524e.f6008a;
        String format = C2524e.m9392e(serverAddress) ? String.format("[%s]:%s", Arrays.copyOf(new Object[]{serverAddress, serverPort}, 2)) : String.format("%s:%s", Arrays.copyOf(new Object[]{serverAddress, serverPort}, 2));
        C10843j.m431e(format, "format(format, *args)");
        return format;
    }

    public int hashCode() {
        int hashCode;
        int m12537a = C0406q1.m12537a(this.subscriptionId, (this.configType.hashCode() + (this.configVersion * 31)) * 31, 31);
        long j = this.addedTime;
        int m12537a2 = C0406q1.m12537a(this.remarks, (m12537a + ((int) (j ^ (j >>> 32)))) * 31, 31);
        V2rayConfig.OutboundBean outboundBean = this.outboundBean;
        int i = 0;
        if (outboundBean == null) {
            hashCode = 0;
        } else {
            hashCode = outboundBean.hashCode();
        }
        int i2 = (m12537a2 + hashCode) * 31;
        V2rayConfig v2rayConfig = this.fullConfig;
        if (v2rayConfig != null) {
            i = v2rayConfig.hashCode();
        }
        return i2 + i;
    }

    public final void setFullConfig(@Nullable V2rayConfig v2rayConfig) {
        this.fullConfig = v2rayConfig;
    }

    public final void setRemarks(@NotNull String str) {
        C10843j.m430f(str, "<set-?>");
        this.remarks = str;
    }

    public final void setSubscriptionId(@NotNull String str) {
        C10843j.m430f(str, "<set-?>");
        this.subscriptionId = str;
    }

    @NotNull
    public String toString() {
        return "ServerConfig(configVersion=" + this.configVersion + ", configType=" + this.configType + ", subscriptionId=" + this.subscriptionId + ", addedTime=" + this.addedTime + ", remarks=" + this.remarks + ", outboundBean=" + this.outboundBean + ", fullConfig=" + this.fullConfig + ')';
    }
}
