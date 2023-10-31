package com.facebook.ads.redexgen.p036X;

import androidx.annotation.Nullable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.Proxy;

/* renamed from: com.facebook.ads.redexgen.X.RH */
/* loaded from: assets/audience_network.dex */
public interface InterfaceC5542RH {
    boolean AAl(C5540RF c5540rf);

    HttpURLConnection ACz(String str, @Nullable Proxy proxy) throws IOException;

    InputStream AD0(HttpURLConnection httpURLConnection) throws IOException;

    OutputStream AD1(HttpURLConnection httpURLConnection) throws IOException;

    void ADI(HttpURLConnection httpURLConnection, EnumC5538RD enumC5538RD, String str) throws IOException;

    byte[] ADe(InputStream inputStream) throws IOException;

    void AFk(OutputStream outputStream, byte[] bArr) throws IOException;
}
