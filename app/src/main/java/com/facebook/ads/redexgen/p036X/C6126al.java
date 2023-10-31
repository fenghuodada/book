package com.facebook.ads.redexgen.p036X;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.util.HashMap;

/* renamed from: com.facebook.ads.redexgen.X.al */
/* loaded from: assets/audience_network.dex */
public class C6126al implements InterfaceC43306v {
    public final /* synthetic */ C6113aY A00;

    public C6126al(C6113aY c6113aY) {
        this.A00 = c6113aY;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC43306v
    public final AbstractC43457A A5J() throws CertificateException, PackageManager.NameNotFoundException, NoSuchAlgorithmException {
        Context context;
        Context context2;
        AbstractC43457A A05;
        context = this.A00.A00;
        PackageManager packageManager = context.getPackageManager();
        context2 = this.A00.A00;
        Signature[] signatureArr = packageManager.getPackageInfo(context2.getPackageName(), 64).signatures;
        HashMap hashMap = new HashMap();
        for (int i = 0; i < signatureArr.length; i++) {
            hashMap.put(Integer.valueOf(i), new C6114aZ(signatureArr[i]));
        }
        A05 = this.A00.A05(hashMap);
        return A05;
    }
}
