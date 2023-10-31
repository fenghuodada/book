package okhttp3;

import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.C10839f;
import kotlin.jvm.internal.C10843j;
import org.jetbrains.annotations.NotNull;

@Metadata(m510bv = {1, 0, 3}, m509d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0001\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0003H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, m508d2 = {"Lokhttp3/Protocol;", "", "protocol", "", "(Ljava/lang/String;ILjava/lang/String;)V", "toString", "HTTP_1_0", "HTTP_1_1", "SPDY_3", "HTTP_2", "H2_PRIOR_KNOWLEDGE", "QUIC", "Companion", "okhttp"}, m507k = 1, m506mv = {1, 4, 0})
/* loaded from: classes3.dex */
public enum Protocol {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2"),
    H2_PRIOR_KNOWLEDGE("h2_prior_knowledge"),
    QUIC("quic");
    
    public static final Companion Companion = new Companion(null);
    private final String protocol;

    @Metadata(m510bv = {1, 0, 3}, m509d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, m508d2 = {"Lokhttp3/Protocol$Companion;", "", "()V", "get", "Lokhttp3/Protocol;", "protocol", "", "okhttp"}, m507k = 1, m506mv = {1, 4, 0})
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C10839f c10839f) {
            this();
        }

        @JvmStatic
        @NotNull
        public final Protocol get(@NotNull String protocol) throws IOException {
            C10843j.m430f(protocol, "protocol");
            Protocol protocol2 = Protocol.HTTP_1_0;
            if (!C10843j.m435a(protocol, protocol2.protocol)) {
                protocol2 = Protocol.HTTP_1_1;
                if (!C10843j.m435a(protocol, protocol2.protocol)) {
                    protocol2 = Protocol.H2_PRIOR_KNOWLEDGE;
                    if (!C10843j.m435a(protocol, protocol2.protocol)) {
                        protocol2 = Protocol.HTTP_2;
                        if (!C10843j.m435a(protocol, protocol2.protocol)) {
                            protocol2 = Protocol.SPDY_3;
                            if (!C10843j.m435a(protocol, protocol2.protocol)) {
                                protocol2 = Protocol.QUIC;
                                if (!C10843j.m435a(protocol, protocol2.protocol)) {
                                    throw new IOException("Unexpected protocol: ".concat(protocol));
                                }
                            }
                        }
                    }
                }
            }
            return protocol2;
        }
    }

    Protocol(String str) {
        this.protocol = str;
    }

    @JvmStatic
    @NotNull
    public static final Protocol get(@NotNull String str) throws IOException {
        return Companion.get(str);
    }

    @Override // java.lang.Enum
    @NotNull
    public String toString() {
        return this.protocol;
    }
}
