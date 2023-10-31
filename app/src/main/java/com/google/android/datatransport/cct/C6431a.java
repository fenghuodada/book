package com.google.android.datatransport.cct;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.datatransport.C6429b;
import com.google.android.datatransport.runtime.InterfaceC6502f;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

/* renamed from: com.google.android.datatransport.cct.a */
/* loaded from: classes.dex */
public final class C6431a implements InterfaceC6502f {

    /* renamed from: c */
    public static final String f10060c = C6436d.m6350c("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");

    /* renamed from: d */
    public static final Set<C6429b> f10061d;

    /* renamed from: e */
    public static final C6431a f10062e;
    @NonNull

    /* renamed from: a */
    public final String f10063a;
    @Nullable

    /* renamed from: b */
    public final String f10064b;

    static {
        String m6350c = C6436d.m6350c("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        String m6350c2 = C6436d.m6350c("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        f10061d = Collections.unmodifiableSet(new HashSet(Arrays.asList(new C6429b("proto"), new C6429b("json"))));
        f10062e = new C6431a(m6350c, m6350c2);
    }

    public C6431a(@NonNull String str, @Nullable String str2) {
        this.f10063a = str;
        this.f10064b = str2;
    }

    @NonNull
    /* renamed from: a */
    public static C6431a m6353a(@NonNull byte[] bArr) {
        String str = new String(bArr, Charset.forName("UTF-8"));
        if (str.startsWith("1$")) {
            String[] split = str.substring(2).split(Pattern.quote("\\"), 2);
            if (split.length == 2) {
                String str2 = split[0];
                if (str2.isEmpty()) {
                    throw new IllegalArgumentException("Missing endpoint in CCTDestination extras");
                }
                String str3 = split[1];
                if (str3.isEmpty()) {
                    str3 = null;
                }
                return new C6431a(str2, str3);
            }
            throw new IllegalArgumentException("Extra is not a valid encoded LegacyFlgDestination");
        }
        throw new IllegalArgumentException("Version marker missing from extras");
    }

    @Nullable
    /* renamed from: b */
    public final byte[] m6352b() {
        String str = this.f10063a;
        String str2 = this.f10064b;
        if (str2 == null && str == null) {
            return null;
        }
        Object[] objArr = new Object[4];
        objArr[0] = "1$";
        objArr[1] = str;
        objArr[2] = "\\";
        if (str2 == null) {
            str2 = "";
        }
        objArr[3] = str2;
        return String.format("%s%s%s%s", objArr).getBytes(Charset.forName("UTF-8"));
    }
}
