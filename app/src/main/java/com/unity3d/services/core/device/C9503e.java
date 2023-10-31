package com.unity3d.services.core.device;

import android.annotation.TargetApi;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Binder;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.unity3d.services.core.log.C9549a;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

@TargetApi(9)
/* renamed from: com.unity3d.services.core.device.e */
/* loaded from: classes3.dex */
public class C9503e {

    /* renamed from: a */
    private static C9503e f18810a;

    /* renamed from: b */
    private String f18811b = null;

    /* renamed from: c */
    private boolean f18812c = false;

    /* renamed from: com.unity3d.services.core.device.e$b */
    /* loaded from: classes3.dex */
    public interface InterfaceC9505b extends IInterface {

        /* renamed from: com.unity3d.services.core.device.e$b$a */
        /* loaded from: classes3.dex */
        public static abstract class AbstractBinderC9506a extends Binder implements InterfaceC9505b {

            /* renamed from: com.unity3d.services.core.device.e$b$a$a */
            /* loaded from: classes3.dex */
            public static class C9507a implements InterfaceC9505b {

                /* renamed from: a */
                private final IBinder f18813a;

                public C9507a(IBinder iBinder) {
                    this.f18813a = iBinder;
                }

                @Override // com.unity3d.services.core.device.C9503e.InterfaceC9505b
                /* renamed from: a */
                public String mo2096a() throws RemoteException {
                    Parcel obtain = Parcel.obtain();
                    Parcel obtain2 = Parcel.obtain();
                    try {
                        obtain.writeInterfaceToken("com.uodis.opendevice.aidl.OpenDeviceIdentifierService");
                        this.f18813a.transact(1, obtain, obtain2, 0);
                        obtain2.readException();
                        return obtain2.readString();
                    } finally {
                        obtain2.recycle();
                        obtain.recycle();
                    }
                }

                @Override // com.unity3d.services.core.device.C9503e.InterfaceC9505b
                /* renamed from: a */
                public boolean mo2095a(boolean z) throws RemoteException {
                    Parcel obtain = Parcel.obtain();
                    Parcel obtain2 = Parcel.obtain();
                    try {
                        obtain.writeInterfaceToken("com.uodis.opendevice.aidl.OpenDeviceIdentifierService");
                        obtain.writeInt(z ? 1 : 0);
                        this.f18813a.transact(2, obtain, obtain2, 0);
                        obtain2.readException();
                        return obtain2.readInt() != 0;
                    } finally {
                        obtain2.recycle();
                        obtain.recycle();
                    }
                }

                @Override // android.os.IInterface
                public IBinder asBinder() {
                    return this.f18813a;
                }
            }

            /* renamed from: a */
            public static InterfaceC9505b m2097a(IBinder iBinder) {
                if (iBinder == null) {
                    return null;
                }
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.uodis.opendevice.aidl.OpenDeviceIdentifierService");
                return (queryLocalInterface == null || !(queryLocalInterface instanceof InterfaceC9505b)) ? new C9507a(iBinder) : (InterfaceC9505b) queryLocalInterface;
            }
        }

        /* renamed from: a */
        String mo2096a() throws RemoteException;

        /* renamed from: a */
        boolean mo2095a(boolean z) throws RemoteException;
    }

    /* renamed from: com.unity3d.services.core.device.e$c */
    /* loaded from: classes3.dex */
    public class ServiceConnectionC9508c implements ServiceConnection {

        /* renamed from: a */
        boolean f18814a;

        /* renamed from: b */
        private final BlockingQueue<IBinder> f18815b;

        private ServiceConnectionC9508c() {
            this.f18814a = false;
            this.f18815b = new LinkedBlockingQueue();
        }

        /* renamed from: a */
        public IBinder m2094a() throws InterruptedException {
            if (this.f18814a) {
                throw new IllegalStateException();
            }
            this.f18814a = true;
            return this.f18815b.take();
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                this.f18815b.put(iBinder);
            } catch (InterruptedException unused) {
                C9549a.m2019b("Couldn't put service to binder que");
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    }

    /* renamed from: a */
    private static C9503e m2102a() {
        if (f18810a == null) {
            f18810a = new C9503e();
        }
        return f18810a;
    }

    /* renamed from: a */
    private void m2101a(Context context) {
        ServiceConnectionC9508c serviceConnectionC9508c = new ServiceConnectionC9508c();
        Intent intent = new Intent("com.uodis.opendevice.OPENIDS_SERVICE");
        intent.setPackage("com.huawei.hwid");
        try {
            if (context.bindService(intent, serviceConnectionC9508c, 1)) {
                try {
                    try {
                        InterfaceC9505b m2097a = InterfaceC9505b.AbstractBinderC9506a.m2097a(serviceConnectionC9508c.m2094a());
                        this.f18811b = m2097a.mo2096a();
                        this.f18812c = m2097a.mo2095a(true);
                    } catch (Exception e) {
                        C9549a.m2023a("Couldn't get openAdvertising info", e);
                    }
                } finally {
                    context.unbindService(serviceConnectionC9508c);
                }
            }
        } catch (Exception e2) {
            C9549a.m2023a("Couldn't bind to identifier service intent", e2);
        }
    }

    /* renamed from: b */
    public static void m2099b(Context context) {
        if (Build.MANUFACTURER.toUpperCase().equals("HUAWEI")) {
            m2102a().m2101a(context);
        }
    }

    /* renamed from: b */
    public static boolean m2100b() {
        return m2102a().f18812c;
    }

    /* renamed from: c */
    public static String m2098c() {
        return m2102a().f18811b;
    }
}
