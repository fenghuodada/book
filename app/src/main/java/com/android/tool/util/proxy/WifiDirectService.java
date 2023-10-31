package com.android.tool.util.proxy;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.IBinder;
import android.util.Log;
import androidx.annotation.RequiresApi;
import com.ambrose.overwall.R;
import com.android.tool.ApplicationC2534a;
import com.android.tool.util.proxy.C2591a;
import java.util.Timer;
import java.util.TimerTask;
import java.util.Vector;

/* loaded from: classes.dex */
public class WifiDirectService extends Service {

    /* renamed from: a */
    public static C2590b f6094a = null;

    /* renamed from: b */
    public static IntentFilter f6095b = null;

    /* renamed from: c */
    public static boolean f6096c = false;

    /* renamed from: d */
    public static C2591a f6097d;

    /* renamed from: e */
    public static Timer f6098e;

    /* renamed from: com.android.tool.util.proxy.WifiDirectService$a */
    /* loaded from: classes.dex */
    public class C2589a extends TimerTask {
        public C2589a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        @RequiresApi(api = 26)
        public final void run() {
            if (WifiDirectService.f6097d == null) {
                return;
            }
            if (C2591a.f6102d < System.currentTimeMillis() - 900000) {
                WifiDirectService wifiDirectService = WifiDirectService.this;
                wifiDirectService.getClass();
                WifiDirectService.m9354b();
                try {
                    Thread.sleep(1000L);
                } catch (Exception unused) {
                }
                wifiDirectService.m9355a();
            }
        }
    }

    /* renamed from: com.android.tool.util.proxy.WifiDirectService$b */
    /* loaded from: classes.dex */
    public class C2590b extends BroadcastReceiver {
        public C2590b() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            action.getClass();
            if (!action.equals("com.ambrose.overwall.action.STOP")) {
                if (action.equals("com.ambrose.overwall.action.GET_STATUS")) {
                    Intent intent2 = new Intent();
                    intent2.setAction("com.ambrose.overwall.action.SEND_STATUS");
                    context.sendBroadcast(intent2);
                    return;
                }
                return;
            }
            C2590b c2590b = WifiDirectService.f6094a;
            WifiDirectService.this.stopForeground(true);
            WifiDirectService.m9354b();
        }
    }

    /* renamed from: b */
    public static void m9354b() {
        C2591a c2591a = f6097d;
        if (c2591a != null) {
            Log.e("ProxyServer", " ProxyServer.close()");
            try {
                c2591a.f6103a.close();
            } catch (Exception unused) {
            }
            while (true) {
                Vector<C2591a.C2592a> vector = C2591a.f6101c;
                if (vector.size() <= 0) {
                    break;
                }
                vector.get(0).m9353b();
            }
            f6097d = null;
            Timer timer = f6098e;
            if (timer != null) {
                timer.cancel();
                f6098e = null;
            }
        }
        f6096c = false;
    }

    @RequiresApi(api = 26)
    /* renamed from: a */
    public final void m9355a() {
        if (f6097d == null) {
            C2591a c2591a = new C2591a();
            f6097d = c2591a;
            c2591a.start();
            Timer timer = new Timer();
            f6098e = timer;
            timer.schedule(new C2589a(), 60000L, 60000L);
        }
        f6096c = true;
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final void onDestroy() {
        C2590b c2590b = f6094a;
        if (c2590b != null) {
            unregisterReceiver(c2590b);
            f6094a = null;
        }
    }

    @Override // android.app.Service
    @RequiresApi(api = 26)
    public final int onStartCommand(Intent intent, int i, int i2) {
        if (intent == null) {
            return 1;
        }
        intent.getAction();
        IntentFilter intentFilter = new IntentFilter();
        f6095b = intentFilter;
        intentFilter.addAction("com.ambrose.overwall.action.STOP");
        f6095b.addAction("com.ambrose.overwall.action.GET_STATUS");
        f6095b.addAction("android.net.wifi.p2p.STATE_CHANGED");
        f6095b.addAction("android.net.wifi.p2p.PEERS_CHANGED");
        f6095b.addAction("android.net.wifi.p2p.CONNECTION_STATE_CHANGE");
        f6095b.addAction("android.net.wifi.p2p.THIS_DEVICE_CHANGED");
        C2590b c2590b = new C2590b();
        f6094a = c2590b;
        registerReceiver(c2590b, f6095b);
        Intent intent2 = new Intent();
        intent2.setFlags(536870912);
        Notification.Builder contentIntent = new Notification.Builder(C2594b.f6116a).setSmallIcon(R.mipmap.ic_proxy).setContentTitle(ApplicationC2534a.f6025a.getString(R.string.local_running)).setContentText(null).setTicker(ApplicationC2534a.f6025a.getString(R.string.app_name)).setPriority(1).setContentIntent(PendingIntent.getActivity(ApplicationC2534a.f6025a, 0, intent2, 33554432));
        if (Build.VERSION.SDK_INT >= 26) {
            contentIntent.setChannelId("com.ambrose.overwall.WifiChannel");
        }
        startForeground(2, contentIntent.build());
        m9355a();
        return 1;
    }
}
