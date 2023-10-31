package com.android.tool.util.proxy;

import android.annotation.SuppressLint;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;
import androidx.annotation.RequiresApi;

/* renamed from: com.android.tool.util.proxy.b */
/* loaded from: classes.dex */
public final class C2594b {

    /* renamed from: a */
    public static Context f6116a;

    @RequiresApi(api = 26)
    @SuppressLint({"WrongConstant"})
    /* renamed from: a */
    public static void m9346a(Context context) {
        f6116a = context;
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        if (Build.VERSION.SDK_INT >= 26) {
            NotificationChannel notificationChannel = new NotificationChannel("com.ambrose.overwall.WifiChannel", "WifiNotify-Channel", 5);
            notificationChannel.setDescription("WifiNotification-Channel");
            notificationChannel.enableLights(true);
            notificationChannel.setLightColor(-16711936);
            notificationManager.createNotificationChannel(notificationChannel);
        }
    }
}
