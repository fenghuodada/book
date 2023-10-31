package okhttp3;

import androidx.appcompat.widget.C0406q1;
import java.security.Principal;
import java.security.PublicKey;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.collections.C10751g;
import kotlin.collections.C10757m;
import kotlin.collections.C10759o;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.InterfaceC10809a;
import kotlin.jvm.internal.C10833a0;
import kotlin.jvm.internal.C10839f;
import kotlin.jvm.internal.C10843j;
import kotlin.text.C10925n;
import kotlin.text.C10929r;
import okhttp3.internal.HostnamesKt;
import okhttp3.internal.tls.CertificateChainCleaner;
import okio.ByteString;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m509d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\"\n\u0002\b\r\u0018\u0000 &2\u00020\u0001:\u0003'&(B#\b\u0000\u0012\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00100\u001c\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b$\u0010%J\u001c\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004J+\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00040\tH\u0000¢\u0006\u0004\b\f\u0010\rJ+\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u000e\"\u00020\u0005H\u0007¢\u0006\u0004\b\b\u0010\u000fJ\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0017\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0012H\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u0013\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u001b\u001a\u00020\u001aH\u0016R\u001d\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00100\u001c8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0013\u0010!\u001a\u0004\b\"\u0010#¨\u0006)"}, m508d2 = {"Lokhttp3/CertificatePinner;", "", "", "hostname", "", "Ljava/security/cert/Certificate;", "peerCertificates", "Lkotlin/p;", "check", "Lkotlin/Function0;", "Ljava/security/cert/X509Certificate;", "cleanedPeerCertificatesFn", "check$okhttp", "(Ljava/lang/String;Lkotlin/jvm/functions/a;)V", "", "(Ljava/lang/String;[Ljava/security/cert/Certificate;)V", "Lokhttp3/CertificatePinner$Pin;", "findMatchingPins", "Lokhttp3/internal/tls/CertificateChainCleaner;", "certificateChainCleaner", "withCertificateChainCleaner$okhttp", "(Lokhttp3/internal/tls/CertificateChainCleaner;)Lokhttp3/CertificatePinner;", "withCertificateChainCleaner", "other", "", "equals", "", "hashCode", "", "pins", "Ljava/util/Set;", "getPins", "()Ljava/util/Set;", "Lokhttp3/internal/tls/CertificateChainCleaner;", "getCertificateChainCleaner$okhttp", "()Lokhttp3/internal/tls/CertificateChainCleaner;", "<init>", "(Ljava/util/Set;Lokhttp3/internal/tls/CertificateChainCleaner;)V", "Companion", "Builder", "Pin", "okhttp"}, m507k = 1, m506mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class CertificatePinner {
    public static final Companion Companion = new Companion(null);
    @JvmField
    @NotNull
    public static final CertificatePinner DEFAULT = new Builder().build();
    @Nullable
    private final CertificateChainCleaner certificateChainCleaner;
    @NotNull
    private final Set<Pin> pins;

    @Metadata(m510bv = {1, 0, 3}, m509d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J'\u0010\b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\n2\u0012\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0\u000b\"\u00020\n¢\u0006\u0002\u0010\fJ\u0006\u0010\r\u001a\u00020\u000eR\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, m508d2 = {"Lokhttp3/CertificatePinner$Builder;", "", "()V", "pins", "", "Lokhttp3/CertificatePinner$Pin;", "getPins", "()Ljava/util/List;", "add", "pattern", "", "", "(Ljava/lang/String;[Ljava/lang/String;)Lokhttp3/CertificatePinner$Builder;", "build", "Lokhttp3/CertificatePinner;", "okhttp"}, m507k = 1, m506mv = {1, 4, 0})
    /* loaded from: classes3.dex */
    public static final class Builder {
        @NotNull
        private final List<Pin> pins = new ArrayList();

        @NotNull
        public final Builder add(@NotNull String pattern, @NotNull String... pins) {
            C10843j.m430f(pattern, "pattern");
            C10843j.m430f(pins, "pins");
            for (String str : pins) {
                this.pins.add(new Pin(pattern, str));
            }
            return this;
        }

        @NotNull
        public final CertificatePinner build() {
            return new CertificatePinner(C10757m.m469t(this.pins), null, 2, null);
        }

        @NotNull
        public final List<Pin> getPins() {
            return this.pins;
        }
    }

    @Metadata(m510bv = {1, 0, 3}, m509d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\f\u0010\t\u001a\u00020\n*\u00020\u000bH\u0007J\f\u0010\f\u001a\u00020\n*\u00020\u000bH\u0007R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m508d2 = {"Lokhttp3/CertificatePinner$Companion;", "", "()V", "DEFAULT", "Lokhttp3/CertificatePinner;", "pin", "", "certificate", "Ljava/security/cert/Certificate;", "sha1Hash", "Lokio/ByteString;", "Ljava/security/cert/X509Certificate;", "sha256Hash", "okhttp"}, m507k = 1, m506mv = {1, 4, 0})
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C10839f c10839f) {
            this();
        }

        @JvmStatic
        @NotNull
        public final String pin(@NotNull Certificate certificate) {
            C10843j.m430f(certificate, "certificate");
            if (certificate instanceof X509Certificate) {
                return "sha256/" + sha256Hash((X509Certificate) certificate).base64();
            }
            throw new IllegalArgumentException("Certificate pinning requires X509 certificates".toString());
        }

        @JvmStatic
        @NotNull
        public final ByteString sha1Hash(@NotNull X509Certificate sha1Hash) {
            C10843j.m430f(sha1Hash, "$this$sha1Hash");
            ByteString.Companion companion = ByteString.Companion;
            PublicKey publicKey = sha1Hash.getPublicKey();
            C10843j.m431e(publicKey, "publicKey");
            byte[] encoded = publicKey.getEncoded();
            C10843j.m431e(encoded, "publicKey.encoded");
            return ByteString.Companion.of$default(companion, encoded, 0, 0, 3, null).sha1();
        }

        @JvmStatic
        @NotNull
        public final ByteString sha256Hash(@NotNull X509Certificate sha256Hash) {
            C10843j.m430f(sha256Hash, "$this$sha256Hash");
            ByteString.Companion companion = ByteString.Companion;
            PublicKey publicKey = sha256Hash.getPublicKey();
            C10843j.m431e(publicKey, "publicKey");
            byte[] encoded = publicKey.getEncoded();
            C10843j.m431e(encoded, "publicKey.encoded");
            return ByteString.Companion.of$default(companion, encoded, 0, 0, 3, null).sha256();
        }
    }

    @Metadata(m510bv = {1, 0, 3}, m509d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u000e\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0015J\u000e\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u0003J\b\u0010\u0018\u001a\u00020\u0003H\u0016R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0019"}, m508d2 = {"Lokhttp3/CertificatePinner$Pin;", "", "pattern", "", "pin", "(Ljava/lang/String;Ljava/lang/String;)V", "hash", "Lokio/ByteString;", "getHash", "()Lokio/ByteString;", "hashAlgorithm", "getHashAlgorithm", "()Ljava/lang/String;", "getPattern", "equals", "", "other", "hashCode", "", "matchesCertificate", "certificate", "Ljava/security/cert/X509Certificate;", "matchesHostname", "hostname", "toString", "okhttp"}, m507k = 1, m506mv = {1, 4, 0})
    /* loaded from: classes3.dex */
    public static final class Pin {
        @NotNull
        private final ByteString hash;
        @NotNull
        private final String hashAlgorithm;
        @NotNull
        private final String pattern;

        public Pin(@NotNull String pattern, @NotNull String pin) {
            ByteString decodeBase64;
            C10843j.m430f(pattern, "pattern");
            C10843j.m430f(pin, "pin");
            boolean z = true;
            if ((!C10925n.m392k(pattern, "*.", false) || C10929r.m373s(pattern, "*", 1, false, 4) != -1) && ((!C10925n.m392k(pattern, "**.", false) || C10929r.m373s(pattern, "*", 2, false, 4) != -1) && C10929r.m373s(pattern, "*", 0, false, 6) != -1)) {
                z = false;
            }
            if (z) {
                String canonicalHost = HostnamesKt.toCanonicalHost(pattern);
                if (canonicalHost != null) {
                    this.pattern = canonicalHost;
                    if (C10925n.m392k(pin, "sha1/", false)) {
                        this.hashAlgorithm = "sha1";
                        ByteString.Companion companion = ByteString.Companion;
                        String substring = pin.substring(5);
                        C10843j.m431e(substring, "(this as java.lang.String).substring(startIndex)");
                        decodeBase64 = companion.decodeBase64(substring);
                        if (decodeBase64 == null) {
                            throw new IllegalArgumentException("Invalid pin hash: ".concat(pin));
                        }
                    } else if (C10925n.m392k(pin, "sha256/", false)) {
                        this.hashAlgorithm = "sha256";
                        ByteString.Companion companion2 = ByteString.Companion;
                        String substring2 = pin.substring(7);
                        C10843j.m431e(substring2, "(this as java.lang.String).substring(startIndex)");
                        decodeBase64 = companion2.decodeBase64(substring2);
                        if (decodeBase64 == null) {
                            throw new IllegalArgumentException("Invalid pin hash: ".concat(pin));
                        }
                    } else {
                        throw new IllegalArgumentException("pins must start with 'sha256/' or 'sha1/': ".concat(pin));
                    }
                    this.hash = decodeBase64;
                    return;
                }
                throw new IllegalArgumentException("Invalid pattern: ".concat(pattern));
            }
            throw new IllegalArgumentException("Unexpected pattern: ".concat(pattern).toString());
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Pin) {
                Pin pin = (Pin) obj;
                return ((C10843j.m435a(this.pattern, pin.pattern) ^ true) || (C10843j.m435a(this.hashAlgorithm, pin.hashAlgorithm) ^ true) || (C10843j.m435a(this.hash, pin.hash) ^ true)) ? false : true;
            }
            return false;
        }

        @NotNull
        public final ByteString getHash() {
            return this.hash;
        }

        @NotNull
        public final String getHashAlgorithm() {
            return this.hashAlgorithm;
        }

        @NotNull
        public final String getPattern() {
            return this.pattern;
        }

        public int hashCode() {
            return this.hash.hashCode() + C0406q1.m12537a(this.hashAlgorithm, this.pattern.hashCode() * 31, 31);
        }

        public final boolean matchesCertificate(@NotNull X509Certificate certificate) {
            ByteString byteString;
            ByteString sha256Hash;
            C10843j.m430f(certificate, "certificate");
            String str = this.hashAlgorithm;
            int hashCode = str.hashCode();
            if (hashCode == -903629273) {
                if (str.equals("sha256")) {
                    byteString = this.hash;
                    sha256Hash = CertificatePinner.Companion.sha256Hash(certificate);
                    return C10843j.m435a(byteString, sha256Hash);
                }
                return false;
            }
            if (hashCode == 3528965 && str.equals("sha1")) {
                byteString = this.hash;
                sha256Hash = CertificatePinner.Companion.sha1Hash(certificate);
                return C10843j.m435a(byteString, sha256Hash);
            }
            return false;
        }

        public final boolean matchesHostname(@NotNull String hostname) {
            C10843j.m430f(hostname, "hostname");
            if (C10925n.m392k(this.pattern, "**.", false)) {
                int length = this.pattern.length() - 3;
                int length2 = hostname.length() - length;
                if (!C10925n.m395h(hostname.length() - length, 3, length, hostname, this.pattern, false)) {
                    return false;
                }
                if (length2 != 0 && hostname.charAt(length2 - 1) != '.') {
                    return false;
                }
            } else if (C10925n.m392k(this.pattern, "*.", false)) {
                int length3 = this.pattern.length() - 1;
                int length4 = hostname.length() - length3;
                if (!C10925n.m395h(hostname.length() - length3, 1, length3, hostname, this.pattern, false) || C10929r.m371u(hostname, '.', length4 - 1, 4) != -1) {
                    return false;
                }
            } else {
                return C10843j.m435a(hostname, this.pattern);
            }
            return true;
        }

        @NotNull
        public String toString() {
            return this.hashAlgorithm + '/' + this.hash.base64();
        }
    }

    public CertificatePinner(@NotNull Set<Pin> pins, @Nullable CertificateChainCleaner certificateChainCleaner) {
        C10843j.m430f(pins, "pins");
        this.pins = pins;
        this.certificateChainCleaner = certificateChainCleaner;
    }

    public /* synthetic */ CertificatePinner(Set set, CertificateChainCleaner certificateChainCleaner, int i, C10839f c10839f) {
        this(set, (i & 2) != 0 ? null : certificateChainCleaner);
    }

    @JvmStatic
    @NotNull
    public static final String pin(@NotNull Certificate certificate) {
        return Companion.pin(certificate);
    }

    @JvmStatic
    @NotNull
    public static final ByteString sha1Hash(@NotNull X509Certificate x509Certificate) {
        return Companion.sha1Hash(x509Certificate);
    }

    @JvmStatic
    @NotNull
    public static final ByteString sha256Hash(@NotNull X509Certificate x509Certificate) {
        return Companion.sha256Hash(x509Certificate);
    }

    public final void check(@NotNull String hostname, @NotNull List<? extends Certificate> peerCertificates) throws SSLPeerUnverifiedException {
        C10843j.m430f(hostname, "hostname");
        C10843j.m430f(peerCertificates, "peerCertificates");
        check$okhttp(hostname, new CertificatePinner$check$1(this, peerCertificates, hostname));
    }

    @Deprecated(message = "replaced with {@link #check(String, List)}.", replaceWith = @ReplaceWith(expression = "check(hostname, peerCertificates.toList())", imports = {}))
    public final void check(@NotNull String hostname, @NotNull Certificate... peerCertificates) throws SSLPeerUnverifiedException {
        C10843j.m430f(hostname, "hostname");
        C10843j.m430f(peerCertificates, "peerCertificates");
        check(hostname, C10751g.m489g(peerCertificates));
    }

    public final void check$okhttp(@NotNull String hostname, @NotNull InterfaceC10809a<? extends List<? extends X509Certificate>> cleanedPeerCertificatesFn) {
        C10843j.m430f(hostname, "hostname");
        C10843j.m430f(cleanedPeerCertificatesFn, "cleanedPeerCertificatesFn");
        List<Pin> findMatchingPins = findMatchingPins(hostname);
        if (findMatchingPins.isEmpty()) {
            return;
        }
        List<? extends X509Certificate> invoke = cleanedPeerCertificatesFn.invoke();
        for (X509Certificate x509Certificate : invoke) {
            ByteString byteString = null;
            ByteString byteString2 = null;
            for (Pin pin : findMatchingPins) {
                String hashAlgorithm = pin.getHashAlgorithm();
                int hashCode = hashAlgorithm.hashCode();
                if (hashCode != -903629273) {
                    if (hashCode == 3528965 && hashAlgorithm.equals("sha1")) {
                        if (byteString2 == null) {
                            byteString2 = Companion.sha1Hash(x509Certificate);
                        }
                        if (C10843j.m435a(pin.getHash(), byteString2)) {
                            return;
                        }
                    }
                    throw new AssertionError("unsupported hashAlgorithm: " + pin.getHashAlgorithm());
                } else if (!hashAlgorithm.equals("sha256")) {
                    throw new AssertionError("unsupported hashAlgorithm: " + pin.getHashAlgorithm());
                } else {
                    if (byteString == null) {
                        byteString = Companion.sha256Hash(x509Certificate);
                    }
                    if (C10843j.m435a(pin.getHash(), byteString)) {
                        return;
                    }
                }
            }
        }
        StringBuilder sb = new StringBuilder("Certificate pinning failure!\n  Peer certificate chain:");
        for (X509Certificate x509Certificate2 : invoke) {
            sb.append("\n    ");
            sb.append(Companion.pin(x509Certificate2));
            sb.append(": ");
            Principal subjectDN = x509Certificate2.getSubjectDN();
            C10843j.m431e(subjectDN, "element.subjectDN");
            sb.append(subjectDN.getName());
        }
        sb.append("\n  Pinned certificates for ");
        sb.append(hostname);
        sb.append(":");
        for (Pin pin2 : findMatchingPins) {
            sb.append("\n    ");
            sb.append(pin2);
        }
        String sb2 = sb.toString();
        C10843j.m431e(sb2, "StringBuilder().apply(builderAction).toString()");
        throw new SSLPeerUnverifiedException(sb2);
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof CertificatePinner) {
            CertificatePinner certificatePinner = (CertificatePinner) obj;
            if (C10843j.m435a(certificatePinner.pins, this.pins) && C10843j.m435a(certificatePinner.certificateChainCleaner, this.certificateChainCleaner)) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    public final List<Pin> findMatchingPins(@NotNull String hostname) {
        C10843j.m430f(hostname, "hostname");
        List list = C10759o.f21363a;
        for (Object obj : this.pins) {
            if (((Pin) obj).matchesHostname(hostname)) {
                if (list.isEmpty()) {
                    list = new ArrayList();
                }
                C10833a0.m440a(list).add(obj);
            }
        }
        return list;
    }

    @Nullable
    public final CertificateChainCleaner getCertificateChainCleaner$okhttp() {
        return this.certificateChainCleaner;
    }

    @NotNull
    public final Set<Pin> getPins() {
        return this.pins;
    }

    public int hashCode() {
        int hashCode = (this.pins.hashCode() + 1517) * 41;
        CertificateChainCleaner certificateChainCleaner = this.certificateChainCleaner;
        return hashCode + (certificateChainCleaner != null ? certificateChainCleaner.hashCode() : 0);
    }

    @NotNull
    public final CertificatePinner withCertificateChainCleaner$okhttp(@NotNull CertificateChainCleaner certificateChainCleaner) {
        C10843j.m430f(certificateChainCleaner, "certificateChainCleaner");
        return C10843j.m435a(this.certificateChainCleaner, certificateChainCleaner) ? this : new CertificatePinner(this.pins, certificateChainCleaner);
    }
}
