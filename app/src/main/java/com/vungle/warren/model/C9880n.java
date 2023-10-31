package com.vungle.warren.model;

import android.content.ContentValues;
import androidx.annotation.NonNull;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.C8686j;
import com.google.gson.C8693p;
import com.google.gson.C8695r;
import com.vungle.warren.persistence.InterfaceC9918b;
import java.io.IOException;
import java.io.StringWriter;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: com.vungle.warren.model.n */
/* loaded from: classes3.dex */
public final class C9880n implements InterfaceC9918b<C9879m> {
    @Override // com.vungle.warren.persistence.InterfaceC9918b
    /* renamed from: a */
    public final ContentValues mo1413a(C9879m c9879m) {
        String str;
        C9879m c9879m2 = c9879m;
        ContentValues contentValues = new ContentValues();
        C8695r c8695r = c9879m2.f19841c;
        C8686j c8686j = C9879m.f19838d;
        c8686j.getClass();
        StringWriter stringWriter = new StringWriter();
        try {
            c8686j.m3228j(c8695r, c8686j.m3231g(stringWriter));
            try {
                byte[] digest = MessageDigest.getInstance("SHA-256").digest(stringWriter.toString().getBytes());
                StringBuilder sb = new StringBuilder(digest.length);
                for (byte b : digest) {
                    String hexString = Integer.toHexString(b & 255);
                    if (hexString.length() == 1) {
                        hexString = "0" + hexString;
                    }
                    sb.append(hexString);
                }
                str = sb.toString();
            } catch (NoSuchAlgorithmException e) {
                e.printStackTrace();
                str = null;
            }
            C8695r c8695r2 = c9879m2.f19841c;
            if (str == null) {
                C8686j c8686j2 = C9879m.f19838d;
                c8686j2.getClass();
                StringWriter stringWriter2 = new StringWriter();
                try {
                    c8686j2.m3228j(c8695r2, c8686j2.m3231g(stringWriter2));
                    str = String.valueOf(stringWriter2.toString().hashCode());
                } catch (IOException e2) {
                    throw new C8693p(e2);
                }
            }
            contentValues.put(FirebaseAnalytics.Param.ITEM_ID, str);
            C8686j c8686j3 = C9879m.f19838d;
            c8686j3.getClass();
            StringWriter stringWriter3 = new StringWriter();
            try {
                c8686j3.m3228j(c8695r2, c8686j3.m3231g(stringWriter3));
                contentValues.put("json_string", stringWriter3.toString());
                contentValues.put("send_attempts", Integer.valueOf(c9879m2.f19840b));
                return contentValues;
            } catch (IOException e3) {
                throw new C8693p(e3);
            }
        } catch (IOException e4) {
            throw new C8693p(e4);
        }
    }

    @Override // com.vungle.warren.persistence.InterfaceC9918b
    @NonNull
    /* renamed from: b */
    public final C9879m mo1412b(ContentValues contentValues) {
        return new C9879m(contentValues.getAsString("json_string"), contentValues.getAsInteger("send_attempts").intValue());
    }

    @Override // com.vungle.warren.persistence.InterfaceC9918b
    public final String tableName() {
        return "session_data";
    }
}
