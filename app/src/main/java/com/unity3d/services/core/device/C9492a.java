package com.unity3d.services.core.device;

import android.annotation.TargetApi;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.unity3d.services.core.log.C9549a;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

@TargetApi(9)
/* renamed from: com.unity3d.services.core.device.a */
/* loaded from: classes3.dex */
public class C9492a {

    /* renamed from: a */
    private static C9492a f18788a;

    /* renamed from: b */
    private String f18789b = null;

    /* renamed from: c */
    private boolean f18790c = false;

    /* renamed from: com.unity3d.services.core.device.a$b */
    /* loaded from: classes3.dex */
    public interface InterfaceC9494b extends IInterface {

        /* renamed from: com.unity3d.services.core.device.a$b$a */
        /* loaded from: classes3.dex */
        public static abstract class AbstractBinderC9495a extends Binder implements InterfaceC9494b {

            /* renamed from: com.unity3d.services.core.device.a$b$a$a */
            /* loaded from: classes3.dex */
            public static class C9496a implements InterfaceC9494b {

                /* renamed from: a */
                private final IBinder f18791a;

                public C9496a(IBinder iBinder) {
                    this.f18791a = iBinder;
                }

                @Override // com.unity3d.services.core.device.C9492a.InterfaceC9494b
                /* renamed from: a */
                public String mo2172a() throws RemoteException {
                    Parcel obtain = Parcel.obtain();
                    Parcel obtain2 = Parcel.obtain();
                    try {
                        obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                        this.f18791a.transact(1, obtain, obtain2, 0);
                        obtain2.readException();
                        return obtain2.readString();
                    } finally {
                        obtain2.recycle();
                        obtain.recycle();
                    }
                }

                @Override // com.unity3d.services.core.device.C9492a.InterfaceC9494b
                /* renamed from: a */
                public boolean mo2171a(boolean z) throws RemoteException {
                    Parcel obtain = Parcel.obtain();
                    Parcel obtain2 = Parcel.obtain();
                    try {
                        obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                        obtain.writeInt(z ? 1 : 0);
                        this.f18791a.transact(2, obtain, obtain2, 0);
                        obtain2.readException();
                        return obtain2.readInt() != 0;
                    } finally {
                        obtain2.recycle();
                        obtain.recycle();
                    }
                }

                @Override // android.os.IInterface
                public IBinder asBinder() {
                    return this.f18791a;
                }
            }

            /* renamed from: a */
            public static InterfaceC9494b m2173a(IBinder iBinder) {
                if (iBinder == null) {
                    return null;
                }
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                return (queryLocalInterface == null || !(queryLocalInterface instanceof InterfaceC9494b)) ? new C9496a(iBinder) : (InterfaceC9494b) queryLocalInterface;
            }
        }

        /* renamed from: a */
        String mo2172a() throws RemoteException;

        /* renamed from: a */
        boolean mo2171a(boolean z) throws RemoteException;
    }

    /* renamed from: com.unity3d.services.core.device.a$c */
    /* loaded from: classes3.dex */
    public class ServiceConnectionC9497c implements ServiceConnection {

        /* renamed from: a */
        boolean f18792a;

        /* renamed from: b */
        private final BlockingQueue<IBinder> f18793b;

        private ServiceConnectionC9497c() {
            this.f18792a = false;
            this.f18793b = new LinkedBlockingQueue();
        }

        /* renamed from: a */
        public IBinder m2170a() throws InterruptedException {
            if (this.f18792a) {
                throw new IllegalStateException();
            }
            this.f18792a = true;
            return this.f18793b.take();
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                this.f18793b.put(iBinder);
            } catch (InterruptedException unused) {
                C9549a.m2019b("Couldn't put service to binder que");
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    }

    /* renamed from: a */
    public static String m2178a() {
        return m2176b().f18789b;
    }

    /* renamed from: a */
    private void m2177a(Context context) {
        boolean z;
        ServiceConnectionC9497c serviceConnectionC9497c = new ServiceConnectionC9497c();
        Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
        intent.setPackage("com.google.android.gms");
        try {
            z = context.bindService(intent, serviceConnectionC9497c, 1);
        } catch (Exception e) {
            C9549a.m2023a("Couldn't bind to identifier service intent", e);
            z = false;
        }
        try {
            if (z) {
                try {
                    InterfaceC9494b m2173a = InterfaceC9494b.AbstractBinderC9495a.m2173a(serviceConnectionC9497c.m2170a());
                    this.f18789b = m2173a.mo2172a();
                    this.f18790c = m2173a.mo2171a(true);
                } catch (Exception e2) {
                    C9549a.m2023a("Couldn't get advertising info", e2);
                    if (!z) {
                        return;
                    }
                }
            }
            if (!z) {
                return;
            }
            context.unbindService(serviceConnectionC9497c);
        } catch (Throwable th) {
            if (z) {
                context.unbindService(serviceConnectionC9497c);
            }
            throw th;
        }
    }

    /* renamed from: b */
    private static C9492a m2176b() {
        if (f18788a == null) {
            f18788a = new C9492a();
        }
        return f18788a;
    }

    /* renamed from: b */
    public static void m2175b(Context context) {
        m2176b().m2177a(context);
    }

    /* renamed from: c */
    public static boolean m2174c() {
        return m2176b().f18790c;
    }
}
