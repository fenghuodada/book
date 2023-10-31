package okhttp3.internal.connection;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C10753i;
import kotlin.jvm.functions.InterfaceC10809a;
import kotlin.jvm.internal.AbstractC10844k;
import kotlin.jvm.internal.C10843j;
import okhttp3.Handshake;
import org.jetbrains.annotations.NotNull;

@Metadata(m510bv = {1, 0, 3}, m509d1 = {"\u0000\f\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, m508d2 = {"<anonymous>", "", "Ljava/security/cert/X509Certificate;", "invoke"}, m507k = 3, m506mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class RealConnection$connectTls$2 extends AbstractC10844k implements InterfaceC10809a<List<? extends X509Certificate>> {
    final /* synthetic */ RealConnection this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealConnection$connectTls$2(RealConnection realConnection) {
        super(0);
        this.this$0 = realConnection;
    }

    @Override // kotlin.jvm.functions.InterfaceC10809a
    @NotNull
    public final List<? extends X509Certificate> invoke() {
        Handshake handshake;
        handshake = this.this$0.handshake;
        C10843j.m433c(handshake);
        List<Certificate> peerCertificates = handshake.peerCertificates();
        ArrayList arrayList = new ArrayList(C10753i.m482g(peerCertificates));
        for (Certificate certificate : peerCertificates) {
            if (certificate == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.security.cert.X509Certificate");
            }
            arrayList.add((X509Certificate) certificate);
        }
        return arrayList;
    }
}
