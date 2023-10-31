package okhttp3;

import java.security.cert.Certificate;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.InterfaceC10809a;
import kotlin.jvm.internal.AbstractC10844k;
import org.jetbrains.annotations.NotNull;

@Metadata(m510bv = {1, 0, 3}, m509d1 = {"\u0000\f\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, m508d2 = {"<anonymous>", "", "Ljava/security/cert/Certificate;", "invoke"}, m507k = 3, m506mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class Handshake$Companion$handshake$1 extends AbstractC10844k implements InterfaceC10809a<List<? extends Certificate>> {
    final /* synthetic */ List $peerCertificatesCopy;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Handshake$Companion$handshake$1(List list) {
        super(0);
        this.$peerCertificatesCopy = list;
    }

    @Override // kotlin.jvm.functions.InterfaceC10809a
    @NotNull
    public final List<? extends Certificate> invoke() {
        return this.$peerCertificatesCopy;
    }
}
