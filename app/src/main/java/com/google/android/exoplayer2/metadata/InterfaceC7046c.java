package com.google.android.exoplayer2.metadata;

import com.google.android.exoplayer2.C7003m0;
import com.google.android.exoplayer2.metadata.dvbsi.C7051b;
import com.google.android.exoplayer2.metadata.emsg.C7055b;
import com.google.android.exoplayer2.metadata.icy.C7063a;
import com.google.android.exoplayer2.metadata.id3.C7080g;
import com.google.android.exoplayer2.metadata.scte35.C7108c;

/* renamed from: com.google.android.exoplayer2.metadata.c */
/* loaded from: classes.dex */
public interface InterfaceC7046c {

    /* renamed from: a */
    public static final C7047a f12491a = new C7047a();

    /* renamed from: com.google.android.exoplayer2.metadata.c$a */
    /* loaded from: classes.dex */
    public class C7047a implements InterfaceC7046c {
        @Override // com.google.android.exoplayer2.metadata.InterfaceC7046c
        /* renamed from: a */
        public final boolean mo5538a(C7003m0 c7003m0) {
            String str = c7003m0.f12287l;
            return "application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str);
        }

        @Override // com.google.android.exoplayer2.metadata.InterfaceC7046c
        /* renamed from: b */
        public final AbstractC7062g mo5537b(C7003m0 c7003m0) {
            String str;
            String str2 = c7003m0.f12287l;
            if (str2 != null) {
                char c = 65535;
                switch (str2.hashCode()) {
                    case -1354451219:
                        if (str2.equals("application/vnd.dvb.ait")) {
                            c = 0;
                            break;
                        }
                        break;
                    case -1348231605:
                        if (str2.equals("application/x-icy")) {
                            c = 1;
                            break;
                        }
                        break;
                    case -1248341703:
                        if (str2.equals("application/id3")) {
                            c = 2;
                            break;
                        }
                        break;
                    case 1154383568:
                        if (str2.equals("application/x-emsg")) {
                            c = 3;
                            break;
                        }
                        break;
                    case 1652648887:
                        if (str2.equals("application/x-scte35")) {
                            c = 4;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        return new C7051b();
                    case 1:
                        return new C7063a();
                    case 2:
                        return new C7080g(null);
                    case 3:
                        return new C7055b();
                    case 4:
                        return new C7108c();
                }
            }
            String valueOf = String.valueOf(str2);
            if (valueOf.length() != 0) {
                str = "Attempted to create decoder for unsupported MIME type: ".concat(valueOf);
            } else {
                str = new String("Attempted to create decoder for unsupported MIME type: ");
            }
            throw new IllegalArgumentException(str);
        }
    }

    /* renamed from: a */
    boolean mo5538a(C7003m0 c7003m0);

    /* renamed from: b */
    AbstractC7062g mo5537b(C7003m0 c7003m0);
}
