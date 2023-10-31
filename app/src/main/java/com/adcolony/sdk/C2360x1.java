package com.adcolony.sdk;

import androidx.appcompat.C0157c;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* renamed from: com.adcolony.sdk.x1 */
/* loaded from: classes.dex */
public final class C2360x1 {

    /* renamed from: e */
    public static final SimpleDateFormat f5674e = new SimpleDateFormat("yyyyMMdd'T'HHmmss.SSSZ", Locale.US);

    /* renamed from: a */
    public Date f5675a;

    /* renamed from: b */
    public int f5676b;

    /* renamed from: c */
    public C0157c f5677c;

    /* renamed from: d */
    public String f5678d;

    /* renamed from: a */
    public final String m9461a() {
        int i = this.f5676b;
        return i != -1 ? i != 0 ? i != 1 ? i != 2 ? i != 3 ? "UNKNOWN LOG LEVEL" : "Debug" : "Info" : "Warn" : "Error" : "Fatal";
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(f5674e.format(this.f5675a));
        sb.append(" ");
        sb.append(m9461a());
        sb.append("/Production: ");
        this.f5677c.getClass();
        sb.append(this.f5678d);
        return sb.toString();
    }
}
