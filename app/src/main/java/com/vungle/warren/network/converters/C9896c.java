package com.vungle.warren.network.converters;

import com.google.gson.C8686j;
import com.google.gson.C8688k;
import com.google.gson.C8695r;
import com.vungle.warren.network.C9897d;
import java.io.IOException;
import okhttp3.ResponseBody;

/* renamed from: com.vungle.warren.network.converters.c */
/* loaded from: classes3.dex */
public final class C9896c implements InterfaceC9894a<ResponseBody, C8695r> {

    /* renamed from: a */
    public static final C8686j f19873a = new C8688k().m3226a();

    @Override // com.vungle.warren.network.converters.InterfaceC9894a
    /* renamed from: a */
    public final Object mo1433a(C9897d.C9898a c9898a) throws IOException {
        try {
            return (C8695r) f19873a.m3235c(C8695r.class, c9898a.string());
        } finally {
            c9898a.close();
        }
    }
}
