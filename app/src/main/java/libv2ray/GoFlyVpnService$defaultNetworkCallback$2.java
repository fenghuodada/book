package libv2ray;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import kotlin.Metadata;
import kotlin.jvm.functions.InterfaceC10809a;
import kotlin.jvm.internal.AbstractC10844k;
import kotlin.jvm.internal.C10843j;
import org.jetbrains.annotations.NotNull;

@Metadata(m509d1 = {"\u0000\t\n\u0000\n\u0002\b\u0003*\u0001\u0001\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m508d2 = {"<anonymous>", "libv2ray/GoFlyVpnService$defaultNetworkCallback$2$1", "invoke", "()Llibv2ray/GoFlyVpnService$defaultNetworkCallback$2$1;"}, m507k = 3, m506mv = {1, 8, 0}, m504xi = 48)
/* loaded from: classes3.dex */
public final class GoFlyVpnService$defaultNetworkCallback$2 extends AbstractC10844k implements InterfaceC10809a<C111651> {
    final /* synthetic */ GoFlyVpnService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GoFlyVpnService$defaultNetworkCallback$2(GoFlyVpnService goFlyVpnService) {
        super(0);
        this.this$0 = goFlyVpnService;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [libv2ray.GoFlyVpnService$defaultNetworkCallback$2$1] */
    @Override // kotlin.jvm.functions.InterfaceC10809a
    @NotNull
    public final C111651 invoke() {
        final GoFlyVpnService goFlyVpnService = this.this$0;
        return new ConnectivityManager.NetworkCallback() { // from class: libv2ray.GoFlyVpnService$defaultNetworkCallback$2.1
            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onAvailable(@NotNull Network network) {
                C10843j.m430f(network, "network");
                GoFlyVpnService.this.setUnderlyingNetworks(new Network[]{network});
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onCapabilitiesChanged(@NotNull Network network, @NotNull NetworkCapabilities networkCapabilities) {
                C10843j.m430f(network, "network");
                C10843j.m430f(networkCapabilities, "networkCapabilities");
                GoFlyVpnService.this.setUnderlyingNetworks(new Network[]{network});
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onLost(@NotNull Network network) {
                C10843j.m430f(network, "network");
                GoFlyVpnService.this.setUnderlyingNetworks(null);
            }
        };
    }
}
