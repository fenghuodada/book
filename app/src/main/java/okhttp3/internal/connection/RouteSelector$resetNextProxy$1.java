package okhttp3.internal.connection;

import java.net.Proxy;
import java.net.URI;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C10752h;
import kotlin.jvm.functions.InterfaceC10809a;
import kotlin.jvm.internal.AbstractC10844k;
import okhttp3.Address;
import okhttp3.HttpUrl;
import okhttp3.internal.Util;
import org.jetbrains.annotations.NotNull;

@Metadata(m510bv = {1, 0, 3}, m509d1 = {"\u0000\f\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, m508d2 = {"selectProxies", "", "Ljava/net/Proxy;", "invoke"}, m507k = 3, m506mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class RouteSelector$resetNextProxy$1 extends AbstractC10844k implements InterfaceC10809a<List<? extends Proxy>> {
    final /* synthetic */ Proxy $proxy;
    final /* synthetic */ HttpUrl $url;
    final /* synthetic */ RouteSelector this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RouteSelector$resetNextProxy$1(RouteSelector routeSelector, Proxy proxy, HttpUrl httpUrl) {
        super(0);
        this.this$0 = routeSelector;
        this.$proxy = proxy;
        this.$url = httpUrl;
    }

    @Override // kotlin.jvm.functions.InterfaceC10809a
    @NotNull
    public final List<? extends Proxy> invoke() {
        Address address;
        Proxy proxy = this.$proxy;
        if (proxy != null) {
            return C10752h.m486c(proxy);
        }
        URI uri = this.$url.uri();
        if (uri.getHost() == null) {
            return Util.immutableListOf(Proxy.NO_PROXY);
        }
        address = this.this$0.address;
        List<Proxy> select = address.proxySelector().select(uri);
        List<Proxy> list = select;
        return list == null || list.isEmpty() ? Util.immutableListOf(Proxy.NO_PROXY) : Util.toImmutableList(select);
    }
}
