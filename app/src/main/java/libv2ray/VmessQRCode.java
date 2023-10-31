package libv2ray;

import androidx.appcompat.widget.C0406q1;
import androidx.core.p003os.C0740h;
import com.google.ads.mediation.facebook.FacebookAdapter;
import com.google.android.gms.ads.AdRequest;
import kotlin.Metadata;
import kotlin.jvm.internal.C10839f;
import kotlin.jvm.internal.C10843j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m509d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b4\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B}\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003¢\u0006\u0002\u0010\u000fJ\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\t\u00100\u001a\u00020\u0003HÆ\u0003J\t\u00101\u001a\u00020\u0003HÆ\u0003J\t\u00102\u001a\u00020\u0003HÆ\u0003J\t\u00103\u001a\u00020\u0003HÆ\u0003J\t\u00104\u001a\u00020\u0003HÆ\u0003J\t\u00105\u001a\u00020\u0003HÆ\u0003J\u0081\u0001\u00106\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u0003HÆ\u0001J\u0013\u00107\u001a\u0002082\b\u00109\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010:\u001a\u00020;HÖ\u0001J\t\u0010<\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0011\"\u0004\b\u0015\u0010\u0013R\u001a\u0010\u000b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0011\"\u0004\b\u0017\u0010\u0013R\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0011\"\u0004\b\u0019\u0010\u0013R\u001a\u0010\t\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0011\"\u0004\b\u001b\u0010\u0013R\u001a\u0010\f\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0011\"\u0004\b\u001d\u0010\u0013R\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0011\"\u0004\b\u001f\u0010\u0013R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0011\"\u0004\b!\u0010\u0013R\u001a\u0010\u000e\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0011\"\u0004\b#\u0010\u0013R\u001a\u0010\r\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0011\"\u0004\b%\u0010\u0013R\u001a\u0010\n\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0011\"\u0004\b'\u0010\u0013R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0011\"\u0004\b)\u0010\u0013¨\u0006="}, m508d2 = {"Llibv2ray/VmessQRCode;", "", "v", "", "ps", "add", "port", FacebookAdapter.KEY_ID, "aid", "net", "type", "host", "path", V2rayConfig.TLS, "sni", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAdd", "()Ljava/lang/String;", "setAdd", "(Ljava/lang/String;)V", "getAid", "setAid", "getHost", "setHost", "getId", "setId", "getNet", "setNet", "getPath", "setPath", "getPort", "setPort", "getPs", "setPs", "getSni", "setSni", "getTls", "setTls", "getType", "setType", "getV", "setV", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, m507k = 1, m506mv = {1, 8, 0}, m504xi = 48)
/* loaded from: classes3.dex */
public final class VmessQRCode {
    @NotNull
    private String add;
    @NotNull
    private String aid;
    @NotNull
    private String host;
    @NotNull

    /* renamed from: id */
    private String f21822id;
    @NotNull
    private String net;
    @NotNull
    private String path;
    @NotNull
    private String port;
    @NotNull

    /* renamed from: ps */
    private String f21823ps;
    @NotNull
    private String sni;
    @NotNull
    private String tls;
    @NotNull
    private String type;
    @NotNull

    /* renamed from: v */
    private String f21824v;

    public VmessQRCode() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, 4095, null);
    }

    public VmessQRCode(@NotNull String v, @NotNull String ps, @NotNull String add, @NotNull String port, @NotNull String id, @NotNull String aid, @NotNull String net, @NotNull String type, @NotNull String host, @NotNull String path, @NotNull String tls, @NotNull String sni) {
        C10843j.m430f(v, "v");
        C10843j.m430f(ps, "ps");
        C10843j.m430f(add, "add");
        C10843j.m430f(port, "port");
        C10843j.m430f(id, "id");
        C10843j.m430f(aid, "aid");
        C10843j.m430f(net, "net");
        C10843j.m430f(type, "type");
        C10843j.m430f(host, "host");
        C10843j.m430f(path, "path");
        C10843j.m430f(tls, "tls");
        C10843j.m430f(sni, "sni");
        this.f21824v = v;
        this.f21823ps = ps;
        this.add = add;
        this.port = port;
        this.f21822id = id;
        this.aid = aid;
        this.net = net;
        this.type = type;
        this.host = host;
        this.path = path;
        this.tls = tls;
        this.sni = sni;
    }

    public /* synthetic */ VmessQRCode(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, int i, C10839f c10839f) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "" : str8, (i & 256) != 0 ? "" : str9, (i & AdRequest.MAX_CONTENT_URL_LENGTH) != 0 ? "" : str10, (i & 1024) != 0 ? "" : str11, (i & 2048) == 0 ? str12 : "");
    }

    @NotNull
    public final String component1() {
        return this.f21824v;
    }

    @NotNull
    public final String component10() {
        return this.path;
    }

    @NotNull
    public final String component11() {
        return this.tls;
    }

    @NotNull
    public final String component12() {
        return this.sni;
    }

    @NotNull
    public final String component2() {
        return this.f21823ps;
    }

    @NotNull
    public final String component3() {
        return this.add;
    }

    @NotNull
    public final String component4() {
        return this.port;
    }

    @NotNull
    public final String component5() {
        return this.f21822id;
    }

    @NotNull
    public final String component6() {
        return this.aid;
    }

    @NotNull
    public final String component7() {
        return this.net;
    }

    @NotNull
    public final String component8() {
        return this.type;
    }

    @NotNull
    public final String component9() {
        return this.host;
    }

    @NotNull
    public final VmessQRCode copy(@NotNull String v, @NotNull String ps, @NotNull String add, @NotNull String port, @NotNull String id, @NotNull String aid, @NotNull String net, @NotNull String type, @NotNull String host, @NotNull String path, @NotNull String tls, @NotNull String sni) {
        C10843j.m430f(v, "v");
        C10843j.m430f(ps, "ps");
        C10843j.m430f(add, "add");
        C10843j.m430f(port, "port");
        C10843j.m430f(id, "id");
        C10843j.m430f(aid, "aid");
        C10843j.m430f(net, "net");
        C10843j.m430f(type, "type");
        C10843j.m430f(host, "host");
        C10843j.m430f(path, "path");
        C10843j.m430f(tls, "tls");
        C10843j.m430f(sni, "sni");
        return new VmessQRCode(v, ps, add, port, id, aid, net, type, host, path, tls, sni);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof VmessQRCode) {
            VmessQRCode vmessQRCode = (VmessQRCode) obj;
            return C10843j.m435a(this.f21824v, vmessQRCode.f21824v) && C10843j.m435a(this.f21823ps, vmessQRCode.f21823ps) && C10843j.m435a(this.add, vmessQRCode.add) && C10843j.m435a(this.port, vmessQRCode.port) && C10843j.m435a(this.f21822id, vmessQRCode.f21822id) && C10843j.m435a(this.aid, vmessQRCode.aid) && C10843j.m435a(this.net, vmessQRCode.net) && C10843j.m435a(this.type, vmessQRCode.type) && C10843j.m435a(this.host, vmessQRCode.host) && C10843j.m435a(this.path, vmessQRCode.path) && C10843j.m435a(this.tls, vmessQRCode.tls) && C10843j.m435a(this.sni, vmessQRCode.sni);
        }
        return false;
    }

    @NotNull
    public final String getAdd() {
        return this.add;
    }

    @NotNull
    public final String getAid() {
        return this.aid;
    }

    @NotNull
    public final String getHost() {
        return this.host;
    }

    @NotNull
    public final String getId() {
        return this.f21822id;
    }

    @NotNull
    public final String getNet() {
        return this.net;
    }

    @NotNull
    public final String getPath() {
        return this.path;
    }

    @NotNull
    public final String getPort() {
        return this.port;
    }

    @NotNull
    public final String getPs() {
        return this.f21823ps;
    }

    @NotNull
    public final String getSni() {
        return this.sni;
    }

    @NotNull
    public final String getTls() {
        return this.tls;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    @NotNull
    public final String getV() {
        return this.f21824v;
    }

    public int hashCode() {
        return this.sni.hashCode() + C0406q1.m12537a(this.tls, C0406q1.m12537a(this.path, C0406q1.m12537a(this.host, C0406q1.m12537a(this.type, C0406q1.m12537a(this.net, C0406q1.m12537a(this.aid, C0406q1.m12537a(this.f21822id, C0406q1.m12537a(this.port, C0406q1.m12537a(this.add, C0406q1.m12537a(this.f21823ps, this.f21824v.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public final void setAdd(@NotNull String str) {
        C10843j.m430f(str, "<set-?>");
        this.add = str;
    }

    public final void setAid(@NotNull String str) {
        C10843j.m430f(str, "<set-?>");
        this.aid = str;
    }

    public final void setHost(@NotNull String str) {
        C10843j.m430f(str, "<set-?>");
        this.host = str;
    }

    public final void setId(@NotNull String str) {
        C10843j.m430f(str, "<set-?>");
        this.f21822id = str;
    }

    public final void setNet(@NotNull String str) {
        C10843j.m430f(str, "<set-?>");
        this.net = str;
    }

    public final void setPath(@NotNull String str) {
        C10843j.m430f(str, "<set-?>");
        this.path = str;
    }

    public final void setPort(@NotNull String str) {
        C10843j.m430f(str, "<set-?>");
        this.port = str;
    }

    public final void setPs(@NotNull String str) {
        C10843j.m430f(str, "<set-?>");
        this.f21823ps = str;
    }

    public final void setSni(@NotNull String str) {
        C10843j.m430f(str, "<set-?>");
        this.sni = str;
    }

    public final void setTls(@NotNull String str) {
        C10843j.m430f(str, "<set-?>");
        this.tls = str;
    }

    public final void setType(@NotNull String str) {
        C10843j.m430f(str, "<set-?>");
        this.type = str;
    }

    public final void setV(@NotNull String str) {
        C10843j.m430f(str, "<set-?>");
        this.f21824v = str;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("VmessQRCode(v=");
        sb.append(this.f21824v);
        sb.append(", ps=");
        sb.append(this.f21823ps);
        sb.append(", add=");
        sb.append(this.add);
        sb.append(", port=");
        sb.append(this.port);
        sb.append(", id=");
        sb.append(this.f21822id);
        sb.append(", aid=");
        sb.append(this.aid);
        sb.append(", net=");
        sb.append(this.net);
        sb.append(", type=");
        sb.append(this.type);
        sb.append(", host=");
        sb.append(this.host);
        sb.append(", path=");
        sb.append(this.path);
        sb.append(", tls=");
        sb.append(this.tls);
        sb.append(", sni=");
        return C0740h.m11848b(sb, this.sni, ')');
    }
}
