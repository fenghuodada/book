package libv2ray;

import android.net.ConnectivityManager;
import kotlin.Metadata;
import kotlin.jvm.functions.InterfaceC10809a;
import kotlin.jvm.internal.AbstractC10844k;
import kotlin.jvm.internal.C10843j;
import org.jetbrains.annotations.NotNull;

@Metadata(m509d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m508d2 = {"<anonymous>", "Landroid/net/ConnectivityManager;", "invoke"}, m507k = 3, m506mv = {1, 8, 0}, m504xi = 48)
/* loaded from: classes3.dex */
public final class GoFlyVpnService$connectivity$2 extends AbstractC10844k implements InterfaceC10809a<ConnectivityManager> {
    final /* synthetic */ GoFlyVpnService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GoFlyVpnService$connectivity$2(GoFlyVpnService goFlyVpnService) {
        super(0);
        this.this$0 = goFlyVpnService;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.InterfaceC10809a
    @NotNull
    public final ConnectivityManager invoke() {
        Object systemService = this.this$0.getSystemService("connectivity");
        C10843j.m432d(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        return (ConnectivityManager) systemService;
    }
}
