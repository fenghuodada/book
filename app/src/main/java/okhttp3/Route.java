package okhttp3;

import java.net.InetSocketAddress;
import java.net.Proxy;
import kotlin.Deprecated;
import kotlin.EnumC10735a;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.C10843j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m510bv = {1, 0, 3}, m509d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\r\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\b\fJ\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\r\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\b\u0012J\u0006\u0010\u0013\u001a\u00020\u000eJ\r\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\b\u0014J\b\u0010\u0015\u001a\u00020\u0016H\u0016R\u0013\u0010\u0002\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\tR\u0013\u0010\u0004\u001a\u00020\u00058\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\nR\u0013\u0010\u0006\u001a\u00020\u00078\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000b¨\u0006\u0017"}, m508d2 = {"Lokhttp3/Route;", "", "address", "Lokhttp3/Address;", "proxy", "Ljava/net/Proxy;", "socketAddress", "Ljava/net/InetSocketAddress;", "(Lokhttp3/Address;Ljava/net/Proxy;Ljava/net/InetSocketAddress;)V", "()Lokhttp3/Address;", "()Ljava/net/Proxy;", "()Ljava/net/InetSocketAddress;", "-deprecated_address", "equals", "", "other", "hashCode", "", "-deprecated_proxy", "requiresTunnel", "-deprecated_socketAddress", "toString", "", "okhttp"}, m507k = 1, m506mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class Route {
    @NotNull
    private final Address address;
    @NotNull
    private final Proxy proxy;
    @NotNull
    private final InetSocketAddress socketAddress;

    public Route(@NotNull Address address, @NotNull Proxy proxy, @NotNull InetSocketAddress socketAddress) {
        C10843j.m430f(address, "address");
        C10843j.m430f(proxy, "proxy");
        C10843j.m430f(socketAddress, "socketAddress");
        this.address = address;
        this.proxy = proxy;
        this.socketAddress = socketAddress;
    }

    @Deprecated(level = EnumC10735a.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "address", imports = {}))
    @JvmName(name = "-deprecated_address")
    @NotNull
    /* renamed from: -deprecated_address  reason: not valid java name */
    public final Address m13223deprecated_address() {
        return this.address;
    }

    @Deprecated(level = EnumC10735a.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "proxy", imports = {}))
    @JvmName(name = "-deprecated_proxy")
    @NotNull
    /* renamed from: -deprecated_proxy  reason: not valid java name */
    public final Proxy m13224deprecated_proxy() {
        return this.proxy;
    }

    @Deprecated(level = EnumC10735a.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "socketAddress", imports = {}))
    @JvmName(name = "-deprecated_socketAddress")
    @NotNull
    /* renamed from: -deprecated_socketAddress  reason: not valid java name */
    public final InetSocketAddress m13225deprecated_socketAddress() {
        return this.socketAddress;
    }

    @JvmName(name = "address")
    @NotNull
    public final Address address() {
        return this.address;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof Route) {
            Route route = (Route) obj;
            if (C10843j.m435a(route.address, this.address) && C10843j.m435a(route.proxy, this.proxy) && C10843j.m435a(route.socketAddress, this.socketAddress)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.proxy.hashCode();
        return this.socketAddress.hashCode() + ((hashCode + ((this.address.hashCode() + 527) * 31)) * 31);
    }

    @JvmName(name = "proxy")
    @NotNull
    public final Proxy proxy() {
        return this.proxy;
    }

    public final boolean requiresTunnel() {
        return this.address.sslSocketFactory() != null && this.proxy.type() == Proxy.Type.HTTP;
    }

    @JvmName(name = "socketAddress")
    @NotNull
    public final InetSocketAddress socketAddress() {
        return this.socketAddress;
    }

    @NotNull
    public String toString() {
        return "Route{" + this.socketAddress + '}';
    }
}
