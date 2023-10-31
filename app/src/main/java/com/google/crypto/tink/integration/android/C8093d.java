package com.google.crypto.tink.integration.android;

import android.app.Application;
import android.content.SharedPreferences;
import androidx.cardview.C0463a;
import java.io.CharConversionException;
import java.io.FileNotFoundException;
import java.io.IOException;

/* renamed from: com.google.crypto.tink.integration.android.d */
/* loaded from: classes3.dex */
public final class C8093d {

    /* renamed from: a */
    public final SharedPreferences f15893a;

    /* renamed from: b */
    public final String f15894b;

    public C8093d(Application application, String str) throws IOException {
        this.f15894b = str;
        this.f15893a = application.getApplicationContext().getSharedPreferences("Temporises", 0);
    }

    /* renamed from: a */
    public final byte[] m4183a() throws IOException {
        String str = this.f15894b;
        try {
            String string = this.f15893a.getString(str, null);
            if (string != null) {
                return C0463a.m12439b(string);
            }
            throw new FileNotFoundException(String.format("can't read keyset; the pref value %s does not exist", str));
        } catch (ClassCastException | IllegalArgumentException unused) {
            throw new CharConversionException(String.format("can't read keyset; the pref value %s is not a valid hex string", str));
        }
    }
}
