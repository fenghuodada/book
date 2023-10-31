package com.vungle.warren.persistence;

import android.database.Cursor;
import android.text.TextUtils;
import com.vungle.warren.VungleLogger;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.vungle.warren.persistence.n */
/* loaded from: classes3.dex */
public final class CallableC9950n implements Callable<List<String>> {

    /* renamed from: a */
    public final /* synthetic */ String f19973a;

    /* renamed from: b */
    public final /* synthetic */ int f19974b;

    /* renamed from: c */
    public final /* synthetic */ int f19975c;

    /* renamed from: d */
    public final /* synthetic */ C9928h f19976d;

    public CallableC9950n(C9928h c9928h, String str, int i, int i2) {
        this.f19976d = c9928h;
        this.f19973a = str;
        this.f19974b = i;
        this.f19975c = i2;
    }

    @Override // java.util.concurrent.Callable
    public final List<String> call() throws Exception {
        ArrayList arrayList;
        synchronized (this.f19976d) {
            String str = "bid_token != '' AND ( state = ? OR state = ? ) AND expire_time > ?";
            if (!TextUtils.isEmpty(this.f19973a)) {
                str = "bid_token != '' AND ( state = ? OR state = ? ) AND expire_time > ? AND placement_id = ?";
            }
            String str2 = str;
            String[] strArr = {"bid_token"};
            int i = 0;
            String[] strArr2 = {String.valueOf(0), String.valueOf(1), String.valueOf(System.currentTimeMillis() / 1000)};
            if (!TextUtils.isEmpty(this.f19973a)) {
                strArr2 = new String[]{String.valueOf(0), String.valueOf(1), String.valueOf(System.currentTimeMillis() / 1000), this.f19973a};
            }
            Cursor query = this.f19976d.f19929a.m1411a().query("advertisement", strArr, str2, strArr2, null, null, null, null);
            arrayList = new ArrayList();
            if (query != null) {
                while (query.moveToNext() && i < this.f19974b) {
                    try {
                        String string = query.getString(query.getColumnIndex("bid_token"));
                        if (string.getBytes().length + i <= this.f19974b) {
                            i += string.getBytes().length + this.f19975c;
                            arrayList.add(string);
                        }
                    } catch (Exception e) {
                        VungleLogger.m1605a(C9928h.class.getSimpleName(), "getAvailableBidTokens", e.toString());
                        arrayList = new ArrayList();
                    }
                }
                query.close();
            }
        }
        return arrayList;
    }
}
