package libv2ray;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkRequest;
import android.net.VpnService;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.os.StrictMode;
import android.util.Log;
import androidx.annotation.RequiresApi;
import com.ambrose.overwall.R;
import com.ambrose.overwall.p007v2.C2524e;
import com.ambrose.overwall.p007v2.C2525f;
import com.ambrose.overwall.p007v2.InterfaceC2522c;
import com.android.tool.util.util.C2603g;
import com.google.android.gms.common.ConnectionResult;
import java.io.File;
import java.io.FileDescriptor;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.C10795h;
import kotlin.InterfaceC10794g;
import kotlin.Metadata;
import kotlin.collections.C10752h;
import kotlin.coroutines.C10781g;
import kotlin.coroutines.InterfaceC10773e;
import kotlin.coroutines.InterfaceC10775f;
import kotlin.jvm.internal.C10843j;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.C10929r;
import kotlinx.coroutines.AbstractC10936a;
import kotlinx.coroutines.C11093p0;
import kotlinx.coroutines.C11094p1;
import kotlinx.coroutines.C11153w1;
import kotlinx.coroutines.C11160z;
import kotlinx.coroutines.scheduling.C11107c;
import libv2ray.GoFlyVpnService$defaultNetworkCallback$2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p059go.Seq;

@Metadata(m509d1 = {"\u0000_\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\b*\u00014\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b9\u0010:J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u0012\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0002J\b\u0010\b\u001a\u00020\u0003H\u0002J\b\u0010\t\u001a\u00020\u0003H\u0002J\b\u0010\n\u001a\u00020\u0003H\u0016J\b\u0010\u000b\u001a\u00020\u0003H\u0016J\b\u0010\f\u001a\u00020\u0003H\u0016J\b\u0010\r\u001a\u00020\u0003H\u0016J\"\u0010\u0013\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010H\u0016J\b\u0010\u0015\u001a\u00020\u0014H\u0016J\b\u0010\u0016\u001a\u00020\u0003H\u0016J\b\u0010\u0017\u001a\u00020\u0003H\u0016J\u0010\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0010H\u0016R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u001d\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001a8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u001e\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\u001a8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u001f\u0010\u001cR\u0018\u0010!\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010#\u001a\u00020\u00108\u0002X\u0082D¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010&\u001a\u00020%8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b&\u0010'R#\u0010.\u001a\n )*\u0004\u0018\u00010(0(8BX\u0083\u0084\u0002¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u001b\u00103\u001a\u00020/8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b0\u0010+\u001a\u0004\b1\u00102R\u001b\u00108\u001a\u0002048BX\u0083\u0084\u0002¢\u0006\f\n\u0004\b5\u0010+\u001a\u0004\b6\u00107¨\u0006;"}, m508d2 = {"Llibv2ray/GoFlyVpnService;", "Landroid/net/VpnService;", "Lcom/ambrose/overwall/v2/c;", "Lkotlin/p;", "setup", "", "isForced", "stopV2Ray", "runTun2socks", "sendFd", "onCreate", "onRevoke", "onLowMemory", "onDestroy", "Landroid/content/Intent;", "intent", "", "flags", "startId", "onStartCommand", "Landroid/app/Service;", "getService", "startService", "stopService", "socket", "vpnProtect", "", "PRIVATE_VLAN4_CLIENT", "Ljava/lang/String;", "PRIVATE_VLAN4_ROUTER", "PRIVATE_VLAN6_CLIENT", "TUN2SOCKS", "Ljava/lang/Process;", "process", "Ljava/lang/Process;", "VPN_MTU", "I", "Landroid/os/ParcelFileDescriptor;", "mInterface", "Landroid/os/ParcelFileDescriptor;", "Landroid/net/NetworkRequest;", "kotlin.jvm.PlatformType", "defaultNetworkRequest$delegate", "Lkotlin/g;", "getDefaultNetworkRequest", "()Landroid/net/NetworkRequest;", "defaultNetworkRequest", "Landroid/net/ConnectivityManager;", "connectivity$delegate", "getConnectivity", "()Landroid/net/ConnectivityManager;", "connectivity", "libv2ray/GoFlyVpnService$defaultNetworkCallback$2$1", "defaultNetworkCallback$delegate", "getDefaultNetworkCallback", "()Llibv2ray/GoFlyVpnService$defaultNetworkCallback$2$1;", "defaultNetworkCallback", "<init>", "()V", "app_release"}, m507k = 1, m506mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nGoFlyVpnService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GoFlyVpnService.kt\nlibv2ray/GoFlyVpnService\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,258:1\n13579#2,2:259\n1855#3,2:261\n*S KotlinDebug\n*F\n+ 1 GoFlyVpnService.kt\nlibv2ray/GoFlyVpnService\n*L\n95#1:259,2\n112#1:261,2\n*E\n"})
/* loaded from: classes3.dex */
public final class GoFlyVpnService extends VpnService implements InterfaceC2522c {
    private ParcelFileDescriptor mInterface;
    @Nullable
    private Process process;
    @NotNull
    private final String PRIVATE_VLAN4_CLIENT = "26.26.26.1";
    @NotNull
    private final String PRIVATE_VLAN4_ROUTER = "26.26.26.2";
    @NotNull
    private final String PRIVATE_VLAN6_CLIENT = "da26:2626::1";
    @NotNull
    private final String TUN2SOCKS = "libtun2socks.so";
    private final int VPN_MTU = ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED;
    @RequiresApi(28)
    @NotNull
    private final InterfaceC10794g defaultNetworkRequest$delegate = C10795h.m446a(GoFlyVpnService$defaultNetworkRequest$2.INSTANCE);
    @NotNull
    private final InterfaceC10794g connectivity$delegate = C10795h.m446a(new GoFlyVpnService$connectivity$2(this));
    @RequiresApi(28)
    @NotNull
    private final InterfaceC10794g defaultNetworkCallback$delegate = C10795h.m446a(new GoFlyVpnService$defaultNetworkCallback$2(this));

    private final ConnectivityManager getConnectivity() {
        return (ConnectivityManager) this.connectivity$delegate.getValue();
    }

    private final GoFlyVpnService$defaultNetworkCallback$2.C111651 getDefaultNetworkCallback() {
        return (GoFlyVpnService$defaultNetworkCallback$2.C111651) this.defaultNetworkCallback$delegate.getValue();
    }

    private final NetworkRequest getDefaultNetworkRequest() {
        return (NetworkRequest) this.defaultNetworkRequest$delegate.getValue();
    }

    private final void runTun2socks() {
        C2524e c2524e = C2524e.f6008a;
        Context applicationContext = getApplicationContext();
        C10843j.m431e(applicationContext, "applicationContext");
        ArrayList m488a = C10752h.m488a(new File(getApplicationContext().getApplicationInfo().nativeLibraryDir, this.TUN2SOCKS).getAbsolutePath(), "--netif-ipaddr", this.PRIVATE_VLAN4_ROUTER, "--netif-netmask", "255.255.255.252", "--socks-server-addr", "127.0.0.1:10808", "--tunmtu", "1500", "--sock-path", new File(C2524e.m9391f(applicationContext), "sock_path").getAbsolutePath(), "--enable-udprelay", "--loglevel", "notice");
        m488a.add("--dnsgw");
        m488a.add(C10843j.m425k(Integer.valueOf(Integer.parseInt("10853")), "127.0.0.1:"));
        try {
            ProcessBuilder processBuilder = new ProcessBuilder(m488a);
            processBuilder.redirectErrorStream(true);
            this.process = processBuilder.directory(getApplicationContext().getFilesDir()).start();
            getPackageName();
            if (this.process != null) {
                sendFd();
            }
        } catch (Exception e) {
            Log.e(getPackageName(), e.toString());
        }
    }

    private final void sendFd() {
        int i;
        AbstractC10936a c11153w1;
        ParcelFileDescriptor parcelFileDescriptor = this.mInterface;
        if (parcelFileDescriptor != null) {
            FileDescriptor fileDescriptor = parcelFileDescriptor.getFileDescriptor();
            C2524e c2524e = C2524e.f6008a;
            Context applicationContext = getApplicationContext();
            C10843j.m431e(applicationContext, "applicationContext");
            String absolutePath = new File(C2524e.m9391f(applicationContext), "sock_path").getAbsolutePath();
            InterfaceC10775f interfaceC10775f = C11093p0.f21709b;
            GoFlyVpnService$sendFd$1 goFlyVpnService$sendFd$1 = new GoFlyVpnService$sendFd$1(this, absolutePath, fileDescriptor, null);
            boolean z = true & true;
            InterfaceC10775f interfaceC10775f2 = C10781g.f21377a;
            if (z) {
                interfaceC10775f = interfaceC10775f2;
            }
            boolean z2 = false;
            if (true & true) {
                i = 1;
            } else {
                i = 0;
            }
            InterfaceC10775f m102a = C11160z.m102a(interfaceC10775f2, interfaceC10775f, true);
            C11107c c11107c = C11093p0.f21708a;
            if (m102a != c11107c && m102a.mo195a(InterfaceC10773e.C10774a.f21375a) == null) {
                m102a = m102a.mo190f(c11107c);
            }
            if (i != 0) {
                if (i == 2) {
                    z2 = true;
                }
                if (z2) {
                    c11153w1 = new C11094p1(m102a, goFlyVpnService$sendFd$1);
                } else {
                    c11153w1 = new C11153w1(m102a, true);
                }
                c11153w1.m355d0(i, c11153w1, goFlyVpnService$sendFd$1);
                return;
            }
            throw null;
        }
        C10843j.m424l("mInterface");
        throw null;
    }

    private final void setup() {
        String str;
        ParcelFileDescriptor parcelFileDescriptor;
        if (VpnService.prepare(this) != null) {
            return;
        }
        VpnService.Builder builder = new VpnService.Builder(this);
        builder.setMtu(this.VPN_MTU);
        builder.addAddress(this.PRIVATE_VLAN4_CLIENT, 30);
        builder.addAddress(this.PRIVATE_VLAN6_CLIENT, 126);
        String[] stringArray = getResources().getStringArray(R.array.bypass_private_ip_address);
        C10843j.m431e(stringArray, "resources.getStringArray…ypass_private_ip_address)");
        for (String cidr : stringArray) {
            C10843j.m431e(cidr, "cidr");
            List m387E = C10929r.m387E(cidr, new char[]{'/'});
            builder.addRoute((String) m387E.get(0), Integer.parseInt((String) m387E.get(1)));
        }
        builder.addDnsServer(this.PRIVATE_VLAN4_ROUTER);
        ServerConfig serverConfig = C2525f.f6014e;
        if (serverConfig != null) {
            str = serverConfig.getRemarks();
        } else {
            str = null;
        }
        if (str == null) {
            str = "";
        }
        builder.setSession(str);
        if (C2603g.f6120a == null) {
            C2603g.f6120a = C2603g.f6121b.getSharedPreferences("OverWall", 0);
        }
        Set<String> stringSet = C2603g.f6120a.getStringSet("REJECTAPP", null);
        if (stringSet != null) {
            for (String str2 : stringSet) {
                try {
                    builder.addDisallowedApplication(str2);
                    Log.e("---", "setup: " + str2);
                } catch (PackageManager.NameNotFoundException unused) {
                }
            }
        }
        try {
            parcelFileDescriptor = this.mInterface;
        } catch (Exception unused2) {
        }
        if (parcelFileDescriptor != null) {
            parcelFileDescriptor.close();
            if (Build.VERSION.SDK_INT >= 28) {
                try {
                    getConnectivity().requestNetwork(getDefaultNetworkRequest(), getDefaultNetworkCallback());
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            if (Build.VERSION.SDK_INT >= 29) {
                builder.setMetered(false);
            }
            try {
                ParcelFileDescriptor establish = builder.establish();
                C10843j.m433c(establish);
                this.mInterface = establish;
                runTun2socks();
                return;
            } catch (Exception e2) {
                e2.printStackTrace();
                stopV2Ray$default(this, false, 1, null);
                return;
            }
        }
        C10843j.m424l("mInterface");
        throw null;
    }

    private final void stopV2Ray(boolean z) {
        if (Build.VERSION.SDK_INT >= 28) {
            try {
                getConnectivity().unregisterNetworkCallback(getDefaultNetworkCallback());
            } catch (Exception unused) {
            }
        }
        try {
            Log.e(getPackageName(), "tun2socks destroy");
            Process process = this.process;
            if (process != null) {
                process.destroy();
                C2525f.m9386e();
                if (z) {
                    stopSelf();
                    try {
                        ParcelFileDescriptor parcelFileDescriptor = this.mInterface;
                        if (parcelFileDescriptor != null) {
                            parcelFileDescriptor.close();
                        } else {
                            C10843j.m424l("mInterface");
                            throw null;
                        }
                    } catch (Exception unused2) {
                    }
                }
            }
        } catch (Exception e) {
            Log.e(getPackageName(), e.toString());
        }
    }

    public static /* synthetic */ void stopV2Ray$default(GoFlyVpnService goFlyVpnService, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        goFlyVpnService.stopV2Ray(z);
    }

    @Override // com.ambrose.overwall.p007v2.InterfaceC2522c
    @NotNull
    public Service getService() {
        return this;
    }

    @Override // android.app.Service
    public void onCreate() {
        Context context;
        String absolutePath;
        String str;
        Service service;
        super.onCreate();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().permitAll().build());
        String str2 = C2525f.f6010a;
        SoftReference<InterfaceC2522c> softReference = new SoftReference<>(this);
        C2525f.f6013d = softReference;
        InterfaceC2522c interfaceC2522c = softReference.get();
        if (interfaceC2522c != null && (service = interfaceC2522c.getService()) != null) {
            context = service.getApplicationContext();
        } else {
            context = null;
        }
        if (context != null) {
            Seq.setContext(context);
        }
        C2524e c2524e = C2524e.f6008a;
        if (context == null) {
            absolutePath = "";
        } else {
            File externalFilesDir = context.getExternalFilesDir("assets");
            if (externalFilesDir == null) {
                absolutePath = context.getDir("assets", 0).getAbsolutePath();
                str = "context.getDir(AppConfig.DIR_ASSETS, 0).absolutePath";
            } else {
                absolutePath = externalFilesDir.getAbsolutePath();
                str = "externalFilesDir.absolutePath";
            }
            C10843j.m431e(absolutePath, str);
        }
        Libv2ray.initV2Env(absolutePath);
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        stopV2Ray$default(this, false, 1, null);
    }

    @Override // android.app.Service, android.content.ComponentCallbacks
    public void onLowMemory() {
        stopV2Ray$default(this, false, 1, null);
        super.onLowMemory();
    }

    @Override // android.net.VpnService
    public void onRevoke() {
        stopV2Ray$default(this, false, 1, null);
    }

    @Override // android.app.Service
    public int onStartCommand(@Nullable Intent intent, int i, int i2) {
        C2525f.m9387d();
        return 1;
    }

    @Override // com.ambrose.overwall.p007v2.InterfaceC2522c
    public void startService() {
        setup();
    }

    @Override // com.ambrose.overwall.p007v2.InterfaceC2522c
    public void stopService() {
        stopV2Ray(true);
    }

    @Override // com.ambrose.overwall.p007v2.InterfaceC2522c
    public boolean vpnProtect(int i) {
        return protect(i);
    }
}
