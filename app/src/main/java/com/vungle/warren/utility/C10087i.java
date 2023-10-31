package com.vungle.warren.utility;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.vungle.warren.p058ui.C10011f;
import com.vungle.warren.p058ui.InterfaceC10009e;
import java.net.URISyntaxException;

/* renamed from: com.vungle.warren.utility.i */
/* loaded from: classes3.dex */
public final class C10087i {
    /* renamed from: a */
    public static Intent m1272a(String str, boolean z) {
        Intent intent = null;
        try {
            if (!TextUtils.isEmpty(str)) {
                intent = Intent.parseUri(str, 0);
            }
            if (intent != null && z) {
                intent.setFlags(268435456);
            }
        } catch (URISyntaxException e) {
            Log.e("i", "url format is not correct " + e.getLocalizedMessage());
        }
        return intent;
    }

    /* renamed from: b */
    public static boolean m1271b(@Nullable String str, @Nullable String str2, @NonNull Context context, @Nullable C10011f c10011f, boolean z, InterfaceC10009e interfaceC10009e) {
        if ((TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) || context == null) {
            return false;
        }
        try {
            C10069a.m1284d(context, m1272a(str, z), m1272a(str2, z), c10011f, interfaceC10009e);
            return true;
        } catch (Exception e) {
            Log.e("i", "Error while opening url" + e.getLocalizedMessage());
            Log.d("i", "Cannot open url " + str2);
            return false;
        }
    }
}
