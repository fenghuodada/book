package okhttp3.internal.tls;

import java.security.cert.Certificate;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import kotlin.Metadata;
import kotlin.collections.C10757m;
import kotlin.collections.C10759o;
import kotlin.jvm.internal.C10843j;
import kotlin.text.C10925n;
import kotlin.text.C10929r;
import okhttp3.internal.HostnamesKt;
import okhttp3.internal.Util;
import okio.Utf8;
import org.jetbrains.annotations.NotNull;

@Metadata(m510bv = {1, 0, 3}, m509d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\nJ\u001e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0004H\u0002J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0018\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u001c\u0010\u0012\u001a\u00020\u000e2\b\u0010\u0013\u001a\u0004\u0018\u00010\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\bH\u0002J\u0018\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\f\u0010\u0017\u001a\u00020\b*\u00020\bH\u0002J\f\u0010\u0018\u001a\u00020\u000e*\u00020\bH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0019"}, m508d2 = {"Lokhttp3/internal/tls/OkHostnameVerifier;", "Ljavax/net/ssl/HostnameVerifier;", "()V", "ALT_DNS_NAME", "", "ALT_IPA_NAME", "allSubjectAltNames", "", "", "certificate", "Ljava/security/cert/X509Certificate;", "getSubjectAltNames", "type", "verify", "", "host", "session", "Ljavax/net/ssl/SSLSession;", "verifyHostname", "hostname", "pattern", "verifyIpAddress", "ipAddress", "asciiToLowercase", "isAscii", "okhttp"}, m507k = 1, m506mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class OkHostnameVerifier implements HostnameVerifier {
    private static final int ALT_DNS_NAME = 2;
    private static final int ALT_IPA_NAME = 7;
    public static final OkHostnameVerifier INSTANCE = new OkHostnameVerifier();

    private OkHostnameVerifier() {
    }

    private final String asciiToLowercase(String str) {
        if (isAscii(str)) {
            Locale locale = Locale.US;
            C10843j.m431e(locale, "Locale.US");
            if (str != null) {
                String lowerCase = str.toLowerCase(locale);
                C10843j.m431e(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                return lowerCase;
            }
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        return str;
    }

    private final List<String> getSubjectAltNames(X509Certificate x509Certificate, int i) {
        Object obj;
        C10759o c10759o = C10759o.f21363a;
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames != null) {
                ArrayList arrayList = new ArrayList();
                for (List<?> list : subjectAlternativeNames) {
                    if (list != null && list.size() >= 2 && !(!C10843j.m435a(list.get(0), Integer.valueOf(i))) && (obj = list.get(1)) != null) {
                        arrayList.add((String) obj);
                    }
                }
                return arrayList;
            }
        } catch (CertificateParsingException unused) {
        }
        return c10759o;
    }

    private final boolean isAscii(String str) {
        return str.length() == ((int) Utf8.size$default(str, 0, 0, 3, null));
    }

    private final boolean verifyHostname(String str, String str2) {
        boolean z;
        boolean z2;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (!z && !C10925n.m392k(str, ".", false) && !C10925n.m399d(str, "..")) {
            if (str2 != null && str2.length() != 0) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (!z2 && !C10925n.m392k(str2, ".", false) && !C10925n.m399d(str2, "..")) {
                if (!C10925n.m399d(str, ".")) {
                    str = str.concat(".");
                }
                if (!C10925n.m399d(str2, ".")) {
                    str2 = str2.concat(".");
                }
                String asciiToLowercase = asciiToLowercase(str2);
                if (!C10929r.m379m(asciiToLowercase, "*")) {
                    return C10843j.m435a(str, asciiToLowercase);
                }
                if (!C10925n.m392k(asciiToLowercase, "*.", false) || C10929r.m374r(asciiToLowercase, '*', 1, false, 4) != -1 || str.length() < asciiToLowercase.length() || C10843j.m435a("*.", asciiToLowercase)) {
                    return false;
                }
                String substring = asciiToLowercase.substring(1);
                C10843j.m431e(substring, "(this as java.lang.String).substring(startIndex)");
                if (!C10925n.m399d(str, substring)) {
                    return false;
                }
                int length = str.length() - substring.length();
                if (length <= 0 || C10929r.m371u(str, '.', length - 1, 4) == -1) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    private final boolean verifyHostname(String str, X509Certificate x509Certificate) {
        String asciiToLowercase = asciiToLowercase(str);
        List<String> subjectAltNames = getSubjectAltNames(x509Certificate, 2);
        if ((subjectAltNames instanceof Collection) && subjectAltNames.isEmpty()) {
            return false;
        }
        for (String str2 : subjectAltNames) {
            if (INSTANCE.verifyHostname(asciiToLowercase, str2)) {
                return true;
            }
        }
        return false;
    }

    private final boolean verifyIpAddress(String str, X509Certificate x509Certificate) {
        String canonicalHost = HostnamesKt.toCanonicalHost(str);
        List<String> subjectAltNames = getSubjectAltNames(x509Certificate, 7);
        if ((subjectAltNames instanceof Collection) && subjectAltNames.isEmpty()) {
            return false;
        }
        for (String str2 : subjectAltNames) {
            if (C10843j.m435a(canonicalHost, HostnamesKt.toCanonicalHost(str2))) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    public final List<String> allSubjectAltNames(@NotNull X509Certificate certificate) {
        C10843j.m430f(certificate, "certificate");
        List<String> subjectAltNames = getSubjectAltNames(certificate, 7);
        return C10757m.m474o(getSubjectAltNames(certificate, 2), subjectAltNames);
    }

    public final boolean verify(@NotNull String host, @NotNull X509Certificate certificate) {
        C10843j.m430f(host, "host");
        C10843j.m430f(certificate, "certificate");
        return Util.canParseAsIpAddress(host) ? verifyIpAddress(host, certificate) : verifyHostname(host, certificate);
    }

    @Override // javax.net.ssl.HostnameVerifier
    public boolean verify(@NotNull String host, @NotNull SSLSession session) {
        Certificate certificate;
        C10843j.m430f(host, "host");
        C10843j.m430f(session, "session");
        if (isAscii(host)) {
            try {
                certificate = session.getPeerCertificates()[0];
                if (certificate == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.security.cert.X509Certificate");
                }
            } catch (SSLException unused) {
                return false;
            }
        }
        return verify(host, (X509Certificate) certificate);
    }
}
