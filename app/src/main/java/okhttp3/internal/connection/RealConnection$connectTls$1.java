package okhttp3.internal.connection;

import java.security.cert.Certificate;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.InterfaceC10809a;
import kotlin.jvm.internal.AbstractC10844k;
import kotlin.jvm.internal.C10843j;
import okhttp3.Address;
import okhttp3.CertificatePinner;
import okhttp3.Handshake;
import okhttp3.internal.tls.CertificateChainCleaner;
import org.jetbrains.annotations.NotNull;

@Metadata(m510bv = {1, 0, 3}, m509d1 = {"\u0000\f\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, m508d2 = {"<anonymous>", "", "Ljava/security/cert/Certificate;", "invoke"}, m507k = 3, m506mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class RealConnection$connectTls$1 extends AbstractC10844k implements InterfaceC10809a<List<? extends Certificate>> {
    final /* synthetic */ Address $address;
    final /* synthetic */ CertificatePinner $certificatePinner;
    final /* synthetic */ Handshake $unverifiedHandshake;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealConnection$connectTls$1(CertificatePinner certificatePinner, Handshake handshake, Address address) {
        super(0);
        this.$certificatePinner = certificatePinner;
        this.$unverifiedHandshake = handshake;
        this.$address = address;
    }

    @Override // kotlin.jvm.functions.InterfaceC10809a
    @NotNull
    public final List<? extends Certificate> invoke() {
        CertificateChainCleaner certificateChainCleaner$okhttp = this.$certificatePinner.getCertificateChainCleaner$okhttp();
        C10843j.m433c(certificateChainCleaner$okhttp);
        return certificateChainCleaner$okhttp.clean(this.$unverifiedHandshake.peerCertificates(), this.$address.url().host());
    }
}
