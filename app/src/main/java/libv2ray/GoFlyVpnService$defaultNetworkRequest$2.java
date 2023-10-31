package libv2ray;

import android.net.NetworkRequest;
import kotlin.Metadata;
import kotlin.jvm.functions.InterfaceC10809a;
import kotlin.jvm.internal.AbstractC10844k;

@Metadata(m509d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, m508d2 = {"<anonymous>", "Landroid/net/NetworkRequest;", "kotlin.jvm.PlatformType", "invoke"}, m507k = 3, m506mv = {1, 8, 0}, m504xi = 48)
/* loaded from: classes3.dex */
public final class GoFlyVpnService$defaultNetworkRequest$2 extends AbstractC10844k implements InterfaceC10809a<NetworkRequest> {
    public static final GoFlyVpnService$defaultNetworkRequest$2 INSTANCE = new GoFlyVpnService$defaultNetworkRequest$2();

    public GoFlyVpnService$defaultNetworkRequest$2() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.InterfaceC10809a
    public final NetworkRequest invoke() {
        return new NetworkRequest.Builder().addCapability(12).addCapability(13).build();
    }
}
